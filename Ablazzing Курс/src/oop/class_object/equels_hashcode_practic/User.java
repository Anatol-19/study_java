package oop.class_object.equels_hashcode_practic;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

        @Override
        public boolean equals (Object o){
    //  Собственная реализация сравнения, отличная от сгенерированной IDE
            if (o == null) {
                return false;
            }
            if (o instanceof User anotherUser) {
                return this.login.equals(anotherUser.login) && this.password.equals(anotherUser.password);
            }
            return false;
        }

        @Override
        public int hashCode () {
            return this.login.hashCode();
        }
}
