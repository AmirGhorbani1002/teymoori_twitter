package org.example.entity;

import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Block {

    @ManyToOne
    User blocking;

    @ManyToOne
    User blocked;


}
