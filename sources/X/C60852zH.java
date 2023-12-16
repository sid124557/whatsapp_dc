package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2zH  reason: invalid class name and case insensitive filesystem */
public final class C60852zH {
    public C52332lJ A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C60852zH.class)) {
                return false;
            }
            C60852zH r4 = (C60852zH) obj;
            if (!C162457s7.A0P(this.A01, r4.A01) || !C162457s7.A0P(this.A04, r4.A04)) {
                return false;
            }
        }
        return true;
    }

    public C60852zH(C52332lJ r1, UserJid userJid, String str, String str2, List list) {
        this.A01 = userJid;
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A04, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductListRequest(businessId=");
        A0o.append(this.A01);
        A0o.append(", productIds=");
        A0o.append(this.A04);
        A0o.append(", width=");
        A0o.append(this.A03);
        A0o.append(", height=");
        A0o.append(this.A02);
        A0o.append(", catalogVariantsRequestData=");
        return C18260x0.A04(this.A00, A0o);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C60852zH(UserJid userJid, String str, String str2, List list) {
        this((C52332lJ) null, userJid, str, str2, list);
        C18260x0.A0c(userJid, list, str, str2);
    }
}
