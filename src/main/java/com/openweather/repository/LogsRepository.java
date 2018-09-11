package com.openweather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opeanweather.entity.Logs;

public interface LogsRepository extends JpaRepository<Logs, String> {
}
