package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ov  reason: invalid class name and case insensitive filesystem */
public abstract class C31831ov extends C31881p0 {
    public C31831ov(AnonymousClass2z0 r7, int i, long j) {
        super(r7, (AnonymousClass39T) null, i, j);
    }

    public final List A20(int i) {
        List list = this.A00;
        ArrayList A0t = C18300x5.A0t(list);
        for (Object next : list) {
            if (((C52662lq) next).A00 == 2) {
                A0t.add(next);
            }
        }
        List<C52662lq> A0J = C73723fy.A0J(C73723fy.A0H(A0t, 36), i);
        ArrayList A0c = C73783g4.A0c(A0J);
        for (C52662lq r0 : A0J) {
            GroupJid groupJid = r0.A01;
            String str = r0.A02;
            if (str == null) {
                str = "";
            }
            C52882mC.A00(groupJid, str, A0c);
        }
        return A0c;
    }

    public final void A21(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C52882mC A0O = AnonymousClass0x7.A0O(it);
            List list = this.A00;
            GroupJid groupJid = A0O.A02;
            C162457s7.A0D(groupJid);
            C52662lq.A01(groupJid, A0O.A03, list, 2);
        }
    }
}
