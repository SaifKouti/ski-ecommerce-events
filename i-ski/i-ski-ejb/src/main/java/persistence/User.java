package persistence;

import java.io.Serializable;
import java.util.Date;
//import java.util.List;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String lastName;
	private String firstName;
	private Date birthDate;
	private String gender;
	private String userType;
	private String email;
	private int number;
	private int cin;
	private String password;
	private String avatar;

	@OneToMany(mappedBy = "user")
	private List<EventReservation> eventReservation;
	@ManyToMany(mappedBy = "likerUsers")
	private List<UserExperience> experiencesLiked;

	@ManyToMany(mappedBy = "disLikerUsers")
	private List<UserExperience> experiencesDisLiked;



	@OneToMany(mappedBy = "user")
	private List<Event> evens;

	@OneToMany(mappedBy = "user")
	private List<SkiTrip> skiTrips;

	@OneToMany
	private List<Company> companies;

	@OneToMany(mappedBy = "user")
	private List<Transport> transports;

	@OneToMany(mappedBy = "user")
	private List<Reservation> reservations;

	@ManyToOne
	private Transport transport;


	@OneToMany(mappedBy = "user")
	private List<Feedback> feedback;

	@OneToMany(mappedBy = "user")
	private List<UserExperience> userExperiences;

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(String lastName) {
		super();
		this.lastName = lastName;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public List<Event> getEvens() {
		return evens;
	}

	public void setEvens(List<Event> evens) {
		this.evens = evens;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User(int idUser) {
		super();
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<Transport> getTransports() {
		return transports;
	}

	public void setTransports(List<Transport> transports) {
		this.transports = transports;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}

	public List<SkiTrip> getSkiTrips() {
		return skiTrips;
	}

	public void setSkiTrips(List<SkiTrip> skiTrips) {
		this.skiTrips = skiTrips;
	}

	public List<UserExperience> getUserExperiences() {
		return userExperiences;
	}

	public void setUserExperiences(List<UserExperience> userExperiences) {
		this.userExperiences = userExperiences;
	}

	public List<UserExperience> getExperiencesLiked() {
		return experiencesLiked;
	}

	public void setExperiencesLiked(List<UserExperience> experiencesLiked) {
		this.experiencesLiked = experiencesLiked;
	}

	public List<UserExperience> getExperiencesDisLiked() {
		return experiencesDisLiked;
	}

	public void setExperiencesDisLiked(List<UserExperience> experiencesDisLiked) {
		this.experiencesDisLiked = experiencesDisLiked;
	}

}