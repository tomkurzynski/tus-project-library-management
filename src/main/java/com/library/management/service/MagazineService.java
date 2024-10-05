package com.library.management.service;

import com.library.management.entity.Magazine;
import com.library.management.exception.MagazineNotFoundException;
import com.library.management.repository.BookRepository;
import com.library.management.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineService implements MagazineServiceInterface{

    @Autowired
    MagazineRepository magazineRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Magazine findMagazineById(int magazineId) {
        return magazineRepository.findById(magazineId)
                .orElseThrow(() -> new MagazineNotFoundException("Magazine with Id " + magazineId + " not found"));
    }

    @Override
    public Magazine findMagazineByTitle(String title) {
        return magazineRepository.findByTitle(title)
                .orElseThrow(() -> new MagazineNotFoundException("The following magazine cannot be found: " + title));
    }

    @Override
    public List<Magazine> findByAuthor(String author) {
        return magazineRepository.findByAuthor(author);
    }

    @Override
    public Magazine addMagazine(Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    @Override
    public void updateMagazine(Magazine magazine) {
        magazineRepository.save(magazine);
    }

    @Override
    public void deleteMagazine(int id) {
        magazineRepository.deleteById(id);
    }
}
