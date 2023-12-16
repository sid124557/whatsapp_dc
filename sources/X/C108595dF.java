package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5dF  reason: invalid class name and case insensitive filesystem */
public final class C108595dF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108255ch();
    public final String A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public C108595dF(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        return C86654Ky.A0n(Locale.getDefault(), "ModelDeltaCacheMetadata: deltaCache=%s baseMd5=%s", Arrays.copyOf(new Object[]{this.A01, this.A00}, 2));
    }
}
