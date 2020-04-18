package com.always.ssm_experiment_management_system_server.model.insertBean;

public class InsertExperimentTeachingAssignment {
    private String experimental_teaching_class_id;
    private String teacher_id;
    private String experiment_item_id;

    public String getExperimental_teaching_class_id() {
        return experimental_teaching_class_id;
    }

    public void setExperimental_teaching_class_id(String experimental_teaching_class_id) {
        this.experimental_teaching_class_id = experimental_teaching_class_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getExperiment_item_id() {
        return experiment_item_id;
    }

    public void setExperiment_item_id(String experiment_item_id) {
        this.experiment_item_id = experiment_item_id;
    }
}
