package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5tJ  reason: invalid class name and case insensitive filesystem */
public final class C118295tJ extends ArrayList<C156137g5> {
    public static final C97784zF A00 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A01 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 27);
    public static final C97784zF A02 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A03 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 24);
    public static final C97784zF A04 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A05 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A06 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A07 = new C97784zF(C18320x8.A0U(), 13);
    public static final C97784zF A08 = new C97784zF(true, 13);
    public static final C97784zF A09 = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public static final C97784zF A0A = new C97784zF(Integer.valueOf(R.string.f11nameremoved), 1);
    public C118305tK latestBucket = null;
    public final C106685Zz linkifyWeb;
    public final AnonymousClass7U5 timeBucketsProvider;

    public int A00(int i) {
        if (i < 0 || i >= size()) {
            return -1;
        }
        return ((C156137g5) get(i)).A00;
    }

    public void A03(C624134x r4, boolean z) {
        C118305tK A002 = this.timeBucketsProvider.A00(r4.A0K);
        if (!AnonymousClass75J.A00(A002, this.latestBucket)) {
            C97784zF.A00(AnonymousClass0x9.A0C(A002.toString(), Boolean.valueOf(z)), this, 12);
            this.latestBucket = A002;
        }
    }

    public C118295tJ(C54292oU r3, C620733j r4, C106685Zz r5) {
        this.linkifyWeb = r5;
        this.timeBucketsProvider = new AnonymousClass7U5(r3.A00, r4);
    }

    public C624134x A01(int i) {
        return (C624134x) ((C156137g5) get(i)).A01;
    }

    public void A02(AnonymousClass1VX r6, List list, boolean z) {
        Object r0;
        int i;
        C30721mu r1;
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0T != null) {
                if (z) {
                    A03(A0T, false);
                }
                if (A0T instanceof C30481mW) {
                    ArrayList A052 = this.linkifyWeb.A05(A0T.A13(), true);
                    i = 7;
                    r1 = A0T;
                    if (A052 != null) {
                        i = 19;
                        r1 = A0T;
                    }
                } else if (A0T instanceof AnonymousClass1nF) {
                    i = 11;
                    r1 = A0T;
                } else if (A0T instanceof C30361mK) {
                    i = 20;
                    r1 = A0T;
                } else if (A0T instanceof C30721mu) {
                    C30721mu r12 = (C30721mu) A0T;
                    if (r12.A0z() != null) {
                        i = 40;
                        r1 = r12;
                    } else {
                        boolean A25 = r12.A25();
                        i = 14;
                        r1 = r12;
                        if (A25) {
                            i = 15;
                            r1 = r12;
                        }
                    }
                } else {
                    if (!(A0T instanceof C30771mz)) {
                        if (A0T instanceof AnonymousClass1n2) {
                            i = 16;
                            r1 = A0T;
                        } else if (A0T instanceof C31971pB) {
                            i = 17;
                            r1 = A0T;
                        } else if (A0T instanceof C31961pA) {
                            i = 18;
                            r1 = A0T;
                        } else if ((A0T instanceof C30421mQ) || (A0T instanceof C30411mP)) {
                            i = 21;
                            r1 = A0T;
                        } else if ((A0T instanceof C30451mT) && r6.A0X(2662)) {
                            i = 26;
                            r1 = A0T;
                        }
                    }
                    r0 = new AnonymousClass4zO(A0T);
                    add(r0);
                }
                r0 = new C97784zF(r1, i);
                add(r0);
            }
        }
    }
}
