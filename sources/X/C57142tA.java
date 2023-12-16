package X;

import java.util.Map;

/* renamed from: X.2tA  reason: invalid class name and case insensitive filesystem */
public final class C57142tA {
    public static final String A00(String str) {
        C162457s7.A0J(str, 0);
        String A0V = C18270x1.A0V(AnonymousClass0x7.A0t(), C18290x4.A1b(str));
        C162457s7.A0D(A0V);
        return A0V;
    }

    public static final String A01(Map map) {
        String A0o;
        if (!map.containsKey("flow_message_version") || (A0o = C18310x6.A0o("flow_message_version", map)) == null || A0o.length() == 0) {
            return null;
        }
        return A0o;
    }
}
