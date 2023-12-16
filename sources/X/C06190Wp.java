package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Wp  reason: invalid class name and case insensitive filesystem */
public class C06190Wp {
    public final IdentityCredential A00;
    public final Signature A01;
    public final Cipher A02;
    public final Mac A03;

    public IdentityCredential A00() {
        return this.A00;
    }

    public C06190Wp(IdentityCredential identityCredential) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A00 = identityCredential;
    }

    public C06190Wp(Signature signature) {
        this.A01 = signature;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public C06190Wp(Cipher cipher) {
        this.A01 = null;
        this.A02 = cipher;
        this.A03 = null;
        this.A00 = null;
    }

    public C06190Wp(Mac mac) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = mac;
        this.A00 = null;
    }
}
