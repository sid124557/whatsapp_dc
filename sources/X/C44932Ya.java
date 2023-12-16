package X;

import java.util.Map;

/* renamed from: X.2Ya  reason: invalid class name and case insensitive filesystem */
public final class C44932Ya {
    public final C59842xa A00;
    public final C53332mv A01;

    public C44932Ya(C59842xa r2, C53332mv r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00(String str, String str2, Map map, int i) {
        String A0d;
        String str3 = str;
        String str4 = str2;
        C18270x1.A12(str, str2);
        String str5 = "";
        if (map == null) {
            A0d = str5;
        } else {
            A0d = C18280x3.A0d(map);
            C162457s7.A0H(A0d);
        }
        C53332mv r1 = this.A01;
        String A002 = C59842xa.A00(Integer.valueOf(i));
        if (A002 != null) {
            str5 = A002;
        }
        r1.A01((C46772cB) null, Boolean.TRUE, str3, str5, str4, A0d);
    }
}
