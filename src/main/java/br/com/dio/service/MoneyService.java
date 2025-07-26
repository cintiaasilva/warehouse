package br.com.dio.service;

import br.com.dio.dao.MoneyDAO;

import java.math.BigDecimal;

public class MoneyService {

    private final MoneyDAO dao;

    public MoneyService(MoneyDAO dao) {
        this.dao = dao;
    }

    public void add(BigDecimal money){
        dao.add(money);
    }

    public BigDecimal getMoney(){
        return dao.getMoney();
    }

    public BigDecimal dec(BigDecimal money){
        return dao.add(money.multiply(new BigDecimal("-1")));
    }
}
