package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2zG  reason: invalid class name and case insensitive filesystem */
public final class C60842zG {
    public int A00;
    public int A01;
    public boolean A02;
    public final UserJid A03;
    public final ConcurrentHashMap A04;

    public static C172878Nf A00(C60842zG r0) {
        return C129526aS.copyOf(r0.A04.values()).iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C60842zG.class == obj.getClass()) {
            C60842zG r4 = (C60842zG) obj;
            if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A03.equals(r4.A03)) {
                return this.A04.equals(r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A04, C18300x5.A04(this.A03)) + this.A01) * 31) + (this.A02 ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60842zG(com.whatsapp.jid.UserJid r3, int r4, boolean r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            com.whatsapp.jid.DeviceJid r1 = X.C618932r.A00(r3)
            X.C626936e.A06(r1)
            X.2kz r0 = new X.2kz
            r0.<init>(r1, r6, r7)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.<init>(r3, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60842zG.<init>(com.whatsapp.jid.UserJid, int, boolean, boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupParticipant{jid='");
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", rank=");
        A0o.append(this.A01);
        A0o.append(", pending=");
        A0o.append(this.A02);
        A0o.append(", participantDevices=");
        StringBuilder A0A = C18330xA.A0A("[");
        Iterator A10 = C18290x4.A10(this.A04);
        while (A10.hasNext()) {
            A0A.append(A10.next());
            AnonymousClass001.A1M(A0A);
        }
        C18270x1.A1C("]", A0A, A0o);
        return AnonymousClass000.A0d(A0o);
    }

    public C60842zG(UserJid userJid, Set set, int i, boolean z) {
        this.A04 = AnonymousClass0x9.A1D();
        this.A03 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C52162kz r2 = (C52162kz) it.next();
            this.A04.put(r2.A02, r2);
        }
        this.A01 = i;
        this.A02 = z;
    }
}
