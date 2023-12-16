package com.google.android.gms.wearable;

import X.AnonymousClass000;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import X.AnonymousClass72K;
import X.C162417s1;
import X.C164967wJ;
import X.C1695389r;
import X.C18310x6;
import X.C18330xA;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ConnectionConfiguration extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C164967wJ();
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public volatile String A08;
    public volatile boolean A09;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        AnonymousClass000.A1N(objArr, this.A03);
        AnonymousClass000.A1O(objArr, this.A04);
        objArr[4] = Boolean.valueOf(this.A07);
        return C18310x6.A08(Boolean.valueOf(this.A02), objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            if (!AnonymousClass72K.A00(this.A05, connectionConfiguration.A05) || !AnonymousClass72K.A00(this.A06, connectionConfiguration.A06) || !AnonymousClass72K.A00(Integer.valueOf(this.A03), Integer.valueOf(connectionConfiguration.A03)) || !AnonymousClass72K.A00(Integer.valueOf(this.A04), Integer.valueOf(connectionConfiguration.A04)) || !AnonymousClass72K.A00(Boolean.valueOf(this.A07), Boolean.valueOf(connectionConfiguration.A07)) || !AnonymousClass72K.A00(Boolean.valueOf(this.A02), Boolean.valueOf(connectionConfiguration.A02))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A0A = C18330xA.A0A("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A05);
        A0A.append(AnonymousClass6C7.A0k("Name=", valueOf, valueOf.length()));
        String valueOf2 = String.valueOf(this.A06);
        A0A.append(AnonymousClass6C7.A0k(", Address=", valueOf2, valueOf2.length()));
        A0A.append(AnonymousClass000.A0Y(", Type=", AnonymousClass6CA.A0Y(18), this.A03));
        A0A.append(AnonymousClass000.A0Y(", Role=", AnonymousClass6CA.A0Y(18), this.A04));
        boolean z = this.A07;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(15);
        A0Y.append(", Enabled=");
        A0Y.append(z);
        AnonymousClass000.A1B(A0Y, A0A);
        boolean z2 = this.A09;
        StringBuilder A0Y2 = AnonymousClass6CA.A0Y(19);
        A0Y2.append(", IsConnected=");
        A0Y2.append(z2);
        AnonymousClass000.A1B(A0Y2, A0A);
        String valueOf3 = String.valueOf(this.A08);
        A0A.append(AnonymousClass6C7.A0k(", PeerNodeId=", valueOf3, valueOf3.length()));
        boolean z3 = this.A02;
        StringBuilder A0Y3 = AnonymousClass6CA.A0Y(20);
        A0Y3.append(", BtlePriority=");
        A0Y3.append(z3);
        AnonymousClass000.A1B(A0Y3, A0A);
        String valueOf4 = String.valueOf(this.A00);
        A0A.append(AnonymousClass6C7.A0k(", NodeId=", valueOf4, valueOf4.length()));
        String valueOf5 = String.valueOf(this.A01);
        return AnonymousClass000.A0W(AnonymousClass6C7.A0k(", PackageName=", valueOf5, valueOf5.length()), A0A);
    }

    public ConnectionConfiguration(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = str3;
        this.A02 = z3;
        this.A00 = str4;
        this.A01 = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A072 = C1695389r.A07(parcel, this.A05);
        C162417s1.A0B(parcel, this.A06, 3, A072);
        C162417s1.A07(parcel, 4, this.A03);
        C162417s1.A07(parcel, 5, this.A04);
        C162417s1.A09(parcel, 6, this.A07);
        C162417s1.A09(parcel, 7, this.A09);
        C162417s1.A0B(parcel, this.A08, 8, A072);
        C162417s1.A09(parcel, 9, this.A02);
        C162417s1.A0B(parcel, this.A00, 10, A072);
        C162417s1.A0B(parcel, this.A01, 11, A072);
        C162417s1.A06(parcel, A002);
    }
}
