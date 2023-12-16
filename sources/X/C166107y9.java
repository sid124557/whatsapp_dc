package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7y9  reason: invalid class name and case insensitive filesystem */
public final class C166107y9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165177we();
    public final String A00;
    public final List A01;
    public final Map A02;
    public final Map A03;

    public C166107y9(String str, List list, Map map, Map map2) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = list;
        this.A02 = map;
        this.A03 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166107y9) {
                C166107y9 r5 = (C166107y9) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A01);
        while (A0w.hasNext()) {
            parcel.writeParcelable((Parcelable) A0w.next(), i);
        }
        Map map = this.A02;
        parcel.writeInt(map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q);
            parcel.writeSerializable((Serializable) A0w2.getKey());
            parcel.writeParcelable((Parcelable) A0w2.getValue(), i);
        }
        Map map2 = this.A03;
        parcel.writeInt(map2.size());
        Iterator A0q2 = AnonymousClass000.A0q(map2);
        while (A0q2.hasNext()) {
            Map.Entry A0w3 = AnonymousClass001.A0w(A0q2);
            parcel.writeParcelable((Parcelable) A0w3.getKey(), i);
            parcel.writeSerializable((Serializable) A0w3.getValue());
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A01, C18310x6.A09(this.A00))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VariantsDisplayData(name=");
        A0o.append(this.A00);
        A0o.append(", displayItems=");
        A0o.append(this.A01);
        A0o.append(", combinations=");
        A0o.append(this.A02);
        A0o.append(", firstExistingCombination=");
        return C18260x0.A04(this.A03, A0o);
    }
}
