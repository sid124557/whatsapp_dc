package X;

import com.whatsapp.jid.Jid;
import java.util.HashSet;

/* renamed from: X.2cY  reason: invalid class name and case insensitive filesystem */
public class C47002cY {
    public final byte A00;
    public final C66483Lp A01;
    public final C55332qB A02;
    public final Jid A03;
    public final AnonymousClass2z0 A04;
    public final C183538qC A05;
    public final HashSet A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r6.isEmpty() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection A00() {
        /*
            r13 = this;
            X.8qC r5 = r13.A05
            X.2sS r0 = X.C18320x8.A0I(r5)
            com.whatsapp.jid.Jid r4 = r13.A03
            byte r3 = r13.A00
            boolean r0 = r0.A03(r4, r3)
            if (r0 == 0) goto L_0x0019
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r4)
            java.util.Set r7 = java.util.Collections.singleton(r0)
        L_0x0018:
            return r7
        L_0x0019:
            java.util.HashSet r6 = r13.A06
            if (r6 == 0) goto L_0x0024
            boolean r1 = r6.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x00d0
            X.3Lp r9 = r13.A01
            X.2z0 r2 = r13.A04
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            X.C627336j.A0G(r0, r6, r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00ea
            r0 = 58
            if (r3 == r0) goto L_0x00a2
            r0 = 69
            if (r3 == r0) goto L_0x00a2
            r0 = 77
            if (r3 == r0) goto L_0x00a2
            X.2qB r0 = r9.A07
            java.util.Set r8 = r0.A01(r2)
        L_0x004c:
            X.4uZ r0 = r2.A00
            boolean r12 = X.C627336j.A0M(r0)
            boolean r11 = X.C627336j.A0L(r0)
            if (r12 != 0) goto L_0x005a
            if (r11 == 0) goto L_0x00e7
        L_0x005a:
            java.util.Iterator r10 = r8.iterator()
        L_0x005e:
            boolean r0 = r10.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x00e7
            com.whatsapp.jid.Jid r1 = X.AnonymousClass0x7.A0S(r10)
            if (r12 == 0) goto L_0x0099
            boolean r0 = X.C627336j.A0M(r1)
            if (r0 != 0) goto L_0x0099
        L_0x0071:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "key = "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = "; messageType = "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r0 = "; targetDevices = "
            r12.append(r0)
            r0 = 44
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.util.Iterator r10 = r8.iterator()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            goto L_0x00ab
        L_0x0099:
            if (r11 == 0) goto L_0x005e
            boolean r0 = X.C627336j.A0L(r1)
            if (r0 != 0) goto L_0x005e
            goto L_0x0071
        L_0x00a2:
            X.4uZ r0 = X.AnonymousClass2z0.A01(r2)
            java.util.Set r8 = r9.A02(r0, r3)
            goto L_0x004c
        L_0x00ab:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x011e }
            if (r0 == 0) goto L_0x00d9
        L_0x00b1:
            java.lang.Object r1 = r10.next()     // Catch:{ IOException -> 0x011e }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x011e }
            boolean r0 = r1 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x011e }
            if (r0 == 0) goto L_0x00cb
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException -> 0x011e }
        L_0x00be:
            r2.append(r1)     // Catch:{ IOException -> 0x011e }
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x011e }
            if (r0 == 0) goto L_0x00d9
            r2.append(r11)     // Catch:{ IOException -> 0x011e }
            goto L_0x00b1
        L_0x00cb:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x011e }
            goto L_0x00be
        L_0x00d0:
            X.2qB r1 = r13.A02
            X.2z0 r0 = r13.A04
            java.util.Set r7 = r1.A01(r0)
            goto L_0x00ea
        L_0x00d9:
            X.AnonymousClass000.A1B(r2, r12)
            java.lang.String r2 = r12.toString()
            X.2qk r1 = r9.A01
            java.lang.String r0 = "InvalidRecipientFiltered"
            r1.A0A(r0, r6, r2)
        L_0x00e7:
            r7.retainAll(r8)
        L_0x00ea:
            r5.get()
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r0 = 15
            if (r3 == r0) goto L_0x00f9
            r0 = 64
            if (r3 != r0) goto L_0x0018
        L_0x00f9:
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x0018
            java.util.Iterator r2 = r7.iterator()
        L_0x0103:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011c
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x7.A0R(r2)
            r5.get()
            com.whatsapp.jid.UserJid r0 = r1.userJid
            boolean r0 = X.C155477ey.A00(r0)
            if (r0 == 0) goto L_0x0103
        L_0x0118:
            r7.remove(r1)
            return r7
        L_0x011c:
            r1 = 0
            goto L_0x0118
        L_0x011e:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47002cY.A00():java.util.Collection");
    }

    public C47002cY(C66483Lp r1, C55332qB r2, Jid jid, AnonymousClass2z0 r4, C183538qC r5, HashSet hashSet, byte b) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = jid;
        this.A04 = r4;
        this.A00 = b;
        this.A06 = hashSet;
    }
}
