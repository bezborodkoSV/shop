package com.example.shop.service;

import com.example.shop.model.ProductGroup;
import com.example.shop.repository.ProductGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductGroupService {
    private final ProductGroupRepository productGroupRepository;

    public ProductGroupService(ProductGroupRepository productGroupRepository){
        this.productGroupRepository=productGroupRepository;
    }

    public boolean createGroup(ProductGroup productGroup){
        if (productGroupRepository.findByGroupTitle(productGroup.getGroupTitle())==null) {
            productGroupRepository.save(productGroup);
            return true;
        }
        return false;
    }

    public boolean deleteGroup(String groupTittle){
        if (productGroupRepository.findByGroupTitle(groupTittle)!=null){
            productGroupRepository.delete(productGroupRepository.findByGroupTitle(groupTittle));
            return true;
        }
        return false;
    }

    public List<ProductGroup> getAllGroup(){
        return productGroupRepository.findAll();
    }
}
