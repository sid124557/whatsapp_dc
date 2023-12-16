package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ns  reason: invalid class name and case insensitive filesystem */
public class C126396Ns extends C172358Kr implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(25);
    public static final long serialVersionUID = -1995751016961335956L;
    public final C166337yW mRequest;

    public C126396Ns(Parcel parcel) {
        super(C142606xT.A08);
        this.mRequest = (C166337yW) C18280x3.A0C(parcel, C166337yW.class);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
    }

    public C126396Ns(C166337yW r2) {
        super(C142606xT.A08);
        this.mRequest = r2;
    }
}
