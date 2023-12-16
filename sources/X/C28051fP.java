package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1fP  reason: invalid class name and case insensitive filesystem */
public final class C28051fP extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630237q();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28051fP(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length >= 18 && length <= 32) {
            int i = 0;
            do {
                char charAt = str.charAt(i);
                if ('0' <= charAt) {
                    if (charAt >= ':') {
                        char c = 'g';
                        if ('a' > charAt) {
                            if ('A' <= charAt) {
                                c = 'G';
                            }
                        }
                        if (charAt >= c) {
                        }
                    }
                    i++;
                }
            } while (i < length);
            return;
        }
        throw AnonymousClass24P.A00(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 10;
    }
}
