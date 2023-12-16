package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.7Er  reason: invalid class name and case insensitive filesystem */
public class C147537Er {
    public SecureRandom A00;

    public C147537Er() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw C143806zV.A00("SHA1PRNGalgorithm not found.");
        }
    }
}
