package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0hT  reason: invalid class name and case insensitive filesystem */
public class C10150hT implements C17410vU {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ AnonymousClass0DJ A03;

    public C10150hT(AnonymousClass0DJ r6) {
        this.A03 = r6;
        C626936e.A0F(AnonymousClass000.A1W(r6.A00), "prefix has not been initialized");
        FileOutputStream fileOutputStream = new FileOutputStream(r6.A04);
        this.A01 = fileOutputStream;
        r6.A00.A03(fileOutputStream);
        C622634i r3 = r6.A03;
        AnonymousClass22O A0H = r6.A0H();
        C56292rk A002 = r6.A00;
        this.A02 = r3.A03(A0H, fileOutputStream, A002.A07(), A002.A05());
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
