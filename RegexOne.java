class RegexOne {
    public static boolean iPCheck(String str){
        String pattern = "([0-9]{1,3}.){3}[0-9]{1,3}";
        if(str.matches(pattern)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        System.out.println(iPCheck("000.12.12.034"));
        System.out.println(iPCheck("121.234.12.12"));
        System.out.println(iPCheck("23.45.12.56"));
        System.out.println(iPCheck("00.12.123.123123.123"));
        System.out.println(iPCheck("122.23"));
        System.out.println(iPCheck("Hello.IP"));
    }
}