package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dv  reason: invalid class name and case insensitive filesystem */
public final class C109005dv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108425cy();
    public int A00;
    public long A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final double A0A;
    public final double A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final List A0F;
    public transient Location A0G;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109005dv) {
                C109005dv r8 = (C109005dv) obj;
                if (this.A0D != r8.A0D || Double.compare(this.A0A, r8.A0A) != 0 || Double.compare(this.A0B, r8.A0B) != 0 || this.A0C != r8.A0C || !C162457s7.A0P(this.A0E, r8.A0E) || !C162457s7.A0P(this.A0F, r8.A0F) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A05, r8.A05) || this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A06, r8.A06) || this.A09 != r8.A09 || this.A01 != r8.A01 || this.A08 != r8.A08 || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A0D);
        parcel.writeDouble(this.A0A);
        parcel.writeDouble(this.A0B);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A0E);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A0F);
        while (A0w.hasNext()) {
            ((PlaceInfo) A0w.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        int i2 = 0;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A04);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109005dv(android.location.Location r21, java.lang.String r22, int r23) {
        /*
            r20 = this;
            r2 = r22
            r0 = 2
            r1 = r21
            X.C162457s7.A0J(r1, r0)
            double r9 = r1.getLatitude()
            double r11 = r1.getLongitude()
            if (r22 != 0) goto L_0x0014
            java.lang.String r2 = ""
        L_0x0014:
            r1 = 0
            r13 = 3
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r15 = 0
            r16 = 0
            r0 = r20
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r19 = r15
            r14 = r23
            r3 = r1
            r18 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109005dv.<init>(android.location.Location, java.lang.String, int):void");
    }

    public final Location A00() {
        double d = this.A0A;
        if (d == Double.MAX_VALUE) {
            return null;
        }
        double d2 = this.A0B;
        if (d2 == Double.MAX_VALUE) {
            return null;
        }
        Location location = this.A0G;
        if (location == null) {
            location = new Location("");
            if (d >= -90.0d && d <= 90.0d) {
                location.setLatitude(d);
            }
            if (d2 >= -180.0d && d2 <= 180.0d) {
                location.setLongitude(d2);
            }
            this.A0G = location;
        }
        return location;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass000.A00(AnonymousClass0x2.A01((((((((((((AnonymousClass000.A08(this.A0F, AnonymousClass0x2.A07(this.A0E, (AnonymousClass000.A00(AnonymousClass000.A00(this.A0D * 31, Double.doubleToLongBits(this.A0A)), Double.doubleToLongBits(this.A0B)) + this.A0C) * 31)) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A07)) * 31) + C18270x1.A00(this.A05)) * 31) + this.A00) * 31) + AnonymousClass000.A07(this.A02)) * 31) + C18270x1.A00(this.A06)) * 31, this.A09), this.A01), this.A08) + AnonymousClass0x7.A07(this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PlaceList(source=");
        A0o.append(this.A0D);
        A0o.append(", lat=");
        A0o.append(this.A0A);
        A0o.append(", lon=");
        A0o.append(this.A0B);
        A0o.append(", radius=");
        A0o.append(this.A0C);
        A0o.append(", query=");
        A0o.append(this.A0E);
        A0o.append(", places=");
        A0o.append(this.A0F);
        A0o.append(", htmlAttributions=");
        A0o.append(this.A03);
        A0o.append(", sessionId=");
        A0o.append(this.A07);
        A0o.append(", requestId=");
        A0o.append(this.A05);
        A0o.append(", requestIndex=");
        A0o.append(this.A00);
        A0o.append(", responseCode=");
        A0o.append(this.A02);
        A0o.append(", responseCodeDescr=");
        A0o.append(this.A06);
        A0o.append(", isCached=");
        A0o.append(this.A09);
        A0o.append(", responseTime=");
        A0o.append(this.A01);
        A0o.append(", hasMoreResults=");
        A0o.append(this.A08);
        A0o.append(", locationNextPageToken=");
        return C18260x0.A07(this.A04, A0o);
    }

    public C109005dv(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, double d, double d2, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C162457s7.A0J(str, 5);
        this.A0D = i;
        this.A0A = d;
        this.A0B = d2;
        this.A0C = i2;
        this.A0E = str;
        this.A0F = list;
        this.A03 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A00 = i3;
        this.A02 = num;
        this.A06 = str5;
        this.A09 = z;
        this.A01 = j;
        this.A08 = z2;
        this.A04 = str6;
    }

    public C109005dv() {
        this((Integer) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, AnonymousClass001.A0s(), Double.MAX_VALUE, Double.MAX_VALUE, 0, 0, 0, 0, false, false);
    }
}
