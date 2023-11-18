import java.util.*;

public class PhoneBook {
    HashMap<String, ArrayList<String>> phoneNum = new HashMap<>();

    public void addPhone(String name, String number) {
        if (phoneNum.containsKey(name)) {
            ArrayList<String> numbers = phoneNum.get(name);
            numbers.add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneNum.put(name, numbers);
        }
    }

    public void printPhone() {
        List<Map.Entry<String, ArrayList<String>>> sortedPhones = new ArrayList<Map.Entry<String, ArrayList<String>>>(phoneNum.entrySet());
        Collections.sort(sortedPhones, new Comparator<Map.Entry<String, ArrayList<String>>>() {
            public int compare(Map.Entry<String, ArrayList<String>> entry1, Map.Entry<String, ArrayList<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });

        for (Map.Entry<String, ArrayList<String>> entry : sortedPhones) {
            String name = entry.getKey();
            ArrayList<String> phoneNumbers = entry.getValue();
            System.out.println("Имя: " + name + ',' + " Кол-во телефонов: " + phoneNumbers.size());
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
            System.out.println();
        }
    }
}
