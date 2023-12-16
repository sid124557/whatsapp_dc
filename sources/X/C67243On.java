package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3On  reason: invalid class name and case insensitive filesystem */
public final class C67243On implements AnonymousClass4EN {
    public final /* synthetic */ C54662p5 A00;
    public final /* synthetic */ C108895dj A01;
    public final /* synthetic */ C45732aU A02;
    public final /* synthetic */ C46232bI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public void AyP(AnonymousClass2SI r13) {
        AnonymousClass2ZA r2;
        int i;
        C162457s7.A0J(r13, 0);
        if (r13.A00 != 0) {
            C46232bI r5 = this.A03;
            C59192wV r3 = r5.A03;
            C48642fE r22 = r13.A04;
            C162457s7.A0K(r22, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            C54662p5 r9 = this.A00;
            C108895dj r6 = this.A01;
            String str = this.A04;
            List list = this.A05;
            C45732aU r8 = this.A02;
            C71623cP r4 = new C71623cP(r5, r6, list, r8, r9, str, 4);
            r3.A00(r9, new AnonymousClass4JD(r8, 2), (C27131dK) r22, r4);
            return;
        }
        C53102mY r7 = (C53102mY) r13.A03.A00;
        if (r7 == null) {
            this.A02.A00(2, (Integer) null);
            return;
        }
        C45732aU r62 = this.A02;
        C44002Uh r92 = AnonymousClass32Q.A07;
        C52732lx r42 = r62.A01;
        Map map = r42.A02;
        AnonymousClass32Q r82 = r62.A02;
        C49312gK r32 = r82.A02;
        C108895dj r23 = (C108895dj) C617031x.A00(new C81303zf(r32, map));
        List list2 = r7.A03;
        if (C18310x6.A1X(list2)) {
            AnonymousClass32Q.A00(r23, r42, r82, list2);
        }
        List list3 = r7.A00;
        if (C18310x6.A1X(list3)) {
            AnonymousClass32Q.A00(r23, r42, r82, list3);
        }
        List list4 = r7.A02;
        if (C18310x6.A1X(list4)) {
            AnonymousClass36X.A06(r82.A00, r82.A03, r82.A05, r92.A00(r23, r32, list4), 4);
        }
        if (C18310x6.A1X(r7.A01)) {
            r2 = r62.A00;
            i = -2;
        } else {
            boolean A1X = C18310x6.A1X(list3);
            r2 = r62.A00;
            if (A1X) {
                i = -3;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("XFamilyCrosspostRequestSessionManager/Crosspost success for session: ");
                C18270x1.A1G(A0o, r2.A01);
                r2.A00.A00();
                return;
            }
        }
        r2.A00(i, (Integer) null);
    }

    public void BSB(Exception exc) {
        int i;
        Integer num;
        C162457s7.A0J(exc, 0);
        boolean z = exc instanceof AnonymousClass244;
        C45732aU r2 = this.A02;
        if (z) {
            C618532n r0 = ((AnonymousClass244) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public C67243On(C54662p5 r1, C108895dj r2, C45732aU r3, C46232bI r4, String str, List list) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = list;
    }

    public void BQq(IOException iOException) {
        C45732aU r5 = this.A02;
        C106245Ye.A02("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback delivery failure", (Throwable) null);
        C48582f8 r4 = (C48582f8) r5.A02.A06.get();
        C52732lx r0 = r5.A01;
        String str = r0.A01;
        C129586aY r02 = r0.A00;
        ArrayList A0c = C73783g4.A0c(r02);
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        r4.A01(str, A0c);
        AnonymousClass2ZA r2 = r5.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/Crosspost delivery failure for session: ");
        String str2 = r2.A01;
        C18270x1.A1G(A0o, str2);
        r2.A00.A02((Integer) null, (Integer) null, str2, false);
    }
}
