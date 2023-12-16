package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38s  reason: invalid class name and case insensitive filesystem */
public final class C633038s implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629037e();
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633038s) {
                C633038s r5 = (C633038s) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A02);
        while (A0w.hasNext()) {
            ((C631738f) A0w.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A02, ((C18270x1.A00(this.A00) * 31) + AnonymousClass0x7.A07(this.A01)) * 31), this.A03);
    }

    public C633038s(String str, String str2, boolean z, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessAccountSettings:{'intent'='");
        A0o.append(this.A00);
        A0o.append("', 'status'='");
        A0o.append(this.A01);
        A0o.append("', 'issues'='");
        A0o.append(this.A02);
        A0o.append("', 'isProfileEditDisabled'='");
        A0o.append(this.A03);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
