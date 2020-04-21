package com.pfa.amicali.Service.Subscriber;

import com.pfa.amicali.Entity.Subscriber;
import com.pfa.amicali.Repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriberServiceImpl implements SubscriberService {


    @Autowired
    private SubscriberRepository subscriberRepository;


    @Override
    public void create(Subscriber subscriber) {
        subscriberRepository.save(subscriber);

    }

    @Override
    public void update(Subscriber subscriber) {
        subscriberRepository.save(subscriber);

    }

    @Override
    public void delete(Subscriber subscriber) {
        subscriberRepository.delete(subscriber);
    }

    @Override
    public void delete(Long id) {
        subscriberRepository.deleteById(id);

    }

    @Override
    public Optional<Subscriber> read(Long id) {
        return subscriberRepository.findById(id);
    }

    @Override
    public List<Subscriber> read() {
        return subscriberRepository.findAll();
    }
}
