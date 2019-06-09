package com.anderson.domain;

import lombok.*;

import java.util.Date;

/**
 * Created by Anderson on 09/06/2019.
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EstagioPedidos {

    @Getter
    private Long id;
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private Date dataRealizacao;

    @Getter
    @Setter
    private StatusPedido status;
    @Getter
    @Setter
    private Pedidos pedio;
    @Getter
    @Setter
    private Usuario usuario;
}
