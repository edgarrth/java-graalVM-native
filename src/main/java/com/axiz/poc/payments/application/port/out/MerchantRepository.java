package com.axiz.poc.payments.application.port.out;

import com.axiz.poc.payments.domain.model.Merchant;
import java.util.Optional;

public interface MerchantRepository { Optional<Merchant> findById(String merchantId); }
