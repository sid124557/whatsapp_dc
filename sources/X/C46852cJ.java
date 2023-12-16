package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2cJ  reason: invalid class name and case insensitive filesystem */
public final class C46852cJ {
    public final C69263Wi A00;
    public final C106685Zz A01;
    public final C29121iJ A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;

    public C46852cJ(C69263Wi r2, C106685Zz r3, C29121iJ r4, C183538qC r5, C183538qC r6, C183538qC r7) {
        C18260x0.A0f(r2, r3, r4, r5, r6);
        C162457s7.A0J(r7, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
    }

    public final void A00(AnonymousClass223 r7, List list, Map map, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A0W = C18280x3.A0W(map, C18270x1.A02(it));
            if (A0W == null) {
                C626936e.A0D(false, "CrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A0s.add(A0W);
            }
        }
        C69263Wi r4 = this.A00;
        C29121iJ r3 = this.A02;
        C183538qC r1 = this.A04;
        C162457s7.A0J(r7, 1);
        C55202py r2 = (C55202py) r1.get();
        ContentValues A06 = AnonymousClass0x9.A06();
        C18270x1.A0b(A06, "state", i);
        C56012rH r0 = r2.A01;
        r0.A02();
        r0.A04(r7, A0s, i);
        r2.A01(A06, r7, A0s);
        C69263Wi.A06(r4, r3, A0s, 39);
    }
}
