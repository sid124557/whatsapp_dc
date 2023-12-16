package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;

/* renamed from: X.0yY  reason: invalid class name and case insensitive filesystem */
public final class C18970yY extends HandlerThread {
    public AnonymousClass30X A00;
    public boolean A01 = true;
    public final AnonymousClass1VX A02;
    public final AnonymousClass2H6 A03;
    public final AnonymousClass2H7 A04;
    public final C64173Cl A05;
    public final AnonymousClass48H A06;
    public final C54342oZ A07 = new C54342oZ(this);
    public final C55892r5 A08;
    public final ArrayDeque A09 = new ArrayDeque();

    public C18970yY(AnonymousClass1VX r3, AnonymousClass2H6 r4, AnonymousClass2H7 r5, C64173Cl r6, AnonymousClass48H r7, C55892r5 r8) {
        super("WriterThread", 1);
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r8;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static StringBuilder A01(AnonymousClass36K r1, AnonymousClass30X r2) {
        r2.A0D.Bsa(r1);
        return new StringBuilder();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.36K[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.39V[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.36K[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.36K[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.39V[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.36K[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: X.36K[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v218, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v73, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v248, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v84, resolved type: X.2z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v320, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v321, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v61, resolved type: X.39V[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v98, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v351, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v99, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v354, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v324, types: [java.lang.String] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x1356: MOVE  (r1v132 int) = (r21v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x1013 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x101a A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x1093 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x109a A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x10db A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x1116 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x1143 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x114e A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x1155 A[ADDED_TO_REGION, Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x11ba A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x1217 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x1221 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x1225 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x1241 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x1244 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x124f A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x1262 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x12e0 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x12e3 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x1308 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x1341 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x136c A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x1379 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x13ab A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x1436 A[Catch:{ 1zr -> 0x1505, 1zr -> 0x168a, IOException -> 0x1663 }] */
    /* JADX WARNING: Removed duplicated region for block: B:687:? A[RETURN, SYNTHETIC] */
    public void A02(android.os.Message r66) {
        /*
            r65 = this;
            r2 = r66
            android.os.Bundle r7 = r2.getData()
            java.lang.String r0 = "messageClient:iqId"
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "messageClient:checkCallback"
            boolean r0 = r7.getBoolean(r0)
            r64 = r65
            if (r0 == 0) goto L_0x0034
            r0 = r64
            X.48H r0 = r0.A06
            X.C626936e.A06(r1)
            X.0yX r0 = (X.C18960yX) r0
            X.0yZ r0 = r0.A00
            X.30h r0 = r0.A0r
            java.util.Map r3 = r0.A0F
            monitor-enter(r3)
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            r9 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            int r5 = X.C384127l.A00(r2)
            r8 = 43
            if (r5 != r8) goto L_0x0084
            java.lang.Object r6 = r2.obj
            X.2lg r6 = (X.C52562lg) r6
        L_0x0041:
            if (r6 == 0) goto L_0x009b
            if (r5 == r8) goto L_0x009b
            r0 = r64
            X.2r5 r8 = r0.A08
            long r3 = r6.A00
            X.2rb r0 = r8.A02(r3)
            if (r0 == 0) goto L_0x0054
            r0.A02()
        L_0x0054:
            X.2rb r0 = r8.A02(r3)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r0 = r0.A0A
            if (r0 == 0) goto L_0x0075
        L_0x005e:
            r0 = r64
            X.3Cl r0 = r0.A05
            r0.A07(r6)
            r0 = r64
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WriterThread/handleXmppSend: offline preack, dropping without notifying observer, type="
            X.C18260x0.A0w(r0, r1, r5)
        L_0x0074:
            return
        L_0x0075:
            r0 = r64
            X.1VX r4 = r0.A02
            X.2vE r3 = X.C58422vE.A01
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 == 0) goto L_0x009b
            goto L_0x005e
        L_0x0084:
            r0 = r64
            X.1VX r4 = r0.A02
            X.2vE r3 = X.C58422vE.A01
            r0 = 4429(0x114d, float:6.206E-42)
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 != 0) goto L_0x028f
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 != 0) goto L_0x028f
            r6 = 0
        L_0x009b:
            r0 = r64
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00ce
            r0 = r64
            X.1VX r3 = r0.A02
            int r0 = X.C384127l.A00(r2)
            switch(r0) {
                case 0: goto L_0x00d9;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00d9;
                case 8: goto L_0x00d9;
                case 13: goto L_0x00d9;
                case 14: goto L_0x00d9;
                case 18: goto L_0x00d9;
                case 21: goto L_0x00d9;
                case 22: goto L_0x00d9;
                case 23: goto L_0x00d9;
                case 24: goto L_0x00d9;
                case 29: goto L_0x00d9;
                case 38: goto L_0x00d9;
                case 43: goto L_0x00d9;
                case 69: goto L_0x00d9;
                case 70: goto L_0x00d9;
                case 74: goto L_0x00d9;
                case 76: goto L_0x00c5;
                case 77: goto L_0x00d9;
                case 85: goto L_0x00d9;
                case 86: goto L_0x00d9;
                case 87: goto L_0x00d9;
                case 89: goto L_0x00c2;
                case 96: goto L_0x00c5;
                case 105: goto L_0x00d9;
                case 106: goto L_0x00d9;
                case 118: goto L_0x00d9;
                case 119: goto L_0x00d9;
                case 124: goto L_0x00d9;
                case 132: goto L_0x00d9;
                case 133: goto L_0x00d9;
                case 162: goto L_0x00d9;
                case 164: goto L_0x00d9;
                case 183: goto L_0x00d9;
                case 184: goto L_0x00d9;
                case 189: goto L_0x00d9;
                case 192: goto L_0x00d9;
                case 193: goto L_0x00d9;
                case 196: goto L_0x00d9;
                case 214: goto L_0x00d9;
                case 215: goto L_0x00d9;
                case 216: goto L_0x00d9;
                case 222: goto L_0x00d9;
                case 223: goto L_0x00d9;
                case 226: goto L_0x00d9;
                case 229: goto L_0x00d9;
                case 230: goto L_0x00d9;
                case 231: goto L_0x00d9;
                case 232: goto L_0x00d9;
                case 241: goto L_0x00d9;
                case 248: goto L_0x00d9;
                case 251: goto L_0x00d9;
                case 261: goto L_0x00d9;
                case 263: goto L_0x00d9;
                case 270: goto L_0x00d9;
                case 271: goto L_0x00d9;
                case 274: goto L_0x00d9;
                case 275: goto L_0x00d9;
                case 277: goto L_0x00d9;
                case 279: goto L_0x00d9;
                case 296: goto L_0x00d9;
                case 327: goto L_0x00d9;
                case 332: goto L_0x00d9;
                case 342: goto L_0x00d9;
                case 363: goto L_0x00d9;
                case 368: goto L_0x00d9;
                case 369: goto L_0x00d9;
                case 370: goto L_0x00d9;
                case 377: goto L_0x00d9;
                case 378: goto L_0x00d9;
                case 404: goto L_0x00d9;
                case 405: goto L_0x00d9;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            java.lang.String r0 = "messageClient:dropIfOffline"
            boolean r0 = r7.getBoolean(r0)
            if (r0 != 0) goto L_0x00d9
            if (r9 != 0) goto L_0x00d9
            r0 = r64
            java.util.ArrayDeque r1 = r0.A09
            android.os.Message r0 = android.os.Message.obtain(r2)
            r1.add(r0)
            return
        L_0x00c2:
            r0 = 5043(0x13b3, float:7.067E-42)
            goto L_0x00c7
        L_0x00c5:
            r0 = 5042(0x13b2, float:7.065E-42)
        L_0x00c7:
            boolean r0 = X.C56952sp.A0J(r3, r0)
            if (r0 != 0) goto L_0x00d9
            goto L_0x00ac
        L_0x00ce:
            if (r9 == 0) goto L_0x00f5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WriterThread/handleXmppSend: no response callback, dropping  type="
            X.C18260x0.A0w(r0, r2, r5)
        L_0x00d9:
            r0 = r64
            X.48H r0 = r0.A06
            X.0yX r0 = (X.C18960yX) r0
            X.0yZ r0 = r0.A00
            X.30h r3 = r0.A0r
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppIncomingMessageRouter/onOutgoingStanzaDropped iqId:"
            X.C18260x0.A0q(r0, r1, r2)
            if (r1 == 0) goto L_0x0074
            java.lang.Object r4 = r3.A0C
            monitor-enter(r4)
            goto L_0x0295
        L_0x00f5:
            if (r1 == 0) goto L_0x0162
            r0 = r64
            X.48H r0 = r0.A06
            X.0yX r0 = (X.C18960yX) r0
            X.0yZ r0 = r0.A00
            X.30h r8 = r0.A0r
            java.lang.Object r9 = r8.A0C
            monitor-enter(r9)
            java.util.Map r10 = r8.A0F     // Catch:{ all -> 0x02ac }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x02ac }
            if (r0 == 0) goto L_0x0161
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02ac }
            java.lang.String r0 = "XmppIncomingMessageRouter/onIqBeingSent id:"
            X.C18260x0.A0q(r0, r1, r3)     // Catch:{ all -> 0x02ac }
            java.util.Map r7 = r8.A0E     // Catch:{ all -> 0x02ac }
            boolean r0 = r7.containsKey(r1)     // Catch:{ all -> 0x02ac }
            boolean r4 = X.AnonymousClass000.A1T(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02ac }
            java.lang.String r0 = "Unhandled iq-response for id:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r1, r3)     // Catch:{ all -> 0x02ac }
            X.C626936e.A0F(r4, r0)     // Catch:{ all -> 0x02ac }
            java.lang.Object r0 = r10.remove(r1)     // Catch:{ all -> 0x02ac }
            X.4EZ r0 = (X.AnonymousClass4EZ) r0     // Catch:{ all -> 0x02ac }
            r7.put(r1, r0)     // Catch:{ all -> 0x02ac }
            X.2mM r11 = r8.A07     // Catch:{ all -> 0x02ac }
            java.util.concurrent.ConcurrentHashMap r0 = r11.A03     // Catch:{ all -> 0x02ac }
            java.lang.Object r10 = r0.get(r1)     // Catch:{ all -> 0x02ac }
            X.2TM r10 = (X.AnonymousClass2TM) r10     // Catch:{ all -> 0x02ac }
            if (r10 == 0) goto L_0x0161
            long r3 = r10.A07     // Catch:{ all -> 0x02ac }
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02ac }
            r10.A07 = r3     // Catch:{ all -> 0x02ac }
            X.316 r3 = r11.A02     // Catch:{ all -> 0x02ac }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x02ac }
            java.lang.String r0 = "iq_queue"
            r3.A03(r1, r0)     // Catch:{ all -> 0x02ac }
            java.lang.String r0 = "iq_send"
            r3.A04(r1, r0)     // Catch:{ all -> 0x02ac }
        L_0x0161:
            monitor-exit(r9)     // Catch:{ all -> 0x02ac }
        L_0x0162:
            if (r6 == 0) goto L_0x0166
            goto L_0x02af
        L_0x0166:
            r0 = r64
            X.2oZ r0 = r0.A07     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r5 = X.AnonymousClass36N.A00(r2)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r11 = r2.arg1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r11 == 0) goto L_0x1607
            r1 = 3
            if (r11 == r1) goto L_0x15d3
            r1 = 6
            if (r11 == r1) goto L_0x1564
            r1 = 8
            if (r11 == r1) goto L_0x0e58
            r1 = 9
            if (r11 == r1) goto L_0x0e50
            r1 = 23
            if (r11 == r1) goto L_0x0e3c
            r1 = 24
            if (r11 == r1) goto L_0x0e2f
            r1 = 42
            java.lang.String r12 = "stanzaKey"
            if (r11 == r1) goto L_0x0dca
            r1 = 43
            if (r11 == r1) goto L_0x0dbe
            r1 = 76
            if (r11 == r1) goto L_0x0db6
            r1 = 77
            if (r11 == r1) goto L_0x0d04
            java.lang.String r7 = "remoteResource"
            java.lang.String r8 = "messageKeyId"
            r1 = 0
            java.lang.String r4 = "loggableStanzaId"
            java.lang.String r9 = "callId"
            java.lang.String r10 = "callCreatorJid"
            java.lang.String r6 = "jid"
            java.lang.String r3 = "id"
            switch(r11) {
                case 6: goto L_0x1564;
                case 18: goto L_0x0bc0;
                case 21: goto L_0x0bad;
                case 27: goto L_0x0b24;
                case 29: goto L_0x0ae0;
                case 61: goto L_0x09d2;
                case 96: goto L_0x09c2;
                case 117: goto L_0x0957;
                case 129: goto L_0x0946;
                case 157: goto L_0x08ad;
                case 163: goto L_0x086b;
                case 206: goto L_0x0813;
                case 233: goto L_0x1564;
                case 240: goto L_0x07ed;
                case 247: goto L_0x0239;
                case 263: goto L_0x0c69;
                case 276: goto L_0x01df;
                case 295: goto L_0x07b9;
                case 327: goto L_0x0c97;
                case 343: goto L_0x0750;
                case 356: goto L_0x0750;
                case 362: goto L_0x0713;
                case 406: goto L_0x020d;
                case 419: goto L_0x0623;
                case 431: goto L_0x066a;
                default: goto L_0x01ae;
            }     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01ae:
            switch(r11) {
                case 11: goto L_0x0775;
                case 12: goto L_0x05c8;
                case 13: goto L_0x05a9;
                default: goto L_0x01b1;
            }     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01b1:
            switch(r11) {
                case 35: goto L_0x0548;
                case 36: goto L_0x06a5;
                case 37: goto L_0x04ef;
                case 38: goto L_0x0a71;
                default: goto L_0x01b4;
            }     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01b4:
            switch(r11) {
                case 71: goto L_0x0908;
                case 72: goto L_0x04b8;
                case 73: goto L_0x0480;
                default: goto L_0x01b7;
            }     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01b7:
            switch(r11) {
                case 85: goto L_0x03c2;
                case 86: goto L_0x02dd;
                case 87: goto L_0x034d;
                case 88: goto L_0x162c;
                case 89: goto L_0x0623;
                case 90: goto L_0x01bc;
                default: goto L_0x01ba;
            }     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01ba:
            goto L_0x02bb
        L_0x01bc:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "XmppSendMessage/dangling-msgs/count "
            X.C18260x0.A1C(r1, r3, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01cd:
            boolean r1 = r4.hasNext()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x0074
            X.34x r3 = X.C18300x5.A0T(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r1 = r3.A1E     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 != 0) goto L_0x01cd
            r0.A00(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x01cd
        L_0x01df:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r4 == 0) goto L_0x020d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "XmppSendMessage/dangling-notifications/count "
            X.C18260x0.A1C(r1, r3, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x01f2:
            boolean r1 = r5.hasNext()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object r4 = r5.next()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r4 = (X.AnonymousClass39T) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = r4.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "notification"
            boolean r1 = r1.equals(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x01f2
            r0.A02(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x01f2
        L_0x020d:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r6 = X.C384127l.A00(r2)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "XmppSendMessage/preacks/count "
            X.C18260x0.A1C(r1, r3, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0225:
            boolean r1 = r5.hasNext()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r5.next()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2lg r1 = (X.C52562lg) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r1.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r1 = r1.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A01(r1, r6, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0225
        L_0x0239:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "XmppSendMessage/dangling-receipts/count "
            X.C18260x0.A1C(r1, r3, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x024a:
            boolean r1 = r6.hasNext()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object r5 = r6.next()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r5 = (X.AnonymousClass39T) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = r5.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "receipt"
            boolean r1 = r1.equals(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x028b
            java.lang.String r1 = "read"
            java.lang.String r3 = r5.A08     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r1 = r1.equals(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 != 0) goto L_0x0275
            java.lang.String r1 = "read-self"
            boolean r1 = r1.equals(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 == 0) goto L_0x028b
        L_0x0275:
            X.0yY r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2H6 r4 = r1.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r1 = r5.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r3 = X.C627336j.A02(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2r4 r1 = r4.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r1 = r1.A02(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1 = r1 ^ 1
            r0.A03(r5, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x024a
        L_0x028b:
            r0.A02(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x024a
        L_0x028f:
            X.2lg r6 = X.AnonymousClass36N.A08(r2, r4)
            goto L_0x0041
        L_0x0295:
            X.0yH r3 = r3.A0A     // Catch:{ all -> 0x02a9 }
            java.util.concurrent.ConcurrentMap r0 = r3.A00     // Catch:{ all -> 0x02a9 }
            java.lang.Object r2 = r0.remove(r1)     // Catch:{ all -> 0x02a9 }
            if (r2 == 0) goto L_0x02a3
            r0 = 4
            r3.removeMessages(r0, r2)     // Catch:{ all -> 0x02a9 }
        L_0x02a3:
            r0 = 5
            X.C18290x4.A1C(r3, r1, r0)     // Catch:{ all -> 0x02a9 }
            monitor-exit(r4)     // Catch:{ all -> 0x02a9 }
            return
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02a9 }
            throw r0
        L_0x02ac:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x02ac }
            throw r0
        L_0x02af:
            r0 = r64
            X.2oZ r1 = r0.A07     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r6.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = r6.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.A01(r0, r5, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x02bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "XmppSendMessage/unknown what="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r2.what     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "argv1="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "object="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r0 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x02dd:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2OX r4 = (X.AnonymousClass2OX) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r11 = r4.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2Ov r8 = r4.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2oQ r5 = r4.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/rotate-pre-key"
            X.30X r4 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r0 = r4.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.put(r11, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r5 = r4.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r6 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "xmlns"
            java.lang.String r0 = "encrypt"
            boolean r10 = X.AnonymousClass39V.A0F(r4, r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "type"
            java.lang.String r0 = "set"
            boolean r9 = X.AnonymousClass39V.A0G(r4, r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V r0 = X.AnonymousClass39V.A00()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r7 = 2
            r6[r7] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V r4 = new X.39V     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.<init>((java.lang.String) r3, (java.lang.String) r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 3
            r6[r0] = r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r4 = new X.AnonymousClass36K[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r0 = r8.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r3, r0, r4, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "value"
            byte[] r0 = r8.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r3, r0, r4, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "signature"
            byte[] r0 = r8.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r3, r0, r4, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "skey"
            X.36K r3 = X.AnonymousClass36K.A0J(r0, r1, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "rotate"
            X.36K r0 = X.AnonymousClass36K.A0F(r3, r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0G(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.Bsa(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/rotate-pre-key"
            goto L_0x165f
        L_0x034d:
            X.C626936e.A06(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "jids"
            android.os.Parcelable[] r4 = r5.getParcelableArray(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid[] r4 = (com.whatsapp.jid.DeviceJid[]) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = "identityJids"
            android.os.Parcelable[] r12 = r5.getParcelableArray(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "WriterThread/before/write/get-pre-key-batch; id="
            r9.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "; jids="
            r9.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = java.util.Arrays.toString(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1J(r9, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r8 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r9 = r8.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r11 = 1
            X.4HN r0 = new X.4HN     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r8, r11, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9.put(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r4.length     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r17 = r0
            java.util.ArrayList r10 = X.AnonymousClass002.A0I(r17)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.HashSet r16 = X.C18280x3.A0h(r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9 = 0
            r13 = 0
        L_0x0396:
            r12 = 2
            r0 = r17
            if (r13 >= r0) goto L_0x1599
            r15 = r4[r13]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = r16
            boolean r0 = r0.contains(r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = "user"
            if (r0 == 0) goto L_0x03b9
            X.39V[] r12 = new X.AnonymousClass39V[r12]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A02(r15, r6, r12, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r15 = "reason"
            java.lang.String r0 = "identity"
            X.AnonymousClass39V.A0B(r15, r0, r12, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x03b5:
            X.AnonymousClass36K.A0R(r14, r10, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x03bf
        L_0x03b9:
            X.39V[] r12 = new X.AnonymousClass39V[r11]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A02(r15, r6, r12, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x03b5
        L_0x03bf:
            int r13 = r13 + 1
            goto L_0x0396
        L_0x03c2:
            java.lang.Object r5 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2QK r5 = (X.AnonymousClass2QK) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r4 = r5.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r17 = r4
            byte[] r10 = r5.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2Ov[] r7 = r5.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2Ov r13 = r5.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/set-pre-key"
            X.30X r6 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r16 = 5
            int r0 = r6.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r11 = X.AnonymousClass30X.A00(r6, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r4 = r6.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9 = 0
            X.4HN r0 = new X.4HN     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r6, r9, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.put(r11, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r12 = r7.length     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r4 = new X.AnonymousClass36K[r12]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5 = 0
        L_0x03f0:
            java.lang.String r14 = "value"
            r8 = 2
            if (r5 >= r12) goto L_0x0416
            X.36K[] r8 = new X.AnonymousClass36K[r8]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = r7[r5]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r0 = r0.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r3, r0, r8, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = r7[r5]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r15 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r15.<init>((java.lang.String) r14, (byte[]) r0, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            r8[r0] = r15     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "key"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4[r5] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r5 = r5 + 1
            goto L_0x03f0
        L_0x0416:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "identity"
            r0 = r17
            X.AnonymousClass36K.A0Q(r5, r7, r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "registration"
            X.AnonymousClass36K.A0Q(r0, r7, r10, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            byte[] r0 = new byte[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0[r9] = r16     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r10 = "type"
            X.AnonymousClass36K.A0Q(r10, r7, r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "list"
            X.AnonymousClass36K.A0S(r0, r7, r1, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5 = 3
            X.36K[] r12 = new X.AnonymousClass36K[r5]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r0 = r13.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r3, r0, r12, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r0 = r13.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r4 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.<init>((java.lang.String) r14, (byte[]) r0, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            r12[r0] = r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "signature"
            byte[] r0 = r13.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass36K.A0T(r4, r0, r12, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "skey"
            X.AnonymousClass36K.A0S(r0, r7, r1, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r3, r11, r4, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.AnonymousClass39V.A05(r1, r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "set"
            X.AnonymousClass39V.A0B(r10, r0, r4, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0E(r4, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r1 = X.C18280x3.A1a(r7, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "iq"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r4, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/set-pre-key"
            goto L_0x165f
        L_0x0480:
            java.lang.String r8 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = r5.getString(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r5.getLong(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/call-reject-receipt; callId="
            X.C18260x0.A0q(r1, r14, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "reject"
            X.36K r0 = X.AnonymousClass36Z.A02(r7, r6, r8, r14, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/call-reject-receipt; callId="
            goto L_0x093e
        L_0x04b8:
            java.lang.String r7 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r8 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = r5.getString(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r5.getLong(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/call-accept-receipt; callId="
            X.C18260x0.A0q(r1, r14, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "accept"
            X.36K r0 = X.AnonymousClass36Z.A02(r6, r8, r7, r14, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/call-accept-receipt; callId="
            goto L_0x093e
        L_0x04ef:
            if (r5 == 0) goto L_0x04f5
            java.lang.String r1 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x04f5:
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r7 = X.AnonymousClass001.A1Z(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/set-connection-active; active="
            X.C18260x0.A1D(r4, r5, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r8 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r1 != 0) goto L_0x0510
            int r0 = r8.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = X.AnonymousClass30X.A00(r8, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0510:
            java.util.Map r4 = r8.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.1mk r0 = new X.1mk     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r8, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.put(r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = "passive"
            if (r7 == 0) goto L_0x0546
            java.lang.String r0 = "active"
        L_0x0521:
            X.36K r5 = X.AnonymousClass36K.A0H(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A04(r3, r1, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "xmlns"
            X.AnonymousClass39V.A0A(r0, r6, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.6kI r0 = X.C135206kI.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0C(r0, r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/set-connection-active; active="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0546:
            r0 = r6
            goto L_0x0521
        L_0x0548:
            java.lang.String r4 = "XmppSendMessage/set-recovery-token"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "rc"
            byte[] r8 = r5.getByteArray(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "rcJid"
            java.lang.String r9 = r5.getString(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "saveRecoveryToken"
            boolean r5 = r5.getBoolean(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/set-recovery-token"
            X.30X r7 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r7.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = X.AnonymousClass30X.A00(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r4 = r7.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.1ml r0 = new X.1ml     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r7, r9, r8, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.put(r6, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "token"
            X.36K r5 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.<init>((java.lang.String) r0, (byte[]) r8, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A04(r3, r6, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:auth:token"
            X.AnonymousClass39V.A0A(r1, r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.6kI r0 = X.C135206kI.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0C(r0, r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/set-recovery-token"
            goto L_0x165f
        L_0x05a9:
            java.lang.String r1 = "WriterThread/before/write/logout"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r4 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r3 = r4.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "unavailable"
            X.36K r1 = X.C35201wU.A00(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r0 = r3.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.Bsa(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.BqF()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            r4.A01 = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/logout"
            goto L_0x165f
        L_0x05c8:
            java.lang.Object r9 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r9 = (com.whatsapp.jid.Jid) r9     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r4 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "tctoken"
            byte[] r6 = r4.getByteArray(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/subscription-request; jid="
            X.C18260x0.A1P(r4, r3, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r5 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r6 == 0) goto L_0x061d
            X.1wk r3 = new X.1wk     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.<init>((byte[]) r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 6
            X.1wk r6 = new X.1wk     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6.<init>((X.C35361wk) r3, (java.lang.Long) r1, (int) r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x05f1:
            java.lang.String r0 = "presence"
            X.2rL r7 = X.C56052rL.A04(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "subscribe"
            X.C56052rL.A0D(r7, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 2
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            r3 = 0
            r4[r3] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1 = 1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.List r0 = X.AnonymousClass0x9.A1A(r0, r4, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "to"
            boolean r0 = X.C626836d.A0I(r9, r1, r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 == 0) goto L_0x061f
            X.C56052rL.A06(r9, r7, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x061f
        L_0x061d:
            r6 = r1
            goto L_0x05f1
        L_0x061f:
            if (r6 == 0) goto L_0x0da4
            goto L_0x0da1
        L_0x0623:
            java.lang.Object r5 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2T1 r5 = (X.AnonymousClass2T1) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/messages-read; message.key="
            r3.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2z0 r9 = r5.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A0m(r9, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r4 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r10 = r5.A06     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String[] r11 = r5.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r6 = r5.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.UserJid r8 = r5.A04     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r7 = r5.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r3 = X.AnonymousClass36Z.A01(r6, r7, r8, r9, r10, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r0 = r5.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r3, r4, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/messages-read; message.key="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = " participant="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = " extraIds="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String[] r0 = r5.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15ca
        L_0x066a:
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2RT r6 = (X.AnonymousClass2RT) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/send-error-receipt; message.key.id="
            r5.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = r6.A04     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = " errorType="
            r5.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = r6.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1J(r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r5 = r0.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r3 = r6.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r0 = r6.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r13 = r1
            r15 = r1
            r9 = r3
            r10 = r0
            r11 = r1
            r12 = r8
            r14 = r4
            X.36K r0 = X.AnonymousClass36Z.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.Bsa(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/send-error-receipt; message.key.id="
            goto L_0x070e
        L_0x06a5:
            java.lang.String r4 = "XmppSendMessage/get-normalized-jid"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2LQ r6 = (X.AnonymousClass2LQ) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/get-normalized-jid; countryCode="
            r5.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = r6.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = "; phoneNumber="
            r5.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = r6.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1J(r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r11 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r11.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r12 = 1
            java.lang.String r10 = X.AnonymousClass30X.A00(r11, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r5 = r11.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 5
            X.AnonymousClass4HM.A00(r11, r10, r5, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9 = 2
            X.36K[] r6 = new X.AnonymousClass36K[r9]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "cc"
            X.36K r0 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>((java.lang.String) r5, (java.lang.String) r8, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r13 = 0
            r6[r13] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "in"
            X.36K r0 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>((java.lang.String) r5, (java.lang.String) r4, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6[r12] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "normalize"
            X.36K r6 = X.AnonymousClass36K.A0J(r0, r1, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r5 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0E(r5, r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A0C(r1, r0, r5, r12, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0E(r6, r3, r10, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/get-normalized-jid; countryCode="
        L_0x070e:
            X.AnonymousClass001.A1K(r0, r8, r7, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0adb
        L_0x0713:
            java.lang.Object r5 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.3SS r5 = (X.AnonymousClass3SS) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/incoming-appdata-stanza-received; IncomingAppDataStanza.key="
            r3.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2z0 r10 = r5.A08     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A0m(r10, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r1.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r4 = r1.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9 = 0
            com.whatsapp.jid.Jid r0 = r5.BCm()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r7 = X.C106405Yw.A03(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r0 = r5.A07     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r8 = com.whatsapp.jid.DeviceJid.of(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r12 = r9
            r11 = r9
            X.36K r3 = X.AnonymousClass36Z.A01(r7, r8, r9, r10, r11, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r3, r4, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/incoming-appdata-stanza-received; IncomingAppDataStanza.key="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0c5e
        L_0x0750:
            int r5 = X.C384127l.A00(r2)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r4 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r4 = (X.AnonymousClass36K) r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write-compressed/type="
            X.C18260x0.A0w(r1, r3, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r1 = r0.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 3
            r1.Bsb(r4, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/type="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x07b4
        L_0x0775:
            java.lang.Object r10 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2U5 r10 = (X.AnonymousClass2U5) r10     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/message-retry; message.id="
            r3.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r9 = r10.A0B     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = "; jid="
            r3.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r7 = r10.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = "; retryCount="
            r3.append(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r5 = r10.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1F(r3, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r10.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36Z.A04(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-retry; message.key="
            X.AnonymousClass001.A1K(r0, r9, r8, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x07b4:
            r1.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x07b9:
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r6 = (X.C95814uZ) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = r3.getString(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/order-status-update-failure; message.key.id="
            X.C18260x0.A0q(r3, r4, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r3 = r0.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r10 = "order-status-update-failed"
            java.lang.String r11 = "invalid-transition"
            r7 = r1
            r9 = r1
            r5 = r6
            r6 = r1
            r8 = r4
            X.36K r0 = X.AnonymousClass36Z.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.Bsa(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/order-status-update-failure; message.key.id="
            goto L_0x0ad8
        L_0x07ed:
            java.lang.Object r5 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r4 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "presence"
            X.2rL r3 = X.C56052rL.A04(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "probe"
            X.C56052rL.A0D(r3, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "to"
            X.C626836d.A0D(r5, r3, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = r3.A0F()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x0813:
            java.lang.Object r11 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2QR r11 = (X.AnonymousClass2QR) r11     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.protocol.VoipStanzaChildNode r10 = r11.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = r10.tag     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = r11.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/call-stanza-"
            r8.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r8.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = "; id="
            r8.append(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = r11.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r8.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "; callId="
            X.C18260x0.A0q(r4, r14, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r9 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r1 = r11.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "to"
            X.AnonymousClass39V.A01(r1, r0, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A03(r3, r5, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r0 = X.AnonymousClass30X.A0E     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object[] r3 = r8.toArray(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r3 = (X.AnonymousClass39V[]) r3     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r1 = r10.toProtocolTreeNode()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "call"
            X.36K r0 = X.AnonymousClass36K.A0F(r1, r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/call-stanza-"
            X.C18260x0.A0p(r0, r7, r6, r5, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0941
        L_0x086b:
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r6 = (X.C95814uZ) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = r3.getString(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = r3.getString(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r7 = X.C18310x6.A0S(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/message-received-permanent-failure; message.key.id="
            X.C18260x0.A0q(r3, r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r3 = r0.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r11 = "hsm-envelope-mismatch"
            r10 = r1
            r12 = r1
            r8 = r1
            r9 = r5
            X.36K r0 = X.AnonymousClass36Z.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.Bsa(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-received-permanent-failure; message.key.id="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x08ad:
            java.lang.String r13 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r12 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = r5.getString(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "type"
            java.lang.String r15 = r5.getString(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "registrationId"
            byte[] r16 = r5.getByteArray(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "retry"
            byte r6 = r5.getByte(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r5.getLong(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/call-rekey-receipt; callId="
            r5.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.append(r14)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "; type="
            r5.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5.append(r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "; retry="
            X.C18260x0.A0w(r1, r5, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r17 = r6
            X.36K r0 = X.AnonymousClass36Z.A03(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/call-rekey; callId="
            goto L_0x093e
        L_0x0908:
            java.lang.String r7 = r5.getString(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r5.getString(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.DeviceJid r8 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r14 = r5.getString(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r5.getLong(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/call-offer-receipt; callId="
            X.C18260x0.A0q(r1, r14, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r1 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "offer"
            X.36K r0 = X.AnonymousClass36Z.A02(r6, r8, r7, r14, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/call-offer-receipt; callId="
        L_0x093e:
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0941:
            r1.append(r14)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0946:
            java.lang.Object r3 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r3 = (X.AnonymousClass39T) r3     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/send-message-ack"
            X.30X r0 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A06(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/send-message-ack"
            goto L_0x165f
        L_0x0957:
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "subType"
            boolean r3 = r3.containsKey(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r3 == 0) goto L_0x09c0
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r10 = r3.getString(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x096c:
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "errorCode"
            boolean r3 = r3.containsKey(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r3 == 0) goto L_0x0984
            android.os.Bundle r1 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r1 = r1.getInt(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0984:
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r6 = (X.C95814uZ) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = r3.getString(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = r3.getString(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r7 = X.C18310x6.A0S(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/message-received-structure-unavailable; message.key.id="
            X.C18260x0.A0q(r3, r4, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4Ea r3 = r0.A0D     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r11 = "structure-unavailable"
            r12 = 0
            r8 = r1
            r9 = r4
            X.36K r0 = X.AnonymousClass36Z.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.Bsa(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-received-structure-unavailable; message.key.id="
            goto L_0x0ad8
        L_0x09c0:
            r10 = r1
            goto L_0x096c
        L_0x09c2:
            android.os.Parcelable r3 = r5.getParcelable(r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r3 = (X.AnonymousClass39T) r3     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "disable"
            boolean r1 = r5.getBoolean(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A03(r3, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x09d2:
            java.lang.String r4 = "XmppSendMessage/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r8 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2LP r8 = (X.AnonymousClass2LP) r8     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/change-number; oldChatUserId="
            r5.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = r8.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1J(r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r7 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.List r0 = r8.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r16 = r0
            int r0 = r7.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r10 = 1
            java.lang.String r11 = X.AnonymousClass30X.A00(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r5 = r7.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 6
            X.AnonymousClass4HM.A00(r7, r11, r5, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "username"
            X.36K r12 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r12.<init>((java.lang.String) r0, (java.lang.String) r4, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r9 = 2
            java.lang.String r5 = "modify"
            r8 = 0
            if (r16 == 0) goto L_0x0a50
            int r0 = r16.size()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 <= 0) goto L_0x0a50
            int r0 = r16.size()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r14 = new X.AnonymousClass36K[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r15 = 0
        L_0x0a1a:
            int r0 = r16.size()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r15 >= r0) goto L_0x0a36
            X.39V[] r13 = new X.AnonymousClass39V[r10]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = r16
            java.lang.Object r0 = r0.get(r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A02(r0, r6, r13, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "user"
            X.AnonymousClass36K.A0U(r0, r13, r14, r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r15 = r15 + 1
            goto L_0x0a1a
        L_0x0a36:
            java.lang.String r13 = "notify"
            X.36K r6 = X.AnonymousClass36K.A0J(r13, r1, r14)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r1 = new X.AnonymousClass39V[r10]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "true"
            X.AnonymousClass39V.A0B(r13, r0, r1, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r0 = new X.AnonymousClass36K[r9]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0[r8] = r12     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0[r10] = r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r6 = X.AnonymousClass36K.A0J(r5, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0a54
        L_0x0a50:
            X.36K r6 = X.AnonymousClass36K.A0F(r12, r5, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0a54:
            X.39V[] r5 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r3, r11, r5, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A0C(r1, r0, r5, r10, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.6kI r0 = X.C135206kI.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0C(r0, r6, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/change-number; oldChatUserId="
            goto L_0x0ad8
        L_0x0a71:
            java.lang.Object r11 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2QJ r11 = (X.AnonymousClass2QJ) r11     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "id="
            r4.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String[] r8 = r11.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3 = 0
            r3 = r8[r3]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = " count="
            r4.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r7 = r8.length     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = " to="
            r4.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r10 = r11.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.append(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = " participant="
            r4.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r9 = r11.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = X.AnonymousClass000.A0R(r9, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/message-played; "
            X.C18260x0.A0q(r3, r4, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r6 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = r11.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A0H(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 0
            r0 = r8[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3 = 0
            X.39V[] r1 = X.AnonymousClass36Z.A07(r10, r9, r0, r1, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            if (r7 <= r0) goto L_0x0acb
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r8, r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r3 = X.AnonymousClass36Z.A09(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0acb:
            java.lang.String r0 = "receipt"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-played; "
        L_0x0ad8:
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0adb:
            r1.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0ae0:
            java.lang.Object r5 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2QL r5 = (X.AnonymousClass2QL) r5     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/status-update"
            X.30X r11 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r12 = r5.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2Hs r8 = r5.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4B6 r10 = r5.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2Ht r9 = r5.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r11.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = X.AnonymousClass30X.A00(r11, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r0 = r11.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.1mn r7 = new X.1mn     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.put(r6, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = "status"
            X.36K r4 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.<init>((java.lang.String) r5, (java.lang.String) r12, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r1 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A04(r3, r6, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "xmlns"
            X.AnonymousClass39V.A0A(r0, r5, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.6kI r0 = X.C135206kI.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0C(r0, r4, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/status-update"
            goto L_0x165f
        L_0x0b24:
            java.lang.String r15 = "lg"
            java.lang.String r14 = r5.getString(r15)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r13 = "lc"
            java.lang.String r17 = r5.getString(r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "userFeedback"
            java.lang.String r12 = r5.getString(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "deleteReason"
            int r16 = r5.getInt(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "WriterThread/before/write/remove-account"
            X.30X r10 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r10.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r11 = 1
            java.lang.String r9 = X.AnonymousClass30X.A00(r10, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r0 = r10.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r8 = 0
            X.AnonymousClass4HM.A00(r10, r9, r0, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r7 = 3
            r6 = 2
            if (r12 == 0) goto L_0x0b5e
            java.lang.String r0 = ""
            if (r14 != 0) goto L_0x0b59
            r14 = r0
        L_0x0b59:
            if (r17 == 0) goto L_0x0b60
            r0 = r17
            goto L_0x0b60
        L_0x0b5e:
            r4 = r1
            goto L_0x0b7f
        L_0x0b60:
            java.lang.String r5 = "body"
            if (r16 < 0) goto L_0x0ba4
            X.39V[] r4 = new X.AnonymousClass39V[r7]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r15, r14, r4, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r13, r0, r4, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r13 = "reason"
            java.lang.String r0 = java.lang.Integer.toString(r16)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r13, r0, r4, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0b76:
            X.36K r0 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>((java.lang.String) r5, (java.lang.String) r12, (X.AnonymousClass39V[]) r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r4 = new X.AnonymousClass36K[r11]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4[r8] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0b7f:
            java.lang.String r0 = "remove"
            X.36K r5 = X.AnonymousClass36K.A0J(r0, r1, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0E(r4, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A0C(r1, r0, r4, r11, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r3, r9, r4, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0G(r5, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/remove-account"
            goto L_0x165f
        L_0x0ba4:
            X.39V[] r4 = new X.AnonymousClass39V[r6]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r15, r14, r4, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r13, r0, r4, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0b76
        L_0x0bad:
            java.lang.String r1 = "forceRefresh"
            boolean r3 = r5.getBoolean(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/get-server-props"
            X.30X r0 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A07(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/get-server-props"
            goto L_0x165f
        L_0x0bc0:
            java.lang.String r1 = "XmppSendMessage/clear-dirty "
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r4 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "category"
            java.lang.String r5 = r4.getString(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Bundle r4 = r2.getData()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "timestamp"
            long r6 = r4.getLong(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Long r10 = java.lang.Long.valueOf(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/clear-dirty; category="
            r6.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "; timestamp="
            X.C18260x0.A1P(r6, r4, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r7 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r7.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = X.AnonymousClass30X.A00(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r1 = r7.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            X.AnonymousClass4HM.A00(r7, r8, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r9 = "iq"
            X.2rL r6 = X.C56052rL.A04(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C56052rL.A0D(r6, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 0
            boolean r0 = X.C626836d.A0N(r8, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 == 0) goto L_0x0c1b
            X.C56052rL.A0D(r6, r3, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0c1b:
            X.36K r8 = r6.A0F()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r5.equals(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 == 0) goto L_0x0c63
            X.1wt r6 = new X.1wt     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6.<init>(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0c2d:
            X.2rL r3 = X.C56052rL.A04(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "to"
            X.6kI r0 = X.C135206kI.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C56052rL.A06(r0, r3, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:dirty"
            X.C56052rL.A0D(r3, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "clean"
            X.2rL r0 = X.C56052rL.A04(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C41032Ir.A08(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C56052rL.A07(r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.A0I(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = r3.A0F()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/clear-dirty; category="
            X.AnonymousClass001.A1K(r0, r5, r4, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0c5e:
            r1.append(r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0c63:
            X.1x0 r6 = new X.1x0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6.<init>(r5, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0c2d
        L_0x0c69:
            java.lang.String r1 = "WriterThread/before/write/clear_fbns_token;"
            X.30X r6 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r6.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = X.AnonymousClass30X.A00(r6, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 17
            X.1wk r4 = new X.1wk     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r4.<init>((java.lang.String) r5, (int) r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "fbns"
            X.1x3 r0 = new X.1x3     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.1xJ r3 = new X.1xJ     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.<init>((X.C35361wk) r4, (X.AnonymousClass4GI) r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r1 = r6.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 4
            X.AnonymousClass4HM.A00(r6, r5, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = r3.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/clear_fbns_token;"
            goto L_0x165f
        L_0x0c97:
            java.lang.Object r11 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2T2 r11 = (X.AnonymousClass2T2) r11     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "WriterThread/before/write/message-md-media-error; id="
            r10.append(r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = r11.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r10.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = " chatJid="
            r10.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r5 = r11.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r10.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = " participant="
            r10.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r9 = r11.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A0m(r9, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r3 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r10 = r11.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r13 = r11.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r15 = r11.A06     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r0 = r11.A04     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r16 = r0
            java.lang.String r0 = "server-error"
            X.39V[] r10 = X.AnonymousClass36Z.A07(r10, r1, r8, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 2
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r11 = 0
            if (r13 == 0) goto L_0x0cf0
            X.36K[] r14 = new X.AnonymousClass36K[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "enc_p"
            X.AnonymousClass36K.A0T(r0, r13, r14, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "enc_iv"
            X.36K r13 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r13.<init>((java.lang.String) r0, (byte[]) r15, (X.AnonymousClass39V[]) r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            r14[r0] = r13     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "encrypt"
            X.AnonymousClass36K.A0S(r0, r12, r1, r14)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0cf0:
            r0 = 3
            java.util.ArrayList r13 = X.AnonymousClass002.A0I(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A01(r5, r6, r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "from_me"
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A03(r1, r0, r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r9 == 0) goto L_0x0d78
            goto L_0x0d72
        L_0x0d04:
            java.lang.Object r10 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2SM r10 = (X.AnonymousClass2SM) r10     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/message-media-error; id="
            r3.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r8 = r10.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r7 = " to="
            r3.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r5 = r10.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = " participant="
            r3.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.4uZ r9 = r10.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A0m(r9, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r11 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = r10.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r6 = r10.A04     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            byte[] r3 = r10.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "server-error"
            X.39V[] r12 = X.AnonymousClass36Z.A07(r5, r9, r8, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r10 = "receipt"
            if (r6 == 0) goto L_0x0d6d
            r0 = 2
            X.36K[] r14 = new X.AnonymousClass36K[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "enc_p"
            r13 = 0
            X.36K r0 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>((java.lang.String) r1, (byte[]) r6, (X.AnonymousClass39V[]) r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6 = 0
            r14[r6] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "enc_iv"
            X.36K r0 = new X.36K     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>((java.lang.String) r1, (byte[]) r3, (X.AnonymousClass39V[]) r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3 = 1
            r14[r3] = r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "encrypt"
            X.36K r1 = X.AnonymousClass36K.A0J(r0, r13, r14)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r0 = new X.AnonymousClass36K[r3]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0[r6] = r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0J(r10, r12, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0d66:
            java.lang.StringBuilder r1 = A01(r0, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-media-error; id="
            goto L_0x0d97
        L_0x0d6d:
            X.36K r0 = X.AnonymousClass36K.A0I(r10, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0d66
        L_0x0d72:
            java.lang.String r0 = "participant"
            X.AnonymousClass39V.A01(r9, r0, r13)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0d78:
            X.39V[] r0 = X.AnonymousClass30X.A0E     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object[] r1 = r13.toArray(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r1 = (X.AnonymousClass39V[]) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "rmr"
            X.AnonymousClass36K.A0R(r0, r12, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r1 = X.C18280x3.A1a(r12, r11)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "receipt"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r10, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/message-md-media-error; id="
        L_0x0d97:
            X.AnonymousClass001.A1K(r0, r8, r7, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x0db1
        L_0x0da1:
            X.C41032Ir.A08(r7, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0da4:
            X.36K r0 = r7.A0F()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/subscription-request; jid="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x0db1:
            r1.append(r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0db6:
            java.lang.Object r1 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r1 = (X.AnonymousClass39T) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A02(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x0dbe:
            java.lang.Object r1 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2lg r1 = (X.C52562lg) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r3 = r1.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r1 = r1.A01     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A01(r1, r11, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x0dca:
            android.os.Parcelable r10 = r5.getParcelable(r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r10 = (X.AnonymousClass39T) r10     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "isValid"
            boolean r8 = r5.getBoolean(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/contact-ack; toJid="
            r3.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            com.whatsapp.jid.Jid r7 = r10.A02     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = "; msgId="
            r3.append(r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = r10.A07     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "; isValid="
            X.C18260x0.A1D(r4, r3, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r9 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r8 == 0) goto L_0x0e2b
            java.lang.String r3 = "in"
        L_0x0dfb:
            java.lang.String r0 = "contacts"
            X.39V r1 = new X.39V     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.<init>((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r3 = X.AnonymousClass0x9.A1V()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 0
            r3[r0] = r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1 = 0
            java.lang.String r0 = "sync"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r3, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r3 = X.AnonymousClass36Z.A06(r0, r10)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            long r0 = r10.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass30X.A01(r3, r9, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/contact-ack; toJid="
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass001.A1K(r6, r5, r4, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r1.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15cd
        L_0x0e2b:
            java.lang.String r3 = "out"
            goto L_0x0dfb
        L_0x0e2f:
            java.lang.String r1 = "WriterThread/before/write/sendAvailableForChat"
            X.30X r0 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A03()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/sendAvailableForChat"
            goto L_0x165f
        L_0x0e3c:
            java.lang.String r1 = "WriterThread/before/write/sendUnavailableForChat"
            X.30X r1 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "unavailable"
            X.36K r0 = X.C35201wU.A00(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/sendUnavailableForChat"
            goto L_0x165f
        L_0x0e50:
            java.lang.Object r1 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.34x r1 = (X.C624134x) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A00(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x0e58:
            java.lang.Object r8 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C626936e.A06(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2oN r8 = (X.C54222oN) r8     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/message-encrypted; "
            X.C18260x0.A1P(r3, r1, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r1 = r0.A00     // Catch:{ 1zr -> 0x1505 }
            r63 = r1
            X.2H7 r3 = r1.A04     // Catch:{ 1zr -> 0x1505 }
            X.30X r1 = r1.A00     // Catch:{ 1zr -> 0x1505 }
            r62 = r1
            X.363 r7 = r3.A00     // Catch:{ 1zr -> 0x1505 }
            X.2z0 r6 = r8.A0F     // Catch:{ 1zr -> 0x1505 }
            com.whatsapp.jid.Jid r5 = r8.A08     // Catch:{ 1zr -> 0x1505 }
            long r3 = r8.A05     // Catch:{ 1zr -> 0x1505 }
            r16 = r3
            int r1 = r8.A04     // Catch:{ 1zr -> 0x1505 }
            r20 = r1
            byte r1 = r8.A00     // Catch:{ 1zr -> 0x1505 }
            r61 = r1
            com.whatsapp.jid.PhoneUserJid r1 = r8.A09     // Catch:{ 1zr -> 0x1505 }
            r26 = r1
            java.lang.String r1 = r8.A0U     // Catch:{ 1zr -> 0x1505 }
            r25 = r1
            com.whatsapp.jid.DeviceJid r1 = r8.A07     // Catch:{ 1zr -> 0x1505 }
            r29 = r1
            com.whatsapp.jid.UserJid r1 = r8.A0A     // Catch:{ 1zr -> 0x1505 }
            r28 = r1
            java.lang.String r1 = r8.A0O     // Catch:{ 1zr -> 0x1505 }
            r31 = r1
            java.lang.String r1 = r8.A0P     // Catch:{ 1zr -> 0x1505 }
            r33 = r1
            java.lang.String r1 = r8.A0R     // Catch:{ 1zr -> 0x1505 }
            r60 = r1
            java.lang.String r9 = r8.A0Q     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = r8.A0M     // Catch:{ 1zr -> 0x1505 }
            r59 = r1
            X.2a1 r4 = r8.A0E     // Catch:{ 1zr -> 0x1505 }
            java.util.Map r1 = r8.A0Y     // Catch:{ 1zr -> 0x1505 }
            r58 = r1
            java.util.Map r1 = r8.A0a     // Catch:{ 1zr -> 0x1505 }
            r19 = r1
            java.util.List r1 = r8.A0W     // Catch:{ 1zr -> 0x1505 }
            r18 = r1
            int r12 = r8.A03     // Catch:{ 1zr -> 0x1505 }
            java.util.List r10 = r8.A0X     // Catch:{ 1zr -> 0x1505 }
            int r1 = r8.A01     // Catch:{ 1zr -> 0x1505 }
            r21 = r1
            java.lang.Integer r1 = r8.A0J     // Catch:{ 1zr -> 0x1505 }
            r57 = r1
            X.34w r11 = r8.A06     // Catch:{ 1zr -> 0x1505 }
            java.util.Map r1 = r8.A0Z     // Catch:{ 1zr -> 0x1505 }
            r56 = r1
            java.lang.Integer r1 = r8.A0K     // Catch:{ 1zr -> 0x1505 }
            r30 = r1
            java.lang.String r1 = r8.A0N     // Catch:{ 1zr -> 0x1505 }
            r55 = r1
            java.lang.String r1 = r8.A0T     // Catch:{ 1zr -> 0x1505 }
            r54 = r1
            boolean r1 = r8.A0c     // Catch:{ 1zr -> 0x1505 }
            r24 = r1
            X.36K r1 = r8.A0H     // Catch:{ 1zr -> 0x1505 }
            r38 = r1
            X.3ZC r1 = r8.A0G     // Catch:{ 1zr -> 0x1505 }
            r37 = r1
            boolean r1 = r8.A0b     // Catch:{ 1zr -> 0x1505 }
            r47 = r1
            java.lang.String r1 = r8.A0S     // Catch:{ 1zr -> 0x1505 }
            r42 = r1
            X.2fw r1 = r8.A0B     // Catch:{ 1zr -> 0x1505 }
            r53 = r1
            X.2kS r1 = r8.A0D     // Catch:{ 1zr -> 0x1505 }
            r36 = r1
            java.lang.String r1 = r8.A0V     // Catch:{ 1zr -> 0x1505 }
            r32 = r1
            X.2kR r1 = r8.A0C     // Catch:{ 1zr -> 0x1505 }
            r35 = r1
            int r1 = r8.A02     // Catch:{ 1zr -> 0x1505 }
            r52 = r1
            java.lang.String r1 = r8.A0L     // Catch:{ 1zr -> 0x1505 }
            r51 = r1
            if (r4 != 0) goto L_0x0f22
            if (r19 == 0) goto L_0x0f08
            boolean r1 = r19.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x0f22
        L_0x0f08:
            boolean r1 = r56.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x0f22
            X.2qk r1 = r7.A02     // Catch:{ 1zr -> 0x1505 }
            r15 = r1
            X.4uZ r1 = r6.A00     // Catch:{ 1zr -> 0x1505 }
            int r1 = X.AnonymousClass36M.A05(r1)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r14 = java.lang.String.valueOf(r1)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r13 = "sendMessageEncrypted/empty_payload"
            r3 = 1
            r15.A0A(r13, r3, r14)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f22:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            r13 = r12 & 64
            r1 = 0
            if (r13 == 0) goto L_0x0f31
            java.lang.String r13 = "multicast"
            X.AnonymousClass36K.A0R(r13, r3, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f31:
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0f3b
            java.lang.String r13 = "url_number"
            X.AnonymousClass36K.A0R(r13, r3, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f3b:
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0f45
            java.lang.String r13 = "url_text"
            X.AnonymousClass36K.A0R(r13, r3, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f45:
            r12 = r12 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0f4e
            java.lang.String r12 = "automated"
            X.AnonymousClass36K.A0R(r12, r3, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f4e:
            if (r32 == 0) goto L_0x0fcb
            X.4uZ r12 = r6.A00     // Catch:{ 1zr -> 0x1505 }
            boolean r13 = r12 instanceof X.C135166kE     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r12 = "Send status setting for non-status msg"
            X.C626936e.A0D(r13, r12)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r27 = "status_setting"
            java.lang.String r23 = "meta"
            if (r10 == 0) goto L_0x0fb9
            boolean r12 = r10.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r12 != 0) goto L_0x0fb9
            java.util.Iterator r22 = r10.iterator()     // Catch:{ 1zr -> 0x1505 }
            r13 = 0
        L_0x0f6c:
            boolean r10 = r22.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x0fb7
            X.36K r14 = X.C18310x6.A0Y(r22)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r12 = r14.A00     // Catch:{ 1zr -> 0x1505 }
            r10 = r23
            boolean r10 = r10.equals(r12)     // Catch:{ 1zr -> 0x1505 }
            if (r10 != 0) goto L_0x0f84
            r3.add(r14)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x0f6c
        L_0x0f84:
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r10 = r14.A0u()     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x0f95
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ 1zr -> 0x1505 }
            r13.addAll(r10)     // Catch:{ 1zr -> 0x1505 }
        L_0x0f95:
            r12 = r27
            r10 = r32
            X.AnonymousClass39V.A03(r12, r10, r13)     // Catch:{ 1zr -> 0x1505 }
            r10 = 0
            X.39V[] r12 = X.C18300x5.A1Z(r13, r10)     // Catch:{ 1zr -> 0x1505 }
            X.36K[] r10 = r14.A03     // Catch:{ 1zr -> 0x1505 }
            r34 = r10
            byte[] r10 = r14.A01     // Catch:{ 1zr -> 0x1505 }
            r13 = r10
            X.36K r10 = new X.36K     // Catch:{ 1zr -> 0x1505 }
            r15 = r12
            r14 = r34
            r12 = r23
            r10.<init>(r12, r13, r15, r14)     // Catch:{ 1zr -> 0x1505 }
            r3.add(r10)     // Catch:{ 1zr -> 0x1505 }
            r13 = 1
            goto L_0x0f6c
        L_0x0fb7:
            if (r13 != 0) goto L_0x0fd0
        L_0x0fb9:
            X.39V[] r14 = X.AnonymousClass0x9.A1V()     // Catch:{ 1zr -> 0x1505 }
            r13 = 0
            r12 = r27
            r10 = r32
            X.AnonymousClass39V.A0B(r12, r10, r14, r13)     // Catch:{ 1zr -> 0x1505 }
            r10 = r23
            X.AnonymousClass36K.A0R(r10, r3, r14)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x0fd0
        L_0x0fcb:
            if (r10 == 0) goto L_0x0fd0
            r3.addAll(r10)     // Catch:{ 1zr -> 0x1505 }
        L_0x0fd0:
            if (r20 <= 0) goto L_0x0fd6
            r34 = 1
            if (r36 != 0) goto L_0x0fd8
        L_0x0fd6:
            r34 = 0
        L_0x0fd8:
            X.5rC r10 = r7.A00     // Catch:{ 1zr -> 0x1505 }
            r50 = r10
            boolean r32 = r50.A07()     // Catch:{ 1zr -> 0x1505 }
            if (r32 == 0) goto L_0x1002
            r50.A04()     // Catch:{ 1zr -> 0x1505 }
            r12 = 88
            r10 = r61
            if (r10 != r12) goto L_0x1002
            X.4uZ r10 = X.C106405Yw.A03(r5)     // Catch:{ 1zr -> 0x1505 }
            boolean r10 = X.C155477ey.A00(r10)     // Catch:{ 1zr -> 0x1505 }
            if (r10 != 0) goto L_0x1002
            boolean r10 = r5 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1zr -> 0x1505 }
            if (r10 != 0) goto L_0x0fff
            boolean r10 = X.C627336j.A0K(r5)     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x1002
        L_0x0fff:
            r27 = 1
            goto L_0x1004
        L_0x1002:
            r27 = 0
        L_0x1004:
            X.2rv r12 = r7.A07     // Catch:{ 1zr -> 0x1505 }
            r13 = 88
            r14 = 0
            r10 = r61
            if (r10 != r13) goto L_0x101a
            X.4uZ r10 = X.C106405Yw.A03(r5)     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x101a
            int r12 = r12.A00(r10)     // Catch:{ 1zr -> 0x1505 }
            if (r12 == 0) goto L_0x1023
            goto L_0x101d
        L_0x101a:
            r23 = 0
            goto L_0x1025
        L_0x101d:
            r10 = 1
            if (r12 == r10) goto L_0x102e
            r10 = 2
            if (r12 == r10) goto L_0x102e
        L_0x1023:
            r23 = r14
        L_0x1025:
            if (r34 != 0) goto L_0x102c
            if (r27 != 0) goto L_0x102c
            r15 = 0
            if (r14 == 0) goto L_0x1030
        L_0x102c:
            r15 = 1
            goto L_0x1030
        L_0x102e:
            r14 = 1
            goto L_0x1023
        L_0x1030:
            boolean r10 = r56.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x1082
            if (r15 != 0) goto L_0x108f
            if (r4 == 0) goto L_0x1061
            r39 = r4
            r40 = r57
            r41 = r9
            r43 = r20
            r44 = r47
            X.36K r10 = X.AnonymousClass35A.A01(r39, r40, r41, r42, r43, r44)     // Catch:{ 1zr -> 0x1505 }
            r3.add(r10)     // Catch:{ 1zr -> 0x1505 }
            boolean r10 = r5 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x108f
            r10 = r53
            X.AnonymousClass363.A03(r10, r9, r3)     // Catch:{ 1zr -> 0x1505 }
            r12 = r5
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ 1zr -> 0x1505 }
            X.36K r10 = X.AnonymousClass363.A01(r12, r10, r9)     // Catch:{ 1zr -> 0x1505 }
            if (r10 == 0) goto L_0x108f
            r3.add(r10)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x108f
        L_0x1061:
            java.lang.String r40 = "none"
            r43 = 2
            r39 = r57
            r41 = r9
            r44 = r20
            r45 = r47
            java.util.List r12 = X.AnonymousClass35A.A03(r39, r40, r41, r42, r43, r44, r45)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r10 = X.AnonymousClass35A.A00     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r12 = r12.toArray(r10)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r12 = (X.AnonymousClass39V[]) r12     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "enc"
            X.AnonymousClass36K.A0R(r10, r3, r12)     // Catch:{ 1zr -> 0x1505 }
            r46 = 1
            goto L_0x1091
        L_0x1082:
            if (r15 != 0) goto L_0x108f
            if (r19 != 0) goto L_0x1089
            r12 = 1
            if (r18 == 0) goto L_0x108a
        L_0x1089:
            r12 = 0
        L_0x108a:
            java.lang.String r10 = "Message fanout is only supported for 1:1 chat"
            X.C626936e.A0F(r12, r10)     // Catch:{ 1zr -> 0x1505 }
        L_0x108f:
            r46 = 0
        L_0x1091:
            if (r38 == 0) goto L_0x1098
            r10 = r38
            r3.add(r10)     // Catch:{ 1zr -> 0x1505 }
        L_0x1098:
            if (r11 == 0) goto L_0x10d9
            X.9U4 r12 = r7.A06     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = r11.A0G     // Catch:{ 1zr -> 0x1505 }
            X.9SU r13 = r12.A0F(r10)     // Catch:{ 1zr -> 0x1505 }
            r10 = 0
            if (r13 == 0) goto L_0x10d7
            java.lang.String r12 = r11.A0I     // Catch:{ 1zr -> 0x1505 }
            X.9oC r14 = r13.A01(r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x10ab:
            X.39V[] r12 = X.AnonymousClass363.A08     // Catch:{ 1zr -> 0x1505 }
            if (r14 == 0) goto L_0x10d0
            java.util.List r13 = r14.BAf(r11, r6)     // Catch:{ 1zr -> 0x1505 }
            if (r13 == 0) goto L_0x10bb
            java.lang.Object[] r12 = r13.toArray(r12)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r12 = (X.AnonymousClass39V[]) r12     // Catch:{ 1zr -> 0x1505 }
        L_0x10bb:
            java.util.List r11 = r14.BAe(r11, r6)     // Catch:{ 1zr -> 0x1505 }
            if (r11 == 0) goto L_0x10d0
            boolean r13 = r11.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r13 != 0) goto L_0x10d0
            r10 = 0
            X.36K[] r10 = new X.AnonymousClass36K[r10]     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r10 = r11.toArray(r10)     // Catch:{ 1zr -> 0x1505 }
            X.36K[] r10 = (X.AnonymousClass36K[]) r10     // Catch:{ 1zr -> 0x1505 }
        L_0x10d0:
            java.lang.String r11 = "pay"
            X.AnonymousClass36K.A0S(r11, r3, r12, r10)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x10d9
        L_0x10d7:
            r14 = r1
            goto L_0x10ab
        L_0x10d9:
            if (r37 == 0) goto L_0x1114
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            r10 = r37
            int r10 = r10.actualActors     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r11 = java.lang.Integer.toString(r10)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "actual_actors"
            X.AnonymousClass39V.A03(r10, r11, r12)     // Catch:{ 1zr -> 0x1505 }
            r10 = r37
            int r10 = r10.hostStorage     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r11 = java.lang.Integer.toString(r10)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "host_storage"
            X.AnonymousClass39V.A03(r10, r11, r12)     // Catch:{ 1zr -> 0x1505 }
            r10 = r37
            long r10 = r10.privacyModeTs     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r11 = java.lang.Long.toString(r10)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "privacy_mode_ts"
            X.AnonymousClass39V.A03(r10, r11, r12)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r10 = X.AnonymousClass363.A08     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r11 = r12.toArray(r10)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r11 = (X.AnonymousClass39V[]) r11     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "biz"
            X.AnonymousClass36K.A0R(r10, r3, r11)     // Catch:{ 1zr -> 0x1505 }
        L_0x1114:
            if (r35 == 0) goto L_0x113d
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            r10 = r35
            int r10 = r10.A00     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r12 = java.lang.Integer.toString(r10)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "conversion_source"
            X.AnonymousClass39V.A03(r10, r12, r11)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r12 = "conversion_data"
            r10 = r35
            java.lang.String r10 = r10.A01     // Catch:{ 1zr -> 0x1505 }
            X.AnonymousClass39V.A03(r12, r10, r11)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r10 = X.AnonymousClass363.A08     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r11 = r11.toArray(r10)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r11 = (X.AnonymousClass39V[]) r11     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r10 = "ctwa"
            X.AnonymousClass36K.A0R(r10, r3, r11)     // Catch:{ 1zr -> 0x1505 }
        L_0x113d:
            boolean r48 = X.C627336j.A0K(r5)     // Catch:{ 1zr -> 0x1505 }
            if (r15 == 0) goto L_0x1155
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            r10 = 1
        L_0x1148:
            boolean r11 = r13.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r11 != 0) goto L_0x11a0
            boolean r11 = android.text.TextUtils.isEmpty(r59)     // Catch:{ 1zr -> 0x1505 }
            if (r11 == 0) goto L_0x117c
            goto L_0x117a
        L_0x1155:
            if (r4 == 0) goto L_0x1160
            int r11 = r4.A00     // Catch:{ 1zr -> 0x1505 }
            r10 = 2
            if (r11 != r10) goto L_0x1160
            r49 = 1
            if (r29 == 0) goto L_0x1162
        L_0x1160:
            r49 = 0
        L_0x1162:
            r10 = 1
            r37 = r53
            r38 = r57
            r39 = r9
            r40 = r42
            r41 = r18
            r42 = r58
            r43 = r19
            r44 = r56
            r45 = r20
            java.util.List r13 = X.AnonymousClass363.A02(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x1148
        L_0x117a:
            r11 = 0
            goto L_0x1187
        L_0x117c:
            X.39V[] r1 = new X.AnonymousClass39V[r10]     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r12 = "name"
            r11 = r59
            boolean r11 = X.AnonymousClass39V.A0F(r12, r11, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x1187:
            X.36K[] r11 = new X.AnonymousClass36K[r11]     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r12 = r13.toArray(r11)     // Catch:{ 1zr -> 0x1505 }
            X.36K[] r12 = (X.AnonymousClass36K[]) r12     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r11 = "participants"
            X.AnonymousClass36K.A0S(r11, r3, r1, r12)     // Catch:{ 1zr -> 0x1505 }
            int r1 = r56.size()     // Catch:{ 1zr -> 0x1505 }
            if (r1 <= 0) goto L_0x11a0
            r1 = r53
            X.AnonymousClass363.A03(r1, r9, r3)     // Catch:{ 1zr -> 0x1505 }
        L_0x11a0:
            if (r48 == 0) goto L_0x11b0
            if (r4 == 0) goto L_0x11b0
            int r11 = r4.A00     // Catch:{ 1zr -> 0x1505 }
            r1 = 2
            if (r11 != r1) goto L_0x11b0
            if (r29 != 0) goto L_0x11b0
            r1 = r53
            X.AnonymousClass363.A03(r1, r9, r3)     // Catch:{ 1zr -> 0x1505 }
        L_0x11b0:
            java.util.HashSet r12 = X.AnonymousClass002.A0K()     // Catch:{ 1zr -> 0x1505 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            if (r36 == 0) goto L_0x11fa
            r1 = r36
            com.whatsapp.jid.UserJid r1 = r1.A00     // Catch:{ 1zr -> 0x1505 }
            r15 = r1
            r1 = r36
            X.2a1 r1 = r1.A01     // Catch:{ 1zr -> 0x1505 }
            r22 = 0
            r39 = r22
            r40 = r22
            r37 = r1
            r38 = r22
            r41 = r20
            r42 = r47
            X.36K r13 = X.AnonymousClass35A.A01(r37, r38, r39, r40, r41, r42)     // Catch:{ 1zr -> 0x1505 }
            if (r23 == 0) goto L_0x11db
            r3.add(r13)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x11fa
        L_0x11db:
            com.whatsapp.jid.DeviceJid r1 = r15.getPrimaryDevice()     // Catch:{ 1zr -> 0x1505 }
            com.whatsapp.jid.UserJid r14 = r1.userJid     // Catch:{ 1zr -> 0x1505 }
            r1 = r53
            X.36K r1 = X.AnonymousClass363.A01(r14, r1, r9)     // Catch:{ 1zr -> 0x1505 }
            com.whatsapp.jid.DeviceJid r15 = r15.getPrimaryDevice()     // Catch:{ 1zr -> 0x1505 }
            r14 = 2
            X.36K[] r14 = new X.AnonymousClass36K[r14]     // Catch:{ 1zr -> 0x1505 }
            X.AnonymousClass001.A1I(r13, r1, r14)     // Catch:{ 1zr -> 0x1505 }
            r13 = 0
            X.36K r1 = X.AnonymousClass363.A00(r15, r13, r14)     // Catch:{ 1zr -> 0x1505 }
            r11.add(r1)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x11fb
        L_0x11fa:
            r13 = 0
        L_0x11fb:
            if (r32 == 0) goto L_0x11fe
            goto L_0x1200
        L_0x11fe:
            r10 = 0
            goto L_0x120e
        L_0x1200:
            java.lang.Object r14 = r50.A04()     // Catch:{ 1zr -> 0x1505 }
            X.2sS r14 = (X.C56722sS) r14     // Catch:{ 1zr -> 0x1505 }
            r1 = r61
            boolean r1 = r14.A03(r5, r1)     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x11fe
        L_0x120e:
            boolean r1 = android.text.TextUtils.isEmpty(r51)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r14 = "type"
            if (r1 != 0) goto L_0x121c
            r1 = r51
            X.AnonymousClass39V.A03(r14, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x121c:
            r15 = 1
            r1 = r52
            if (r1 == r15) goto L_0x1225
            r15 = 2
            if (r1 != r15) goto L_0x122f
            goto L_0x1228
        L_0x1225:
            java.lang.String r15 = "1p_partial"
            goto L_0x122a
        L_0x1228:
            java.lang.String r15 = "3p_full"
        L_0x122a:
            java.lang.String r1 = "local_automated_type"
            X.AnonymousClass39V.A03(r1, r15, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x122f:
            boolean r1 = r12.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x123b
            boolean r1 = r11.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x1258
        L_0x123b:
            boolean r1 = r12.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x1244
            r12 = r13
            r1 = 0
            goto L_0x1249
        L_0x1244:
            r1 = 0
            X.39V[] r12 = X.C18300x5.A1Z(r12, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x1249:
            boolean r15 = r11.isEmpty()     // Catch:{ 1zr -> 0x1505 }
            if (r15 != 0) goto L_0x1253
            X.36K[] r13 = X.C18280x3.A1a(r11, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x1253:
            java.lang.String r1 = "bot"
            X.AnonymousClass36K.A0S(r1, r3, r12, r13)     // Catch:{ 1zr -> 0x1505 }
        L_0x1258:
            X.2K5 r12 = r7.A04     // Catch:{ 1zr -> 0x1505 }
            X.2sr r1 = r12.A00     // Catch:{ 1zr -> 0x1505 }
            boolean r1 = r1.A0Y()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x128e
            r11 = 1
            if (r4 == 0) goto L_0x1269
            int r1 = r4.A00     // Catch:{ 1zr -> 0x1505 }
            if (r1 == r11) goto L_0x127f
        L_0x1269:
            if (r19 == 0) goto L_0x1299
            java.util.Iterator r4 = X.AnonymousClass001.A0v(r19)     // Catch:{ 1zr -> 0x1505 }
        L_0x126f:
            boolean r1 = r4.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x1299
            java.lang.Object r1 = r4.next()     // Catch:{ 1zr -> 0x1505 }
            X.2a1 r1 = (X.C45442a1) r1     // Catch:{ 1zr -> 0x1505 }
            int r1 = r1.A00     // Catch:{ 1zr -> 0x1505 }
            if (r1 != r11) goto L_0x126f
        L_0x127f:
            X.2q4 r1 = r12.A01     // Catch:{ 1zr -> 0x1505 }
            byte[] r11 = r1.A03()     // Catch:{ 1zr -> 0x1505 }
            X.C626936e.A06(r11)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r4 = "device-identity"
            r1 = 0
            X.AnonymousClass36K.A0Q(r4, r3, r11, r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x128e:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ 1zr -> 0x1505 }
            r22 = 0
            int r1 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x12c9
            goto L_0x12b9
        L_0x1299:
            java.util.Iterator r4 = X.AnonymousClass001.A0v(r56)     // Catch:{ 1zr -> 0x1505 }
        L_0x129d:
            boolean r1 = r4.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x12ae
            java.lang.Object r1 = r4.next()     // Catch:{ 1zr -> 0x1505 }
            X.2a1 r1 = (X.C45442a1) r1     // Catch:{ 1zr -> 0x1505 }
            int r1 = r1.A00     // Catch:{ 1zr -> 0x1505 }
            if (r1 != r11) goto L_0x129d
            goto L_0x127f
        L_0x12ae:
            if (r36 == 0) goto L_0x128e
            r1 = r36
            X.2a1 r1 = r1.A01     // Catch:{ 1zr -> 0x1505 }
            int r1 = r1.A00     // Catch:{ 1zr -> 0x1505 }
            if (r1 != r11) goto L_0x128e
            goto L_0x127f
        L_0x12b9:
            if (r34 != 0) goto L_0x12c9
            long r15 = X.C18290x4.A0B(r16)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "t"
            X.AnonymousClass39V.A03(r1, r4, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x12c9:
            X.4uZ r11 = r6.A00     // Catch:{ 1zr -> 0x1505 }
            boolean r1 = X.C627336j.A0K(r11)     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x12d5
            if (r34 == 0) goto L_0x12d5
            r5 = r28
        L_0x12d5:
            r4 = 0
            boolean r1 = r6.A02     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x12e3
            r13 = 8
            r1 = r21
            if (r1 == r13) goto L_0x12e3
            java.lang.String r1 = "from"
            goto L_0x12e6
        L_0x12e3:
            java.lang.String r1 = "to"
        L_0x12e6:
            X.C626936e.A06(r5)     // Catch:{ 1zr -> 0x1505 }
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5     // Catch:{ 1zr -> 0x1505 }
            X.AnonymousClass39V.A01(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
            r1 = r60
            X.AnonymousClass39V.A03(r14, r1, r12)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r5 = "id"
            java.lang.String r1 = r6.A01     // Catch:{ 1zr -> 0x1505 }
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
            if (r33 == 0) goto L_0x1306
            if (r27 != 0) goto L_0x1306
            java.lang.String r5 = "phash"
            r1 = r33
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1306:
            if (r31 == 0) goto L_0x130f
            java.lang.String r5 = "addressing_mode"
            r1 = r31
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x130f:
            if (r29 == 0) goto L_0x131b
            if (r34 != 0) goto L_0x131b
            java.lang.String r5 = "participant"
            r1 = r29
            X.AnonymousClass39V.A01(r1, r5, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x131b:
            if (r28 == 0) goto L_0x1327
            if (r34 != 0) goto L_0x1327
            java.lang.String r5 = "recipient"
            r1 = r28
            X.AnonymousClass39V.A01(r1, r5, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1327:
            if (r26 == 0) goto L_0x1333
            if (r34 != 0) goto L_0x1333
            java.lang.String r5 = "recipient_pn"
            r1 = r26
            X.AnonymousClass39V.A01(r1, r5, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1333:
            if (r25 == 0) goto L_0x133f
            if (r34 != 0) goto L_0x133f
            java.lang.String r5 = "recipient_username"
            r1 = r25
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x133f:
            if (r21 == 0) goto L_0x134a
            java.lang.String r5 = "edit"
            java.lang.String r1 = java.lang.Integer.toString(r21)     // Catch:{ 1zr -> 0x1505 }
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x134a:
            if (r30 == 0) goto L_0x1366
            int r13 = r30.intValue()     // Catch:{ 1zr -> 0x1505 }
            if (r13 <= 0) goto L_0x1366
            if (r20 != 0) goto L_0x1366
            r5 = 8
            r1 = r21
            if (r1 == r5) goto L_0x1366
            r5 = 7
            if (r1 == r5) goto L_0x1366
            java.lang.String r5 = java.lang.Integer.toString(r13)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "expiration"
            X.AnonymousClass39V.A03(r1, r5, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1366:
            boolean r1 = android.text.TextUtils.isEmpty(r55)     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x1373
            java.lang.String r5 = "category"
            r1 = r55
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1373:
            boolean r1 = android.text.TextUtils.isEmpty(r54)     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x1381
            java.lang.String r5 = "push_priority"
            r1 = r54
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x1381:
            if (r24 != 0) goto L_0x1385
            if (r10 == 0) goto L_0x138c
        L_0x1385:
            java.lang.String r5 = "device_fanout"
            java.lang.String r1 = "false"
            X.AnonymousClass39V.A03(r5, r1, r12)     // Catch:{ 1zr -> 0x1505 }
        L_0x138c:
            X.39V[] r1 = X.AnonymousClass363.A08     // Catch:{ 1zr -> 0x1505 }
            java.lang.Object[] r5 = r12.toArray(r1)     // Catch:{ 1zr -> 0x1505 }
            X.39V[] r5 = (X.AnonymousClass39V[]) r5     // Catch:{ 1zr -> 0x1505 }
            X.36K[] r3 = X.C18280x3.A1a(r3, r4)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "message"
            X.36K r3 = X.AnonymousClass36K.A0J(r1, r5, r3)     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "xmpp/writer/write/message-serialized;"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ 1zr -> 0x1505 }
            r1 = r62
            X.AnonymousClass30X.A02(r3, r1)     // Catch:{ 1zr -> 0x1505 }
            if (r9 == 0) goto L_0x1434
            int r1 = r9.hashCode()     // Catch:{ 1zr -> 0x1505 }
            switch(r1) {
                case -1890252483: goto L_0x13b4;
                case -1183699191: goto L_0x13be;
                case -622287711: goto L_0x13c7;
                case -309474065: goto L_0x13d0;
                case 102340: goto L_0x13da;
                case 93166550: goto L_0x13e3;
                case 100313435: goto L_0x13eb;
                case 106006350: goto L_0x13f3;
                case 112021638: goto L_0x13fd;
                case 112202875: goto L_0x1406;
                case 555704345: goto L_0x140f;
                case 861720859: goto L_0x1418;
                case 943481210: goto L_0x1421;
                case 1901043637: goto L_0x142a;
                default: goto L_0x13b2;
            }     // Catch:{ 1zr -> 0x1505 }
        L_0x13b2:
            goto L_0x1433
        L_0x13b4:
            java.lang.String r1 = "sticker"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 20
            goto L_0x1431
        L_0x13be:
            java.lang.String r1 = "invite"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 24
            goto L_0x1431
        L_0x13c7:
            java.lang.String r1 = "livelocation"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 16
            goto L_0x1431
        L_0x13d0:
            java.lang.String r1 = "product"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 23
            goto L_0x1431
        L_0x13da:
            java.lang.String r1 = "gif"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 13
            goto L_0x1431
        L_0x13e3:
            java.lang.String r1 = "audio"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 2
            goto L_0x1431
        L_0x13eb:
            java.lang.String r1 = "image"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 1
            goto L_0x1431
        L_0x13f3:
            java.lang.String r1 = "order"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 44
            goto L_0x1431
        L_0x13fd:
            java.lang.String r1 = "vcard"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 4
            goto L_0x1431
        L_0x1406:
            java.lang.String r1 = "video"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 3
            goto L_0x1431
        L_0x140f:
            java.lang.String r1 = "catalog"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 37
            goto L_0x1431
        L_0x1418:
            java.lang.String r1 = "document"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 9
            goto L_0x1431
        L_0x1421:
            java.lang.String r1 = "contact_array"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 14
            goto L_0x1431
        L_0x142a:
            java.lang.String r1 = "location"
            boolean r1 = r9.equals(r1)     // Catch:{ 1zr -> 0x1505 }
            r4 = 5
        L_0x1431:
            if (r1 != 0) goto L_0x1434
        L_0x1433:
            r4 = -1
        L_0x1434:
            if (r20 != 0) goto L_0x14eb
            r3 = 8
            r1 = r21
            if (r1 == r3) goto L_0x14ca
            r3 = 7
            if (r1 == r3) goto L_0x14ca
            X.2s4 r12 = r7.A03     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "pay"
            boolean r10 = r1.equals(r9)     // Catch:{ 1zr -> 0x1505 }
            boolean r9 = r11 instanceof X.C135166kE     // Catch:{ 1zr -> 0x1505 }
            if (r9 == 0) goto L_0x144e
            r5 = 3
            goto L_0x1452
        L_0x144e:
            r5 = 2
            if (r4 != 0) goto L_0x1452
            r5 = 1
        L_0x1452:
            X.0yS r3 = r12.A00     // Catch:{ 1zr -> 0x1505 }
            boolean r1 = X.AnonymousClass000.A1W(r3)
            X.C626936e.A0C(r1)     // Catch:{ 1zr -> 0x1505 }
            r1 = 6
            android.os.Message r1 = android.os.Message.obtain(r3, r1, r5, r10)     // Catch:{ 1zr -> 0x1505 }
            r1.sendToTarget()     // Catch:{ 1zr -> 0x1505 }
            r12.A02()     // Catch:{ 1zr -> 0x1505 }
            if (r9 != 0) goto L_0x14eb
            boolean r1 = r11 instanceof X.AnonymousClass1fS     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x14b1
            java.util.LinkedHashSet r9 = X.AnonymousClass0x9.A17()     // Catch:{ 1zr -> 0x1505 }
            if (r19 == 0) goto L_0x1487
            X.2qk r5 = r7.A02     // Catch:{ 1zr -> 0x1505 }
            java.util.Set r4 = r19.keySet()     // Catch:{ 1zr -> 0x1505 }
            int r3 = r4.size()     // Catch:{ 1zr -> 0x1505 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ 1zr -> 0x1505 }
            r1.<init>(r3)     // Catch:{ 1zr -> 0x1505 }
            X.C627336j.A0F(r5, r4, r1)     // Catch:{ 1zr -> 0x1505 }
            r9.addAll(r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x1487:
            if (r18 == 0) goto L_0x1497
            X.2qk r4 = r7.A02     // Catch:{ 1zr -> 0x1505 }
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ 1zr -> 0x1505 }
            r1 = r18
            X.C627336j.A0F(r4, r1, r3)     // Catch:{ 1zr -> 0x1505 }
            r9.addAll(r3)     // Catch:{ 1zr -> 0x1505 }
        L_0x1497:
            X.1i2 r1 = r7.A05     // Catch:{ 1zr -> 0x1505 }
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r9)     // Catch:{ 1zr -> 0x1505 }
            java.util.Iterator r3 = X.C61102zi.A03(r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x14a1:
            boolean r1 = r3.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x14eb
            java.lang.Object r1 = r3.next()     // Catch:{ 1zr -> 0x1505 }
            X.4F5 r1 = (X.AnonymousClass4F5) r1     // Catch:{ 1zr -> 0x1505 }
            r1.BOo(r6, r4)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x14a1
        L_0x14b1:
            X.1i2 r1 = r7.A05     // Catch:{ 1zr -> 0x1505 }
            X.C626936e.A06(r11)     // Catch:{ 1zr -> 0x1505 }
            java.util.Iterator r3 = X.C61102zi.A03(r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x14ba:
            boolean r1 = r3.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x14eb
            java.lang.Object r1 = r3.next()     // Catch:{ 1zr -> 0x1505 }
            X.4F5 r1 = (X.AnonymousClass4F5) r1     // Catch:{ 1zr -> 0x1505 }
            r1.BOn(r11, r6)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x14ba
        L_0x14ca:
            boolean r1 = r11 instanceof X.C135166kE     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x14eb
            boolean r1 = r11 instanceof X.AnonymousClass1fS     // Catch:{ 1zr -> 0x1505 }
            if (r1 != 0) goto L_0x14eb
            X.1i2 r1 = r7.A05     // Catch:{ 1zr -> 0x1505 }
            X.C626936e.A06(r11)     // Catch:{ 1zr -> 0x1505 }
            java.util.Iterator r3 = X.C61102zi.A03(r1)     // Catch:{ 1zr -> 0x1505 }
        L_0x14db:
            boolean r1 = r3.hasNext()     // Catch:{ 1zr -> 0x1505 }
            if (r1 == 0) goto L_0x14eb
            java.lang.Object r1 = r3.next()     // Catch:{ 1zr -> 0x1505 }
            X.4F5 r1 = (X.AnonymousClass4F5) r1     // Catch:{ 1zr -> 0x1505 }
            r1.BOm(r11, r6)     // Catch:{ 1zr -> 0x1505 }
            goto L_0x14db
        L_0x14eb:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x1505 }
            java.lang.String r1 = "xmpp/writer/write/message-encrypted; "
            X.C18260x0.A1R(r3, r1, r8)     // Catch:{ 1zr -> 0x1505 }
            r0 = r63
            X.48H r1 = r0.A06     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "ConnectionThread/WriterThreadObserver/send/message_sent"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 2
            X.C18290x4.A1C(r1, r6, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x1505:
            r4 = move-exception
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.48H r0 = r0.A06     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39T r7 = r8.A0I     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r6 = r4.excessPayloadByteSize     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yX r0 = (X.C18960yX) r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yZ r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30h r0 = r0.A0r     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.2hf r5 = r0.A08     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "received message too large error; stanzaKey="
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r1 = r5.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            monitor-enter(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r3 = r1.remove(r7)     // Catch:{ all -> 0x1561 }
            X.4Di r3 = (X.C84694Di) r3     // Catch:{ all -> 0x1561 }
            monitor-exit(r1)     // Catch:{ all -> 0x1561 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "handleAck callback found and removed: "
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C18260x0.A1U(r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r3 == 0) goto L_0x1548
            java.lang.String r1 = "Message payload too big"
            X.1zr r0 = new X.1zr     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.<init>(r1, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.BQr(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x1548:
            java.lang.String r1 = r7.A05     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 != 0) goto L_0x155b
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 == 0) goto L_0x1560
        L_0x155b:
            X.3Qu r0 = r5.A04     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0.A03()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x1560:
            throw r4     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x1561:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1561 }
            throw r0     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x1564:
            int r8 = X.C384127l.A00(r2)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.Object r7 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r7 = (X.AnonymousClass36K) r7     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/type="
            r6.append(r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r6.append(r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r5 = ", id="
            r6.append(r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "id"
            r3 = 0
            java.lang.String r1 = r7.A0r(r4, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.C18260x0.A1J(r6, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.0yY r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.30X r0 = r0.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/type="
            X.C18270x1.A19(r0, r5, r1, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = r7.A0r(r4, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x15ca
        L_0x1599:
            X.39V[] r6 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0B(r3, r7, r6, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.AnonymousClass39V.A0C(r3, r0, r6, r11, r12)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V r3 = X.AnonymousClass39V.A00()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 3
            r6[r0] = r3     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K[] r3 = X.C18280x3.A1a(r10, r9)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "key"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0G(r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.StringBuilder r1 = A01(r0, r8)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/get-pre-key-batch; id="
            X.AnonymousClass001.A1K(r0, r7, r5, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = java.util.Arrays.toString(r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x15ca:
            r1.append(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x15cd:
            java.lang.String r0 = r1.toString()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            goto L_0x165f
        L_0x15d3:
            java.lang.Object r6 = r2.obj     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "WriterThread/before/write/push-name"
            X.30X r5 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r4 = "available"
            java.lang.String r0 = "presence"
            X.2rL r3 = X.C56052rL.A04(r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r6 == 0) goto L_0x15f5
            r0 = 1
            boolean r0 = X.C626836d.A0N(r6, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            if (r0 == 0) goto L_0x15f5
            java.lang.String r0 = "name"
            X.C56052rL.A0D(r3, r0, r6)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
        L_0x15f5:
            java.lang.String r1 = "type"
            java.util.ArrayList r0 = X.C35631xB.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r3.A0K(r4, r1, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = r3.A0F()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/push-name"
            goto L_0x165f
        L_0x1607:
            java.lang.String r1 = "WriterThread/before/write/onSendServerPong"
            X.30X r4 = A00(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 2
            X.39V[] r3 = new X.AnonymousClass39V[r0]     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "result"
            X.AnonymousClass39V.A04(r1, r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V r1 = X.AnonymousClass39V.A00()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r0 = 1
            r3[r0] = r1     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "iq"
            X.36K r0 = X.AnonymousClass36K.A0I(r0, r3)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/onSendServerPong"
            goto L_0x165f
        L_0x162c:
            java.lang.String r4 = "WriterThread/before/write/get-pre-key-digest"
            X.30X r7 = A00(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            int r0 = r7.A00     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r6 = X.AnonymousClass30X.A00(r7, r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.util.Map r0 = r7.A03     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            r5 = 3
            X.AnonymousClass4HM.A00(r7, r6, r0, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A04(r3, r6, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r3 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.AnonymousClass39V.A09(r3, r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass39V.A0E(r4, r5)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "digest"
            X.36K r0 = X.AnonymousClass36K.A0I(r0, r1)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.36K r0 = X.AnonymousClass36K.A0G(r0, r4)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            X.AnonymousClass30X.A02(r0, r7)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            java.lang.String r0 = "WriterThread/write/get-pre-key-digest"
        L_0x165f:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1zr -> 0x168a, IOException -> 0x1663 }
            return
        L_0x1663:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend unknown I/O error writing to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            r3 = 1
            r0 = r64
            r0.A01 = r3
            android.os.Handler r1 = r2.getTarget()
            android.os.Message r0 = android.os.Message.obtain(r2)
            r1.sendMessageAtFrontOfQueue(r0)
            r0 = r64
            X.48H r2 = r0.A06
            X.30X r1 = r0.A00
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.String r0 = "ConnectionThread/WriterThreadObserver/send/send_error"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C18290x4.A1C(r2, r1, r3)
            return
        L_0x168a:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend tried to write too large of a buffer to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18970yY.A02(android.os.Message):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r3 = this;
            java.util.ArrayDeque r0 = r3.A09
            java.util.Iterator r2 = r0.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.next()
            android.os.Message r0 = (android.os.Message) r0
            int r1 = X.C384127l.A00(r0)
            r0 = 9
            if (r1 == r0) goto L_0x002f
            r0 = 76
            if (r1 == r0) goto L_0x002f
            r0 = 89
            if (r1 == r0) goto L_0x002f
            r0 = 96
            if (r1 == r0) goto L_0x002f
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L_0x002f
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x002f
            goto L_0x0006
        L_0x002f:
            r0 = 1
            return r0
        L_0x0031:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18970yY.A03():boolean");
    }

    public void onLooperPrepared() {
        AnonymousClass48H r2 = this.A06;
        C18950yW r1 = new C18950yW(getLooper(), this);
        Log.d("ConnectionThread/WriterThreadObserver/send/sending_channel_ready");
        C18290x4.A1C((Handler) r2, r1, 0);
    }

    public static AnonymousClass30X A00(C54342oZ r0, String str) {
        Log.d(str);
        return r0.A00.A00;
    }
}
