package X;

import com.whatsapp.util.Log;
import java.io.RandomAccessFile;

/* renamed from: X.5i8  reason: invalid class name and case insensitive filesystem */
public final class C111465i8 implements AnonymousClass66S {
    public final /* synthetic */ AnonymousClass35Q A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C111465i8(AnonymousClass35Q r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public void Ayo(RandomAccessFile randomAccessFile) {
        Log.i("AccountSwitchingFileManager/switchAccount/checkpointOps");
        AnonymousClass35Q r1 = this.A00;
        AnonymousClass35Q.A01(r1, randomAccessFile, this.A02);
        AnonymousClass35Q.A00(r1, randomAccessFile, this.A01);
    }

    public void Bh6() {
        Log.i("AccountSwitchingFileManager/switchAccount/postCheckpointOps");
        AnonymousClass35Q r4 = this.A00;
        String str = this.A02;
        C18260x0.A1E("AccountSwitchingFileManager/switchAccount/moveLogsBackToActiveDirectory: ", AnonymousClass001.A0o(), r4.A08(str, false));
        C18260x0.A1E("AccountSwitchingFileManager/switchAccount/copyGoogleGcmFile:", AnonymousClass001.A0o(), r4.A07(str));
        C18260x0.A1E("AccountSwitchingFileManager/switchAccount/copyDbFile:", AnonymousClass001.A0o(), r4.A06(str));
    }

    public void BhF() {
    }
}
