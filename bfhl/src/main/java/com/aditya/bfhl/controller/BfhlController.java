package com.aditya.bfhl.controller;

import com.aditya.bfhl.dto.RequestDto;
import com.aditya.bfhl.dto.ResponseDto;
import com.aditya.bfhl.service.BfhlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    private final BfhlService bfhlService;

    public BfhlController(BfhlService bfhlService) {
        this.bfhlService = bfhlService;
    }

    @PostMapping
    public ResponseEntity<ResponseDto> handlePost(@RequestBody RequestDto request) {
        return ResponseEntity.ok(bfhlService.processData(request.getData()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> handleError() {
        ResponseDto err = new ResponseDto();
        err.setSuccess(false);
        return ResponseEntity.internalServerError().body(err);
    }
}