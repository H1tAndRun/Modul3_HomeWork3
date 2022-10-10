package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Phone {

    @NonNull
    private String prefix;

    @NonNull
    private String number;

    private String bonusCode;
}
