package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryCompartmentTable;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface LaboratoryCompartmentMapper {
    @Insert("insert into laboratory_compartment(laboratory_compartment_id," +
            "laboratory_compartment_name," +
            "laboratory_id," +
            "remarks," +
            "enable_flag) " +
            "value(#{laboratory_compartment_id}," +
            "#{laboratory_compartment_name}," +
            "#{laboratory_id}," +
            "#{remarks}," +
            "#{enable_flag})")
    void add(String laboratory_compartment_id,
             String laboratory_compartment_name,
             String laboratory_id,
             String remarks,
             String enable_flag);

    @Delete("delete from laboratory_compartment where laboratory_compartment_id = #{laboratory_compartment_id}")
    void delete(String laboratory_compartment_id);

    @Select("select distinct teaching_experiment_center_name from view_laboratory_compartment")
    List<Map<String, Object>> getTeachingExperimentCenterNameQueryConditionList();

    @Select("select distinct laboratory_name from view_laboratory_compartment")
    List<Map<String, Object>> getLaboratoryNameQueryConditionList();

    @Select("select distinct enable_flag from view_laboratory_compartment")
    List<Map<String, Object>> getEnableFlagQueryConditionList();

    @Select("select * " +
            "from view_laboratory_compartment " +
            "where teaching_experiment_center_name like '%${teaching_experiment_center_name}%' " +
            "and laboratory_name like '%${laboratory_name}%' " +
            "and enable_flag like '%${enable_flag}%' ")
    List<LaboratoryCompartmentTable> list(String teaching_experiment_center_name, String laboratory_name, String enable_flag);
}
