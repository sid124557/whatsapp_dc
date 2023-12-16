package X;

/* renamed from: X.7Yt  reason: invalid class name and case insensitive filesystem */
public final class C152407Yt {
    public final long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152407Yt) {
                C152407Yt r8 = (C152407Yt) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A02(this.A00) + C18270x1.A00(this.A02)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C152407Yt(long j, String str, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorMessage(errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorTitle=");
        A0o.append(this.A02);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.A01, A0o);
    }
}
