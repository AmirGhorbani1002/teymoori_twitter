package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Channel extends BaseEntity<Long> {

    @OneToMany
    Set<UserChannel> userChannels = new HashSet<>();

    @OneToMany
    Set<Message> messages = new HashSet<>();

    @OneToMany
    Set<Report<Long, Channel>> reports = new HashSet<>();

}
