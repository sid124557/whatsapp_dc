package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1hJ  reason: invalid class name */
public final class AnonymousClass1hJ extends AnonymousClass38S {
    public static final Parcelable.Creator CREATOR = new AnonymousClass386();
    public final C95804uY A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1hJ) {
                AnonymousClass1hJ r5 = (AnonymousClass1hJ) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18300x5.A04(this.A00));
    }

    public AnonymousClass1hJ(C95804uY r1, String str) {
        C18260x0.A0Q(r1, str);
        this.A00 = r1;
        this.A01 = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageEnforcement(newsletterJid=");
        A0o.append(this.A00);
        A0o.append(", serverMsgId=");
        return C18260x0.A07(this.A01, A0o);
    }
}
