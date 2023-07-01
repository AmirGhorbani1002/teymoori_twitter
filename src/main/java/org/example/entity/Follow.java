package org.example.entity;

import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Follow {

    @ManyToOne
    User follower;
    @ManyToOne
    User following;

}
