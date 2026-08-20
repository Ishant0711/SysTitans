package dataStructure.StringQuestions;

public class CapitaliseFirstChar {
    public static String capitaliseFirstChar(String st){
        StringBuilder ss = new StringBuilder();
        String[] str = st.trim().split("\\s+");

//        for(String sp :str){
//            char[] ch  = sp.toCharArray();
//            ch[0] = Character.toUpperCase(ch[0]);
//            //String result = new String(ch);
//            ss.append(ch).append(" ");
//        }

        for(String sp : str){
            if(!sp.isEmpty()){
                ss.append(Character.toUpperCase(sp.charAt(0)))
                        .append(sp.substring(1))
                        .append(" ");
            }
        }
        return ss.toString();
    }
    public static void main(String[] args){
        String s = "pankhudi is my sukoon";
        System.out.println(capitaliseFirstChar(s));
    }
}
