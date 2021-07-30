package dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import config.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

	Long id;
	String name;
	StatusEnum status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
	LocalDateTime dateCreated;
	Boolean archived;

}
