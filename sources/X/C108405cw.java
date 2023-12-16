package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.5cw  reason: invalid class name and case insensitive filesystem */
public final class C108405cw implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Byte b;
        File A0B;
        File A0B2;
        C162457s7.A0J(parcel, 0);
        Class<C108885di> cls = C108885di.class;
        Uri uri = (Uri) C18280x3.A0C(parcel, cls);
        if (parcel.readByte() == 1) {
            b = Byte.valueOf(parcel.readByte());
        } else {
            b = null;
        }
        String readString = parcel.readString();
        if (readString == null) {
            A0B = null;
        } else {
            A0B = AnonymousClass002.A0B(readString);
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        int readInt = parcel.readInt();
        String readString6 = parcel.readString();
        if (readString6 == null) {
            A0B2 = null;
        } else {
            A0B2 = AnonymousClass002.A0B(readString6);
        }
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        return new C108885di((Point) C18280x3.A0C(parcel, cls), (Rect) C18280x3.A0C(parcel, cls), uri, A0B, A0B2, b, readString2, readString3, readString4, readString5, readInt, parcel.readInt(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108885di[i];
    }
}
