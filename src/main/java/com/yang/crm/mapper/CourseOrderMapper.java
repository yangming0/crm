package com.yang.crm.mapper;

import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.MonthIncome;
import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {

    public int findCountByMap(Map<String,Object> map);

    public List<CourseOrder> findListByMap(Map<String,Object> map);


}
