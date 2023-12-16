package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.37z  reason: invalid class name and case insensitive filesystem */
public final class C631137z implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new PhoneUserJid(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhoneUserJid[i];
    }
}
