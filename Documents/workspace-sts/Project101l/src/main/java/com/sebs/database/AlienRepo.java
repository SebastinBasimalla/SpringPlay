package com.sebs.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer>{

}
