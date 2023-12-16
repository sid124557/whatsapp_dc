package X;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* renamed from: X.6ZX  reason: invalid class name */
public final class AnonymousClass6ZX extends IntegrityTokenRequest.Builder {
    public Long A00;
    public String A01;

    public final IntegrityTokenRequest build() {
        String str = this.A01;
        if (str != null) {
            return new AnonymousClass6ZY(str, this.A00);
        }
        throw AnonymousClass001.A0e("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.A01 = str;
            return this;
        }
        throw AnonymousClass001.A0g("Null nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.A00 = Long.valueOf(j);
        return this;
    }
}
