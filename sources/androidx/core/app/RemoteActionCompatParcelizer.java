package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass0AX;
import X.C04820Qu;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C04820Qu r3) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.A01;
        if (r3.A09(1)) {
            obj = r3.A03();
        }
        remoteActionCompat.A01 = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.A03;
        if (r3.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((AnonymousClass0AX) r3).A05);
        }
        remoteActionCompat.A03 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.A02;
        if (r3.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((AnonymousClass0AX) r3).A05);
        }
        remoteActionCompat.A02 = charSequence2;
        remoteActionCompat.A00 = (PendingIntent) r3.A01(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        if (r3.A09(5)) {
            z = AnonymousClass000.A1S(((AnonymousClass0AX) r3).A05.readInt());
        }
        remoteActionCompat.A04 = z;
        boolean z2 = remoteActionCompat.A05;
        if (r3.A09(6)) {
            z2 = AnonymousClass000.A1S(((AnonymousClass0AX) r3).A05.readInt());
        }
        remoteActionCompat.A05 = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C04820Qu r5) {
        IconCompat iconCompat = remoteActionCompat.A01;
        r5.A05(1);
        r5.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        r5.A05(2);
        Parcel parcel = ((AnonymousClass0AX) r5).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        r5.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        r5.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        r5.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        r5.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
