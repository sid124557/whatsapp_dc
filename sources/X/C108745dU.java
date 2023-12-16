package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.5dU  reason: invalid class name and case insensitive filesystem */
public final class C108745dU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108305cm();
    public final C160617ny A00;
    public final BigDecimal A01;
    public final Date A02;
    public final Date A03;

    public C108745dU(C160617ny r2, BigDecimal bigDecimal, Date date, Date date2) {
        C162457s7.A0J(bigDecimal, 1);
        this.A01 = bigDecimal;
        this.A00 = r2;
        this.A03 = date;
        this.A02 = date2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C108745dU.class)) {
                return false;
            }
            C108745dU r4 = (C108745dU) obj;
            if (!AnonymousClass75J.A00(this.A01, r4.A01) || !AnonymousClass75J.A00(this.A00, r4.A00) || !AnonymousClass75J.A00(this.A03, r4.A03) || !AnonymousClass75J.A00(this.A02, r4.A02)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeSerializable(this.A01);
        String str = this.A00.A00;
        C162457s7.A0D(str);
        parcel.writeString(str);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A02);
    }

    public final boolean A00(Date date) {
        Date date2;
        Date date3 = this.A03;
        if (date3 == null || (date2 = this.A02) == null || (date.after(date3) && date.before(date2))) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        int A08 = (AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)) + C18280x3.A04(this.A03)) * 31;
        Date date = this.A02;
        if (date != null) {
            i = date.hashCode();
        }
        return A08 + i;
    }
}
