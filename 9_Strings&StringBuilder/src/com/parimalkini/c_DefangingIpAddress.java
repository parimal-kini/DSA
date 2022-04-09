package com.parimalkini;

public class c_DefangingIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.')
                builder.append("[.]");
            else
                builder.append(address.charAt(i));
        }
        return builder.toString();
    }
}
//if(address == null || address.indexOf('.') < 0){
//        return address;
//        }
//        return address.replace(".", "[.]");
