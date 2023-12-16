package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7X5  reason: invalid class name */
public class AnonymousClass7X5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final Map A04;
    public final C142706xd A05;
    public final C142416xA A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7X5)) {
            return false;
        }
        AnonymousClass7X5 r4 = (AnonymousClass7X5) obj;
        if (this.A02.equals(r4.A02) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A05.equals(r4.A05) && this.A06.equals(r4.A06) && this.A04.equals(r4.A04)) {
            List list = this.A03;
            List list2 = r4.A03;
            if (list == null) {
                if (list2 == null) {
                    return true;
                }
            } else if (list.equals(list2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A01;
        objArr[2] = this.A00;
        objArr[3] = this.A05;
        objArr[4] = this.A04;
        return C18310x6.A08(this.A03, objArr, 5);
    }

    public AnonymousClass7X5(String str, String str2, String str3, List list, Map map, C142706xd r6, C142416xA r7) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = map;
        this.A03 = list;
    }
}
