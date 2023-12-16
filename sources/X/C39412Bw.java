package X;

import android.text.TextUtils;

/* renamed from: X.2Bw  reason: invalid class name and case insensitive filesystem */
public final class C39412Bw {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = C66213Km.A00;
        String A10 = AnonymousClass0x9.A10(TextUtils.join(", ", strArr), A0o);
        A00 = AnonymousClass000.A0X("wa_vnames", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(TextUtils.join(", ", strArr), A10, "wa_vnames", A0l);
        A0l.append(" WHERE ");
        A01 = AnonymousClass000.A0X("jid = ?", A0l);
    }
}
