package com.example.billingsystem.repository;

import com.example.billingsystem.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

    //Repo layer fetches data from repository
    public List<OrderDetails> findByNameOrCompanyNameOrReferenceNumberOrType
    (String name, String companyName, String referenceNumber, String type);
}
