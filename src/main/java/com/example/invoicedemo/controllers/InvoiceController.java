package com.example.invoicedemo.controllers;

import com.example.invoicedemo.entities.Invoice;
import com.example.invoicedemo.entities.InvoiceItem;
import com.example.invoicedemo.entities.Product;
import com.example.invoicedemo.repositories.InvoiceItemRepo;
import com.example.invoicedemo.repositories.InvoiceRepo;
import com.example.invoicedemo.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/invoice")
public class InvoiceController {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    InvoiceRepo invoiceRepo;
    @Autowired
    InvoiceItemRepo invoiceItemRepo;
    @GetMapping(value = "/test")
    String test(){
        Product product1 = new Product();
        product1.setName("mobile");
        productRepo.save(product1);

        Product product2 = new Product();
        product2.setName("car");
        productRepo.save(product2);

        InvoiceItem invoiceItem1 = new InvoiceItem();
        invoiceItem1.setProduct(product1);
        invoiceItem1.setQuantity(10);


        InvoiceItem invoiceItem2 = new InvoiceItem();
        invoiceItem2.setProduct(product2);
        invoiceItem2.setQuantity(14);



        Invoice invoice = new Invoice();
        invoice.setName("My invoice");

        /*invoice.getInvoiceItems().add(invoiceItem1);
        invoice.getInvoiceItems().add(invoiceItem2);*/

        invoiceItem1.setInvoice(invoice);
        invoiceItem2.setInvoice(invoice);
        invoiceItemRepo.save(invoiceItem1);
        invoiceItemRepo.save(invoiceItem2);

        invoiceRepo.save(invoice);

        System.out.println(invoice.getId());


        return "Hello";
    }

    @GetMapping(value = "/hey")
    List<Invoice> hey(){
        List<Invoice> invoices = invoiceRepo.findAll();
        return invoices;
    }
}
