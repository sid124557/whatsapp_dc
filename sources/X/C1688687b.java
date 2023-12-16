package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.87b  reason: invalid class name and case insensitive filesystem */
public final class C1688687b implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(43);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1688687b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C1688687b) obj).A02);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C1688687b(String str, byte[] bArr, String str2) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        A1X[1] = this.A01;
        AnonymousClass000.A1N(A1X, this.A02.length);
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", A1X);
    }

    public C1688687b(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
