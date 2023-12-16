package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0hU  reason: invalid class name and case insensitive filesystem */
public class C10160hU implements C17410vU {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ AnonymousClass0DE A03;

    public C10160hU(AnonymousClass0DE r5) {
        this.A03 = r5;
        FileOutputStream fileOutputStream = new FileOutputStream(r5.A04);
        this.A01 = fileOutputStream;
        this.A02 = r5.A03.A03(AnonymousClass22O.UNENCRYPTED, fileOutputStream, (byte[]) null, (byte[]) null);
    }

    public void Bsc(File file) {
        if (file != null && file.isFile() && file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ZipOutputStream zipOutputStream = this.A02;
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                C627536m.A0I(fileInputStream, zipOutputStream);
                zipOutputStream.closeEntry();
                fileInputStream.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public void close() {
        if (!this.A00) {
            this.A02.close();
            this.A01.close();
            this.A00 = true;
        }
    }
}
