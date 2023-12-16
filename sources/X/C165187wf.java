package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wf  reason: invalid class name and case insensitive filesystem */
public final class C165187wf implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166197yI[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Object createFromParcel;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass6C7.A1W(parcel));
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C166037y2.CREATOR.createFromParcel(parcel);
        }
        C166037y2 r1 = (C166037y2) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C166117yA.CREATOR.createFromParcel(parcel);
        }
        return new C166197yI(r1, (C166117yA) obj, valueOf, A0a, readString, readString2);
    }
}
