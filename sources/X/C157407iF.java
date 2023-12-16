package X;

import android.icu.text.UnicodeSet;
import android.os.Build;

/* renamed from: X.7iF  reason: invalid class name and case insensitive filesystem */
public class C157407iF {
    public static final C157407iF A02 = new C157407iF("");
    public static final boolean A03 = C18280x3.A1U(Build.VERSION.SDK_INT, 24);
    public final UnicodeSet A00;
    public final String A01;

    public boolean A00(int i) {
        String str;
        int type;
        UnicodeSet unicodeSet;
        if (A03 && (unicodeSet = this.A00) != null) {
            return unicodeSet.contains(i);
        }
        String str2 = this.A01;
        int hashCode = str2.hashCode();
        if (hashCode == -1633268329) {
            str = "[:^S:]";
        } else if (hashCode != -1605334735) {
            if (hashCode == 0 || hashCode != 888719627) {
                return false;
            }
            str = "[[:^S:]&[:^Z:]]";
        } else if (str2.equals("[:digit:]")) {
            return Character.isDigit(i);
        } else {
            return false;
        }
        if (!str2.equals(str) || (type = Character.getType(i)) == 26 || type == 25 || type == 27 || type == 28) {
            return false;
        }
        return true;
    }

    public C157407iF(String str) {
        UnicodeSet unicodeSet;
        this.A01 = str;
        if (!A03) {
            unicodeSet = null;
        } else if (str.isEmpty()) {
            unicodeSet = UnicodeSet.EMPTY;
        } else {
            unicodeSet = new UnicodeSet(str);
        }
        this.A00 = unicodeSet;
    }
}
