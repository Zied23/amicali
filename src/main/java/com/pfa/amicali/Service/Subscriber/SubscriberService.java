package com.pfa.amicali.Service.Subscriber;

import com.pfa.amicali.Entity.Subscriber;

import java.util.List;
import java.util.Optional;

public interface SubscriberService {

    void create(Subscriber subscriber);

    void update(Subscriber subscriber);

    void delete(Subscriber subscriber);

    void delete(Long id);

    Optional<Subscriber> read(Long id);

    List<Subscriber> read();
}
