package com.oncodetech.hotelReserve.hotel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OT_ROOM_PICTURE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomPicture {

    @Id
    @SequenceGenerator(name = "room_picture_sequence", sequenceName = "room_picture_sequence" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "room_picture_sequence")
    private Long id;
    private String image; //TODO
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roomdetail_id",referencedColumnName = "id")
    private RoomDetails roomDetails;

}
