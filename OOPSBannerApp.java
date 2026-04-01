public class OOPSBannerApp {

    private static final Map<Character, String[]> PATTERN_MAP = new HashMap<>();

    static {
        PATTERN_MAP.put('O', new String[]{
            " ***",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***"
        });

        PATTERN_MAP.put('P', new String[]{
            "**** ",
            "* *",
            "* *",
            "**** ",
            "* ",
            "* ",
            "* "
        });

        PATTERN_MAP.put('S', new String[]{
            " ****",
            "* ",
            "* ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });
    }

    public static void renderBanner(String word) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                String[] pattern = PATTERN_MAP.get(c);
                
                if (pattern != null) {
                    lineBuilder.append(pattern[i]);
                } else {
                    lineBuilder.append("     "); 
                }
                
                if (j < word.length() - 1) {
                    lineBuilder.append("  ");
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}