package com.oncodetech.hotelReserve.hotel.entity;

import com.oncodetech.hotelReserve.hotel.enums.RoomStatus;
import com.oncodetech.hotelReserve.hotel.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

//OT - Otel
@Entity
@Table(name = "OT_ROOM")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @SequenceGenerator(name = "room_sequence",sequenceName = "room_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_sequence")
    private Long id;
    private Integer roomNumber;

    @OneToOne
    private RoomDetails roomDetails;

}
