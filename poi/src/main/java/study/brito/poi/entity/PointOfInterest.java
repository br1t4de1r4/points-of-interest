package study.brito.poi.entity;

import jakarta.persistence.*;

@Entity
@Table(name =  "tb_points_of_interest")
public class PointOfInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private long x;

    private long y;

    public PointOfInterest() {
    }

    public PointOfInterest(String nome, long x, long y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
