package X;

import java.util.Arrays;

/* renamed from: X.7Zv  reason: invalid class name and case insensitive filesystem */
public final class C152667Zv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04 = true;
    public float[] A05;
    public float[] A06;
    public float[] A07;
    public float[] A08;

    public C152667Zv(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A08 = fArr;
        this.A06 = fArr2;
        this.A07 = fArr3;
        this.A05 = fArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152667Zv) {
                C152667Zv r5 = (C152667Zv) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || this.A03 != r5.A03 || this.A02 != r5.A02 || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass6CA.A01(((((this.A00 * 31) + this.A01) * 31) + 1) * 31, 1) * 31) + this.A03) * 31) + this.A02) * 31) + Arrays.hashCode(this.A08)) * 31) + Arrays.hashCode(this.A06)) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A05)) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RenderParameters(colorTransfer=");
        A0o.append(this.A00);
        A0o.append(", outputColorTransfer=");
        A0o.append(this.A01);
        A0o.append(", isClearEnabled=");
        A0o.append(true);
        A0o.append(", isDisplayEnabled=");
        A0o.append(true);
        AnonymousClass6C8.A1F(A0o, ", isOpaque=");
        AnonymousClass6C8.A1F(A0o, ", isTransparent=");
        AnonymousClass6C8.A1F(A0o, ", isBlendEnabled=");
        A0o.append(", outputViewportWidth=");
        A0o.append(this.A03);
        A0o.append(", outputViewportHeight=");
        A0o.append(this.A02);
        A0o.append(", textureTransformMatrix=");
        A0o.append(Arrays.toString(this.A08));
        A0o.append(", cropTransformMatrix=");
        A0o.append(Arrays.toString(this.A06));
        A0o.append(", inContentTransformMatrix=");
        A0o.append(Arrays.toString(this.A07));
        A0o.append(", contentTransformMatrix=");
        A0o.append(Arrays.toString(this.A05));
        A0o.append(", hdrMetadata=");
        A0o.append((Object) null);
        A0o.append(", backgroundRenderer=");
        return C18260x0.A04((Object) null, A0o);
    }
}
