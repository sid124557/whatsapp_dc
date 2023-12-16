package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yI  reason: invalid class name and case insensitive filesystem */
public final class C166197yI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165187wf();
    public final C166037y2 A00;
    public final C166117yA A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166197yI) {
                C166197yI r5 = (C166197yI) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C166037y2 r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C166117yA r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((((((C18270x1.A00(this.A03) * 31) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A05)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public C166197yI(C166037y2 r1, C166117yA r2, Boolean bool, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessComplianceDetail(entityName=");
        A0o.append(this.A03);
        A0o.append(", entityType=");
        A0o.append(this.A04);
        A0o.append(", entityTypeCustom=");
        A0o.append(this.A05);
        A0o.append(", isRegistered=");
        A0o.append(this.A02);
        A0o.append(", businessCustomerCareDetails=");
        A0o.append(this.A00);
        A0o.append(", businessGrievanceOfficerDetails=");
        return C18260x0.A04(this.A01, A0o);
    }
}
