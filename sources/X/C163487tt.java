package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.7tt  reason: invalid class name and case insensitive filesystem */
public final class C163487tt implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = C162447s6.A0S(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) C162447s6.A0R(parcel, CursorWindow.CREATOR, readInt);
            } else if (c == 3) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c != 4) {
                i = C162447s6.A06(parcel, c, 1000, readInt, i);
            } else {
                bundle = C162447s6.A08(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        DataHolder dataHolder = new DataHolder(bundle, cursorWindowArr, strArr, i, i2);
        dataHolder.A01 = AnonymousClass002.A08();
        int i3 = 0;
        while (true) {
            String[] strArr2 = dataHolder.A08;
            if (i3 >= strArr2.length) {
                break;
            }
            dataHolder.A01.putInt(strArr2[i3], i3);
            i3++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.A07;
        int length = cursorWindowArr2.length;
        dataHolder.A03 = new int[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            dataHolder.A03[i5] = i4;
            i4 += cursorWindowArr2[i5].getNumRows() - (i4 - cursorWindowArr2[i5].getStartPosition());
        }
        dataHolder.A00 = i4;
        return dataHolder;
    }
}
