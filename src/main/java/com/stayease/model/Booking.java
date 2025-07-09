package com.stayease.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @Column(nullable = false)
    private LocalDate checkInDate;

    @Column(nullable = false)
    private LocalDate checkOutDate;
}
