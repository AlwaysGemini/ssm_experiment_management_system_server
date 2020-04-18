package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.LaboratoryCompartmentMapper;
import com.always.ssm_experiment_management_system_server.mapper.LaboratoryMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertLaboratory;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertLaboratoryCompartment;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryLaboratory;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryLaboratoryCompartment;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryCompartmentTable;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("laboratoryCompartment")
public class LaboratoryCompartmentController {
    @Autowired
    LaboratoryCompartmentMapper mapper;

    @PostMapping("add")
    public Response add(InsertLaboratoryCompartment insertLaboratoryCompartment) {
        mapper.add(insertLaboratoryCompartment.getLaboratory_compartment_id(),
                insertLaboratoryCompartment.getLaboratory_compartment_name(),
                insertLaboratoryCompartment.getLaboratory_compartment_id(),
                insertLaboratoryCompartment.getRemarks(),
                insertLaboratoryCompartment.getEnable_flag());
        return new Response(200, "插入成功", null);
    }

    @PostMapping("delete")
    public Response delete(String laboratory_compartment_id) {
        mapper.delete(laboratory_compartment_id);
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
    public Response list(QueryLaboratoryCompartment queryLaboratoryCompartment) {
        List<LaboratoryCompartmentTable> list = mapper.list(queryLaboratoryCompartment.getTeaching_experiment_center_name(),
                queryLaboratoryCompartment.getLaboratory_name(),
                queryLaboratoryCompartment.getEnable_flag());
        return new Response(200, "获取成功", list);
    }
}
