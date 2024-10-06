package com.library.management.service;

import com.library.management.entity.Magazine;

import java.util.List;

public interface MagazineServiceInterface {
    Magazine findMagazineById(int id);
    Magazine findMagazineByTitle(String title);
    List<Magazine> findByAuthor(String author);
    List<Magazine> getAllMagazines();
    Magazine addMagazine(Magazine magazine);
    Magazine updateMagazine(Magazine magazine);
    void deleteMagazine(int id);

}
