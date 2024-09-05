public class MyBiodata {
    public static void main(String[] args) {
        String[][] biodata = {
        {"Raymon Devtant,", "18,", "Dari Situbondo"},
        {"Fikar Bahrul Santoso,", "18,", "Dari Pandaan"}
    };
        for (int i = 0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
            System.out.println(biodata[i][j]+" ");
            }
        }
    }
}