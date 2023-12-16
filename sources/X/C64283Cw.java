package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.3Cw  reason: invalid class name and case insensitive filesystem */
public final class C64283Cw implements AnonymousClass66S {
    public final /* synthetic */ AnonymousClass35Q A00;
    public final /* synthetic */ AnonymousClass66S A01;
    public final /* synthetic */ String A02;

    public C64283Cw(AnonymousClass35Q r1, AnonymousClass66S r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public void Ayo(RandomAccessFile randomAccessFile) {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/checkpointOps");
        this.A01.Ayo(randomAccessFile);
    }

    public void Bh6() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/postCheckpointOps");
        this.A01.Bh6();
        AnonymousClass35Q r3 = this.A00;
        String str = this.A02;
        C57072t2.A04("AccountSwitchingFileManager/deleteAccount/", str, AnonymousClass001.A0o());
        AnonymousClass66R r1 = r3.A0A;
        if (C18290x4.A1Y(r1)) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                Iterator A0q = C18320x8.A0q(r3.A09.getValue());
                while (A0q.hasNext()) {
                    String A0m = AnonymousClass001.A0m(A0q);
                    String absolutePath = A0B.getAbsolutePath();
                    C162457s7.A0D(absolutePath);
                    boolean A022 = AnonymousClass35Q.A02(absolutePath, A0m);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A10(A0B, "AccountSwitchingFileManager/deleteAccount/delete ", A0o);
                    A0o.append('/');
                    A0o.append(A0m);
                    C18260x0.A1E(" directory: ", A0o, A022);
                }
                A0B.delete();
                return;
            }
            C57072t2.A02(r3, "AccountSwitchingFileManager/deleteAccount/stagingDirLogString/", AnonymousClass001.A0o());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C57072t2.A03("Account ", str, A0o2);
            throw AnonymousClass000.A0I(" directory does not exist", A0o2);
        }
        throw AnonymousClass001.A0e("Staging Directory don't exist");
    }

    public void BhF() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/preCheckpointOps");
        this.A01.BhF();
    }
}
