package X;

/* renamed from: X.6Kj  reason: invalid class name and case insensitive filesystem */
public class C126016Kj extends AnonymousClass8L6 {
    public long realtimeMs;
    public long uptimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C126016Kj r7 = (C126016Kj) obj;
            if (!(this.uptimeMs == r7.uptimeMs && this.realtimeMs == r7.realtimeMs)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TimeMetrics{uptimeMs=");
        A0o.append(this.uptimeMs);
        A0o.append(", realtimeMs=");
        A0o.append(this.realtimeMs);
        return AnonymousClass000.A0d(A0o);
    }
}
