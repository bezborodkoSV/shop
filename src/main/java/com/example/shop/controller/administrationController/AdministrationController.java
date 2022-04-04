package com.example.shop.controller.administrationController;

import com.example.shop.service.ProductGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministrationController {
    private final ProductGroupService productGroupService;

    public AdministrationController(ProductGroupService productGroupService){
        this.productGroupService = productGroupService;
    }

    @GetMapping("/administration")
    public String adminPage(Model model){
        model.addAttribute("");
        return "administration/administrationPage";
    }

//    @PostMapping("/addGroup")
//    public String newGroup(ProductGroup productGroup){
//        productGroupService.createGroup(productGroup);
//        return "home";
//    }
//
//    @PostMapping("/deleteGroup")
//    public String deleteGroup(@RequestParam("groupTittle") String groupTittle, Model model){
//        if (productGroupService.deleteGroup(groupTittle)==true){
//            productGroupService.deleteGroup(groupTittle);
//            return "administrationPage";
//        }
//        model.addAttribute("groupError", "This group already exists");
//        return "administrationPage";
//    }
}
