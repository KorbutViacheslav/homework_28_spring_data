package com.example.homework_28_spring_data.repository;

import com.example.homework_28_spring_data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
