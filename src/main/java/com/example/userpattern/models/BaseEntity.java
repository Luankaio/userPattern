    package com.example.userpattern.models;


    import lombok.EqualsAndHashCode;
    import lombok.Getter;
    import lombok.Setter;
    import org.hibernate.annotations.UuidGenerator;

    import javax.persistence.Column;
    import javax.persistence.GeneratedValue;
    import javax.persistence.Id;
    import javax.persistence.MappedSuperclass;
    import java.io.Serializable;
    import java.util.UUID;

    @MappedSuperclass
    @Getter
    @Setter
    @EqualsAndHashCode
    public class BaseEntity implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(generator = "UUID")
        @UuidGenerator
        @Column(name = "id", updatable = false, nullable = false)
        private UUID id;

    }
