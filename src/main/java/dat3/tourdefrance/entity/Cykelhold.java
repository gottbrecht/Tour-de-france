package dat3.tourdefrance.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cykelhold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique = true)
    String name;
    @OneToMany(mappedBy = "cykelhold")
    public List<Cykelrytter> cykelrytters;

    public Cykelhold(String name) {
        this.name = name;
        this.cykelrytters = new ArrayList<>();
    }

   // public void addCykelrytter(Cykelrytter cykelrytter) {cykelrytter.add(cykelrytter);}



}
