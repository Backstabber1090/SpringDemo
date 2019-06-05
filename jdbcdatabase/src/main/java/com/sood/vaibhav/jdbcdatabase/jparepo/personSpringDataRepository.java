package com.sood.vaibhav.jdbcdatabase.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sood.vaibhav.jdbcdatabase.entity.Person;

public interface personSpringDataRepository extends JpaRepository<Person, Integer> {

}
