package X;

import java.security.KeyStore;

/* renamed from: X.9kN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201579kN implements AnonymousClass4C1 {
    public final Object get() {
        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load((KeyStore.LoadStoreParameter) null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            keyStore = null;
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: TrustedDeviceKeyStore keystore load threw: ", e);
            if (keyStore == null) {
                return null;
            }
            return new AnonymousClass9R1(keyStore);
        }
        return new AnonymousClass9R1(keyStore);
    }
}
