package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pS  reason: invalid class name and case insensitive filesystem */
public class C54892pS {
    public final C55672qj A00;
    public final C52352lL A01;
    public final AnonymousClass1VX A02;
    public final C383727h A03;
    public final C55832qz A04;
    public final JniBridge A05;

    public C624134x A00(C53432n5 r6, C95814uZ r7) {
        C95814uZ A022 = C627336j.A02(r6.A01);
        if (A022 != null) {
            r7 = A022;
        }
        String str = r6.A05;
        AnonymousClass2z0 A042 = AnonymousClass2z0.A04(r7, str);
        C55832qz r1 = this.A04;
        C624134x A052 = r1.A05(A042);
        if (A052 != null) {
            return A052;
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "MessageSecretMessageDecryptionManager/findTargetMsg/msg not found; key: ", A042);
        AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r7, str);
        C624134x A053 = r1.A05(A032);
        if (A053 == null) {
            C18260x0.A1P(AnonymousClass001.A0o(), "MessageSecretMessageDecryptionManager/findTargetMsg/msg not found; key: ", A032);
        }
        return A053;
    }

    public byte[] A01(C53432n5 r5, C95814uZ r6) {
        String str = r5.A04;
        if (!C107575bX.A0F(str)) {
            C95814uZ A022 = C627336j.A02(r5.A01);
            if (A022 != null) {
                r6 = A022;
            }
            C626936e.A06(str);
            AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r6, str);
            C55672qj r1 = this.A00;
            C624134x A052 = r1.A0Z.A05(A032);
            if (!(A052 == null && (A052 = r1.A01(A032)) == null)) {
                return A052.A1a;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r3 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r3 = r7.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A02(X.C53432n5 r8, X.C95814uZ r9, com.whatsapp.jid.UserJid r10, X.C624134x r11, java.lang.String r12, java.lang.String r13, byte[] r14) {
        /*
            r7 = this;
            X.1VX r2 = r7.A02
            r1 = 4165(0x1045, float:5.836E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r6 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/ decryption not enabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return r6
        L_0x0013:
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/decrypt start"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r10 != 0) goto L_0x0020
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/sender jid is empty"
        L_0x001c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x0020:
            if (r11 != 0) goto L_0x0061
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/getBotMessageSecret/getting bot message secret from bot message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r1 = r7.A01(r8, r9)
            if (r1 == 0) goto L_0x007c
            r0 = 29
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r0, r1)
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0
            X.2Ih r4 = new X.2Ih
            r4.<init>(r0)
        L_0x003a:
            com.whatsapp.jid.UserJid r0 = r8.A02
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r0)
            if (r5 != 0) goto L_0x0048
            X.2lL r0 = r7.A01
            com.whatsapp.jid.UserJid r5 = r0.A01(r11)
        L_0x0048:
            boolean r0 = X.C107575bX.A0F(r13)
            if (r0 != 0) goto L_0x0056
            com.whatsapp.wamsys.JniBridge r3 = r7.A05
            X.2Ii r0 = r3.WcmMsmsgSecretAPICreateFromBotMessageSecret(r4, r13, r5, r10)
            if (r0 != 0) goto L_0x00bf
        L_0x0056:
            com.whatsapp.wamsys.JniBridge r3 = r7.A05
            X.2Ii r0 = r3.WcmMsmsgSecretAPICreateFromBotMessageSecret(r4, r12, r5, r10)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/msmsgSecret is null"
            goto L_0x001c
        L_0x0061:
            boolean r0 = r11.A1n()
            if (r0 != 0) goto L_0x009d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/target msg no secret key="
            X.C624134x.A0S(r11, r0, r1)
            java.lang.String r0 = "; type="
            X.C624134x.A0T(r11, r0, r1)
            java.lang.String r0 = r1.toString()
        L_0x0079:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/botMessageSecret is null, id="
            r1.append(r0)
            java.lang.String r0 = r8.A05
            r1.append(r0)
            java.lang.String r0 = "; senderJid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; metadataJid="
            r1.append(r0)
            X.4uZ r0 = r8.A01
            X.C18270x1.A17(r0, r1)
            return r6
        L_0x009d:
            com.whatsapp.wamsys.JniBridge r3 = r7.A05
            byte[] r2 = r11.A1a
            r1 = 3
            java.lang.Object r0 = X.AnonymousClass0x9.A0r(r3)
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r1, r0, r2)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            if (r1 == 0) goto L_0x00bc
            X.2Ig r0 = new X.2Ig
            r0.<init>(r1)
            X.2Ih r4 = r3.WcmBotMessageSecretAPICreateWithMessageSecret(r0)
            if (r4 != 0) goto L_0x003a
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/botMessageSecret is null"
            goto L_0x0079
        L_0x00bc:
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/messageSecret is null"
            goto L_0x0079
        L_0x00bf:
            java.lang.Object r1 = X.AnonymousClass0x9.A0r(r3)
            com.facebook.simplejni.NativeHolder r0 = r0.A00
            r2 = 3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r2, r1, r0, r14)
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L_0x00e4
            X.2Ii r0 = r3.WcmMsmsgSecretAPICreateFromBotMessageSecret(r4, r12, r5, r10)
            java.lang.Object r1 = X.AnonymousClass0x9.A0r(r3)
            com.facebook.simplejni.NativeHolder r0 = r0.A00
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r2, r1, r0, r14)
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L_0x00e4
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/msmsg decrypt fails"
            goto L_0x001c
        L_0x00e4:
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/successfully decrypted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54892pS.A02(X.2n5, X.4uZ, com.whatsapp.jid.UserJid, X.34x, java.lang.String, java.lang.String, byte[]):byte[]");
    }

    public C54892pS(C55672qj r1, C52352lL r2, AnonymousClass1VX r3, C383727h r4, C55832qz r5, JniBridge jniBridge) {
        this.A02 = r3;
        this.A05 = jniBridge;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
    }
}
