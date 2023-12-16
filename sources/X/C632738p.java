package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
public final class C632738p implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38E();
    public final C631338b A00;
    public final AnonymousClass213 A01;
    public final List A02;

    public C632738p(C631338b r2, AnonymousClass213 r3, List list) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A02 = list;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632738p) {
                C632738p r5 = (C632738p) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        C18290x4.A1D(parcel, this.A01);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w = AnonymousClass0x7.A0w(parcel, list);
            while (A0w.hasNext()) {
                ((C632638o) A0w.next()).writeToParcel(parcel, i);
            }
        }
        C631338b r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r0.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MerchantPaymentConfig(merchantStatus=");
        A0o.append(this.A01);
        A0o.append(", installmentOptions=");
        A0o.append(this.A02);
        A0o.append(", merchantAccountSettings=");
        return C18260x0.A04(this.A00, A0o);
    }
}
