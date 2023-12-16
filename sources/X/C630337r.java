package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.37r  reason: invalid class name and case insensitive filesystem */
public final class C630337r implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C28021fM[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18300x5.A1I(parcel);
        return new C28021fM((UserJid) C18280x3.A0C(parcel, C28021fM.class), parcel.readInt());
    }
}
