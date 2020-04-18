package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.CourseExperimentProjectTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseExperimentProjectMapper {

    @Select("select distinct college from view_course")
    List<Map<String, Object>> getCollegeQueryConditionList();

    @Select("select distinct course_category from view_course")
    List<Map<String, Object>> getCourseCategoryQueryConditionList();

    @Select("select distinct course_assignment from view_course")
    List<Map<String,Object>> getCourseAssignmentQueryConditionList();

    @Select("select distinct enabling_grade from view_course")
    List<Map<String,Object>> getEnablingGradeQueryConditionList();

    @Select("select * " +
            "from view_course " +
            "where college = #{college} " +
            "and course_category = #{course_category} " +
            "and course_assignment = #{course_assignment} " +
            "and enabling_grade = #{enabling_grade} " +
            "and course_chinese_name like '%${course}%' ")
    List<CourseExperimentProjectTable> list(String college,
                                            String course_category,
                                            String course_assignment,
                                            String enabling_grade,
                                            String course);
}
