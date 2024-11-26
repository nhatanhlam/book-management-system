package com.example.book_social_network.book;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BorrowedBookResponse {

    private Integer id;
    private String title;
    private String authorName;
    private String isbn;
    private String owner;
    private double rate;
    private boolean returned;
    private boolean returnApproved;
}
