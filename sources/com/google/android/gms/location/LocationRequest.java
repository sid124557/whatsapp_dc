package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.C162417s1;
import X.C164167uz;
import X.C1695389r;
import X.C18310x6;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C164167uz();
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass001.A1Q(objArr, this.A03);
        objArr[2] = Float.valueOf(this.A00);
        AnonymousClass0x2.A1V(objArr, this.A06);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A01 == locationRequest.A01) {
                long j = this.A03;
                long j2 = locationRequest.A03;
                if (j == j2 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A05 == locationRequest.A05 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                    long j3 = this.A06;
                    if (j3 >= j) {
                        j = j3;
                    }
                    long j4 = locationRequest.A06;
                    if (j4 >= j2) {
                        j2 = j4;
                    }
                    if (j == j2 && this.A08 == locationRequest.A08) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public LocationRequest(float f, int i, int i2, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A01 = i;
        this.A03 = j;
        this.A04 = j2;
        this.A07 = z;
        this.A05 = j3;
        this.A02 = i2;
        this.A00 = f;
        this.A06 = j4;
        this.A08 = z2;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Request[");
        int i = this.A01;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        A0o.append(str);
        if (i != 105) {
            A0o.append(" requested=");
            A0o.append(this.A03);
            A0o.append("ms");
        }
        A0o.append(" fastest=");
        A0o.append(this.A04);
        A0o.append("ms");
        long j = this.A06;
        if (j > this.A03) {
            C18310x6.A1N(" maxWait=", "ms", A0o, j);
        }
        float f = this.A00;
        if (f > 0.0f) {
            A0o.append(" smallestDisplacement=");
            A0o.append(f);
            A0o.append("m");
        }
        long j2 = this.A05;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A0o.append(" expireIn=");
            A0o.append(j2 - elapsedRealtime);
            A0o.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A0o.append(" num=");
            A0o.append(i2);
        }
        return AnonymousClass0x2.A0f(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A01);
        C162417s1.A08(parcel, 2, this.A03);
        C162417s1.A08(parcel, 3, this.A04);
        C162417s1.A09(parcel, 4, this.A07);
        C162417s1.A08(parcel, 5, this.A05);
        C162417s1.A07(parcel, 6, this.A02);
        C162417s1.A05(parcel, this.A00, 7);
        C162417s1.A08(parcel, 8, this.A06);
        C162417s1.A09(parcel, 9, this.A08);
        C162417s1.A06(parcel, A002);
    }

    @Deprecated
    public LocationRequest() {
        this.A01 = 102;
        this.A03 = 3600000;
        this.A04 = 600000;
        this.A07 = false;
        this.A05 = Long.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A00 = 0.0f;
        this.A06 = 0;
        this.A08 = false;
    }
}
