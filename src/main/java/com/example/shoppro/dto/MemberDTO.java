package com.example.shoppro.dto;

import com.example.shoppro.constant.Role;
import com.example.shoppro.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private String address;

    private Role role;


}
