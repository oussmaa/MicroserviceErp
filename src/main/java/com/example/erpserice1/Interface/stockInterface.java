package com.example.erpserice1.Interface;


import com.example.erpserice1.Model.Stock;

import java.util.List;
import java.util.Optional;

public interface stockInterface {

     Stock modifierStock(Stock stock);
     void deleteStock(Long id);
     List<Stock> getAllStock();
     Optional<Stock> getStockById(Long id);
     Stock createStock(Stock stock);


}
