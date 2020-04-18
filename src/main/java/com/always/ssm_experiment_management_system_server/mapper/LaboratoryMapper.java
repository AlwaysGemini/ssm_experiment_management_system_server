package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface LaboratoryMapper {
    @Insert("insert into laboratory(laboratory_id," +
            "laboratory_name," +
            "teaching_experiment_center_id," +
            "laboratory_director," +
            "rules_and_regulations," +
            "remarks," +
            "enable_flag) " +
            "value(#{laboratory_id}," +
            "#{laboratory_name}," +
            "#{teaching_experiment_center_id}," +
            "#{laboratory_director}," +
            "#{laboratory_director}," +
            "#{rules_and_regulations}," +
            "#{remarks}," +
            "#{enable_flag}) ")
    void add(String laboratory_id,
             String laboratory_name,
             String teaching_experiment_center_id,
             String laboratory_director,
             String rules_and_regulations,
             String remarks,
             String enable_flag);

    @Delete("delete from laboratory where laboratory_id = #{laboratory_id}")
    void delete(String laboratory_id);

    @Select("select distinct teaching_experiment_center_name from view_laboratory")
    List<Map<String, Object>> getTeachingExperimentCenterNameQueryConditionList();

    @Select("select distinct laboratory_name from view_laboratory")
    List<Map<String, Object>> getLaboratoryNameQueryConditionList();

    @Select("select distinct enable_flag from view_laboratory")
    List<Map<String, Object>> getEnableFlagQueryConditionList();

    @Select("select * " +
            "from view_laboratory " +
            "where teaching_experiment_center_name like '%${teaching_experiment_center_name}%' " +
            "and laboratory_name like '%${laboratory_name}%' " +
            "and enable_flag like '%${enable_flag}%' ")
    List<LaboratoryTable> list(String teaching_experiment_center_name, String laboratory_name, String enable_flag);
}
