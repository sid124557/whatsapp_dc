package X;

/* renamed from: X.2pq  reason: invalid class name and case insensitive filesystem */
public class C55132pq {
    public C32571r9 A00;
    public C32551r7 A01;
    public C73603fm A02;
    public C73603fm A03;
    public C32561r8 A04;
    public final C66663Mh A05;
    public final C54292oU A06;
    public final AnonymousClass1VX A07;
    public final C46152bA A08;
    public final C388629o A09;
    public final AnonymousClass2BZ A0A;
    public final AnonymousClass2J1 A0B;
    public final C388829q A0C;
    public final AnonymousClass2J2 A0D;
    public final C388929r A0E;
    public final AnonymousClass8P4 A0F;
    public final AnonymousClass7VN A0G;

    public synchronized C32571r9 A00() {
        C32571r9 r2;
        r2 = this.A00;
        if (r2 == null) {
            r2 = new C32571r9(this.A06.A00, this.A08);
            this.A00 = r2;
        }
        return r2;
    }

    public synchronized C73603fm A01(boolean z) {
        C73603fm r0;
        if (z) {
            r0 = this.A03;
            if (r0 == null) {
                AnonymousClass1VX r2 = this.A07;
                C66663Mh r1 = this.A05;
                AnonymousClass2J1 r5 = this.A0B;
                AnonymousClass8P4 r9 = this.A0F;
                C388829q r6 = this.A0C;
                r0 = new C32591rB(r1, r2, this.A09, this.A0A, r5, r6, this.A0D, this.A0E, r9, this.A0G);
                this.A03 = r0;
            }
        } else {
            r0 = this.A02;
            if (r0 == null) {
                AnonymousClass1VX r22 = this.A07;
                C66663Mh r12 = this.A05;
                AnonymousClass2J1 r52 = this.A0B;
                AnonymousClass8P4 r92 = this.A0F;
                C388829q r62 = this.A0C;
                r0 = new C32581rA(r12, r22, this.A09, this.A0A, r52, r62, this.A0D, this.A0E, r92, this.A0G);
                this.A02 = r0;
            }
        }
        return r0;
    }

    public synchronized C32561r8 A02() {
        C32561r8 r2;
        r2 = this.A04;
        if (r2 == null) {
            r2 = new C32561r8(this.A06.A00, this.A08);
            this.A04 = r2;
        }
        return r2;
    }

    public C55132pq(C66663Mh r1, C54292oU r2, AnonymousClass1VX r3, C46152bA r4, C388629o r5, AnonymousClass2BZ r6, AnonymousClass2J1 r7, C388829q r8, AnonymousClass2J2 r9, C388929r r10, AnonymousClass8P4 r11, AnonymousClass7VN r12) {
        this.A07 = r3;
        this.A06 = r2;
        this.A05 = r1;
        this.A0B = r7;
        this.A0F = r11;
        this.A08 = r4;
        this.A0C = r8;
        this.A09 = r5;
        this.A0E = r10;
        this.A0A = r6;
        this.A0D = r9;
        this.A0G = r12;
    }
}
