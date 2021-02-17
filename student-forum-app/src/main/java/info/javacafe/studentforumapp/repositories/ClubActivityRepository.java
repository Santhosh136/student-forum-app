package info.javacafe.studentforumapp.repositories;

import org.springframework.data.repository.CrudRepository;

import info.javacafe.studentforumapp.entities.ClubActivity;

public interface ClubActivityRepository extends CrudRepository<ClubActivity, Integer>{
    
}
