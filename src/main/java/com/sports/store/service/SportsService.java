package com.sports.store.service;

import com.sports.store.entity.Sports;
import com.sports.store.repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportsService {
    @Autowired
    SportsRepository sportsRepository;
    public List<Sports> listAllSports(){
        return sportsRepository.findAll();

    }
}
