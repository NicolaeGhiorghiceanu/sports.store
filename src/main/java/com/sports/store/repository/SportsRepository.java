package com.sports.store.repository;

import com.sports.store.entity.Sports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsRepository extends JpaRepository<Sports, Integer> {

}
