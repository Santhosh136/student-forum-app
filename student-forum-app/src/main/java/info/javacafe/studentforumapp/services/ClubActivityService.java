package info.javacafe.studentforumapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.javacafe.studentforumapp.entities.ClubActivity;
import info.javacafe.studentforumapp.repositories.ClubActivityRepository;

@Service
public class ClubActivityService {
    @Autowired
    private ClubActivityRepository clubActivityRepository;

    public List<ClubActivity> findAll() {
        List<ClubActivity> activities = new ArrayList<>();
        clubActivityRepository.findAll().forEach(activities::add);
        return activities;
    }

	public void save(ClubActivity clubActivity) {
        clubActivityRepository.save(clubActivity);
	}

}
