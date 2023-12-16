package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.10x  reason: invalid class name */
public class AnonymousClass10x extends C05550Ty {
    public final C44072Uo A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final AnonymousClass2K7 A03;
    public final C44782Xl A04;
    public final C53602nM A05;
    public final C56612sH A06;
    public final C56982ss A07;
    public final C54442oj A08;
    public final C56892sj A09;
    public final C52372lN A0A;
    public final C61152zn A0B;
    public final AnonymousClass1VX A0C;
    public final C47732dj A0D;
    public final C28781hl A0E;
    public final C27991fJ A0F;
    public final AnonymousClass5ND A0G;
    public final AnonymousClass108 A0H = new AnonymousClass108();
    public final AnonymousClass108 A0I = new AnonymousClass108();
    public final AnonymousClass108 A0J = new AnonymousClass108();
    public final AnonymousClass108 A0K = new AnonymousClass108();
    public final C106715a2 A0L;
    public final AnonymousClass107 A0M;
    public final AnonymousClass107 A0N;
    public final AnonymousClass4FS A0O;

    public void A0C() {
        this.A0E.A07(this.A0D);
    }

    public void A0D() {
        this.A0O.BkP(C70003Zm.A00(this, 4));
    }

    public void A0E(AnonymousClass2W6 r3) {
        AnonymousClass2OE r0 = (AnonymousClass2OE) this.A0H.A07();
        if (r0 != null) {
            AnonymousClass3ZH.A0D(r3, r0.A00);
            AnonymousClass108 r1 = this.A0K;
            Object A072 = r1.A07();
            if (A072 != null) {
                r1.A0G(A072);
            }
            AnonymousClass108 r12 = this.A0I;
            Object A073 = r12.A07();
            if (A073 != null) {
                r12.A0G(A073);
            }
        }
    }

    public boolean A0F(UserJid userJid) {
        AnonymousClass2OE r0 = (AnonymousClass2OE) this.A0H.A07();
        if (r0 == null || !r0.A01.contains(userJid)) {
            return false;
        }
        return true;
    }

    public AnonymousClass10x(C44072Uo r4, C56972sr r5, C64773Ex r6, AnonymousClass2K7 r7, C44782Xl r8, C53602nM r9, C56612sH r10, C56982ss r11, C54442oj r12, C56892sj r13, C52372lN r14, C61152zn r15, AnonymousClass1VX r16, C28781hl r17, C27991fJ r18, AnonymousClass5ND r19, C106715a2 r20, AnonymousClass4FS r21) {
        Integer A0Z = C18290x4.A0Z();
        this.A0M = new AnonymousClass107(A0Z);
        this.A0N = new AnonymousClass107(A0Z);
        C27421dn r0 = new C27421dn(this);
        this.A0D = r0;
        this.A06 = r10;
        this.A0C = r16;
        this.A0L = r20;
        this.A01 = r5;
        this.A0O = r21;
        this.A07 = r11;
        this.A02 = r6;
        this.A0A = r14;
        C28781hl r2 = r17;
        this.A0E = r2;
        this.A05 = r9;
        this.A03 = r7;
        this.A09 = r13;
        this.A0B = r15;
        this.A04 = r8;
        this.A08 = r12;
        this.A00 = r4;
        this.A0F = r18;
        this.A0G = r19;
        r2.A06(r0);
    }
}
