package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tl  reason: invalid class name and case insensitive filesystem */
public final class C127826Tl extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164097us();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C127826Tl(C143026yD r5, String str, int i) {
        C162177rO.A02(str);
        this.A03 = str;
        this.A01 = i;
        this.A02 = -1;
        this.A04 = "VISION";
        this.A05 = null;
        this.A06 = null;
        this.A07 = true;
        this.A08 = false;
        this.A00 = r5.value;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127826Tl) {
                C127826Tl r5 = (C127826Tl) obj;
                if (!(AnonymousClass72K.A00(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && AnonymousClass72K.A00(this.A04, r5.A04) && AnonymousClass72K.A00(this.A05, r5.A05) && AnonymousClass72K.A00(this.A06, r5.A06) && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A03;
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass000.A1N(objArr, this.A02);
        objArr[3] = this.A04;
        objArr[4] = this.A05;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A07);
        objArr[7] = Boolean.valueOf(this.A08);
        return C18310x6.A08(Integer.valueOf(this.A00), objArr, 8);
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PlayLoggerContext[");
        A0o.append("package=");
        A0o.append(this.A03);
        A0o.append(',');
        A0o.append("packageVersionCode=");
        A0o.append(this.A01);
        A0o.append(',');
        A0o.append("logSource=");
        A0o.append(this.A02);
        A0o.append(',');
        A0o.append("logSourceName=");
        A0o.append(this.A04);
        A0o.append(',');
        A0o.append("uploadAccount=");
        A0o.append(this.A05);
        A0o.append(',');
        A0o.append("loggingId=");
        A0o.append(this.A06);
        A0o.append(',');
        A0o.append("logAndroidId=");
        A0o.append(this.A07);
        A0o.append(',');
        A0o.append("isAnonymous=");
        A0o.append(this.A08);
        A0o.append(',');
        A0o.append("qosTier=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A072 = C1695389r.A07(parcel, this.A03);
        C162417s1.A07(parcel, 3, this.A01);
        C162417s1.A07(parcel, 4, this.A02);
        C162417s1.A0B(parcel, this.A05, 5, A072);
        C162417s1.A0B(parcel, this.A06, 6, A072);
        C162417s1.A09(parcel, 7, this.A07);
        C162417s1.A0B(parcel, this.A04, 8, A072);
        C162417s1.A09(parcel, 9, this.A08);
        C162417s1.A07(parcel, 10, this.A00);
        C162417s1.A06(parcel, A002);
    }

    public C127826Tl(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A04 = str4;
        this.A08 = z2;
        this.A00 = i3;
    }
}
