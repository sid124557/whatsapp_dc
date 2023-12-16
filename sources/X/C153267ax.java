package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.7ax  reason: invalid class name and case insensitive filesystem */
public final class C153267ax {
    public long A00;
    public long A01 = -9223372036854775807L;
    public long A02;

    public synchronized long A00() {
        long j;
        if (this.A00 == Long.MAX_VALUE) {
            j = 0;
        } else if (this.A01 == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = this.A02;
        }
        return j;
    }

    public synchronized long A01(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A01 != -9223372036854775807L) {
            this.A01 = j;
        } else {
            long j2 = this.A00;
            if (j2 != Long.MAX_VALUE) {
                this.A02 = j2 - j;
            }
            this.A01 = j;
            notifyAll();
        }
        return j + this.A02;
    }

    public synchronized long A02(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A01;
        if (j2 != -9223372036854775807L) {
            long A0H = AnonymousClass6C7.A0H(j2, 90000);
            long j3 = (4294967296L + A0H) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (AnonymousClass6C9.A0N(j4, A0H) < AnonymousClass6C9.A0N(j, A0H)) {
                j = j4;
            }
        }
        return A01((j * SearchActionVerificationClientService.MS_TO_NS) / 90000);
    }

    public C153267ax(long j) {
        this.A00 = j;
    }
}
