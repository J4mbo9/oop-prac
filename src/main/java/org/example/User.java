package org.example;

public class User {

    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){

//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하
         */
        if(password.length()>=8 && password.length()<=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
