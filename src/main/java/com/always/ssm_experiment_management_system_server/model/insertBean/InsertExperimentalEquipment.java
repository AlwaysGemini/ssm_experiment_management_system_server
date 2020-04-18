package com.always.ssm_experiment_management_system_server.model.insertBean;

public class InsertExperimentalEquipment {
    private String id;
    private String experimental_equipment_name;
    private String value;
    private String laboratory_room_name;
    private String is_movable;
    private String procurement_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExperimental_equipment_name() {
        return experimental_equipment_name;
    }

    public void setExperimental_equipment_name(String experimental_equipment_name) {
        this.experimental_equipment_name = experimental_equipment_name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLaboratory_room_name() {
        return laboratory_room_name;
    }

    public void setLaboratory_room_name(String laboratory_room_name) {
        this.laboratory_room_name = laboratory_room_name;
    }

    public String getIs_movable() {
        return is_movable;
    }

    public void setIs_movable(String is_movable) {
        this.is_movable = is_movable;
    }

    public String getProcurement_time() {
        return procurement_time;
    }

    public void setProcurement_time(String procurement_time) {
        this.procurement_time = procurement_time;
    }
}
