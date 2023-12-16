package X;

import android.os.Parcel;

/* renamed from: X.6To  reason: invalid class name and case insensitive filesystem */
public class C127856To extends C1695389r {
    public static final C163607u5 CREATOR = new C163607u5();
    public C178438hX A00;
    public AnonymousClass6SX A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Class A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C127856To(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A05 = 1;
        this.A02 = i;
        this.A09 = z;
        this.A03 = i2;
        this.A0A = z2;
        this.A07 = str;
        this.A04 = i3;
        this.A06 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A08 = canonicalName;
        this.A00 = null;
    }

    public static C127856To A00(String str, int i) {
        return new C127856To((Class) null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(Integer.valueOf(this.A05), "versionCode");
        r2.A00(Integer.valueOf(this.A02), "typeIn");
        r2.A00(Boolean.valueOf(this.A09), "typeInArray");
        r2.A00(Integer.valueOf(this.A03), "typeOut");
        r2.A00(Boolean.valueOf(this.A0A), "typeOutArray");
        r2.A00(this.A07, "outputFieldName");
        r2.A00(Integer.valueOf(this.A04), "safeParcelFieldId");
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        r2.A00(str, "concreteTypeName");
        Class cls = this.A06;
        if (cls != null) {
            r2.A00(cls.getCanonicalName(), "concreteType.class");
        }
        C178438hX r0 = this.A00;
        if (r0 != null) {
            r2.A00(r0.getClass().getCanonicalName(), "converterName");
        }
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass6TK r0;
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A05);
        C162417s1.A07(parcel, 2, this.A02);
        C162417s1.A09(parcel, 3, this.A09);
        C162417s1.A07(parcel, 4, this.A03);
        C162417s1.A09(parcel, 5, this.A0A);
        C162417s1.A0B(parcel, this.A07, 6, false);
        C162417s1.A07(parcel, 7, this.A04);
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        C162417s1.A0B(parcel, str, 8, false);
        C178438hX r1 = this.A00;
        if (r1 == null) {
            r0 = null;
        } else if (r1 instanceof AnonymousClass6UC) {
            r0 = new AnonymousClass6TK((AnonymousClass6UC) r1);
        } else {
            throw AnonymousClass001.A0c("Unsupported safe parcelable field converter class.");
        }
        C162417s1.A0A(parcel, r0, 9, i, false);
        C162417s1.A06(parcel, A002);
    }

    public C127856To(AnonymousClass6TK r3, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A05 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A03 = i3;
        this.A0A = z2;
        this.A07 = str;
        this.A04 = i4;
        AnonymousClass6UC r1 = null;
        if (str2 == null) {
            this.A06 = null;
            this.A08 = null;
        } else {
            this.A06 = AnonymousClass6UL.class;
            this.A08 = str2;
        }
        if (r3 == null || (r1 = r3.A01) != null) {
            this.A00 = r1;
            return;
        }
        throw AnonymousClass001.A0e("There was no converter wrapped in this ConverterWrapper.");
    }
}
