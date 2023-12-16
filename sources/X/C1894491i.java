package X;

import java.util.Locale;

/* renamed from: X.91i  reason: invalid class name and case insensitive filesystem */
public class C1894491i implements C183328pr {
    public Object A00;
    public final int A01;

    public C1894491i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BSK(String str, boolean z, String str2) {
        String str3;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C116505qO) obj).A03(str, z);
            return;
        }
        AnonymousClass563 r0 = (AnonymousClass563) obj;
        if (z) {
            str3 = "_transient";
        } else {
            str3 = "_not_transient";
        }
        r0.A10.A01 = AnonymousClass000.A0V(str2.toLowerCase(Locale.ROOT), str3, AnonymousClass001.A0o());
    }
}
