package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Track {

    String id;
    String title;
    String singer;
    static int lastId;

    // Constructor vacio
    public Track() {
        this.setId(RandomUtils.getId());
    }
    // Constructor
    // Constructor
    public Track(String title, String singer) {
        this(null, title, singer);
    }
    // Constructor

    // Constructor
    public Track(String id, String title, String singer) {
        this(); // Llama al constructor sin parámetros (asigna un id aleatorio).
        if (id != null) this.setId(id); // Si se proporciona un id, lo sobrescribe.
        this.setSinger(singer);
        this.setTitle(title);
    }
    // Constructor

    // getters y setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    // getters y setters

    @Override
    public String toString() {
        return "Track [id="+id+", title=" + title + ", singer=" + singer +"]";
    }

}