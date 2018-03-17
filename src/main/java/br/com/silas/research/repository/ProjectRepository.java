package br.com.silas.research.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.silas.research.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{

}
