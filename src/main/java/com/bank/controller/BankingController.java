package com.bank.controller;

import com.bank.service.BankingService;
import com.bank.dto.TransactionDTO;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Path("/banking")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankingController {

  @Inject
  BankingService bankingService;

  @GET
  @Path("/balance/{accountNumber}")
  public Response checkBalance(@PathParam("accountNumber") String accountNumber) {
    BigDecimal balance = bankingService.checkBalance();
    if (accountNumber == null || accountNumber.isEmpty()) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("Account number cannot be null or empty")
          .build();
    }
    Map<String, Object> response = new HashMap<>();
    response.put("accountNumber", accountNumber);
    response.put("balance", balance);
    return Response.ok(response).build();
  }

  @POST
  @Path("/deposit")
  public Response deposit(TransactionDTO transaction) {
    bankingService.deposit(transaction);
    return Response.ok().build();
  }
  
  @POST
  @Path("/withdraw")
  public Response withdraw(TransactionDTO transaction) {
    bankingService.withdraw(transaction);
    return Response.ok().build();
  }

  @POST
  @Path("/postAccount")
  public Response postAccount(String accountNumber) {
    if (accountNumber == null || accountNumber.isEmpty()) {
      return Response.status(Response.Status.BAD_REQUEST)
          .entity("Account number cannot be null or empty")
          .build();
    }
    bankingService.createAccount(accountNumber);
    return Response.ok().build();
  }

}