package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.TeachingExperimentCenterTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface LaboratoryRoomMapper {
    @Insert("insert into laboratory_room(laboratory_room_id," +
            "laboratory_room_name," +
            "laboratory_compartment_id," +
            "nature_of_experimental_site," +
            "category_of_scientific_research_base," +
            "person_in_charge_of_the_experimental_room," +
            "status_of_joint_construction," +
            "campus," +
            "capacity," +
            "remarks," +
            "enable_flag) " +
            "value(#{laboratory_room_id}," +
            "#{laboratory_room_name}," +
            "#{laboratory_compartment_id}," +
            "#{nature_of_experimental_site}," +
            "#{category_of_scientific_research_base}," +
            "#{person_in_charge_of_the_experimental_room}," +
            "#{status_of_joint_construction}," +
            "#{campus}," +
            "#{capacity}," +
            "#{remarks}," +
            "#{enable_flag}) ")
    void add(String laboratory_room_id,
             String laboratory_room_name,
             String laboratory_compartment_id,
             String nature_of_experimental_site,
             String category_of_scientific_research_base,
             String person_in_charge_of_the_experimental_room,
             String status_of_joint_construction,
             String campus,
             String capacity,
             String remarks,
             String enable_flag);

    @Delete("delete from laboratory_room where laboratory_room_id = #{laboratory_room_id}")
    void delete(String laboratory_room_id);

    @Select("select distinct teaching_experiment_center_name from view_laboratory_room")
    List<Map<String, Object>> getTeachingExperimentCenterNameQueryConditionList();

    @Select("select distinct laboratory_name from view_laboratory_room")
    List<Map<String, Object>> getLaboratoryNameQueryConditionList();

    @Select("select distinct laboratory_compartment_name from view_laboratory_room")
    List<Map<String,Object>> getLaboratoryCompartmentNameQueryConditionList();

    @Select("select distinct nature_of_experimental_site from view_laboratory_room")
    List<Map<String,Object>> getNatureOfExperimentalSiteQueryConditionList();

    @Select("select distinct category_of_scientific_research_base from view_laboratory_room")
    List<Map<String,Object>> getCategoryOfScientificResearchBaseQueryConditionList();

    @Select("select distinct status_of_joint_construction from view_laboratory_room")
    List<Map<String,Object>> getStatusOfJointConstructionQueryConditionList();

    @Select("select distinct campus from view_laboratory_room")
    List<Map<String,Object>> getCampusQueryConditionList();

    @Select("select distinct enable_flag from view_laboratory_room")
    List<Map<String, Object>> getEnableFlagQueryConditionList();

    @Select("select * " +
            "from view_laboratory_room " +
            "where teaching_experiment_center_name like '%${teaching_experiment_center_name}%' " +
            "where laboratory_name like '%${laboratory_name}%' " +
            "where laboratory_compartment_name like '%${laboratory_compartment_name}%' " +
            "where nature_of_experimental_site like '%${nature_of_experimental_site}%' " +
            "where category_of_scientific_research_base like '%${category_of_scientific_research_base}%' " +
            "where status_of_joint_construction like '%${status_of_joint_construction}%' " +
            "where campus like '%${campus}%' " +
            "and enable_flag like '%${enable_flag}%' ")
    List<TeachingExperimentCenterTable> list(String teaching_experiment_center_name,
                                             String laboratory_name,
                                             String laboratory_compartment_name,
                                             String nature_of_experimental_site,
                                             String category_of_scientific_research_base,
                                             String status_of_joint_construction,
                                             String campus,
                                             String enable_flag);
}
