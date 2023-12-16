package X;

import java.util.Map;

/* renamed from: X.8MV  reason: invalid class name */
public class AnonymousClass8MV implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public AnonymousClass8MV(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A06 = str;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public final void run() {
        C138726qt r8;
        int i;
        String str;
        int i2 = this.A07;
        AnonymousClass36K r5 = (AnonymousClass36K) this.A01;
        C161447pg r9 = (C161447pg) this.A03;
        String str2 = this.A06;
        Object obj = this.A04;
        AnonymousClass4DL r2 = (AnonymousClass4DL) this.A05;
        C162457s7.A0J(r2, 7);
        AnonymousClass36K A022 = C41032Ir.A02(r5, (C41032Ir) this.A02);
        if (i2 != 0) {
            r8 = (C138726qt) C1896292a.A0J(r5, 78);
            i = 14;
        } else {
            r8 = (C138726qt) C1896292a.A0J(r5, 59);
            i = 12;
        }
        AnonymousClass92Z.A01(A022, r5, i);
        C162457s7.A0D(r8);
        C48712fL r4 = (C48712fL) r9.A0O.get(r9.A0N.get(str2));
        if (r4 != null) {
            str = r4.A00(String.valueOf(C18310x6.A0B(r8.A00)));
        } else {
            str = null;
        }
        C52632ln r42 = new C52632ln(str, (Map) null, C18320x8.A03((Number) r8.A00));
        String str3 = r8.A01;
        if (str3 != null) {
            long j = r42.A00;
            r42 = new C52632ln(r42.A01, (Map) C159957ml.A01(str3).A01("$", new C181468mo[0]), j);
        }
        int hashCode = obj.hashCode();
        Long valueOf = Long.valueOf(r42.A00);
        C29541iz r10 = r9.A0A;
        r9.A05(r10, valueOf, "iqResponse", "error_code", hashCode);
        r10.A03.A07(obj.hashCode(), 467);
        r2.BSz(r42);
    }
}
