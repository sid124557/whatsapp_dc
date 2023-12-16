package X;

import android.content.Context;

/* renamed from: X.0Ob  reason: invalid class name and case insensitive filesystem */
public class C04400Ob {
    public AnonymousClass0U2 A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;

    public AnonymousClass0MP A00() {
        String str;
        AnonymousClass0U2 r2 = this.A00;
        if (r2 != null) {
            boolean z = this.A03;
            if (!z || ((str = this.A01) != null && str.length() != 0)) {
                return new AnonymousClass0MP(this.A04, r2, this.A01, z, this.A02);
            }
            throw AnonymousClass001.A0c("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        throw AnonymousClass001.A0c("Must set a callback to create the configuration.");
    }

    public C04400Ob(Context context) {
        this.A04 = context;
    }
}
