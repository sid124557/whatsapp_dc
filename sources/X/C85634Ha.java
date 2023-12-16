package X;

import android.app.Activity;
import android.content.SharedPreferences;

/* renamed from: X.4Ha  reason: invalid class name and case insensitive filesystem */
public class C85634Ha implements AnonymousClass64H {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C85634Ha(C89654ea r1, AnonymousClass33p r2, int i, int i2) {
        this.A03 = i2;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void BZn() {
        boolean z;
        SharedPreferences.Editor A032;
        String str;
        if (this.A03 != 0) {
            int i = this.A00;
            AnonymousClass33p r3 = (AnonymousClass33p) this.A02;
            C621433s.A00((Activity) this.A01, i);
            z = false;
            C18270x1.A0l(C18270x1.A03(r3), "pref_revoke_sender_nux_v2", false);
            A032 = C18270x1.A03(r3);
            str = "pref_revoke_admin_nux";
        } else {
            C621433s.A00((Activity) this.A01, this.A00);
            z = false;
            A032 = C18270x1.A03((AnonymousClass33p) this.A02);
            str = "pref_revoke_sender_nux_v2";
        }
        C18270x1.A0l(A032, str, z);
    }
}
