package X;

import java.net.InetAddress;

/* renamed from: X.2YB  reason: invalid class name */
public final class AnonymousClass2YB {
    public final long A00;
    public final InetAddress A01;

    public AnonymousClass2YB(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InetAddressWithExpiry{address=");
        A0o.append(this.A01);
        A0o.append(", expireTimeMillis=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
