package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.TreeSet;

/* renamed from: X.5rG  reason: invalid class name and case insensitive filesystem */
public class C117025rG implements Comparable {
    public int A00 = 0;
    public final C56972sr A01;
    public final String A02;
    public final HashMap A03 = AnonymousClass001.A0t();
    public final TreeSet A04 = new TreeSet();

    public int A00() {
        return this.A04.size();
    }

    public void A01(C117015rF r5) {
        C95814uZ r3 = r5.A04;
        Pair A0C = AnonymousClass0x9.A0C(r3, Long.valueOf(r5.A00));
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(A0C)) {
            hashMap.put(A0C, r5);
            this.A04.add(r5);
            if (this.A01.A0a(r3)) {
                this.A00++;
            }
        }
    }

    public boolean A02() {
        return AnonymousClass001.A1W(this.A00);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C117025rG r7 = (C117025rG) obj;
        boolean A022 = A02();
        if (A022 == r7.A02()) {
            TreeSet treeSet = this.A04;
            TreeSet treeSet2 = r7.A04;
            int compare = Long.compare((long) treeSet.size(), (long) treeSet2.size());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Long.compare(((C117015rF) treeSet.first()).A02, ((C117015rF) treeSet2.first()).A02);
            if (compare2 == 0) {
                return this.A02.compareTo(r7.A02);
            }
            return compare2;
        } else if (A022) {
            return 1;
        } else {
            return -1;
        }
    }

    public C117025rG(C56972sr r2, C117015rF r3, String str) {
        this.A01 = r2;
        this.A02 = str;
        A01(r3);
    }
}
