package br.com.cruzeirodosulvirtual.ecinemaTicket.repositories;

import br.com.cruzeirodosulvirtual.ecinemaTicket.models.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
}
