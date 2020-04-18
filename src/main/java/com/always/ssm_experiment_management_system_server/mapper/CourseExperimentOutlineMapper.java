package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.tableBean.CourseExperimentOutlineTable;
import com.always.ssm_experiment_management_system_server.model.tableBean.LaboratoryCompartmentTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseExperimentOutlineMapper {
    @Insert("insert into course_experiment_outline(course_experiment_outline_id," +
            "allocation_of_courses_id," +
            "proportion_of_experimental_results," +
            "experiment_item_id) " +
            "value(#{course_experiment_outline_id}," +
            "#{allocation_of_courses_id}," +
            "#{proportion_of_experimental_results}," +
            "#{experiment_item_id}) ")
    void add(String course_experiment_outline_id,
             String allocation_of_courses_id,
             String proportion_of_experimental_results,
             String experiment_item_id);

    @Delete("delete from course_experiment_outline where course_experiment_outline_id = #{course_experiment_outline_id}")
    void delete(String course_experiment_outline_id);

    @Select("select * " +
            "from view_course_experiment_outline " +
            "where course_id like '%${course}%' "+
            "and course_name like '%${course}%' ")
    List<CourseExperimentOutlineTable> list(String course);
}
