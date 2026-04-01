public class OOPSBannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        String[] patternO = {
            " ***",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***"
        };

        String[] patternP = {
            "**** ",
            "* *",
            "* *",
            "**** ",
            "* ",
            "* ",
            "* "
        };

        String[] patternS = {
            " ****",
            "* ",
            "* ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        CharacterPattern[] bannerCharacters = {
            new CharacterPattern('O', patternO),
            new CharacterPattern('O', patternO),
            new CharacterPattern('P', patternP),
            new CharacterPattern('S', patternS)
        };

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (int j = 0; j < bannerCharacters.length; j++) {
                lineBuilder.append(bannerCharacters[j].getPattern()[i]);
                if (j < bannerCharacters.length - 1) {
                    lineBuilder.append("  ");
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }
}