package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ow  reason: invalid class name and case insensitive filesystem */
public abstract class C31841ow extends C31881p0 {
    public C31841ow(AnonymousClass2z0 r7, int i, long j) {
        super(r7, (AnonymousClass39T) null, i, j);
    }

    public final HashSet A20() {
        List<C52662lq> A1z = A1z(2);
        ArrayList A0c = C73783g4.A0c(A1z);
        for (C52662lq r0 : A1z) {
            GroupJid groupJid = r0.A01;
            String str = r0.A02;
            if (str == null) {
                str = "";
            }
            C52882mC.A00(groupJid, str, A0c);
        }
        return C73723fy.A0B(A0c);
    }

    public final void A21(Set set) {
        ArrayList A0c = C73783g4.A0c(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C52882mC A0O = AnonymousClass0x7.A0O(it);
            GroupJid groupJid = A0O.A02;
            C162457s7.A0D(groupJid);
            C52662lq.A00(groupJid, A0O.A03, A0c, A0O.A00);
        }
        List list = this.A00;
        list.clear();
        list.addAll(A0c);
    }
}
