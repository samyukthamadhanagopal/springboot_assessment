package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.ProjectDto;
import service.ProjectService;

/*Project Management Flow
 * Author: Samyuktha Madhanagopal
 * */
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	/* getAllProjectsUnArchived - return List of Projects which are not archived */
	@GetMapping()
	public ResponseEntity<List<ProjectDto>> getAllProjectsUnArchived() {
		return ResponseEntity.ok(projectService.findAllProjectsUnArchived());
	}

	/* createProject - return Project newly created */
	@PostMapping()
	public ResponseEntity<ProjectDto> createProject(@Validated @RequestBody ProjectDto projectDto) {
		return ResponseEntity.ok(projectService.saveProject(projectDto));
	}

	/* updateProject - return Project updated which is existing with the Id */
	@PutMapping("/{id}")
	public ResponseEntity<ProjectDto> updateProject(@PathVariable("id") Long id) {
		return ResponseEntity.ok(projectService.updateProject(id));
	}

}
