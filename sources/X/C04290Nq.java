package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.0Nq  reason: invalid class name and case insensitive filesystem */
public final class C04290Nq {
    public final C58502vM A00;
    public final AnonymousClass3CH A01;
    public final C55552qX A02;
    public final AnonymousClass7UQ A03;
    public final AnonymousClass2IQ A04;
    public final AnonymousClass2MQ A05;

    public C04290Nq(C58502vM r2, AnonymousClass3CH r3, C55552qX r4, AnonymousClass7UQ r5, AnonymousClass2IQ r6, AnonymousClass2MQ r7) {
        C162457s7.A0J(r4, 2);
        C162457s7.A0J(r3, 3);
        C162457s7.A0J(r2, 4);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final void A00(C16430tO r17, AnonymousClass39C r18, String str, String str2, String str3, WeakReference weakReference, boolean z) {
        String str4 = str;
        C162457s7.A0J(str4, 1);
        String str5 = str2;
        C162457s7.A0J(str5, 4);
        WeakReference weakReference2 = weakReference;
        C009707r r8 = (C009707r) weakReference2.get();
        C16430tO r5 = r17;
        if (r8 == null) {
            r5.BPR(AnonymousClass0F7.A00);
            return;
        }
        C47382dA r7 = new C47382dA(r8, AnonymousClass00M.A01(r8), this.A00, this.A04, this.A05, str5, (Map) null, z);
        this.A03.A00(r8.getApplicationContext(), this.A01, r7);
        this.A02.A03(r18, new C10430hv(r7, r5, weakReference2), (Boolean) null, str4, str3, (String) null);
    }
}
