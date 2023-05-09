package filemanipulation;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
//    We are going to represent our contacts in a map where both the keys and values are strings.
//
//    Create a map with the following key-value pairs:
//
//    Name (key)	Phone number (value)
//    William A. Lathan	405-709-1865
//    John K. Miller	402-247-8568
//    Hortensia E. Foster	606-481-6467
//    Amanda D. Newland	319-243-5613
//    Brooke P. Askew	307-687-2982
//    Create an application which prints out the answers to the following questions:
//
//    What is John K. Miller's phone number?
//    Whose phone number is 307-687-2982?
//    Do we know Chris E. Myers' phone number? (yes/no)

//    The full output of your main method should be the following:
//
//    402-247-8568
//    Brooke P. Askew
//    no

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("William A. Lathan", "405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        contacts.put("Brooke P. Askew", "307-687-2982");

        answer(contacts);
    }

    public static void answer(HashMap contacts) {
        //    What is John K. Miller's phone number?
        System.out.println(contacts.get("John K. Miller"));
        //    Whose phone number is 307-687-2982?
        for(Object key: contacts.keySet()) {
            if(contacts.get(key).equals("307-687-2982")) {
                System.out.println(key);
            }
        }
        //    Do we know Chris E. Myers' phone number? (yes/no)
        System.out.println(contacts.containsKey("Chris E. Myers'") ? "yes" : "no");
    }
}
