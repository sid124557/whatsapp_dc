package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.7z2  reason: invalid class name and case insensitive filesystem */
public final class C166647z2 implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(35);
    public int A00;
    public final String A01;
    public final C166397yc[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166647z2.class != obj.getClass()) {
                return false;
            }
            C166647z2 r5 = (C166647z2) obj;
            if (!C162387ry.A0D(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = C161207pD.A03;
        UUID uuid2 = ((C166397yc) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C166397yc) obj2).A03;
        if (!equals) {
            return uuid2.compareTo(uuid3);
        }
        if (uuid.equals(uuid3)) {
            return 0;
        }
        return 1;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A002 = (C18270x1.A00(this.A01) * 31) + Arrays.hashCode(this.A02);
        this.A00 = A002;
        return A002;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeTypedArray(this.A02, 0);
    }

    public C166647z2(String str, C166397yc[] r2, boolean z) {
        this.A01 = str;
        r2 = z ? (C166397yc[]) r2.clone() : r2;
        this.A02 = r2;
        Arrays.sort(r2, this);
    }

    public C166647z2(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = (C166397yc[]) parcel.createTypedArray(C166397yc.CREATOR);
    }
}
