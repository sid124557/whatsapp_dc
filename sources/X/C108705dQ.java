package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.5dQ  reason: invalid class name and case insensitive filesystem */
public final class C108705dQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(90);
    public final String A00;
    public final String A01;
    public final List A02;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C108705dQ)) {
            return false;
        }
        C108705dQ r4 = (C108705dQ) obj;
        if (!TextUtils.equals(this.A01, r4.A01) || !TextUtils.equals(this.A00, r4.A00) || !C162457s7.A0P(this.A02, r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A04 = C86624Kv.A04(this.A01) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass002.A02(this.A02, (A04 + i) * 31);
    }

    public C108705dQ(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("timezone: ");
        A0o.append(this.A01);
        A0o.append(", note: ");
        A0o.append(this.A00);
        for (Object valueOf : this.A02) {
            A0o.append(String.valueOf(valueOf));
            A0o.append(";");
        }
        return C18290x4.A0o(A0o);
    }
}
