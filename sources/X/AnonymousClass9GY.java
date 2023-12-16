package X;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9GY  reason: invalid class name */
public class AnonymousClass9GY extends AnonymousClass5ZM {
    public WeakReference A00;
    public final AnonymousClass36F A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Integer[] numArr = new Integer[1];
        AnonymousClass000.A1P(numArr, 300, 0);
        return this.A01.A0V(new Integer[0], numArr, 0);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            C1901694h r5 = (C1901694h) weakReference.get();
            C18320x8.A18(r5.A00, false);
            C18320x8.A18(r5.A01, true);
            C194459Sy r3 = r5.A07;
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            AnonymousClass9EU r6 = null;
            while (it.hasNext()) {
                AnonymousClass9EU A002 = r3.A00(C1899693i.A0E(it).A05);
                if (r6 != null) {
                    if (r6.get(2) == A002.get(2) && r6.get(1) == A002.get(1)) {
                        r6.count++;
                    } else {
                        A0s.add(r6);
                    }
                }
                A002.count = 0;
                r6 = A002;
                r6.count++;
            }
            if (r6 != null) {
                A0s.add(r6);
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (int i = 0; i < list.size(); i++) {
                C624034w r9 = (C624034w) list.get(i);
                AnonymousClass9FT r7 = new AnonymousClass9FT();
                r7.A01 = C107505bQ.A06(r5.A05, r5.A04.A0I(r9.A05));
                r7.A00 = r5.A08.A0R(r9);
                boolean z = true;
                if (i < list.size() - 1) {
                    AnonymousClass9EU A003 = r3.A00(r9.A05);
                    AnonymousClass9EU A004 = r3.A00(((C624034w) list.get(i + 1)).A05);
                    if (A003.get(2) != A004.get(2) || A003.get(1) != A004.get(1)) {
                        z = false;
                    }
                }
                r7.A02 = z;
                A0s2.add(r7);
            }
            r5.A02.A0H(Pair.create(A0s2, A0s));
        }
    }

    public AnonymousClass9GY(AnonymousClass36F r2, C1901694h r3) {
        this.A01 = r2;
        this.A00 = AnonymousClass0x9.A14(r3);
    }
}
