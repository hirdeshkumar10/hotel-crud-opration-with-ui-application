package com.sunglowsys.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "code")
    private String code;

    @NotNull
    @Column(name = "name")
    private String name;

    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "mobile")
    private String mobile;

    @NotNull
    @Column(name = "hotel_type")
    private String hotelType;

    public Hotel() {
    }

    public Hotel(Long id, String code, String name, String email, String mobile, String hotelType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.hotelType = hotelType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(code, hotel.code) && Objects.equals(name, hotel.name) && Objects.equals(email, hotel.email) && Objects.equals(mobile, hotel.mobile) && Objects.equals(hotelType, hotel.hotelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, email, mobile, hotelType);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", hotelType='" + hotelType + '\'' +
                '}';
    }
}
