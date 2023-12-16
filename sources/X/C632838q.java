package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38q  reason: invalid class name and case insensitive filesystem */
public final class C632838q implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108435cz();
    public final C633338v A00;
    public final String A01;
    public final String A02;

    public C632838q(C633338v r2, String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632838q) {
                C632838q r5 = (C632838q) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        C633338v r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A01) + C18270x1.A00(this.A02)) * 31) + C18310x6.A07(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureBullet(text=");
        A0o.append(this.A01);
        A0o.append(", textSecondary=");
        A0o.append(this.A02);
        A0o.append(", icon=");
        return C18260x0.A04(this.A00, A0o);
    }
}
