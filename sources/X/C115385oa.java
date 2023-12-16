package X;

import android.text.TextUtils;

/* renamed from: X.5oa  reason: invalid class name and case insensitive filesystem */
public class C115385oa implements AnonymousClass66C {
    public final /* synthetic */ C105115Tq A00;

    public C115385oa(C105115Tq r1) {
        this.A00 = r1;
    }

    public void B27(AnonymousClass30Y r5) {
        C105115Tq r3 = this.A00;
        String str = r3.A02;
        if (str == null) {
            str = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F((AnonymousClass33p) r3.A08.get()), "encrypted_rid");
            r3.A02 = str;
        }
        if (!TextUtils.isEmpty(str)) {
            r5.A00(str.length(), "encrypted_rid", str);
        }
    }

    public String B9C() {
        return "encrypted_rid";
    }
}
