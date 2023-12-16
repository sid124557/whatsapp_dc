package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.0QX  reason: invalid class name */
public final class AnonymousClass0QX {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0QX.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0QX r5 = (AnonymousClass0QX) obj;
            if (!(this.A06 == r5.A06 && this.A08 == r5.A08)) {
                return false;
            }
        }
        return true;
    }

    public final void A00() {
        int A062;
        int A063;
        if (!this.A02) {
            int i = this.A08;
            int A042 = AnonymousClass0YI.A04(4.5f, -1, i);
            int A043 = AnonymousClass0YI.A04(3.0f, -1, i);
            if (A042 == -1 || A043 == -1) {
                int A044 = AnonymousClass0YI.A04(4.5f, -16777216, i);
                int A045 = AnonymousClass0YI.A04(3.0f, -16777216, i);
                if (A044 == -1 || A045 == -1) {
                    if (A042 != -1) {
                        A062 = AnonymousClass0YI.A06(-1, A042);
                    } else {
                        A062 = AnonymousClass0YI.A06(-16777216, A044);
                    }
                    this.A00 = A062;
                    if (A043 != -1) {
                        A063 = AnonymousClass0YI.A06(-1, A043);
                    } else {
                        A063 = AnonymousClass0YI.A06(-16777216, A045);
                    }
                } else {
                    this.A00 = AnonymousClass0YI.A06(-16777216, A044);
                    A063 = AnonymousClass0YI.A06(-16777216, A045);
                }
            } else {
                this.A00 = AnonymousClass0YI.A06(-1, A042);
                A063 = AnonymousClass0YI.A06(-1, A043);
            }
            this.A01 = A063;
            this.A02 = true;
        }
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        AnonymousClass0YI.A07(this.A07, this.A05, fArr, this.A04);
        return fArr;
    }

    public int hashCode() {
        return (this.A08 * 31) + this.A06;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(AnonymousClass0QX.class.getSimpleName());
        sb.append(" [RGB: #");
        AnonymousClass001.A1N(sb, this.A08);
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(A01()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.A06);
        sb.append(']');
        sb.append(" [Title Text: #");
        A00();
        AnonymousClass001.A1N(sb, this.A01);
        sb.append(']');
        sb.append(" [Body Text: #");
        A00();
        AnonymousClass001.A1N(sb, this.A00);
        return AnonymousClass001.A0j(sb, ']');
    }

    public AnonymousClass0QX(int i, int i2) {
        this.A07 = Color.red(i);
        this.A05 = Color.green(i);
        this.A04 = Color.blue(i);
        this.A08 = i;
        this.A06 = i2;
    }
}
