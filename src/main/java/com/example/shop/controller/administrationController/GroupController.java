package com.example.shop.controller.administrationController;

import com.example.shop.model.ProductGroup;
import com.example.shop.service.ProductGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/administration")
public class GroupController {
    private  final ProductGroupService productGroupService;

    public GroupController(ProductGroupService productGroupService){
        this.productGroupService=productGroupService;
    }

    @GetMapping("/groupsManagement")
    public String controlGroup(Model model){
        model.addAttribute("allGroups", productGroupService.getAllGroup());
        return "administration/groupsManagement";
    }

    @GetMapping("/addGroup")
    public String newGroup(Model model){
        model.addAttribute("newGroup",new ProductGroup());
        return "administration/addGroup";
    }

    @PostMapping("/addGroup")
    public String newGroup(@ModelAttribute("newProduct") ProductGroup productGroup){
        productGroupService.createGroup(productGroup);
        return "redirect:/administration/groupsManagement";
    }

    @PostMapping("/deleteGroup")
    public String deleteGroup(@RequestParam("groupTittle") String groupTittle, Model model){
        try {
            if (productGroupService.deleteGroup(groupTittle) == true) {
                productGroupService.deleteGroup(groupTittle);
                return "redirect:/administration/groupsManagement";
            }
            model.addAttribute("groupError", "This group already exists");
            return "administration/groupsManagement";
        }catch (Exception e){
            System.out.println(e);
        }
        return "administration/groupsManagement";
    }
}
