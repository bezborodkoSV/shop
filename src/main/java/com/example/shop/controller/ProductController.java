package com.example.shop.controller;

import com.example.shop.model.Product;
import com.example.shop.service.ProductGroupService;
import com.example.shop.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;
    private final ProductGroupService productGroupService;

    public ProductController(ProductService productService,ProductGroupService productGroupService) {
        this.productService = productService;
        this.productGroupService=productGroupService;
    }


    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("allGroups",productGroupService.getAllGroup());
        model.addAttribute("listProducts",productService.getListProduct());
        return "home";
    }

    @GetMapping("/addProduct")
    public String newProduct(Model model) {
        model.addAttribute("newProduct", new Product());
        model.addAttribute("allGroups", productGroupService.getAllGroup());
        return "seller/addProduct";
    }

//    must rewrite, id can't be show
    @GetMapping("/productPage")
    public String productPage(@RequestParam("productTittle" ) String productTittle,@RequestParam("idProduct") long idProduct, Model model){
        System.out.println("Product tittle: "+productTittle);
        System.out.println("Product id: "+idProduct);
        model.addAttribute("product",productService.getProductById(idProduct));
        return "productPage";
    }




    @PostMapping("/addProduct")
    public String newProduct(@ModelAttribute("newProduct") Product product) {
        productService.createProduct(product);
        return "home";
    }


}
