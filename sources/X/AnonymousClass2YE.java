package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2YE  reason: invalid class name */
public class AnonymousClass2YE {
    public MessageDigest A00;
    public final AnonymousClass2GR A01;

    public final synchronized MessageDigest A00() {
        MessageDigest messageDigest;
        messageDigest = this.A00;
        if (messageDigest == null) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                this.A00 = messageDigest;
            } catch (NoSuchAlgorithmException e) {
                throw AnonymousClass002.A0E(AnonymousClass000.A0P(e, "ABOfflineAssign assign will fail due to MD5 algorithm not found: ", AnonymousClass001.A0o()));
            }
        }
        return messageDigest;
    }

    public AnonymousClass2YE(AnonymousClass2GR r1) {
        this.A01 = r1;
    }
}
