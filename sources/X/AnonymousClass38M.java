package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.38M  reason: invalid class name */
public final class AnonymousClass38M implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass39V[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass39V((Jid) C18280x3.A0C(parcel, AnonymousClass39V.class), AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readByte());
    }
}
