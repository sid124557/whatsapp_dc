package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Z1  reason: invalid class name */
public class AnonymousClass5Z1 {
    public final C55682qk A00;
    public final C54292oU A01;
    public final AnonymousClass4FV A02;

    public static boolean A01(Context context, File file, String str, String str2, Map map) {
        try {
            File A05 = C627536m.A05(file, AnonymousClass002.A0A(context.getCacheDir(), "crash_upload"), file.getName());
            StringBuilder A0l = AnonymousClass000.A0l(str2);
            if (A05 == null) {
                C18260x0.A1M(A0l, "/compress/empty; exit");
                return false;
            }
            A0l.append("/upload/attachment file: ");
            C18260x0.A1L(A0l, A05.getAbsolutePath());
            map.put(str, A05.getPath());
            return true;
        } catch (IOException e) {
            C18260x0.A14("/compress/fail; exit", AnonymousClass000.A0l(str2), e);
            return false;
        }
    }

    public static void A00(Context context, String str, String str2, Map map, Map map2) {
        if (str != null && map.containsKey(str)) {
            A01(context, (File) map.get(str), "tombstone", str2, map2);
        }
    }

    public void A02(String str, HashSet hashSet, Map map, boolean z) {
        C18260x0.A1D("/upload/success/", AnonymousClass000.A0l(str), this.A00.A0B(hashSet, map, z, false, false, false));
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            String A0m = AnonymousClass001.A0m(A0v);
            File A0B = AnonymousClass002.A0B(A0m);
            if (A0B.exists()) {
                boolean delete = A0B.delete();
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append("/Compressed attachment ");
                A0l.append(A0m);
                C18260x0.A1D(" deleted: ", A0l, delete);
            }
        }
    }

    public AnonymousClass5Z1(C55682qk r1, C54292oU r2, AnonymousClass4FV r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
