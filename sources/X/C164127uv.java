package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uv  reason: invalid class name and case insensitive filesystem */
public final class C164127uv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SR[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        AnonymousClass6TG r7 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 2:
                    r7 = (AnonymousClass6TG) C162447s6.A0A(parcel, AnonymousClass6TG.CREATOR, readInt);
                    break;
                case 3:
                    iBinder = C162447s6.A09(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C162447s6.A0A(parcel, PendingIntent.CREATOR, readInt);
                    break;
                case 5:
                    iBinder2 = C162447s6.A09(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = C162447s6.A09(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SR(pendingIntent, iBinder, iBinder2, iBinder3, r7, i);
    }
}
