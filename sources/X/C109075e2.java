package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5e2  reason: invalid class name and case insensitive filesystem */
public final class C109075e2 implements Parcelable, C185678u4, C180238ki {
    public static final C108355cr CREATOR = new C108355cr();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05;
    public float A06;
    public float A07 = -1.0f;
    public int A08 = -1;
    public boolean A09;
    public boolean A0A;
    public final C109055e0 A0B;

    public C109075e2(C109055e0 r3, float f, float f2, boolean z) {
        C162457s7.A0J(r3, 2);
        this.A09 = z;
        this.A0B = r3;
        this.A06 = f;
        this.A05 = f2;
    }

    public final float A00(Context context) {
        C109065e1 r0;
        C162457s7.A0J(context, 0);
        if (this.A04 == -1.0f) {
            C109055e0 r1 = this.A0B;
            if (r1.A03 != null) {
                Rect A0N = AnonymousClass001.A0N();
                int A022 = AnonymousClass5YI.A02(context);
                Paint A012 = C105545Vk.A01(context);
                String str = r1.A09.A01;
                A012.getTextBounds(str, 0, str.length(), A0N);
                float min = (float) Math.min(A0N.width(), A022);
                float f = this.A04;
                if (f < min) {
                    f = min;
                }
                this.A04 = f;
                float f2 = this.A03;
                float height = (float) A0N.height();
                if (f2 < height) {
                    f2 = height;
                }
                this.A03 = f2;
            }
        }
        if (this.A01 == -1.0f && (r0 = this.A0B.A03) != null) {
            Rect A0N2 = AnonymousClass001.A0N();
            int A023 = AnonymousClass5YI.A02(context);
            Paint A002 = C105545Vk.A00(context);
            String str2 = r0.A0I;
            A002.getTextBounds(str2, 0, str2.length(), A0N2);
            float min2 = (float) Math.min(A0N2.width(), A023);
            float f3 = this.A01;
            if (f3 < min2) {
                f3 = min2;
            }
            this.A01 = f3;
            float f4 = this.A00;
            float height2 = (float) A0N2.height();
            if (f4 < height2) {
                f4 = height2;
            }
            this.A00 = f4;
        }
        float f5 = this.A04;
        float f6 = this.A01;
        if (f5 < f6) {
            return f6;
        }
        return f5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C109075e2.class.equals(C86644Kx.A0e(obj))) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.marker.BusinessMarkerData");
                if (!C162457s7.A0P(this.A0B.A0A, ((C109075e2) obj).A0B.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeFloat(this.A06);
        parcel.writeFloat(this.A05);
    }

    public void AyI(Location location) {
        this.A0B.AyI(location);
    }

    public double B78() {
        return this.A0B.A00;
    }

    public C108975ds BBX() {
        C109055e0 r0 = this.A0B;
        return C108975ds.A00(r0.A07, r0.A08);
    }

    public Double BBb() {
        return this.A0B.A04;
    }

    public Double BBc() {
        return Double.valueOf(this.A0B.A06);
    }

    public void Bn2(Double d) {
        this.A0B.A04 = d;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A0B.A0A.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessMarkerData(isSelected=");
        A0o.append(this.A09);
        A0o.append(", mapBusinessProfile=");
        A0o.append(this.A0B);
        A0o.append(", showRegularMarkerFromZoom=");
        A0o.append(this.A06);
        A0o.append(", showCompactMarkerFromZoom=");
        A0o.append(this.A05);
        return AnonymousClass001.A0j(A0o, ')');
    }
}
