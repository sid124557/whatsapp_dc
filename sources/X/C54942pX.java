package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2pX  reason: invalid class name and case insensitive filesystem */
public class C54942pX {
    public double A00;
    public double A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04 = -1;
    public long A05;
    public final UserJid A06;

    public void A00(C54942pX r3) {
        C626936e.A0C(r3.A06.equals(this.A06));
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C54942pX) {
            C54942pX r7 = (C54942pX) obj;
            if (!r7.A06.equals(this.A06) || r7.A05 != this.A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C54942pX(UserJid userJid) {
        this.A06 = userJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A06;
        AnonymousClass001.A1Q(A0M, this.A05);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[UserLocation jid=");
        A0o.append(this.A06);
        A0o.append(" latitude=");
        A0o.append(this.A00);
        A0o.append(" longitude=");
        A0o.append(this.A01);
        A0o.append(" accuracy=");
        A0o.append(this.A03);
        A0o.append(" speed=");
        A0o.append(this.A02);
        A0o.append(" bearing=");
        A0o.append(this.A04);
        A0o.append(" timestamp=");
        A0o.append(this.A05);
        return AnonymousClass000.A0f(A0o);
    }
}
