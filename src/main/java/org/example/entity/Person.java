package org.example.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.example.base.BaseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@MappedSuperclass
public class Person extends BaseEntity<Long> {

    Profile profile;

}
