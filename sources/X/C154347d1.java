package X;

import java.io.File;
import java.util.List;

/* renamed from: X.7d1  reason: invalid class name and case insensitive filesystem */
public final class C154347d1 {
    public static final AnonymousClass2UD A00(AnonymousClass32B r16, C633138t r17, int i, boolean z) {
        C633138t r3 = r17;
        C162457s7.A0J(r3, 0);
        int i2 = i;
        return new AnonymousClass2UD(r16, (C148267Hs) null, r3, (File) null, (String) null, (String) null, "optimistic", (List) null, (int[]) null, i2, 0, 1, 0, true, z, true, AnonymousClass000.A1U(i2, 3));
    }

    public static final AnonymousClass2UD A01(C148267Hs r19, C633138t r20, File file) {
        String str;
        C633138t r3 = r20;
        boolean A05 = AnonymousClass36O.A05(r3);
        boolean z = !A05;
        if (A05) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        return new AnonymousClass2UD((AnonymousClass32B) null, r19, r3, file, (String) null, (String) null, str, (List) null, (int[]) null, 0, 0, 1, 0, true, true, z, false);
    }
}
