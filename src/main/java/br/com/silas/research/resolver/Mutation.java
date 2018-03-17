package br.com.silas.research.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.silas.research.model.Project;
import br.com.silas.research.model.ProjectInput;
import br.com.silas.research.repository.ProjectRepository;

public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project newProject(String name) {
		Project project = new Project();
		project.setName(name);
		return projectRepository.save(project);
	}
	
	public Long deleteProject(Long id) {
		projectRepository.delete(id);
		return id;
	}
	
	public Project updateProject(Project p) {
		return projectRepository.save(p);
	}

}
