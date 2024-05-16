package com.skillstorm.models;
import org.springframework.stereotype.Component;
import jakarta.persistence.*;

@Component //trying to see if this fixes BeanCreationException
@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    // Constructors
    public Warehouse() {
    }

    public Warehouse(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
