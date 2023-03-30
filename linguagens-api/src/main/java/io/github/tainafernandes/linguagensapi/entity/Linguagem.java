package io.github.tainafernandes.linguagensapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@Document(collection = "linguagens")
@NoArgsConstructor
@AllArgsConstructor
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private Integer ranking;
}
