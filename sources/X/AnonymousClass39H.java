package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39H  reason: invalid class name */
public class AnonymousClass39H implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(12);
    public String A00;
    public String A01;
    public final AnonymousClass393 A02;
    public final AnonymousClass39G A03;
    public final AnonymousClass39G A04;
    public final AnonymousClass39G A05;
    public final AnonymousClass39G A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public int A00() {
        List list = this.A09;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((AnonymousClass39F) list.get(i2)).A00;
        }
        return i;
    }

    public String A01() {
        List list = this.A09;
        if (list.isEmpty()) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((AnonymousClass39F) list.get(i)).A03;
        }
        return C107575bX.A09(", ", strArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeList(this.A09);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
    }

    public AnonymousClass39H(Parcel parcel) {
        this.A01 = C18310x6.A0l(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A09 = A0s;
        C18320x8.A12(parcel, AnonymousClass39F.class, A0s);
        Class<AnonymousClass39G> cls = AnonymousClass39G.class;
        Parcelable A0C = C18280x3.A0C(parcel, cls);
        C626936e.A06(A0C);
        this.A05 = (AnonymousClass39G) A0C;
        this.A06 = (AnonymousClass39G) C18280x3.A0C(parcel, cls);
        this.A03 = (AnonymousClass39G) C18280x3.A0C(parcel, cls);
        this.A04 = (AnonymousClass39G) C18280x3.A0C(parcel, cls);
        this.A00 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = (AnonymousClass393) C18280x3.A0C(parcel, AnonymousClass393.class);
        this.A08 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39H(AnonymousClass393 r1, AnonymousClass39G r2, AnonymousClass39G r3, AnonymousClass39G r4, AnonymousClass39G r5, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A09 = list;
        this.A05 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = str2;
        this.A02 = r1;
        this.A07 = str3;
        this.A08 = str4;
    }
}
