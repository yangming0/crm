package com.yang.crm.service;

import com.yang.crm.model.CourseOrder;
import com.yang.crm.model.PageResult;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);
}
