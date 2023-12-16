package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5R7  reason: invalid class name */
public final class AnonymousClass5R7 {
    public final C116985rC A00;
    public final AnonymousClass679 A01;
    public final AnonymousClass679 A02;
    public final AnonymousClass679 A03;
    public final AnonymousClass679 A04;
    public final AnonymousClass679 A05;
    public final AnonymousClass679 A06;
    public final AnonymousClass679 A07;
    public final AnonymousClass679 A08;
    public final AnonymousClass679 A09;
    public final AnonymousClass679 A0A;
    public final AnonymousClass679 A0B;
    public final AnonymousClass679 A0C;
    public final Map A0D;
    public final Map A0E;
    public final Map A0F;
    public final Map A0G = AnonymousClass001.A0t();
    public final AnonymousClass66R A0H = C154517dI.A01(new C119465x1(this));

    public final void A01(Context context) {
        C162457s7.A0J(context, 0);
        this.A06.Brf(context);
        this.A07.Brf(context);
        this.A08.Brf(context);
        this.A09.Brf(context);
        this.A0B.Brf(context);
        this.A01.Brf(context);
        this.A04.Brf(context);
        this.A0C.Brf(context);
        this.A05.Brf(context);
        AnonymousClass679 r0 = this.A02;
        if (r0 != null) {
            r0.Brf(context);
        }
        this.A0A.Brf(context);
        this.A03.Brf(context);
        Iterator A0q = AnonymousClass000.A0q(this.A0G);
        while (A0q.hasNext()) {
            ((AnonymousClass679) AnonymousClass0x2.A0W(A0q)).Brf(context);
        }
    }

    public final AnonymousClass679 A00(int i) {
        Map map = this.A0G;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass679 r1 = (AnonymousClass679) map.get(valueOf);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass679 r0 = (AnonymousClass679) this.A0F.get(valueOf);
        if (r0 == null) {
            r0 = this.A08;
        }
        C113065kp r12 = new C113065kp(r0);
        map.put(valueOf, r12);
        return r12;
    }

    public AnonymousClass5R7(C116985rC r6, C116985rC r7, C54292oU r8, C620733j r9, C187958y5 r10) {
        C93494oe r0;
        C18260x0.A0Q(r8, r9);
        C162457s7.A0J(r10, 4);
        this.A00 = r7;
        this.A06 = new C93514og(r8, r9);
        this.A07 = new C93474oc(r8, r9);
        this.A08 = new C113075kq(r8, r9);
        this.A0B = new C133516hV(r8, r9);
        this.A09 = new C133506hU(r8, r9);
        this.A01 = new C133496hT(r8, r9);
        this.A04 = new C93534oi(r8, r9, r10);
        this.A0C = new C93524oh(r8, r9);
        this.A05 = new C133546hY(r8, r9);
        if (r6.A07()) {
            C56722sS r02 = (C56722sS) r6.A04();
            r0 = new C93494oe(r02.A05, r02.A06);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A0A = new C133526hW(r8, r9);
        this.A03 = new C133536hX(r8, r9);
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass0x2.A1I(this.A06, A0t, 2);
        AnonymousClass0x2.A1I(this.A07, A0t, 3);
        AnonymousClass0x2.A1I(this.A08, A0t, 1);
        AnonymousClass0x2.A1I(this.A0B, A0t, 5);
        AnonymousClass0x2.A1I(this.A09, A0t, 6);
        AnonymousClass0x2.A1I(this.A0C, A0t, 7);
        AnonymousClass0x2.A1I(this.A05, A0t, 8);
        AnonymousClass0x2.A1I(this.A0A, A0t, 10);
        AnonymousClass0x2.A1I(this.A01, A0t, 11);
        AnonymousClass0x2.A1I(this.A04, A0t, 12);
        AnonymousClass679 r1 = this.A02;
        if (r1 != null) {
            AnonymousClass0x2.A1I(r1, A0t, 9);
        }
        if (this.A00.A07()) {
            AnonymousClass0x2.A1I(this.A0H.getValue(), A0t, 4);
        }
        AnonymousClass0x2.A1I(this.A03, A0t, 13);
        this.A0E = A0t;
        Set entrySet = A0t.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(entrySet));
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            linkedHashMap.put(Integer.valueOf(AnonymousClass0x2.A08(A0w)), A0w.getKey());
        }
        this.A0F = linkedHashMap;
        this.A0D = AnonymousClass001.A0t();
    }
}
