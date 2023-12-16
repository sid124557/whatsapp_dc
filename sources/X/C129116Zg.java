package X;

/* renamed from: X.6Zg  reason: invalid class name and case insensitive filesystem */
public final class C129116Zg extends C1447172q {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1447172q) {
                C129116Zg r8 = (C129116Zg) ((C1447172q) obj);
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return ((this.A00 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.A00;
        long j = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EventRecord{eventType=");
        A0o.append(i);
        A0o.append(", eventTimestamp=");
        A0o.append(j);
        return AnonymousClass000.A0g(A0o);
    }

    public C129116Zg(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
