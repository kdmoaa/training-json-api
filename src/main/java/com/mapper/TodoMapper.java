package com.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dto.TodoDto;

public interface TodoMapper {
	@Select("SELECT * FROM todo WHERE id = #{id}")
	TodoDto loadTodo(@Param("id") int id);
}
