package info.javacafe.studentforumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import info.javacafe.studentforumapp.entities.Club;

@Repository
public interface ClubRepository extends CrudRepository<Club, Integer>{
    
}
