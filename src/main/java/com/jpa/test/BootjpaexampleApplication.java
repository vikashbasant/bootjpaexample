package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.entites.User;
import com.jpa.test.repo.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// create object of user:
//		User user = new User();
//		user.setName("B");
//		user.setCity("city1");
//		user.setStatus("apple");

		// saving single user:
//		User user1 = userRepository.save(user);
//		System.out.println(user1);

//		User user2 = new User();
//		user2.setName("A");
//		user2.setCity("city2");
//		user2.setStatus("python programmer");

		// saving single user:
//		User user3 = userRepository.save(user2);
//		System.out.println(user3);

		// saving all user:
//		List<User>  userList = Arrays.asList(user, user2);
//		
//		// here we need to save multiple object:
//		Iterable<User> result = userRepository.saveAll(userList);
//		result.forEach(userObj->System.out.println(userObj));

		// update the user of the id=11

//		Optional<User> optional = userRepository.findById(11);
//		
//		User obj = optional.get();
//		System.out.println(obj);
//		obj.setName("kamlesh");
//		User updatedUser = userRepository.save(obj);
//		System.out.println(updatedUser);

		// how to get the data:
		// findById(id)- return optional containing your data
//		Iterable<User> allUser = userRepository.findAll();

		// By using collection framework:
//		allUser.forEach(allObjUser->System.out.println(allObjUser));

		// By using iterator:
//		Iterator<User> iterator = allUser.iterator();
//		while(iterator.hasNext()) {
//			User userObj = iterator.next();
//			System.out.println(userObj);
//		}
		// forEach using Iterable :
//		allUser.forEach(ele->System.out.println(ele));

		// Iterable using anonymous class
//		allUser.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

		// Deleting the user element:

//	delete by id:	
//		userRepository.deleteById(17);

//		delete using iterable:
//		Iterable<User> findAll = userRepository.findAll();
//		findAll.forEach(user->System.out.println(user));
//		userRepository.deleteAll(findAll);

		// custom query in jpa:
//		List<User> findByName = userRepository.findByName("B");
//		findByName.forEach(user -> System.out.println(user));

//		List<User> findDistinctByNameAndCity = userRepository.findDistinctByStatusAndCity("java programmer", "city1");
//		findDistinctByNameAndCity.forEach(user -> System.out.println(user));

//		List<User> findByNameContaining = userRepository.findByNameContaining("Vi");
//		findByNameContaining.forEach(e -> System.out.println(e));

//		List<User> findByNameStartingWith = userRepository.findByNameStartingWith("B");
//		findByNameStartingWith.forEach(e -> System.out.println(e));

//		List<User> findByNameEndingWith = userRepository.findByNameEndingWith("sh");
//		findByNameEndingWith.forEach(e -> System.out.println(e));

//		List<User> findByNameLike = userRepository.findByNameLike("%ik%");
//		findByNameLike.forEach(e -> System.out.println(e));

//		List<String> asList = Arrays.asList("Vikash", "A", "B");
//		List<User> findByNameIn = userRepository.findByNameIn(asList);
//		findByNameIn.forEach(e -> System.out.println(e));

//		List<User> findByNameOrderByName = userRepository.findByNameOrderByName("B");
//		findByNameOrderByName.forEach(e -> System.out.println(e));

//		List<User> findByFirstnameIgnoreCase = userRepository.findByNameIgnoreCase("b");
//		findByFirstnameIgnoreCase.forEach(e -> System.out.println(e));

		// ---------------jpql query---------------------------------
//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(e -> System.out.println(e));

//		List<User> userByName = userRepository.getUserByName("B");
//		userByName.forEach(e -> System.out.println(e));

		List<User> userByNameAndCity = userRepository.getUserByNameAndCity("A", "city2");
		userByNameAndCity.forEach(e -> System.out.println(e));

		// ----------------------------Native query(Sql query)-------------------
//		userRepository.getUsers().forEach(e -> System.out.println(e));
	}

}
