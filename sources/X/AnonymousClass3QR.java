package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.3QR  reason: invalid class name */
public final class AnonymousClass3QR implements C185088t4 {
    public final C72143dF A00;
    public final AnonymousClass3QT A01;

    public void Ayb() {
        this.A00.Ayb();
    }

    public AnonymousClass7E5 B2A() {
        String A0X;
        AnonymousClass7E5 B2A = this.A00.B2A();
        C625435m r3 = B2A.A00;
        if (AnonymousClass000.A1T(r3.A01)) {
            AnonymousClass3QT r0 = this.A01;
            String str = r0.A03;
            MessageDigest messageDigest = r0.A04;
            if (messageDigest == null) {
                A0X = AnonymousClass000.A0V("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str, AnonymousClass001.A0o());
            } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
                A0o.append(str);
                A0o.append("; calculatedHash=");
                A0X = AnonymousClass000.A0X(C18290x4.A0t(messageDigest.digest()), A0o);
            }
            Log.w(A0X);
            Log.e("encrypteddownloadtransfer/download/hash verification fail");
            return new AnonymousClass7E5(C625435m.A00(r3.A03, 7, r3.A05));
        }
        return B2A;
    }

    public void cancel() {
        this.A00.cancel();
    }

    public AnonymousClass3QR(C56492s4 r11, C56612sH r12, C55002pd r13, C149777Nv r14, C56852sf r15, C184458rr r16, C29011i8 r17) {
        AnonymousClass3QT r1 = new AnonymousClass3QT(r14.A00, r14.A01, r14.A03, r14.A04);
        this.A01 = r1;
        this.A00 = new C72143dF(r11, r12, r13, r15, new AnonymousClass7L2(r1, r14.A02, false), r16, r17, (C46822cG) null, false);
    }
}
