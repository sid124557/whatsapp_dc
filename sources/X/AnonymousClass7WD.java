package X;

import java.util.Arrays;

/* renamed from: X.7WD  reason: invalid class name */
public final class AnonymousClass7WD {
    public C156357gU A00;
    public final C156357gU A01;
    public final String A02;

    public final void A00(Object obj, String str) {
        C156357gU r1 = new C156357gU((AnonymousClass70K) null);
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        r1.A02 = str;
    }

    public final String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(32);
        A0Y.append(this.A02);
        A0Y.append('{');
        C156357gU r3 = this.A01.A00;
        String str = "";
        while (r3 != null) {
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
            r3 = r3.A00;
            str = ", ";
        }
        return AnonymousClass000.A0d(A0Y);
    }

    public /* synthetic */ AnonymousClass7WD(String str) {
        C156357gU r0 = new C156357gU((AnonymousClass70K) null);
        this.A01 = r0;
        this.A00 = r0;
        str.getClass();
        this.A02 = str;
    }
}
