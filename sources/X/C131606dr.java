package X;

import java.util.List;

/* renamed from: X.6dr  reason: invalid class name and case insensitive filesystem */
public class C131606dr extends C153617bf {
    public List A00;
    public final String A01;
    public final String A02;

    public C131606dr(String str, List list) {
        String str2;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        if (list == null || list.size() <= 0) {
            str2 = "()";
        } else {
            str2 = "(...)";
        }
        this.A02 = AnonymousClass000.A0X(str2, A0l);
        if (str != null) {
            this.A01 = str;
            this.A00 = list;
            return;
        }
        this.A00 = null;
    }
}
