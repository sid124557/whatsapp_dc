package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vd  reason: invalid class name and case insensitive filesystem */
public final class C164547vd implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127366Rr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                i = C162447s6.A06(parcel, c, 3, readInt, i);
            } else {
                pointFArr = (PointF[]) C162447s6.A0R(parcel, PointF.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127366Rr(pointFArr, i);
    }
}
