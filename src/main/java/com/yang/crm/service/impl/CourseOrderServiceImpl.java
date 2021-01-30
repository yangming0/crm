package com.yang.crm.service.impl;

import com.yang.crm.mapper.CourseOrderMapper;
import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.MonthIncome;
import com.yang.crm.model.PageResult;
import com.yang.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        params.put("condition",condition);//模糊查询
        //select * from t_course_order limit 0,10
        params.put("start",(page-1)*pageSize);
        params.put("pageSize",pageSize);

        //获取总记录数据
        int totalCount = orderMapper.findCountByMap(params);
        result.setCount(totalCount);

        //获取查询的数据
        List<CourseOrder> list =orderMapper.findListByMap(params);
        result.setData(list);


        return result;
    }

    @Override
    public void save(CourseOrder order) {
        orderMapper.insert(order);
    }

    @Override
    public CourseOrder findByOrderId(String order_id) {
        return orderMapper.findByOrderId(order_id);
    }

    @Override
    public void deleteByOrderId(String order_id) {
        orderMapper.deleteByOrderId(order_id);
    }

    @Override
    public void update(CourseOrder order) {
        orderMapper.update(order);
    }

    @Override
    public List<MonthIncome> getMonthIncomes() {
        return orderMapper.getMonthIncomes();
    }

}
