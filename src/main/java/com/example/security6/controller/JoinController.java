package com.example.security6.controller;

import com.example.security6.dto.JoinDTO;
import com.example.security6.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    private JoinService joinService;


    @GetMapping("/join")
    public String join() {
        return "Join";
    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDTO joinDTO) {
        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);
        return "redirect:/Login";
    }

}
