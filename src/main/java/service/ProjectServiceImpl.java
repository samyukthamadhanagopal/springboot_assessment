package service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import config.StatusEnum;
import dto.ProjectDto;
import mapper.ProjectMapper;
import model.Project;
import repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepo;

	@Autowired
	private ProjectMapper projectMapper;

	/*findAllProjectsUnArchived - return List of Projects which are un archived using named query */
	@Override
	public List<ProjectDto> findAllProjectsUnArchived() {
		List<Project> projects = projectRepo.findAllUnArchived();
		return projectMapper.toDto(projects);
	}

	/*saveProject - return newly created project with not archived and inprogress status*/
	@Override
	public ProjectDto saveProject(ProjectDto projectDto) {
		Project project = projectMapper.toProject(projectDto);
		project.setStatus(StatusEnum.IN_PROGRESS);
		project.setArchived(Boolean.FALSE);
		project.setDateCreated(LocalDateTime.now());
		project = projectRepo.save(project);
		return projectMapper.toProjectDto(project);
	}

	/*updateProject - return existing project with updated columns as archived and same inprogress status*/
	@Override
	public ProjectDto updateProject(Long projectId) {
		Project project = projectRepo.getOne(projectId);
		project.setId(projectId);
		project.setArchived(Boolean.TRUE);
		project = projectRepo.save(project);
		return projectMapper.toProjectDto(project);
	}

}
