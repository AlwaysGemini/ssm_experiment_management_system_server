package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.ExperimentConsumablesMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertExperimentalConsumablesManagement;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryExperimentalConsumablesManagement;
import com.always.ssm_experiment_management_system_server.model.tableBean.ExperimentalConsumablesManagementTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("experimentConsumables")
public class ExperimentConsumablesController {
    @Autowired
    ExperimentConsumablesMapper mapper;

    @PostMapping("add")
    public Response add(InsertExperimentalConsumablesManagement insertExperimentalConsumablesManagement){
        mapper.add(insertExperimentalConsumablesManagement.getExperimental_consumables_id(),
                insertExperimentalConsumablesManagement.getExperimental_consumables_name(),
                insertExperimentalConsumablesManagement.getCurrent_inventory(),
                insertExperimentalConsumablesManagement.getMaximum_inventory(),
                insertExperimentalConsumablesManagement.getMinimum_inventory(),
                insertExperimentalConsumablesManagement.getModel_and_specification(),
                insertExperimentalConsumablesManagement.getUnit(),
                insertExperimentalConsumablesManagement.getUnit_price(),
                insertExperimentalConsumablesManagement.getLaboratory_room_id());
        return new Response(200,"添加成功",null);
    }

    @PostMapping("getQueryConditionList")
    public Response getQueryConditionList(){
        List<List<Map<String, Object>>> lists = new ArrayList<>();
        lists.add(mapper.getTeachingExperimentCenterNameQueryConditionList());
        lists.add(mapper.getLaboratoryNameQueryConditionList());
        lists.add(mapper.getLaboratoryCompartmentNameQueryConditionList());
        lists.add(mapper.getLaboratoryRoomNameQueryConditionList());
        return new Response(200,"获取查询条件成功",lists);
    }

    @PostMapping("list")
    public Response list(QueryExperimentalConsumablesManagement queryExperimentalConsumablesManagement){
        List<ExperimentalConsumablesManagementTable> list = mapper.list(queryExperimentalConsumablesManagement.getTeaching_experiment_center_name(),
                queryExperimentalConsumablesManagement.getLaboratory_name(),
                queryExperimentalConsumablesManagement.getExperimental_compartment_name(),
                queryExperimentalConsumablesManagement.getLaboratory_room_name(),
                queryExperimentalConsumablesManagement.getModel_and_specification(),
                queryExperimentalConsumablesManagement.getExperimental_consumables_name());
        return new Response(200,"查询成功",list);
    }
}
