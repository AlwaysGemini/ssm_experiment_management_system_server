package com.always.ssm_experiment_management_system_server.model.tableBean;

public class ExperimentalConsumablesManagementTable {
    private String experimental_consumables_id;
    private String experimental_consumables_name;
    private String current_inventory;
    private String maximum_inventory;
    private String minimum_inventory;
    private String model_and_specification;
    private String unit;
    private String unit_price;
    private String teaching_experiment_center_name;
    private String laboratory_name;
    private String laboratory_compartment_name;
    private String laboratory_room_name;

    public String getExperimental_consumables_id() {
        return experimental_consumables_id;
    }

    public void setExperimental_consumables_id(String experimental_consumables_id) {
        this.experimental_consumables_id = experimental_consumables_id;
    }

    public String getExperimental_consumables_name() {
        return experimental_consumables_name;
    }

    public void setExperimental_consumables_name(String experimental_consumables_name) {
        this.experimental_consumables_name = experimental_consumables_name;
    }

    public String getCurrent_inventory() {
        return current_inventory;
    }

    public void setCurrent_inventory(String current_inventory) {
        this.current_inventory = current_inventory;
    }

    public String getMaximum_inventory() {
        return maximum_inventory;
    }

    public void setMaximum_inventory(String maximum_inventory) {
        this.maximum_inventory = maximum_inventory;
    }

    public String getMinimum_inventory() {
        return minimum_inventory;
    }

    public void setMinimum_inventory(String minimum_inventory) {
        this.minimum_inventory = minimum_inventory;
    }

    public String getModel_and_specification() {
        return model_and_specification;
    }

    public void setModel_and_specification(String model_and_specification) {
        this.model_and_specification = model_and_specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getTeaching_experiment_center_name() {
        return teaching_experiment_center_name;
    }

    public void setTeaching_experiment_center_name(String teaching_experiment_center_name) {
        this.teaching_experiment_center_name = teaching_experiment_center_name;
    }

    public String getLaboratory_name() {
        return laboratory_name;
    }

    public void setLaboratory_name(String laboratory_name) {
        this.laboratory_name = laboratory_name;
    }

    public String getLaboratory_compartment_name() {
        return laboratory_compartment_name;
    }

    public void setLaboratory_compartment_name(String laboratory_compartment_name) {
        this.laboratory_compartment_name = laboratory_compartment_name;
    }

    public String getLaboratory_room_name() {
        return laboratory_room_name;
    }

    public void setLaboratory_room_name(String laboratory_room_name) {
        this.laboratory_room_name = laboratory_room_name;
    }
}
