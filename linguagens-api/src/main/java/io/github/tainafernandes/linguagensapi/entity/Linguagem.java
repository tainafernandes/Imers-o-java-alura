package io.github.tainafernandes.linguagensapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Linguagem {
    private String title;
    private String image;
    private Integer ranking;
}
