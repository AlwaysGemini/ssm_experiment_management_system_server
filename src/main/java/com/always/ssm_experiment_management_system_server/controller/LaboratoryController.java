package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.LaboratoryMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertLaboratory;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryLaboratory;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("laboratory")
public class LaboratoryController {

    @Autowired
    LaboratoryMapper mapper;

    @PostMapping("add")
    public Response add(InsertLaboratory insertLaboratory) {
        mapper.add(insertLaboratory.getLaboratory_id(),
                insertLaboratory.getLaboratory_name(),
                insertLaboratory.getTeaching_experiment_center_id(),
                insertLaboratory.getLaboratory_director(),
                insertLaboratory.getRules_and_regulations(),
                insertLaboratory.getRemarks(),
                insertLaboratory.getEnable_flag());
        return new Response(200, "插入成功", null);
    }

    @PostMapping("delete")
    public Response delete(String laboratory_id) {
        mapper.delete(laboratory_id);
        return new Response(200, "", null);
    }

    @PostMapping("getQueryConditionList")
    public Response getQueryConditionList() {
        List<List<Map<String, Object>>> lists = new ArrayList<>();
        lists.add(mapper.getTeachingExperimentCenterNameQueryConditionList());
        lists.add(mapper.getLaboratoryNameQueryConditionList());
        lists.add(mapper.getEnableFlagQueryConditionList());
        return new Response(200, "获取查询条件成功", lists);
    }

    @PostMapping("list")
    public Response list(QueryLaboratory queryLaboratory) {
        List<LaboratoryTable> list = mapper.list(queryLaboratory.getTeaching_experiment_center(),
                queryLaboratory.getLaboratory_name(),
                queryLaboratory.getEnable_flag());
        return new Response(200, "获取成功", list);
    }
}
