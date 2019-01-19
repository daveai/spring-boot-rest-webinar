package com.example.invoicedemo.repositories;

import com.example.invoicedemo.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {
}
