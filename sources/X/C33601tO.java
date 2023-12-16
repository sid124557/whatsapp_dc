package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1tO  reason: invalid class name and case insensitive filesystem */
public final class C33601tO extends AnonymousClass5ZM {
    public C621033m A00;
    public WeakReference A01;
    public final long A02;
    public final C95814uZ A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C621033m r4 = this.A00;
        C95814uZ r8 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A05;
        r4.A0F.A02(r8, (Integer) null, (String) null, (String) null, this.A04.intValue(), 4, false);
        r4.A0I.A00(r8, 4);
        C65203Gp r5 = r4.A0L;
        Set A09 = r5.A09(r8, !z, z2);
        r4.A0l.A0Q(r8, (Long) null, z, z2);
        AnonymousClass2AZ.A00.put(r8, false);
        r5.A0O(A09);
        AnonymousClass3LP r11 = r4.A19;
        AnonymousClass4FS r0 = r4.A1r;
        AnonymousClass31G.A01(r4.A0s, r11, r4.A1A, r8, r0, C18300x5.A0Y(), (Integer) null, 5);
        C89654ea.A4P(this.A02, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
    }

    public C33601tO(C621033m r2, C95814uZ r3, Integer num, Runnable runnable, long j, boolean z, boolean z2) {
        this.A00 = r2;
        this.A01 = AnonymousClass0x9.A14(runnable);
        this.A03 = r3;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = j;
        this.A04 = num;
    }
}
