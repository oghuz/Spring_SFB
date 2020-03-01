package com.gilas.Spring_SFB.Web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDetails {
    private UUID id;
    private String bearName;
    private String bearStyle;
    private String upc;

}
