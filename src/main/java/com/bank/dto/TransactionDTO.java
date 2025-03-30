package com.bank.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class TransactionDTO {
  private BigDecimal amount;
  private TransactionType type;

  public TransactionDTO() {
  }

  public TransactionDTO(BigDecimal amount, TransactionType type) {
    setAmount(amount);
    setType(type);
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    if (amount == null) {
      throw new IllegalArgumentException("Amount cannot be null");
    }
    if (amount.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("Amount cannot be negative");
    }
    this.amount = amount;
  }

  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    if (type == null) {
      throw new IllegalArgumentException("Transaction type cannot be null");
    }
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    TransactionDTO that = (TransactionDTO) o;
    return Objects.equals(amount, that.amount) && type == that.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, type);
  }

  @Override
  public String toString() {
    return "TransactionDTO{" +
        "amount=" + amount +
        ", type=" + type +
        '}';
  }
}