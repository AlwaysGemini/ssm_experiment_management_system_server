package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.CourseExperimentOutlineMapper;
import com.always.ssm_experiment_management_system_server.mapper.CourseExperimentProjectMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertCourseExperimentOutline;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryCourseExperimentOutline;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryCourseExperimentProject;
import com.always.ssm_experiment_management_system_server.model.tableBean.CourseExperimentOutlineTable;
import com.always.ssm_experiment_management_system_server.model.tableBean.CourseExperimentProjectTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("courseExperimentProject")
public class CourseExperimentProjectController {
    @Autowired
    CourseExperimentProjectMapper mapper;

    @PostMapping("getQueryConditionList")
    public Response getQueryConditionList() {
        List<List<Map<String, Object>>> lists = new ArrayList<>();
        lists.add(mapper.getCollegeQueryConditionList());
        lists.add(mapper.getCourseCategoryQueryConditionList());
        lists.add(mapper.getCourseAssignmentQueryConditionList());
        lists.add(mapper.getEnablingGradeQueryConditionList());
        return new Response(200, "获取查询条件成功", lists);
    }

    @PostMapping("list")
    public Response list(QueryCourseExperimentProject queryCourseExperimentProject) {
        List<CourseExperimentProjectTable> list = mapper.list(queryCourseExperimentProject.getCollege(),
                queryCourseExperimentProject.getCourse_category(),
                queryCourseExperimentProject.getCourse_assignment(),
                queryCourseExperimentProject.getEnabling_grade(),
                queryCourseExperimentProject.getCourse());
        return new Response(200, "获取成功", list);
    }
}
