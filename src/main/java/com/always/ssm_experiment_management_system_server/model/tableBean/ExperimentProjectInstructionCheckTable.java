package com.always.ssm_experiment_management_system_server.model.tableBean;

public class ExperimentProjectInstructionCheckTable {
    private String experiment_project_instruction_id;
    private String state;
    private String year;
    private String semester;
    private String college;
    private String course_id;
    private String course_chinese_name;
    private String teacher_name;
    private String experiment_item_name;

    private String file_name;

    public String getExperiment_project_instruction_id() {
        return experiment_project_instruction_id;
    }

    public void setExperiment_project_instruction_id(String experiment_project_instruction_id) {
        this.experiment_project_instruction_id = experiment_project_instruction_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_chinese_name() {
        return course_chinese_name;
    }

    public void setCourse_chinese_name(String course_chinese_name) {
        this.course_chinese_name = course_chinese_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getExperiment_item_name() {
        return experiment_item_name;
    }

    public void setExperiment_item_name(String experiment_item_name) {
        this.experiment_item_name = experiment_item_name;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
