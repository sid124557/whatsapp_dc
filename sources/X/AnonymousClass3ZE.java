package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;

/* renamed from: X.3ZE  reason: invalid class name */
public class AnonymousClass3ZE implements Cloneable {
    public int A00;
    public long A01;
    public final UserJid A02;
    public transient boolean A03;

    public synchronized long A01() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r6.A01 == -1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A02() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A03     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            long r4 = r6.A01     // Catch:{ all -> 0x0011 }
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r6)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZE.A02():boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass3ZE r7 = (AnonymousClass3ZE) obj;
                if (!(this.A02.equals(r7.A02) && this.A01 == r7.A01 && this.A00 == r7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(UserJid userJid, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass3ZE(userJid, i, -1));
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, (((int) this.A01) + 31) * 31) + this.A00;
    }

    public AnonymousClass3ZE(UserJid userJid, int i, long j) {
        this.A01 = j;
        this.A02 = userJid;
        this.A00 = i;
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallLogParticipant[rowId=");
        A0o.append(this.A01);
        A0o.append(", jid=");
        A0o.append(this.A02);
        A0o.append(", callResult=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }
}
