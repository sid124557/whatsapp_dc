package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.4NI  reason: invalid class name */
public class AnonymousClass4NI extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(115);
    public final String A00;
    public final String A01;

    public AnonymousClass4NI(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        if (!TextUtils.isEmpty(str2)) {
            this.A01 = str;
            this.A00 = str2;
            return;
        }
        this.A01 = null;
        this.A00 = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public AnonymousClass4NI(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
