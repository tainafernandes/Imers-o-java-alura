package io.github.tainafernandes.linguagensapi.repository;

import io.github.tainafernandes.linguagensapi.entity.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
