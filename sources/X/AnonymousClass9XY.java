package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9XY  reason: invalid class name */
public final class AnonymousClass9XY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass9XT();
    public final String A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public AnonymousClass9XY(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiExternalPaymentMethodData{type='");
        C195009Vm.A03(A0o, this.A01);
        A0o.append("', name='");
        C195009Vm.A03(A0o, this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }

    public int describeContents() {
        return 0;
    }
}
