package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6PA  reason: invalid class name */
public final class AnonymousClass6PA extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(49);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6PA.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6PA r5 = (AnonymousClass6PA) obj;
            if (!C162387ry.A0D(this.A02, r5.A02) || !C162387ry.A0D(this.A01, r5.A01) || !C162387ry.A0D(this.A00, r5.A00) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6PA(Parcel parcel) {
        super("GEOB");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public int hashCode() {
        return AnonymousClass6CA.A09(this.A03, (((AnonymousClass6C8.A04(C86624Kv.A04(this.A02)) + C86624Kv.A04(this.A01)) * 31) + AnonymousClass6CA.A06(this.A00)) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public String toString() {
        StringBuilder A002 = AnonymousClass87X.A00(this);
        A002.append(": mimeType=");
        A002.append(this.A02);
        A002.append(", filename=");
        AnonymousClass6C8.A1E(A002, this.A01);
        return AnonymousClass000.A0X(this.A00, A002);
    }

    public AnonymousClass6PA(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }
}
