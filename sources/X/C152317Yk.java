package X;

import java.util.Arrays;

/* renamed from: X.7Yk  reason: invalid class name and case insensitive filesystem */
public final class C152317Yk {
    public final int A00;
    public final int A01;
    public final short[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152317Yk) {
                C152317Yk r5 = (C152317Yk) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.A02) * 31) + this.A01) * 31) + 1) * 31) + this.A00;
    }

    public C152317Yk(short[] sArr, int i, int i2) {
        this.A02 = sArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioFrameResult(audioData=");
        A0o.append(Arrays.toString(this.A02));
        A0o.append(", sampleRate=");
        A0o.append(this.A01);
        A0o.append(", numberOfChannels=");
        A0o.append(1);
        A0o.append(", numberOfSamples=");
        return C18260x0.A09(A0o, this.A00);
    }
}
