package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository //DB를 저장한다는 의미
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> { //JPA를 배운다면 JPARespository를 상속받아 사용
}