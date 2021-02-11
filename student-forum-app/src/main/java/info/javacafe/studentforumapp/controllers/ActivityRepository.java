package info.javacafe.studentforumapp.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import info.javacafe.studentforumapp.entities.Activity;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Integer>{}
