package com.always.ssm_experiment_management_system_server.model.queryBean;

public class QueryLaboratory {
    private String teaching_experiment_center;
    private String laboratory_name;
    private String enable_flag;

    public String getTeaching_experiment_center() {
        return teaching_experiment_center;
    }

    public void setTeaching_experiment_center(String teaching_experiment_center) {
        this.teaching_experiment_center = teaching_experiment_center;
    }

    public String getLaboratory_name() {
        return laboratory_name;
    }

    public void setLaboratory_name(String laboratory_name) {
        this.laboratory_name = laboratory_name;
    }

    public String getEnable_flag() {
        return enable_flag;
    }

    public void setEnable_flag(String enable_flag) {
        this.enable_flag = enable_flag;
    }
}
