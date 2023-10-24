package com.example.udemypro.repository;

import com.example.udemypro.model.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends JpaRepository<Page,Integer> {

}
