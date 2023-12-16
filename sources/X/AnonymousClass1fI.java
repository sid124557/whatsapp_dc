package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1fI  reason: invalid class name */
public final class AnonymousClass1fI extends AnonymousClass1fS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630137p();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1fI(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length != 0 && length <= 20) {
            char charAt = str.charAt(0);
            if (C162457s7.A00(charAt, 49) >= 0 && C162457s7.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    i = (C162457s7.A00(charAt2, 48) >= 0 && C162457s7.A00(charAt2, 57) <= 0) ? i + 1 : i;
                }
                return;
            }
        }
        throw AnonymousClass24P.A00(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String getObfuscatedString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1P(A0o, this.user);
        A0o.append('@');
        return AnonymousClass000.A0X("broadcast", A0o);
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 3;
    }
}
