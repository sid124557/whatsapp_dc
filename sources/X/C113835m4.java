package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.5m4  reason: invalid class name and case insensitive filesystem */
public final class C113835m4 implements AnonymousClass4FD {
    public final AnonymousClass08M A00;
    public final C56982ss A01;

    public final C104595Rp A00(C95814uZ r54) {
        AnonymousClass1RL r12;
        AnonymousClass31A A002 = C56982ss.A00(this.A01, r54);
        if (!(A002 instanceof AnonymousClass1RL) || (r12 = (AnonymousClass1RL) A002) == null) {
            return null;
        }
        long j = r12.A00;
        AnonymousClass31A r52 = r12.A0P;
        String str = r12.A0H;
        long j2 = r12.A02;
        String str2 = r12.A0E;
        long j3 = r12.A01;
        String str3 = r12.A0J;
        long j4 = r12.A03;
        String str4 = r12.A0I;
        long j5 = r12.A04;
        long j6 = r12.A0O;
        String str5 = r12.A0F;
        String str6 = r12.A0G;
        long j7 = r12.A05;
        C372821q r11 = r12.A07;
        C371421c r25 = r12.A0A;
        C371621e r23 = r12.A0C;
        boolean z = r12.A0L;
        List list = r12.A0Q;
        boolean z2 = r12.A0M;
        C372321l r10 = r12.A0B;
        boolean z3 = r12.A0K;
        C372921r r9 = r12.A09;
        C129586aY r18 = r12.A06;
        Long l = r12.A0D;
        AnonymousClass599 r122 = r12.A08;
        C86654Ky.A1P(r11, r10, r9);
        C129586aY r16 = r18;
        AnonymousClass31A r17 = r52;
        C372821q r182 = r11;
        AnonymousClass599 r19 = r122;
        C372921r r20 = r9;
        C371421c r21 = r25;
        C372321l r22 = r10;
        String str7 = str;
        String str8 = str2;
        C104595Rp r3 = new C104595Rp(new AnonymousClass1RL(r16, r17, r182, r19, r20, r21, r22, r23, l, str7, str8, str3, str4, str5, str6, list, j, j2, j3, j4, j5, j6, j7, z, z2, z3, r12.A0N), true);
        AnonymousClass08M r2 = this.A00;
        Map map = (Map) r2.A07();
        if (map != null) {
            map.put(r3.A00.A05(), r3);
        }
        r2.A0H(r2.A07());
        return r3;
    }

    public void BLe(C95814uZ r5, boolean z) {
        C162457s7.A0J(r5, 0);
        C104595Rp A002 = A00(r5);
        if (A002 != null) {
            AnonymousClass08M r2 = this.A00;
            Map map = (Map) r2.A07();
            if (map != null) {
                map.put(A002.A00.A05(), A002);
            }
            r2.A0H(r2.A07());
        }
    }

    public void BLg(C95814uZ r4) {
        C162457s7.A0J(r4, 0);
        AnonymousClass08M r1 = this.A00;
        Map map = (Map) r1.A07();
        if (map != null && map.remove(r4) != null) {
            C162457s7.A0J(r1, 0);
            r1.A0H(r1.A07());
        }
    }

    public final C104595Rp A01(C95814uZ r2) {
        C104595Rp r0;
        Map map = (Map) this.A00.A07();
        if (map == null || (r0 = (C104595Rp) map.get(r2)) == null) {
            return A00(r2);
        }
        return r0;
    }

    public void BLd() {
    }

    public C113835m4(C28871hu r3, C56982ss r4) {
        C18260x0.A0Q(r4, r3);
        this.A01 = r4;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A00 = A012;
        A012.A0H(AnonymousClass0x9.A1D());
        r3.A06(this);
    }

    public void BLc(C95814uZ r1) {
    }

    public void BLh(C95814uZ r1) {
    }

    public void BLf(C95814uZ r1, Collection collection, int i) {
    }
}
