package X;

import java.util.Map;

/* renamed from: X.3Wu  reason: invalid class name and case insensitive filesystem */
public class C69383Wu implements AnonymousClass48Z {
    public final String A00;
    public final String A01;
    public final Map A02;

    public C69383Wu(String str, String str2, Map map) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QplEventCallback{instanceKey='");
        char A012 = C18300x5.A01(this.A01, A0o);
        A0o.append(", eventType='");
        A0o.append(this.A00);
        A0o.append(A012);
        A0o.append(", params=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
