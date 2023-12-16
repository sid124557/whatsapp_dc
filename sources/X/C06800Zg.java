package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zg  reason: invalid class name and case insensitive filesystem */
public final class C06800Zg implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(11);
    public final int A00;
    public final Intent A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        int i2 = 1;
        if (intent == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C06800Zg(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ActivityResult{resultCode=");
        int i = this.A00;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        A0o.append(str);
        A0o.append(", data=");
        return AnonymousClass000.A0Q(this.A01, A0o);
    }

    public C06800Zg(Parcel parcel) {
        Intent intent;
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            intent = null;
        } else {
            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
        this.A01 = intent;
    }
}
