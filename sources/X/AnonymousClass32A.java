package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.32A  reason: invalid class name */
public class AnonymousClass32A {
    public static final Pattern A01 = Pattern.compile("dump\\.hprof.*");
    public final Context A00;

    public AnonymousClass32A(Context context) {
        this.A00 = context;
    }

    public static void A00(File file, File file2) {
        GZIPOutputStream gZIPOutputStream;
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        try {
            FileOutputStream A0h = AnonymousClass0x9.A0h(file2);
            try {
                gZIPOutputStream = new GZIPOutputStream(A0h);
                byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                while (true) {
                    int read = A0g.read(bArr);
                    if (read != -1) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        A0h.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                A0h.close();
                throw th;
            }
        } finally {
            A0g.close();
        }
    }
}
