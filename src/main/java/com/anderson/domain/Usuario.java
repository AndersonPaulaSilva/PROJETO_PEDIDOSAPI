package com.anderson.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anderson on 09/06/2019.
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Getter
    private long id;

    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String senha;
    @Getter
    @Setter
    private List<Pedidos> pedidos = new ArrayList<Pedidos>();
    @Getter
    @Setter
    private List<EstagioPedidos> estagios = new ArrayList<EstagioPedidos>();
}
