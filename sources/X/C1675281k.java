package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.81k  reason: invalid class name and case insensitive filesystem */
public class C1675281k implements C180218kg {
    public C187458xF A00;
    public final long A01;
    public final C142866xv A02;
    public final C152777a6 A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final /* synthetic */ C150047Oy A06;

    public C1675281k(C142866xv r2, C152777a6 r3, C150047Oy r4, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.A06 = r4;
        this.A01 = j;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = atomicBoolean;
        this.A04 = atomicBoolean2;
        this.A00 = r3.A04;
    }

    public C185788uF B0X() {
        C185788uF r2;
        C185788uF r3;
        int i = C141076uz.AUDIO_ONLY.mValue;
        C152777a6 r1 = this.A03;
        if (i == r1.A01) {
            r3 = new AnonymousClass6KJ();
        } else {
            C142866xv r15 = this.A02;
            C142866xv r11 = C142866xv.A05;
            if (r15 == r11 && AnonymousClass71F.A00(r1.A0F.A05)) {
                C150047Oy r0 = this.A06;
                r3 = new C1675881q(r0.A00, this.A00, r0.A05.userAgent);
            } else if (r15 == C142866xv.A02) {
                boolean A002 = AnonymousClass71F.A00(r1.A0F.A04);
                C150047Oy r02 = this.A06;
                if (A002) {
                    r2 = new C1675881q(r02.A00, this.A00, r02.A05.userAgent);
                } else {
                    r2 = new AnonymousClass6KP(r02.A05.userAgent, 8000, 8000);
                }
                return new C1675581n(r2);
            } else {
                C150047Oy r5 = this.A06;
                AnonymousClass0Xd r12 = r5.A01;
                C166577yv r9 = r1.A0F;
                String str = r9.A0H;
                String str2 = r9.A0B;
                String str3 = r9.A0C;
                AtomicBoolean atomicBoolean = this.A05;
                boolean z = false;
                C160777oI r16 = new C160777oI(r1.A06, r9.A06, str, str2, str3, atomicBoolean, r9.A0M);
                if (r15 == r11) {
                    z = true;
                }
                Map map = r9.A0I;
                C187458xF r14 = this.A00;
                return new C1675581n(r12.A05(r5.A04, r14, r15, r16, r5.A06, map, atomicBoolean, 0, 8000, r5.A03.A01(0), false, z, false));
            }
        }
        return new C1675581n(r3);
    }
}
