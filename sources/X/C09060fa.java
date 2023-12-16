package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0fa  reason: invalid class name and case insensitive filesystem */
public abstract class C09060fa implements C15360rD {
    public C15370rE A00;
    public Object A01;
    public final AnonymousClass0UM A02;
    public final List A03 = AnonymousClass001.A0s();
    public final List A04 = AnonymousClass001.A0s();

    public abstract boolean A02(C06250Wv r1);

    public abstract boolean A03(Object obj);

    public final void A01(C15370rE r9, Object obj) {
        List list = this.A04;
        if (!list.isEmpty() && r9 != null) {
            if (obj == null || A03(obj)) {
                C09080fc r92 = (C09080fc) r9;
                synchronized (r92.A01) {
                    C16740tt r0 = r92.A00;
                    if (r0 != null) {
                        r0.BMM(list);
                    }
                }
                return;
            }
            C09080fc r93 = (C09080fc) r9;
            synchronized (r93.A01) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    if (r93.A00(((C06250Wv) next).A0J)) {
                        A0s.add(next);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C06240Wu.A02(C06240Wu.A00(), (C06250Wv) it.next(), "Constraints met for ", C03190Je.A00, AnonymousClass001.A0o());
                }
                C16740tt r02 = r93.A00;
                if (r02 != null) {
                    r02.BML(A0s);
                }
            }
        }
    }

    public C09060fa(AnonymousClass0UM r2) {
        this.A02 = r2;
    }
}
