package com.company.conference.conferencedemo.services;

import com.company.conference.conferencedemo.models.Session;
import com.company.conference.conferencedemo.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    @Autowired
    SessionRepository sessionrepo;
    public List<Session> getSessions()
    {
        return sessionrepo.findAll();
    }
}
