package com.example.springbooth2.repositories;

import com.example.springbooth2.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {



}
