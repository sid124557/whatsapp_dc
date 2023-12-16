package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fJ  reason: invalid class name and case insensitive filesystem */
public final class C48692fJ {
    public boolean A00;
    public final String A01;

    public C48692fJ(String str, boolean z) {
        this.A01 = str;
        Log.log(3, AnonymousClass000.A0b(" initialize to ", AnonymousClass000.A0l(str), z));
        this.A00 = z;
    }

    public void A00(boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1N(A0o, this.A01);
        A0o.append(this.A00);
        Log.log(3, AnonymousClass000.A0b(" change to ", A0o, z));
        this.A00 = z;
    }

    public boolean A01() {
        return this.A00;
    }
}
