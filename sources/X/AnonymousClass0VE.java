package X;

import android.content.Context;

/* renamed from: X.0VE  reason: invalid class name */
public final class AnonymousClass0VE {
    public static final C141896wJ A00(C141896wJ r1, String str) {
        C162457s7.A0J(r1, 1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return C141896wJ.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return C141896wJ.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return C141896wJ.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return C141896wJ.FLEX_START;
                    }
                    break;
            }
        }
        return r1;
    }

    public static final C151627Vn A02(AnonymousClass0OS r8, C152987aU r9, AnonymousClass84O r10, int i, int i2) {
        C162457s7.A0J(r10, 2);
        C160247nJ A00 = r8.A00(r10);
        Context A02 = r9.A02();
        C158047jL r3 = new C158047jL(r10);
        Object A04 = r9.A04();
        AnonymousClass73A.A00((C153427bI) A04);
        return r8.A01(new AnonymousClass6NK(A02, A00, r3, A04, r9.A01(), i, i2), r10);
    }

    public static final C141006us A01(AnonymousClass84O r4) {
        C141006us r3 = C141006us.LIST;
        String A0O = r4.A0O(96);
        AnonymousClass84O A0J = r4.A0K(94);
        if (A0O == null || A0J == null) {
            return r3;
        }
        if (A0O.equals("grid")) {
            if (A0J.A0D() == 16373) {
                return C141006us.GRID;
            }
            throw AnonymousClass001.A0c("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        } else if (!A0O.equals("staggered_grid")) {
            return r3;
        } else {
            if (A0J.A0D() == 16483) {
                return C141006us.STAGGERED_GRID;
            }
            throw AnonymousClass001.A0c("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
    }
}
