package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.0o0  reason: invalid class name and case insensitive filesystem */
public class C13950o0 extends DigestOutputStream {
    public long A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass0DJ A02;
    public final /* synthetic */ File A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13950o0(AnonymousClass0DJ r3, File file, OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
        this.A02 = r3;
        this.A03 = file;
    }

    public void close() {
        if (this.A01) {
            Log.i("BackupFile/get-output-stream/close/already-closed");
            return;
        }
        flush();
        byte[] digest = getMessageDigest().digest();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFile/get-output-stream/close/writing-digest ");
        A0o.append(C627236i.A07(digest));
        A0o.append(" bytes written = ");
        Log.i(AnonymousClass001.A0k(A0o, this.A00));
        AnonymousClass0DJ r1 = this.A02;
        AnonymousClass0DJ.A01(r1.A0E(digest), this);
        super.close();
        this.A01 = true;
        File file = r1.A04;
        file.delete();
        File file2 = this.A03;
        if (!file2.renameTo(file)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("File.renameTo failed: ");
            A0o2.append(file2);
            A0o2.append(" ");
            A0o2.append(file2.exists());
            A0o2.append(" ");
            A0o2.append(file);
            A0o2.append(" ");
            A0o2.append(file.exists());
            throw AnonymousClass002.A0C(A0o2.toString());
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.A00 += (long) (i2 - i);
    }

    public void write(int i) {
        super.write(i);
        this.A00++;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
