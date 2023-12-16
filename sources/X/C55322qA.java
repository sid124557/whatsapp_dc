package X;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2qA  reason: invalid class name and case insensitive filesystem */
public class C55322qA {
    public final C56492s4 A00;
    public final C54292oU A01;
    public final AnonymousClass306 A02;

    public AnonymousClass7IJ A00() {
        File A0A = AnonymousClass002.A0A(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (!A0A.exists() || !C18300x5.A1V(A0A, "thumbnails")) {
            return null;
        }
        return new AnonymousClass7IJ(A02("dark"), A02("light"));
    }

    public File A01(String str) {
        File A0A = AnonymousClass002.A0A(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (A0A.exists()) {
            File A0A2 = C18270x1.A0A(A0A, ".jpg", AnonymousClass000.A0l(str));
            if (A0A2.exists()) {
                return A0A2;
            }
        }
        return null;
    }

    public final List A02(String str) {
        File[] listFiles;
        File A0A = AnonymousClass002.A0A(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (A0A.exists()) {
            File A0A2 = AnonymousClass002.A0A(A0A, "thumbnails");
            if (A0A2.exists()) {
                File A0A3 = AnonymousClass002.A0A(A0A2, str);
                if (A0A3.exists() && (listFiles = A0A3.listFiles()) != null) {
                    Arrays.sort(listFiles, new AnonymousClass91S(53));
                    return Arrays.asList(listFiles);
                }
            }
        }
        return AnonymousClass001.A0s();
    }

    public C55322qA(C56492s4 r1, C54292oU r2, AnonymousClass306 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
