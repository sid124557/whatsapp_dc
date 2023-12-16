package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1fJ  reason: invalid class name and case insensitive filesystem */
public final class C27991fJ extends GroupJid implements Parcelable {
    public static final AnonymousClass34R A01 = new AnonymousClass34R();
    public static final Parcelable.Creator CREATOR = new C631037y();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27991fJ(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        if (!AnonymousClass34R.A06(str)) {
            int A0C = C175728Zm.A0C(str, '-', 0);
            if (A0C > 0 && A0C != str.length()) {
                String substring = str.substring(0, A0C);
                C162457s7.A0D(substring);
                if (AnonymousClass32X.A01(substring)) {
                    String substring2 = str.substring(A0C + 1);
                    C162457s7.A0D(substring2);
                    int length = substring2.length();
                    if (length == 10) {
                        char charAt = substring2.charAt(0);
                        if (C162457s7.A00(charAt, 49) >= 0 && C162457s7.A00(charAt, 57) <= 0) {
                            int i = 1;
                            do {
                                char charAt2 = substring2.charAt(i);
                                if (C162457s7.A00(charAt2, 48) >= 0 && C162457s7.A00(charAt2, 57) <= 0) {
                                    i++;
                                }
                            } while (i < length);
                            return;
                        }
                    }
                }
            }
            throw AnonymousClass24P.A00(str);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        String str = this.user;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('@');
        String A0X = AnonymousClass000.A0X("g.us", A0o);
        if (AnonymousClass34R.A06(str)) {
            return AnonymousClass000.A0V(C107575bX.A0B(this.user, 15), A0X, AnonymousClass001.A0o());
        }
        int A0C = C175728Zm.A0C(str, '-', 0);
        if (A0C == -1) {
            return A0X;
        }
        int max = Math.max(0, A0C - 4);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        String substring = str.substring(max);
        C162457s7.A0D(substring);
        return AnonymousClass000.A0V(substring, A0X, A0o2);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 1;
    }
}
