/*
3/3/2022: 1108. Defanging an IP Address
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
*/
class DefangingIPAddress {
    public String defangIPaddr(String address) {
        String result = "";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                result += "[.]";
            } else {
                result+=address.charAt(i);
            }
        }
        return result;
    }
}
//return address.replace(".","[.]");
