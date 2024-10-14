package com.project.doctor_fish_back.repository;

import com.project.doctor_fish_back.entity.Leave;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LeaveMapper {
    int save(Leave leave);
    Leave findLeaveById(Long id);
    int modify(Leave leave);
    int acceptById(Long id);
    int cancelById(Long id);
    int deleteById(Long id);

    List<Leave> getAllToDoctor(Long doctorId);
    Long getCountAllToDoctor(Long doctorId);

    List<Leave> getAllToInfo();
    Long getCountAllToInfo();
}
