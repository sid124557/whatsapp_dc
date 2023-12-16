package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6PE  reason: invalid class name */
public final class AnonymousClass6PE extends AnonymousClass87W {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(61);
    public final List A00;

    public void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C156987hX r5 = (C156987hX) list.get(i2);
            parcel.writeLong(r5.A04);
            parcel.writeByte(r5.A0A ? (byte) 1 : 0);
            parcel.writeByte(r5.A08 ? (byte) 1 : 0);
            parcel.writeByte(r5.A09 ? (byte) 1 : 0);
            List list2 = r5.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                AnonymousClass7G3 r1 = (AnonymousClass7G3) list2.get(i3);
                parcel.writeInt(r1.A00);
                parcel.writeLong(r1.A01);
            }
            parcel.writeLong(r5.A05);
            parcel.writeByte(r5.A07 ? (byte) 1 : 0);
            parcel.writeLong(r5.A03);
            parcel.writeInt(r5.A02);
            parcel.writeInt(r5.A00);
            parcel.writeInt(r5.A01);
        }
    }

    public AnonymousClass6PE(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i < readInt; i++) {
            A0I.add(new C156987hX(parcel));
        }
        this.A00 = Collections.unmodifiableList(A0I);
    }

    public AnonymousClass6PE(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }
}
