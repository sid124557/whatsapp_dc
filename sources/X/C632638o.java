package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38o  reason: invalid class name and case insensitive filesystem */
public final class C632638o implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38C();
    public final String A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632638o) {
                C632638o r5 = (C632638o) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A02);
        while (A0w.hasNext()) {
            ((C632538n) A0w.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A01)));
    }

    public C632638o(String str, String str2, List list) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InstallmentOptions(paymentMethod=");
        A0o.append(this.A01);
        A0o.append(", cardNetwork=");
        A0o.append(this.A00);
        A0o.append(", installments=");
        return C18260x0.A04(this.A02, A0o);
    }
}
