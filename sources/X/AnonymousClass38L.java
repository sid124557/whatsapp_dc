package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.38L  reason: invalid class name */
public final class AnonymousClass38L implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633538x[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C633438w.CREATOR.createFromParcel(parcel);
        }
        C633438w r3 = (C633438w) createFromParcel;
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i != readInt; i++) {
            A0I.add(C633438w.CREATOR.createFromParcel(parcel));
        }
        return new C633538x(r3, A0a, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, A0I);
    }
}
