package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3X2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X2 implements C84134Bd {
    public final /* synthetic */ C621033m A00;
    public final /* synthetic */ C108845de A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public final void AwB(Object obj) {
        C621033m r4 = this.A00;
        List list = this.A03;
        String str = this.A02;
        C108845de r6 = this.A01;
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            A0p.add(C18300x5.A0T(it).A1J.A00);
        }
        r4.A0g.A01(new C70173a4(r4.A03((C66513Ls) null, r6, (C55162pu) null, (AnonymousClass2U8) null, (C624134x) null, (C55592qb) null, new C69193Wb(), (Integer) null, str, A0p, (List) null, false, false, false), 38, r4), 69);
    }

    public /* synthetic */ AnonymousClass3X2(C621033m r1, C108845de r2, String str, List list) {
        this.A00 = r1;
        this.A03 = list;
        this.A02 = str;
        this.A01 = r2;
    }
}
