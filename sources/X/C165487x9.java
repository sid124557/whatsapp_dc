package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7x9  reason: invalid class name and case insensitive filesystem */
public final class C165487x9 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new C135196kH((UserJid) C18280x3.A0C(parcel, C135196kH.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135196kH[i];
    }
}
