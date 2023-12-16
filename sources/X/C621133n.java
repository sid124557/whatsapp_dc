package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.33n  reason: invalid class name and case insensitive filesystem */
public class C621133n {
    public C625535n A00;
    public C45872ai A01;
    public final C28821hp A02;
    public final C56972sr A03;
    public final C66663Mh A04;
    public final C42112Mv A05;
    public final AnonymousClass2ZK A06;
    public final C55372qF A07;
    public final C58562vS A08;
    public final C55252q3 A09;
    public final C59382wp A0A;
    public final C54542ot A0B;
    public final C51162jN A0C;
    public final C56612sH A0D;
    public final C54292oU A0E;
    public final AnonymousClass33p A0F;
    public final C55182pw A0G;
    public final C40332Fk A0H;
    public final C28661hZ A0I = new C28661hZ();
    public final C48972fm A0J;
    public final C614730x A0K;
    public final AnonymousClass1RJ A0L;
    public final AnonymousClass2GC A0M;
    public final AnonymousClass1VX A0N;
    public final JniBridge A0O;
    public final AnonymousClass2XE A0P;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C18260x0.A0t("senderkeystore/removesenderkey/invalidgroupid ", r2, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0c(X.C54422oh r9, boolean r10) {
        /*
            r8 = this;
            r3 = 0
            if (r10 != 0) goto L_0x000b
            X.2ov r0 = r9.A00
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x000b
            return r3
        L_0x000b:
            X.3fe r7 = X.C614730x.A01(r8, r9)
            java.lang.String r2 = r9.A01     // Catch:{ all -> 0x0076 }
            com.whatsapp.jid.Jid r6 = X.AnonymousClass32W.A01(r2)     // Catch:{ 24P -> 0x0068 }
            boolean r0 = r6 instanceof X.C28011fL     // Catch:{ 24P -> 0x0068 }
            if (r0 == 0) goto L_0x0063
            X.1fL r6 = (X.C28011fL) r6     // Catch:{ 24P -> 0x0068 }
            if (r6 == 0) goto L_0x0063
            X.2wp r2 = r8.A0A     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "SenderKeyStore/removeSenderKey/"
            X.C18260x0.A1R(r1, r0, r9)     // Catch:{ all -> 0x0076 }
            X.1RJ r0 = r2.A02     // Catch:{ all -> 0x0076 }
            X.4Fq r5 = r0.A0C()     // Catch:{ all -> 0x0076 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0059 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "sender_keys"
            java.lang.String r2 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r1 = r9.A01()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKey"
            int r0 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0059 }
            boolean r2 = X.AnonymousClass001.A1W(r0)
            r5.close()     // Catch:{ all -> 0x0076 }
            X.2Mv r1 = r8.A05     // Catch:{ all -> 0x0076 }
            X.2VY r0 = new X.2VY     // Catch:{ all -> 0x0076 }
            r0.<init>(r6)     // Catch:{ all -> 0x0076 }
            X.2dt r0 = r1.A01     // Catch:{ all -> 0x0076 }
            r0.A00()     // Catch:{ all -> 0x0076 }
            r7.close()
            return r2
        L_0x0059:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0076 }
        L_0x0062:
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0063:
            X.24P r0 = X.AnonymousClass24P.A00(r2)     // Catch:{ 24P -> 0x0068 }
            throw r0     // Catch:{ 24P -> 0x0068 }
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "senderkeystore/removesenderkey/invalidgroupid "
            X.C18260x0.A0t(r0, r2, r1)     // Catch:{ all -> 0x0076 }
            r7.close()
            return r3
        L_0x0076:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x007b }
            throw r1
        L_0x007b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A0c(X.2oh, boolean):boolean");
    }

    public C621133n(C55682qk r22, C28821hp r23, C56972sr r24, C66663Mh r25, C42112Mv r26, AnonymousClass2ZK r27, C55372qF r28, C58562vS r29, C59382wp r30, C54542ot r31, C56612sH r32, C54292oU r33, AnonymousClass33p r34, C55182pw r35, C48972fm r36, C614730x r37, AnonymousClass1RJ r38, AnonymousClass2GC r39, AnonymousClass1VX r40, JniBridge jniBridge, AnonymousClass2XE r42) {
        C56612sH r3 = r32;
        AnonymousClass1RJ r2 = r38;
        C66663Mh r6 = r25;
        C55252q3 r9 = new C55252q3(r6, r3, r2);
        C51162jN r12 = new C51162jN(r3, r2);
        C40332Fk r1 = new C40332Fk(this);
        this.A0H = r1;
        this.A0D = r3;
        AnonymousClass1VX r0 = r40;
        this.A0N = r0;
        JniBridge jniBridge2 = jniBridge;
        this.A0O = jniBridge2;
        this.A03 = r24;
        this.A04 = r6;
        this.A0K = r37;
        this.A0G = r35;
        C48972fm r14 = r36;
        this.A0J = r14;
        this.A0L = r2;
        this.A02 = r23;
        this.A09 = r9;
        C54542ot r11 = r31;
        this.A0B = r11;
        this.A05 = r26;
        this.A0F = r34;
        C59382wp r10 = r30;
        this.A0A = r10;
        this.A0M = r39;
        C55372qF r8 = r28;
        this.A07 = r8;
        this.A0C = r12;
        this.A08 = r29;
        AnonymousClass2ZK r7 = r27;
        this.A06 = r7;
        this.A00 = new C625535n(r22, new C55472qP(r6, r7, r8, r9, r10, r11, r12, this, r14), r3, r14, r0);
        this.A01 = new C45872ai(r6, r9, r3, jniBridge2);
        r2.A00 = r1;
        this.A0P = r42;
        this.A0E = r33;
    }

    public static C42612Ov A00(byte[] bArr, int i) {
        byte[] A072 = ((AnonymousClass1CZ) C130786cX.A05(AnonymousClass1CZ.DEFAULT_INSTANCE, bArr)).publicKey_.A07();
        int length = A072.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A072, 1, bArr2, 0, length);
        return new C42612Ov(AnonymousClass36A.A02(i), bArr2, (byte[]) null);
    }

    public static void A01(C59402wr r0) {
        if (r0.A01.A00.aliceBaseKey_.A07().length == 0) {
            throw AnonymousClass002.A0C("Alice base key missing from session");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011b A[Catch:{ 24R -> 0x00c7, all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d A[Catch:{ 24R -> 0x00c7, all -> 0x0370 }] */
    public int A02(X.C54562ov r38, X.C42612Ov r39, X.C42612Ov r40, byte[] r41, byte[] r42, byte r43) {
        /*
            r37 = this;
            r6 = r37
            X.30x r0 = r6.A0K
            r1 = r38
            X.3fe r19 = X.C614730x.A00(r1, r0)
            X.2wr r0 = r6.A0A(r1)     // Catch:{ all -> 0x0370 }
            X.2uv r0 = r0.A01     // Catch:{ all -> 0x0370 }
            X.1E1 r0 = r0.A00     // Catch:{ all -> 0x0370 }
            X.8Lq r0 = r0.remoteIdentityPublic_     // Catch:{ all -> 0x0370 }
            byte[] r5 = r0.A07()     // Catch:{ all -> 0x0370 }
            int r4 = r5.length     // Catch:{ all -> 0x0370 }
            r10 = r41
            r13 = r43
            if (r4 == 0) goto L_0x0034
            r3 = 1
            int r4 = r4 - r3
            byte[] r2 = new byte[r4]     // Catch:{ all -> 0x0370 }
            r0 = 0
            java.lang.System.arraycopy(r5, r3, r2, r0, r4)     // Catch:{ all -> 0x0370 }
            byte r0 = r5[r0]     // Catch:{ all -> 0x0370 }
            if (r0 != r13) goto L_0x0031
            boolean r0 = java.util.Arrays.equals(r10, r2)     // Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0034
        L_0x0031:
            r6.A0B(r1)     // Catch:{ all -> 0x0370 }
        L_0x0034:
            X.3Mh r2 = r6.A04     // Catch:{ all -> 0x0370 }
            X.1Ei r0 = X.C66663Mh.A0y     // Catch:{ all -> 0x0370 }
            boolean r0 = r2.A08(r0)     // Catch:{ all -> 0x0370 }
            r8 = r39
            r3 = r40
            r5 = r42
            if (r0 == 0) goto L_0x00b3
            X.2ai r7 = r6.A01     // Catch:{ all -> 0x0370 }
            if (r39 == 0) goto L_0x00b0
            byte[] r0 = r8.A01     // Catch:{ all -> 0x0370 }
            int r4 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x0370 }
            byte[] r9 = r8.A00     // Catch:{ all -> 0x0370 }
        L_0x0050:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0370 }
            int r2 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x0370 }
            r6 = 0
            byte r0 = r42[r6]     // Catch:{ all -> 0x0370 }
            int r0 = X.C18290x4.A07(r5, r0, r6)     // Catch:{ all -> 0x0370 }
            X.2sH r5 = r7.A02     // Catch:{ all -> 0x0370 }
            long r28 = X.C56612sH.A00(r5)     // Catch:{ all -> 0x0370 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0370 }
            java.lang.String r5 = "wamsys/processPreKeyBundle preKeyId="
            r6.append(r5)     // Catch:{ all -> 0x0370 }
            r6.append(r4)     // Catch:{ all -> 0x0370 }
            java.lang.String r5 = "; signedPreKeyId="
            r6.append(r5)     // Catch:{ all -> 0x0370 }
            r6.append(r2)     // Catch:{ all -> 0x0370 }
            java.lang.String r5 = "; registrationId="
            X.C18260x0.A0y(r5, r6, r0)     // Catch:{ all -> 0x0370 }
            com.whatsapp.wamsys.JniBridge r11 = r7.A03     // Catch:{ all -> 0x0370 }
            java.lang.String r30 = X.AnonymousClass31S.A01(r1)     // Catch:{ all -> 0x0370 }
            int r5 = r1.A00     // Catch:{ all -> 0x0370 }
            byte[] r12 = r3.A00     // Catch:{ all -> 0x0370 }
            byte[] r8 = r3.A02     // Catch:{ all -> 0x0370 }
            r36 = 0
            java.lang.String r1 = "wamsys/JniBridge java -> wamsys crossing for WESAPISessionProcessPreKeyBundle"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ all -> 0x0370 }
            long r6 = (long) r5     // Catch:{ all -> 0x0370 }
            long r4 = (long) r4     // Catch:{ all -> 0x0370 }
            long r2 = (long) r2     // Catch:{ all -> 0x0370 }
            long r0 = (long) r0     // Catch:{ all -> 0x0370 }
            com.facebook.simplejni.NativeHolder r31 = X.C18300x5.A0I(r11)     // Catch:{ all -> 0x0370 }
            r20 = r6
            r22 = r4
            r24 = r2
            r26 = r0
            r32 = r9
            r33 = r10
            r34 = r12
            r35 = r8
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIIIIIOOOOOOO(r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0370 }
            int r9 = (int) r0     // Catch:{ all -> 0x0370 }
            goto L_0x036a
        L_0x00b0:
            r9 = 0
            r4 = 0
            goto L_0x0050
        L_0x00b3:
            X.35n r6 = r6.A00     // Catch:{ all -> 0x0370 }
            r2 = 0
            int r9 = r10.length     // Catch:{ 24R -> 0x00c7 }
            r7 = 1
            int r0 = r9 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 24R -> 0x00c7 }
            r0 = 0
            r4[r0] = r43     // Catch:{ 24R -> 0x00c7 }
            java.lang.System.arraycopy(r10, r0, r4, r7, r9)     // Catch:{ 24R -> 0x00c7 }
            X.3ZK r7 = X.C616431q.A01(r4)     // Catch:{ 24R -> 0x00c7 }
            goto L_0x00d2
        L_0x00c7:
            r7 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "invalid identity key returned from server during prekey fetch; address="
            X.C18260x0.A0k(r1, r0, r4, r7)     // Catch:{ all -> 0x0370 }
            r7 = r2
        L_0x00d2:
            if (r39 == 0) goto L_0x00f3
            byte[] r11 = r8.A00     // Catch:{ all -> 0x0370 }
            if (r11 == 0) goto L_0x00f3
            int r10 = r11.length     // Catch:{ 24R -> 0x00e9 }
            r9 = 1
            int r0 = r10 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 24R -> 0x00e9 }
            r0 = 0
            r4[r0] = r43     // Catch:{ 24R -> 0x00e9 }
            java.lang.System.arraycopy(r11, r0, r4, r9, r10)     // Catch:{ 24R -> 0x00e9 }
            X.3ZK r11 = X.C616431q.A01(r4)     // Catch:{ 24R -> 0x00e9 }
            goto L_0x00f4
        L_0x00e9:
            r9 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "invalid prekey returned from server during prekey fetch; address="
            X.C18260x0.A0k(r1, r0, r4, r9)     // Catch:{ all -> 0x0370 }
        L_0x00f3:
            r11 = r2
        L_0x00f4:
            byte[] r12 = r3.A00     // Catch:{ 24R -> 0x0107 }
            int r10 = r12.length     // Catch:{ 24R -> 0x0107 }
            r9 = 1
            int r0 = r10 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 24R -> 0x0107 }
            r0 = 0
            r4[r0] = r43     // Catch:{ 24R -> 0x0107 }
            java.lang.System.arraycopy(r12, r0, r4, r9, r10)     // Catch:{ 24R -> 0x0107 }
            X.3ZK r2 = X.C616431q.A01(r4)     // Catch:{ 24R -> 0x0107 }
            goto L_0x0111
        L_0x0107:
            r9 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0370 }
            java.lang.String r0 = "invalid signed prekey returned from server during prekey fetch; address="
            X.C18260x0.A0k(r1, r0, r4, r9)     // Catch:{ all -> 0x0370 }
        L_0x0111:
            r4 = 0
            byte r0 = r42[r4]     // Catch:{ all -> 0x0370 }
            int r18 = X.C18290x4.A07(r5, r0, r4)     // Catch:{ all -> 0x0370 }
            r9 = 0
            if (r39 != 0) goto L_0x011d
            r12 = -1
            goto L_0x0123
        L_0x011d:
            byte[] r0 = r8.A01     // Catch:{ all -> 0x0370 }
            int r12 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x0370 }
        L_0x0123:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0370 }
            int r17 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x0370 }
            byte[] r5 = r3.A02     // Catch:{ all -> 0x0370 }
            X.2xf r8 = new X.2xf     // Catch:{ all -> 0x0370 }
            r8.<init>((X.AnonymousClass3ZK) r7)     // Catch:{ all -> 0x0370 }
            X.2qP r7 = r6.A02     // Catch:{ all -> 0x0370 }
            X.2EX r6 = r7.A06     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = X.AnonymousClass31S.A01(r1)     // Catch:{ all -> 0x0370 }
            int r1 = r1.A00     // Catch:{ all -> 0x0370 }
            X.2kv r0 = new X.2kv     // Catch:{ all -> 0x0370 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0370 }
            X.2Rw r4 = new X.2Rw     // Catch:{ all -> 0x0370 }
            r22 = r7
            r23 = r7
            r20 = r4
            r21 = r7
            r24 = r6
            r25 = r0
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0370 }
            java.lang.Object r16 = X.AnonymousClass33L.A04     // Catch:{ 24R -> 0x0365, 23U -> 0x0368, Exception -> 0x035c }
            monitor-enter(r16)     // Catch:{ 24R -> 0x0365, 23U -> 0x0368, Exception -> 0x035c }
            X.2qP r7 = r4.A00     // Catch:{ all -> 0x0359 }
            X.2kv r6 = r4.A04     // Catch:{ all -> 0x0359 }
            X.2ov r3 = X.AnonymousClass31S.A00(r6)     // Catch:{ all -> 0x0359 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = "axolotl trusting "
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            r1.append(r3)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = " key pair"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0359 }
            if (r2 == 0) goto L_0x0349
            X.3ZK r0 = r8.A00     // Catch:{ all -> 0x0359 }
            byte[] r3 = r2.A00()     // Catch:{ all -> 0x0359 }
            X.7jm r1 = X.C158317jm.A00()     // Catch:{ all -> 0x0359 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0359 }
            boolean r0 = r1.A01(r0, r3, r5)     // Catch:{ all -> 0x0359 }
            if (r0 == 0) goto L_0x0351
            X.2qP r5 = r4.A02     // Catch:{ all -> 0x0359 }
            X.2wy r4 = r5.A01(r6)     // Catch:{ all -> 0x0359 }
            X.2Ml r10 = X.C616431q.A02()     // Catch:{ all -> 0x0359 }
            if (r11 != 0) goto L_0x01e6
            X.47s r1 = X.AnonymousClass47s.A00     // Catch:{ all -> 0x0359 }
        L_0x018e:
            boolean r0 = r1 instanceof X.AnonymousClass47r     // Catch:{ all -> 0x0359 }
            if (r0 == 0) goto L_0x01e3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0359 }
            r0.getClass()     // Catch:{ all -> 0x0359 }
            X.47r r12 = new X.47r     // Catch:{ all -> 0x0359 }
            r12.<init>(r0)     // Catch:{ all -> 0x0359 }
        L_0x019e:
            X.2Se r14 = new X.2Se     // Catch:{ all -> 0x0359 }
            r14.<init>()     // Catch:{ all -> 0x0359 }
            r14.A04 = r10     // Catch:{ all -> 0x0359 }
            X.2Mk r0 = r7.A00()     // Catch:{ all -> 0x0359 }
            r14.A01 = r0     // Catch:{ all -> 0x0359 }
            r14.A00 = r8     // Catch:{ all -> 0x0359 }
            r14.A03 = r2     // Catch:{ all -> 0x0359 }
            r14.A02 = r2     // Catch:{ all -> 0x0359 }
            r14.A05 = r1     // Catch:{ all -> 0x0359 }
            boolean r0 = r4.A02     // Catch:{ all -> 0x0359 }
            if (r0 != 0) goto L_0x01c1
            X.34s r1 = new X.34s     // Catch:{ all -> 0x0359 }
            r1.<init>()     // Catch:{ all -> 0x0359 }
            java.util.LinkedList r0 = r4.A00     // Catch:{ all -> 0x0359 }
            X.C59472wy.A00(r0, r4, r1)     // Catch:{ all -> 0x0359 }
        L_0x01c1:
            X.34s r3 = r4.A01     // Catch:{ all -> 0x0359 }
            X.2Mk r15 = r14.A01     // Catch:{ all -> 0x0359 }
            X.2Ml r13 = r14.A04     // Catch:{ all -> 0x0359 }
            X.2xf r11 = r14.A00     // Catch:{ all -> 0x0359 }
            X.3ZK r2 = r14.A03     // Catch:{ all -> 0x0359 }
            X.3ZK r1 = r14.A02     // Catch:{ all -> 0x0359 }
            X.3Z4 r0 = r14.A05     // Catch:{ all -> 0x0359 }
            X.2Sf r14 = new X.2Sf     // Catch:{ all -> 0x0359 }
            r20 = r14
            r21 = r11
            r22 = r15
            r23 = r2
            r24 = r1
            r25 = r13
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0359 }
            goto L_0x01ec
        L_0x01e3:
            X.47s r12 = X.AnonymousClass47s.A00     // Catch:{ all -> 0x0359 }
            goto L_0x019e
        L_0x01e6:
            X.47r r1 = new X.47r     // Catch:{ all -> 0x0359 }
            r1.<init>(r11)     // Catch:{ all -> 0x0359 }
            goto L_0x018e
        L_0x01ec:
            X.6c9 r11 = X.C623634s.A00(r3)     // Catch:{ IOException -> 0x0343 }
            X.6cX r2 = r11.A00     // Catch:{ IOException -> 0x0343 }
            X.1E1 r2 = (X.AnonymousClass1E1) r2     // Catch:{ IOException -> 0x0343 }
            r1 = 3
            int r0 = r2.bitField0_     // Catch:{ IOException -> 0x0343 }
            r0 = r0 | 1
            r2.bitField0_ = r0     // Catch:{ IOException -> 0x0343 }
            r2.sessionVersion_ = r1     // Catch:{ IOException -> 0x0343 }
            X.C623634s.A01(r11, r3)     // Catch:{ IOException -> 0x0343 }
            X.2xf r13 = r14.A00     // Catch:{ IOException -> 0x0343 }
            r3.A08(r13)     // Catch:{ IOException -> 0x0343 }
            X.2Mk r15 = r14.A01     // Catch:{ IOException -> 0x0343 }
            X.2xf r0 = r15.A00     // Catch:{ IOException -> 0x0343 }
            r3.A07(r0)     // Catch:{ IOException -> 0x0343 }
            X.2Ml r11 = X.C616431q.A02()     // Catch:{ IOException -> 0x0343 }
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException -> 0x0343 }
            r0 = 32
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x0343 }
            r0 = -1
            java.util.Arrays.fill(r1, r0)     // Catch:{ IOException -> 0x0343 }
            r2.write(r1)     // Catch:{ IOException -> 0x0343 }
            X.3ZK r1 = r14.A03     // Catch:{ IOException -> 0x0343 }
            X.2JA r0 = r15.A01     // Catch:{ IOException -> 0x0343 }
            byte[] r0 = X.C616431q.A03(r0, r1)     // Catch:{ IOException -> 0x0343 }
            r2.write(r0)     // Catch:{ IOException -> 0x0343 }
            X.3ZK r15 = r13.A00     // Catch:{ IOException -> 0x0343 }
            X.2Ml r0 = r14.A04     // Catch:{ IOException -> 0x0343 }
            X.2JA r13 = r0.A00     // Catch:{ IOException -> 0x0343 }
            byte[] r0 = X.C616431q.A03(r13, r15)     // Catch:{ IOException -> 0x0343 }
            r2.write(r0)     // Catch:{ IOException -> 0x0343 }
            byte[] r0 = X.C616431q.A03(r13, r1)     // Catch:{ IOException -> 0x0343 }
            r2.write(r0)     // Catch:{ IOException -> 0x0343 }
            X.3Z4 r1 = r14.A05     // Catch:{ IOException -> 0x0343 }
            boolean r0 = r1 instanceof X.AnonymousClass47r     // Catch:{ IOException -> 0x0343 }
            if (r0 == 0) goto L_0x0251
            java.lang.Object r0 = r1.A00()     // Catch:{ IOException -> 0x0343 }
            X.3ZK r0 = (X.AnonymousClass3ZK) r0     // Catch:{ IOException -> 0x0343 }
            byte[] r0 = X.C616431q.A03(r13, r0)     // Catch:{ IOException -> 0x0343 }
            r2.write(r0)     // Catch:{ IOException -> 0x0343 }
        L_0x0251:
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x0343 }
            X.47q r13 = new X.47q     // Catch:{ IOException -> 0x0343 }
            r13.<init>()     // Catch:{ IOException -> 0x0343 }
            java.lang.String r0 = "WhisperText"
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x0343 }
            r0 = 64
            byte[] r1 = r13.A01(r2, r1, r0)     // Catch:{ IOException -> 0x0343 }
            r0 = 32
            byte[][] r2 = X.C616531r.A01(r1, r0, r0)     // Catch:{ IOException -> 0x0343 }
            r0 = r2[r9]     // Catch:{ IOException -> 0x0343 }
            X.2ZD r1 = new X.2ZD     // Catch:{ IOException -> 0x0343 }
            r1.<init>(r13, r0)     // Catch:{ IOException -> 0x0343 }
            r0 = 1
            r0 = r2[r0]     // Catch:{ IOException -> 0x0343 }
            X.2y1 r2 = new X.2y1     // Catch:{ IOException -> 0x0343 }
            r2.<init>(r13, r0, r9)     // Catch:{ IOException -> 0x0343 }
            X.3ZK r0 = r14.A02     // Catch:{ IOException -> 0x0343 }
            X.2fY r1 = r1.A00(r0, r11)     // Catch:{ IOException -> 0x0343 }
            r3.A09(r0, r2)     // Catch:{ IOException -> 0x0343 }
            java.lang.Object r0 = r1.A01     // Catch:{ IOException -> 0x0343 }
            X.2y1 r0 = (X.C60112y1) r0     // Catch:{ IOException -> 0x0343 }
            r3.A0A(r11, r0)     // Catch:{ IOException -> 0x0343 }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x0343 }
            X.2ZD r0 = (X.AnonymousClass2ZD) r0     // Catch:{ IOException -> 0x0343 }
            r3.A0B(r0)     // Catch:{ IOException -> 0x0343 }
            X.34s r3 = r4.A01     // Catch:{ all -> 0x0359 }
            X.3ZK r10 = r10.A01     // Catch:{ all -> 0x0359 }
            X.1Ca r0 = X.C21491Ca.DEFAULT_INSTANCE     // Catch:{ all -> 0x0359 }
            X.6c9 r11 = r0.A0G()     // Catch:{ all -> 0x0359 }
            X.19Y r11 = (X.AnonymousClass19Y) r11     // Catch:{ all -> 0x0359 }
            X.6cX r1 = X.C18320x8.A0C(r11)     // Catch:{ all -> 0x0359 }
            X.1Ca r1 = (X.C21491Ca) r1     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            r0 = r17
            r1.signedPreKeyId_ = r0     // Catch:{ all -> 0x0359 }
            byte[] r0 = r10.A00()     // Catch:{ all -> 0x0359 }
            X.8Lq r2 = X.C18280x3.A0H(r11, r0)     // Catch:{ all -> 0x0359 }
            X.6cX r1 = r11.A00     // Catch:{ all -> 0x0359 }
            X.1Ca r1 = (X.C21491Ca) r1     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            r1.baseKey_ = r2     // Catch:{ all -> 0x0359 }
            boolean r0 = r12 instanceof X.AnonymousClass47r     // Catch:{ all -> 0x0359 }
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r0 = r12.A00()     // Catch:{ all -> 0x0359 }
            int r2 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x0359 }
            X.6cX r1 = X.C18320x8.A0C(r11)     // Catch:{ all -> 0x0359 }
            X.1Ca r1 = (X.C21491Ca) r1     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            r1.preKeyId_ = r2     // Catch:{ all -> 0x0359 }
        L_0x02dc:
            X.1E1 r0 = r3.A00     // Catch:{ all -> 0x0359 }
            X.6c9 r2 = r0.A0H()     // Catch:{ all -> 0x0359 }
            X.19k r2 = (X.C208119k) r2     // Catch:{ all -> 0x0359 }
            X.6cX r0 = r11.A06()     // Catch:{ all -> 0x0359 }
            X.1Ca r0 = (X.C21491Ca) r0     // Catch:{ all -> 0x0359 }
            X.6cX r1 = X.C18320x8.A0C(r2)     // Catch:{ all -> 0x0359 }
            X.1E1 r1 = (X.AnonymousClass1E1) r1     // Catch:{ all -> 0x0359 }
            r0.getClass()     // Catch:{ all -> 0x0359 }
            r1.pendingPreKey_ = r0     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            X.C623634s.A01(r2, r3)     // Catch:{ all -> 0x0359 }
            X.34s r11 = r4.A01     // Catch:{ all -> 0x0359 }
            X.33n r0 = r7.A07     // Catch:{ all -> 0x0359 }
            X.2qF r0 = r0.A07     // Catch:{ all -> 0x0359 }
            int r3 = r0.A01()     // Catch:{ all -> 0x0359 }
            X.6c9 r2 = X.C623634s.A00(r11)     // Catch:{ all -> 0x0359 }
            X.6cX r1 = r2.A00     // Catch:{ all -> 0x0359 }
            X.1E1 r1 = (X.AnonymousClass1E1) r1     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            r1.localRegistrationId_ = r3     // Catch:{ all -> 0x0359 }
            X.C623634s.A01(r2, r11)     // Catch:{ all -> 0x0359 }
            X.34s r3 = r4.A01     // Catch:{ all -> 0x0359 }
            X.6c9 r2 = X.C623634s.A00(r3)     // Catch:{ all -> 0x0359 }
            X.6cX r1 = r2.A00     // Catch:{ all -> 0x0359 }
            X.1E1 r1 = (X.AnonymousClass1E1) r1     // Catch:{ all -> 0x0359 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0359 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0     // Catch:{ all -> 0x0359 }
            r0 = r18
            r1.remoteRegistrationId_ = r0     // Catch:{ all -> 0x0359 }
            X.C623634s.A01(r2, r3)     // Catch:{ all -> 0x0359 }
            X.34s r1 = r4.A01     // Catch:{ all -> 0x0359 }
            byte[] r0 = r10.A00()     // Catch:{ all -> 0x0359 }
            r1.A0C(r0)     // Catch:{ all -> 0x0359 }
            r5.A03(r6, r4)     // Catch:{ all -> 0x0359 }
            r7.A02(r8, r6)     // Catch:{ all -> 0x0359 }
            monitor-exit(r16)     // Catch:{ all -> 0x0359 }
            goto L_0x036a
        L_0x0343:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x0359 }
            throw r0     // Catch:{ all -> 0x0359 }
        L_0x0349:
            java.lang.String r0 = "No signed prekey!"
            X.24R r1 = new X.24R     // Catch:{ all -> 0x0359 }
            r1.<init>(r0)     // Catch:{ all -> 0x0359 }
            goto L_0x0358
        L_0x0351:
            java.lang.String r0 = "Invalid signature on device key!"
            X.24R r1 = new X.24R     // Catch:{ all -> 0x0359 }
            r1.<init>(r0)     // Catch:{ all -> 0x0359 }
        L_0x0358:
            throw r1     // Catch:{ all -> 0x0359 }
        L_0x0359:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0359 }
            throw r0     // Catch:{ 24R -> 0x0365, 23U -> 0x0368, Exception -> 0x035c }
        L_0x035c:
            r1 = move-exception
            java.lang.String r0 = "axolotl"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0370 }
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x036a
        L_0x0365:
            r9 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x036a
        L_0x0368:
            r9 = -1010(0xfffffffffffffc0e, float:NaN)
        L_0x036a:
            if (r19 == 0) goto L_0x036f
            r19.close()
        L_0x036f:
            return r9
        L_0x0370:
            r1 = move-exception
            if (r19 == 0) goto L_0x037b
            r19.close()     // Catch:{ all -> 0x0377 }
            throw r1
        L_0x0377:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x037b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A02(X.2ov, X.2Ov, X.2Ov, byte[], byte[], byte):int");
    }

    public C48472ex A03(C836749i r14, C54562ov r15, byte[] bArr) {
        C48472ex r0;
        AnonymousClass4CB r1;
        byte[] bArr2;
        C73523fe A002 = C614730x.A00(r15, this.A0K);
        try {
            C836749i r10 = r14;
            byte[] bArr3 = bArr;
            if (this.A0N.A0Y(C58422vE.A02, 182)) {
                JniBridge jniBridge = this.A01.A03;
                C40962Ik r02 = new C40962Ik((NativeHolder) JniBridge.jvidispatchOIOOOO(2, (long) r15.A00, AnonymousClass31S.A01(r15), r10, C18300x5.A0I(jniBridge), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r02.A00;
                r0 = C48472ex.A00(nativeHolder, C18290x4.A1a(nativeHolder, 53));
            } else {
                C625535n r03 = this.A00;
                AnonymousClass33L A052 = r03.A05(r15);
                if (r14 != null) {
                    try {
                        Objects.requireNonNull(r14);
                        r1 = new C73043eq(r14);
                    } catch (AnonymousClass24X e) {
                        r0 = C625535n.A00(e, (byte[]) null, -1005);
                    } catch (C377123s e2) {
                        r0 = C625535n.A00(e2, (byte[]) null, -1001);
                    } catch (C377323u e3) {
                        r0 = C625535n.A00(e3, (byte[]) null, -1007);
                    } catch (AnonymousClass24T e4) {
                        r0 = C625535n.A00(e4, (byte[]) null, -1008);
                    } catch (Exception e5) {
                        Log.w("axolotl", e5);
                        r0 = C625535n.A00(e5, (byte[]) null, -1000);
                    }
                } else {
                    r1 = new C73033ep();
                }
                if (r03.A04.A03()) {
                    C73093ev r04 = new C73093ev(bArr3);
                    synchronized (AnonymousClass33L.A04) {
                        bArr2 = A052.A03(r1, r04);
                    }
                } else {
                    bArr2 = A052.A03(r1, new C73093ev(bArr3));
                }
                r0 = C625535n.A00((Exception) null, bArr2, 0);
            }
            if (A002 != null) {
                A002.close();
            }
            return r0;
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C48472ex A04(C836749i r16, C54562ov r17, byte[] bArr) {
        C48472ex r1;
        AnonymousClass4CB r12;
        byte[] bArr2;
        C54562ov r4 = r17;
        C73523fe A002 = C614730x.A00(r4, this.A0K);
        try {
            byte[] bArr3 = bArr;
            C73073et r6 = new C73073et(bArr3);
            byte[] A072 = A0A(r4).A01.A00.remoteIdentityPublic_.A07();
            if (A072.length != 0 && !Arrays.equals(A072, r6.A03.A00.A00())) {
                A0B(r4);
            }
            C836749i r122 = r16;
            if (this.A0N.A0Y(C58422vE.A02, 182)) {
                JniBridge jniBridge = this.A01.A03;
                C40962Ik r0 = new C40962Ik((NativeHolder) JniBridge.jvidispatchOIOOOO(3, (long) r4.A00, AnonymousClass31S.A01(r4), r122, C18300x5.A0I(jniBridge), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r0.A00;
                r1 = C48472ex.A00(nativeHolder, C18290x4.A1a(nativeHolder, 53));
            } else {
                C625535n r02 = this.A00;
                AnonymousClass33L A052 = r02.A05(r4);
                if (r16 != null) {
                    try {
                        Objects.requireNonNull(r122);
                        r12 = new C73043eq(r122);
                    } catch (C377123s e) {
                        r1 = C625535n.A00(e, (byte[]) null, -1001);
                    } catch (AnonymousClass24X e2) {
                        r1 = C625535n.A00(e2, (byte[]) null, -1005);
                    } catch (AnonymousClass24S e3) {
                        r1 = C625535n.A00(e3, (byte[]) null, -1003);
                    } catch (AnonymousClass24R e4) {
                        r1 = C625535n.A00(e4, (byte[]) null, -1002);
                    } catch (AnonymousClass23U e5) {
                        r1 = C625535n.A00(e5, (byte[]) null, -1010);
                    } catch (C377323u e6) {
                        r1 = C625535n.A00(e6, (byte[]) null, -1007);
                    } catch (Exception e7) {
                        Log.w("axolotl", e7);
                        r1 = C625535n.A00(e7, (byte[]) null, -1000);
                    }
                } else {
                    r12 = new C73033ep();
                }
                if (r02.A04.A03()) {
                    synchronized (AnonymousClass33L.A04) {
                        bArr2 = A052.A02(r12, r6);
                    }
                } else {
                    bArr2 = A052.A02(r12, r6);
                }
                r1 = C625535n.A00((Exception) null, bArr2, 0);
            }
        } catch (AnonymousClass24X e8) {
            Log.w("axolotl", e8);
            e8.getMessage();
            r1 = new C48472ex((byte[]) null, -1005);
        } catch (C377223t e9) {
            Log.w("axolotl", e9);
            r1 = new C48472ex((byte[]) null, -1006);
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
        if (A002 != null) {
            A002.close();
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r0 = r1.senderSigningKey_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        if (r0 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r0 = X.C21381Bp.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        r5.A00(X.C616431q.A00(r0.public_));
        r4 = r5.A00;
        r1 = new X.AnonymousClass35L((java.util.List) r10.A00.senderChainKeys_);
        r3 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        if (r3 > r4) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (r3 >= r4) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r1 = r1.A02(r4 - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        r10.A00(r1.A02(1));
        r4 = r1.A03();
        r1 = new X.C43012Qk(r1.A00, X.AnonymousClass35L.A01(r4[r4.length - 1], (byte) 1));
        r0 = r1.A02;
        r1 = r1.A01;
        r5 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1 = X.C18310x6.A1Y(X.C18300x5.A0y(r1), X.C18330xA.A0D(r0), javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding"), r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.BF5(r1);
        r9.A01(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Received message with old counter: ");
        r1.append(r3);
        r1 = new X.C377123s(X.AnonymousClass000.A0Y(" , ", r1, r4));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C48472ex A05(X.C836749i r22, X.C54422oh r23, byte[] r24) {
        /*
            r21 = this;
            r5 = r21
            r6 = r23
            X.3fe r12 = X.C614730x.A01(r5, r6)
            X.1VX r2 = r5.A0N     // Catch:{ all -> 0x017f }
            r1 = 188(0xbc, float:2.63E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x017f }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x017f }
            r4 = r22
            r3 = r24
            if (r0 == 0) goto L_0x005a
            X.2ai r0 = r5.A01     // Catch:{ all -> 0x017f }
            com.whatsapp.wamsys.JniBridge r2 = r0.A03     // Catch:{ all -> 0x017f }
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x017f }
            X.2ov r0 = r6.A00     // Catch:{ all -> 0x017f }
            java.lang.String r17 = X.AnonymousClass31S.A01(r0)     // Catch:{ all -> 0x017f }
            int r0 = r0.A00     // Catch:{ all -> 0x017f }
            r13 = 1
            long r14 = (long) r0     // Catch:{ all -> 0x017f }
            com.facebook.simplejni.NativeHolder r19 = X.C18300x5.A0I(r2)     // Catch:{ all -> 0x017f }
            r16 = r1
            r18 = r4
            r20 = r3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOOO(r13, r14, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x017f }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x017f }
            X.2Ik r0 = new X.2Ik     // Catch:{ all -> 0x017f }
            r0.<init>(r1)     // Catch:{ all -> 0x017f }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x017f }
            com.facebook.simplejni.NativeHolder r2 = r0.A00     // Catch:{ all -> 0x017f }
            r0 = 53
            byte[] r4 = X.C18290x4.A1a(r2, r0)     // Catch:{ all -> 0x017f }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x017f }
            r0 = 54
            long r0 = (long) r0     // Catch:{ all -> 0x017f }
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r13, r0, r2)     // Catch:{ all -> 0x017f }
            int r1 = (int) r2     // Catch:{ all -> 0x017f }
            X.2ex r0 = new X.2ex     // Catch:{ all -> 0x017f }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x005a:
            X.35n r0 = r5.A00     // Catch:{ all -> 0x017f }
            X.2qP r0 = r0.A02     // Catch:{ all -> 0x017f }
            X.2fc r9 = r0.A01     // Catch:{ all -> 0x017f }
            X.2fX r7 = X.AnonymousClass31S.A02(r6)     // Catch:{ all -> 0x017f }
            r2 = 0
            java.util.Objects.requireNonNull(r4)     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            X.3eq r8 = new X.3eq     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            r8.<init>(r4)     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            java.lang.Object r11 = X.C39312Bm.A00     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            monitor-enter(r11)     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            X.2wQ r6 = r9.A00(r7)     // Catch:{ 24R | 24S -> 0x0145 }
            java.util.LinkedList r1 = r6.A00     // Catch:{ 24R | 24S -> 0x0145 }
            boolean r0 = r1.isEmpty()     // Catch:{ 24R | 24S -> 0x0145 }
            if (r0 != 0) goto L_0x012e
            X.3eu r5 = new X.3eu     // Catch:{ 24R | 24S -> 0x0145 }
            r5.<init>(r3)     // Catch:{ 24R | 24S -> 0x0145 }
            int r4 = r5.A01     // Catch:{ 24R | 24S -> 0x0145 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ 24R | 24S -> 0x0145 }
        L_0x0087:
            boolean r0 = r3.hasNext()     // Catch:{ 24R | 24S -> 0x0145 }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r10 = r3.next()     // Catch:{ 24R | 24S -> 0x0145 }
            X.2wR r10 = (X.C59152wR) r10     // Catch:{ 24R | 24S -> 0x0145 }
            X.1CY r1 = r10.A00     // Catch:{ 24R | 24S -> 0x0145 }
            int r0 = r1.senderKeyId_     // Catch:{ 24R | 24S -> 0x0145 }
            if (r0 != r4) goto L_0x0087
            X.1Bp r0 = r1.senderSigningKey_     // Catch:{ 24R | 24S -> 0x0145 }
            if (r0 != 0) goto L_0x009f
            X.1Bp r0 = X.C21381Bp.DEFAULT_INSTANCE     // Catch:{ 24R | 24S -> 0x0145 }
        L_0x009f:
            X.8Lq r0 = r0.public_     // Catch:{ 24R | 24S -> 0x0145 }
            X.3ZK r0 = X.C616431q.A00(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            r5.A00(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            int r4 = r5.A00     // Catch:{ 24R | 24S -> 0x0145 }
            X.1CY r0 = r10.A00     // Catch:{ 24R | 24S -> 0x0145 }
            X.8ya r0 = r0.senderChainKeys_     // Catch:{ 24R | 24S -> 0x0145 }
            X.35L r1 = new X.35L     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>((java.util.List) r0)     // Catch:{ 24R | 24S -> 0x0145 }
            int r3 = r1.A00     // Catch:{ 24R | 24S -> 0x0145 }
            if (r3 > r4) goto L_0x0106
            if (r3 >= r4) goto L_0x00be
            int r4 = r4 - r3
            X.35L r1 = r1.A02(r4)     // Catch:{ 24R | 24S -> 0x0145 }
        L_0x00be:
            r0 = 1
            X.35L r0 = r1.A02(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            r10.A00(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            byte[][] r4 = r1.A03()     // Catch:{ 24R | 24S -> 0x0145 }
            int r3 = r1.A00     // Catch:{ 24R | 24S -> 0x0145 }
            int r0 = r4.length     // Catch:{ 24R | 24S -> 0x0145 }
            r1 = 1
            int r0 = r0 - r1
            r0 = r4[r0]     // Catch:{ 24R | 24S -> 0x0145 }
            byte[] r0 = X.AnonymousClass35L.A01(r0, r1)     // Catch:{ 24R | 24S -> 0x0145 }
            X.2Qk r1 = new X.2Qk     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>(r3, r0)     // Catch:{ 24R | 24S -> 0x0145 }
            byte[] r0 = r1.A02     // Catch:{ 24R | 24S -> 0x0145 }
            byte[] r1 = r1.A01     // Catch:{ 24R | 24S -> 0x0145 }
            byte[] r5 = r5.A02     // Catch:{ 24R | 24S -> 0x0145 }
            javax.crypto.spec.IvParameterSpec r4 = X.C18330xA.A0D(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0100, BadPaddingException | IllegalBlockSizeException -> 0x013e, 24R | 24S -> 0x0145 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0100, BadPaddingException | IllegalBlockSizeException -> 0x013e, 24R | 24S -> 0x0145 }
            javax.crypto.spec.SecretKeySpec r1 = X.C18300x5.A0y(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0100, BadPaddingException | IllegalBlockSizeException -> 0x013e, 24R | 24S -> 0x0145 }
            r0 = 2
            byte[] r1 = X.C18310x6.A1Y(r1, r4, r3, r5, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0100, BadPaddingException | IllegalBlockSizeException -> 0x013e, 24R | 24S -> 0x0145 }
            r8.BF5(r1)     // Catch:{ 24R | 24S -> 0x0145 }
            r9.A01(r7, r6)     // Catch:{ 24R | 24S -> 0x0145 }
            monitor-exit(r11)     // Catch:{ all -> 0x014c }
            r0 = 0
            X.2ex r0 = X.C625535n.A00(r2, r1, r0)     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
            goto L_0x017b
        L_0x0100:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            goto L_0x0144
        L_0x0106:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x0145 }
            java.lang.String r0 = "Received message with old counter: "
            r1.append(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            r1.append(r3)     // Catch:{ 24R | 24S -> 0x0145 }
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ 24R | 24S -> 0x0145 }
            X.23s r1 = new X.23s     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>(r0)     // Catch:{ 24R | 24S -> 0x0145 }
            goto L_0x0144
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x0145 }
            java.lang.String r0 = "No keys for: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ 24R | 24S -> 0x0145 }
            X.24S r1 = new X.24S     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x0145 }
            goto L_0x0144
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24R | 24S -> 0x0145 }
            java.lang.String r0 = "No sender key for: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r7, r0, r1)     // Catch:{ 24R | 24S -> 0x0145 }
            X.24T r1 = new X.24T     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 24R | 24S -> 0x0145 }
            goto L_0x0144
        L_0x013e:
            r0 = move-exception
            X.24X r1 = new X.24X     // Catch:{ 24R | 24S -> 0x0145 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ 24R | 24S -> 0x0145 }
        L_0x0144:
            throw r1     // Catch:{ 24R | 24S -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            X.24X r0 = new X.24X     // Catch:{ all -> 0x014c }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x014c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ 23u -> 0x0174, 24X -> 0x016c, 23s -> 0x0164, 24T -> 0x015c, Exception -> 0x014f }
        L_0x014f:
            r1 = move-exception
            java.lang.String r0 = "axolotl"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x017f }
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            X.2ex r0 = X.C625535n.A00(r1, r2, r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x015c:
            r1 = move-exception
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.2ex r0 = X.C625535n.A00(r1, r2, r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x0164:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.2ex r0 = X.C625535n.A00(r1, r2, r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x016c:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.2ex r0 = X.C625535n.A00(r1, r2, r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x0174:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.2ex r0 = X.C625535n.A00(r1, r2, r0)     // Catch:{ all -> 0x017f }
        L_0x017b:
            r12.close()
            return r0
        L_0x017f:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0184 }
            throw r1
        L_0x0184:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A05(X.49i, X.2oh, byte[]):X.2ex");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3 A[Catch:{ all -> 0x00b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2NY A06(X.C54562ov r11, byte[] r12) {
        /*
            r10 = this;
            X.30x r0 = r10.A0K
            X.3fe r9 = X.C614730x.A00(r11, r0)
            X.1VX r1 = r10.A0N     // Catch:{ all -> 0x010a }
            X.AnonymousClass34F.A01(r1)     // Catch:{ all -> 0x010a }
            r0 = 187(0xbb, float:2.62E-43)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ all -> 0x010a }
            boolean r0 = r1.A0Y(r4, r0)     // Catch:{ all -> 0x010a }
            r7 = r12
            if (r0 == 0) goto L_0x0030
            X.2ai r0 = r10.A01     // Catch:{ all -> 0x010a }
            com.whatsapp.wamsys.JniBridge r1 = r0.A03     // Catch:{ all -> 0x010a }
            java.lang.String r5 = X.AnonymousClass31S.A01(r11)     // Catch:{ all -> 0x010a }
            int r0 = r11.A00     // Catch:{ all -> 0x010a }
            r2 = 0
            long r3 = (long) r0     // Catch:{ all -> 0x010a }
            com.facebook.simplejni.NativeHolder r6 = X.C18300x5.A0I(r1)     // Catch:{ all -> 0x010a }
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r2, r3, r5, r6, r7)     // Catch:{ all -> 0x010a }
            X.2NY r2 = X.C40972Il.A00(r0)     // Catch:{ all -> 0x010a }
            goto L_0x0103
        L_0x0030:
            X.35n r6 = r10.A00     // Catch:{ all -> 0x010a }
            X.33L r3 = r6.A05(r11)     // Catch:{ all -> 0x010a }
            byte[] r2 = X.C625535n.A03(r12)     // Catch:{ all -> 0x010a }
            r5 = 0
            X.2fm r0 = r6.A04     // Catch:{ IllegalArgumentException -> 0x00d8 }
            boolean r0 = r0.A03()     // Catch:{ IllegalArgumentException -> 0x00d8 }
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = X.AnonymousClass33L.A04     // Catch:{ IllegalArgumentException -> 0x00d8 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x00d8 }
            X.4Dx r3 = r3.A01(r2)     // Catch:{ all -> 0x004c }
            monitor-exit(r1)     // Catch:{ all -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004c }
            goto L_0x00b9
        L_0x004f:
            X.4Dx r3 = r3.A01(r2)     // Catch:{ IllegalArgumentException -> 0x00d8 }
        L_0x0053:
            X.1VX r1 = r6.A05     // Catch:{ IllegalArgumentException -> 0x00d8 }
            r0 = 3391(0xd3f, float:4.752E-42)
            boolean r0 = r1.A0Y(r4, r0)     // Catch:{ IllegalArgumentException -> 0x00d8 }
            if (r0 == 0) goto L_0x00ba
            android.util.LruCache r4 = r6.A00     // Catch:{ IllegalArgumentException -> 0x00d8 }
            monitor-enter(r4)     // Catch:{ IllegalArgumentException -> 0x00d8 }
            java.lang.Object r2 = r4.get(r11)     // Catch:{ all -> 0x00b7 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00b7 }
            boolean r8 = r3 instanceof X.C73073et     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x0072
            r0 = r3
            X.3et r0 = (X.C73073et) r0     // Catch:{ all -> 0x00b7 }
            X.3ev r0 = r0.A05     // Catch:{ all -> 0x00b7 }
        L_0x006f:
            int r7 = r0.A00     // Catch:{ all -> 0x00b7 }
            goto L_0x007b
        L_0x0072:
            boolean r0 = r3 instanceof X.C73093ev     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x007a
            r0 = r3
            X.3ev r0 = (X.C73093ev) r0     // Catch:{ all -> 0x00b7 }
            goto L_0x006f
        L_0x007a:
            r7 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x00aa
            if (r7 <= 0) goto L_0x00aa
            int r0 = r2.intValue()     // Catch:{ all -> 0x00b7 }
            if (r7 > r0) goto L_0x00aa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "Invalid counter for "
            r1.append(r0)     // Catch:{ all -> 0x00b7 }
            r1.append(r11)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "; current = "
            r1.append(r0)     // Catch:{ all -> 0x00b7 }
            r1.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = " new = "
            X.C18260x0.A0x(r0, r1, r7)     // Catch:{ all -> 0x00b7 }
            X.2qk r2 = r6.A01     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "invalid-signal-counter-used"
            if (r8 == 0) goto L_0x00b3
            java.lang.String r0 = "pkmsg"
        L_0x00a7:
            r2.A0A(r1, r5, r0)     // Catch:{ all -> 0x00b7 }
        L_0x00aa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00b7 }
            r4.put(r11, r0)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b7 }
            goto L_0x00ba
        L_0x00b3:
            java.lang.String r0 = "msg"
            goto L_0x00a7
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b7 }
        L_0x00b9:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00d8 }
        L_0x00ba:
            int r1 = r3.getType()     // Catch:{ all -> 0x010a }
            r0 = 2
            if (r1 == r0) goto L_0x00cd
            r0 = 3
            if (r1 == r0) goto L_0x00cb
            java.lang.String r0 = "SignalMessageType is neither message nor pre_key_message"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x00cb:
            r1 = 2
            goto L_0x00ce
        L_0x00cd:
            r1 = 1
        L_0x00ce:
            byte[] r0 = r3.Blc()     // Catch:{ all -> 0x010a }
            X.2NY r2 = new X.2NY     // Catch:{ all -> 0x010a }
            r2.<init>(r0, r1, r5)     // Catch:{ all -> 0x010a }
            goto L_0x0103
        L_0x00d8:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "SignalCoordinatorDefault/encryptForIndividual/error encrypting for "
            X.C18260x0.A0k(r11, r0, r1, r4)     // Catch:{ all -> 0x010a }
            X.2qP r3 = r6.A02     // Catch:{ all -> 0x010a }
            java.lang.String r2 = X.AnonymousClass31S.A01(r11)     // Catch:{ all -> 0x010a }
            int r1 = r11.A00     // Catch:{ all -> 0x010a }
            X.2kv r0 = new X.2kv     // Catch:{ all -> 0x010a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x010a }
            X.33n r1 = r3.A07     // Catch:{ all -> 0x010a }
            X.2ov r0 = X.AnonymousClass31S.A00(r0)     // Catch:{ all -> 0x010a }
            boolean r0 = r1.A0Z(r0)     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x0109
            r1 = 0
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.2NY r2 = new X.2NY     // Catch:{ all -> 0x010a }
            r2.<init>(r1, r5, r0)     // Catch:{ all -> 0x010a }
        L_0x0103:
            if (r9 == 0) goto L_0x0108
            r9.close()
        L_0x0108:
            return r2
        L_0x0109:
            throw r4     // Catch:{ all -> 0x010a }
        L_0x010a:
            r1 = move-exception
            if (r9 == 0) goto L_0x0115
            r9.close()     // Catch:{ all -> 0x0111 }
            throw r1
        L_0x0111:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0115:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A06(X.2ov, byte[]):X.2NY");
    }

    public AnonymousClass2NY A07(C54422oh r16, byte[] bArr) {
        AnonymousClass2NY r4;
        byte[] bArr2;
        C54422oh r3 = r16;
        C73523fe A012 = C614730x.A01(this, r3);
        try {
            AnonymousClass1VX r2 = this.A0N;
            AnonymousClass34F.A01(r2);
            byte[] bArr3 = bArr;
            if (r2.A0Y(C58422vE.A02, 189)) {
                JniBridge jniBridge = this.A01.A03;
                String str = r3.A01;
                C54562ov r0 = r3.A00;
                C40972Il r02 = new C40972Il((NativeHolder) JniBridge.jvidispatchOIOOOO(1, (long) r0.A00, str, AnonymousClass31S.A01(r0), C18300x5.A0I(jniBridge), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r02.A00;
                byte[] A1a = C18290x4.A1a(nativeHolder, 50);
                JniBridge.getInstance();
                JniBridge.getInstance();
                r4 = new AnonymousClass2NY(A1a, (int) JniBridge.jvidispatchIIO(1, (long) 51, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 52, nativeHolder));
            } else {
                C48872fc r8 = this.A00.A02.A01;
                new AnonymousClass2XJ(r8).A00(AnonymousClass31S.A02(r3));
                C48822fX A022 = AnonymousClass31S.A02(r3);
                byte[] A032 = C625535n.A03(bArr3);
                try {
                    synchronized (C39312Bm.A00) {
                        try {
                            C59142wQ A002 = r8.A00(A022);
                            C59152wR A003 = A002.A00();
                            AnonymousClass35L r03 = new AnonymousClass35L((List) A003.A00.senderChainKeys_);
                            byte[][] A033 = r03.A03();
                            C43012Qk r12 = new C43012Qk(r03.A00, AnonymousClass35L.A01(A033[A033.length - 1], (byte) 1));
                            byte[] bArr4 = r12.A02;
                            byte[] bArr5 = r12.A01;
                            byte[] A1Y = C18310x6.A1Y(C18300x5.A0y(bArr5), C18330xA.A0D(bArr4), Cipher.getInstance("AES/CBC/PKCS5Padding"), A032, 1);
                            AnonymousClass1CY r04 = A003.A00;
                            int i = r04.senderKeyId_;
                            int i2 = r12.A00;
                            C21381Bp r05 = r04.senderSigningKey_;
                            if (r05 == null) {
                                r05 = C21381Bp.DEFAULT_INSTANCE;
                            }
                            C73083eu r42 = new C73083eu(new AnonymousClass2JA(r05.private_.A07()), A1Y, i, i2);
                            A003.A00(new AnonymousClass35L((List) A003.A00.senderChainKeys_).A02(1));
                            r8.A01(A022, A002);
                            bArr2 = r42.A03;
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                            throw AnonymousClass0x9.A0i(e);
                        } catch (AnonymousClass24S e2) {
                            throw new AnonymousClass24T((Exception) e2);
                        }
                    }
                    r4 = new AnonymousClass2NY(bArr2, 4, 0);
                } catch (AnonymousClass24T unused) {
                    r4 = new AnonymousClass2NY((byte[]) null, 0, -1008);
                }
            }
            return r4;
        } finally {
            try {
                A012.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return A0B(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C59402wr A0A(X.C54562ov r4) {
        /*
            r3 = this;
            X.2pw r2 = r3.A0G
            monitor-enter(r2)
            X.2wr r0 = r2.A01(r4)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0019
            X.2ot r0 = r3.A0B     // Catch:{ all -> 0x002e }
            byte[] r1 = r0.A03(r4)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x001b
            X.2wr r0 = new X.2wr     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            r2.A04(r0, r4)     // Catch:{ all -> 0x002e }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            goto L_0x0027
        L_0x001b:
            X.2wr r0 = new X.2wr     // Catch:{ IOException -> 0x0028 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0028 }
            A01(r0)     // Catch:{ IOException -> 0x0028 }
            r2.A04(r0, r4)     // Catch:{ IOException -> 0x0028 }
            goto L_0x0019
        L_0x0027:
            return r0
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            X.2wr r0 = r3.A0B(r4)
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A0A(X.2ov):X.2wr");
    }

    public C59402wr A0B(C54562ov r7) {
        C59402wr r3;
        C59402wr r32;
        boolean A0Y = this.A0N.A0Y(C58422vE.A02, 4009);
        C85284Fq A0C2 = this.A0L.A0C();
        if (A0Y) {
            C69833Yo Axl = A0C2.Axl();
            synchronized (this.A0G) {
                try {
                    this.A0B.A01(r7);
                    r32 = new C59402wr();
                    A0C2.B25(new C70333aK(this, r7, r32, 44));
                    Axl.A00();
                    Axl.close();
                    A0C2.close();
                } catch (Throwable th) {
                    Axl.close();
                    A0C2.close();
                    throw th;
                }
            }
            return r32;
        }
        try {
            C69833Yo Axl2 = A0C2.Axl();
            try {
                C55182pw r1 = this.A0G;
                synchronized (r1) {
                    this.A0B.A01(r7);
                    r3 = new C59402wr();
                    r1.A04(r3, r7);
                    Axl2.A00();
                }
                Axl2.close();
                A0C2.close();
                return r3;
            } catch (Throwable th2) {
                Axl2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A0C2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public C54562ov A0C(C54562ov r5) {
        C56972sr r1 = this.A03;
        C27981fH A0H2 = r1.A0H();
        PhoneUserJid A042 = C56972sr.A04(r1);
        if (A0H2 == null || A042 == null || !r5.A02.equals(A0H2.user)) {
            return r5;
        }
        return new C54562ov(A042.user, 0, r5.A00);
    }

    public C42612Ov A0D() {
        AssertionError assertionError;
        C73523fe A032 = this.A0K.A03();
        try {
            byte[] A012 = this.A0C.A01();
            if (A012 != null) {
                AnonymousClass1DQ r5 = (AnonymousClass1DQ) C130786cX.A05(AnonymousClass1DQ.DEFAULT_INSTANCE, A012);
                if (A032 != null) {
                    A032.close();
                }
                Log.i("axolotl loaded the latest signed pre key for sending");
                try {
                    return new C42612Ov(AnonymousClass36A.A02(r5.id_), new AnonymousClass2KI(new C48462ew(r5.privateKey_.A07(), (byte) 5), AnonymousClass36G.A01(r5.publicKey_.A07())).A01.A01, r5.signature_.A07());
                } catch (AnonymousClass23X e) {
                    throw AnonymousClass0x9.A0i(e);
                }
            } else {
                assertionError = AnonymousClass0x9.A0i("no signed prekey record found");
                throw assertionError;
            }
        } catch (IOException e2) {
            Log.e("failed to parse the latest signed prekey record", e2);
            assertionError = AnonymousClass0x9.A0i(e2);
        } catch (Throwable th) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C42612Ov A0E() {
        C55252q3 r7;
        Cursor A0E2;
        AnonymousClass2JO r8;
        C42612Ov r3;
        C42612Ov r5;
        C73523fe A032 = this.A0K.A03();
        try {
            C625535n r2 = this.A00;
            C55472qP r1 = r2.A02;
            if (!r1.A04()) {
                r2.A06();
            }
            r7 = r1.A04;
            AnonymousClass1RJ r9 = r7.A02;
            AnonymousClass4GK A0B2 = r9.get();
            try {
                A0E2 = ((AnonymousClass3H0) A0B2).A03.A0E("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getSinglePreKey", new String[]{"1"});
                if (A0E2.moveToNext()) {
                    r8 = new AnonymousClass2JO(AnonymousClass0x2.A04(A0E2, "prekey_id"), C18280x3.A1Z(A0E2, "record"));
                    A0E2.close();
                    A0B2.close();
                } else {
                    A0E2.close();
                    A0B2.close();
                    r8 = null;
                }
                r3 = null;
                if (r8 != null) {
                    int i = r8.A00;
                    byte[] A002 = new C59162wS(r8.A01).A00().A01.A00();
                    int length = A002.length - 1;
                    byte[] bArr = new byte[length];
                    System.arraycopy(A002, 1, bArr, 0, length);
                    r5 = new C42612Ov(AnonymousClass36A.A02(i), bArr, (byte[]) null);
                    A0B2 = r9.A0C();
                    ContentValues A092 = C18280x3.A09();
                    A092.put("direct_distribution", Boolean.TRUE);
                    C56862sg A022 = AnonymousClass3H0.A02(A092, A0B2, "upload_timestamp", C56612sH.A00(r7.A01));
                    boolean z = true;
                    String[] strArr = new String[1];
                    C18270x1.A1O(strArr, i);
                    if (A022.A05(A092, "prekeys", "prekey_id=?", "SignalPreKeyStore/markPreKeyAsDirectDistribution", strArr) != 1) {
                        z = false;
                    }
                    A0B2.close();
                    if (!z) {
                        Log.e("Failed to mark key as direct distribution, not sending pre-key with retry receipt");
                    }
                    r3 = r5;
                }
            } catch (Throwable th) {
                A0B2.close();
                throw th;
            }
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("error reading prekey ");
            int i2 = r8.A00;
            A0o.append(i2);
            C18280x3.A1C(A0o, e);
            r7.A02(i2);
            r5 = null;
        } catch (Throwable th2) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw th2;
        }
        if (A032 != null) {
            A032.close();
        }
        return r3;
        throw th;
    }

    public void A0I() {
        this.A0L.A0D();
        if (this.A04.A08(C66663Mh.A0y)) {
            JniBridge jniBridge = this.A0O;
            AtomicReference atomicReference = jniBridge.wajContext;
            Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextInit");
            NativeHolder nativeHolder = (NativeHolder) atomicReference.getAndSet(JniBridge.jvidispatchO(0));
            if (nativeHolder != null) {
                nativeHolder.release();
            }
            AnonymousClass1VX r3 = this.A0N;
            if (r3.A0O(C58422vE.A02, 5120) >= 1) {
                C382826s.A00(this.A0E.A00, this.A0P.A00(), this.A0F, r3, jniBridge);
            }
        }
        C55182pw r1 = this.A0G;
        synchronized (r1) {
            r1.A00.clear();
            r1.A01.clear();
        }
    }

    public void A0J() {
        C73523fe A032 = this.A0K.A03();
        try {
            if (this.A04.A08(C66663Mh.A0y)) {
                C45872ai r6 = this.A01;
                int A002 = r6.A01.A00();
                int A033 = r6.A00.A03(C66663Mh.A17);
                if (A002 < A033) {
                    int i = A033 - A002;
                    while (true) {
                        if (i <= 0) {
                            break;
                        }
                        int min = Math.min(i, 50);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("wa-msys generating ");
                        A0o.append(min);
                        C18260x0.A1L(A0o, " new prekeys and recording them in the db");
                        int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(4, (long) min, C18300x5.A0I(r6.A03));
                        if (jvidispatchIIO <= 0) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("wa-msys generated 0 keys when expected to generate ");
                            A0o2.append(min);
                            C18260x0.A1K(A0o2, " keys");
                            break;
                        }
                        i -= jvidispatchIIO;
                    }
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("skipping key generation because already more than ");
                    A0o3.append(A033);
                    C18260x0.A1L(A0o3, " are unsent");
                }
            } else {
                this.A00.A06();
            }
            if (A032 != null) {
                A032.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0K() {
        C85284Fq A0C2;
        C73523fe A032 = this.A0K.A03();
        try {
            AnonymousClass1RJ r4 = this.A00.A02.A04.A02;
            C85284Fq A0C3 = r4.A0C();
            try {
                C69833Yo Axl = A0C3.Axl();
                try {
                    ContentValues A062 = AnonymousClass0x9.A06();
                    A062.put("sent_to_server", Boolean.FALSE);
                    AnonymousClass3H0.A02(A062, A0C3, "upload_timestamp", 0).A05(A062, "prekeys", "sent_to_server != 0", "SignalPreKeyStore/markAllPreKeysAsUnsentToServer", (String[]) null);
                    Log.i("axolotl recorded no prekeys as received by server");
                    A0C2 = r4.A0C();
                    C18260x0.A0y("axolotl deleted prekey upload timestamps:", AnonymousClass001.A0o(), ((AnonymousClass3H0) A0C2).A03.A07("prekey_uploads", (String) null, "SignalPreKeyStore/deleteAllPreKeyUploads", (String[]) null));
                    A0C2.close();
                    Axl.A00();
                    Axl.close();
                    A0C3.close();
                    if (A032 != null) {
                        A032.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0C3.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }

    public void A0L(int i) {
        int i2;
        Cursor A0F2;
        C73523fe A032 = this.A0K.A03();
        try {
            C51162jN r5 = this.A0C;
            String[] strArr = new String[5];
            int i3 = 0;
            do {
                i2 = i;
                int i4 = i - i3;
                if (i4 < 0) {
                    i4 += EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                }
                C18280x3.A1Q(strArr, i4, i3);
                i3++;
            } while (i3 < 5);
            C85284Fq A0C2 = r5.A01.A0C();
            try {
                C69833Yo Axl = A0C2.Axl();
                try {
                    C56862sg r8 = ((AnonymousClass3H0) A0C2).A03;
                    A0F2 = r8.A0F("signed_prekeys", new String[]{"COUNT(1) as count"}, "prekey_id IN (?,?,?,?,?)", strArr, (String) null, (String) null, (String) null, "SignalSignedPreKeyStore/removeOldSignedPreKeysCountRemaining");
                    if (!A0F2.moveToNext()) {
                        C18260x0.A0x("failed to query a count while trying to delete old signed prekey records; newSignedPreKeyId=", AnonymousClass001.A0o(), i2);
                    } else if (AnonymousClass0x2.A03(A0F2) == 0) {
                        C18260x0.A0x("there would be zero signed prekeys left if this delete old signed prekey records command were executed; aborting; newSignedPreKeyId=", AnonymousClass001.A0o(), i2);
                    } else {
                        int A072 = r8.A07("signed_prekeys", "prekey_id NOT IN (?,?,?,?,?)", "SignalSignedPreKeyStore/removeOldSignedPreKeys", strArr);
                        if (A072 != 0) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("deleted ");
                            A0o.append(A072);
                            C18260x0.A0y(" old signed prekey records; newSignedPreKeyId=", A0o, i2);
                        }
                        Axl.A00();
                    }
                    A0F2.close();
                    Axl.close();
                    A0C2.close();
                    if (A032 != null) {
                        A032.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0C2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }

    public void A0P(C54562ov r4, C95814uZ r5, byte[] bArr) {
        C73523fe A002 = C614730x.A00(r4, this.A0K);
        try {
            A0R(r4, AnonymousClass2z0.A04(r5, "location_msg_id"), bArr);
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0Q(C54562ov r9, AnonymousClass2z0 r10) {
        C85284Fq A0C2;
        C73523fe A002 = C614730x.A00(r9, this.A0K);
        try {
            C58562vS r2 = this.A08;
            String A003 = C58562vS.A00(r10);
            String A0i = C18300x5.A0i(r10.A00);
            A0C2 = r2.A02.A0C();
            C56862sg r4 = ((AnonymousClass3H0) A0C2).A03;
            String[] A1a = C18300x5.A1a(A0i, 5);
            A1a[1] = r9.A02;
            C18280x3.A1O(A1a, r9.A01);
            A1a[3] = String.valueOf(r9.A00);
            A1a[4] = r10.A01;
            long A072 = (long) r4.A07("message_base_key", A003, "SignalMessageBaseKeyStore/removeMessageBaseKey", A1a);
            int i = 5;
            if (A072 > 0) {
                i = 3;
            }
            Log.log(i, AnonymousClass000.A0P(r10, " message base key rows for ", C18300x5.A0o(A072)));
            A0C2.close();
            if (A002 != null) {
                A002.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    public void A0R(C54562ov r8, AnonymousClass2z0 r9, byte[] bArr) {
        C85284Fq A0C2;
        C73523fe A002 = C614730x.A00(r8, this.A0K);
        try {
            C58562vS r4 = this.A08;
            String A0i = C18300x5.A0i(r9.A00);
            A0C2 = r4.A02.A0C();
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("msg_key_remote_jid", A0i);
            A062.put("recipient_id", r8.A02);
            C18270x1.A0b(A062, "recipient_type", r8.A01);
            C18270x1.A0b(A062, "device_id", r8.A00);
            AnonymousClass0x2.A0o(A062, "msg_key_from_me", r9.A02);
            A062.put("msg_key_id", r9.A01);
            A062.put("last_alice_base_key", bArr);
            C18270x1.A0c(A062, "timestamp", C56612sH.A00(r4.A00));
            Long A003 = r4.A01.A00(r8, 3);
            if (A003 != null) {
                A062.put("recipient_lid_identifier", A003);
            }
            long A0B2 = ((AnonymousClass3H0) A0C2).A03.A0B("message_base_key", "SignalMessageBaseKeyStore/saveMessageBaseKey", A062);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("axolotl saved a message base key for ");
            A0o.append(r9);
            C18260x0.A12(" with row id ", A0o, A0B2);
            A0C2.close();
            if (A002 != null) {
                A002.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C18260x0.A0t("senderkeystore/storesenderkey/invalidgroupid ", r9, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C54422oh r25, byte[] r26) {
        /*
            r24 = this;
            r6 = r24
            r11 = r25
            X.3fe r17 = X.C614730x.A01(r6, r11)
            java.lang.String r9 = r11.A01     // Catch:{ all -> 0x00de }
            com.whatsapp.jid.Jid r4 = X.AnonymousClass32W.A01(r9)     // Catch:{ 24P -> 0x00d0 }
            boolean r0 = r4 instanceof X.C28011fL     // Catch:{ 24P -> 0x00d0 }
            if (r0 == 0) goto L_0x00cb
            X.1fL r4 = (X.C28011fL) r4     // Catch:{ 24P -> 0x00d0 }
            if (r4 == 0) goto L_0x00cb
            X.2wp r10 = r6.A0A     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "SenderKeyStore/saveSenderKey/"
            X.C18260x0.A1R(r1, r0, r11)     // Catch:{ all -> 0x00de }
            X.1RJ r0 = r10.A02     // Catch:{ all -> 0x00de }
            X.4Fq r16 = r0.A0C()     // Catch:{ all -> 0x00de }
            X.3Yo r15 = r16.Axl()     // Catch:{ all -> 0x00c1 }
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "record"
            r1 = r26
            r8.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            X.2sH r0 = r10.A00     // Catch:{ all -> 0x00b7 }
            long r0 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x00b7 }
            r2 = r16
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x00b7 }
            X.2sg r7 = r2.A03     // Catch:{ all -> 0x00b7 }
            java.lang.String r5 = "sender_keys"
            java.lang.String r21 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r23 = r11.A01()     // Catch:{ all -> 0x00b7 }
            java.lang.String r22 = "SignalSenderKeyStore/saveSenderKeyUpdate"
            r20 = r5
            r18 = r7
            r19 = r8
            int r2 = r18.A05(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00b7 }
            long r2 = (long) r2     // Catch:{ all -> 0x00b7 }
            r13 = 0
            int r12 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0098
            java.lang.String r2 = "group_id"
            r8.put(r2, r9)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "sender_id"
            X.2ov r9 = r11.A00     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = r9.A02     // Catch:{ all -> 0x00b7 }
            r8.put(r3, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "sender_type"
            int r2 = r9.A01     // Catch:{ all -> 0x00b7 }
            X.C18270x1.A0b(r8, r3, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "device_id"
            int r2 = r9.A00     // Catch:{ all -> 0x00b7 }
            X.C18270x1.A0b(r8, r3, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "timestamp"
            X.C18270x1.A0c(r8, r2, r0)     // Catch:{ all -> 0x00b7 }
            X.2bY r1 = r10.A01     // Catch:{ all -> 0x00b7 }
            r0 = 4
            java.lang.Long r1 = r1.A00(r9, r0)     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "sender_lid_identifier"
            r8.put(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x0092:
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey"
            long r2 = r7.A09(r5, r0, r8)     // Catch:{ all -> 0x00b7 }
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "SenderKeyStore/saveSenderKey/result/"
            X.C18260x0.A12(r0, r1, r2)     // Catch:{ all -> 0x00b7 }
            r15.A00()     // Catch:{ all -> 0x00b7 }
            r15.close()     // Catch:{ all -> 0x00c1 }
            r16.close()     // Catch:{ all -> 0x00de }
            X.2Mv r1 = r6.A05     // Catch:{ all -> 0x00de }
            X.2VY r0 = new X.2VY     // Catch:{ all -> 0x00de }
            r0.<init>(r4)     // Catch:{ all -> 0x00de }
            X.2dt r0 = r1.A01     // Catch:{ all -> 0x00de }
            r0.A00()     // Catch:{ all -> 0x00de }
            goto L_0x00da
        L_0x00b7:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c1 }
        L_0x00c0:
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00de }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00cb:
            X.24P r0 = X.AnonymousClass24P.A00(r9)     // Catch:{ 24P -> 0x00d0 }
            throw r0     // Catch:{ 24P -> 0x00d0 }
        L_0x00d0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "senderkeystore/storesenderkey/invalidgroupid "
            X.C18260x0.A0t(r0, r9, r1)     // Catch:{ all -> 0x00de }
        L_0x00da:
            r17.close()
            return
        L_0x00de:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x00e3 }
            throw r1
        L_0x00e3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A0U(X.2oh, byte[]):void");
    }

    public void A0W(List list, int i) {
        Throwable th;
        C73523fe A032 = this.A0K.A03();
        try {
            if (list.size() != 0) {
                C85284Fq A0C2 = this.A0L.A0C();
                try {
                    C69833Yo Axl = A0C2.Axl();
                    try {
                        C85284Fq A0C3 = this.A09.A02.A0C();
                        try {
                            Axl = A0C3.Axl();
                            ContentValues A062 = AnonymousClass0x9.A06();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AnonymousClass2JO r2 = (AnonymousClass2JO) it.next();
                                A062.clear();
                                C18270x1.A0b(A062, "prekey_id", r2.A00);
                                A062.put("record", r2.A01);
                                Boolean bool = Boolean.FALSE;
                                A062.put("sent_to_server", bool);
                                A062.put("direct_distribution", bool);
                                ((AnonymousClass3H0) A0C3).A03.A09("prekeys", "SignalPreKeyStore/savePreKeys", A062);
                            }
                            Axl.A00();
                            Axl.close();
                            A0C3.close();
                            C85284Fq A0C4 = this.A07.A04.A0C();
                            try {
                                ContentValues A063 = AnonymousClass0x9.A06();
                                AnonymousClass3H0.A01(A063, A0C4, "next_prekey_id", i).A05(A063, "identities", "recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/saveNextPreKeyId", AnonymousClass0x2.A1b());
                                A0C4.close();
                                Axl.A00();
                                Axl.close();
                                A0C2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            A0C3.close();
                            throw th;
                        }
                    } finally {
                        Axl.close();
                    }
                } catch (Throwable th4) {
                    A0C2.close();
                    throw th4;
                }
            }
            if (A032 != null) {
                A032.close();
                return;
            }
            return;
            throw th;
        } catch (Throwable th5) {
            if (A032 != null) {
                try {
                    A032.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
            throw th5;
        }
    }

    public boolean A0X() {
        return this.A0K.A04.A0Y(C58422vE.A02, 3165);
    }

    public boolean A0Y() {
        C73523fe A032 = this.A0K.A03();
        try {
            boolean A042 = this.A00.A02.A04();
            if (A032 != null) {
                A032.close();
            }
            return A042;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0Z(C54562ov r5) {
        C55182pw r3 = this.A0G;
        synchronized (r3) {
            C59402wr A012 = r3.A01(r5);
            boolean z = true;
            if (A012 == null) {
                byte[] A032 = this.A0B.A03(r5);
                if (A032 == null) {
                    r3.A04(new C59402wr(), r5);
                    return false;
                }
                try {
                    C55182pw.A00(r3, r5, A032);
                } catch (IOException unused) {
                    A0B(r5);
                    return false;
                }
            } else if (A012.A00) {
                z = false;
            }
            return z;
        }
    }

    public boolean A0a(C54562ov r4, C95814uZ r5) {
        C73523fe A002 = C614730x.A00(r4, this.A0K);
        try {
            boolean A0b = A0b(r4, AnonymousClass2z0.A04(r5, "location_msg_id"));
            if (A002 != null) {
                A002.close();
            }
            return A0b;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0b(C54562ov r20, AnonymousClass2z0 r21) {
        Cursor A0F2;
        String str;
        C614730x r0 = this.A0K;
        C54562ov r3 = r20;
        C73523fe A002 = C614730x.A00(r3, r0);
        try {
            C73523fe A003 = C614730x.A00(r3, r0);
            try {
                C58562vS r2 = this.A08;
                AnonymousClass2z0 r4 = r21;
                String A004 = C58562vS.A00(r4);
                String A0i = C18300x5.A0i(r4.A00);
                AnonymousClass4GK A0B2 = r2.A02.get();
                try {
                    String[] A1a = C18300x5.A1a(A0i, 5);
                    A1a[1] = r3.A02;
                    C18280x3.A1O(A1a, r3.A01);
                    A1a[3] = String.valueOf(r3.A00);
                    A1a[4] = r4.A01;
                    byte[] bArr = null;
                    A0F2 = ((AnonymousClass3H0) A0B2).A03.A0F("message_base_key", new String[]{"last_alice_base_key"}, A004, A1a, (String) null, (String) null, (String) null, "SignalMessageBaseKeyStore/getMessageBaseKey");
                    if (A0F2.moveToNext()) {
                        bArr = C18280x3.A1Z(A0F2, "last_alice_base_key");
                    }
                    A0F2.close();
                    A0B2.close();
                    if (A003 != null) {
                        A003.close();
                    }
                    if (bArr == null) {
                        C18260x0.A1R(AnonymousClass001.A0o(), "axolotl has no saved base key for ", r4);
                        if (A002 == null) {
                            return false;
                        }
                        A002.close();
                        return false;
                    }
                    boolean equals = Arrays.equals(bArr, A0A(r3).A01.A00.aliceBaseKey_.A07());
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("axolotl has ");
                    if (equals) {
                        str = "matching";
                    } else {
                        str = "different";
                    }
                    A0o.append(str);
                    A0o.append(" saved base key and session for ");
                    A0o.append(r4);
                    C18260x0.A1R(A0o, " and ", r3);
                    if (A002 != null) {
                        A002.close();
                    }
                    return equals;
                } catch (Throwable th) {
                    A0B2.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (A003 != null) {
                    A003.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }

    public byte[] A0d() {
        C73523fe A032 = this.A0K.A03();
        try {
            byte[] bArr = this.A00.A04().A01.A00.A01;
            Log.i("axolotl fetched identity key for sending");
            if (A032 != null) {
                A032.close();
            }
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C47932e4 A08(C54562ov r11) {
        Cursor A0E2;
        C54562ov A0C2 = A0C(r11);
        C73523fe A002 = C614730x.A00(A0C2, this.A0K);
        try {
            AnonymousClass4GK A0B2 = this.A07.A04.get();
            try {
                A0E2 = ((AnonymousClass3H0) A0B2).A03.A0E("SELECT public_key, timestamp FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?", "SignalIdentityKeyStore/getIdentityPublicKey", A0C2.A00());
                if (!A0E2.moveToNext()) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "axolotl found no identity entry for ", A0C2);
                    A0E2.close();
                    A0B2.close();
                } else {
                    byte[] A1Z = C18280x3.A1Z(A0E2, "public_key");
                    Date date = new Date(AnonymousClass0x2.A0C(A0E2, "timestamp") * 1000);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("axolotl found an identity entry for ");
                    A0o.append(A0C2);
                    C18260x0.A1R(A0o, " dated ", date);
                    A0E2.close();
                    A0B2.close();
                    if (A1Z != null) {
                        C47932e4 r0 = new C47932e4(AnonymousClass36G.A01(A1Z));
                        if (A002 != null) {
                            A002.close();
                        }
                        return r0;
                    }
                }
            } catch (Throwable th) {
                A0B2.close();
                throw th;
            }
        } catch (AnonymousClass23X e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("axolotl identity key for ");
            A0o2.append(A0C2);
            C18260x0.A15(" decoded as invalid", A0o2, e);
            A0V(Collections.singletonList(A0C2));
        } catch (Throwable th2) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw th2;
        }
        if (A002 == null) {
            return null;
        }
        A002.close();
        return null;
        throw th;
    }

    public AnonymousClass2KL A09(C54422oh r5) {
        C73063es r0;
        C73523fe A012 = C614730x.A01(this, r5);
        try {
            C625535n r2 = this.A00;
            boolean A032 = r2.A04.A03();
            C48322ei r22 = new C48322ei(r2.A02.A02);
            C48822fX A022 = AnonymousClass31S.A02(r5);
            if (A032) {
                synchronized (AnonymousClass324.A00) {
                    r0 = r22.A00(A022);
                }
            } else {
                r0 = r22.A00(A022);
            }
            AnonymousClass2KL r02 = new AnonymousClass2KL(r0.A04, 0);
            A012.close();
            return r02;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public List A0F(C54562ov r7) {
        DeviceJid A042 = AnonymousClass36G.A04(r7);
        if (A042 == null) {
            return Collections.singletonList(r7);
        }
        AnonymousClass2GC r2 = this.A0M;
        UserJid userJid = A042.userJid;
        C162457s7.A0J(userJid, 0);
        Set A072 = r2.A00.A07(userJid);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(C18310x6.A0T(it), A042.getDevice());
            C626936e.A0D(AnonymousClass000.A1W(fromUserJidAndDeviceIdNullable), "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable != null) {
                A0s.add(fromUserJidAndDeviceIdNullable);
            }
        }
        return AnonymousClass36G.A06(A0s);
    }

    public Map A0G(Set set) {
        ArrayList A0s;
        C54562ov r4;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C54562ov r1 = (C54562ov) it.next();
            A0t.put(r1, A0C(r1));
        }
        HashSet A15 = AnonymousClass0x9.A15(A0t.values());
        HashMap A0t2 = AnonymousClass001.A0t();
        C614730x r0 = this.A0K;
        Set A072 = r0.A07(A15);
        try {
            r0.A09(A072);
            Map A042 = this.A07.A04(A15);
            A0s = AnonymousClass001.A0s();
            Iterator A0u = AnonymousClass001.A0u(A0t);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                r4 = (C54562ov) A0w.getKey();
                byte[] bArr = (byte[]) A042.get(A0w.getValue());
                if (bArr != null) {
                    A0t2.put(r4, new C47932e4(AnonymousClass36G.A01(bArr)));
                }
                A0t2.put(r4, (Object) null);
            }
            if (!A0s.isEmpty()) {
                A0V(A0s);
            }
            C614730x.A02(A072);
            return A0t2;
        } catch (AnonymousClass23X e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("axolotl identity key for ");
            A0o.append(r4);
            C18260x0.A15(" decoded as invalid", A0o, e);
            A0s.add(r4);
        } catch (Throwable th) {
            C614730x.A02(A072);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|39|37|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r1.hasNext() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        A0B((X.C54562ov) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        return r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0H(java.util.List r15) {
        /*
            r14 = this;
            java.util.HashSet r13 = X.AnonymousClass002.A0K()
            X.2pw r10 = r14.A0G
            monitor-enter(r10)
            java.util.Set r9 = r10.A02(r15)     // Catch:{ all -> 0x008d }
            java.util.Set r12 = r10.A03(r15)     // Catch:{ all -> 0x008d }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0017
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return r9
        L_0x0017:
            r9.addAll(r12)     // Catch:{ all -> 0x008d }
            X.2ot r0 = r14.A0B     // Catch:{ all -> 0x008d }
            android.database.Cursor r11 = r0.A00(r12)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "record"
            int r8 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "recipient_id"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "recipient_type"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "device_id"
            int r5 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0081 }
        L_0x003b:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0065
            byte[] r4 = r11.getBlob(r8)     // Catch:{ all -> 0x0081 }
            long r0 = r11.getLong(r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            int r2 = r11.getInt(r6)     // Catch:{ all -> 0x0081 }
            int r1 = r11.getInt(r5)     // Catch:{ all -> 0x0081 }
            X.2ov r0 = new X.2ov     // Catch:{ all -> 0x0081 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0081 }
            X.C55182pw.A00(r10, r0, r4)     // Catch:{ IOException -> 0x0061 }
            r9.remove(r0)     // Catch:{ IOException -> 0x0061 }
            goto L_0x003b
        L_0x0061:
            r13.add(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x003b
        L_0x0065:
            r11.close()     // Catch:{ all -> 0x008d }
            r10.A05(r12)     // Catch:{ all -> 0x008d }
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            java.util.Iterator r1 = r13.iterator()
        L_0x0070:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r1.next()
            X.2ov r0 = (X.C54562ov) r0
            r14.A0B(r0)
            goto L_0x0070
        L_0x0080:
            return r9
        L_0x0081:
            r1 = move-exception
            if (r11 == 0) goto L_0x008c
            r11.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008d }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621133n.A0H(java.util.List):java.util.Set");
    }

    public void A0M(C47932e4 r3, C54562ov r4) {
        DeviceJid A042 = AnonymousClass36G.A04(r4);
        C56972sr r1 = this.A03;
        if (r1.A0b(A042)) {
            if (r1.A0Y()) {
                C626936e.A0B(r1.A0b(AnonymousClass36G.A04(r4)));
            } else {
                Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity as primary");
                return;
            }
        }
        A0N(r3, r4);
    }

    public final void A0N(C47932e4 r13, C54562ov r14) {
        C73523fe r4;
        byte[] bArr;
        C85284Fq A0C2;
        List<C54562ov> A0F2 = A0F(r14);
        HashSet A15 = AnonymousClass0x9.A15(A0F2);
        C614730x r0 = this.A0K;
        Set A072 = r0.A07(A15);
        try {
            r0.A09(A072);
            Map A0G2 = A0G(A15);
            C85284Fq A0C3 = this.A0L.A0C();
            try {
                C69833Yo Axl = A0C3.Axl();
                try {
                    for (C54562ov r6 : A0F2) {
                        C55372qF r7 = this.A07;
                        if (r13 != null) {
                            bArr = r13.A00.A00();
                        } else {
                            bArr = null;
                        }
                        A0C2 = r7.A04.A0C();
                        ContentValues A062 = AnonymousClass0x9.A06();
                        A062.put("recipient_id", r6.A02);
                        C18270x1.A0b(A062, "recipient_type", r6.A01);
                        C18270x1.A0b(A062, "device_id", r6.A00);
                        if (bArr != null) {
                            A062.put("public_key", bArr);
                        } else {
                            A062.putNull("public_key");
                        }
                        Long A002 = r7.A03.A00(r6, 2);
                        if (A002 != null) {
                            A062.put("recipient_lid_identifier", A002);
                        }
                        long A0B2 = AnonymousClass3H0.A02(A062, A0C2, "timestamp", C56612sH.A00(r7.A02)).A0B("identities", "SignalIdentityKeyStore/saveIdentity", A062);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("axolotl saved identity for ");
                        A0o.append(r6);
                        C18260x0.A12(" with resultant row id ", A0o, A0B2);
                        A0C2.close();
                    }
                    Axl.A00();
                    Log.i("axolotl saved identity completed successfully");
                    Axl.close();
                    A0C3.close();
                    Iterator A0q = AnonymousClass000.A0q(A0G2);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        DeviceJid A042 = AnonymousClass36G.A04((C54562ov) A0w.getKey());
                        C47932e4 r02 = (C47932e4) A0w.getValue();
                        if (A042 != null) {
                            if (r13 != null) {
                                if (r02 == null) {
                                    C28821hp r2 = this.A02;
                                    r4 = C614730x.A00(AnonymousClass36G.A03(A042.userJid), r2.A01);
                                    try {
                                        Iterator A032 = C61102zi.A03(r2);
                                        while (A032.hasNext()) {
                                            ((C84994En) A032.next()).BUO(A042);
                                        }
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                } else if (!r13.equals(r02)) {
                                    C28821hp r22 = this.A02;
                                    r4 = C614730x.A00(AnonymousClass36G.A03(A042.userJid), r22.A01);
                                    Iterator A033 = C61102zi.A03(r22);
                                    while (A033.hasNext()) {
                                        ((C84994En) A033.next()).BUP(A042);
                                    }
                                }
                                if (r4 != null) {
                                    r4.close();
                                }
                            } else if (r02 != null) {
                                this.A02.A08(A042);
                            }
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    Axl.close();
                    throw th2;
                }
                throw th;
            } catch (Throwable th3) {
                th = th3;
                try {
                    A0C3.close();
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
                throw th;
            }
        } finally {
            C614730x.A02(A072);
        }
    }

    public void A0O(C54562ov r10) {
        DeviceJid A042;
        List<C54562ov> A0F2 = A0F(r10);
        HashSet A15 = AnonymousClass0x9.A15(A0F2);
        C614730x r0 = this.A0K;
        Set A072 = r0.A07(A15);
        try {
            r0.A09(A072);
            C55372qF r02 = this.A07;
            Map A043 = r02.A04(A15);
            Map A032 = r02.A03(A0F2);
            for (C54562ov r4 : A0F2) {
                boolean z = true;
                boolean A1W = AnonymousClass000.A1W(A043.get(r4));
                boolean equals = Boolean.TRUE.equals(A032.get(r4));
                if (A1W && !equals) {
                    z = false;
                }
                C626936e.A0D(z, "identity key was available but was not deleted");
                if (A1W && equals && (A042 = AnonymousClass36G.A04(r4)) != null) {
                    this.A02.A08(A042);
                }
            }
        } finally {
            C614730x.A02(A072);
        }
    }

    public void A0S(C54422oh r8) {
        C85284Fq A0C2;
        C73523fe A012 = C614730x.A01(this, r8);
        try {
            String str = r8.A01;
            if (!C135156kD.A00.getRawString().equals(str)) {
                C18260x0.A0t("signalCoordinator/removefastratchetsenderkey/invalidgroupid ", str, AnonymousClass001.A0o());
            } else {
                A0C2 = this.A06.A02.A0C();
                ((AnonymousClass3H0) A0C2).A03.A07("fast_ratchet_sender_keys", "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?", "SignalFastRatchetSenderKeyStore/removeFastRatchetSenderKey", r8.A01());
                A0C2.close();
                C42112Mv r1 = this.A05;
                new AnonymousClass2US();
                r1.A00.A00();
            }
            A012.close();
            return;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0T(C54422oh r8, byte[] bArr) {
        C85284Fq A0C2;
        C73523fe A012 = C614730x.A01(this, r8);
        try {
            String str = r8.A01;
            if (!C135156kD.A00.getRawString().equals(str)) {
                C18260x0.A0t("signalCoordinator/savefastratchetsenderkey/invalidgroupid ", str, AnonymousClass001.A0o());
            } else {
                AnonymousClass2ZK r5 = this.A06;
                A0C2 = r5.A02.A0C();
                ContentValues A062 = AnonymousClass0x9.A06();
                A062.put("group_id", str);
                C54562ov r2 = r8.A00;
                A062.put("sender_id", r2.A02);
                C18270x1.A0b(A062, "sender_type", r2.A01);
                C18270x1.A0b(A062, "device_id", r2.A00);
                A062.put("record", bArr);
                Long A002 = r5.A01.A00(r2, 1);
                if (A002 != null) {
                    A062.put("sender_lid_identifier", A002);
                }
                ((AnonymousClass3H0) A0C2).A03.A0B("fast_ratchet_sender_keys", "SignalFastRatchetSenderKeyStore/saveFastRatchetSenderKey", A062);
                A0C2.close();
                C42112Mv r1 = this.A05;
                new AnonymousClass2US();
                r1.A00.A00();
            }
            A012.close();
            return;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0V(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.addAll(A0F((C54562ov) it.next()));
        }
        this.A07.A03(A0s);
    }
}
