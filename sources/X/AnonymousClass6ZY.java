package X;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* renamed from: X.6ZY  reason: invalid class name */
public final class AnonymousClass6ZY extends IntegrityTokenRequest {
    public final Long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                AnonymousClass6ZY r5 = (AnonymousClass6ZY) ((IntegrityTokenRequest) obj);
                if (this.A01.equals(r5.A01)) {
                    Long l = this.A00;
                    Long l2 = r5.A00;
                    if (l != null ? l.equals(l2) : l2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Long cloudProjectNumber() {
        return this.A00;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass000.A07(this.A00);
    }

    public final String nonce() {
        return this.A01;
    }

    public final String toString() {
        String str = this.A01;
        Long l = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IntegrityTokenRequest{nonce=");
        A0o.append(str);
        A0o.append(", cloudProjectNumber=");
        A0o.append(l);
        return AnonymousClass000.A0g(A0o);
    }

    public /* synthetic */ AnonymousClass6ZY(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }
}
