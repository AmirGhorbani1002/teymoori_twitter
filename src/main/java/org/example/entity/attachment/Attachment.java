package org.example.entity.attachment;

import jakarta.persistence.Entity;
import lombok.*;
import org.example.base.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Attachment<E> extends BaseEntity<Long> {

    abstract E attachment();

}
