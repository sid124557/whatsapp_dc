package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6hB  reason: invalid class name and case insensitive filesystem */
public final class C133336hB extends C166447yh {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(83);
    public Integer A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeInt(C18310x6.A06(this.A00));
    }

    public C133336hB(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C162457s7.A0H(readString);
        this.A01 = readString;
        this.A00 = AnonymousClass6CA.A0P(parcel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133336hB(Integer num, String str, String str2, String str3) {
        super(str, str2);
        C162457s7.A0J(str3, 3);
        this.A01 = str3;
        this.A00 = num;
    }
}
