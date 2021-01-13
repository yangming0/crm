package com.yang.crm.web.controller;

import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.PageResult;
import com.yang.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {

    @Autowired
    ICourseOrderService orderService;




    @RequestMapping("/list")
    public String list(){
        return "/courseorder/list";
    }

    @RequestMapping("/listjson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(){

        PageResult<CourseOrder> result = orderService.findPageResult(null,1,8);

        return result;

    }
}
