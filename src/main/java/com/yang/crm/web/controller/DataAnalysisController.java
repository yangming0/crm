package com.yang.crm.web.controller;

import com.yang.crm.model.MonthIncome;
import com.yang.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("dataanalysis")
public class DataAnalysisController {

    @Autowired
    ICourseOrderService orderService;

    @RequestMapping("income")
    public String income(){
        return "dataanalysis/income";
    }

    @RequestMapping("monthIncomes")
    @ResponseBody
    public List<MonthIncome> monthIncome(){
        List<MonthIncome> list = orderService.getMonthIncomes();
        return list;
    }
}
