package org.example.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BodyExample {
    private String name;
    private String lastName;
    private Integer age;
}
