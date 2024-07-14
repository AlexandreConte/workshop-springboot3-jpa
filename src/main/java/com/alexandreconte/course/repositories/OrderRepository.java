package com.alexandreconte.course.repositories;

import com.alexandreconte.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
