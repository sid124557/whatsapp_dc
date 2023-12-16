package X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.8NT  reason: invalid class name */
public class AnonymousClass8NT implements Comparator, C187468xG {
    public long A00;
    public final long A01;
    public final TreeSet A02 = new TreeSet(this);

    public void A00(C186458vL r6, long j) {
        try {
            C153827c5.A01("evictCache");
            C187478xH r62 = (C187478xH) r6;
            while (this.A00 + j > this.A01) {
                TreeSet treeSet = this.A02;
                if (treeSet.isEmpty()) {
                    break;
                }
                r62.BjP((C172488Li) treeSet.first(), "lru_policy");
            }
        } finally {
            C153827c5.A00();
        }
    }

    public void Bbr(C186458vL r5, C172488Li r6) {
        this.A02.add(r6);
        this.A00 += r6.A04;
        A00(r5, 0);
    }

    public void Bbs(C186458vL r5, C172488Li r6) {
        this.A02.remove(r6);
        this.A00 -= r6.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C172488Li r10 = (C172488Li) obj;
        C172488Li r11 = (C172488Li) obj2;
        long j = r10.A03;
        long j2 = r11.A03;
        if (j - j2 == 0) {
            return r10.compareTo(r11);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public AnonymousClass8NT(long j) {
        this.A01 = j;
    }

    public void Bbt(C140846uc r1, C186458vL r2, C172488Li r3, C172488Li r4) {
        Bbs(r2, r3);
        Bbr(r2, r4);
    }

    public void BSI(String str, String str2, int i, int i2) {
    }

    public void BcC(C186458vL r1, String str, long j, long j2) {
        A00(r1, j2);
    }
}
