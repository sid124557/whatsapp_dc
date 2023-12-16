package X;

import android.content.Context;

/* renamed from: X.6Uw  reason: invalid class name and case insensitive filesystem */
public final class C128126Uw extends AnonymousClass72P {
    public final Context A00;
    public final C180948lt A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass72P) {
                C128126Uw r5 = (C128126Uw) ((AnonymousClass72P) obj);
                if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass6CA.A05(this.A01, (this.A00.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.A00.toString();
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FlagsContext{context=");
        A0o.append(obj);
        A0o.append(", hermeticFileOverrides=");
        A0o.append(valueOf);
        return AnonymousClass000.A0g(A0o);
    }

    public C128126Uw(Context context, C180948lt r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
