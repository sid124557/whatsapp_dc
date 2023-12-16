package X;

import java.util.Set;

/* renamed from: X.2BI  reason: invalid class name */
public class AnonymousClass2BI {
    public static Set A00;

    public static boolean A00(String str) {
        Set set = A00;
        if (set == null) {
            set = C18280x3.A0h(new String[]{"payments:settings", "payments:transaction", "payments:account-details", "payments:request", "payments:verify-number", "payments:account-select", "payments:bank-select", "payments:enter-card", "payments:setup-pin"});
            A00 = set;
        }
        return set.contains(str);
    }
}
