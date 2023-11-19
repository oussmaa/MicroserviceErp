package com.example.erpserice1.Service;

import com.example.erpserice1.Interface.stockInterface;
import com.example.erpserice1.Model.Stock;
import com.example.erpserice1.Repository.StockReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServices implements stockInterface {

    @Autowired
    public StockReposotory stockReposotory;




    @Override
    public Stock modifierStock(Stock stock) {
        return stockReposotory.save(stock);
    }

    @Override
    public void deleteStock(Long id) {
        stockReposotory.deleteById(id);
    }

    @Override
    public List<Stock> getAllStock() {
        return stockReposotory.findAll();
    }

    @Override
    public Optional<Stock> getStockById(Long id) {
        return stockReposotory.findById(id);
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockReposotory.save(stock);
    }
}
