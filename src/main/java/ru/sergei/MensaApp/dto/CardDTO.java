package ru.sergei.MensaApp.dto;

import java.math.BigDecimal;

public class CardDTO {
    private Long id;
    private static String ownerName;
    private static BigDecimal balance;
    private BigDecimal userBalance;

    public CardDTO(){}

    public CardDTO(String ownerName){
        CardDTO.ownerName=ownerName;
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String ownerName() {
        return ownerName;
    }

    public static void setOwnerName(String ownerName) {
        CardDTO.ownerName = ownerName;
    }

    public static BigDecimal balance() {
        return balance;
    }

    public static void setBalance(BigDecimal balance) {
        CardDTO.balance = balance;
    }

    public BigDecimal userBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }
}
