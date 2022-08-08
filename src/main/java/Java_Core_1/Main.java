package Java_Core_1;

public class Main {
        public static void main(String[] args) {
            Team[] dreamTeam = new Team[4];
            dreamTeam[0] = new Team("Maks", 24, 300);
            dreamTeam[1] = new Team("Olaf", 27, 430);
            dreamTeam[2] = new Team("Ken", 19, 210);
            dreamTeam[3] = new Team("Bruno", 25, 500);
            int sprint;
            sprint = 300;
            for (int i = 0; i < dreamTeam.length; i++) {
                if (dreamTeam[i].getMaxDistance() > sprint) {
                    dreamTeam[i].printTeam();
                }
            }
        }
}

