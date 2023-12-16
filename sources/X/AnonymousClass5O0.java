package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5O0  reason: invalid class name */
public final class AnonymousClass5O0 {
    public final C54292oU A00;
    public final C103345Mn A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public static boolean A00(AnonymousClass5YA r1, Collection collection, int i) {
        C162457s7.A0J(collection, 0);
        return ((AnonymousClass5O0) r1.A0F.get()).A01(i, collection);
    }

    public AnonymousClass5O0(C54292oU r2, C103345Mn r3, C183538qC r4, C183538qC r5) {
        C18260x0.A0Q(r2, r4);
        C162457s7.A0J(r5, 4);
        this.A00 = r2;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = r5;
    }

    public final boolean A01(int i, Collection collection) {
        C103345Mn r3;
        ArrayList arrayList;
        if (!collection.isEmpty() && AnonymousClass36X.A08(collection)) {
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!AnonymousClass36X.A07(C18300x5.A0T(it))) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    Context context = this.A00.A00;
                    C162457s7.A0D(context);
                    if ((C57672u1.A00(context) || C86654Ky.A0g(this.A03).A05(AnonymousClass21S.A0B)) && !AnonymousClass36X.A09(collection)) {
                        r3 = this.A01;
                        arrayList = C73783g4.A0d(collection);
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            C624134x.A0Z(arrayList, it2);
                        }
                    }
                } else {
                    Context context2 = this.A00.A00;
                    C162457s7.A0D(context2);
                    if (C57672u1.A00(context2) && !C86654Ky.A0g(this.A03).A05(AnonymousClass21S.A0B) && !AnonymousClass36X.A09(collection) && ((C116765qp) this.A02.get()).A00()) {
                        r3 = this.A01;
                        arrayList = C73783g4.A0d(collection);
                        Iterator it3 = collection.iterator();
                        while (it3.hasNext()) {
                            C624134x.A0Z(arrayList, it3);
                        }
                    }
                }
                if (r3.A00(arrayList)) {
                    return true;
                }
            } else {
                Context context3 = this.A00.A00;
                C162457s7.A0D(context3);
                if (C57672u1.A00(context3) || C86654Ky.A0g(this.A03).A05(AnonymousClass21S.A0B)) {
                    C103345Mn r5 = this.A01;
                    ArrayList A0d = C73783g4.A0d(collection);
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        C624134x.A0Z(A0d, it4);
                    }
                    Iterator it5 = A0d.iterator();
                    while (it5.hasNext()) {
                        long A022 = C18270x1.A02(it5);
                        C54592oy r1 = r5.A00;
                        if (!r1.A03(A022)) {
                            return true;
                        }
                        Integer A002 = r1.A00(A022);
                        if (A002 != null && 4 == A002.intValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
