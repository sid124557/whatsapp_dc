package X;

import java.io.File;

/* renamed from: X.5N8  reason: invalid class name */
public class AnonymousClass5N8 {
    public final C54292oU A00;
    public final C96204vy A01;

    public File A00() {
        File A0A = AnonymousClass002.A0A(this.A00.A00.getFilesDir(), "biz_directory");
        if (!A0A.exists()) {
            A0A.mkdirs();
        }
        return AnonymousClass002.A0A(A0A, "directory_recent_search_history");
    }

    public AnonymousClass5N8(C54292oU r1, C96204vy r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
