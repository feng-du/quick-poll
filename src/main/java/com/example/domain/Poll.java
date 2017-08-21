package com.example.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name = "QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set<Option> options;

    public Long getId(){return this.id;}
    public void setId(Long id) {this.id = id;}

    public String getQuestion() {return this.question;}
    public void setQuestion(String question){this.question = question;}

    public Set<Option> getOptions(){return this.options;}
    public void setOptions(Set<Option> options){this.options = options;}

    @Override
    public String toString(){
        return getId() + "," + getQuestion() + "," + getOptions();
    }
}
