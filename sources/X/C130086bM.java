package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6bM  reason: invalid class name and case insensitive filesystem */
public final class C130086bM extends C152817aA {
    public final C152817aA A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C130086bM(C152817aA r9, C157587iY r10) {
        HashSet A0K = AnonymousClass002.A0K();
        HashSet A0K2 = AnonymousClass002.A0K();
        HashSet A0K3 = AnonymousClass002.A0K();
        HashSet A0K4 = AnonymousClass002.A0K();
        for (C152197Xy r2 : r10.A03) {
            boolean A1U = AnonymousClass000.A1U(r2.A00, 2);
            Class cls = r2.A01;
            if (A1U) {
                A0K3.add(cls);
            } else {
                A0K.add(cls);
            }
        }
        Set set = r10.A05;
        if (!set.isEmpty()) {
            A0K.add(C178968iO.class);
        }
        this.A01 = Collections.unmodifiableSet(A0K);
        this.A02 = Collections.unmodifiableSet(A0K2);
        this.A04 = Collections.unmodifiableSet(A0K3);
        this.A05 = Collections.unmodifiableSet(A0K4);
        this.A03 = set;
        this.A00 = r9;
    }
}
