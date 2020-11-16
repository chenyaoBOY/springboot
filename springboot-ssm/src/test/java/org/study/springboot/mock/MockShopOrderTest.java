package org.study.springboot.mock;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author chenyao
 * @date 2020/5/27 15:49
 * @description
 */
public class MockShopOrderTest {


    @Test
    public void test(){
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("hello");
        when(list.get(1)).thenThrow(new RuntimeException("异常"));

        System.out.println(list.get(0));
        verify(list).get(0);
        System.out.println(list.get(1));
    }

}
