package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.7bH  reason: invalid class name and case insensitive filesystem */
public final class C153417bH {
    public int A00;
    public long A01;
    public long A02;
    public C158487k3 A03 = C158487k3.A03;
    public Object A04;
    public Object A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C153417bH.class)) {
                return false;
            }
            C153417bH r7 = (C153417bH) obj;
            if (!C162387ry.A0D(this.A04, r7.A04) || !C162387ry.A0D(this.A05, r7.A05) || this.A00 != r7.A00 || this.A01 != r7.A01 || this.A02 != r7.A02 || !C162387ry.A0D(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int A01(long j) {
        int length;
        C158487k3 r5 = this.A03;
        long j2 = this.A01;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i = 0;
            while (true) {
                long[] jArr = r5.A01;
                length = jArr.length;
                if (i >= length) {
                    break;
                }
                long j3 = jArr[i];
                if (j3 == Long.MIN_VALUE || j < j3) {
                    break;
                }
                i++;
            }
            if (i < length) {
                return i;
            }
        }
        return -1;
    }

    public int A02(long j) {
        int i;
        C158487k3 r0 = this.A03;
        long j2 = this.A01;
        long[] jArr = r0.A01;
        int length = jArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return -1;
            }
            if (j == Long.MIN_VALUE) {
                return length;
            }
            long j3 = jArr[length];
            if (j3 != Long.MIN_VALUE) {
                i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
            } else if (j2 != -9223372036854775807L) {
                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            } else {
                continue;
            }
            if (i >= 0) {
                return length;
            }
        }
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass6C7.A03(AnonymousClass6C7.A03((((((217 + AnonymousClass000.A07(this.A04)) * 31) + C18310x6.A07(this.A05)) * 31) + this.A00) * 31, this.A01), this.A02));
    }

    public static int A00(C153417bH r0, Timeline timeline, Object obj) {
        return timeline.A0A(r0, obj).A00;
    }
}
