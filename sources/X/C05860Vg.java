package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Vg  reason: invalid class name and case insensitive filesystem */
public class C05860Vg {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public C05860Vg(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public C05860Vg(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public C05860Vg(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
