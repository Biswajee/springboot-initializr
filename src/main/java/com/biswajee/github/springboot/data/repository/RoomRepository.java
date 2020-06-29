package com.biswajee.github.springboot.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biswajee.github.springboot.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	

}
