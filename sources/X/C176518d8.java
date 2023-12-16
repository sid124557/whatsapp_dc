package X;

/* renamed from: X.8d8  reason: invalid class name and case insensitive filesystem */
public class C176518d8 extends AnonymousClass8Q0 {
    public final C176608dH[] A00;

    public static C176608dH[] A0A(Object obj) {
        C176518d8 r3;
        if (obj instanceof C176518d8) {
            r3 = (C176518d8) obj;
        } else if (obj != null) {
            r3 = new C176518d8(C176958dq.A0C(obj));
        } else {
            r3 = null;
        }
        C176608dH[] r32 = r3.A00;
        int length = r32.length;
        C176608dH[] r1 = new C176608dH[length];
        System.arraycopy(r32, 0, r1, 0, length);
        return r1;
    }

    public C176518d8(C176958dq r4) {
        this.A00 = new C176608dH[r4.A0U()];
        for (int i = 0; i != r4.A0U(); i++) {
            this.A00[i] = C176608dH.A0A(r4.A0W(i));
        }
    }

    public String toString() {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        String str = C162077rB.A00;
        A0X.append("GeneralNames:");
        A0X.append(str);
        int i = 0;
        while (true) {
            C176608dH[] r1 = this.A00;
            if (i == r1.length) {
                return A0X.toString();
            }
            A0X.append("    ");
            A0X.append(r1[i]);
            A0X.append(str);
            i++;
        }
    }

    public C176518d8(C176608dH r3) {
        this.A00 = new C176608dH[]{r3};
    }
}
