package com.example.erpserice1.Repository;

import com.example.erpserice1.Model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockReposotory extends JpaRepository<Stock,Long> {
}
