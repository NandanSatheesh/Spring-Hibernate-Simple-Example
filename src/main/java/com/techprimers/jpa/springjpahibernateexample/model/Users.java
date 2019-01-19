package com.techprimers.jpa.springjpahibernateexample.model;


import javax.persistence.*;

@Entity
@Table(name = "users" , catalog = "test")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    @Column(name = "name")
    private String name ;

    @Column(name = "salary")
    private String salary ;

    @Column(name = "team_name")
    private String teamName ;


    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }



}
