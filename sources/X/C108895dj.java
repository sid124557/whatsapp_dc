package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dj  reason: invalid class name and case insensitive filesystem */
public final class C108895dj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108465d2();
    public final int A00;
    public final C166557yt A01;

    public C108895dj(C166557yt r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public final Object A00(String str) {
        C162457s7.A0J(str, 0);
        Number number = (Number) C617031x.A00.get();
        int i = this.A00;
        if (number == null || number.intValue() != i) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid policyId =");
            A0o.append(number);
            throw new C118265tG(AnonymousClass000.A0X(". All calls to unwrapSensitiveValueFor() should be enclosed within PolicyZone enclosure and specified with the same policyid that this object was wrapped with", A0o));
        }
        C101805Ge r0 = (C101805Ge) AnonymousClass001.A0i(C100765Ce.A00, i);
        if (r0 != null && r0.A00.contains(str)) {
            return this.A01.A00;
        }
        throw new C118265tG(AnonymousClass000.A0V("Purpose policy does not allow data to be extracted for purpose ", str, AnonymousClass001.A0o()));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C108895dj.class.equals(C86644Kx.A0e(obj))) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.purpose.PurposeEnforcedObject<*>");
                C108895dj r5 = (C108895dj) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public String toString() {
        return "***";
    }
}
