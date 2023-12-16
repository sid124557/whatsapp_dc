package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6Ut  reason: invalid class name and case insensitive filesystem */
public final class C128096Ut extends AnonymousClass6UK {
    public static final AnonymousClass05C A06;
    public static final Parcelable.Creator CREATOR = new C163237tU();
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        AnonymousClass05C r2 = new AnonymousClass05C();
        A06 = r2;
        r2.put("registered", C127856To.A00("registered", 2));
        r2.put("in_progress", C127856To.A00("in_progress", 3));
        r2.put("success", C127856To.A00("success", 4));
        r2.put("failed", C127856To.A00("failed", 5));
        r2.put("escrowed", C127856To.A00("escrowed", 6));
    }

    public C128096Ut(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A05);
        C162417s1.A0C(parcel, this.A00, 2);
        C162417s1.A0C(parcel, this.A01, 3);
        C162417s1.A0C(parcel, this.A02, 4);
        C162417s1.A0C(parcel, this.A03, 5);
        C162417s1.A0C(parcel, this.A04, 6);
        C162417s1.A06(parcel, A002);
    }

    public C128096Ut() {
        this.A05 = 1;
    }
}
