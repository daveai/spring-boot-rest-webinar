package com.example.invoicedemo.repositories;

import com.example.invoicedemo.entities.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepo extends JpaRepository<InvoiceItem, Long> {
}
