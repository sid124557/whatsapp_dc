package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2lg  reason: invalid class name and case insensitive filesystem */
public final class C52562lg {
    public final long A00;
    public final AnonymousClass36K A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52562lg) {
                C52562lg r8 = (C52562lg) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00(C18300x5.A04(this.A01), this.A00) + AnonymousClass000.A07(this.A02);
    }

    public C52562lg(AnonymousClass36K r1, Long l, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OutgoingAckReceipt(tag=");
        AnonymousClass36K r1 = this.A01;
        A0o.append(r1.A00);
        A0o.append(", id=");
        A0o.append(AnonymousClass36K.A0L(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        A0o.append(", loggableStanzaId=");
        A0o.append(this.A00);
        A0o.append(" rowId=");
        return C18260x0.A04(this.A02, A0o);
    }
}
