package com.gamergroup.web.service;

import com.gamergroup.web.dto.ClubDto;
import com.gamergroup.web.models.Club;

import java.util.List;
import java.util.stream.Stream;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);
}
