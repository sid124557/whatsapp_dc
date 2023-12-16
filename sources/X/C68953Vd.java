package X;

import java.util.List;

/* renamed from: X.3Vd  reason: invalid class name and case insensitive filesystem */
public final class C68953Vd implements AnonymousClass4GF {
    public final C183538qC A00;
    public final C183538qC A01;

    public void BhW(C624134x r6, C378824k r7) {
        C162457s7.A0J(r6, 0);
        List<AnonymousClass3ZM> list = r6.A18;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass3ZM r2 : list) {
                ((C623334p) this.A00.get()).A05(r2.A00);
            }
        }
        ((C53132mb) this.A01.get()).A00(r6);
        if (list != null && !list.isEmpty() && r7 != null) {
            throw C18260x0.A02(C68953Vd.class);
        }
    }

    public C68953Vd(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
