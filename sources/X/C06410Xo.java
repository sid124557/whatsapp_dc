package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.0Xo  reason: invalid class name and case insensitive filesystem */
public final class C06410Xo {
    public static final C06410Xo A00 = new C06410Xo();

    public static final int A01(String str) {
        try {
            return (int) C162407s0.A03(str, 0.0f);
        } catch (AnonymousClass6u2 unused) {
            C159737mN.A01("GridCommonUtils", AnonymousClass000.A0V("Invalid pixel format for grid spacing ", str, AnonymousClass001.A0o()));
            return (int) 0.0f;
        }
    }

    public final C04280Np A04(Context context, AnonymousClass84O r10) {
        AnonymousClass84O A0J = r10.A0K(94);
        if (A0J != null) {
            int A002 = AnonymousClass0JD.A00(r10);
            AnonymousClass0FW A03 = A03(A0J);
            int A003 = A00(A03, A0J);
            AnonymousClass3Z6 A05 = A05(A03, A0J, A002);
            return new C04280Np(A02(context, A03, A0J), A03, A0J, A002, A003, AnonymousClass001.A0K(A05.A0B()), AnonymousClass001.A0K(A05.A0C()));
        }
        throw AnonymousClass001.A0c("GridCommonUtils: grid layout config should be defined");
    }

    public static final int A00(AnonymousClass0FW r2, AnonymousClass84O r3) {
        int i = 41;
        if (r2.ordinal() != 0) {
            i = 40;
        }
        int A0E = r3.A0E(i, -1);
        if (A0E != -1) {
            return A0E;
        }
        throw AnonymousClass001.A0c("GridCommonUtils: span-count is required for grids");
    }

    public static final Rect A02(Context context, AnonymousClass0FW r4, AnonymousClass84O r5) {
        int i = 40;
        if (r4.ordinal() != 0) {
            i = 38;
        }
        AnonymousClass84O A0J = r5.A0K(i);
        if (A0J == null) {
            return AnonymousClass001.A0N();
        }
        return C154117cd.A01(A0J).A00(AnonymousClass73E.A00(context));
    }

    public static final AnonymousClass0FW A03(AnonymousClass84O r2) {
        int A0D = r2.A0D();
        if (A0D == 16373) {
            return AnonymousClass0FW.SIMPLE;
        }
        if (A0D == 16483) {
            return AnonymousClass0FW.STAGGERED;
        }
        throw AnonymousClass000.A0G("GridCommonUtils: Grid type is unknown for style ", AnonymousClass001.A0o(), A0D);
    }

    public final AnonymousClass3Z6 A05(AnonymousClass0FW r5, AnonymousClass84O r6, int i) {
        int i2;
        int i3;
        Integer valueOf;
        Integer valueOf2;
        if (r5.ordinal() != 0) {
            i2 = 36;
            i3 = 35;
        } else {
            i2 = 38;
            i3 = 36;
        }
        AnonymousClass3Z6 r2 = new AnonymousClass3Z6(i2, i3);
        int A0K = AnonymousClass001.A0K(r2.A0B());
        int A0K2 = AnonymousClass001.A0K(r2.A0C());
        int A01 = A01(r6.A0O(A0K));
        int A012 = A01(r6.A0O(A0K2));
        if (i == 1) {
            valueOf = Integer.valueOf(A012);
            valueOf2 = Integer.valueOf(A01);
        } else {
            valueOf = Integer.valueOf(A01);
            valueOf2 = Integer.valueOf(A012);
        }
        return new AnonymousClass3Z6(valueOf, valueOf2);
    }
}
