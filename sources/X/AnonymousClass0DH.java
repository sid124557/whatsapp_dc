package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.0DH  reason: invalid class name */
public class AnonymousClass0DH extends AnonymousClass0DJ {
    public int A0A() {
        return 20;
    }

    public AnonymousClass0NK A0B(AnonymousClass0W0 r4, String str) {
        if (r4.A01 != null) {
            return r4.A02(this.A04, str, A0L());
        }
        Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
        return new AnonymousClass0NK(2, (String) null);
    }

    public AnonymousClass0W0 A0D(InputStream inputStream) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[4];
        int read = inputStream.read(bArr);
        int read2 = inputStream.read(bArr2);
        if (read == 16 && read2 == 4) {
            return new AnonymousClass0W0(bArr, bArr2);
        }
        Log.e("Backup/BackupFileCrypt12/footer is null");
        return null;
    }

    public AnonymousClass22O A0H() {
        return AnonymousClass22O.CRYPT12;
    }

    public AnonymousClass0W0 A0E(byte[] bArr) {
        return new AnonymousClass0W0(bArr, AnonymousClass0W0.A01(A0L()));
    }

    public AnonymousClass0DH(C56972sr r1, C06430Xr r2, AnonymousClass0WN r3, C56512s6 r4, C48502f0 r5, C48092eK r6, C48772fR r7, C622634i r8, File file) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, file);
    }
}
