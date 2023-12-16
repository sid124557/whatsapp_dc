package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.2rd  reason: invalid class name and case insensitive filesystem */
public class C56222rd {
    public final C84994En A00 = new AnonymousClass3CZ(this);
    public final C28821hp A01;
    public final C29021i9 A02;
    public final C44262Vh A03;
    public final C49412gU A04;
    public final C836549g A05 = new AnonymousClass3FD(this);
    public final C29231iU A06;
    public final C621133n A07;
    public final C48972fm A08;
    public final C614730x A09;
    public final C22931Qq A0A;
    public final C40342Fl A0B;
    public final C837449p A0C = new C65303Gz(this);
    public final C28771hk A0D;
    public final AnonymousClass33Z A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass4FV A0G;
    public final AnonymousClass2UP A0H;
    public volatile Future A0I;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: X.1Qo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: X.1Qo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: X.2a1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: X.1Qm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: X.1Qm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: X.1Qm} */
    /* JADX WARNING: type inference failed for: r0v82 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021c A[Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022c A[Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x024c A[Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x036c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58862vw A00(X.C30201m4 r39) {
        /*
            r38 = this;
            r7 = r39
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r7.A01
            r23 = r0
            com.whatsapp.protocol.VoipStanzaChildNode[] r6 = r23.getChildrenCopy()
            if (r6 != 0) goto L_0x001e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza no children, message.id="
        L_0x0013:
            r1.append(r0)
            java.lang.String r0 = r7.A03
            X.C18260x0.A1L(r1, r0)
            X.2vw r5 = X.C58862vw.A06
            return r5
        L_0x001e:
            int r0 = r6.length
            r37 = r0
            r2 = 0
            r5 = 0
            r22 = r2
            r21 = r2
            r4 = 0
        L_0x0028:
            r0 = r37
            if (r4 >= r0) goto L_0x005e
            r3 = r6[r4]
            java.lang.String r1 = r3.tag
            java.lang.String r0 = "registration"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
            byte[] r22 = r3.getDataCopy()
            if (r22 == 0) goto L_0x0045
            r0 = r22
            int r1 = r0.length
            r0 = 4
            if (r1 == r0) goto L_0x005b
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid registration, message.id="
            goto L_0x0013
        L_0x004d:
            java.lang.String r1 = "device-identity"
            java.lang.String r0 = r3.tag
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            byte[] r21 = r3.getDataCopy()
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x005e:
            r0 = r23
            java.lang.String r1 = r0.tag
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r20 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0 = r20
            r0.<init>(r1)
            X.39V[] r1 = r23.getAttributesCopy()
            r0.addAttributes(r1)
            r3 = r2
            r4 = r2
            r9 = 0
            r19 = 0
        L_0x0075:
            r0 = r37
            if (r5 >= r0) goto L_0x041e
            r8 = r6[r5]
            java.lang.String r1 = r8.tag
            java.lang.String r18 = "enc"
            r0 = r18
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0405
            if (r9 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza, duplicate <enc> message.id="
            r1.append(r0)
            java.lang.String r0 = r7.A03
            X.C18260x0.A1M(r1, r0)
        L_0x0098:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x009b:
            java.lang.Byte r0 = X.C627436k.A05(r8)
            if (r0 != 0) goto L_0x00aa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid retry count, message.id="
            goto L_0x0013
        L_0x00aa:
            byte r19 = r0.byteValue()
            X.36K r0 = r8.toProtocolTreeNode()     // Catch:{ 24Y -> 0x040c }
            X.2a1 r4 = X.AnonymousClass28S.A00(r0)     // Catch:{ 24Y -> 0x040c }
            int r10 = r4.A01
            r8 = 2
            if (r10 == r8) goto L_0x00cc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza bad cipher version: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", message.id="
            goto L_0x0013
        L_0x00cc:
            byte[] r2 = r4.A02
            r9 = 8
            if (r2 != 0) goto L_0x010b
            r12 = 8
        L_0x00d4:
            byte[] r11 = new byte[r12]
            r0 = 0
            byte r1 = (byte) r0
            r3 = 0
            r11[r0] = r1
            r0 = 1
            r11[r0] = r1
            r11[r8] = r1
            byte r1 = (byte) r10
            r0 = 3
            r11[r0] = r1
            int r4 = r4.A00
            int r0 = r4 >> 24
            byte r1 = (byte) r0
            r0 = 4
            r11[r0] = r1
            int r0 = r4 >> 16
            byte r1 = (byte) r0
            r0 = 5
            r11[r0] = r1
            int r0 = r4 >> 8
            byte r1 = (byte) r0
            r0 = 6
            r11[r0] = r1
            byte r1 = (byte) r4
            r0 = 7
            r11[r0] = r1
            if (r2 == 0) goto L_0x010f
        L_0x00fe:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x010f
            int r1 = r9 + 1
            byte r0 = r2[r3]
            r11[r9] = r0
            int r3 = r3 + 1
            r9 = r1
            goto L_0x00fe
        L_0x010b:
            int r0 = r2.length
            int r12 = r0 + 8
            goto L_0x00d4
        L_0x010f:
            com.whatsapp.jid.Jid r10 = r7.A00
            boolean r0 = r10 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0147
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
        L_0x0117:
            X.C626936e.A06(r10)
            com.whatsapp.jid.DeviceJid r0 = r7.A03
            r17 = r0
            java.lang.String r0 = r7.A03
            r36 = r0
            java.lang.String r0 = r7.A02
            r35 = r0
            X.1b7 r4 = new X.1b7
            r4.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass0x7.A0h()
            r4.A0A = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r19)
            r4.A0E = r0
            r16 = 3
            r3 = 0
            r14 = 0
            r0 = 8
            r2 = r38
            if (r12 >= r0) goto L_0x0149
            r1 = r3
            goto L_0x0195
        L_0x0147:
            r10 = 0
            goto L_0x0117
        L_0x0149:
            r15 = 0
            byte r1 = r11[r15]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r13 = r1 << 24
            r1 = 1
            byte r1 = r11[r1]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r13 = r13 | r1
            byte r1 = r11[r8]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r0
            r13 = r13 | r1
            byte r1 = r11[r16]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r13 | r1
            r1 = 4
            byte r1 = r11[r1]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r9 = r1 << 24
            r1 = 5
            byte r1 = r11[r1]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r9 = r9 | r1
            r1 = 6
            byte r1 = r11[r1]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r0
            r9 = r9 | r1
            r1 = 7
            byte r1 = r11[r1]     // Catch:{ InterruptedException -> 0x02ff }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r9 = r9 | r1
            if (r12 == r0) goto L_0x0190
            int r12 = r12 - r0
            byte[] r14 = new byte[r12]     // Catch:{ InterruptedException -> 0x02ff }
        L_0x0184:
            if (r15 >= r12) goto L_0x0190
            int r1 = r0 + 1
            byte r0 = r11[r0]     // Catch:{ InterruptedException -> 0x02ff }
            r14[r15] = r0     // Catch:{ InterruptedException -> 0x02ff }
            int r15 = r15 + 1
            r0 = r1
            goto L_0x0184
        L_0x0190:
            X.2a1 r1 = new X.2a1     // Catch:{ InterruptedException -> 0x02ff }
            r1.<init>(r14, r13, r9)     // Catch:{ InterruptedException -> 0x02ff }
        L_0x0195:
            X.2ov r11 = X.AnonymousClass36G.A02(r10)     // Catch:{ InterruptedException -> 0x02f9 }
            int r12 = r1.A01     // Catch:{ InterruptedException -> 0x02f9 }
            if (r12 != r8) goto L_0x02ee
            X.33n r0 = r2.A07     // Catch:{ InterruptedException -> 0x02f9 }
            boolean r0 = r0.A0X()     // Catch:{ InterruptedException -> 0x02f9 }
            if (r0 != 0) goto L_0x01d3
            boolean r0 = r2.A04()     // Catch:{ InterruptedException -> 0x02f9 }
            if (r0 != 0) goto L_0x01d3
            X.2fm r9 = r2.A08     // Catch:{ ExecutionException -> 0x01c5 }
            X.3dB r0 = new X.3dB     // Catch:{ ExecutionException -> 0x01c5 }
            r24 = r0
            r25 = r2
            r26 = r11
            r27 = r10
            r28 = r1
            r29 = r21
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ ExecutionException -> 0x01c5 }
            java.lang.Object r0 = X.C48972fm.A01(r9, r0)     // Catch:{ ExecutionException -> 0x01c5 }
            X.2ex r0 = (X.C48472ex) r0     // Catch:{ ExecutionException -> 0x01c5 }
            goto L_0x01d9
        L_0x01c5:
            r0 = move-exception
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ InterruptedException -> 0x02f9 }
            boolean r0 = r9 instanceof java.lang.Error     // Catch:{ InterruptedException -> 0x02f9 }
            if (r0 != 0) goto L_0x02f8
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r9)     // Catch:{ InterruptedException -> 0x02f9 }
            throw r0     // Catch:{ InterruptedException -> 0x02f9 }
        L_0x01d3:
            r0 = r21
            X.2ex r0 = r2.A01(r11, r10, r1, r0)     // Catch:{ InterruptedException -> 0x02f9 }
        L_0x01d9:
            int r10 = r0.A00     // Catch:{ InterruptedException -> 0x02f9 }
            if (r10 != 0) goto L_0x0285
            byte[] r0 = r0.A01     // Catch:{ 6u5 -> 0x0274 }
            X.1EU r0 = X.AnonymousClass1EU.A00(r0)     // Catch:{ 6u5 -> 0x0274 }
            X.1Cl r13 = r0.call_     // Catch:{ 6u5 -> 0x0274 }
            if (r13 != 0) goto L_0x01e9
            X.1Cl r13 = X.C21601Cl.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0274 }
        L_0x01e9:
            X.8Lq r0 = r13.callKey_     // Catch:{ 6u5 -> 0x0274 }
            byte[] r14 = r0.A07()     // Catch:{ 6u5 -> 0x0274 }
            X.8Lq r0 = r13.conversionData_     // Catch:{ 6u5 -> 0x026a, InterruptedException -> 0x0265 }
            byte[] r12 = r0.A07()     // Catch:{ 6u5 -> 0x026a, InterruptedException -> 0x0265 }
            java.lang.String r11 = r13.conversionSource_     // Catch:{ 6u5 -> 0x026f, InterruptedException -> 0x0305 }
            if (r17 == 0) goto L_0x0252
            r0 = r17
            com.whatsapp.jid.UserJid r10 = r0.userJid     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            if (r10 == 0) goto L_0x0252
            int r0 = r13.bitField0_     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r9 = 0
            if (r0 == 0) goto L_0x020b
            goto L_0x020e
        L_0x020b:
            r26 = r3
            goto L_0x0216
        L_0x020e:
            X.8Lq r0 = r13.conversionData_     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            if (r0 == 0) goto L_0x020b
            java.lang.String r26 = r0.A05()     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
        L_0x0216:
            int r0 = r13.bitField0_     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x021e
            java.lang.String r9 = r13.conversionSource_     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
        L_0x021e:
            java.lang.String r28 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r26)     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            if (r0 != 0) goto L_0x024c
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            if (r0 != 0) goto L_0x024c
            X.C626936e.A06(r26)     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            X.C626936e.A06(r9)     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            java.util.ArrayList r29 = X.AnonymousClass001.A0s()     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            long r31 = java.lang.System.currentTimeMillis()     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r33 = 0
            r30 = -1
            X.1Qm r0 = new X.1Qm     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r24 = r0
            r25 = r10
            r27 = r9
            r34 = r33
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r33, r34)     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            goto L_0x0257
        L_0x024c:
            X.1Qo r0 = new X.1Qo     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r0.<init>()     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            goto L_0x0257
        L_0x0252:
            X.1Qo r0 = new X.1Qo     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r0.<init>()     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
        L_0x0257:
            r3 = r0
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            r4.A00 = r9     // Catch:{ 6u5 -> 0x0262, InterruptedException -> 0x025e }
            goto L_0x038a
        L_0x025e:
            r9 = move-exception
            r0 = r3
            goto L_0x0308
        L_0x0262:
            r13 = move-exception
            r0 = r3
            goto L_0x0272
        L_0x0265:
            r9 = move-exception
            r0 = r3
            r12 = r3
            goto L_0x02fd
        L_0x026a:
            r13 = move-exception
            r0 = r3
            r12 = r3
            r11 = r3
            goto L_0x0272
        L_0x026f:
            r13 = move-exception
            r0 = r3
            r11 = r3
        L_0x0272:
            r3 = r14
            goto L_0x0278
        L_0x0274:
            r13 = move-exception
            r0 = r3
            r12 = r3
            r11 = r3
        L_0x0278:
            java.lang.String r10 = "plaintext does not represent a valid protocol buffer"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x0281 }
            r9.<init>(r10, r13)     // Catch:{ InterruptedException -> 0x0281 }
            throw r9     // Catch:{ InterruptedException -> 0x0281 }
        L_0x0281:
            r9 = move-exception
            r14 = r3
            goto L_0x0308
        L_0x0285:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02f9 }
            java.lang.String r0 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key. status="
            X.C18260x0.A0y(r0, r9, r10)     // Catch:{ InterruptedException -> 0x02f9 }
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r10 != r0) goto L_0x029a
            java.lang.Integer r0 = X.C18290x4.A0d()     // Catch:{ InterruptedException -> 0x02f9 }
            r4.A07 = r0     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x02ea
        L_0x029a:
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            if (r10 != r0) goto L_0x02a5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ InterruptedException -> 0x02f9 }
            r4.A07 = r0     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x02ea
        L_0x02a5:
            r0 = -1010(0xfffffffffffffc0e, float:NaN)
            r9 = 4
            if (r10 != r0) goto L_0x02ba
            java.lang.String r0 = "voip/encryption/decryptCallPayload/bad identity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x02f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x02f9 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r3)     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x0366
        L_0x02ba:
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r10 != r0) goto L_0x02c5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x02f9 }
            r4.A07 = r0     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x02ea
        L_0x02c5:
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r10 != r0) goto L_0x02d9
            java.lang.String r0 = "voip/encryption/decryptCallPayload/duplicated e2e keys"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x02f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ InterruptedException -> 0x02f9 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r3)     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x0366
        L_0x02d9:
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r10 != r0) goto L_0x02e4
            java.lang.Integer r0 = X.AnonymousClass001.A0f()     // Catch:{ InterruptedException -> 0x02f9 }
            r4.A07 = r0     // Catch:{ InterruptedException -> 0x02f9 }
            goto L_0x02ea
        L_0x02e4:
            java.lang.Integer r0 = X.C18290x4.A0Z()     // Catch:{ InterruptedException -> 0x02f9 }
            r4.A07 = r0     // Catch:{ InterruptedException -> 0x02f9 }
        L_0x02ea:
            r0 = r3
            r12 = r3
            r11 = r3
            goto L_0x0311
        L_0x02ee:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x02f9 }
            java.lang.String r0 = "invalid ciphertext version; ciphertextVersion="
            java.lang.IllegalArgumentException r9 = X.AnonymousClass000.A0G(r0, r9, r12)     // Catch:{ InterruptedException -> 0x02f9 }
        L_0x02f8:
            throw r9     // Catch:{ InterruptedException -> 0x02f9 }
        L_0x02f9:
            r9 = move-exception
            r0 = r3
            r14 = r3
            r12 = r3
        L_0x02fd:
            r11 = r3
            goto L_0x0308
        L_0x02ff:
            r9 = move-exception
            r0 = r3
            r14 = r3
            r12 = r3
            r11 = r3
            goto L_0x0309
        L_0x0305:
            r9 = move-exception
            r0 = r3
            r11 = r3
        L_0x0308:
            r3 = r1
        L_0x0309:
            java.lang.String r1 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key: "
            com.whatsapp.util.Log.i(r1, r9)
            r1 = r3
            r3 = r14
        L_0x0311:
            r14 = 1
            if (r1 != 0) goto L_0x038c
            java.lang.String r1 = "voip/encryption/decryptCallPayload got null e2e message"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.A00 = r1
            java.lang.Integer r1 = X.C18300x5.A0Z()
            r4.A07 = r1
        L_0x0324:
            java.lang.Boolean r1 = r4.A00
            boolean r1 = r1.booleanValue()
            X.4FV r9 = r2.A0G
            if (r1 == 0) goto L_0x0385
            r9.BhD(r4)
        L_0x0331:
            if (r14 == 0) goto L_0x0382
            X.33n r1 = r2.A07
            boolean r1 = r1.A0X()
            if (r1 != 0) goto L_0x0378
            boolean r1 = r2.A04()
            if (r1 != 0) goto L_0x0378
            X.2fm r1 = r2.A08
            X.3aY r4 = new X.3aY
            r24 = r4
            r25 = r2
            r26 = r22
            r27 = r36
            r28 = r19
            r29 = r8
            r24.<init>(r25, r26, r27, r28, r29)
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00
            r1.submit(r4)
        L_0x0359:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            X.2Pd r1 = new X.2Pd
            r1.<init>(r0, r11, r3, r12)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)
        L_0x0366:
            int r11 = X.C18280x3.A03(r0)
            if (r11 == 0) goto L_0x03ec
            r6 = 0
            X.2vw r5 = new X.2vw
            r8 = r6
            r9 = r6
            r7 = r6
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0378:
            r8 = r36
            r4 = r22
            r1 = r19
            r2.A03(r8, r4, r1)
            goto L_0x0359
        L_0x0382:
            r16 = 0
            goto L_0x0359
        L_0x0385:
            r1 = 1
            X.C18280x3.A0t(r4, r9, r1)
            goto L_0x0331
        L_0x038a:
            r3 = r14
            r14 = 0
        L_0x038c:
            int r13 = r1.A00
            r9 = 0
            if (r13 == 0) goto L_0x03e5
            r9 = 1
            if (r13 == r9) goto L_0x03e5
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r9 = "voip/encryption/decryptCallPayload unrecognized ciphertext type; callId="
            r10.append(r9)
            r9 = r35
            r10.append(r9)
            java.lang.String r9 = " type="
            X.C18260x0.A0z(r9, r10, r13)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r4.A00 = r9
            java.lang.Integer r9 = X.C18310x6.A0e()
            r4.A07 = r9
        L_0x03b2:
            int r10 = r1.A01
            if (r10 != r8) goto L_0x03c6
            r9 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r4.A0D = r1
        L_0x03be:
            java.lang.Integer r1 = X.C18290x4.A0Z()
            r4.A06 = r1
            goto L_0x0324
        L_0x03c6:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "voip/encryption/decryptCallPayload doesn't know how to handle the ciphertext version received: callId="
            r9.append(r1)
            r1 = r35
            r9.append(r1)
            java.lang.String r1 = " v="
            X.C18260x0.A0z(r1, r9, r10)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.A00 = r1
            java.lang.Integer r1 = X.C18300x5.A0Y()
            r4.A07 = r1
            goto L_0x03be
        L_0x03e5:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.A05 = r9
            goto L_0x03b2
        L_0x03ec:
            java.lang.Object r0 = r0.second
            X.2Pd r0 = (X.C42692Pd) r0
            byte[] r2 = r0.A02
            byte[] r3 = r0.A03
            X.2e5 r4 = r0.A00
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r1 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0 = r18
            r1.<init>(r0)
            r1.setData(r2)
            com.whatsapp.protocol.VoipStanzaChildNode r8 = r1.build()
            r9 = 1
        L_0x0405:
            r0 = r20
            r0.addChild(r8)
            goto L_0x0098
        L_0x040c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza fail to parse enc node, message.id="
            r1.append(r0)
            java.lang.String r0 = r7.A03
            X.C18260x0.A1L(r1, r0)
            X.2vw r0 = X.C58862vw.A06
            return r0
        L_0x041e:
            if (r9 == 0) goto L_0x0424
            com.whatsapp.protocol.VoipStanzaChildNode r23 = r20.build()
        L_0x0424:
            r11 = 0
            X.2vw r5 = new X.2vw
            r6 = r4
            r7 = r23
            r8 = r2
            r9 = r3
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56222rd.A00(X.1m4):X.2vw");
    }

    public final C48472ex A01(C54562ov r5, DeviceJid deviceJid, C45442a1 r7, byte[] bArr) {
        if (this.A0E.A0B(deviceJid, r7, bArr, 2)) {
            int i = r7.A00;
            if (i == 0) {
                return this.A07.A03((C836749i) null, r5, r7.A02);
            }
            if (i == 1) {
                return this.A07.A04((C836749i) null, r5, r7.A02);
            }
            throw AnonymousClass000.A0G("invalid ciphertext type; ciphertextType=", AnonymousClass001.A0o(), i);
        }
        Log.e("voip/encryption/decryptCallPayload/invalid device identity");
        return new C48472ex((byte[]) null, -1010);
    }

    public final DeviceJid A02(DeviceJid deviceJid, String str, int i, int i2) {
        AnonymousClass2z0 A042 = AnonymousClass2z0.A04(deviceJid.userJid, str);
        C54562ov A022 = AnonymousClass36G.A02(deviceJid);
        C73523fe A002 = C614730x.A00(A022, this.A09);
        try {
            C621133n r6 = this.A07;
            C59402wr A0A2 = r6.A0A(A022);
            AnonymousClass1E1 r5 = A0A2.A01.A00;
            byte[] A072 = r5.aliceBaseKey_.A07();
            if (A0A2.A00 || r5.remoteRegistrationId_ != i2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
                A0o.append(r5.remoteRegistrationId_);
                A0o.append(", incoming=");
                A0o.append(i2);
                C18260x0.A1R(A0o, ". Fetching new prekey for: ", A042);
                this.A04.A01(deviceJid);
            } else {
                if (i > 2) {
                    if (r6.A0b(A022, A042)) {
                        C18260x0.A1R(AnonymousClass001.A0o(), "voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ", A042);
                        this.A04.A01(deviceJid);
                    }
                } else if (i == 2) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "voip/receive_message/onPeerE2EDecryptionFailed recording base key. ", A042);
                    r6.A0R(A022, A042, A072);
                }
                if (A002 != null) {
                    A002.close();
                }
                return deviceJid;
            }
            if (A002 != null) {
                A002.close();
            }
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r8, byte[] r9, int r10) {
        /*
            r7 = this;
            X.33n r0 = r7.A07
            X.2qF r0 = r0.A07
            int r4 = r0.A01()
            r6 = 1
            if (r9 == 0) goto L_0x0064
            r1 = 0
            byte r0 = r9[r1]
            int r5 = X.C18290x4.A07(r9, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed.  message.id="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r3 = "; serverRegistrationId="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r2 = "; localRegistrationId="
            X.C18260x0.A0y(r2, r1, r4)
            if (r5 == r4) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed registration id received did not match local; message.id="
            X.AnonymousClass001.A1K(r0, r8, r3, r1)
            r1.append(r5)
            X.C18260x0.A0y(r2, r1, r4)
            r1 = 1
        L_0x003f:
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed reject at retry: "
            if (r1 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r10, r0)
            java.lang.String r0 = " sending local pre keys to server; localRegistrationId="
            X.C18260x0.A0y(r0, r1, r4)
            X.1i9 r0 = r7.A02
            r0.A08()
        L_0x0052:
            return
        L_0x0053:
            if (r10 <= r6) goto L_0x0052
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r10, r0)
            java.lang.String r0 = " sending get prekey digest; localRegistrationId="
            X.C18260x0.A0y(r0, r1, r4)
            X.1i9 r0 = r7.A02
            r0.A0B()
            return
        L_0x0064:
            r1 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56222rd.A03(java.lang.String, byte[], int):void");
    }

    public boolean A04() {
        int i;
        AnonymousClass2UP r1 = this.A0H;
        if (r1.A03.A0A()) {
            i = r1.A0d;
        } else {
            i = 0;
        }
        AnonymousClass1VX r12 = this.A0F;
        C58422vE r2 = C58422vE.A02;
        if (i < r12.A0O(r2, 6477) || !this.A07.A0K.A04.A0Y(r2, 4883)) {
            return false;
        }
        return true;
    }

    public C56222rd(C28821hp r2, C29021i9 r3, C44262Vh r4, C49412gU r5, C29231iU r6, C621133n r7, C48972fm r8, C614730x r9, C22931Qq r10, C40342Fl r11, C28771hk r12, AnonymousClass33Z r13, AnonymousClass1VX r14, AnonymousClass4FV r15, AnonymousClass2UP r16) {
        this.A0F = r14;
        this.A0G = r15;
        this.A09 = r9;
        this.A08 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A07 = r7;
        this.A0E = r13;
        this.A0H = r16;
        this.A06 = r6;
        this.A0D = r12;
        this.A0B = r11;
        this.A0A = r10;
        this.A03 = r4;
    }

    public boolean A05(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        DeviceJid deviceJid2;
        int i2 = i;
        if (i < 0 || i > 4) {
            C18260x0.A0y("voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: ", AnonymousClass001.A0o(), i);
        } else if (bArr == null || bArr.length != 4) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=");
            C18260x0.A1L(A0o, Arrays.toString(bArr));
            return false;
        } else {
            int A072 = C18290x4.A07(bArr, bArr[0], 0);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=");
            A0o2.append(A072);
            A0o2.append(" retryCount: ");
            A0o2.append(i);
            DeviceJid deviceJid3 = deviceJid;
            C18260x0.A1R(A0o2, " from: ", deviceJid);
            String str2 = str;
            if (this.A07.A0X() || A04()) {
                deviceJid2 = A02(deviceJid, str, i, A072);
            } else {
                try {
                    deviceJid2 = (DeviceJid) C48972fm.A01(this.A08, new C72113dC(this, deviceJid3, str2, i2, A072));
                } catch (InterruptedException | ExecutionException e) {
                    Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e);
                    return false;
                }
            }
            if (deviceJid2 != null) {
                this.A03.A00(deviceJid2);
                return true;
            }
        }
        return true;
    }
}
