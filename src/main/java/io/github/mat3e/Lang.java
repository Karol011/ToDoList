package io.github.mat3e;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Lang {

    private Long id;
    private String welcomeMsg;
    private String code;

    public void setWelcomeMsg(final String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
