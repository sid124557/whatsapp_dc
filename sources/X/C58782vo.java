package X;

import java.net.InetAddress;

/* renamed from: X.2vo  reason: invalid class name and case insensitive filesystem */
public class C58782vo {
    public int A00;
    public boolean A01;
    public final C41512Kn A02;
    public final boolean A03;
    public final InetAddress[] A04;

    public C58782vo(C41512Kn r2, InetAddress[] inetAddressArr, boolean z) {
        this.A00 = -1;
        this.A02 = r2;
        this.A04 = inetAddressArr;
        this.A03 = z;
    }

    public C58782vo(C41512Kn r3, InetAddress inetAddress, int i, boolean z) {
        this.A00 = i;
        this.A02 = r3;
        this.A04 = new InetAddress[]{inetAddress};
        this.A03 = z;
    }
}
