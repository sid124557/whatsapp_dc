package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6P2  reason: invalid class name */
public final class AnonymousClass6P2 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(45);
    public final byte[] A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P2.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P2 r5 = (AnonymousClass6P2) obj;
            if (!this.A00.equals(r5.A00) || !Arrays.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A09(this.A00, AnonymousClass6C8.A04(this.A00.hashCode()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A00);
    }

    public AnonymousClass6P2(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public AnonymousClass6P2(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }
}
