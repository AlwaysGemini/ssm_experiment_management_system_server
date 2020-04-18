package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.TeachingExperimentCenterTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeachingExperimentCenterMapper {
    @Insert("insert into teaching_experiment_center(teaching_experiment_center," +
            "teaching_experiment_center_name," +
            "laboratory_type," +
            "subordinate_unit," +
            "subordinate_discipline," +
            "year_of_establishment," +
            "remarks," +
            "enable_flag) " +
            "value(#{teaching_experiment_center_id}," +
            "#{teaching_experiment_center_name}," +
            "#{laboratory_type}," +
            "#{subordinate_unit}," +
            "#{subordinate_discipline}," +
            "#{year_of_establishment}," +
            "#{remarks}," +
            "#{enable_flag}) ")
    void add(String teaching_experiment_center_id,
             String teaching_experiment_center_name,
             String laboratory_type,
             String subordinate_unit,
             String subordinate_discipline,
             String year_of_establishment,
             String remarks,
             String enable_flag);

    @Delete("delete from teaching_experiment_center where teaching_experiment_center_id = #{teaching_experiment_center_id}")
    void delete(String teaching_experiment_center_id);

    @Select("select distinct laboratory_type from view_teaching_experiment_center")
    List<Map<String, Object>> getLaboratoryTypeQueryConditionList();

    @Select("select distinct enable_flag from view_teaching_experiment_center")
    List<Map<String, Object>> getEnableFlagQueryConditionList();

    @Select("select * " +
            "from view_teaching_experiment_center " +
            "where laboratory_type like '%${laboratory_type}%' " +
            "and enable_flag like '%${enable_flag}%' ")
    List<TeachingExperimentCenterTable> list(String laboratory_type, String enable_flag);
}
