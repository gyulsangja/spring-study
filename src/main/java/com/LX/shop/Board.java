package com.LX.shop;

import jakarta.persistence.*;

@Entity
public class Board{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false)
    public String title;
    public String date;

}
