package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.example.base.BaseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class LikeTweet extends BaseEntity<Long> {

    @ManyToOne
    User user;

    @ManyToOne
    Tweet tweet;

}
