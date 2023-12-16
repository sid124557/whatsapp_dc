package X;

/* renamed from: X.6Kl  reason: invalid class name and case insensitive filesystem */
public class C126036Kl extends AnonymousClass8L6 {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C126036Kl r6 = (C126036Kl) obj;
            if (!(Double.compare(r6.systemTimeS, this.systemTimeS) == 0 && Double.compare(r6.userTimeS, this.userTimeS) == 0 && Double.compare(r6.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(r6.childUserTimeS, this.childUserTimeS) == 0)) {
                return false;
            }
        }
        return true;
    }

    public void A02(C126036Kl r3) {
        this.userTimeS = r3.userTimeS;
        this.systemTimeS = r3.systemTimeS;
        this.childUserTimeS = r3.childUserTimeS;
        this.childSystemTimeS = r3.childSystemTimeS;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CpuMetrics{userTimeS=");
        A0o.append(this.userTimeS);
        A0o.append(", systemTimeS=");
        A0o.append(this.systemTimeS);
        A0o.append(", childUserTimeS=");
        A0o.append(this.childUserTimeS);
        A0o.append(", childSystemTimeS=");
        A0o.append(this.childSystemTimeS);
        return AnonymousClass000.A0d(A0o);
    }
}
