package X;

/* renamed from: X.5SN  reason: invalid class name */
public final class AnonymousClass5SN {
    public final long A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SN) {
                AnonymousClass5SN r8 = (AnonymousClass5SN) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        return AnonymousClass0x2.A00(AnonymousClass000.A00(((int) (j ^ (j >>> 32))) * 31, this.A00), this.A01);
    }

    public AnonymousClass5SN(long j, long j2, long j3) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SessionDuration(sessionTotalTime=");
        A0o.append(this.A02);
        A0o.append(", sessionBackgroundTime=");
        A0o.append(this.A00);
        A0o.append(", sessionForegroundTime=");
        return C18270x1.A0U(A0o, this.A01);
    }
}
