package com.sports.store.controller;


import com.sports.store.entity.Sports;
import com.sports.store.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SportsController {
    @Autowired
    SportsService sportsService;
    @GetMapping("/")
    public String viewTemplate(Model model) {

        boolean authenticated = SecurityContextHolder.getContext().getAuthentication().isAuthenticated();

        if(authenticated){
            List<Sports> sports = sportsService.listAllSports();
            model.addAttribute("sports", sports);
//            ChosenItemDto chosenItemDto = new ChosenItemDto();
//            model.addAttribute("chosenItemDto", chosenItemDto);
            return "sports";
        }else{
            return "login";
        }
    }
    @GetMapping("/sports")
    public String viewAllSports(Model model){
        List<Sports> sportsList = sportsService.listAllSports();
        model.addAttribute("sports", sportsList);
        return "sports";
    }

}
