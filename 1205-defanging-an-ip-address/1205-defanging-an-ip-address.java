class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder result = new StringBuilder();
        for(int i =0;i<n;i++){
            if(address.charAt(i) == '.'){
                result.append("[.]");
            } else{
                result.append(address.charAt(i));
            }
        }
        return result.toString();
        //return address.replace(".", "[.]");
    }
}