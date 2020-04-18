package com.always.ssm_experiment_management_system_server.model.insertBean;

public class InsertTeachingExperimentCenter {
    private String teaching_experiment_center_id;
    private String teaching_experiment_center_name;
    private String laboratory_type;
    private String subordinate_unit;
    private String subordinate_discipline;
    private String year_of_establishment;
    private String remarks;
    private String enable_flag;

    public String getTeaching_experiment_center_id() {
        return teaching_experiment_center_id;
    }

    public void setTeaching_experiment_center_id(String teaching_experiment_center_id) {
        this.teaching_experiment_center_id = teaching_experiment_center_id;
    }

    public String getTeaching_experiment_center_name() {
        return teaching_experiment_center_name;
    }

    public void setTeaching_experiment_center_name(String teaching_experiment_center_name) {
        this.teaching_experiment_center_name = teaching_experiment_center_name;
    }

    public String getLaboratory_type() {
        return laboratory_type;
    }

    public void setLaboratory_type(String laboratory_type) {
        this.laboratory_type = laboratory_type;
    }

    public String getSubordinate_unit() {
        return subordinate_unit;
    }

    public void setSubordinate_unit(String subordinate_unit) {
        this.subordinate_unit = subordinate_unit;
    }

    public String getSubordinate_discipline() {
        return subordinate_discipline;
    }

    public void setSubordinate_discipline(String subordinate_discipline) {
        this.subordinate_discipline = subordinate_discipline;
    }

    public String getYear_of_establishment() {
        return year_of_establishment;
    }

    public void setYear_of_establishment(String year_of_establishment) {
        this.year_of_establishment = year_of_establishment;
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
