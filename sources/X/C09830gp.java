package X;

import android.net.Uri;

/* renamed from: X.0gp  reason: invalid class name and case insensitive filesystem */
public final class C09830gp implements C185788uF {
    public long A00;
    public long A01;
    public C187478xH A02;
    public byte[] A03;

    public void A00(C161387pX r9, C172488Li r10, C187478xH r11) {
        long min;
        try {
            C153827c5.A01("exo-openmemorydatasource");
            this.A02 = r11;
            byte[] BiN = r11.BiN(r10);
            if (BiN != null) {
                this.A03 = BiN;
                long j = r9.A03;
                this.A00 = j;
                long j2 = r9.A02;
                if (j2 == -1) {
                    min = ((long) BiN.length) - j;
                } else {
                    min = Math.min(j2, ((long) BiN.length) - j);
                }
                this.A01 = min;
                return;
            }
            throw new AnonymousClass0FD();
        } finally {
            C153827c5.A00();
        }
    }

    public Uri BE6() {
        return null;
    }

    public void cancel() {
    }

    public void close() {
    }

    public int read(byte[] bArr, int i, int i2) {
        int min;
        long j = this.A01;
        if (j == 0 || (min = Math.min(i2, (int) j)) <= 0) {
            return -1;
        }
        System.arraycopy(this.A03, (int) this.A00, bArr, i, min);
        long j2 = (long) min;
        this.A00 += j2;
        this.A01 -= j2;
        return min;
    }

    public void Awq(C184768sU r1) {
    }

    public long Bfw(C161387pX r3) {
        return -1;
    }
}
