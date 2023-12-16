package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;

@Deprecated
/* renamed from: X.3GM  reason: invalid class name */
public class AnonymousClass3GM implements AnonymousClass4FD {
    public C54702p9 A00;
    public C183538qC A01;
    public final C69263Wi A02;
    public final C50422i9 A03;
    public final C153167am A04;
    public final C29301ib A05;
    public final C64773Ex A06;
    public final C29381ij A07;
    public final AnonymousClass314 A08;
    public final C56982ss A09;
    public final C28891hw A0A;
    public final C56662sM A0B;
    public final AnonymousClass311 A0C;
    public final C55882r4 A0D;
    public final AnonymousClass33Y A0E;
    public final C55042ph A0F;
    public final AnonymousClass4FS A0G;
    public final C183538qC A0H;
    public final AnonymousClass4C1 A0I;

    public void BLf(C95814uZ r10, Collection collection, int i) {
        this.A03.A01();
        C95814uZ r5 = r10;
        this.A0A.A0A(r10);
        Iterator A032 = C61102zi.A03(this.A05);
        while (A032.hasNext()) {
            ((C54232oO) A032.next()).A00(r10);
        }
        this.A0G.BkM(new C71433c6(this, r5, collection, i, 5));
        if (collection != null) {
            C55042ph r3 = this.A0F;
            r3.A08.BkM(new C70123Zz(collection, 32, r3));
            if (this.A0D.A01(r10)) {
                this.A0E.A0A(collection);
            }
            C113905mB r4 = (C113905mB) this.A01.get();
            int size = collection.size();
            if (!r4.A03.A0a(r10)) {
                r4.A0e.execute(new C71733ca(r4, r10, size, 26));
            }
        }
    }

    public void BLh(C95814uZ r3) {
        BLe(r3, false);
        Iterator A032 = C61102zi.A03(this.A05);
        while (A032.hasNext()) {
            ((C54232oO) A032.next()).A00(r3);
        }
    }

    public void BLc(C95814uZ r5) {
        C56982ss r1 = this.A09;
        if (r1.A0L(r5)) {
            AnonymousClass314 r3 = this.A08;
            long A092 = r1.A09(r5);
            r3.A02.A0G();
            r3.A0E(r5, r5, A092);
            this.A0A.A08();
            UserJid A032 = AnonymousClass32Y.A03(r5);
            if (A032 != null) {
                C29381ij r12 = this.A07;
                AnonymousClass3ZH A0A2 = this.A06.A0A(A032);
                Iterator A033 = C61102zi.A03(r12);
                while (A033.hasNext()) {
                    ((C64223Cq) A033.next()).A0A(A0A2);
                }
                if (A032 instanceof C27981fH) {
                    C70203a7.A00(this.A0G, this, A032, 46);
                }
            }
        }
    }

    public void BLd() {
        this.A0A.A08();
        this.A03.A01();
    }

    public void BLe(C95814uZ r5, boolean z) {
        C28891hw r0;
        C56982ss r1 = this.A09;
        boolean A0L = r1.A0L(r5);
        AnonymousClass314 r3 = this.A08;
        if (A0L) {
            long A092 = r1.A09(r5);
            r3.A02.A0G();
            if (!r3.A0E(r5, r5, A092)) {
                r0 = this.A0A;
                r0.A0A(r5);
            }
            r0 = this.A0A;
            r0.A08();
        } else {
            r3.A0C(r5);
            this.A03.A01();
            r0 = this.A0A;
            r0.A08();
        }
        if (z) {
            r0.A0B(r5);
        }
    }

    public void BLg(C95814uZ r2) {
        this.A08.A0C(r2);
        C28891hw r0 = this.A0A;
        r0.A08();
        r0.A0B(r2);
    }

    public AnonymousClass3GM(C69263Wi r2, C50422i9 r3, C153167am r4, C29301ib r5, C64773Ex r6, C29381ij r7, AnonymousClass314 r8, C56982ss r9, C28891hw r10, C56662sM r11, AnonymousClass311 r12, C55882r4 r13, AnonymousClass33Y r14, C55042ph r15, AnonymousClass4FS r16, C183538qC r17, C183538qC r18, AnonymousClass4C1 r19) {
        this.A02 = r2;
        this.A0G = r16;
        this.A09 = r9;
        this.A0E = r14;
        this.A03 = r3;
        this.A06 = r6;
        this.A0F = r15;
        this.A0B = r11;
        this.A0D = r13;
        this.A01 = r17;
        this.A05 = r5;
        this.A07 = r7;
        this.A0I = r19;
        this.A08 = r8;
        this.A0A = r10;
        this.A0C = r12;
        this.A04 = r4;
        this.A0H = r18;
    }
}
