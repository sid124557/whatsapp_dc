package X;

import java.util.List;

/* renamed from: X.7TY  reason: invalid class name */
public class AnonymousClass7TY {
    public int A00;
    public C109065e1 A01;
    public String A02;
    public String A03;

    public void A00(List list, int i) {
        String str = null;
        String str2 = null;
        if (i > 0) {
            str2 = ((C109065e1) list.get(i - 1)).A0H;
        }
        this.A03 = str2;
        if (i < AnonymousClass002.A03(list)) {
            str = ((C109065e1) list.get(i + 1)).A0H;
        }
        this.A02 = str;
    }

    public AnonymousClass7TY(C109065e1 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
