package web.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotBlank(message = "Поле Имя не заполнено")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Поле Имя может содержать только буквы")
    private String name;

    @Column(name = "lastName")
    @NotBlank(message = "Поле Фамилия не заполнено")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Поле Фамилия может содержать только буквы")
    private String lastName;

    @Column(name = "age")
    @NotBlank(message = "Поле Возраст не заполнено")
    @Pattern(regexp="[1-9][0-9]*", message = "Поле Возраст должно быть больше ноля и может содержать только цифры")
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
