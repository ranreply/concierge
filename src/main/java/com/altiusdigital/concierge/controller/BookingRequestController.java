package com.altiusdigital.concierge.controller;

import com.altiusdigital.concierge.entity.BookingRequest;
import com.altiusdigital.concierge.repo.IRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
@EnableDiscoveryClient
public class BookingRequestController {
    @Autowired(required = true)
    IRequestRepo reqRepo;
    BookingRequest request;
    @PostMapping(path="/booking",consumes="application/json")
    public BookingRequest placeBooking(@RequestBody BookingRequest req){
        System.out.println("Entry point of placeBooking");
        request = new BookingRequest();
        request.setFirstName (req.getFirstName ());
        request.setCity (req.getCity());
        request.setDate(req.getDate());
        request.setTime(req.getTime());
        request.setHotel("yes");
        request.setCab ("yes");
        System.out.println(" Before Saving to table "+request.getFirstName ());
        System.out.println("Demo for DevOps");
        System.out.println("Demo 2");
        return reqRepo.save(request);
    }
}
