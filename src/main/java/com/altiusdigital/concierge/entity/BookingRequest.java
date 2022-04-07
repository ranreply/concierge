package com.altiusdigital.concierge.entity;

import javax.persistence.*;

@Entity
@Table(name="booking_request")
public class BookingRequest {
    @Id
    @GeneratedValue
    @Column(name="request_id")
    private Integer requestId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="city")
    private String city;
    @Column(name="date")
    private String date;
    @Column(name="time")
    private String time;
    @Column(name="hotel")
    private String hotel;

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    @Column(name="cab")
    private String cab;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
