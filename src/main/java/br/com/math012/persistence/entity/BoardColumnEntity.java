package br.com.math012.persistence.entity;

import br.com.math012.persistence.entity.enums.BoardColumnKindEnum;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoardColumnEntity {
    private Long id;
    private String name;
    private int order;
    private BoardColumnKindEnum kind;
    private BoardEntity board = new BoardEntity();
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<CardEntity> cards = new ArrayList<>();
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BoardColumnEntity > boardColumns;
}
