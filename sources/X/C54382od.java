package X;

import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.2od  reason: invalid class name and case insensitive filesystem */
public class C54382od {
    public final C107285b3 A00;
    public final C56612sH A01;

    public void A00(DeviceJid deviceJid, DeviceJid deviceJid2, String str, long j, long j2, long j3, boolean z, boolean z2) {
        C107285b3 r3 = this.A00;
        DeviceJid deviceJid3 = deviceJid;
        String str2 = str;
        r3.A0Z(deviceJid3.userJid, str2);
        boolean z3 = z;
        if (z) {
            r3.A0I();
            r3.A38.setRequestedCamera2SupportLevel(r3.A1l.A04(), r3.A1k);
        }
        int peekIncomingOffer = Voip.peekIncomingOffer(str2, deviceJid3, deviceJid2, z3, j2, j3, z2);
        if (peekIncomingOffer == 0) {
            r3.A3Q = true;
            r3.A21.A02(deviceJid3, deviceJid3.userJid, str2, -1, j, z3);
        } else if (peekIncomingOffer != 70020) {
            C18260x0.A0x("voip/service/peekIncomingOffer: Voip.peekIncomingOffer failed: ", AnonymousClass001.A0o(), peekIncomingOffer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C30201m4 r16) {
        /*
            r15 = this;
            r3 = r16
            java.lang.String r11 = r3.A03
            com.whatsapp.jid.Jid r10 = r3.A00
            boolean r0 = r10 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0076
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
        L_0x000c:
            X.C626936e.A06(r10)
            com.whatsapp.jid.DeviceJid r9 = r3.A03
            if (r9 != 0) goto L_0x0014
            r9 = r10
        L_0x0014:
            X.5b3 r2 = r15.A00
            X.1VX r4 = r2.A2o
            r1 = 5588(0x15d4, float:7.83E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x004d
            boolean r0 = r3.A01()
        L_0x0026:
            if (r0 == 0) goto L_0x0078
            X.2gT r0 = r2.A22
            X.31C r4 = r0.A03
            X.2i8 r2 = new X.2i8
            r2.<init>()
            java.lang.String r0 = "call"
            r2.A05 = r0
            r2.A07 = r11
            java.lang.String r0 = "offer"
            r2.A08 = r0
            X.C626936e.A06(r10)
            r2.A02 = r10
            long r0 = r3.A02
            r2.A00 = r0
            X.39T r0 = r2.A01()
            r4.A0H(r0)
            return
        L_0x004d:
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r3.A01
            java.lang.String r1 = r4.tag
            java.lang.String r0 = "offer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "silence"
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r4.getFirstChildByTag(r0)
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = "reason"
            X.39V r0 = r1.getFirstAttributeByName(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "privacy"
            boolean r0 = r1.equals(r0)
            goto L_0x0026
        L_0x0076:
            r10 = 0
            goto L_0x000c
        L_0x0078:
            X.2r5 r1 = r2.A2s
            long r6 = r3.A02
            r0 = 3
            X.2rb r1 = r1.A01(r0, r6)
            if (r1 == 0) goto L_0x0087
            r0 = 4
            r1.A03(r0)
        L_0x0087:
            java.lang.String r12 = r3.A02
            X.2gT r0 = r2.A22
            X.31C r1 = r0.A03
            X.1VX r3 = r0.A02
            X.2qk r2 = r0.A00
            r8 = 1
            java.lang.String r4 = "call"
            java.lang.String r5 = "offer"
            X.AnonymousClass36N.A0A(r2, r3, r4, r5, r6, r8)
            r0 = 4
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r0)
            r13 = r6
            X.AnonymousClass36N.A09(r8, r9, r10, r11, r12, r13)
            r0 = 71
            android.os.Message r0 = X.C18290x4.A0J(r0, r8)
            r1.A09(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54382od.A01(X.1m4):void");
    }

    public void A02(String str) {
        if (str == null || AnonymousClass0x7.A1R(str)) {
            C107285b3 r2 = this.A00;
            r2.A0P(13, r2.A1W.getString(R.string.f11nameremoved));
            return;
        }
        Voip.clearVoipParam(str);
    }

    public boolean A03(String str) {
        C107285b3 r1 = this.A00;
        boolean A0q = r1.A0q();
        if (AnonymousClass0x7.A1R(str)) {
            return false;
        }
        int i = r1.A06;
        if (i == 1 || (i != 0 && !A0q)) {
            return true;
        }
        return false;
    }

    public C54382od(C107285b3 r1, C56612sH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
