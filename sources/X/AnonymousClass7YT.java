package X;

/* renamed from: X.7YT  reason: invalid class name */
public final class AnonymousClass7YT {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YT) {
                AnonymousClass7YT r8 = (AnonymousClass7YT) obj;
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

    public AnonymousClass7YT(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QueuePlayerInfo(durationMsToFinish=");
        A0o.append(this.A01);
        A0o.append(", numberOfQueuedVideos=");
        return C18260x0.A09(A0o, this.A00);
    }
}
