package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel save(Hotel hotel);

    Hotel update(Hotel hotel);

    Page<Hotel> findAll(Pageable pageable);

    Optional<Hotel> findById(Long id);

    List<Hotel> search(String searchText);

    void delete(Long id);

}
