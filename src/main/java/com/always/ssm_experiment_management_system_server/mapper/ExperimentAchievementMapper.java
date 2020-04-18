package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.ExperimentAchievementEntryTable;
import com.always.ssm_experiment_management_system_server.model.tableTemplateBean.ExperimentAchievementTableTemplate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ExperimentAchievementMapper {

    @Select("select distinct experimental_teaching_class.year," +
            "experimental_teaching_class.semester," +
            "experiment_course_match.experiment_achievement_table_state," +
            "course.college," +
            "course.course_id," +
            "course.course_chinese_name," +
            "experimental_teaching_class.experimental_teaching_class_name," +
            "experiment_course_match.experiment_course_match_id " +
            "from experiment_course_match," +
            "course_experiment_outline," +
            "experimental_teaching_class," +
            "allocation_of_courses," +
            "course " +
            "where course_experiment_outline.course_experiment_outline_id = experimental_teaching_class.course_experiment_outline_id " +
            "and course_experiment_outline.allocation_of_courses_id = allocation_of_courses.allocation_of_courses_id " +
            "and allocation_of_courses.course_id = course.course_id " +
            "and experiment_course_match.experimental_teaching_class_id = experimental_teaching_class.experimental_teaching_class_id " +
            "and teacher_id = #{user_id}")
    List<ExperimentAchievementEntryTable> getExperimentAchievementTableSummary(String user_id);


    @Select("select * from template_experiment_item_achievement where experiment_course_match_id = #{experiment_course_match_id}")
    List<ExperimentAchievementTableTemplate> getTemplate(String experiment_course_match_id);

    @Update("update experiment_course_match " +
            "set experiment_achievement_table_url = #{experiment_achievement_table_url} " +
            "and experiment_achievement_table_state = '待审核' " +
            "and experiment_course_match_id = #{experiment_course_match_id} ")
    void upload(String fileName,String experiment_course_match_id);

    @Update("update experiment_course_match " +
            "set experiment_achievement_table_state = #{experiment_achievement_table_state} " +
            "where experiment_course_match_id = #{experiment_course_match_id} ")
    void examining(int experiment_course_match_id, String experiment_achievement_table_state);
}
