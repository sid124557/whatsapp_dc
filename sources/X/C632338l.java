package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38l  reason: invalid class name and case insensitive filesystem */
public final class C632338l implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629937n();
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632338l) {
                C632338l r5 = (C632338l) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A02) * 31) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C632338l(Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A00 = bool;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FunStickerData(displayName=");
        A0o.append(this.A02);
        A0o.append(", isGroup=");
        A0o.append(this.A00);
        A0o.append(", chatJid=");
        return C18260x0.A07(this.A01, A0o);
    }
}
