package com.aditya.bfhl.service;

import com.aditya.bfhl.dto.ResponseDto;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BfhlServiceImpl implements BfhlService {

    private static final String USER_ID      = "aditya_kanwar_22112005";
    private static final String EMAIL        = "aditya1762.be23@chitkara.edu.in";
    private static final String ROLL_NUMBER  = "2310991762";

    @Override
    public ResponseDto processData(List<String> data) {
        List<String> odd = new ArrayList<>(), even = new ArrayList<>();
        List<String> alphabets = new ArrayList<>(), special = new ArrayList<>();
        long sum = 0;
        StringBuilder allChars = new StringBuilder();

        for (String item : data) {
            if (isNumber(item)) {
                long n = Long.parseLong(item);
                sum += n;
                if (Math.abs(n) % 2 == 0) even.add(item);
                else odd.add(item);
            } else if (isAlpha(item)) {
                alphabets.add(item.toUpperCase());
                allChars.append(item);
            } else {
                special.add(item);
            }
        }

        ResponseDto resp = new ResponseDto();
        resp.setSuccess(true);
        resp.setUserId(USER_ID);
        resp.setEmail(EMAIL);
        resp.setRollNumber(ROLL_NUMBER);
        resp.setOddNumbers(odd);
        resp.setEvenNumbers(even);
        resp.setAlphabets(alphabets);
        resp.setSpecialCharacters(special);
        resp.setSum(String.valueOf(sum));
        resp.setConcatString(buildConcatString(allChars.toString()));
        return resp;
    }

    private boolean isNumber(String s) {
        try { Long.parseLong(s); return true; }
        catch (NumberFormatException e) { return false; }
    }

    private boolean isAlpha(String s) {
        return !s.isEmpty() && s.chars().allMatch(Character::isLetter);
    }

    private String buildConcatString(String raw) {
        // collect only letters from raw
        StringBuilder letters = new StringBuilder();
        for (char c : raw.toCharArray()) {
            if (Character.isLetter(c)) letters.append(c);
        }
        // reverse
        String reversed = letters.reverse().toString();
        // alternating caps: index 0 → upper, index 1 → lower, ...
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            result.append(i % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        return result.toString();
    }
}