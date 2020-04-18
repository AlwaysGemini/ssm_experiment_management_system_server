package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.LaboratoryRoomMapper;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertLaboratoryRoom;
import com.always.ssm_experiment_management_system_server.model.insertBean.InsertTeachingExperimentCenter;
import com.always.ssm_experiment_management_system_server.model.queryBean.QueryLaboratoryRoom;
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
@RequestMapping("laboratoryRoom")
public class LaboratoryRoomController {

    @Autowired
    LaboratoryRoomMapper mapper;

    @PostMapping("add")
    public Response add(InsertLaboratoryRoom insertLaboratoryRoom) {
        mapper.add(insertLaboratoryRoom.getLaboratory_room_id(),
                insertLaboratoryRoom.getLaboratory_room_name(),
                insertLaboratoryRoom.getLaboratory_compartment_id(),
                insertLaboratoryRoom.getNature_of_experimental_site(),
                insertLaboratoryRoom.getCategory_of_scientific_research_base(),
                insertLaboratoryRoom.getPerson_in_charge_of_the_experimental_room(),
                insertLaboratoryRoom.getStatus_of_joint_construction(),
                insertLaboratoryRoom.getCampus(),
                insertLaboratoryRoom.getCapacity(),
                insertLaboratoryRoom.getRemarks(),
                insertLaboratoryRoom.getEnable_flag());
        return new Response(200, "插入成功", null);
    }

    @PostMapping("delete")
    public Response delete(String laboratory_room_id) {
        mapper.delete(laboratory_room_id);
        return new Response(200, "删除成功", null);
    }

    @PostMapping("getQueryConditionList")
    public Response getQueryConditionList() {
        List<List<Map<String, Object>>> lists = new ArrayList<>();
        lists.add(mapper.getTeachingExperimentCenterNameQueryConditionList());
        lists.add(mapper.getLaboratoryNameQueryConditionList());
        lists.add(mapper.getLaboratoryCompartmentNameQueryConditionList());
        lists.add(mapper.getNatureOfExperimentalSiteQueryConditionList());
        lists.add(mapper.getCategoryOfScientificResearchBaseQueryConditionList());
        lists.add(mapper.getStatusOfJointConstructionQueryConditionList());
        lists.add(mapper.getCampusQueryConditionList());
        lists.add(mapper.getEnableFlagQueryConditionList());
        return new Response(200, "获取查询条件成功", lists);
    }

    @PostMapping("list")
    public Response list(QueryLaboratoryRoom queryLaboratoryRoom) {
        List<TeachingExperimentCenterTable> list = mapper.list(queryLaboratoryRoom.getTeaching_experiment_center_name(),
                queryLaboratoryRoom.getLaboratory_name(),
                queryLaboratoryRoom.getLaboratory_compartment_name(),
                queryLaboratoryRoom.getNature_of_experimental_site(),
                queryLaboratoryRoom.getCategory_of_scientific_research_base(),
                queryLaboratoryRoom.getStatus_of_joint_construction(),
                queryLaboratoryRoom.getCampus(),
                queryLaboratoryRoom.getEnable_flag());
        return new Response(200, "获取成功", list);
    }
}
