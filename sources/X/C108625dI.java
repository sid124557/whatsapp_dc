package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* renamed from: X.5dI  reason: invalid class name and case insensitive filesystem */
public final class C108625dI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(71);
    public C117045rI A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C187358x4 A04;
    public final C117045rI A05;
    public final C117045rI A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108625dI)) {
            return false;
        }
        C108625dI r4 = (C108625dI) obj;
        return this.A06.equals(r4.A06) && this.A05.equals(r4.A05) && C04880Ra.A01(this.A00, r4.A00) && this.A01 == r4.A01 && this.A04.equals(r4.A04);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A06;
        objArr[1] = this.A05;
        objArr[2] = this.A00;
        AnonymousClass000.A1O(objArr, this.A01);
        return C18310x6.A08(this.A04, objArr, 4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, 0);
        parcel.writeParcelable(this.A05, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeInt(this.A01);
    }

    public C108625dI(C187358x4 r5, C117045rI r6, C117045rI r7, C117045rI r8, int i) {
        Objects.requireNonNull(r6, "start cannot be null");
        Objects.requireNonNull(r7, "end cannot be null");
        Objects.requireNonNull(r5, "validator cannot be null");
        this.A06 = r6;
        this.A05 = r7;
        this.A00 = r8;
        this.A01 = i;
        this.A04 = r5;
        if (r8 != null) {
            Calendar calendar = r6.A06;
            Calendar calendar2 = r8.A06;
            if (calendar.compareTo(calendar2) > 0) {
                throw AnonymousClass001.A0c("start Month cannot be after current Month");
            } else if (calendar2.compareTo(r7.A06) > 0) {
                throw AnonymousClass001.A0c("current Month cannot be after end Month");
            }
        }
        if (i < 0 || i > C86664Kz.A1O().getMaximum(7)) {
            throw AnonymousClass001.A0c("firstDayOfWeek is not valid");
        } else if (r6.A06 instanceof GregorianCalendar) {
            int i2 = r7.A04 - r6.A04;
            this.A02 = (i2 * 12) + (r7.A03 - r6.A03) + 1;
            this.A03 = i2 + 1;
        } else {
            throw AnonymousClass001.A0c("Only Gregorian calendars are supported.");
        }
    }
}
