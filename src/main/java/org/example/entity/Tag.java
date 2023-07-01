package org.example.entity;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.example.base.BaseEntity;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tag extends BaseEntity<Long> {

    String tag;
    @ManyToMany
    Set<Tweet> tweets = new HashSet<>();
    long count;


}
