package com.anderson.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anderson on 09/06/2019.
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedidos {

    @Getter
    private Long id;

    @Getter
    @Setter
    private String subject;
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private Date dataCriacao;
    @Getter
    @Setter
    private StatusPedido statusPedido;
    @Getter
    @Setter
    private Usuario usuario;

    @Getter
    @Setter
    private List<EstagioPedidos> estagio = new ArrayList<EstagioPedidos>();

}
