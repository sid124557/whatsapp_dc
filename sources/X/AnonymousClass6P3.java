package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6P3  reason: invalid class name */
public final class AnonymousClass6P3 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(47);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final AnonymousClass87X[] A03;
    public final String[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P3.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P3 r5 = (AnonymousClass6P3) obj;
            if (this.A02 != r5.A02 || this.A01 != r5.A01 || !C162387ry.A0D(this.A00, r5.A00) || !Arrays.equals(this.A04, r5.A04) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6P3(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        boolean z = true;
        this.A02 = AnonymousClass000.A1S(parcel.readByte());
        this.A01 = parcel.readByte() == 0 ? false : z;
        this.A04 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A03 = new AnonymousClass87X[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A03[i] = C18280x3.A0C(parcel, AnonymousClass87X.class);
        }
    }

    public int hashCode() {
        return ((AnonymousClass6C8.A04(this.A02 ? 1 : 0) + (this.A01 ? 1 : 0)) * 31) + C86624Kv.A04(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringArray(this.A04);
        parcel.writeInt(r3);
        for (AnonymousClass87X writeParcelable : this.A03) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public AnonymousClass6P3(String str, AnonymousClass87X[] r3, String[] strArr, boolean z, boolean z2) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A04 = strArr;
        this.A03 = r3;
    }
}
