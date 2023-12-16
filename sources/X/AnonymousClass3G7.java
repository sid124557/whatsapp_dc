package X;

import com.whatsapp.util.Log;

/* renamed from: X.3G7  reason: invalid class name */
public class AnonymousClass3G7 implements C182368oI {
    public final C633138t A00;

    /* JADX INFO: finally extract failed */
    public C42162Na B1Z(byte[] bArr) {
        try {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets start)");
            C42162Na A002 = AnonymousClass31R.A00(AnonymousClass31Q.A00(bArr, this.A00.A03, 80));
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            return A002;
        } catch (Throwable th) {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            throw th;
        }
    }

    public AnonymousClass3G7(C633138t r1) {
        this.A00 = r1;
    }
}
