package br.com.cruzeirodosulvirtual.ecinemaTicket.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ingresso {

    private static final int VALOR_INGRESSO_INT=20;
    private static final int VALOR_INGRESSO_MEI=VALOR_INGRESSO_INT/2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private double valor_ingresso;

    @Column(nullable = false)
    private String tipo_ingresso;

    @Column(nullable = false, length = 300)
    private  int quantidade;

    //if (th:field="*{tipo_ingresso}"==Inteira){
        //valor_ingresso= VALOR_INGRESSO_INT*quantidade;
    //}else {
        //valor_ingresso= VALOR_INGRESSO_MEI*quantidade;
    //}

}
