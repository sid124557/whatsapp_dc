package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.39J  reason: invalid class name */
public class AnonymousClass39J implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(35);
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass39J r5 = (AnonymousClass39J) obj;
            if (!this.A01.equals(r5.A01) || this.A03 != r5.A03 || !TextUtils.equals(this.A02, r5.A02) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + 31) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return AnonymousClass0x2.A07(this.A02, (hashCode + i) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass39J(Parcel parcel) {
        this.A01 = (UserJid) C18280x3.A0C(parcel, UserJid.class);
        this.A03 = AnonymousClass001.A1W(parcel.readInt());
        this.A02 = C18310x6.A0l(parcel);
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallLog.Key[jid=");
        A0o.append(this.A01);
        A0o.append("; fromMe=");
        A0o.append(this.A03);
        A0o.append("; callId=");
        A0o.append(this.A02);
        A0o.append("; transactionId=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }

    public AnonymousClass39J(int i, UserJid userJid, String str, boolean z) {
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }
}
