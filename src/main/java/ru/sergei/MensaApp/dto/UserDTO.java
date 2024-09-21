package ru.sergei.MensaApp.dto;

import java.math.BigDecimal;
import java.util.List;

public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private BigDecimal balance;
    private List<CardDTO> cards;
}
