package com.yang.crm.mapper;

import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.MonthIncome;
import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {

    public int findCountByMap(Map<String,Object> map);

    public List<CourseOrder> findListByMap(Map<String,Object> map);

    public void insert(CourseOrder order);


    public CourseOrder findByOrderId(String order_id);

    public void deleteByOrderId(String order_id);

    public void update(CourseOrder order);

    public List<MonthIncome> getMonthIncomes();
}
