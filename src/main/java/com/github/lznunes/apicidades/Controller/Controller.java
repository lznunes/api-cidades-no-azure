package com.github.lznunes.apicidades.Controller;

import com.github.lznunes.apicidades.Model.City;
import com.github.lznunes.apicidades.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;
import java.util.List;


@RestController
@RequestMapping("cidades")
public class Controller {

    private final CityRepository repository;

    public Controller(final CityRepository repository) {
        this.repository = repository;
    }

    //* 1st
    @GetMapping
    public List<City> cidades(){
        return repository.findAll();
    }

//    @GetMapping
//    public Page<City> cidades(final Pageable page) {
//        return repository.findAll( page);
//    }
}
