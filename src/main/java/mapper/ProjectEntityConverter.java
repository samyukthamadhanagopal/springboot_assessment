package mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public interface ProjectEntityConverter<DTO, Entity> {

	DTO toDto(Entity entity);

	Entity toEntity(DTO dto);

	default List<DTO> toDto(List<Entity> entities) {
		if (entities == null) {
			return null;
		}
		return entities.stream().map(e -> toDto(e)).collect(Collectors.toList());
	}

	default List<Entity> toEntity(List<DTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		return dtoList.stream().filter(Objects::nonNull).map(d -> toEntity(d)).collect(Collectors.toList());
	}
}
