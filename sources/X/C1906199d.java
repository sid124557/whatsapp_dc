package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.zip.ZipInputStream;

/* renamed from: X.99d  reason: invalid class name and case insensitive filesystem */
public class C1906199d extends C52452lV {
    public final File A00;
    public final Set A01 = AnonymousClass002.A0K();

    public long A00(File file, ZipInputStream zipInputStream, byte[] bArr) {
        FileOutputStream fileOutputStream;
        File file2 = new File(this.A00, file.getName());
        long j = 0;
        try {
            fileOutputStream = new FileOutputStream(file2);
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += (long) read;
                if (8192 + j > 524288000) {
                    break;
                }
            }
            this.A01.add(C627536m.A09(file2.getName()));
            fileOutputStream.close();
            return j;
        } catch (FileNotFoundException e) {
            Log.e("PAY: PaymentBackgroundBatchZipEntrySaver", e);
            return j;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C1906199d(File file) {
        super(file, 100, 524288000);
        this.A00 = file;
    }

    public boolean A01(File file) {
        String str;
        String canonicalPath = file.getCanonicalPath();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        if (!canonicalPath.startsWith(AnonymousClass000.A0X("/backgrounds", A0o))) {
            str = "PAY: PaymentBackgroundBatchZipEntrySaver/invalid zip content";
        } else if ("webp".equals(C627536m.A08(file.getAbsolutePath()))) {
            return true;
        } else {
            str = "PAY: PaymentBackgroundBatchZipEntrySaver/store: Zip entry not webp";
        }
        Log.e(str);
        return false;
    }
}
