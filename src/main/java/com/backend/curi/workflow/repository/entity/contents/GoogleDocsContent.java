package com.backend.curi.workflow.repository.entity.contents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GoogleDocsContent {
    private String url;
    private String description;
}
