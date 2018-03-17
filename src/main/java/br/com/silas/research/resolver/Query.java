package br.com.silas.research.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.silas.research.model.Project;
import br.com.silas.research.repository.ProjectRepository;

public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private ProjectRepository projectRepository;

	public Iterable<Project> findAllProjects() {
		return projectRepository.findAll();
	}
	
	public Long countProjects() {
		return projectRepository.count();
	}

}
