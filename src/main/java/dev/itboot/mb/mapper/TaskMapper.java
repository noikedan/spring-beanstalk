package dev.itboot.mb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dev.itboot.mb.model.Task;

@Mapper
public interface TaskMapper {

	List<Task> all();

	void add(Task task);

	void complete(Task task);

}
