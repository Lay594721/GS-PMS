package com.zking.controller;

import com.zking.model.Owner;
import com.zking.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ownerManage")
public class ownerManageController {

    @Autowired
    private OwnerService ownerService;


    @RequestMapping("/queryOwnerList")
    @ResponseBody
    public List<Owner> queryOwnerList(){
        List<Owner> owners = ownerService.queryOwnerList();
        return owners;
    }



}
