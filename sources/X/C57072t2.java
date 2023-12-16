package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2t2  reason: invalid class name and case insensitive filesystem */
public final class C57072t2 {
    public static final String A00(AnonymousClass35Q r9) {
        int length;
        int length2;
        File[] listFiles = ((File) r9.A0A.getValue()).listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            return "stagingAccountFolders null or empty";
        }
        String str = "";
        int i = 0;
        do {
            File file = listFiles[i];
            StringBuilder A0o = AnonymousClass001.A0o();
            String name = file.getName();
            C162457s7.A0D(name);
            A0o.append(A01(name));
            String A0X = AnonymousClass000.A0X(" ->", A0o);
            File[] listFiles2 = file.listFiles();
            if (listFiles2 == null || (length2 = listFiles2.length) == 0) {
                A0X = AnonymousClass000.A0X("stagingAccountFiles null or empty", AnonymousClass000.A0l(A0X));
            } else {
                int i2 = 0;
                do {
                    File file2 = listFiles2[i2];
                    StringBuilder A0l = AnonymousClass000.A0l(A0X);
                    A0l.append(' ');
                    A0X = AnonymousClass000.A0X(file2.getName(), A0l);
                    i2++;
                } while (i2 < length2);
            }
            str = AnonymousClass001.A0j(AnonymousClass000.A0m(str, A0X), 10);
            i++;
        } while (i < length);
        return str;
    }

    public static final String A01(String str) {
        String A0B = C107575bX.A0B(str, 8);
        if (A0B != null) {
            return A0B;
        }
        return str;
    }

    public static void A02(AnonymousClass35Q r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(A00(r0));
        Log.i(sb.toString());
    }

    public static void A03(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(A01(str2));
    }

    public static void A04(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(A01(str2));
        Log.i(sb.toString());
    }
}
