package com.taxah.diplom_calculate.model.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Class for working with Rest API productUsing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductUsing {
    private Long id;
    private Long checkId;
    private String productName;
    private Double cost;
    private List<TempUser> users;
}