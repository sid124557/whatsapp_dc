package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.5Vz  reason: invalid class name and case insensitive filesystem */
public class C105685Vz {
    public static final Set A02;
    public final AnonymousClass5J6 A00;
    public final AnonymousClass31C A01;

    static {
        Integer[] numArr = new Integer[4];
        boolean A1Y = C18300x5.A1Y(numArr, 499);
        AnonymousClass000.A1M(numArr, 400);
        AnonymousClass000.A1N(numArr, 500);
        AnonymousClass000.A1P(numArr, A1Y ? 1 : 0, 3);
        A02 = Collections.unmodifiableSet(C18280x3.A0h(numArr));
    }

    public C105685Vz(AnonymousClass5J6 r1, AnonymousClass31C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
