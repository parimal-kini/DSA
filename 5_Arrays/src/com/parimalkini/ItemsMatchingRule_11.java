//        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],
//        ["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

package com.parimalkini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ItemsMatchingRule_11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the list items, Enter \"0\" to exit");
        while (sc.hasNext()){
            list.add(sc.next());
            if(sc.hasNext("0"))
                break;
        }

        System.out.println("Enter ruleKey : ");
        String ruleKey = sc.next();
        System.out.println("Enter ruleValue : ");
        String ruleValue = sc.next();

        System.out.println(countMatches(Collections.singletonList(list), ruleKey, ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        // loop through the items
        for(List<String> list : items) {
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) count++;
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) count++;
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) count++;
        }
        return count;
    }
}
