package za.co.swagshop.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends AbstractBaseEntity {

    @Column(name = "name")
    private String name;
}
