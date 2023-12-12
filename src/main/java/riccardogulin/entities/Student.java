package riccardogulin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // <-- Mi indica che questa classe dovrà essere mappata ad una tabella del db
@Table(name = "students") // <-- Consente di specificare il nome della tabella (Non è obbligatorio)
public class Student {
	@Id // <-- Indica che sarà chiave primaria (obbligatorio)
	private long id;

	@Column(name = "nome") // <-- Consente di personalizzare il nome della colonna (Non è obbligatorio)
	private String name;
	@Column(name = "cognome")
	private String surname;
	@Column(name = "tipo")
	private StudentType studentType;

	public Student(String name, String surname, StudentType studentType) {
		this.name = name;
		this.surname = surname;
		this.studentType = studentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public StudentType getStudentType() {
		return studentType;
	}

	public void setStudentType(StudentType studentType) {
		this.studentType = studentType;
	}
}
