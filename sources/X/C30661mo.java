package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1mo  reason: invalid class name and case insensitive filesystem */
public class C30661mo extends AnonymousClass39T {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(8);
    public long A00;
    public long A01;
    public DeviceJid A02;
    public String A03;

    public C30661mo(DeviceJid deviceJid, AnonymousClass39T r2, String str, long j, long j2) {
        super(r2);
        this.A02 = deviceJid;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    public C30661mo(Parcel parcel) {
        super(parcel);
        this.A02 = (DeviceJid) C18280x3.A0C(parcel, DeviceJid.class);
        this.A03 = C18310x6.A0l(parcel);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }
}
