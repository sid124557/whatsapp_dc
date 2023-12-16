package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.32s  reason: invalid class name and case insensitive filesystem */
public class C619032s {
    public Context A00;

    public String A02(String str) {
        Context context = this.A00;
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "__relative_root_1");
        File A0A2 = AnonymousClass002.A0A(context.getFilesDir(), "__relative_root_2");
        String A002 = A00(A0A, str);
        if (A002.equals(A00(A0A2, str))) {
            return A002;
        }
        throw AnonymousClass002.A0C(AnonymousClass000.A0V("Invalid relative path: ", str, AnonymousClass001.A0o()));
    }

    public C619032s(Context context) {
        this.A00 = context;
    }

    public static final String A00(File file, String str) {
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = AnonymousClass002.A0A(canonicalFile, str).getCanonicalFile();
        String path = canonicalFile.getPath();
        String path2 = canonicalFile2.getPath();
        if (!path2.startsWith(path)) {
            throw AnonymousClass002.A0C(AnonymousClass000.A0V("Invalid relative path (escapes parent): ", path2, AnonymousClass001.A0o()));
        } else if (!path2.equals(path)) {
            String substring = path2.substring(path.length() + 1);
            if (substring.length() != 0) {
                return substring;
            }
            throw AnonymousClass002.A0C(AnonymousClass000.A0T("Invalid relative path (points to root): ", path2));
        } else {
            throw AnonymousClass002.A0C(AnonymousClass000.A0T("Invalid relative path (points to root): ", path2));
        }
    }

    public static void A01(CancellationSignal cancellationSignal, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                cancellationSignal.throwIfCanceled();
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public void A03(CancellationSignal cancellationSignal, File file, File file2, byte[] bArr) {
        FileInputStream A0g;
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = file2.getCanonicalFile();
        if (!canonicalFile.equals(canonicalFile2)) {
            File parentFile = canonicalFile2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (!canonicalFile.renameTo(canonicalFile2)) {
                File canonicalFile3 = canonicalFile.getCanonicalFile();
                File canonicalFile4 = canonicalFile2.getCanonicalFile();
                if (!canonicalFile3.equals(canonicalFile4)) {
                    File parentFile2 = canonicalFile4.getParentFile();
                    if (parentFile2 != null) {
                        parentFile2.mkdirs();
                    }
                    try {
                        FileOutputStream A0h = AnonymousClass0x9.A0h(canonicalFile4);
                        try {
                            A0g = AnonymousClass0x9.A0g(canonicalFile3);
                            A01(cancellationSignal, A0g, A0h, bArr);
                            A0g.close();
                            A0h.close();
                        } catch (Throwable th) {
                            A0h.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        canonicalFile4.delete();
                        throw e;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                canonicalFile.delete();
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
