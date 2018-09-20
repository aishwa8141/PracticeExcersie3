public class RemoveVowels {


        public static void main(String[] args) {
            String countries[] = {"india", "germany", "france", "finland"};
            String[] vowels;
            vowels = new String[]{"a", "e", "i", "o", "u"};

            for (int a = 0; a < countries.length; a++)
            {
                String country = countries[a];

                for (int i = 0; i < vowels.length; i++)
                {
                    country = country.replace(vowels[i], "");
                }

                System.out.println("  Place Name without Vowels:  "+country);
            }

        }


    }

