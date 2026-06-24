package com.aditya.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ResponseDto {
    private boolean isSuccess;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> oddNumbers;
    private List<String> evenNumbers;
    private List<String> alphabets;
    private List<String> specialCharacters;
    private String sum;
    private String concatString;

    @JsonProperty("is_success")
    public boolean getIsSuccess() { return isSuccess; }
    public void setSuccess(boolean s) { this.isSuccess = s; }

    @JsonProperty("user_id")
    public String getUserId() { return userId; }
    public void setUserId(String u) { this.userId = u; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    public void setEmail(String e) { this.email = e; }

    @JsonProperty("roll_number")
    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String r) { this.rollNumber = r; }

    @JsonProperty("odd_numbers")
    public List<String> getOddNumbers() { return oddNumbers; }
    public void setOddNumbers(List<String> o) { this.oddNumbers = o; }

    @JsonProperty("even_numbers")
    public List<String> getEvenNumbers() { return evenNumbers; }
    public void setEvenNumbers(List<String> e) { this.evenNumbers = e; }

    @JsonProperty("alphabets")
    public List<String> getAlphabets() { return alphabets; }
    public void setAlphabets(List<String> a) { this.alphabets = a; }

    @JsonProperty("special_characters")
    public List<String> getSpecialCharacters() { return specialCharacters; }
    public void setSpecialCharacters(List<String> s) { this.specialCharacters = s; }

    @JsonProperty("sum")
    public String getSum() { return sum; }
    public void setSum(String s) { this.sum = s; }

    @JsonProperty("concat_string")
    public String getConcatString() { return concatString; }
    public void setConcatString(String c) { this.concatString = c; }
}