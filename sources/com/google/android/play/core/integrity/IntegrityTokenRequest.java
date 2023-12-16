package com.google.android.play.core.integrity;

import X.AnonymousClass6ZX;

public abstract class IntegrityTokenRequest {

    public abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j);

        public abstract Builder setNonce(String str);
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();

    public static Builder builder() {
        return new AnonymousClass6ZX();
    }
}
