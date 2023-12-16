package X;

import java.util.concurrent.Executor;

/* renamed from: X.2fC  reason: invalid class name and case insensitive filesystem */
public final class C48622fC {
    public final C23641Ub A00;
    public final AnonymousClass3CS A01;

    public C48622fC(C23641Ub r2, AnonymousClass3CS r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final AnonymousClass3XA A00(String str, int i) {
        AnonymousClass3XA r2;
        this.A00.A09(Integer.valueOf(i), "psl_cache_fetch_start");
        AnonymousClass3XA r4 = new AnonymousClass3XA();
        AnonymousClass3CS r3 = this.A01;
        synchronized (r3) {
            r2 = new AnonymousClass3XA();
            if (r3.A07) {
                byte[] bArr = (byte[]) r3.A00.get(str);
                r2.A05(AnonymousClass3Z6.A02(Boolean.valueOf(AnonymousClass000.A1W(bArr)), bArr));
            } else {
                r3.A00(new C81463zv(r2, r3, str));
            }
        }
        r2.A03(new AnonymousClass3X1(r4, this, i));
        return r4;
    }

    public final Object A01(String str, C84814Du r7, int i) {
        C72463dl A02 = C57702u4.A02(r7);
        AnonymousClass3XA A002 = A00(str, i);
        A002.A03(new C86264Jl(A002, 3, A02));
        A002.A00.A04(new C86264Jl(A002, 4, A02), (Executor) null);
        return A02.A00();
    }
}
