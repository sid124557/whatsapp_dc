package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2c6  reason: invalid class name and case insensitive filesystem */
public final class C46722c6 {
    public final C55682qk A00;
    public final C39872Dq A01;
    public final C29441ip A02;
    public final C54402of A03;
    public final AnonymousClass4FS A04;
    public final AtomicBoolean A05 = C18280x3.A0l();

    public final void A00(AnonymousClass1UX r4, AnonymousClass2GM r5, String str, Throwable th) {
        if (!this.A02.A0F()) {
            r4 = AnonymousClass1UW.A00;
        }
        r5.A00.countDown();
        C55682qk r1 = this.A00;
        String str2 = r4.A00;
        if (th != null) {
            r1.A09(str2, str, th);
        } else {
            r1.A0A(str2, false, str);
        }
    }

    public C46722c6(C55682qk r2, C39872Dq r3, C29441ip r4, C54402of r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r5, r3, r2, r4, r6);
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
    }
}
