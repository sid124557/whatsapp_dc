package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.38E  reason: invalid class name */
public final class AnonymousClass38E implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C632738p[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        AnonymousClass213 valueOf = AnonymousClass213.valueOf(AnonymousClass0x2.A0a(parcel));
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            for (int i = 0; i != readInt; i++) {
                A0I.add(C632638o.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() != 0) {
            obj = C631338b.CREATOR.createFromParcel(parcel);
        }
        return new C632738p((C631338b) obj, valueOf, A0I);
    }
}
