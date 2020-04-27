package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import com.cts.ba2.model.Project;

public interface IProject {
	
	public abstract void addProject(Project project);

	public abstract List<Project> listOfProject();
	
	public abstract Optional<Project> findById(Long id);

	public abstract String updateProject(Long id, Project project);

	public abstract String deleteProject(Long id);

}
