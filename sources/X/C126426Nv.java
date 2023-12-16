package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Nv  reason: invalid class name and case insensitive filesystem */
public class C126426Nv extends C172358Kr implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(27);
    public static final long serialVersionUID = -6467276914238960823L;
    public final C166337yW mRequest;
    public final int mTaskQueueSize;

    public C126426Nv(C166337yW r2, int i) {
        super(C142606xT.A0A);
        this.mRequest = r2;
        this.mTaskQueueSize = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
        parcel.writeInt(this.mTaskQueueSize);
    }

    public C126426Nv(Parcel parcel) {
        super(C142606xT.A0A);
        this.mRequest = (C166337yW) C18280x3.A0C(parcel, C166337yW.class);
        this.mTaskQueueSize = parcel.readInt();
    }
}
