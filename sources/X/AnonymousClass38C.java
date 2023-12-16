package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.38C  reason: invalid class name */
public final class AnonymousClass38C implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632638o[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i != readInt; i++) {
            A0I.add(C632538n.CREATOR.createFromParcel(parcel));
        }
        return new C632638o(A0a, readString, A0I);
    }
}
