package br.com.book.entity;

import br.com.book.entity.Author;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "book")
@Entity(name = "book")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(String name, Author author){
        this.name = name;
        this.author = author;
    }

}
