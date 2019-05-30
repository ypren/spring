package com.ypren.springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Simple usage of lombok with builder pattern.
 */
@ToString
@EqualsAndHashCode
public class User {
    @Getter
    private final String name;
    @Getter
    private final String number;
    @Getter
    private final Gender gender;

    private User(Builder builder) {
        this.name = builder.name;
        this.number = builder.number;
        this.gender = builder.gender;
    }

    public enum Gender {
        MAN, WOMAN,
    }

    public static class Builder {
        private String name;
        private String number;
        private Gender gender;

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder number(final String number) {
            this.number = number;
            return this;
        }

        public Builder gender(final Gender gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
