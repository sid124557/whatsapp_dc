package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2pH  reason: invalid class name and case insensitive filesystem */
public class C54782pH {
    public final long A00;
    public final C95814uZ A01;
    public final UserJid A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54782pH r5 = (C54782pH) obj;
            if (this.A04 != r5.A04 || !this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !AnonymousClass75J.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.A04);
        objArr[1] = this.A03;
        objArr[2] = this.A01;
        return C18310x6.A08(this.A02, objArr, 3);
    }

    public C54782pH(C95814uZ r1, UserJid userJid, String str, long j, boolean z) {
        this.A00 = j;
        this.A04 = z;
        this.A03 = str;
        this.A01 = r1;
        this.A02 = userJid;
    }

    public C21301Bh A00() {
        UserJid userJid;
        AnonymousClass1A1 A0Q = C18320x8.A0Q();
        A0Q.A0A(this.A03);
        boolean z = this.A04;
        A0Q.A0D(z);
        C95814uZ r1 = this.A01;
        A0Q.A0C(r1.getRawString());
        if (C627336j.A0K(r1) && !z && (userJid = this.A02) != null) {
            A0Q.A0B(userJid.getRawString());
        }
        C130546c9 A0G = C21301Bh.DEFAULT_INSTANCE.A0G();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        if (seconds > 0) {
            C21301Bh r12 = (C21301Bh) C18320x8.A0C(A0G);
            r12.bitField0_ |= 2;
            r12.timestamp_ = seconds;
        }
        C21301Bh r13 = (C21301Bh) C18320x8.A0C(A0G);
        r13.key_ = C18290x4.A0V(A0Q);
        r13.bitField0_ |= 1;
        return (C21301Bh) A0G.A06();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdMessage{timestamp=");
        A0o.append(this.A00);
        A0o.append(", isFromMe=");
        A0o.append(this.A04);
        A0o.append(", messageId=");
        A0o.append(this.A03);
        A0o.append(", remoteJid=");
        A0o.append(this.A01);
        A0o.append(", participant=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
