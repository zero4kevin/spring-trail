package com.zero4kevin.spring.springmvc.service;

import com.zero4kevin.spring.springmvc.domain.Spitter;
import com.zero4kevin.spring.springmvc.domain.Spittle;

import java.util.List;

/**
 * Created by kevin on 12/24/17.
 */
public interface SpitterService {
    List<Spittle> getRecentSpittles(int count);
    void saveSpittle(Spittle spittle);

    void saveSpitter(Spitter spitter);
    Spitter getSpitter(long id);
    void startFollowing(Spitter follower, Spitter followee);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);
    List<Spittle> getSpittlesForSpitter(String username);
    Spitter getSpitter(String username);

    Spittle getSpittleById(long id);
    void deleteSpittle(long id);

    List<Spitter> getAllSpitters();
}
