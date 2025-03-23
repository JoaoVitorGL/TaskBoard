package org.gouveia.board.persistence.entity;

import lombok.Data;

import static org.gouveia.board.persistence.entity.BoardColumnKindEnum.INITIAL;

@Data
public class CardEntity
{
    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
}
