package X;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* renamed from: X.6ZZ  reason: invalid class name */
public final class AnonymousClass6ZZ extends IntegrityTokenResponse {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.A00.equals(((AnonymousClass6ZZ) ((IntegrityTokenResponse) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IntegrityTokenResponse{token=");
        A0o.append(str);
        return AnonymousClass000.A0g(A0o);
    }

    public final String token() {
        return this.A00;
    }

    public /* synthetic */ AnonymousClass6ZZ(String str) {
        this.A00 = str;
    }
}
