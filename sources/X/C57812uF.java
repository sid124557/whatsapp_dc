package X;

import java.util.List;

/* renamed from: X.2uF  reason: invalid class name and case insensitive filesystem */
public final class C57812uF {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, C379324p.A00(", ", C39172Ay.A00));
        AnonymousClass0x2.A1P(A0h, "contacts");
        A00 = AnonymousClass000.A0X("jid = ?", A0h);
    }

    public static String A00(List list, long j, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!list.isEmpty() && !z) {
            A0o.append(" WHERE ");
            for (int i = 0; i < list.size(); i++) {
                String A0n = AnonymousClass001.A0n(list, i);
                A0o.append("consumer_status");
                A0o.append(" & ");
                A0o.append(j);
                A0o.append(" = ");
                A0o.append(A0n);
                if (i < AnonymousClass002.A03(list)) {
                    A0o.append(" OR ");
                }
            }
        }
        return A0o.toString();
    }
}
