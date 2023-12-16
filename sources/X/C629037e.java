package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.37e  reason: invalid class name and case insensitive filesystem */
public final class C629037e implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633038s[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        boolean z = false;
        for (int i = 0; i != readInt; i++) {
            A0I.add(C631738f.CREATOR.createFromParcel(parcel));
        }
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C633038s(A0a, readString, z, A0I);
    }
}
