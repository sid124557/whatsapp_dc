package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zc  reason: invalid class name and case insensitive filesystem */
public final class C06760Zc implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(12);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C06760Zc(Intent intent, IntentSender intentSender, int i, int i2) {
        this.A03 = intentSender;
        this.A02 = intent;
        this.A00 = i;
        this.A01 = i2;
    }

    public C06760Zc(Parcel parcel) {
        this.A03 = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.A02 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
