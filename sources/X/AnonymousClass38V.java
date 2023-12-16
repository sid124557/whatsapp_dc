package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38V  reason: invalid class name */
public class AnonymousClass38V implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(5);
    public final C624034w A00;

    public synchronized void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        C624034w r3 = this.A00;
        parcel.writeInt(r3.A03);
        parcel.writeInt(r3.A02);
        parcel.writeLong(r3.A06);
        parcel.writeString(r3.A0I);
        AnonymousClass39Q r0 = r3.A08;
        if (r0 != null) {
            i2 = r0.A00.scale();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        AnonymousClass39Q r02 = r3.A08;
        if (r02 != null) {
            str = r02.A00.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(r3.A0K);
        UserJid userJid = r3.A0E;
        if (userJid == null) {
            str2 = null;
        } else {
            str2 = userJid.getRawString();
        }
        parcel.writeString(str2);
        UserJid userJid2 = r3.A0D;
        if (userJid2 == null) {
            str3 = null;
        } else {
            str3 = userJid2.getRawString();
        }
        parcel.writeString(str3);
        parcel.writeString(r3.A0L);
        parcel.writeString(r3.A0H);
        parcel.writeString(r3.A0J);
        parcel.writeString(r3.A0F);
        ArrayList arrayList = r3.A0N;
        if (arrayList != null) {
            ArrayList A0y = C18290x4.A0y(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0y.add(new AnonymousClass38Z((C42392Nx) it.next()));
            }
            parcel.writeList(A0y);
        } else {
            parcel.writeList((List) null);
        }
        parcel.writeString(C627336j.A07(r3.A0C));
        int i3 = 1;
        parcel.writeInt(AnonymousClass000.A1S(r3.A0Q ? 1 : 0) ? 1 : 0);
        parcel.writeLong(r3.A05);
        parcel.writeString(r3.A0M);
        parcel.writeString(r3.A0G);
        parcel.writeInt(r3.A04);
        if (!r3.A0P) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeParcelable(r3.A0B, 0);
        parcel.writeInt(r3.A00);
        byte[] bArr = r3.A0R;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(r3.A0R);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(r3.A01);
        parcel.writeParcelable(r3.A0A, 0);
        r3.A07.writeToParcel(parcel, i);
    }

    public AnonymousClass38V(C624034w r1) {
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }
}
