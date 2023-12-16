package X;

import java.util.HashMap;

/* renamed from: X.7YY  reason: invalid class name */
public class AnonymousClass7YY {
    public final int A00;
    public final int A01;
    public final C142616xU A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass7YY r5 = (AnonymousClass7YY) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass000.A1N(objArr, this.A00);
        objArr[3] = false;
        return C18310x6.A08(false, objArr, 4);
    }

    public AnonymousClass7YY(C142616xU r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("codec", this.A02);
        A0t.put("profile", Integer.valueOf(this.A01));
        A0t.put("level", Integer.valueOf(this.A00));
        A0t.put("useBframe", false);
        return C159297la.A01(AnonymousClass7YY.class, A0t);
    }
}
