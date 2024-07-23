package com.LX.shop;


import jakarta.persistence.*;

@Entity

public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = true)
    public String title;
    public Integer price;
}
