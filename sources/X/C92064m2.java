package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4m2  reason: invalid class name and case insensitive filesystem */
public class C92064m2 extends AnonymousClass54L {
    public final C64773Ex A00;
    public final AnonymousClass2ML A01;

    public C92064m2(C64773Ex r1, AnonymousClass5ZU r2, C89634eX r3, C620733j r4, AnonymousClass2ML r5, List list) {
        super(r2, r3, r4, list);
        this.A00 = r1;
        this.A01 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list;
        ArrayList A0s = AnonymousClass001.A0s();
        WeakReference weakReference = this.A02;
        C89634eX r2 = (C89634eX) weakReference.get();
        if (r2 != null) {
            r2.A7U(A0s);
            C89634eX r1 = (C89634eX) weakReference.get();
            if (r1 != null && (list = r1.A0X) != null && !list.isEmpty() && r1.A0Z) {
                HashSet A0K = AnonymousClass002.A0K();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C86624Kv.A1H(C18310x6.A0R(it), A0K);
                }
                List list2 = r2.A0X;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C95814uZ A0P = C18300x5.A0P(it2);
                        if (A0P != null && !A0K.contains(A0P)) {
                            AnonymousClass3ZH A0A = this.A00.A0A(A0P);
                            if (A0A.A0F != null) {
                                A0s.add(A0A);
                            }
                        }
                    }
                }
            }
            if (!this.A01.A01.A0X(3764)) {
                Iterator it3 = A0s.iterator();
                while (it3.hasNext()) {
                    if (C627336j.A0L(C86604Kt.A0b(it3))) {
                        it3.remove();
                    }
                }
            }
            Collections.sort(A0s, new C91844lE(this.A00, this.A01));
        }
        Iterator it4 = A0s.iterator();
        while (it4.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it4);
            A0R.A0y = C86644Kx.A1Y(A0R, C95814uZ.class, this.A03);
        }
        return A0s;
    }
}
