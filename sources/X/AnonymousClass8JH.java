package X;

import com.whatsapp.util.Log;

/* renamed from: X.8JH  reason: invalid class name */
public class AnonymousClass8JH implements AnonymousClass4EZ {
    public final /* synthetic */ C02010Dh A00;
    public final /* synthetic */ C161767qP A01;
    public final /* synthetic */ C35711xJ A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public AnonymousClass8JH(C02010Dh r1, C161767qP r2, C35711xJ r3, byte[] bArr, byte[] bArr2) {
        this.A01 = r2;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r2, String str) {
        C161767qP.A02(r2, this.A00, str);
    }

    public void BdM(AnonymousClass36K r20, String str) {
        byte[] bArr = this.A04;
        byte[] bArr2 = this.A03;
        C35711xJ r7 = this.A02;
        C02010Dh r3 = this.A00;
        String str2 = str;
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess id=", str2, AnonymousClass001.A0o());
        AnonymousClass36K r12 = r20;
        try {
            AnonymousClass36K A022 = C41032Ir.A02(r12, r7);
            Class<byte[]> cls = byte[].class;
            byte[] bArr3 = (byte[]) C626836d.A06(r12, cls, AnonymousClass0x2.A0U(), 1024L, (Object) null, new String[]{"r2", "#elementValue"}, false);
            byte[] bArr4 = (byte[]) C626836d.A06(r12, cls, 32L, 32, (Object) null, new String[]{"opaque_c", "#elementValue"}, false);
            AnonymousClass92Z.A01(A022, r12, 94);
            byte[] bArr5 = C161767qP.A02;
            int length = bArr5.length;
            int length2 = bArr3.length;
            byte[] bArr6 = new byte[(length + length2)];
            System.arraycopy(bArr5, 0, bArr6, 0, length);
            System.arraycopy(bArr3, 0, bArr6, length, length2);
            if (!AnonymousClass0YS.A06(bArr6, (byte[]) C626836d.A06(r12, cls, 64L, 64, (Object) null, new String[]{"r2_sig", "#elementValue"}, false), bArr2)) {
                C18260x0.A0r("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess/r2 cannot be verified with r2_sig and ed_pub id=", str2, AnonymousClass001.A0o());
                r3.BSG("r2 cannot be verified with r2_sig and ed_pub", 2, -1);
                return;
            }
            r3.A00.A02();
            r3.A01.BkM(new C13000mT(r3, bArr, bArr3, bArr4));
        } catch (AnonymousClass24Y e) {
            Log.e("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess/invalid server response", e);
            r3.BSG("invalid server response", 1, -1);
        }
    }

    public void BQs(String str) {
        C18260x0.A0r("encb/EncryptedBackupProtocolHelper/sendBeginRegI/onDeliveryFailure id=", str, AnonymousClass001.A0o());
        this.A00.BSG("delivery failure", 3, -1);
    }
}
