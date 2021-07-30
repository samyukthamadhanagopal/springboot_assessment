package mapper;

import dto.ProjectDto;
import javax.annotation.Generated;
import model.Project;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T22:00:32+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public ProjectDto toDto(Project entity) {
        if ( entity == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setId( entity.getId() );
        projectDto.setName( entity.getName() );
        projectDto.setStatus( entity.getStatus() );
        projectDto.setDateCreated( entity.getDateCreated() );
        projectDto.setArchived( entity.getArchived() );

        return projectDto;
    }

    @Override
    public Project toEntity(ProjectDto dto) {
        if ( dto == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( dto.getId() );
        project.setName( dto.getName() );
        project.setStatus( dto.getStatus() );
        project.setDateCreated( dto.getDateCreated() );
        project.setArchived( dto.getArchived() );

        return project;
    }

    @Override
    public ProjectDto toProjectDto(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setId( project.getId() );
        projectDto.setName( project.getName() );
        projectDto.setStatus( project.getStatus() );
        projectDto.setDateCreated( project.getDateCreated() );
        projectDto.setArchived( project.getArchived() );

        return projectDto;
    }

    @Override
    public Project toProject(ProjectDto projectDto) {
        if ( projectDto == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( projectDto.getId() );
        project.setName( projectDto.getName() );
        project.setStatus( projectDto.getStatus() );
        project.setDateCreated( projectDto.getDateCreated() );
        project.setArchived( projectDto.getArchived() );

        return project;
    }
}
