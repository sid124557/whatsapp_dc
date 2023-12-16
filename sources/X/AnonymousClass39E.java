package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39E  reason: invalid class name */
public class AnonymousClass39E implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(27);
    public final UserJid A00;
    public final AnonymousClass39B A01;
    public final List A02;

    public int A00() {
        int i = 0;
        for (AnonymousClass396 r0 : this.A02) {
            i += r0.A01.size();
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, 0);
    }

    public AnonymousClass39E(UserJid userJid, AnonymousClass39B r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = userJid;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39E(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A02 = A0s;
        C18320x8.A12(parcel, AnonymousClass396.class, A0s);
        Parcelable A0C = C18280x3.A0C(parcel, UserJid.class);
        C626936e.A06(A0C);
        this.A00 = (UserJid) A0C;
        Parcelable A0C2 = C18280x3.A0C(parcel, AnonymousClass39B.class);
        C626936e.A06(A0C2);
        this.A01 = (AnonymousClass39B) A0C2;
    }
}
