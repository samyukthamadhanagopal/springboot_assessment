package service;

import java.util.List;

import dto.ProjectDto;

public interface ProjectService {

	List<ProjectDto> findAllProjectsUnArchived();

	ProjectDto saveProject(ProjectDto projectDto);

	ProjectDto updateProject(Long projectId);

}
