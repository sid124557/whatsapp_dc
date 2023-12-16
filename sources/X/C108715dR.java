package X;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractCollection;

/* renamed from: X.5dR  reason: invalid class name and case insensitive filesystem */
public final class C108715dR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165537xE();
    public final int A00;
    public final String A01;
    public final String A02;

    public C108715dR(String str, String str2, int i) {
        C162457s7.A0J(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108715dR) {
                C108715dR r5 = (C108715dR) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00) {
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
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A02, C18270x1.A00(this.A01) * 31) + this.A00;
    }

    public static void A00(Context context, C142686xb r3, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C108715dR(str, context.getString(i), C154257cs.A01(r3.id)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessCategoryChipData(categoryId=");
        A0o.append(this.A01);
        A0o.append(", name=");
        A0o.append(this.A02);
        A0o.append(", drawableRes=");
        return C18260x0.A09(A0o, this.A00);
    }
}
