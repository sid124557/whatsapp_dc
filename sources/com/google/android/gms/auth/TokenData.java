package com.google.android.gms.auth;

import X.AnonymousClass001;
import X.AnonymousClass72K;
import X.C162177rO;
import X.C162417s1;
import X.C163437to;
import X.C1695389r;
import X.C18310x6;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public class TokenData extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C163437to();
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A01;
        AnonymousClass001.A1S(objArr, this.A05);
        objArr[3] = Boolean.valueOf(this.A06);
        objArr[4] = this.A04;
        return C18310x6.A08(this.A03, objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (!TextUtils.equals(this.A02, tokenData.A02) || !AnonymousClass72K.A00(this.A01, tokenData.A01) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !AnonymousClass72K.A00(this.A04, tokenData.A04) || !AnonymousClass72K.A00(this.A03, tokenData.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        C162177rO.A05(str);
        this.A02 = str;
        this.A01 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        boolean A07 = C1695389r.A07(parcel, this.A02);
        Long l = this.A01;
        if (l != null) {
            parcel.writeInt(524291);
            parcel.writeLong(l.longValue());
        }
        C162417s1.A09(parcel, 4, this.A05);
        C162417s1.A09(parcel, 5, this.A06);
        C162417s1.A0C(parcel, this.A04, 6);
        C162417s1.A0B(parcel, this.A03, 7, A07);
        C162417s1.A06(parcel, A002);
    }
}
