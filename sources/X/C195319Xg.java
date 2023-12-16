package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9Xg  reason: invalid class name and case insensitive filesystem */
public final class C195319Xg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass9XS();
    public final int A00;
    public final int A01;
    public final AnonymousClass39L A02;
    public final AnonymousClass39L A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195319Xg) {
                C195319Xg r5 = (C195319Xg) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public AnonymousClass36K A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        C1899593h.A1S("max_count", A0s, this.A00);
        C1899593h.A1S("selected_count", A0s, this.A01);
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass39L r1 = this.A02;
        if (r1 != null) {
            AnonymousClass39V[] r2 = new AnonymousClass39V[3];
            String A0d = C1899693i.A0d(r1, r2);
            C162457s7.A0D(A0d);
            AnonymousClass39V.A06("currency", A0d, r2);
            AnonymousClass36K.A0O(AnonymousClass36K.A0I("money", r2), "due_amount", A0s2, new AnonymousClass39V[0]);
        }
        AnonymousClass39L r12 = this.A03;
        if (r12 != null) {
            AnonymousClass39V[] r22 = new AnonymousClass39V[3];
            String A0d2 = C1899693i.A0d(r12, r22);
            C162457s7.A0D(A0d2);
            AnonymousClass39V.A06("currency", A0d2, r22);
            AnonymousClass36K.A0O(AnonymousClass36K.A0I("money", r22), "interest", A0s2, new AnonymousClass39V[0]);
        }
        return new AnonymousClass36K("installment", C18300x5.A1Z(A0s, 0), C18280x3.A1a(A0s2, 0));
    }

    public int hashCode() {
        int hashCode;
        int i = ((this.A00 * 31) + this.A01) * 31;
        AnonymousClass39L r0 = this.A02;
        int i2 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        AnonymousClass39L r02 = this.A03;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return i3 + i2;
    }

    public C195319Xg(AnonymousClass39L r1, AnonymousClass39L r2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InstallmentTransactionData(maxOrderInstallmentCount=");
        A0o.append(this.A00);
        A0o.append(", selectedCount=");
        A0o.append(this.A01);
        A0o.append(", dueAmount=");
        A0o.append(this.A02);
        A0o.append(", interest=");
        return C18260x0.A04(this.A03, A0o);
    }

    public int describeContents() {
        return 0;
    }
}
