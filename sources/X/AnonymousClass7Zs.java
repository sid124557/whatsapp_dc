package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

/* renamed from: X.7Zs  reason: invalid class name */
public final class AnonymousClass7Zs {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final boolean[] A07 = new boolean[15];

    public void A00() {
        this.A03 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A00 = 0;
        Arrays.fill(this.A07, false);
    }

    public void A01(long j) {
        int i;
        long j2 = this.A03;
        if (j2 == 0) {
            this.A02 = j;
        } else if (j2 == 1) {
            long j3 = j - this.A02;
            this.A01 = j3;
            this.A06 = j3;
            this.A05 = 1;
        } else {
            long j4 = j - this.A04;
            int i2 = (int) (j2 % 15);
            if (AnonymousClass6C9.A0N(j4, this.A01) <= SearchActionVerificationClientService.MS_TO_NS) {
                this.A05++;
                this.A06 += j4;
                boolean[] zArr = this.A07;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.A00 - 1;
                }
            } else {
                boolean[] zArr2 = this.A07;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.A00 + 1;
                }
            }
            this.A00 = i;
        }
        this.A03 = j2 + 1;
        this.A04 = j;
    }

    public boolean A02() {
        if (this.A03 <= 15 || this.A00 != 0) {
            return false;
        }
        return true;
    }
}
