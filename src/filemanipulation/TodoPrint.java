package filemanipulation;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder sb = new StringBuilder(todoText);
        sb.insert(0, "My todo:\n");
        sb.append(" - Download games\n");
        sb.append("     - Diablo");
        System.out.println(sb.toString());

        // System.out.println(todoText);
    }
}