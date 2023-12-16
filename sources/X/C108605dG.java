package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5dG  reason: invalid class name and case insensitive filesystem */
public final class C108605dG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108245cg();
    public final Integer A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C162457s7.A0J(parcel, 0);
        Integer num = this.A00;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public C108605dG(Integer num, String str, String str2) {
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        return C86654Ky.A0n(Locale.getDefault(), "ModelAssetMetadata: bytecodeVersion=%d fileName=%s operators=%s", Arrays.copyOf(new Object[]{this.A00, this.A01, this.A02}, 3));
    }
}
