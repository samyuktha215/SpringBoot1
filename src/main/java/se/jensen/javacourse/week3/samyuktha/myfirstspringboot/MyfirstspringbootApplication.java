package se.jensen.javacourse.week3.samyuktha.myfirstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringbootApplication.class, args);
	}
  @GetMapping("/author/name")
	public String getAuthorname() {
	  return "Samyuktha";
  }

  @GetMapping("/square-number/{id}")
  public int getSquarenumber(@PathVariable("id") int id)
  {
	  try {

		  int i = Integer.parseInt("id");


	  } catch (Exception e) {
		  System.out.println("Given string instead of number");

	  }
	  return id*id;
  }

	  @GetMapping("/author")
	public Person getperson(){
		return new Person("Samyuktha","Basam",30);
	}

	public static class Person {
		private String firstname;
		private String lastname;
		private int age;

		public Person(String firstname, String lastname, int age) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
}

