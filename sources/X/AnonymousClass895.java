package X;

import android.os.Bundle;

@Deprecated
/* renamed from: X.895  reason: invalid class name */
public class AnonymousClass895 implements C186678vl {
    public static final AnonymousClass895 A02 = new AnonymousClass895(new C156037fv());
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass895) {
                AnonymousClass895 r5 = (AnonymousClass895) obj;
                if (this.A01 != r5.A01 || !AnonymousClass72K.A00(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass895(C156037fv r2) {
        this.A01 = r2.A00.booleanValue();
        this.A00 = r2.A01;
    }

    public final Bundle A00() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("consumer_package", (String) null);
        A08.putBoolean("force_save_dialog", this.A01);
        A08.putString("log_session_id", this.A00);
        return A08;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = null;
        AnonymousClass000.A1R(A1X, this.A01);
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
