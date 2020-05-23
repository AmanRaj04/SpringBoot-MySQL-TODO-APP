package io.amanproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import io.amanproject.entity.Todo;



public interface TodoRepository extends CrudRepository<Todo, Integer>{

}
