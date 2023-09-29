package jm.task.core.jdbc.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;
}
