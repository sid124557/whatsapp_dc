package X;

import java.util.Set;

/* renamed from: X.2lJ  reason: invalid class name and case insensitive filesystem */
public final class C52332lJ {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52332lJ) {
                C52332lJ r5 = (C52332lJ) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A02) + this.A01) * 31) + this.A00;
    }

    public C52332lJ(Set set, int i, int i2) {
        this.A02 = set;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CatalogVariantsRequestData(variantRequestInfoTypes=");
        A0o.append(this.A02);
        A0o.append(", variantThumbnailWidth=");
        A0o.append(this.A01);
        A0o.append(", variantThumbnailHeight=");
        return C18260x0.A09(A0o, this.A00);
    }
}
