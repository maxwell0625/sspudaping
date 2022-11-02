package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

public class Atendence {
    private Integer num;
    private String date;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
