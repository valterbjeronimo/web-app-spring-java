package com.fullstack.appWeb.domain;





import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Utilizador {


    private  String nome;
    private String email;
    private String endereço ;
}


