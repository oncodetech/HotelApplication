package com.oncodetech.hotelReserve.hotel.entity;

import com.oncodetech.hotelReserve.hotel.enums.RoomStatus;
import com.oncodetech.hotelReserve.hotel.enums.RoomTag;
import com.oncodetech.hotelReserve.hotel.enums.RoomType;
import com.oncodetech.hotelReserve.hotel.enums.RoomView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "OT_ROOM_DETAIL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDetails {

    @Id
    @SequenceGenerator(name = "room_detail_sequence", sequenceName = "room_detail_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_detail_sequence")
    private Long id;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private RoomView roomView;
    private BigDecimal roomPricePerNight;
    @OneToMany
    private List<RoomPicture> roomPictureList = null;
    private List<RoomTag> roomTagList = null;
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id",referencedColumnName = "id")
    private Room room;

}
