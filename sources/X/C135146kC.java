package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6kC  reason: invalid class name and case insensitive filesystem */
public final class C135146kC extends AnonymousClass1fU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165447x5();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135146kC(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        throw new AnonymousClass24P("Invalid JID");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "interop";
    }

    public int getType() {
        return 22;
    }
}
