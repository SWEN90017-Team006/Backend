package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.model.Game;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GameMapper extends BaseMapper<Game> {
}
