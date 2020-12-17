package io.github.mat3e;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@AllArgsConstructor
@Entity
@Table(name = "LANGUAGES")
class Lang {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String welcomeMsg;
    private String code;

    /**
     * Hibernate (JPA) needs it
     */
    @SuppressWarnings("unused")
    Lang() {
    }

    @SuppressWarnings("unused")
    public void setWelcomeMsg(final String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
