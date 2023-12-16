package X;

import java.util.Map;

/* renamed from: X.2mv  reason: invalid class name and case insensitive filesystem */
public final class C53332mv {
    public final C59252wc A00;
    public final C59842xa A01;
    public final C55742qq A02;
    public final AnonymousClass2Z4 A03;
    public final AnonymousClass2IR A04;

    public final void A01(C46772cB r14, Boolean bool, String str, String str2, String str3, String str4) {
        String str5 = str2;
        C162457s7.A0J(str5, 1);
        AnonymousClass39C A002 = this.A03.A00(str3);
        String str6 = str;
        String str7 = str4;
        this.A04.A00.A03(A002, new AnonymousClass3XY(new C43292Ro(r14, this, A002, str6, str7)), bool, str6, str7, str5);
    }

    public final void A02(C46772cB r10, String str, String str2, Map map, int i) {
        String str3 = str;
        C162457s7.A0J(str, 0);
        String A0d = C18280x3.A0d(map);
        C162457s7.A0D(A0d);
        String str4 = str2;
        C46202bF A002 = A00(str, str2, A0d);
        C46772cB r3 = r10;
        if (A002 == null || A002.A00 != 5) {
            String A003 = C59842xa.A00(Integer.valueOf(i));
            if (A003 == null) {
                A003 = "";
            }
            A01(r3, Boolean.FALSE, str3, A003, str4, A0d);
            return;
        }
        r10.A00();
    }

    public C53332mv(C59252wc r2, C59842xa r3, C55742qq r4, AnonymousClass2Z4 r5, AnonymousClass2IR r6) {
        C18260x0.A0V(r4, r2, r3);
        C162457s7.A0J(r5, 5);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        r2.A00 = C369920n.BLOKS_LAYOUT_OBJECT;
    }

    public final C46202bF A00(String str, String str2, String str3) {
        C18260x0.A0O(str, str2);
        AnonymousClass39C A002 = this.A03.A00(str2);
        if (A002 == null) {
            return null;
        }
        return (C46202bF) this.A02.A01(new C34281up(this.A00, str, str3), A002.A01);
    }
}
