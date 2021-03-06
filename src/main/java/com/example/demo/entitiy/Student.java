package com.example.demo.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@Entity(name = "student")
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "First name Should not be null")
    @NotEmpty(message = "First name Should not be empty")
    @Column(name = "first_name")
    private String first_name;

    @NotNull(message = "Last name Should not be null")
    @NotEmpty(message = "Last name Should not be empty")
    @Column(name = "last_name")
    private String last_name;

    @NotNull(message = "Email Should not be null")
    @NotEmpty(message = "Email Should not be empty")
    @Column(name = "email", unique = true)
    private  String email;                  //حولت نوع الايميل الى سترنق لانه يرفض بالداتابيس

    @Column(name = "create_at")
    private LocalDateTime create_at;

    public Student(String first_name, String last_name, String email, LocalDateTime create_at) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.create_at = create_at;
    }

}