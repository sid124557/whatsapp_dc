package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.0Tr  reason: invalid class name */
public class AnonymousClass0Tr {
    public final C03460Kf A00;

    public File A02(AnonymousClass0GE r6, InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        File A0A = AnonymousClass002.A0A(A01(), A00(r6, str, true));
        try {
            fileOutputStream = new FileOutputStream(A0A);
            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return A0A;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public final File A01() {
        File A0A = AnonymousClass002.A0A(this.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0A.isFile()) {
            A0A.delete();
        }
        if (!A0A.exists()) {
            A0A.mkdirs();
        }
        return A0A;
    }

    public AnonymousClass0Tr(C03460Kf r1) {
        this.A00 = r1;
    }

    public static String A00(AnonymousClass0GE r3, String str, boolean z) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("lottie_cache_");
        A0o.append(str.replaceAll("\\W+", ""));
        if (z) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(".temp");
            str2 = AnonymousClass000.A0X(r3.extension, A0o2);
        } else {
            str2 = r3.extension;
        }
        return AnonymousClass000.A0X(str2, A0o);
    }
}
