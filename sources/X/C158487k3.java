package X;

import java.util.Arrays;

/* renamed from: X.7k3  reason: invalid class name and case insensitive filesystem */
public final class C158487k3 {
    public static final C158487k3 A03 = new C158487k3(new long[0]);
    public final int A00;
    public final long[] A01;
    public final AnonymousClass7WC[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158487k3.class != obj.getClass()) {
                return false;
            }
            C158487k3 r5 = (C158487k3) obj;
            if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A00 * 31 * 31) + ((int) 0)) * 31) + ((int) -9223372036854775807L)) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }

    public C158487k3(long[] jArr) {
        this.A01 = jArr;
        int length = jArr.length;
        this.A00 = length;
        AnonymousClass7WC[] r2 = new AnonymousClass7WC[length];
        for (int i = 0; i < length; i++) {
            r2[i] = new AnonymousClass7WC();
        }
        this.A02 = r2;
    }

    public String toString() {
        char c;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AdPlaybackState(adsId=");
        A0o.append((Object) null);
        A0o.append(", adResumePositionUs=");
        A0o.append(0);
        A0o.append(", adGroups=[");
        int i = 0;
        while (true) {
            AnonymousClass7WC[] r6 = this.A02;
            int length = r6.length;
            if (i >= length) {
                return AnonymousClass000.A0X("])", A0o);
            }
            A0o.append("adGroup(timeUs=");
            A0o.append(this.A01[i]);
            A0o.append(", ads=[");
            for (int i2 = 0; i2 < r6[i].A00.length; i2++) {
                A0o.append("ad(state=");
                int i3 = r6[i].A00[i2];
                if (i3 != 0) {
                    c = 'R';
                    if (i3 != 1) {
                        c = 'S';
                        if (i3 != 2) {
                            c = 'P';
                            if (i3 != 3) {
                                c = '!';
                                if (i3 != 4) {
                                    c = '?';
                                }
                            }
                        }
                    }
                } else {
                    c = '_';
                }
                A0o.append(c);
                A0o.append(", durationUs=");
                AnonymousClass7WC r2 = r6[i];
                A0o.append(r2.A01[i2]);
                A0o.append(')');
                if (i2 < r2.A00.length - 1) {
                    A0o.append(", ");
                }
            }
            A0o.append("])");
            if (i < length - 1) {
                A0o.append(", ");
            }
            i++;
        }
    }
}
