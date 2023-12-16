package com.google.android.gms.wearable.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C162177rO;
import X.C162417s1;
import X.C164647vn;
import X.C1695389r;
import X.C178738i1;
import X.C18320x8;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
public class DataItemAssetParcelable extends C1695389r implements ReflectedParcelable, C178738i1 {
    public static final Parcelable.Creator CREATOR = new C164647vn();
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DataItemAssetParcelable[@");
        AnonymousClass001.A1N(A0o, hashCode());
        String str = this.A00;
        if (str == null) {
            str = ",noid";
        } else {
            C18320x8.A1K(A0o);
        }
        A0o.append(str);
        A0o.append(", key=");
        return AnonymousClass000.A0W(this.A01, A0o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00));
        C162417s1.A06(parcel, A002);
    }

    public DataItemAssetParcelable(C178738i1 r2) {
        DataItemAssetParcelable dataItemAssetParcelable = (DataItemAssetParcelable) r2;
        String str = dataItemAssetParcelable.A00;
        C162177rO.A02(str);
        this.A00 = str;
        String str2 = dataItemAssetParcelable.A01;
        C162177rO.A02(str2);
        this.A01 = str2;
    }
}
