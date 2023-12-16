package X;

import java.util.HashMap;

/* renamed from: X.2Vx  reason: invalid class name and case insensitive filesystem */
public class C44402Vx {
    public final HashMap A00 = AnonymousClass001.A0t();

    public void A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        AnonymousClass2ZX r1 = new AnonymousClass2ZX(bArr, bArr3, i);
        HashMap hashMap = this.A00;
        hashMap.put(new C48572f7(str, bArr2), r1);
        C18260x0.A0s("BackupCipherKeys/updateKeyForBackupFile v=", str, AnonymousClass001.A0o());
        hashMap.size();
    }
}
