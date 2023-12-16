package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.1fK  reason: invalid class name and case insensitive filesystem */
public final class C28001fK extends GroupJid implements Parcelable {
    public static final AnonymousClass2UZ A01 = new AnonymousClass2UZ();
    public static final Parcelable.Creator CREATOR = new C630937x();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28001fK(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        if (!AnonymousClass2AB.A04(str, "-")) {
            throw AnonymousClass24P.A00(AnonymousClass000.A0V("Invalid group id: ", str, AnonymousClass001.A0o()));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public static final C28001fK A00(String str) {
        Object obj;
        try {
            Jid A012 = AnonymousClass32W.A01(str);
            if (!(A012 instanceof C28001fK) || (obj = (C28001fK) A012) == null) {
                throw AnonymousClass24P.A00(str);
            }
            if (obj instanceof AnonymousClass3Z0) {
                obj = null;
            }
            return (C28001fK) obj;
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getObfuscatedString() {
        String substring = getRawString().substring(C175728Zm.A0G(getRawString(), "-", 0, false) + 1);
        C162457s7.A0D(substring);
        return substring;
    }

    public String getServer() {
        return "temp";
    }

    public int getType() {
        return 2;
    }
}
