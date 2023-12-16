package X;

import java.util.Arrays;

/* renamed from: X.7W7  reason: invalid class name */
public final class AnonymousClass7W7 {
    public AnonymousClass7J4 A00;
    public final AnonymousClass7J4 A01;
    public final String A02;

    public final void A00(Object obj, String str) {
        AnonymousClass7J4 r1 = new AnonymousClass7J4();
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        r1.A02 = str;
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(32);
        A0Y.append(this.A02);
        A0Y.append('{');
        String str = "";
        for (AnonymousClass7J4 r3 = this.A01.A00; r3 != null; r3 = r3.A00) {
            Object obj = r3.A01;
            A0Y.append(str);
            String str2 = r3.A02;
            if (str2 != null) {
                A0Y.append(str2);
                A0Y.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0Y.append(obj);
            } else {
                String deepToString = Arrays.deepToString(AnonymousClass6C9.A1Z(obj, 1));
                A0Y.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return AnonymousClass000.A0d(A0Y);
    }

    public AnonymousClass7W7(String str) {
        AnonymousClass7J4 r0 = new AnonymousClass7J4();
        this.A01 = r0;
        this.A00 = r0;
        str.getClass();
        this.A02 = str;
    }
}
