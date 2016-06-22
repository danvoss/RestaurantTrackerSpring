package com.dvoss;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 6/21/16.
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
    public Iterable<Restaurant> findByRating(int rating);
    public Iterable<Restaurant> findByLocation(String location);
    public Iterable<Restaurant> findByRatingAndLocation(int rating, String location);
    public Iterable<Restaurant> findByRatingGreaterThanEqual(int rating);

    public int countByLocation(String location);

    public Iterable<Restaurant> findByOrderByRatingDesc(); // no args bc ordering, not filtering

    public Iterable<Restaurant> findByUser(User user);

    @Query("SELECT r FROM Restaurant r WHERE r.location LIKE ?1%") // must use alias ("r") & table name must be class name
    public Iterable<Restaurant> searchLocation(String location);
}
