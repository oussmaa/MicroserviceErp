package com.example.erpserice1.Repository;

import com.example.erpserice1.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationReposotory extends JpaRepository<Location,Long> {

   Location findById(long id);
}
