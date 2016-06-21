package com.dvoss;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 6/21/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByName(String username); // <= special grammar for Hibernate to execute
}
