package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Sv  reason: invalid class name and case insensitive filesystem */
public class C68353Sv implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C59772xS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public C68353Sv(C59772xS r1, String str, byte[] bArr, int i) {
        this.A01 = r1;
        this.A03 = bArr;
        this.A02 = str;
        this.A00 = i;
    }

    public void BQs(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ delivery failure");
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ error");
    }

    public void BdM(AnonymousClass36K r8, String str) {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        this.A01.A09.BkM(new C70473aY(this, this.A03, this.A02, this.A00, 12));
    }
}
