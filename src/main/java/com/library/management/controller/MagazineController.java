package com.library.management.controller;

import com.library.management.entity.Magazine;
import com.library.management.service.MagazineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/magazines")
public class MagazineController {

    @Autowired
    MagazineService magazineService;

    @GetMapping("/{id}")
    public Magazine getMagazineById(@PathVariable("id") int id) {
        return magazineService.findMagazineById(id);
    }

    @GetMapping("/title/{title}")
    public Magazine getMagazineByTitle(@PathVariable("title") String title) {
        return magazineService.findMagazineByTitle(title);
    }

    @GetMapping("/all")
    public List<Magazine> getAllMagazines() {
        return magazineService.getAllMagazines();
    }

    @GetMapping("/all/{author}")
    public List<Magazine> getAllMagazinesByAuthor(@PathVariable("author") String author) {
        return magazineService.findByAuthor(author);
    }

    @PostMapping
    public Magazine addMagazine(@RequestBody Magazine magazine) {
        return magazineService.addMagazine(magazine);
    }

    @PutMapping
    public Magazine updateMagazine(@RequestBody Magazine magazine) {
        return magazineService.updateMagazine(magazine);
    }

    @DeleteMapping("/{id}")
    public void deleteMagazine(@PathVariable("id") int id) {
        magazineService.deleteMagazine(id);
    }

}
