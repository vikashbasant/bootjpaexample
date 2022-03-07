package com.jpa.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entites.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameContaining(String name);

	public List<User> findByNameEndingWith(String string);

	public List<User> findByNameIgnoreCase(String string);

	public List<User> findByNameIn(List<String> asList);

	public List<User> findByNameLike(String string);

	public List<User> findByNameOrderByName(String string);

	public List<User> findByNameStartingWith(String string);

	public List<User> findDistinctByStatusAndCity(String status, String city);

	// ------------------------JPQL Query------------------------------------------
	@Query("select u from User u")
	public List<User> getAllUser();

	@Query("select u from User u Where u.name =:n")
	public List<User> getUserByName(@Param("n") String name);

	@Query("select u from User u Where u.name =:n And u.city =:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

	// -------------------Native Query----------------------------------
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUsers();
}
