package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7x6  reason: invalid class name and case insensitive filesystem */
public final class C165457x6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new C135136kB((UserJid) C18280x3.A0C(parcel, C135136kB.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135136kB[i];
    }
}
