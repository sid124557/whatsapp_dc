package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.7z3  reason: invalid class name and case insensitive filesystem */
public final class C166657z3 implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(1);
    public int A00;
    public final int A01;
    public final String A02;
    public final C166487yl[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166657z3.class != obj.getClass()) {
                return false;
            }
            C166657z3 r5 = (C166657z3) obj;
            if (!Util.A0D(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = C155567f7.A03;
        UUID uuid2 = ((C166487yl) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C166487yl) obj2).A03;
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
        int A002 = (C18270x1.A00(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = A002;
        return A002;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public C166657z3(String str, C166487yl... r3) {
        this.A02 = str;
        this.A03 = r3;
        this.A01 = r3.length;
        Arrays.sort(r3, this);
    }

    public C166657z3(Parcel parcel) {
        this.A02 = parcel.readString();
        C166487yl[] r0 = (C166487yl[]) parcel.createTypedArray(C166487yl.CREATOR);
        this.A03 = r0;
        this.A01 = r0.length;
    }
}
