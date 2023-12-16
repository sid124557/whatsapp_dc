package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.2tI  reason: invalid class name and case insensitive filesystem */
public class C57222tI {
    public static Pair A00(String str, String str2, String str3) {
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A19(str, str2, A0M);
        String lowerCase = String.format("%s_bd_for_%s_trigger", A0M).toLowerCase(Locale.getDefault());
        Object[] objArr = new Object[4];
        C18280x3.A19(lowerCase, str, objArr);
        AnonymousClass001.A1H(str2, str3, objArr);
        return AnonymousClass0x9.A0C(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", objArr));
    }
}
