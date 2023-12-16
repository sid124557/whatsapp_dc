package X;

import android.text.TextUtils;

/* renamed from: X.9Uj  reason: invalid class name and case insensitive filesystem */
public class C194759Uj {
    public final C193999Re A00;
    public final AnonymousClass9QD A01;

    public C194759Uj(C193999Re r1, AnonymousClass9QD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(String str) {
        if (TextUtils.isEmpty(str) || str.length() > 255 || str.equalsIgnoreCase("facebook2@icici") || !AnonymousClass9M6.A02.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
