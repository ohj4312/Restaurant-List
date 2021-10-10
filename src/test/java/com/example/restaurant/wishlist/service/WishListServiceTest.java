package com.example.restaurant.wishlist.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;
    //원래는 naverClient를 목킹처리해서 어떠한 값을 내려주는지 지정하는것이 일반적이다 (client를 테스트마다 api호출하기 불편하기 때문)
    @Test
    public void searchTest(){
        var result = wishListService.search("갈비집");
        System.out.println(result);
        Assertions.assertNotNull(result);

    }
}