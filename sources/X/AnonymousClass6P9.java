package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6P9  reason: invalid class name */
public final class AnonymousClass6P9 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(44);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P9.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P9 r5 = (AnonymousClass6P9) obj;
            if (this.A00 != r5.A00 || !C162387ry.A0D(this.A02, r5.A02) || !C162387ry.A0D(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6P9(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public int hashCode() {
        return AnonymousClass6CA.A09(this.A03, (((((527 + this.A00) * 31) + C86624Kv.A04(this.A02)) * 31) + AnonymousClass6CA.A06(this.A01)) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public String toString() {
        StringBuilder A002 = AnonymousClass87X.A00(this);
        A002.append(": mimeType=");
        AnonymousClass6C8.A1E(A002, this.A02);
        return AnonymousClass000.A0X(this.A01, A002);
    }

    public AnonymousClass6P9(String str, String str2, byte[] bArr, int i) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }
}
