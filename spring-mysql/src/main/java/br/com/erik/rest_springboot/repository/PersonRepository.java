package br.com.erik.rest_springboot.repository;

import br.com.erik.rest_springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
