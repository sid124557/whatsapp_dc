package X;

/* renamed from: X.7YD  reason: invalid class name */
public final class AnonymousClass7YD {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YD) {
                AnonymousClass7YD r8 = (AnonymousClass7YD) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A02(this.A00), this.A01);
    }

    public AnonymousClass7YD(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScheduledReminder(messageRowId=");
        A0o.append(this.A00);
        A0o.append(", scheduledTimestampMs=");
        return C18270x1.A0U(A0o, this.A01);
    }
}
