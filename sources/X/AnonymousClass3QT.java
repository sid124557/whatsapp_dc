package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3QT  reason: invalid class name */
public class AnonymousClass3QT implements C185098t5 {
    public final C185098t5 A00;
    public final C633138t A01;
    public final String A02;
    public final String A03;
    public final MessageDigest A04;
    public final MessageDigest A05;

    public OutputStream BgO(AnonymousClass4GL r8) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 == null || (messageDigest = this.A04) == null) {
            throw new C1000559g(26);
        }
        return new DigestOutputStream(new AnonymousClass201(new AnonymousClass3G7(this.A01).B1Z(Base64.decode(this.A02, 0)), new DigestOutputStream(this.A00.BgO(r8), messageDigest), (long) ((AnonymousClass3PZ) r8).A01.getContentLength()), messageDigest2);
    }

    public AnonymousClass3QT(C185098t5 r3, C633138t r4, String str, String str2) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        this.A00 = r3;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4;
        try {
            messageDigest = AnonymousClass0x7.A0t();
        } catch (NoSuchAlgorithmException e) {
            Log.e("encryptedstreamdownload/digest error", e);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = AnonymousClass0x7.A0t();
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
            messageDigest2 = null;
        }
        this.A04 = messageDigest2;
    }

    public long BA7() {
        return 0;
    }

    public void Brp() {
    }
}
