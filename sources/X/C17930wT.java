package X;

import java.util.Comparator;

/* renamed from: X.0wT  reason: invalid class name and case insensitive filesystem */
public class C17930wT implements Comparator {
    public Object A00;
    public final int A01;

    public C17930wT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                return ((C04700Qh) obj).A02 - ((C04700Qh) obj2).A02;
            case 1:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            default:
                float A05 = AnonymousClass001.A05(((AnonymousClass0PJ) obj).A01);
                float A052 = AnonymousClass001.A05(((AnonymousClass0PJ) obj2).A01);
                if (A052 > A05) {
                    return 1;
                }
                if (A05 > A052) {
                    return -1;
                }
                return 0;
        }
    }
}
