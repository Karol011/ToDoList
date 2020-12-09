package io.github.mat3e;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class LangRepository {

    private List<Lang> languages;

    public LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1L, "Hello", "en"));
        languages.add(new Lang(2L, "Siema", "pl"));
    }

    Optional<Lang> findById(Long id) {
        return languages.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }
}
