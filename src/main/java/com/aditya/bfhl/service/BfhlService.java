package com.aditya.bfhl.service;

import com.aditya.bfhl.dto.ResponseDto;
import java.util.List;

public interface BfhlService {
    ResponseDto processData(List<String> data);
}