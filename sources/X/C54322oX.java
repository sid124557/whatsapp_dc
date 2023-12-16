package X;

import android.util.Pair;

/* renamed from: X.2oX  reason: invalid class name and case insensitive filesystem */
public final class C54322oX {
    public final AnonymousClass4FV A00;

    public C54322oX(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A03(String str, String str2, String str3, int i) {
        C162457s7.A0J(str, 1);
        C25441aW r1 = new C25441aW();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = str;
        if (str2 != null) {
            r1.A05 = str2;
        }
        if (str3 != null) {
            r1.A03 = str3;
        }
        this.A00.BhA(r1);
    }

    public final void A01(int i, String str) {
        C24431Xj r1 = new C24431Xj();
        r1.A00 = Integer.valueOf(i);
        if (str != null) {
            r1.A01 = str;
        }
        this.A00.BhA(r1);
    }

    public final void A02(String str, int i) {
        C25441aW r1 = new C25441aW();
        r1.A01 = Integer.valueOf(i);
        r1.A05 = str;
        this.A00.BhA(r1);
    }

    public final Pair A00() {
        String A0Y = C18280x3.A0Y();
        C162457s7.A0D(A0Y);
        C24201Wm r1 = new C24201Wm();
        r1.A00 = A0Y;
        this.A00.BhD(r1);
        return AnonymousClass0x9.A0C("anid", A0Y);
    }
}
