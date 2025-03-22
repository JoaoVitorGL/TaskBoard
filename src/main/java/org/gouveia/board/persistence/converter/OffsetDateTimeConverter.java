package org.gouveia.board.persistence.converter;

import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

import static java.time.ZoneOffset.UTC;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class OffsetDateTimeConverter {

    public static OffsetDateTime toOffsetDateTime(final Timestamp value) {
        return OffsetDateTime.ofInstant(value.toInstant(), UTC);
    }
}
