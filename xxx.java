package pl.waw.sgh;

import java.util.regex.Pattern;

public class xxx {

        public static boolean isValid(String email)
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pat.matcher(email).matches();
        }

        /* driver function to check */
        public static void main(String[] args)
        {
            String email = "walczoczka2@gmail.com";
            if (isValid(email))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }