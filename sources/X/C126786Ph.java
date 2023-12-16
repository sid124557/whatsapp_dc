package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.6Ph  reason: invalid class name and case insensitive filesystem */
public class C126786Ph extends AnonymousClass88R {
    public final C178268hG A00;
    public final C186668vk A01;
    public final C129586aY A02;

    public static void A00(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C129486aO r5 = (C129486aO) list.get(i);
            if (r5 != null) {
                r5.add((Object) new C151527Vd(j, jArr[i]));
            }
        }
    }

    public C126786Ph(C166377ya r2, C178268hG r3, C186668vk r4, List list, int[] iArr) {
        super(r2, iArr);
        this.A00 = r3;
        this.A02 = C129586aY.copyOf((Collection) list);
        this.A01 = r4;
    }
}
