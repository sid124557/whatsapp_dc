package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Nu  reason: invalid class name and case insensitive filesystem */
public class C126416Nu extends C172358Kr implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(24);
    public static final long serialVersionUID = 7839888635267517754L;
    public final String mPrefetchDataSource;
    public final C166337yW mRequest;

    public C126416Nu(C166337yW r2, String str) {
        super(C142606xT.A07);
        this.mRequest = r2;
        this.mPrefetchDataSource = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
        parcel.writeString(this.mPrefetchDataSource);
    }

    public C126416Nu(Parcel parcel) {
        super(C142606xT.A07);
        this.mRequest = (C166337yW) C18280x3.A0C(parcel, C166337yW.class);
        this.mPrefetchDataSource = parcel.readString();
    }
}
