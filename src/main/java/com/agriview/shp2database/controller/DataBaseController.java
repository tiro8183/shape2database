package com.agriview.shp2database.controller;

import com.agriview.shp2database.service.IDatabaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
@CrossOrigin
@Slf4j
public class DataBaseController {
    final IDatabaseService databaseService;

    public DataBaseController(IDatabaseService databaseService) {
        this.databaseService = databaseService;
    }

}
