package org.example;

import lombok.*;


//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Data
@Builder
public class Movie
{
    private int id;
    private String title;
    private String description;
    private String country;
    private int rating;

    private String language;
}
