package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.Channels;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.0DE  reason: invalid class name */
public class AnonymousClass0DE extends AnonymousClass0UR {
    public AnonymousClass0DE(C56512s6 r7, C48092eK r8, C622634i r9, File file) {
        super((C06430Xr) null, r7, r8, r9, file);
    }

    public AnonymousClass0NK A03() {
        return new AnonymousClass0NK(1, (String) null);
    }

    public AnonymousClass0NK A04(C54292oU r6, AnonymousClass4BZ r7, File file, int i, int i2, boolean z) {
        FileInputStream fileInputStream;
        AnonymousClass202 A00 = this.A02.A00(file);
        try {
            fileInputStream = new FileInputStream(this.A04);
            C06550Ye.A0K(r7, fileInputStream.getChannel(), Channels.newChannel(A00), i, i2);
            A00.flush();
            AnonymousClass0NK r0 = new AnonymousClass0NK(1, (String) null);
            fileInputStream.close();
            A00.close();
            return r0;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C17410vU A05(Context context) {
        return new C10160hU(this);
    }

    public void A06(C16370su r5, File file) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(this.A04);
        try {
            fileInputStream = new FileInputStream(file);
            AnonymousClass0UR.A02(r5, fileInputStream, fileOutputStream, file.length());
            fileInputStream.close();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A08(C16380sv r8, boolean z) {
        ZipInputStream A02;
        AnonymousClass202 A00;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.A04));
        try {
            A02 = this.A03.A02(AnonymousClass22O.UNENCRYPTED, bufferedInputStream, new AtomicLong(), (byte[]) null, (byte[]) null);
            try {
                for (ZipEntry nextEntry = A02.getNextEntry(); nextEntry != null; nextEntry = A02.getNextEntry()) {
                    File file = (File) r8.apply(nextEntry.getName());
                    if (file != null) {
                        A00 = this.A02.A00(file);
                        C627536m.A0I(A02, A00);
                        A00.close();
                    }
                    A02.closeEntry();
                }
                A02.close();
                bufferedInputStream.close();
                return true;
                throw th;
                throw th;
            } catch (Exception e) {
                Log.e("unencrypted-backup-file/restore-multi-file-backup/restore failed", e);
                A02.close();
                bufferedInputStream.close();
                return false;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public boolean A07(Context context) {
        return true;
    }

    public boolean A09(String str) {
        return false;
    }
}
