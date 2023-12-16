package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.53s  reason: invalid class name and case insensitive filesystem */
public final class C989153s extends AnonymousClass3CR {
    public final Map A00 = new C174218Tk(12);
    public final Map A01 = new C174218Tk(12);
    public final Map A02 = new C174218Tk(12);

    public AnonymousClass5RQ A05(UserJid userJid) {
        AnonymousClass5RQ r0;
        synchronized (this) {
            r0 = (AnonymousClass5RQ) this.A02.get(userJid);
        }
        return r0;
    }

    public String BDJ() {
        String A0h;
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LinkedAccountMediaCacheManager=");
            A0o.append(this.A00.size());
            A0o.append(",");
            A0o.append(this.A02.size());
            A0o.append(",");
            A0h = AnonymousClass000.A0h(A0o, this.A01.size());
        }
        return A0h;
    }

    public void Bej(boolean z) {
        synchronized (this) {
            this.A00.clear();
            this.A02.clear();
            this.A01.clear();
        }
    }

    public C989153s(AnonymousClass2MO r3) {
        super(r3);
        A04();
    }
}
