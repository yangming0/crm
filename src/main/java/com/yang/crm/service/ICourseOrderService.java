package com.yang.crm.service;

import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.MonthIncome;
import com.yang.crm.model.PageResult;

import java.util.List;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    public void save(CourseOrder order);

    public CourseOrder findByOrderId(String order_id);

    public void  deleteByOrderId(String order_id);

    public void update(CourseOrder order);

    public List<MonthIncome> getMonthIncomes();
}
