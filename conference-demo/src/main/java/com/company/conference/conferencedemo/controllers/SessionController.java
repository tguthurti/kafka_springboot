package com.company.conference.conferencedemo.controllers;

import com.company.conference.conferencedemo.models.Session;
import com.company.conference.conferencedemo.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1")
public class SessionController {
    @Autowired
    SessionService sessionservice;
    @RequestMapping(value="/sessions")
    public List<Session> getSessions()
    {
        return sessionservice.getSessions();
    }
}
