package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: X.3G0  reason: invalid class name */
public final class AnonymousClass3G0 implements C836749i {
    public final C66543Lv A00;
    public final AnonymousClass3ST A01;

    public void BF5(byte[] bArr) {
        String str;
        C624134x A012 = this.A01.A01(new AnonymousClass4K1(0));
        if (!A012.A1l()) {
            Log.i("decryptmessagerunnable/axolotl message decryption had no data; ciphertext only");
            if (bArr != null) {
                try {
                    str = C18320x8.A0h(bArr);
                } catch (UnsupportedEncodingException unused) {
                }
                A012.A1Z(str);
            }
            str = null;
            A012.A1Z(str);
        }
        this.A00.A08(A012);
    }

    public AnonymousClass3G0(C66543Lv r1, AnonymousClass3ST r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
