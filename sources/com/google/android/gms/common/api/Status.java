package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.AnonymousClass72K;
import X.C127866Tp;
import X.C1446072f;
import X.C151567Vh;
import X.C162417s1;
import X.C163477ts;
import X.C1695389r;
import X.C180828lh;
import X.C18310x6;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends C1695389r implements C180828lh, ReflectedParcelable {
    public static final Status A05 = new Status(16, (String) null);
    public static final Status A06 = new Status(18, (String) null);
    public static final Status A07 = new Status(8, (String) null);
    public static final Status A08 = new Status(14, (String) null);
    public static final Status A09 = new Status(0, (String) null);
    public static final Status A0A = new Status(-1, (String) null);
    public static final Status A0B = new Status(15, (String) null);
    public static final Status A0C = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = new C163477ts();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final C127866Tp A03;
    public final String A04;

    public Status(int i, String str) {
        this((PendingIntent) null, (C127866Tp) null, str, 1, i);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        return C18310x6.A08(this.A03, objArr, 4);
    }

    public Status BDK() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.A00 != status.A00 || this.A01 != status.A01 || !AnonymousClass72K.A00(this.A04, status.A04) || !AnonymousClass72K.A00(this.A02, status.A02) || !AnonymousClass72K.A00(this.A03, status.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        String str = this.A04;
        if (str == null) {
            str = C1446072f.A00(this.A01);
        }
        r2.A00(str, "statusCode");
        r2.A00(this.A02, "resolution");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A01);
        boolean A072 = C1695389r.A07(parcel, this.A04);
        C162417s1.A0A(parcel, this.A02, 3, i, A072);
        C162417s1.A0A(parcel, this.A03, 4, i, A072);
        C162417s1.A07(parcel, 1000, this.A00);
        C162417s1.A06(parcel, A002);
    }

    public Status(PendingIntent pendingIntent, C127866Tp r2, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A02 = pendingIntent;
        this.A03 = r2;
    }
}
