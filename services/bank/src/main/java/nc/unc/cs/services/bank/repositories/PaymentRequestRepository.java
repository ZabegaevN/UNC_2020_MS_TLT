package nc.unc.cs.services.bank.repositories;

import nc.unc.cs.services.bank.entities.PaymentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRequestRepository extends JpaRepository<PaymentRequest, Long> {
}