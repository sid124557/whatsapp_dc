package X;

import com.whatsapp.jid.GroupJid;
import java.util.Comparator;

/* renamed from: X.3cq  reason: invalid class name and case insensitive filesystem */
public class C71893cq implements Comparator {
    public final C56982ss A00;

    /* renamed from: A00 */
    public int compare(C52882mC r8, C52882mC r9) {
        int i = r8.A00;
        int i2 = r9.A00;
        if (i == 3 && i != i2) {
            return -1;
        }
        if (i2 == 3 && i != i2) {
            return 1;
        }
        C56982ss r4 = this.A00;
        GroupJid groupJid = r8.A02;
        boolean A0M = r4.A0M(groupJid);
        GroupJid groupJid2 = r9.A02;
        if (r4.A0M(groupJid2)) {
            if (!A0M) {
                return -1;
            }
        } else if (A0M) {
            return 1;
        }
        int A05 = r4.A05(groupJid, groupJid2);
        if (A05 == 0) {
            return r8.A03.compareTo(r9.A03);
        }
        return A05;
    }

    public C71893cq(C56982ss r1) {
        this.A00 = r1;
    }
}
