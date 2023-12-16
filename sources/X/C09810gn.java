package X;

import java.io.ByteArrayOutputStream;
import java.io.File;

/* renamed from: X.0gn  reason: invalid class name and case insensitive filesystem */
public final class C09810gn implements C184748sS {
    public long A00;
    public long A01;
    public C161387pX A02;
    public ByteArrayOutputStream A03;
    public final long A04;
    public final C187478xH A05;
    public final boolean A06;

    public void write(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i3 = 0;
        while (i3 < i2) {
            long j = this.A01;
            long j2 = this.A04;
            if (j == j2) {
                A00();
                if (this.A06) {
                    byteArrayOutputStream = new AnonymousClass0F9((int) j2);
                } else {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                }
                this.A03 = byteArrayOutputStream;
                j = 0;
                this.A01 = 0;
            }
            int min = (int) Math.min((long) (i2 - i3), j2 - j);
            this.A03.write(bArr, i + i3, min);
            i3 += min;
            this.A01 += (long) min;
        }
    }

    public final void A00() {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = this.A03;
        if (byteArrayOutputStream != null) {
            C161387pX r0 = this.A02;
            String str = r0.A06;
            long j = r0.A01 + this.A00;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.A01;
            if (this.A06) {
                byteArray = ((AnonymousClass0F9) byteArrayOutputStream).A00();
            } else {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (j2 > 0) {
                this.A05.AzB(C162087rC.A01((File) null, str, j, currentTimeMillis, j2), byteArray);
                this.A00 += j2;
            }
            this.A03.close();
            this.A03 = null;
        }
    }

    public void Bfy(C161387pX r5) {
        ByteArrayOutputStream byteArrayOutputStream;
        this.A02 = r5;
        if (this.A06) {
            byteArrayOutputStream = new AnonymousClass0F9((int) this.A04);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        this.A03 = byteArrayOutputStream;
        this.A01 = 0;
    }

    public C09810gn(C187478xH r4, long j, boolean z) {
        r4.getClass();
        this.A05 = r4;
        this.A04 = j;
        if (j != Long.MAX_VALUE) {
            this.A06 = z;
        }
    }

    public void close() {
        A00();
    }
}
