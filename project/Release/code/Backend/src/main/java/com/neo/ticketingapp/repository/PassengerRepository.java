package com.neo.ticketingapp.repository;

import com.neo.ticketingapp.enums.PassengerType;
import com.neo.ticketingapp.model.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PassengerRepository extends MongoRepository<Passenger,String> {
    List<Passenger> findByCardNo(String cardNo);
    List<Passenger> findByType(PassengerType type);
}
