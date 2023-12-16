package com.facebook.msys.mci;

import X.AnonymousClass001;
import X.AnonymousClass2JC;
import com.facebook.msys.util.Provider;

public final class ProxyProvider {
    public final Provider mCryptoProvider;
    public final Provider mUUIDProvider;

    private Crypto getCrypto() {
        return (Crypto) retrieveProxyOrThrow(this.mCryptoProvider);
    }

    private UUID getUUID() {
        return (UUID) retrieveProxyOrThrow(this.mUUIDProvider);
    }

    public static AnonymousClass2JC newBuilder(Provider provider, Provider provider2) {
        return new AnonymousClass2JC(provider, provider2);
    }

    public ProxyProvider(AnonymousClass2JC r2) {
        this.mCryptoProvider = r2.A00;
        this.mUUIDProvider = r2.A01;
    }

    public static Object retrieveProxyOrThrow(Provider provider) {
        Object obj = provider.get();
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0c("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }
}
