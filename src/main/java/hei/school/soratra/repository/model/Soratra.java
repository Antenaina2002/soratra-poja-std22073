package hei.school.soratra.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "soratra")
@Entity
public class Soratra {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "original_url")
    private String originalUrl;

    @Column(name = "transformed_url")
    private String transformedUrl;
}
