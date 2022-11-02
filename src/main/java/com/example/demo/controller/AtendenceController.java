package com.example.demo.controller;

import com.example.demo.mapper.AtendenceMapper;
import com.example.demo.entity.Atendence;
import com.example.demo.mapper.AtendenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtendenceController {
    @Autowired
    private AtendenceMapper atendenceMapper;

    @GetMapping("/attendence")
    public List<Atendence> get() {
        List<Atendence> list = atendenceMapper.getAtendence();
        return list;
    }
}
