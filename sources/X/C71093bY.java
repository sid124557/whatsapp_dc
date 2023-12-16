package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3bY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71093bY implements Runnable {
    public final /* synthetic */ AnonymousClass30M A00;
    public final /* synthetic */ C621033m A01;
    public final /* synthetic */ AnonymousClass65N A02;
    public final /* synthetic */ C30471mV A03;
    public final /* synthetic */ AnonymousClass2IK A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public final void run() {
        AnonymousClass3QO r3;
        C621033m r5 = this.A01;
        byte[] bArr = this.A09;
        AnonymousClass30M r15 = this.A00;
        AnonymousClass65N r2 = this.A02;
        C30471mV r13 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        Integer num = this.A05;
        AnonymousClass2IK r8 = this.A04;
        C614630w A0y = r15.A00().A0y();
        if (bArr == null && A0y != null && A0y.A05()) {
            bArr = A0y.A09();
        }
        List unmodifiableList = Collections.unmodifiableList(r15.A02);
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (AnonymousClass2z0.A0C(A0T)) {
                C50502iH r6 = (C50502iH) r5.A1z.get();
                C70113Zy.A01(r6.A0B, r6, A0T, 49);
            } else {
                r5.A0l.A0a(A0T, 1);
            }
        }
        C56232re r52 = r5.A1I;
        C157497iO r4 = new C157497iO(num, true, r15.A05(), r15.A04());
        if (r13 == null || (r3 = r52.A01(r52.A00(r13))) == null) {
            r3 = (AnonymousClass3QO) r2;
        }
        r52.A0V.execute(new C71353by(r52, 24, r15));
        C56232re r16 = r52;
        C71063bV r14 = new C71063bV(r15, r16, r3, r4, bArr, z2, z3, z, true);
        C72163dH r0 = r52.A0S;
        if (r0 != null) {
            r0.execute(r14);
        } else {
            r52.A0R.BkM(r14);
        }
        AnonymousClass3XA r02 = new AnonymousClass2IK().A00;
        r02.A05(unmodifiableList);
        AnonymousClass3XA.A01(r02, r8, 24);
    }

    public /* synthetic */ C71093bY(AnonymousClass30M r1, C621033m r2, AnonymousClass65N r3, C30471mV r4, AnonymousClass2IK r5, Integer num, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A09 = bArr;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = num;
        this.A04 = r5;
    }
}
