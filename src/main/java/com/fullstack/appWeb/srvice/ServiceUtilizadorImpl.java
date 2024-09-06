package com.fullstack.appWeb.srvice;

import com.fullstack.appWeb.domain.Utilizador;
import org.hibernate.query.UnknownNamedQueryException;
import org.springframework.stereotype.Service;

@Service
public class ServiceUtilizadorImpl  implements  IserviceUtilizador{
    @Override
    public void inserirUtilizador(Utilizador utilizador) {
        Utilizador.builder()

                .nome("30")
                .email("valter.bjeronimo1911@gmail.com")
                .endereço("Rua da Caldeiroa , 98 2E Guimaraes ");







    }
}
