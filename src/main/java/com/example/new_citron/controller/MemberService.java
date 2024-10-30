package com.example.new_citron.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @GetMapping("/members")
    @Operation(summary = "회원 조회", description = "모든 회원 목록을 반환합니다.")
    public void get() {

    }

    @PostMapping ("/members")
    @Operation(summary = "회원등록 ", description = "회원 등록 ")
    public void register() {

    }

    @DeleteMapping("/members")
    @Operation(summary = "회원삭제", description = "회원 삭제 ")
    public void deleteMem() {

    }
}
