package com.onlineexammanagementsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 09/09/2022
 **/

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class AdminDTO {
    private String id;
    private String name;
    private String password;
}
