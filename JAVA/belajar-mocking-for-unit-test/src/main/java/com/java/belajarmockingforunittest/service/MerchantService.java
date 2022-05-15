package com.java.belajarmockingforunittest.service;

import org.springframework.stereotype.Service;

@Service
public class MerchantService {
    private MerchantRespository merchantRespository;
    private MerchantHistoryRepository merchantHistoryRepository;

    public void save(Merchant merchant){
        merchantRespository.save(merchant);
    }

    public void delete(Merchant merchant){
        merchantRespository.delete(merchant);

        MerchantHistory merchantHistory = new MerchantHistory();
        merchant.setId(merchant.getId());
        merchant.setName(merchant.getName());

        merchantHistoryRepository.save(merchantHistory);
    }
}
