package io.techlemariam.ppmtool.services;

import io.techlemariam.ppmtool.domain.Project;
import io.techlemariam.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        //LOGIC
        return projectRepository.save(project);
    }

}
