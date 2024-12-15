package com.firas.spotify_sorting_app.Model;

import jakarta.persistence.Entity;  
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.Data;



@Data
@Entity
@Table(name = "song")
public class Song {

    @Id
    private int songID;
    private int genereID; 

}
