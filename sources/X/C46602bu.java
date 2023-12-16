package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.2bu  reason: invalid class name and case insensitive filesystem */
public class C46602bu {
    public final byte A00;
    public final Jid A01;
    public final VoipStanzaChildNode A02;
    public final VoipStanzaChildNode A03;
    public final String A04;
    public final Map A05;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r1 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r1 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = X.C627436k.A01(r10, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        com.whatsapp.util.Log.e("voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>");
        X.C626936e.A0D(false, "no deviceJid in <to>");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46602bu(com.whatsapp.jid.Jid r14, java.lang.String r15, com.whatsapp.protocol.VoipStanzaChildNode r16) {
        /*
            r13 = this;
            r13.<init>()
            boolean r0 = X.C627336j.A0J(r14)
            if (r0 == 0) goto L_0x00c1
            r13.A01 = r14
            r13.A04 = r15
            r2 = r16
            r13.A03 = r2
            java.lang.String r0 = "destination"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C627436k.A01(r2, r0)
            r13.A02 = r0
            r4 = 0
            if (r0 == 0) goto L_0x0090
            com.whatsapp.protocol.VoipStanzaChildNode[] r8 = r0.getChildrenCopy()
            r6 = 0
            if (r8 != 0) goto L_0x0035
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no children under destination"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "no <dest> node"
            X.C626936e.A0D(r4, r0)
        L_0x002f:
            X.C626936e.A06(r6)
            r13.A05 = r6
            return
        L_0x0035:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            int r5 = r8.length
            r3 = 0
        L_0x003b:
            if (r3 >= r5) goto L_0x008e
            r10 = r8[r3]
            X.39V[] r12 = r10.getAttributesCopy()
            if (r12 != 0) goto L_0x0052
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no attribute in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no attr in <to>"
            X.C626936e.A0D(r4, r0)
            goto L_0x002f
        L_0x0052:
            int r11 = r12.length
            r9 = 0
        L_0x0054:
            if (r9 >= r11) goto L_0x0081
            r2 = r12[r9]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007e
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C627436k.A01(r10, r0)
            if (r0 == 0) goto L_0x007c
            byte[] r0 = r0.getDataCopy()
        L_0x0076:
            r7.put(r1, r0)
            int r3 = r3 + 1
            goto L_0x003b
        L_0x007c:
            r0 = r6
            goto L_0x0076
        L_0x007e:
            int r9 = r9 + 1
            goto L_0x0054
        L_0x0081:
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no deviceJid in <to>"
            X.C626936e.A0D(r4, r0)
            goto L_0x002f
        L_0x008e:
            r6 = r7
            goto L_0x002f
        L_0x0090:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)
            r5 = r1
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r2 = X.C627436k.A01(r2, r0)
            if (r2 == 0) goto L_0x00b8
            com.whatsapp.jid.DeviceJid r1 = X.C18320x8.A0O(r14)
            byte[] r0 = r2.getDataCopy()
            r3.put(r1, r0)
            java.lang.Byte r1 = X.C627436k.A05(r2)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r0 = "invalid retry count!"
            X.C626936e.A0D(r4, r0)
            r1 = r5
        L_0x00b8:
            byte r0 = r1.byteValue()
            r13.A00 = r0
            r13.A05 = r3
            return
        L_0x00c1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallOfferStanza: Wrong jid type: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r14, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46602bu.<init>(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("jid=");
        A0o.append(this.A01);
        A0o.append(" callId=");
        A0o.append(this.A04);
        A0o.append(" payload=");
        A0o.append(this.A03);
        A0o.append(" format=");
        if (this.A02 != null) {
            str = "fan-out";
        } else {
            str = "legacy";
        }
        return AnonymousClass000.A0X(str, A0o);
    }
}
