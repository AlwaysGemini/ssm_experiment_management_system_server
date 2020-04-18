package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.ExperimentalConsumablesManagementTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface ExperimentConsumablesMapper {
    @Insert("insert into experimental_consumables(experimental_consumables_id," +
            "experimental_consumables_name," +
            "current_inventory," +
            "maximum_inventory," +
            "minimum_inventory," +
            "model_specification," +
            "unit," +
            "unit_price," +
            "laboratory_room_id) " +
            "value(#{experimental_consumables_id}," +
            "#{experimental_consumables_name}," +
            "#{current_inventory}," +
            "#{maximum_inventory}," +
            "#{minimum_inventory}," +
            "#{model_specification}," +
            "#{unit}," +
            "{unit_price}," +
            "{laboratory_room_id}) ")
    void add(String experimental_consumables_id,
             String experimental_consumables_name,
             String current_inventory,
             String maximum_inventory,
             String minimum_inventory,
             String model_specification,
             String unit,
             String unit_price,
             String laboratory_room_id);

    @Select("select distinct teaching_experiment_center_name from view_experimental_consumables")
    List<Map<String, Object>> getTeachingExperimentCenterNameQueryConditionList();

    @Select("select distinct laboratory_name from view_experimental_consumables")
    List<Map<String, Object>> getLaboratoryNameQueryConditionList();

    @Select("select distinct laboratory_compartment_name from view_experimental_consumables")
    List<Map<String,Object>> getLaboratoryCompartmentNameQueryConditionList();

    @Select("select distinct laboratory_room_name from view_experimental_consumables")
    List<Map<String,Object>> getLaboratoryRoomNameQueryConditionList();

    @Select("select * " +
            "from view_experimental_consumables " +
            "where teaching_experiment_center_name = #{teaching_experiment_center_name} " +
            "and laboratory_name = #{laboratory_name} " +
            "and laboratory_compartment_name = #{laboratory_compartment_name} " +
            "and laboratory_room_name = #{laboratory_room_name} " +
            "and model_specification like '%${model_specification}%' " +
            "and experimental_consumables_name like '%${experimental_consumables_name}%' ")
    List<ExperimentalConsumablesManagementTable> list(String teaching_experiment_center_name,
                                                      String laboratory_name,
                                                      String laboratory_compartment_name,
                                                      String laboratory_room_name,
                                                      String model_specification,
                                                      String experimental_consumables_name);
}
