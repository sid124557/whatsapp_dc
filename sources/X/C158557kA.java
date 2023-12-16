package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.7kA  reason: invalid class name and case insensitive filesystem */
public final class C158557kA {
    public static final C158557kA A04 = new C158557kA(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158557kA)) {
            return false;
        }
        C158557kA r4 = (C158557kA) obj;
        return this.A03 == r4.A03 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public C158557kA(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (Util.A0C(i3)) {
            i4 = Util.A02(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A03);
        AnonymousClass000.A1M(A1X, this.A01);
        AnonymousClass000.A1N(A1X, this.A02);
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioFormat[sampleRate=");
        A0o.append(this.A03);
        A0o.append(", channelCount=");
        A0o.append(this.A01);
        A0o.append(", encoding=");
        A0o.append(this.A02);
        return AnonymousClass0x2.A0f(A0o);
    }
}
