package com.example.springliquidbase.domain.translate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranslateModel{

    private UUID id;
    private UUID wordFromId;
    private UUID wordToId;
    private UUID dictionaryId;
}
