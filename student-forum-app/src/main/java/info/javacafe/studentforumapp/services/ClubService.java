package info.javacafe.studentforumapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import info.javacafe.studentforumapp.dto.ClubDto;
import info.javacafe.studentforumapp.entities.Club;
import info.javacafe.studentforumapp.repositories.ClubRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public List<ClubDto> findAllClubData() {
        List<ClubDto> clubData = new ArrayList<>();
        for (Club club : clubRepository.findAll()) {
            clubData.add(new ClubDto(club.getId(), club.getName(), club.getDescription(), club.getImageId()));
        }
        return clubData;
    }

    public List<Club> findAll() {
        List<Club> clubs = new ArrayList<>();
        clubRepository.findAll().forEach(clubs::add);
        return clubs;
    }

    public void save(Club club) {
        clubRepository.save(club);
    }

    public Optional<Club> findById(Integer clubId) {
		return clubRepository.findById(clubId);
	}
}
