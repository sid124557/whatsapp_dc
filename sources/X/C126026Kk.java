package X;

/* renamed from: X.6Kk  reason: invalid class name and case insensitive filesystem */
public class C126026Kk extends AnonymousClass8L6 {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C126026Kk r7 = (C126026Kk) obj;
            if (!(this.mobileBytesTx == r7.mobileBytesTx && this.mobileBytesRx == r7.mobileBytesRx && this.wifiBytesTx == r7.wifiBytesTx && this.wifiBytesRx == r7.wifiBytesRx)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.mobileBytesTx;
        int A03 = AnonymousClass6C7.A03(AnonymousClass6C7.A03(((int) (j ^ (j >>> 32))) * 31, this.mobileBytesRx), this.wifiBytesTx);
        long j2 = this.wifiBytesRx;
        return A03 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NetworkMetrics{mobileBytesTx=");
        A0o.append(this.mobileBytesTx);
        A0o.append(", mobileBytesRx=");
        A0o.append(this.mobileBytesRx);
        A0o.append(", wifiBytesTx=");
        A0o.append(this.wifiBytesTx);
        A0o.append(", wifiBytesRx=");
        A0o.append(this.wifiBytesRx);
        return AnonymousClass000.A0d(A0o);
    }
}
