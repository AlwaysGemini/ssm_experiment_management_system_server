package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.CourseExperimentOutlineMapper;
import com.always.ssm_experiment_management_system_server.mapper.LaboratoryCompartmentMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertCourseExperimentOutline;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertLaboratoryCompartment;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryCourseExperimentOutline;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryLaboratoryCompartment;
import com.always.ssm_experiment_management_system_server.model.tableBean.CourseExperimentOutlineTable;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryCompartmentTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("courseExperimentOutline")
public class CourseExperimentOutlineController {
    @Autowired
    CourseExperimentOutlineMapper mapper;

    @PostMapping("add")
    public Response add(InsertCourseExperimentOutline insertCourseExperimentOutline) {
        mapper.add(insertCourseExperimentOutline.getCourse_experiment_outline_id(),
                insertCourseExperimentOutline.getAllocation_of_courses_id(),
                insertCourseExperimentOutline.getProportion_of_experimental_results(),
                insertCourseExperimentOutline.getExperiment_item_id());
        return new Response(200, "插入成功", null);
    }

    @PostMapping("delete")
    public Response delete(String laboratory_compartment_id) {
        mapper.delete(laboratory_compartment_id);
        return new Response(200, "", null);
    }

    @PostMapping("list")
    public Response list(QueryCourseExperimentOutline queryCourseExperimentOutline) {
        List<CourseExperimentOutlineTable> list = mapper.list(queryCourseExperimentOutline.getCourse());
        return new Response(200, "获取成功", list);
    }
}
