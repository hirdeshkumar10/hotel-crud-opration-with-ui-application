package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    private final Logger log = LoggerFactory.getLogger(HotelServiceImpl.class);

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel save(Hotel hotel) {
        log.debug("Request to save Hotel: {}",hotel);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        log.debug("Request to update Hotel: {}",hotel);
        return hotelRepository.save(hotel);
    }

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        log.debug("Request to findAll Hotels: {}",pageable.toString());
        return hotelRepository.findAll(pageable);
    }

    @Override
    public Optional<Hotel> findById(Long id) {
        log.debug("Request to find Hotel ById : {}",id);
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> search(String searchText) {
        log.debug("Request to search Hotel ById : {}",searchText);
        return hotelRepository.search(searchText);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Hotels: {}",id);
        hotelRepository.deleteById(id);

    }
}
