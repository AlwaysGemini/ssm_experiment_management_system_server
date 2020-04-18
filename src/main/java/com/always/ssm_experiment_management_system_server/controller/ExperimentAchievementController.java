package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.ExperimentAchievementMapper;
import com.always.ssm_experiment_management_system_server.model.tableBean.ExperimentAchievementEntryTable;
import com.always.ssm_experiment_management_system_server.model.tableTemplateBean.ExperimentAchievementTableTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("experimentAchievement")
public class ExperimentAchievementController {

    @Autowired
    ExperimentAchievementMapper mapper;

    @PostMapping("getExperimentAchievementTableSummary")
    public Response getExperimentAchievementTableSummary(@RequestParam String user_id) {
        List<ExperimentAchievementEntryTable> list = mapper.getExperimentAchievementTableSummary(user_id);
        return new Response(200, "获取实验项目成绩名单成功", list);
    }

    @PostMapping("getTemplate")
    public Response getTemplate(@RequestParam String experiment_course_match_id){
        List<ExperimentAchievementTableTemplate> list = mapper.getTemplate(experiment_course_match_id);
        return new Response(200, "获取实验项目成绩模板成功", list);
    }

    @PostMapping("upload")
    public Response upload(@RequestParam("file") MultipartFile file,
                           @RequestParam String experiment_course_match_id){
        if (file.isEmpty()) {
            return new Response(201, "上传失败!", null);
        }
        String fileName = file.getOriginalFilename();
        String filePath = "/always/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mapper.upload(fileName,experiment_course_match_id);
        return new Response(200,"上传成功",null);
    }

    @PostMapping("examining")
    public Response examining(@RequestParam int experiment_course_match_id,
                              @RequestParam String experiment_achievement_table_state) {
        mapper.examining(experiment_course_match_id,experiment_achievement_table_state);
        return new Response(200, "审核成功", new ArrayList<>());
    }
}
