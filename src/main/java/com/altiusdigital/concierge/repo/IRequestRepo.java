package com.altiusdigital.concierge.repo;

import com.altiusdigital.concierge.entity.BookingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IRequestRepo extends JpaRepository<BookingRequest,Integer> {
    public BookingRequest save(BookingRequest booking);

}