package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6hp  reason: invalid class name and case insensitive filesystem */
public final class C133716hp extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(107);
    public long A00;
    public AnonymousClass39Q A01;
    public final LinkedHashSet A02;

    public void A0E(C161357pU r5, BigDecimal bigDecimal) {
        C85204Fi r1;
        if (bigDecimal != null && r5 != null) {
            LinkedHashSet linkedHashSet = r5.A05;
            LinkedHashSet linkedHashSet2 = this.A02;
            if (linkedHashSet2 != null) {
                Iterator it = linkedHashSet2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r1 = (C85204Fi) it.next();
                    if (linkedHashSet.contains(r1)) {
                        break;
                    }
                }
                this.A01 = new AnonymousClass39Q(bigDecimal, ((AnonymousClass3H6) r1).A01);
            }
            r1 = AnonymousClass1S3.A06;
            this.A01 = new AnonymousClass39Q(bigDecimal, ((AnonymousClass3H6) r1).A01);
        }
    }

    public int describeContents() {
        return 0;
    }

    public C133716hp(Parcel parcel) {
        A0C(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = AnonymousClass0x9.A17();
        for (int i = 0; i < readInt; i++) {
            this.A02.add(C617332a.A00(parcel));
        }
        A0E(this.A07, new BigDecimal(readString));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ WALLET: ");
        A0o.append(super.toString());
        A0o.append(" balance: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01.toString());
        LinkedHashSet linkedHashSet = this.A02;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((C85204Fi) it.next()).writeToParcel(parcel, i);
        }
    }

    public C133716hp(C161357pU r1, LinkedHashSet linkedHashSet, int i, int i2) {
        this.A02 = linkedHashSet;
        C626936e.A06(r1);
        this.A07 = r1;
        A0B(i);
        A0A(i2);
    }
}
