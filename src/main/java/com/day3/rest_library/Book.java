package com.day3.rest_library;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    private Long id;

    @NotNull
    private String judul;

    @NotNull
    private String penulis;

    @Range(min=0)
    private Integer tahunTerbit;

}
