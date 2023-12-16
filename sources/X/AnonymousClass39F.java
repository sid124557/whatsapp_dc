package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.39F  reason: invalid class name */
public class AnonymousClass39F implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(14);
    public final int A00;
    public final AnonymousClass39G A01;
    public final AnonymousClass39G A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public String A00() {
        String str = this.A04;
        if (TextUtils.isEmpty(str)) {
            return this.A05;
        }
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass39F(Parcel parcel) {
        this.A05 = C18310x6.A0l(parcel);
        this.A04 = parcel.readString();
        this.A03 = C18310x6.A0l(parcel);
        Class<AnonymousClass39G> cls = AnonymousClass39G.class;
        Parcelable A0C = C18280x3.A0C(parcel, cls);
        C626936e.A06(A0C);
        this.A01 = (AnonymousClass39G) A0C;
        this.A02 = (AnonymousClass39G) C18280x3.A0C(parcel, cls);
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39F(AnonymousClass39G r1, AnonymousClass39G r2, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
