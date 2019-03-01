/*
 * Written by Jamie Dalley
 * 
 * Actions required marked by *** 
 */

package Admin;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import RepresentationClasses.User;

@RestController
public class UserController {
	
	private final AtomicLong counter = new AtomicLong();
	
	/**
	 * Returns all users from the database which match any parameters and search restrictions
	 * provided.
	 * <p>
	 * If a search string is provided any records which meet the other restrictions
	 * and contain this string in the firstName, lastName, middleName or email fields will be
	 * returned.
	 * 
	 * @param searchString		Optional. Contains a string to search the table for.
	 * @param orderBy			Optional. Default "email". Contains the column name for the results
	 * 							to be ordered by.
	 * @param orderType			Optional. Default "desc". Contains the direction the results should
	 * 							be ordered in.
	 * @param resultsPerPage	Optional. Default 100. Contains the number of records to be
	 * 							returned at one time (re-write once clear on how this works ***)
	 * @param joinedLow			Optional. Contains a minimum joining date for records retrieved.
	 * @param joinedHigh		Optional. Contains a maximum joining date for records retrieved.
	 * @param flagsLow			Optional. Contains a minimum flag count for records retrieved.
	 * @param flagsHigh			Optional. Contains a maximum flag count for records retrieved.
	 * @param workoutsLow		Optional. Contains a minimum created workouts for records
	 * 							retrieved.
	 * @param workoutsHigh		Optional. Contains a maximum created workouts for records
	 * 							retrieved.
	 * @param exercisesLow		Optional. Contains a minimum created exercises for records
	 * 							retrieved.
	 * @param exercisesHigh		Optional. Contains a maximum created exercises for records
	 * 							retrieved.
	 * 
	 **/
	@RequestMapping("/users")
	public User users(@RequestParam(value="name", defaultValue="") String name) {
		return new User(String.valueOf(counter.incrementAndGet()), "temp@temp.co.uk", name,
				"temp last name", "temp middle name", 'n', new Date(), new Date(),
				"temp edited by");
	}
	
	@RequestMapping("/user/{id}")
	public User userById(@PathVariable String id) {
		return new User(String.valueOf(counter.incrementAndGet()), "temp@temp.co.uk", "temp name",
				"temp last name", "temp middle name", 'n', new Date(), new Date(),
				"temp edited by");
	}

}
