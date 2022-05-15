package com.java.belajarmockingforunittest.service;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MerchantServiceTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    private MerchantRespository merchantRespository;
    @Mock
    private MerchantHistoryRepository merchantHistoryRepository;
    @Captor
    private ArgumentCaptor<MerchantHistory> merchantHistoryArgumentCaptor;
    @InjectMocks
    private MerchantService merchantService;

    @Test
    void testSave() {
        Merchant merchant = new Merchant();
        merchant.setId("blibli");
        merchant.setName("BliBli");

        merchantService.save(merchant);

        verify(merchantRespository).save(merchant);
    }

    @Test
    void testDelete() {
        Merchant merchant = new Merchant();
        merchant.setId("blibli");
        merchant.setName("BliBli");

        merchantService.delete(merchant);

        verify(merchantRespository).delete(merchant);
        verify(merchantHistoryRepository).save(merchantHistoryArgumentCaptor.capture());

        MerchantHistory merchantHistory = merchantHistoryArgumentCaptor.getValue();
        assertEquals("blibli", merchantHistory.getId());
        assertEquals("Blibli", merchantHistory.getName());
    }

    // untuk validasi spy tidak ada verify yg terlewat
    @AfterEach
    void tearDown() throws Exception {
        verifyNoMoreInteractions(merchantRespository, merchantHistoryRepository);
    }
}