package com.always.ssm_experiment_management_system_server.model.tableBean;

public class LaboratoryCompartmentTable {
    private String laboratory_compartment_id;
    private String laboratory_compartment_name;
    private String teaching_experiment_center_name;
    private String laboratory_name;
    private String remarks;
    private String enable_flag;

    public String getLaboratory_compartment_id() {
        return laboratory_compartment_id;
    }

    public void setLaboratory_compartment_id(String laboratory_compartment_id) {
        this.laboratory_compartment_id = laboratory_compartment_id;
    }

    public String getLaboratory_compartment_name() {
        return laboratory_compartment_name;
    }

    public void setLaboratory_compartment_name(String laboratory_compartment_name) {
        this.laboratory_compartment_name = laboratory_compartment_name;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEnable_flag() {
        return enable_flag;
    }

    public void setEnable_flag(String enable_flag) {
        this.enable_flag = enable_flag;
    }
}
