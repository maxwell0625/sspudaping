package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Atendence;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AtendenceMapper extends BaseMapper<Atendence> {
    @Select("SELECT COUNT(*) as num, card_date as date\n" +
            "FROM attendance\n" +
            "WHERE card_date > '2022-10-15' and card_date < '2022-11-01'\n" +
            "GROUP BY card_date\n" +
            "ASC ;")
    List<Atendence> getAtendence();
}
