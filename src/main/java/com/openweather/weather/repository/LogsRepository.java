package com.openweather.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opeanweather.weather.entity.Logs;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Long> {
}
