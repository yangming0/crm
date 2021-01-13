package com.yang.crm.service.impl;

import com.yang.crm.mapper.CourseOrderMapper;
import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.PageResult;
import com.yang.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseOrderServiceImpl implements ICourseOrderService {

    @Autowired
    CourseOrderMapper orderMapper;



    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {
        PageResult<CourseOrder> result = new PageResult<CourseOrder>();
        result.setCode(0);

        /*
        * 查询参数先设置为空*/

        Map<String,Object> params = new HashMap<String,Object>();

        //获取总记录数据
        int totalCount = orderMapper.findCountByMap(params);
        result.setCount(totalCount);

        //获取查询的数据
        List<CourseOrder> list =orderMapper.findListByMap(params);
        result.setData(list);


        return result;
    }
}
