// In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.
// In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.
// In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.

//i)replace any spaces with underscores. This also applies to leading and trailing spaces.
//ii)convert kebab-case to camelCase.
//     SqueakyClean.clean("a-bc");
//     => "aBc"
// iii)convert leetspeak to normal text. For simplicity we will only be using 4, 3, 0, 1 and 7 from the table.
//       SqueakyClean.clean("H3ll0 W0rld");
//       => "Hello_World"
//iv) omit any characters that are not letters.
// SqueakyClean.clean("a$#.b");
// => "ab"


public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<identifier.length(); i++){
            if(identifier.charAt(i)==' '){
                result.append("_");
            }
            else if(identifier.charAt(i)=='-'){
                i++;
                result.append(Character.toUpperCase(identifier.charAt(i)));
            }
            else if(Character.isDigit(identifier.charAt(i))){
                switch(identifier.charAt(i)){
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                }
            }
            else if(Character.isLetter(identifier.charAt(i))){
                result.append(identifier.charAt(i));
            }
        }
        return result.toString();
    }
}
