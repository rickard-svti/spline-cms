package se.spline.api.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.JsonApiToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonApiResource(type = "repository")
public class Repository {

    @JsonApiId
    private String id;
    private String name;
    @JsonApiToOne
    private Folder rootFolder;



}
