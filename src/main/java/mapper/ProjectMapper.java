package mapper;

import org.mapstruct.Mapper;

import dto.ProjectDto;
import model.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper extends ProjectEntityConverter<ProjectDto, Project> {

	ProjectDto toProjectDto(Project project);

	Project toProject(ProjectDto projectDto);

}
