package com.nserge.taskpulse.service;

import com.nserge.taskpulse.model.Project;
import com.nserge.taskpulse.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    //@Autowired
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {}
}
