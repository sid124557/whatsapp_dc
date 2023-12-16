package X;

/* renamed from: X.2yh  reason: invalid class name and case insensitive filesystem */
public final class C60522yh {
    public int A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60522yh) {
                C60522yh r8 = (C60522yh) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A02(this.A01) + this.A00;
    }

    public C60522yh(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralSyncResponseInfo(lastSyncResponseSentTimestamp=");
        A0o.append(this.A01);
        A0o.append(", noOfRetriesSentAlready=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C60522yh() {
        this(0, 0);
    }
}
