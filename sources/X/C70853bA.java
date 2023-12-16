package X;

import java.util.Iterator;

/* renamed from: X.3bA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70853bA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass30M A02;
    public final /* synthetic */ C56232re A03;
    public final /* synthetic */ AnonymousClass3QO A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        int A002;
        C56232re r4 = this.A03;
        long j = this.A01;
        AnonymousClass3QO r3 = this.A04;
        boolean z = this.A06;
        Integer num = this.A05;
        int i = this.A00;
        AnonymousClass30M r9 = this.A02;
        if (j > 0) {
            if (r3.A0N.A03.A02) {
                A002 = 3;
            } else {
                A002 = C18280x3.A00(z ? 1 : 0);
            }
            C54882pR r2 = r4.A0F;
            double d = (double) j;
            boolean A1T = AnonymousClass000.A1T(num.intValue());
            synchronized (r2) {
                long A012 = r2.A01();
                int A003 = r2.A00();
                C158017jI r12 = r2.A04;
                C160167n9 A004 = r12.A00(i, A003, A002, A012, false);
                A004.A01 = (long) (((double) A004.A01) + d);
                if (A1T) {
                    A004.A07++;
                }
                r12.A01(A004, i, A003, A002, A012, false);
            }
        }
        int intValue = num.intValue();
        Iterator A0x = AnonymousClass0x7.A0x(r9.A02);
        if (intValue == 0) {
            while (A0x.hasNext()) {
                C624134x A0T = C18300x5.A0T(A0x);
                r4.A0F.A03(r4.A05.A00(A0T), AnonymousClass368.A02(A0T), i);
            }
            if (r4.A0B.A0Y(C58422vE.A02, 475) && r3.A0M.A01() == 3) {
                AnonymousClass2YS r42 = r4.A0G;
                AnonymousClass5LM r22 = r3.A0L;
                r22.A05 = System.currentTimeMillis();
                r42.A01.A03(r22);
                return;
            }
            return;
        }
        while (A0x.hasNext()) {
            A0x.next();
            C54882pR r14 = r4.A0F;
            synchronized (r14) {
                C152867aI r13 = r14.A05.A01;
                C61052zd A013 = r13.A01();
                long j2 = A013.A0F;
                long j3 = A013.A0I;
                r13.A03(new C61052zd(j2, j3, A013.A0E, A013.A0G, A013.A0H, A013.A0M, A013.A0P, A013.A0L, A013.A0N, A013.A0O, A013.A01, A013.A02, A013.A03, A013.A07, A013.A06, A013.A08, A013.A00, A013.A0J, A013.A0K, A013.A05, A013.A04, A013.A09, A013.A0B, A013.A0A, A013.A0C, A013.A0D + 1));
            }
        }
    }

    public /* synthetic */ C70853bA(AnonymousClass30M r1, C56232re r2, AnonymousClass3QO r3, Integer num, int i, long j, boolean z) {
        this.A03 = r2;
        this.A01 = j;
        this.A04 = r3;
        this.A06 = z;
        this.A05 = num;
        this.A00 = i;
        this.A02 = r1;
    }
}
