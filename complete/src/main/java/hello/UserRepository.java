package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * find users by name
	 * 
	 * @param name
	 * @return
	 */
	public List<User> findByName(String name);

}
