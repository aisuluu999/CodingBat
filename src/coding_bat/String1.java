package coding_bat;

public class String1 {
    public String helloName(String name) {
        return "Hello " + name + '!';
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring((1));
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        int len = str.length();
        return str.substring(len - 2) + str.substring(0, len - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int mid = str.length() / 2; //середина строки
        return str.substring(mid - 1, mid + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
