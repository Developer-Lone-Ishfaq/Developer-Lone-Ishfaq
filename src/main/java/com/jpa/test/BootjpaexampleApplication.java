package com.jpa.test;

import java.awt.desktop.UserSessionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.Dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepositry=context.getBean(UserRepository.class);
		
//		object 1
	
//			User user=new User();
//			user.setName("ishfaq ahmad lone");
//			user.setCity("handwara");
//			user.setStatus("i am java developer");
//			 User repo= userRepositry.save(user);
//			 System.out.println(repo);
//		
		//object 2
		
//		User user2=new User();
//		user2.setName("aamir hussain bhat");
//		user2.setCity("kupwara");
//		user2.setStatus("i am java developer");
//		

////		save multiple objects
		
//		List<User> users=List.of(user,user2);
//		Iterable<User> result = userRepositry.saveAll(users);
//		result.forEach(User->{
//		System.out.println(User);
//		});
//		
		
//		
//		update the value in database
		
//		Optional<User>optional=userRepositry.findById(1);
//		User user=optional.get();
//		user.setName("ab hamid lone");
//		user.setStatus("i am c programmer");
//		User result=userRepositry.save(user);
//		System.out.println(result);
		
//		find all objects
//		
		Iterable<User> itr=userRepositry.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
		
//		simple way to find all objects
//		user-> is a lamda functions
//		itr.forEach(user->System.out.println(user));
		
		
//		delete object

//		userRepositry.deleteById(1);
//		System.out.println("object deleted");
		userRepositry.deleteAll();
		System.out.println("objects deleted");
	}

}
