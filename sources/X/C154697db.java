package X;

import android.graphics.Bitmap;

/* renamed from: X.7db  reason: invalid class name and case insensitive filesystem */
public final class C154697db {
    public static final AnonymousClass66R A00 = AnonymousClass8P7.A00(AnonymousClass8XD.A00);

    public static final int A00(Bitmap.Config config) {
        switch (AnonymousClass6CA.A04(config, AnonymousClass76S.A00)) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw AnonymousClass002.A0G("The provided Bitmap.Config is not supported");
        }
    }
}
