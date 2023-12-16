package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6P4  reason: invalid class name */
public final class AnonymousClass6P4 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(52);
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P4.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P4 r5 = (AnonymousClass6P4) obj;
            if (!C162387ry.A0D(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6P4(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public int hashCode() {
        return AnonymousClass6CA.A09(this.A01, AnonymousClass6C8.A04(C86624Kv.A04(this.A00)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }

    public String toString() {
        StringBuilder A002 = AnonymousClass87X.A00(this);
        A002.append(": owner=");
        return AnonymousClass000.A0X(this.A00, A002);
    }

    public AnonymousClass6P4(Parcel parcel) {
        super("PRIV");
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }
}
