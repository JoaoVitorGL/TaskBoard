package org.gouveia.board.persistence.entity;

import lombok.Data;

@Data
public class CardEntity
{
    private Long id;
    private String title;
    private String description;
}
