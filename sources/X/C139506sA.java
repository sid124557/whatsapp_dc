package X;

import java.util.List;

/* renamed from: X.6sA  reason: invalid class name and case insensitive filesystem */
public class C139506sA extends C41022Iq implements C84294Bu {
    public Object A00;
    public Object A01;
    public final int A02;

    public C139506sA(AnonymousClass36K r5, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
                AnonymousClass36K.A0N(r5, "message");
                this.A00 = C626836d.A02(r5, C1896292a.A00(311), 0);
                AnonymousClass4B7[] r2 = new AnonymousClass4B7[2];
                r2[0] = new C86304Jp(60);
                C1896292a.A0P(r2, 312);
                this.A01 = C626836d.A07(r5, "NewsletterText|NewsletterMedia", AnonymousClass0x2.A0i(r2), new String[0]);
                break;
            case 1:
                AnonymousClass36K.A0N(r5, "message");
                this.A01 = AnonymousClass6C8.A0b(r5, C1896292a.A00(329), "plaintext");
                this.A00 = C1896292a.A0K(r5, 330);
                break;
            default:
                AnonymousClass36K.A0N(r5, "message");
                this.A00 = C626836d.A02(r5, C1896292a.A00(336), 0);
                this.A01 = C1896292a.A0L(r5, 337, 0);
                C1896292a.A0O(r5, new String[]{"plaintext"}, 338);
                break;
        }
        this.A00 = r5;
    }

    public void Aw9(AnonymousClass7QC r34) {
        AnonymousClass7QC r6 = r34;
        switch (this.A02) {
            case 0:
                C53852nm r32 = r6.A05;
                C95804uY r31 = r6.A04;
                long j = r6.A02;
                long j2 = r6.A00;
                boolean z = r6.A0B;
                long j3 = r6.A01;
                List list = r6.A09;
                List list2 = r6.A0A;
                long j4 = r6.A03;
                boolean z2 = r6.A0C;
                Long l = r6.A07;
                long j5 = j;
                long j6 = j2;
                Long l2 = r6.A06;
                String str = r6.A08;
                List list3 = list;
                List list4 = list2;
                C95804uY r14 = r31;
                C53852nm r15 = r32;
                Long l3 = l;
                ((C183478q6) this.A01).Aw8(new AnonymousClass7QB(r14, r15, l3, l2, str, list3, list4, j5, j6, j3, j4, z, z2));
                return;
            case 1:
                C53852nm r142 = r6.A05;
                C95804uY r152 = r6.A04;
                String str2 = r6.A08;
                long j7 = r6.A02;
                long j8 = r6.A00;
                boolean z3 = r6.A0B;
                long j9 = r6.A01;
                List list5 = r6.A09;
                List list6 = r6.A0A;
                long j10 = r6.A03;
                long j11 = j8;
                byte[] bArr = (byte[]) ((C34821vs) this.A01).A00;
                long j12 = j7;
                String str3 = str2;
                List list7 = list5;
                List list8 = list6;
                r142.A02(r152, (Integer) null, (Long) null, (Long) null, str3, list7, list8, bArr, j12, j11, j9, j10, z3, r6.A0C);
                return;
            default:
                C53852nm r8 = r6.A05;
                C95804uY r9 = r6.A04;
                String str4 = r6.A08;
                long j13 = r6.A02;
                long j14 = r6.A00;
                boolean z4 = r6.A0B;
                long j15 = j14;
                long j16 = j13;
                r8.A02(r9, (Integer) null, (Long) null, (Long) null, str4, (List) null, (List) null, (byte[]) null, j16, j15, r6.A01, 0, z4, r6.A0C);
                return;
        }
    }
}
