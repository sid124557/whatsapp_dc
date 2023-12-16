package X;

import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.5Yh  reason: invalid class name and case insensitive filesystem */
public class C106275Yh {
    public static File A00;

    public static synchronized File A00(C64393Dh r9, C60152y5 r10, C633138t r11, String str, int i) {
        File file;
        synchronized (C106275Yh.class) {
            A00 = C107655bf.A0Q(r9, r10, r11, str, 0, i);
            SharedPreferences.Editor A002 = C60152y5.A00(r10, C58152un.A0A);
            A002.putString("external_file_image", A00.getAbsolutePath());
            A002.apply();
            file = A00;
        }
        return file;
    }

    public static synchronized File A01(C60152y5 r3) {
        File file;
        String A0Z;
        synchronized (C106275Yh.class) {
            if (A00 == null && (A0Z = C18280x3.A0Z(r3.A03(C58152un.A0A), "external_file_image")) != null) {
                A00 = AnonymousClass002.A0B(A0Z);
            }
            file = A00;
        }
        return file;
    }
}
