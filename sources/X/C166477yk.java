package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yk  reason: invalid class name and case insensitive filesystem */
public final class C166477yk implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(13);
    public final float A00;
    public final float A01;
    public final float A02;
    public final C108975ds A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C166477yk)) {
            return false;
        }
        C166477yk r4 = (C166477yk) obj;
        if (this.A00 == r4.A00) {
            C108975ds r1 = this.A03;
            C108975ds r0 = r4.A03;
            if (r1 != null) {
                return r1.equals(r0) && this.A01 == r4.A01 && this.A02 == r4.A02;
            }
            if (r0 == null) {
                return true;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        float f;
        C108975ds r0 = this.A03;
        if (r0 != null) {
            f = 527.0f + ((float) r0.hashCode());
        } else {
            f = 17.0f;
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public C166477yk(Parcel parcel) {
        this.A03 = (C108975ds) C18280x3.A0C(parcel, C108975ds.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C166477yk.class.getSimpleName());
        A0o.append("{target=");
        A0o.append(this.A03);
        A0o.append(", zoom=");
        A0o.append(this.A02);
        A0o.append(", tilt=");
        A0o.append(this.A01);
        A0o.append(", bearing=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    public C166477yk(C108975ds r1, float f, float f2, float f3) {
        this.A03 = r1;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
