package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2Wm  reason: invalid class name and case insensitive filesystem */
public class C44552Wm {
    public final AnonymousClass39V[] A00;

    public String A00() {
        if (r6 <= 0) {
            return null;
        }
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            StringBuilder A0o = AnonymousClass001.A0o();
            for (AnonymousClass39V r1 : this.A00) {
                A0o.append(r1.A02);
                A0o.append(r1.A03);
            }
            return Base64.encodeToString(A0t.digest(A0o.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public C44552Wm(AnonymousClass39V[] r1) {
        this.A00 = r1;
    }
}
