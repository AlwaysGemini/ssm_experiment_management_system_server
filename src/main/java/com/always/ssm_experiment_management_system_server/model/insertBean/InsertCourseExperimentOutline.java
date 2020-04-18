package com.always.ssm_experiment_management_system_server.model.insertBean;

public class InsertCourseExperimentOutline {
    private String course_experiment_outline_id;
    private String allocation_of_courses_id;
    private String proportion_of_experimental_results;
    private String experiment_item_id;

    public String getAllocation_of_courses_id() {
        return allocation_of_courses_id;
    }

    public void setAllocation_of_courses_id(String allocation_of_courses_id) {
        this.allocation_of_courses_id = allocation_of_courses_id;
    }

    public String getProportion_of_experimental_results() {
        return proportion_of_experimental_results;
    }

    public void setProportion_of_experimental_results(String proportion_of_experimental_results) {
        this.proportion_of_experimental_results = proportion_of_experimental_results;
    }

    public String getExperiment_item_id() {
        return experiment_item_id;
    }

    public void setExperiment_item_id(String experiment_item_id) {
        this.experiment_item_id = experiment_item_id;
    }

    public String getCourse_experiment_outline_id() {
        return course_experiment_outline_id;
    }

    public void setCourse_experiment_outline_id(String course_experiment_outline_id) {
        this.course_experiment_outline_id = course_experiment_outline_id;
    }
}
