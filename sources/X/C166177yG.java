package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yG  reason: invalid class name and case insensitive filesystem */
public final class C166177yG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165397x0();
    public final int A00;
    public final C166097y8 A01;
    public final C166097y8 A02;
    public final C166097y8 A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166177yG) {
                C166177yG r5 = (C166177yG) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        this.A02.writeToParcel(parcel, i);
        this.A03.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, C18310x6.A09(this.A04)))) + this.A00;
    }

    public C166177yG(C166097y8 r1, C166097y8 r2, C166097y8 r3, String str, int i) {
        C18260x0.A0c(str, r1, r2, r3);
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A0y(C166177yG.class, A0o);
        A0o.append("{id='");
        A0o.append(this.A04);
        A0o.append("', preview='");
        A0o.append(this.A02);
        A0o.append("', staticPreview='");
        A0o.append(this.A03);
        A0o.append("', content='");
        A0o.append(this.A01);
        A0o.append("', providerType='");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
