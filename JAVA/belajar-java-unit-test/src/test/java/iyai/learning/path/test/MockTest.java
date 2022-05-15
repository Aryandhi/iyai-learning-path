package iyai.learning.path.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void testMock(){
        // membuat object mock
        List<String> list = Mockito.mock(List.class);

        // memberi behaviour pada object
        Mockito.when(list.get(0)).thenReturn("Aryandhi");
        Mockito.when(list.get(100)).thenReturn("Arief");

        // sebelum ditambah thenReturn, makan balikan dari Mockito = null
        System.out.println(list.get(0));

        // untuk verifikasi jumlah mockito
        // saat mockito Aryandhi dipanggil 2x,
        // sdgkan Mockito.times() di verify sebanyak 2x, maka akan error
        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
