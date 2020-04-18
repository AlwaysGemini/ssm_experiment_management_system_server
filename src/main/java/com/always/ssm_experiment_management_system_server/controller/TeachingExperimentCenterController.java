package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.TeachingExperimentCenterMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertTeachingExperimentCenter;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryTeachingExperimentCenter;
import com.always.ssm_experiment_management_system_server.model.tableBean.TeachingExperimentCenterTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/teachingExperimentCenter"})
public class TeachingExperimentCenterController {

    @Autowired
    private TeachingExperimentCenterMapper mapper;

    @PostMapping("add")
    public Response add(InsertTeachingExperimentCenter insertTeachingExperimentCenter) {
        mapper.add(insertTeachingExperimentCenter.getTeaching_experiment_center_id(),
                insertTeachingExperimentCenter.getTeaching_experiment_center_name(),
                insertTeachingExperimentCenter.getLaboratory_type(),
                insertTeachingExperimentCenter.getSubordinate_unit(),
                insertTeachingExperimentCenter.getSubordinate_discipline(),
                insertTeachingExperimentCenter.getYear_of_establishment(),
                insertTeachingExperimentCenter.getRemarks(),
                insertTeachingExperimentCenter.getEnable_flag());
        return new Response(200, "插入成功", null);
    }

    @PostMapping("delete")
    public Response delete(String teaching_experiment_center_id) {
        mapper.delete(teaching_experiment_center_id);
        return new Response(200, "删除成功", null);
    }

    @PostMapping("getQueryConditionList")
    public Response getQueryConditionList() {
        List<List<Map<String, Object>>> lists = new ArrayList<>();
        lists.add(mapper.getLaboratoryTypeQueryConditionList());
        lists.add(mapper.getEnableFlagQueryConditionList());
        return new Response(200, "获取查询条件成功", lists);
    }

    @PostMapping("list")
    public Response list(QueryTeachingExperimentCenter queryTeachingExperimentCenter) {
        List<TeachingExperimentCenterTable> list = mapper.list(queryTeachingExperimentCenter.getLaboratory_type(),
                queryTeachingExperimentCenter.getEnable_flag());
        return new Response(200, "获取成功", list);
    }
}
