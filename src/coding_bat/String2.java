package coding_bat;

public class String2 {
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }
    public int countHi(String str) {
        int count = 0;
        for( int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for(int i = 0; i <  str.length()-2; i++){
            String sub = str.substring(i, i + 3);
            if(sub.equals("cat")){
                catCount++;
            } else if(sub.equals("dog")){
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length()-4; i++){
            if(str.charAt(i)=='c'&&
                    str.charAt(i+1)=='o'&&
                    str.charAt(i+3)=='e'){
                count++;
            }
        }
        return count;
    }
    public boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++){
            if(str.substring(i, i + 3).equals("xyz")){
                if(i == 0 || str.charAt(i - 1) != '.'){
                    return true;

                }
            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        for(int i = 0;i<= str.length()-3;i++){
            if(str.charAt(i)=='b'&& str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }
    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        if(lastX == -1)return true;
        return lastY > lastX;
    }
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(a.length(),b.length());
        for (int i = 0; i< maxLen; i++){
            if(i < a.length()){
                result.append(a.charAt(i));
            }
            if(i<b.length()){
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }
    public String repeatEnd(String str, int n) {
        String lastN = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            result.append(lastN);
        }
        return result.toString();
    }
    public String repeatFront(String str, int n) {
        String result = "";
        for(int i = n; i > 0; i--){
            result += str.substring(0, i);
        }
        return result;
    }
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        String result = word;
        for (int i = 1; i < count; i++) {
            result += sep + word;
        }
        return result;
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }
    public boolean xyzMiddle(String str) {
        int len = str.length();
        if(len == 3 && str.equals("xyz")){
            return true;
        }
        for(int i = 0;i < len - 3; i++){
            if (str.substring(i, i + 3).equals("xyz")){
                int left = i;
                int right = len - (i + 3);

                if(Math.abs(left - right) <= 1){
                    return true;
                }
            }
        }
        return false;
    }
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }
    public boolean sameStarChar(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                if(i > 0 && i < str.length() - 1 ){
                    if(str.charAt(i -1) != str.charAt(i+1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 3; i += 3) {
            String chunk = str.substring(i, i + 3);
            result += chunk.substring(1) + chunk.charAt(0);
        }
        return result;
    }
    public String zipZap(String str) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }
    public String starOut(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                continue;
            }
            if(i > 0 && str.charAt(i - 1) == '*'){
                continue;
            }
            if(i < str.length() - 1 && str.charAt(i + 1) == '*'){
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }
    public String plusOut(String str, String word) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length();
            } else {
                result += "+";
                i++;
            }
        }
        return result;
    }
}
