package com.agriview.shp2database.service.impl;

import com.agriview.shp2database.entity.Database;
import com.agriview.shp2database.mapper.DatabaseMapper;
import com.agriview.shp2database.service.IDatabaseService;
import com.baomidou.dynamic.datasource.creator.HikariDataSourceCreator;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class DatabaseServiceImpl extends ServiceImpl<DatabaseMapper, Database> implements IDatabaseService {
    final DatabaseMapper databaseMapper;
    final DataSource dataSource;
    final HikariDataSourceCreator dataSourceCreator;

    public DatabaseServiceImpl(DatabaseMapper databaseMapper, DataSource dataSource, HikariDataSourceCreator dataSourceCreator) {
        this.databaseMapper = databaseMapper;
        this.dataSource = dataSource;
        this.dataSourceCreator = dataSourceCreator;
    }


}
