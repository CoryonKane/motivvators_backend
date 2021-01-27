package com.codecool.motivators.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class CardList {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    @Builder.Default
    private List<Card> cards = new ArrayList<>();
    @Builder.Default
    private Date createdOn = new Date();

    public void addCard (Card card) {
        if (!hasCard(card)) {
            this.cards.add(card);
        }
    }

    public void removeCard (Card card) {
        this.cards.remove(card);
    }

    public boolean hasCard (Card card) {
        return this.cards.contains(card);
    }
}
