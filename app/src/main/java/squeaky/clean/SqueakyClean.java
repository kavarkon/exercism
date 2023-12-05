package squeaky.clean;

public class SqueakyClean {
    public static void main(String[] args) {
        System.out.println(clean("my\0\r\u007FId"));
    }

    static String clean(String identifier) {
        /*return identifier.replaceAll(" ", "_")
                .replaceAll("").chars()
                .mapToObj(ch -> Character.isISOControl(ch) ? "CTRL" : String.valueOf(ch))
                .peek((str1, str2) -> {
                    if (str1.equals("-")) {
                        return str2.toUpperCase();
                    } else if (str2.equals("-")) {

                    }
                    //return str1;
                })
                .filter(str -> str.matches("\\w"))
                .filter(str -> !str.matches("[\\p{Lower}\\p{InGreek}]"))
                .collect(Collectors.joining());*/
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i<identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (Character.isWhitespace(ch)) {
                builder.append("_");
            } else if (Character.isISOControl(ch)) {
                builder.append("CTRL");
            } else if (ch == '-') {
                builder.append(Character.toUpperCase(identifier.charAt(i + 1)));
                i += 1;
            } else if (!Character.isLetter(ch)) {
                continue;
            } else if (String.valueOf(ch).matches("\\p{InGreek}]") && Character.isLowerCase(ch)) {
                continue;
            } else {
                builder.append(ch);
                System.out.println(ch);
            }
        }

        return builder.toString();
    }
        /*return Pattern.compile("(?<=[a-z])-([a-z])").matcher(identifier).replaceAll(matchResult -> matchResult.group(1).toUpperCase())
                .replaceAll(" ", "_")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("^\\p{Alpha}", "")
                .replaceAll("[\\p{Lower}\\p{InGreek}]", "");*/

}