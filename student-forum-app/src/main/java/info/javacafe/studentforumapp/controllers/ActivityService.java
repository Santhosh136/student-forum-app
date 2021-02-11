package info.javacafe.studentforumapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.javacafe.studentforumapp.entities.Activity;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public void save(Activity activity) {
        activityRepository.save(activity);
    }
}
