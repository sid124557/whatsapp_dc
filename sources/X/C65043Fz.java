package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Fz  reason: invalid class name and case insensitive filesystem */
public final class C65043Fz implements AnonymousClass664 {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C54292oU A03;
    public final C56982ss A04;
    public final C55412qJ A05;
    public final C56892sj A06;
    public final AnonymousClass1VX A07;

    public void BQV() {
        String A072;
        if (this.A07.A0Y(C58422vE.A02, 6645)) {
            LinkedHashMap A0r = C18320x8.A0r();
            Collection A0E = this.A04.A0E();
            ArrayList A0t = C18300x5.A0t(A0E);
            for (Object next : A0E) {
                AnonymousClass31A r1 = (AnonymousClass31A) next;
                if ((r1.A05() instanceof C27991fJ) && ((A072 = r1.A07()) == null || A072.length() == 0)) {
                    A0t.add(next);
                }
            }
            Iterator it = A0t.iterator();
            while (it.hasNext()) {
                AnonymousClass31A r12 = (AnonymousClass31A) it.next();
                C54292oU r7 = this.A03;
                C56972sr r4 = this.A00;
                C64773Ex r5 = this.A01;
                AnonymousClass5ZU r6 = this.A02;
                C56892sj r8 = this.A06;
                C95814uZ A052 = r12.A05();
                C162457s7.A0K(A052, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A0r.put(AnonymousClass33v.A00(r4, r5, r6, r7, r8, (C28011fL) A052), r12);
            }
            Iterator A0q = AnonymousClass000.A0q(A0r);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                this.A05.A01(((AnonymousClass31A) A0w.getValue()).A05(), C18310x6.A0q(A0w));
            }
        }
    }

    public C65043Fz(C56972sr r1, C64773Ex r2, AnonymousClass5ZU r3, C54292oU r4, C56982ss r5, C55412qJ r6, C56892sj r7, AnonymousClass1VX r8) {
        C18260x0.A0f(r8, r4, r1, r5, r6);
        C18260x0.A0W(r2, r3, r7);
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
    }

    public String BDW() {
        return "UpdateUGNames";
    }
}
