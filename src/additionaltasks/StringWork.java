package additionaltasks;

public class StringWork {
    public static void main(String[] args) {
        String string = "Lukáš";

        functionA(string);
        System.out.println();

        StringWork newString = new StringWork();
        newString.functionB(string);
        System.out.println();

        System.out.println(functionC(string));
        System.out.println();

        System.out.println(functionD(new String[] {string, "Ales", "David"}));
    }

    public static void functionA(String string) {
        StringBuilder sb = new StringBuilder("GFA");
        sb.append("\n").append(string).append("\n").append("Ales").append("\n").append("Lukas K.");
        string = sb.toString();
        System.out.println(string);
    }

    public void functionB(String string) {
        String ales = "Ales";
        String lukasK = "Lukas K.";
        string = "GFA" + "\n" + string + "\n" + ales + "\n" + lukasK;
        System.out.println(string);
    }

    public static String functionC(String string) {
        String gfa = "GFA:";
        String ales = "Ales";
        String lukasK = "Lukas K.";
        return gfa + "\n" + string + "\n" + ales + "\n" + lukasK;
    }


    private static String functionD(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder("GFA:" + "\n");
        String dash = "-";
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(i + 1).append(".").append(dash).append(strings[i]).append("\n");
            dash += "-";
        }
        return stringBuilder.toString();
    }
}
