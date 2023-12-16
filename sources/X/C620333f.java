package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.33f  reason: invalid class name and case insensitive filesystem */
public class C620333f {
    public final int A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C29411im A03;
    public final C64773Ex A04;
    public final C44382Vv A05;
    public final C56612sH A06;
    public final C56922sm A07;
    public final C56982ss A08;
    public final C66543Lv A09;
    public final C56892sj A0A;
    public final C50012hU A0B;
    public final C623334p A0C;
    public final C52352lL A0D;
    public final C51532jy A0E;
    public final C47992eA A0F;
    public final C72303dV A0G;
    public final C55422qK A0H;
    public final AnonymousClass2ZZ A0I;
    public final C47562dS A0J;
    public final AnonymousClass2SB A0K;
    public final C55072pk A0L;
    public final C618632o A0M;
    public final C50212ho A0N;
    public final C46972cV A0O;
    public final C66443Ll A0P;
    public final C49822h9 A0Q;
    public final C47202cs A0R;
    public final AnonymousClass1VX A0S;
    public final AnonymousClass33Y A0T;
    public final C49092fy A0U;
    public final C48192eV A0V;
    public final C42522Om A0W;
    public final C55832qz A0X;
    public final AnonymousClass4FS A0Y;
    public final List A0Z;
    public volatile AnonymousClass2HP A0a;

    @Deprecated
    public static C40682Hi A01(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String A0m;
        boolean z = false;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        String str2 = str;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        if (!(bArr == null || bArr2 == null)) {
            byte[] bArr6 = bArr3;
            if (!(bArr3 == null || str == null || userJid == null || userJid4 == null)) {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append(0);
                C18280x3.A0u(userJid4, A0l);
                byte[] A012 = C57512tl.A01(userJid3, userJid4, jniBridge, str2, "Poll Vote", bArr6, bArr5, A0l.toString().getBytes(C58152un.A0D), bArr4);
                if (A012 == null) {
                    A0m = "MessageAddOnPollVoteUtils/decryptPollVotePayload pollUpdateMessageContent is null";
                    Log.e(A0m);
                    return null;
                }
                try {
                    return C615331d.A01((AnonymousClass1A9) C130786cX.A05(AnonymousClass1A9.DEFAULT_INSTANCE, A012), list, i);
                } catch (AnonymousClass6u5 unused) {
                    Log.e("MessageAddOnPollVoteUtils/decryptPollVoteMessage: failed to parse payload into protobuf");
                    return null;
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageAddOnPollVoteUtils/decryptPollVotePayload one of the params is null messageSecret is null = ");
        A0o.append(AnonymousClass000.A1X(bArr4));
        A0o.append(" pollVoteEncPayload is null = ");
        A0o.append(AnonymousClass000.A1X(bArr5));
        A0o.append(" pollMessageId is null = ");
        A0o.append(AnonymousClass000.A1X(str));
        A0o.append(" pollMessageId is null = ");
        A0o.append(AnonymousClass000.A1X(str));
        A0o.append(" pollCreatorSenderJid is null = ");
        A0o.append(AnonymousClass000.A1X(userJid));
        A0o.append(" pollVoteSenderJid is null = ");
        if (userJid4 == null) {
            z = true;
        }
        A0m = C18300x5.A0m(A0o, z);
        Log.e(A0m);
        return null;
    }

    public byte A02(AnonymousClass2z0 r6) {
        Cursor A042;
        byte b = -1;
        AnonymousClass4GK A032 = this.A0G.get();
        try {
            A042 = this.A0P.A04(A032, r6);
            int columnIndexOrThrow = A042.getColumnIndexOrThrow("message_add_on_type");
            if (!A042.moveToNext()) {
                Log.w("MessageAddOnManager/getMessageAddOnForMessageKey message add on not found");
            } else {
                b = (byte) A042.getInt(columnIndexOrThrow);
            }
            A042.close();
            A032.close();
            return b;
        } catch (Throwable th) {
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

    public C624134x A05(AnonymousClass2z0 r3) {
        C30331mH A082;
        if (r3 == null || (A082 = A08(r3)) == null) {
            return null;
        }
        return C30331mH.A01(A082, this.A0X);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0060=Splitter:B:23:0x0060, B:27:0x0067=Splitter:B:27:0x0067} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30331mH A07(X.AnonymousClass2z0 r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0084
            X.4uZ r0 = r9.A00
            if (r0 == 0) goto L_0x0084
            X.3dV r0 = r8.A0G
            X.4GK r3 = r0.get()
            X.3Ll r6 = r8.A0P     // Catch:{ all -> 0x007a }
            android.database.Cursor r4 = r6.A04(r3, r9)     // Catch:{ all -> 0x007a }
            int r1 = X.AnonymousClass0x7.A02(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "message_add_on_type"
            int r5 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "MessageAddOnManager/getMessageAddOnForMessageKey message add on not found"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x006e }
            goto L_0x0067
        L_0x0029:
            long r1 = r4.getLong(r1)     // Catch:{ all -> 0x006e }
            int r0 = r4.getInt(r5)     // Catch:{ all -> 0x006e }
            byte r0 = (byte) r0     // Catch:{ all -> 0x006e }
            r4.close()     // Catch:{ all -> 0x007a }
            android.database.Cursor r4 = r6.A01(r3, r0, r1)     // Catch:{ all -> 0x007a }
            java.util.HashMap r1 = X.AnonymousClass26E.A00(r4, r0)     // Catch:{ all -> 0x006e }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0067
            X.1mH r2 = r6.A05(r4, r1)     // Catch:{ all -> 0x006e }
            if (r2 != 0) goto L_0x004f
            java.lang.String r0 = "MessageAddOnManager/getMessageAddOnForMessageKey failed to read fmessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006e }
            goto L_0x0067
        L_0x004f:
            X.34p r0 = r8.A0C     // Catch:{ all -> 0x006e }
            r2.A1y(r4, r0, r1)     // Catch:{ all -> 0x006e }
            boolean r0 = r2 instanceof X.C30591mh     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0060
            X.32o r1 = r8.A0M     // Catch:{ all -> 0x006e }
            r0 = r2
            X.1mh r0 = (X.C30591mh) r0     // Catch:{ all -> 0x006e }
            X.C30331mH.A02(r1, r0)     // Catch:{ all -> 0x006e }
        L_0x0060:
            r4.close()     // Catch:{ all -> 0x007a }
            r3.close()
            return r2
        L_0x0067:
            r4.close()     // Catch:{ all -> 0x007a }
            r3.close()
            return r7
        L_0x006e:
            r1 = move-exception
            if (r4 == 0) goto L_0x0079
            r4.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007a }
        L_0x0079:
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x007f }
            throw r1
        L_0x007f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0084:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620333f.A07(X.2z0):X.1mH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r7 = (X.C30451mT) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C624134x r11) {
        /*
            r10 = this;
            r3 = 1
            int r0 = r11.A08
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            r8 = 17
            if (r0 == 0) goto L_0x002d
            X.4FP r0 = r11.A0L
            if (r0 == 0) goto L_0x002d
            java.util.Collection r0 = r0.B4S()
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r2.next()
            X.1mH r1 = (X.C30331mH) r1
            r1.A1G(r8)
            r0 = 0
            r10.A03(r1, r0)
            goto L_0x0019
        L_0x002d:
            boolean r0 = r11 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0085
            r7 = r11
            X.1mT r7 = (X.C30451mT) r7
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x0085
            java.util.Iterator r9 = r0.iterator()
        L_0x003c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r6 = r9.next()
            X.1mH r6 = (X.C30331mH) r6
            r6.A1G(r8)
            r5 = r6
            X.1mh r5 = (X.C30591mh) r5
            java.util.List r1 = r5.A01
            java.util.List r4 = r7.A05
            if (r1 != 0) goto L_0x0058
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
        L_0x0058:
            int r0 = r1.size()
            if (r0 != 0) goto L_0x006e
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
        L_0x0062:
            java.util.List r0 = r5.A06
            r0.clear()
            r0.addAll(r1)
            r10.A03(r6, r3)
            goto L_0x003c
        L_0x006e:
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            java.util.Iterator r1 = r1.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            X.C18310x6.A1R(r2, r1)
            goto L_0x0076
        L_0x0080:
            java.util.List r1 = X.C615331d.A02(r4, r2)
            goto L_0x0062
        L_0x0085:
            boolean r0 = r11 instanceof X.C30461mU
            if (r0 == 0) goto L_0x00a6
            r0 = r11
            X.1mU r0 = (X.C30461mU) r0
            java.util.List r0 = r0.A1v()
            if (r0 == 0) goto L_0x00a6
            java.util.Iterator r1 = r0.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()
            X.1mH r0 = (X.C30331mH) r0
            r10.A03(r0, r3)
            goto L_0x0096
        L_0x00a6:
            boolean r0 = X.C624134x.A0d(r11)
            if (r0 == 0) goto L_0x00c6
            X.2ZZ r0 = r10.A0I
            android.util.Pair r0 = r0.A00(r11)
            int r0 = X.C18280x3.A03(r0)
            if (r0 == r3) goto L_0x00c6
            java.lang.String r0 = "MessageAddOnManager/Unable to insert message into msgstore.db.message_add_on"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2qk r3 = r10.A01
            r2 = 0
            r1 = 0
            java.lang.String r0 = "MessageAddOnManager/Unable to write FMessageEdit to DB"
            r3.A0A(r0, r1, r2)
        L_0x00c6:
            r1 = 4
            int r0 = r11.A08
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x00d9
            X.1md r1 = r11.A1S
            if (r1 == 0) goto L_0x00d9
            r0 = 0
            r10.A03(r1, r0)
        L_0x00d9:
            r1 = 8
            int r0 = r11.A08
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x00ed
            X.1me r1 = r11.A1T
            if (r1 == 0) goto L_0x00ed
            r0 = 0
            r10.A03(r1, r0)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620333f.A0D(X.34x):void");
    }

    public final void A0E(C30331mH r5) {
        C624134x A012;
        if (AnonymousClass0x9.A1A((byte) 67, new Byte[1], 0).contains(Byte.valueOf(r5.A1I))) {
            C55832qz r1 = this.A0X;
            AnonymousClass2z0 A1v = r5.A1v();
            if (A1v != null) {
                A012 = r1.A05(A1v);
            } else {
                A012 = C30331mH.A01(r5, r1);
            }
            if (A012 != null) {
                C18300x5.A16(this.A0B.A02, A012, 14, A00(r5));
            }
        }
    }

    public static final int A00(C30331mH r1) {
        int i;
        boolean z;
        if (r1 instanceof C30571mf) {
            i = 27;
        } else if (r1 instanceof C30551md) {
            i = 30;
        } else if (r1 instanceof C30561me) {
            i = 34;
        } else if (r1 instanceof C30591mh) {
            i = 32;
        } else if (r1 instanceof C30531mb) {
            i = 9;
        } else if (r1 instanceof C30581mg) {
            i = 37;
        } else {
            boolean z2 = r1 instanceof C30601mi;
            i = 41;
            if (!z2) {
                i = -1;
                z = false;
                C626936e.A0B(z);
                return i;
            }
        }
        z = true;
        C626936e.A0B(z);
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.1mT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.1mU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.1mT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.1mT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: X.2pk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.2ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.1mU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.1mU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: X.2Om} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: X.1mU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.1mU} */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.1nW, X.1mX, X.34x] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03cd A[Catch:{ all -> 0x0595, all -> 0x0ce6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0451 A[Catch:{ all -> 0x0595, all -> 0x0ce6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0454 A[Catch:{ all -> 0x0595, all -> 0x0ce6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x05a3 A[Catch:{ all -> 0x0595, all -> 0x0ce6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x067e A[SYNTHETIC, Splitter:B:428:0x067e] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x06a2 A[Catch:{ all -> 0x0714, all -> 0x0719, all -> 0x071e }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x084c A[SYNTHETIC, Splitter:B:523:0x084c] */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x088e A[Catch:{ all -> 0x09e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x08a5 A[SYNTHETIC, Splitter:B:545:0x08a5] */
    /* JADX WARNING: Removed duplicated region for block: B:938:0x0e47 A[Catch:{ all -> 0x0bc2, all -> 0x0ed7 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:932:0x0e30=Splitter:B:932:0x0e30, B:796:0x0c85=Splitter:B:796:0x0c85, B:437:0x06b6=Splitter:B:437:0x06b6, B:415:0x0657=Splitter:B:415:0x0657, B:722:0x0aec=Splitter:B:722:0x0aec, B:259:0x03dd=Splitter:B:259:0x03dd, B:367:0x05af=Splitter:B:367:0x05af, B:644:0x09ff=Splitter:B:644:0x09ff} */
    public final int A03(X.C30331mH r35, boolean r36) {
        /*
            r34 = this;
            r2 = r35
            r10 = 1
            r8 = 6
            r11 = r34
            if (r36 != 0) goto L_0x0024
            boolean r0 = r2 instanceof X.C30541mc
            if (r0 == 0) goto L_0x0024
            X.3Ll r0 = r11.A0P
            long r3 = r0.A00(r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn placeholder message stored"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return r10
        L_0x001e:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn placeholder message did not get stored"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x0024:
            X.2z0 r6 = r2.A1v()
            if (r6 != 0) goto L_0x0031
            java.lang.String r1 = "MessageAddOnManager/storeMessageAddOn parent key must be present"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return r8
        L_0x0031:
            X.2qz r4 = r11.A0X
            X.34x r3 = r4.A05(r6)
            if (r3 != 0) goto L_0x00bb
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x004f
            boolean r0 = r2 instanceof X.C30591mh
            if (r0 != 0) goto L_0x0045
            boolean r0 = r2 instanceof X.C30601mi
            if (r0 == 0) goto L_0x004f
        L_0x0045:
            X.4uZ r1 = r6.A00
            java.lang.String r0 = r6.A01
            X.34x r3 = X.C55832qz.A01(r1, r4, r0, r10)
            if (r3 != 0) goto L_0x00bb
        L_0x004f:
            boolean r0 = r2 instanceof X.C30581mg
            if (r0 == 0) goto L_0x00bb
            X.2qK r5 = r11.A0H
            java.lang.String r4 = r6.A01
            X.4uZ r1 = r6.A00
            r3 = 0
            if (r1 == 0) goto L_0x00bb
            r0 = 2
            java.lang.String[] r9 = X.C18300x5.A1a(r4, r0)
            X.2sm r0 = r5.A03
            X.C56922sm.A02(r0, r1, r9, r10)
            X.3dV r0 = r5.A05
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b3 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? "
            java.lang.String r0 = "ScheduledCallsStore/GET_SCHEDULED_CALL_MESSAGE"
            android.database.Cursor r4 = r4.A0E(r1, r0, r9)     // Catch:{ all -> 0x00b3 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00a3
            X.2i6 r5 = r5.A01(r4)     // Catch:{ all -> 0x00a7 }
            if (r5 == 0) goto L_0x00a3
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a7 }
            X.1nW r3 = new X.1nW     // Catch:{ all -> 0x00a7 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x00a7 }
            long r0 = r5.A02     // Catch:{ all -> 0x00a7 }
            r3.A1L = r0     // Catch:{ all -> 0x00a7 }
            com.whatsapp.jid.UserJid r0 = r5.A05     // Catch:{ all -> 0x00a7 }
            r3.A1J(r0)     // Catch:{ all -> 0x00a7 }
            long r0 = r5.A03     // Catch:{ all -> 0x00a7 }
            r3.A01 = r0     // Catch:{ all -> 0x00a7 }
            int r0 = r5.A00     // Catch:{ all -> 0x00a7 }
            r3.A00 = r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x00a7 }
            r3.A02 = r0     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            r4.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b8
        L_0x00a7:
            r1 = move-exception
            if (r4 == 0) goto L_0x00b2
            r4.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0ee6 }
            throw r1
        L_0x00b8:
            r7.close()
        L_0x00bb:
            r6 = 2
            if (r3 == 0) goto L_0x00cc
            boolean r0 = r2 instanceof X.C30591mh
            r17 = r0
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r2 instanceof X.C30601mi
            if (r0 == 0) goto L_0x0176
        L_0x00c8:
            boolean r0 = r3 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0176
        L_0x00cc:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message not found, storing orphan message add on"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = r2 instanceof X.C30551md
            if (r0 == 0) goto L_0x00e2
            X.2dS r4 = r11.A0J
            r3 = r2
            X.1md r3 = (X.C30551md) r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0 = 0
            r4.A00(r0, r3, r1, r1)
        L_0x00e2:
            X.2h9 r7 = r11.A0Q
            X.2z0 r4 = r2.A1J
            X.C162457s7.A0C(r4)
            X.4uZ r12 = r2.A0n()
            X.2z0 r15 = r2.A1v()
            X.4uZ r13 = X.C30331mH.A00(r2)
            long r0 = r2.A0K
            boolean r3 = r2 instanceof X.C30571mf
            if (r3 == 0) goto L_0x0133
            r3 = r2
            X.1mf r3 = (X.C30571mf) r3
            byte[] r5 = r3.A02
            if (r5 == 0) goto L_0x0133
        L_0x0102:
            boolean r2 = r2 instanceof X.C30561me
            if (r2 != 0) goto L_0x011b
            r18 = 0
        L_0x0108:
            r16 = 0
            X.2ns r11 = new X.2ns
            r17 = r5
            r19 = r10
            r20 = r0
            r14 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r0 = r7.A00(r11)
            return r0
        L_0x011b:
            X.1BY r2 = X.AnonymousClass1BY.DEFAULT_INSTANCE
            X.6c9 r8 = X.C18300x5.A0K(r2)
            X.6cX r6 = r8.A00
            X.1BY r6 = (X.AnonymousClass1BY) r6
            r3 = 2
            int r2 = r6.bitField0_
            r2 = r2 | 2
            r6.bitField0_ = r2
            r6.editVersion_ = r3
            byte[] r18 = X.C18290x4.A1Z(r8)
            goto L_0x0108
        L_0x0133:
            boolean r3 = r2 instanceof X.C30591mh
            if (r3 == 0) goto L_0x0149
            X.1VX r6 = r7.A03
            X.2vE r5 = X.C58422vE.A01
            r3 = 6772(0x1a74, float:9.49E-42)
            boolean r3 = r6.A0Y(r5, r3)
            if (r3 == 0) goto L_0x0149
            r3 = r2
            X.1mh r3 = (X.C30591mh) r3
            byte[] r5 = r3.A02
            goto L_0x0102
        L_0x0149:
            X.1A4 r6 = X.C18300x5.A0R()
            X.3Le r5 = r7.A04     // Catch:{ 24A -> 0x0165 }
            X.C18280x3.A12(r6)     // Catch:{ 24A -> 0x0165 }
            X.2cu r3 = new X.2cu     // Catch:{ 24A -> 0x0165 }
            r3.<init>(r6)     // Catch:{ 24A -> 0x0165 }
            r3.A02 = r10     // Catch:{ 24A -> 0x0165 }
            X.2pg r3 = r3.A01()     // Catch:{ 24A -> 0x0165 }
            r5.A01(r3, r2)     // Catch:{ 24A -> 0x0165 }
            byte[] r5 = X.C18290x4.A1Z(r6)
            goto L_0x0102
        L_0x0165:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanStore/getMessageAddOnOrphanData/failed to build protobuf message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid message addon: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r4, r0, r1)
            throw r0
        L_0x0176:
            boolean r1 = X.C627636p.A0l(r3)
            r5 = 7
            boolean r0 = r2 instanceof X.C30551md
            r16 = r0
            if (r1 == 0) goto L_0x019e
            if (r0 == 0) goto L_0x0198
            int r0 = r2.A0j()
            if (r0 == 0) goto L_0x01ce
            X.2dS r4 = r11.A0J
            X.1md r2 = (X.C30551md) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = X.C18290x4.A0a()
            r4.A00(r3, r2, r1, r0)
        L_0x0198:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is revoked, not storing orphan message add on"
        L_0x019a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r5
        L_0x019e:
            if (r0 != 0) goto L_0x01af
            X.2sH r0 = r11.A06
            long r0 = r0.A0H()
            boolean r0 = X.C627636p.A0u(r3, r0)
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is ephemerally expired, not storing orphan message add on"
            goto L_0x019a
        L_0x01af:
            if (r17 == 0) goto L_0x01b8
            boolean r0 = r3 instanceof X.C30451mT
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not poll message for poll vote add on"
            goto L_0x019a
        L_0x01b8:
            boolean r0 = r2 instanceof X.C30581mg
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r3 instanceof X.AnonymousClass1nW
            if (r0 != 0) goto L_0x01c3
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not scheduled call message for scheduled call edit add on"
            goto L_0x019a
        L_0x01c3:
            boolean r0 = r2 instanceof X.C30601mi
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r3 instanceof X.C30461mU
            if (r0 != 0) goto L_0x01ce
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not event message for event's response add on"
            goto L_0x019a
        L_0x01ce:
            long r0 = r3.A1L
            r2.A02 = r0
            X.2Vv r0 = r11.A05
            X.2fl r1 = r0.A00()
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            r22 = r0
            boolean r18 = r1.A01(r0)
            if (r18 == 0) goto L_0x01f0
            if (r36 != 0) goto L_0x01f0
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn considering message add on seen"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 17
            r2.A1G(r0)
        L_0x01f0:
            X.3dV r0 = r11.A0G
            X.4Fq r21 = r0.A04()
            X.3Yo r20 = r21.Axl()     // Catch:{ all -> 0x0ee1 }
            boolean r0 = r2 instanceof X.C30571mf     // Catch:{ all -> 0x0ed7 }
            r19 = r0
            if (r0 == 0) goto L_0x0303
            X.2ho r7 = r11.A0N     // Catch:{ all -> 0x0ed7 }
            r8 = r2
            X.1mf r8 = (X.C30571mf) r8     // Catch:{ all -> 0x0ed7 }
            monitor-enter(r7)     // Catch:{ all -> 0x0ed7 }
            X.4uZ r0 = r8.A0n()     // Catch:{ all -> 0x0aef }
            X.2z0 r12 = r8.A1J     // Catch:{ all -> 0x0aef }
            boolean r9 = r12.A02     // Catch:{ all -> 0x0aef }
            X.1mf r6 = r7.A00(r0, r3, r9)     // Catch:{ all -> 0x0aef }
            r10 = 17
            if (r6 != 0) goto L_0x027a
            X.2sM r1 = r7.A05     // Catch:{ all -> 0x0aef }
            com.whatsapp.jid.UserJid r0 = r8.A0o()     // Catch:{ all -> 0x0aef }
            com.whatsapp.jid.UserJid r0 = r1.A03(r0)     // Catch:{ all -> 0x0aef }
            X.1mf r6 = r7.A00(r0, r3, r9)     // Catch:{ all -> 0x0aef }
            if (r6 != 0) goto L_0x027a
            X.3dV r0 = r7.A04     // Catch:{ all -> 0x0aef }
            X.4Fq r4 = r0.A04()     // Catch:{ all -> 0x0aef }
            X.3Yo r6 = r4.Axl()     // Catch:{ all -> 0x0274 }
            if (r9 != 0) goto L_0x0243
            X.2z0 r0 = r3.A1J     // Catch:{ all -> 0x026a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x026a }
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x026a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x026a }
            if (r0 == 0) goto L_0x0243
        L_0x0240:
            r8.A1G(r10)     // Catch:{ all -> 0x026a }
        L_0x0243:
            X.3Ll r0 = r7.A07     // Catch:{ all -> 0x026a }
            long r0 = r0.A00(r8)     // Catch:{ all -> 0x026a }
            X.C58252ux.A00(r4, r8, r0)     // Catch:{ all -> 0x026a }
            r9 = -1
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x025a
            r6.close()     // Catch:{ all -> 0x0274 }
            r4.close()     // Catch:{ all -> 0x0aef }
            goto L_0x06b6
        L_0x025a:
            r6.A00()     // Catch:{ all -> 0x026a }
            r6.close()     // Catch:{ all -> 0x0274 }
            r4.close()     // Catch:{ all -> 0x0aef }
            r0 = 0
            r7.A01(r3, r0, r8)     // Catch:{ all -> 0x0aef }
            monitor-exit(r7)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0dfb
        L_0x026a:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x026f }
            goto L_0x0273
        L_0x026f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0274 }
        L_0x0273:
            throw r1     // Catch:{ all -> 0x0274 }
        L_0x0274:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0727
        L_0x027a:
            if (r36 == 0) goto L_0x0298
            java.lang.String r0 = "MessageAddOnReactionManager/adjustSenderClientTimestamp"
            X.C626936e.A0E(r9, r0)     // Catch:{ all -> 0x0aef }
            long r0 = r6.A00     // Catch:{ all -> 0x0aef }
            long r4 = r8.A00     // Catch:{ all -> 0x0aef }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0298
            r4 = 1
            long r0 = r0 + r4
            r8.A00 = r0     // Catch:{ all -> 0x0aef }
            X.2qk r5 = r7.A00     // Catch:{ all -> 0x0aef }
            r4 = 0
            r1 = 0
            java.lang.String r0 = "reaction_timestamp_adjustment"
            r5.A0A(r0, r1, r4)     // Catch:{ all -> 0x0aef }
        L_0x0298:
            long r4 = r6.A00     // Catch:{ all -> 0x0aef }
            long r0 = r8.A00     // Catch:{ all -> 0x0aef }
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0657
            X.3dV r0 = r7.A04     // Catch:{ SQLiteConstraintException -> 0x02f3 }
            X.4Fq r4 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x02f3 }
            X.3Yo r13 = r4.Axl()     // Catch:{ all -> 0x02e9 }
            long r0 = r6.A1L     // Catch:{ all -> 0x02df }
            X.3Ll r5 = r7.A07     // Catch:{ all -> 0x02df }
            r5.A08(r0)     // Catch:{ all -> 0x02df }
            if (r9 != 0) goto L_0x02c2
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x02df }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x02bf
            int r0 = r6.A0D     // Catch:{ all -> 0x02df }
            if (r0 != r10) goto L_0x02c2
        L_0x02bf:
            r8.A1G(r10)     // Catch:{ all -> 0x02df }
        L_0x02c2:
            long r0 = r5.A00(r8)     // Catch:{ all -> 0x02df }
            X.C58252ux.A00(r4, r8, r0)     // Catch:{ all -> 0x02df }
            r8.A1L = r0     // Catch:{ all -> 0x02df }
            r7.A01(r3, r6, r8)     // Catch:{ all -> 0x02df }
            r13.A00()     // Catch:{ all -> 0x02df }
            int r0 = r6.A0D     // Catch:{ all -> 0x02df }
            r8 = 2
            if (r0 != r10) goto L_0x02d7
            r8 = 3
        L_0x02d7:
            r13.close()     // Catch:{ all -> 0x02e9 }
            r4.close()     // Catch:{ SQLiteConstraintException -> 0x02f3 }
            goto L_0x0aec
        L_0x02df:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x02e4 }
            goto L_0x02e8
        L_0x02e4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e9 }
        L_0x02e8:
            throw r1     // Catch:{ all -> 0x02e9 }
        L_0x02e9:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x02ee }
            goto L_0x02f2
        L_0x02ee:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteConstraintException -> 0x02f3 }
        L_0x02f2:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x02f3 }
        L_0x02f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = "MessageAddOnReactionManager/storeFMessageReactionIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x0aef }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0aef }
            goto L_0x06b6
        L_0x0303:
            if (r16 == 0) goto L_0x05b2
            X.2dS r9 = r11.A0J     // Catch:{ all -> 0x0ed7 }
            r7 = r2
            X.1md r7 = (X.C30551md) r7     // Catch:{ all -> 0x0ed7 }
            monitor-enter(r9)     // Catch:{ all -> 0x0ed7 }
            X.3Ll r0 = r9.A0B     // Catch:{ all -> 0x0ce6 }
            r27 = r0
            r1 = 68
            X.1mH r6 = r0.A06(r3, r1)     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r6 instanceof X.C30551md     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x0325
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ce6 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/getMessageAddOnKeepInChatForParentMessage unexpected fmessage "
            X.C18260x0.A1Q(r1, r0, r6)     // Catch:{ all -> 0x0ce6 }
            r6 = 0
            goto L_0x03e0
        L_0x0325:
            X.1md r6 = (X.C30551md) r6     // Catch:{ all -> 0x0ce6 }
            if (r6 == 0) goto L_0x03e0
            long r4 = r6.A0K     // Catch:{ all -> 0x0ce6 }
            long r0 = r7.A0K     // Catch:{ all -> 0x0ce6 }
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x0348
            r12 = 2
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0378
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new messages' timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ce6 }
            long r4 = r6.A02     // Catch:{ all -> 0x0ce6 }
            long r0 = r7.A02     // Catch:{ all -> 0x0ce6 }
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0356
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current sender client timestamp is newer"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ce6 }
        L_0x0348:
            java.lang.Integer r1 = X.C18280x3.A0S()     // Catch:{ all -> 0x0ce6 }
            r0 = 5
        L_0x034d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0ce6 }
            r9.A00(r3, r7, r1, r0)     // Catch:{ all -> 0x0ce6 }
            goto L_0x03dd
        L_0x0356:
            if (r8 != 0) goto L_0x0378
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new sender client timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ce6 }
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0ce6 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0ce6 }
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x0ce6 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0ce6 }
            if (r1 != 0) goto L_0x036a
            if (r0 != 0) goto L_0x0378
            goto L_0x0372
        L_0x036a:
            if (r0 == 0) goto L_0x0372
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0ce6 }
            if (r0 > 0) goto L_0x0378
        L_0x0372:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0ce6 }
            r0 = 7
            goto L_0x034d
        L_0x0378:
            com.whatsapp.jid.UserJid r1 = r3.A0o()     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r0 = r7.A0o()     // Catch:{ all -> 0x0ce6 }
            if (r1 == 0) goto L_0x0388
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x0394
        L_0x0388:
            X.2z0 r0 = r3.A1J     // Catch:{ all -> 0x0ce6 }
            boolean r4 = r0.A02     // Catch:{ all -> 0x0ce6 }
            if (r4 == 0) goto L_0x03a1
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x03a1
        L_0x0394:
            java.lang.String r0 = "MessageAddOnKeepInChatManager/isKeepInChatAllowed parent & newKeepInChat from same user"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ce6 }
        L_0x0399:
            long r0 = r6.A1L     // Catch:{ all -> 0x0ce6 }
            r4 = r27
            r4.A08(r0)     // Catch:{ all -> 0x0ce6 }
            goto L_0x03e4
        L_0x03a1:
            int r0 = r6.A01     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x03bf
            com.whatsapp.jid.UserJid r1 = r3.A0o()     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r0 = r6.A0o()     // Catch:{ all -> 0x0ce6 }
            if (r1 == 0) goto L_0x03b5
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x03bd
        L_0x03b5:
            if (r4 == 0) goto L_0x03bf
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x03bf
        L_0x03bd:
            r4 = 1
            goto L_0x03c0
        L_0x03bf:
            r4 = 0
        L_0x03c0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ce6 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/isKeepInChatAllowed sender already un-kept: "
            X.C18260x0.A1D(r0, r1, r4)     // Catch:{ all -> 0x0ce6 }
            r0 = r4 ^ 1
            if (r0 != 0) goto L_0x0399
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0ce6 }
            java.lang.Integer r0 = X.C18290x4.A0b()     // Catch:{ all -> 0x0ce6 }
            r9.A00(r3, r7, r1, r0)     // Catch:{ all -> 0x0ce6 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/isKeepInChatAllowed: false"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0ce6 }
        L_0x03dd:
            monitor-exit(r9)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0d45
        L_0x03e0:
            int r0 = r3.A05     // Catch:{ all -> 0x0ce6 }
            if (r0 <= 0) goto L_0x05af
        L_0x03e4:
            if (r36 != 0) goto L_0x047d
            int r0 = r7.A01     // Catch:{ all -> 0x0ce6 }
            r14 = 1
            boolean r4 = X.AnonymousClass000.A1U(r0, r10)
            java.lang.Long r0 = r3.A0r     // Catch:{ all -> 0x0ce6 }
            X.2z0 r1 = r3.A1J     // Catch:{ all -> 0x0ce6 }
            X.4uZ r1 = r1.A00     // Catch:{ all -> 0x0ce6 }
            r26 = r1
            com.whatsapp.jid.GroupJid r13 = X.AnonymousClass32V.A00(r26)     // Catch:{ all -> 0x0ce6 }
            X.2sr r12 = r9.A00     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r25 = X.C627636p.A06(r12, r3)     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r8 = X.C627636p.A06(r12, r7)     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x0416
            if (r4 == 0) goto L_0x0418
            long r23 = r0.longValue()     // Catch:{ all -> 0x0ce6 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ce6 }
            int r0 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0437
            r4 = 4
            goto L_0x059b
        L_0x0416:
            if (r4 != 0) goto L_0x0437
        L_0x0418:
            X.1VX r15 = r9.A0C     // Catch:{ all -> 0x0ce6 }
            java.lang.Long r0 = r3.A0r     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x0437
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ce6 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0ce6 }
            long r23 = X.C18280x3.A08(r4, r0)     // Catch:{ all -> 0x0ce6 }
            r0 = 1698(0x6a2, float:2.38E-42)
            long r4 = X.C56952sp.A06(r15, r0)     // Catch:{ all -> 0x0ce6 }
            int r0 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0437
            r4 = 6
            goto L_0x059b
        L_0x0437:
            boolean r0 = X.C627336j.A0K(r26)     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x047d
            if (r13 == 0) goto L_0x047d
            X.3Ex r0 = r9.A01     // Catch:{ all -> 0x0ce6 }
            X.3ZH r4 = r0.A07(r13)     // Catch:{ all -> 0x0ce6 }
            X.1fJ r1 = X.AnonymousClass34R.A03(r13)     // Catch:{ all -> 0x0ce6 }
            X.2sj r5 = r9.A07     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r5.A0C(r13)     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x0454
            r4 = 2
            goto L_0x059b
        L_0x0454:
            r0 = r25
            boolean r0 = r5.A0E(r13, r0)     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x045f
            r4 = 3
            goto L_0x059b
        L_0x045f:
            if (r4 == 0) goto L_0x047d
            if (r8 == 0) goto L_0x047d
            if (r1 == 0) goto L_0x047d
            X.2sM r13 = r9.A09     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r5 = X.C627636p.A06(r12, r3)     // Catch:{ all -> 0x0ce6 }
            com.whatsapp.jid.UserJid r12 = X.C627636p.A06(r12, r7)     // Catch:{ all -> 0x0ce6 }
            int r0 = r3.A0j()     // Catch:{ all -> 0x0ce6 }
            if (r10 != r0) goto L_0x0484
            if (r5 == 0) goto L_0x0484
            boolean r0 = r13.A0B(r5, r12)     // Catch:{ all -> 0x0ce6 }
            if (r0 == 0) goto L_0x0484
        L_0x047d:
            X.3dV r0 = r9.A08     // Catch:{ all -> 0x0ce6 }
            X.4Fq r15 = r0.A04()     // Catch:{ all -> 0x0ce6 }
            goto L_0x04c3
        L_0x0484:
            X.2Qc r12 = r9.A0F     // Catch:{ all -> 0x0ce6 }
            X.2lX r5 = r12.A02     // Catch:{ all -> 0x0ce6 }
            X.2sj r0 = r12.A01     // Catch:{ all -> 0x0ce6 }
            boolean r15 = r0.A0E(r1, r8)     // Catch:{ all -> 0x0ce6 }
            boolean r13 = r0.A0I(r1, r8)     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r5.A00(r4)     // Catch:{ all -> 0x0ce6 }
            if (r15 == 0) goto L_0x049d
            if (r13 == 0) goto L_0x049d
            if (r0 != 0) goto L_0x049d
            goto L_0x047d
        L_0x049d:
            X.2hv r5 = r12.A03     // Catch:{ all -> 0x0ce6 }
            X.2sj r0 = r5.A05     // Catch:{ all -> 0x0ce6 }
            boolean r12 = r0.A0E(r1, r8)     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r0.A0I(r1, r8)     // Catch:{ all -> 0x0ce6 }
            if (r12 == 0) goto L_0x059a
            if (r0 != 0) goto L_0x04b1
            boolean r0 = r4.A14     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x059a
        L_0x04b1:
            X.2ss r0 = r5.A04     // Catch:{ all -> 0x0ce6 }
            int r1 = r0.A06(r1)     // Catch:{ all -> 0x0ce6 }
            r0 = 3
            if (r1 == r0) goto L_0x059a
            X.2lX r0 = r5.A07     // Catch:{ all -> 0x0ce6 }
            boolean r0 = r0.A00(r4)     // Catch:{ all -> 0x0ce6 }
            if (r0 != 0) goto L_0x059a
            goto L_0x047d
        L_0x04c3:
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x0590 }
            r4 = 0
            if (r6 == 0) goto L_0x04cb
            goto L_0x04cd
        L_0x04cb:
            r1 = 0
            goto L_0x04cf
        L_0x04cd:
            int r1 = r6.A00     // Catch:{ all -> 0x0586 }
        L_0x04cf:
            int r0 = r7.A01     // Catch:{ all -> 0x0586 }
            r8 = 1
            if (r0 != r10) goto L_0x04d5
            r4 = 1
        L_0x04d5:
            int r1 = r1 + r4
            r7.A00 = r1     // Catch:{ all -> 0x0586 }
            if (r36 == 0) goto L_0x04e9
            if (r6 == 0) goto L_0x04e9
            long r0 = r6.A02     // Catch:{ all -> 0x0586 }
            long r4 = r7.A02     // Catch:{ all -> 0x0586 }
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x04e9
            r4 = 1
            long r0 = r0 + r4
            r7.A02 = r0     // Catch:{ all -> 0x0586 }
        L_0x04e9:
            r0 = r27
            long r0 = r0.A00(r7)     // Catch:{ all -> 0x0586 }
            r12 = -1
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x050a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/storeFMessageKeepInChatIfNeeded duplicate addon message "
            java.lang.String r0 = X.AnonymousClass2z0.A07(r7, r0, r1)     // Catch:{ all -> 0x0586 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0586 }
            r14.close()     // Catch:{ all -> 0x0590 }
            r15.close()     // Catch:{ all -> 0x0ce6 }
            goto L_0x05af
        L_0x050a:
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0586 }
            java.lang.String r5 = "message_add_on_row_id"
            X.C18270x1.A0c(r4, r5, r0)     // Catch:{ all -> 0x0586 }
            int r0 = r7.A01     // Catch:{ all -> 0x0586 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "keep_in_chat_state"
            r4.put(r0, r1)     // Catch:{ all -> 0x0586 }
            long r0 = r7.A02     // Catch:{ all -> 0x0586 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "sender_timestamp"
            r4.put(r0, r1)     // Catch:{ all -> 0x0586 }
            int r0 = r7.A00     // Catch:{ all -> 0x0586 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "keep_count"
            r4.put(r0, r1)     // Catch:{ all -> 0x0586 }
            java.lang.Integer r1 = X.AnonymousClass0x7.A0f()     // Catch:{ all -> 0x0586 }
            java.lang.String r0 = "actor_device_jid_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0586 }
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0586 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0586 }
            java.lang.String r1 = "MessageAddOnKeepInChatStore/insertMessageAddOnKeepInChat"
            java.lang.String r0 = "message_add_on_keep_in_chat"
            r5.A09(r0, r1, r4)     // Catch:{ all -> 0x0586 }
            int r0 = r7.A01     // Catch:{ all -> 0x0586 }
            r3.A07 = r0     // Catch:{ all -> 0x0586 }
            r3.A1S = r7     // Catch:{ all -> 0x0586 }
            r3.A07 = r0     // Catch:{ all -> 0x0586 }
            X.313 r0 = r9.A05     // Catch:{ all -> 0x0586 }
            r0.A0B(r3)     // Catch:{ all -> 0x0586 }
            r1 = 4
            int r0 = r3.A08     // Catch:{ all -> 0x0586 }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0586 }
            if (r0 != 0) goto L_0x056a
            X.C624134x.A0K(r3, r1)     // Catch:{ all -> 0x0586 }
            X.3Lv r0 = r9.A04     // Catch:{ all -> 0x0586 }
            r0.A0X(r3)     // Catch:{ all -> 0x0586 }
        L_0x056a:
            X.3Lv r0 = r9.A04     // Catch:{ all -> 0x0586 }
            X.2pF r0 = r0.A0y     // Catch:{ all -> 0x0586 }
            r0.A02(r3)     // Catch:{ all -> 0x0586 }
            r14.A00()     // Catch:{ all -> 0x0586 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0586 }
            r9.A00(r3, r7, r0, r0)     // Catch:{ all -> 0x0586 }
            if (r6 == 0) goto L_0x057e
            r8 = 2
        L_0x057e:
            r14.close()     // Catch:{ all -> 0x0590 }
            r15.close()     // Catch:{ all -> 0x0ce6 }
            goto L_0x0e40
        L_0x0586:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x058b }
            goto L_0x058f
        L_0x058b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0590 }
        L_0x058f:
            throw r1     // Catch:{ all -> 0x0590 }
        L_0x0590:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0595 }
            goto L_0x0599
        L_0x0595:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ce6 }
        L_0x0599:
            throw r1     // Catch:{ all -> 0x0ce6 }
        L_0x059a:
            r4 = 7
        L_0x059b:
            java.lang.Integer r1 = X.C18280x3.A0S()     // Catch:{ all -> 0x0ce6 }
            int r0 = r7.A01     // Catch:{ all -> 0x0ce6 }
            if (r0 == r10) goto L_0x05a4
            r14 = 0
        L_0x05a4:
            int r0 = X.C106215Yb.A00(r4, r14)     // Catch:{ all -> 0x0ce6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0ce6 }
            r9.A00(r3, r7, r1, r0)     // Catch:{ all -> 0x0ce6 }
        L_0x05af:
            monitor-exit(r9)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0e3e
        L_0x05b2:
            boolean r0 = r2 instanceof X.C30561me     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0728
            X.2pk r7 = r11.A0L     // Catch:{ all -> 0x0ed7 }
            r8 = r2
            X.1me r8 = (X.C30561me) r8     // Catch:{ all -> 0x0ed7 }
            monitor-enter(r7)     // Catch:{ all -> 0x0ed7 }
            X.2z0 r9 = r8.A1J     // Catch:{ all -> 0x0aef }
            X.4uZ r13 = r9.A00     // Catch:{ all -> 0x0aef }
            if (r13 != 0) goto L_0x05c9
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage has null chatJid"
        L_0x05c4:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0aef }
            goto L_0x06b6
        L_0x05c9:
            boolean r0 = X.AnonymousClass2z0.A0E(r3, r13)     // Catch:{ all -> 0x0aef }
            if (r0 != 0) goto L_0x05d2
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage and parentMessage does not have same chatJid"
            goto L_0x05c4
        L_0x05d2:
            X.2hH r1 = r7.A07     // Catch:{ all -> 0x0aef }
            X.20e r0 = X.C369020e.PIN     // Catch:{ all -> 0x0aef }
            boolean r0 = r1.A01(r0, r3)     // Catch:{ all -> 0x0aef }
            if (r0 != 0) goto L_0x05fd
            X.66R r0 = r1.A04     // Catch:{ all -> 0x0aef }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0aef }
            X.2nS r0 = (X.C53662nS) r0     // Catch:{ all -> 0x0aef }
            byte r1 = r3.A1I     // Catch:{ all -> 0x0aef }
            X.48B r0 = r0.A02(r1)     // Catch:{ all -> 0x0aef }
            X.4G4 r0 = (X.AnonymousClass4G4) r0     // Catch:{ all -> 0x0aef }
            boolean r0 = r0.BsU(r3)     // Catch:{ all -> 0x0aef }
            if (r0 != 0) goto L_0x05fd
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat message type not pinnable:"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r4, r1)     // Catch:{ all -> 0x0aef }
            goto L_0x05c4
        L_0x05fd:
            X.3Ll r12 = r7.A06     // Catch:{ all -> 0x0aef }
            r0 = 79
            X.1mH r4 = r12.A06(r3, r0)     // Catch:{ all -> 0x0aef }
            r6 = 0
            if (r4 == 0) goto L_0x065a
            boolean r0 = r4 instanceof X.C30561me     // Catch:{ all -> 0x0aef }
            if (r0 != 0) goto L_0x0616
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = "MessageAddOnPinInChatManager/getMessageAddOnPinInChatForParentMessage Unexpected FMessage "
            X.C18260x0.A1Q(r1, r0, r4)     // Catch:{ all -> 0x0aef }
            goto L_0x065a
        L_0x0616:
            X.1me r4 = (X.C30561me) r4     // Catch:{ all -> 0x0aef }
            r6 = r4
            if (r4 == 0) goto L_0x065a
            if (r36 != 0) goto L_0x065c
            long r4 = r4.A03     // Catch:{ all -> 0x0aef }
            r23 = 0
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 > 0) goto L_0x0627
            long r4 = r6.A0K     // Catch:{ all -> 0x0aef }
        L_0x0627:
            long r0 = r8.A03     // Catch:{ all -> 0x0aef }
            int r14 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r14 > 0) goto L_0x062f
            long r0 = r8.A0K     // Catch:{ all -> 0x0aef }
        L_0x062f:
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0652
            if (r14 != 0) goto L_0x0672
            long r4 = r6.A01     // Catch:{ all -> 0x0aef }
            long r0 = r8.A01     // Catch:{ all -> 0x0aef }
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0652
            if (r14 != 0) goto L_0x0672
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0aef }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0aef }
            if (r1 != 0) goto L_0x064a
            if (r0 != 0) goto L_0x0652
            goto L_0x0672
        L_0x064a:
            if (r0 == 0) goto L_0x0672
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0aef }
            if (r0 <= 0) goto L_0x0672
        L_0x0652:
            java.lang.String r0 = "MessageAddOnPinInChatManager/storeFMessagePinInChatWithSystemMessageIfNeeded parent message has an existing newer pin add on"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0aef }
        L_0x0657:
            monitor-exit(r7)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0d45
        L_0x065a:
            if (r36 == 0) goto L_0x0672
        L_0x065c:
            if (r6 == 0) goto L_0x0672
            boolean r1 = r9.A02     // Catch:{ all -> 0x0aef }
            java.lang.String r0 = "MessageAddOnPinInChatManager/updateSenderTimestampIfNeeded"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x0aef }
            long r0 = r6.A01     // Catch:{ all -> 0x0aef }
            long r4 = r8.A01     // Catch:{ all -> 0x0aef }
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 < 0) goto L_0x0672
            r4 = 1
            long r0 = r0 + r4
            r8.A01 = r0     // Catch:{ all -> 0x0aef }
        L_0x0672:
            X.3dV r0 = r7.A04     // Catch:{ all -> 0x0aef }
            X.4Fq r25 = r0.A04()     // Catch:{ all -> 0x0aef }
            X.3Yo r15 = r25.Axl()     // Catch:{ all -> 0x071e }
            if (r6 == 0) goto L_0x0698
            long r0 = r6.A1L     // Catch:{ all -> 0x0714 }
            r12.A08(r0)     // Catch:{ all -> 0x0714 }
            r5 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ all -> 0x0714 }
            X.AnonymousClass0x2.A1S(r4, r5, r0)     // Catch:{ all -> 0x0714 }
            r0 = r25
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0714 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x0714 }
            java.lang.String r5 = "message_add_on_pin_in_chat"
            java.lang.String r1 = "MessageAddOnPinInChatStore/deleteMessageAddOnPinInChat"
            java.lang.String r0 = "message_add_on_row_id = ?"
            r14.A07(r5, r0, r1, r4)     // Catch:{ all -> 0x0714 }
        L_0x0698:
            long r0 = r12.A00(r8)     // Catch:{ all -> 0x0714 }
            r23 = -1
            int r4 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x06b9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "MessageAddOnPinInChatManager/storeFMessagePinInChatWithSystemMessageIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0714 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0714 }
            r15.close()     // Catch:{ all -> 0x071e }
            r25.close()     // Catch:{ all -> 0x0aef }
        L_0x06b6:
            monitor-exit(r7)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0e3e
        L_0x06b9:
            r4 = r25
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x0714 }
            X.2sg r5 = r4.A03     // Catch:{ all -> 0x0714 }
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0714 }
            java.lang.String r9 = "message_add_on_row_id"
            X.C18270x1.A0c(r4, r9, r0)     // Catch:{ all -> 0x0714 }
            int r0 = r8.A00     // Catch:{ all -> 0x0714 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "pin_in_chat_state"
            r4.put(r0, r1)     // Catch:{ all -> 0x0714 }
            long r0 = r8.A01     // Catch:{ all -> 0x0714 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "sender_timestamp"
            r4.put(r0, r1)     // Catch:{ all -> 0x0714 }
            java.lang.String r1 = "MessageAddOnPinInChatStore/insertMessageAddOnPinInChat"
            java.lang.String r0 = "message_add_on_pin_in_chat"
            r5.A09(r0, r1, r4)     // Catch:{ all -> 0x0714 }
            r7.A02(r15, r3, r8)     // Catch:{ all -> 0x0714 }
            r15.A00()     // Catch:{ all -> 0x0714 }
            if (r36 == 0) goto L_0x06f8
            X.2sr r0 = r7.A00     // Catch:{ all -> 0x0714 }
            boolean r0 = r0.A0a(r13)     // Catch:{ all -> 0x0714 }
            if (r0 != 0) goto L_0x06f8
            goto L_0x0708
        L_0x06f8:
            int r0 = r8.A00     // Catch:{ all -> 0x0714 }
            if (r0 != r10) goto L_0x0708
            if (r6 == 0) goto L_0x0705
            int r0 = r6.A00     // Catch:{ all -> 0x0714 }
            r8 = 9
            if (r0 != r10) goto L_0x070c
            goto L_0x070b
        L_0x0705:
            r8 = 8
            goto L_0x070c
        L_0x0708:
            r8 = 1
            if (r6 == 0) goto L_0x070c
        L_0x070b:
            r8 = 2
        L_0x070c:
            r15.close()     // Catch:{ all -> 0x071e }
            r25.close()     // Catch:{ all -> 0x0aef }
            goto L_0x0aec
        L_0x0714:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0719 }
            goto L_0x071d
        L_0x0719:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x071e }
        L_0x071d:
            throw r1     // Catch:{ all -> 0x071e }
        L_0x071e:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0727
        L_0x0723:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0aef }
        L_0x0727:
            throw r1     // Catch:{ all -> 0x0aef }
        L_0x0728:
            if (r17 == 0) goto L_0x0af3
            r6 = r3
            X.1mT r6 = (X.C30451mT) r6     // Catch:{ all -> 0x0ed7 }
            java.util.List r0 = r6.A04     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x073a
            r0 = 67
            java.util.List r0 = r11.A0B(r6, r0)     // Catch:{ all -> 0x0ed7 }
            r6.A1v(r0)     // Catch:{ all -> 0x0ed7 }
        L_0x073a:
            X.2lL r0 = r11.A0D     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r13 = r0.A01(r3)     // Catch:{ all -> 0x0ed7 }
            X.32o r5 = r11.A0M     // Catch:{ all -> 0x0ed7 }
            r4 = r2
            X.1mh r4 = (X.C30591mh) r4     // Catch:{ all -> 0x0ed7 }
            int r0 = r6.A00     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x09fe
            if (r36 != 0) goto L_0x07e9
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded decrypt"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2z0 r1 = r4.A1J     // Catch:{ all -> 0x0ed7 }
            X.4uZ r12 = r1.A00     // Catch:{ all -> 0x0ed7 }
            X.1VX r8 = r5.A0B     // Catch:{ all -> 0x0ed7 }
            X.2vE r7 = X.C58422vE.A01     // Catch:{ all -> 0x0ed7 }
            r0 = 6772(0x1a74, float:9.49E-42)
            boolean r0 = r8.A0Y(r7, r0)     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x07e9
            com.whatsapp.wamsys.JniBridge r0 = r5.A0D     // Catch:{ all -> 0x0ed7 }
            r25 = r0
            byte[] r15 = r6.A1a     // Catch:{ all -> 0x0ed7 }
            java.util.List r0 = r6.A05     // Catch:{ all -> 0x0ed7 }
            r27 = r0
            int r10 = r6.A01     // Catch:{ all -> 0x0ed7 }
            byte[] r9 = r4.A04     // Catch:{ all -> 0x0ed7 }
            byte[] r8 = r4.A03     // Catch:{ all -> 0x0ed7 }
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0ed7 }
            r26 = r0
            boolean r7 = r1.A02     // Catch:{ all -> 0x0ed7 }
            if (r7 == 0) goto L_0x07c8
            X.2sr r14 = r5.A01     // Catch:{ all -> 0x0ed7 }
            X.2ss r1 = r5.A02     // Catch:{ all -> 0x0ed7 }
            X.2sj r0 = r5.A04     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r0.A0B(r12)     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r24 = X.C615331d.A00(r14, r1, r12, r0)     // Catch:{ all -> 0x0ed7 }
        L_0x0788:
            r23 = r13
            r28 = r15
            r29 = r9
            r30 = r8
            r31 = r10
            X.2Hi r0 = A01(r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x07df
            X.2sM r0 = r5.A08     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r23 = r0.A03(r13)     // Catch:{ all -> 0x0ed7 }
            byte[] r10 = r6.A1a     // Catch:{ all -> 0x0ed7 }
            int r9 = r6.A01     // Catch:{ all -> 0x0ed7 }
            byte[] r8 = r4.A04     // Catch:{ all -> 0x0ed7 }
            byte[] r1 = r4.A03     // Catch:{ all -> 0x0ed7 }
            if (r7 == 0) goto L_0x07c3
            X.2sr r13 = r5.A01     // Catch:{ all -> 0x0ed7 }
            X.2ss r7 = r5.A02     // Catch:{ all -> 0x0ed7 }
            X.2sj r0 = r5.A04     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r0.A0B(r12)     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r24 = X.C615331d.A00(r13, r7, r12, r0)     // Catch:{ all -> 0x0ed7 }
        L_0x07b6:
            r28 = r10
            r29 = r8
            r30 = r1
            r31 = r9
            X.2Hi r0 = A01(r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0ed7 }
            goto L_0x07cd
        L_0x07c3:
            com.whatsapp.jid.UserJid r24 = r4.A0o()     // Catch:{ all -> 0x0ed7 }
            goto L_0x07b6
        L_0x07c8:
            com.whatsapp.jid.UserJid r24 = r4.A0o()     // Catch:{ all -> 0x0ed7 }
            goto L_0x0788
        L_0x07cd:
            if (r0 != 0) goto L_0x07df
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded decrypt pollVotePayload=null"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2xe r5 = r5.A0C     // Catch:{ all -> 0x0ed7 }
            r1 = 3
            r0 = 38
            r5.A02(r1, r0)     // Catch:{ all -> 0x0ed7 }
            r8 = 6
            goto L_0x09ff
        L_0x07df:
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x0ed7 }
            java.util.List r0 = r4.A06     // Catch:{ all -> 0x0ed7 }
            r0.clear()     // Catch:{ all -> 0x0ed7 }
            r0.addAll(r1)     // Catch:{ all -> 0x0ed7 }
        L_0x07e9:
            java.lang.Object r0 = r5.A0E     // Catch:{ all -> 0x0ed7 }
            r29 = r0
            monitor-enter(r29)     // Catch:{ all -> 0x0ed7 }
            X.4uZ r0 = r4.A0n()     // Catch:{ all -> 0x09fa }
            X.2z0 r12 = r4.A1J     // Catch:{ all -> 0x09fa }
            boolean r10 = r12.A02     // Catch:{ all -> 0x09fa }
            X.1mh r7 = r5.A02(r0, r6, r10)     // Catch:{ all -> 0x09fa }
            if (r7 != 0) goto L_0x0814
            X.4uZ r1 = r4.A0n()     // Catch:{ all -> 0x09fa }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x09fa }
            if (r0 == 0) goto L_0x083e
            X.2sM r0 = r5.A08     // Catch:{ all -> 0x09fa }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x09fa }
            com.whatsapp.jid.UserJid r0 = r0.A03(r1)     // Catch:{ all -> 0x09fa }
            if (r0 == 0) goto L_0x083e
            X.1mh r7 = r5.A02(r0, r6, r10)     // Catch:{ all -> 0x09fa }
            if (r7 == 0) goto L_0x083e
        L_0x0814:
            if (r36 == 0) goto L_0x0832
            java.lang.String r0 = "MessageAddOnPollVoteManager/adjustSenderClientTimestamp"
            X.C626936e.A0E(r10, r0)     // Catch:{ all -> 0x09fa }
            long r0 = r7.A00     // Catch:{ all -> 0x09fa }
            long r8 = r4.A00     // Catch:{ all -> 0x09fa }
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0832
            r8 = 1
            long r0 = r0 + r8
            r4.A00 = r0     // Catch:{ all -> 0x09fa }
            X.2qk r9 = r5.A00     // Catch:{ all -> 0x09fa }
            r8 = 0
            r1 = 0
            java.lang.String r0 = "poll_vote_timestamp_adjustment"
            r9.A0A(r0, r1, r8)     // Catch:{ all -> 0x09fa }
        L_0x0832:
            long r8 = r7.A00     // Catch:{ all -> 0x09fa }
            long r0 = r4.A00     // Catch:{ all -> 0x09fa }
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x083e
            monitor-exit(r29)     // Catch:{ all -> 0x09fa }
            r8 = 5
            goto L_0x09ff
        L_0x083e:
            X.3dV r0 = r5.A06     // Catch:{ all -> 0x09fa }
            r30 = r0
            X.4Fq r28 = r30.A04()     // Catch:{ all -> 0x09fa }
            X.3Yo r27 = r28.Axl()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0853
            long r0 = r7.A1L     // Catch:{ all -> 0x09e6 }
            X.3Ll r8 = r5.A0A     // Catch:{ all -> 0x09e6 }
            r8.A08(r0)     // Catch:{ all -> 0x09e6 }
        L_0x0853:
            if (r10 != 0) goto L_0x0882
            X.1VX r8 = r5.A0B     // Catch:{ all -> 0x09e6 }
            r1 = 3158(0xc56, float:4.425E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x09e6 }
            boolean r0 = r8.A0Y(r0, r1)     // Catch:{ all -> 0x09e6 }
            r1 = 17
            if (r0 == 0) goto L_0x087f
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x09e6 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x09e6 }
            if (r0 == 0) goto L_0x087f
            java.util.List r0 = r4.A06     // Catch:{ all -> 0x09e6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x09e6 }
            if (r0 != 0) goto L_0x087f
            if (r7 == 0) goto L_0x0882
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x09e6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x09e6 }
            if (r0 != 0) goto L_0x0882
            int r0 = r7.A0D     // Catch:{ all -> 0x09e6 }
            if (r0 != r1) goto L_0x0882
        L_0x087f:
            r4.A1G(r1)     // Catch:{ all -> 0x09e6 }
        L_0x0882:
            X.3Ll r0 = r5.A0A     // Catch:{ all -> 0x09e6 }
            long r0 = r0.A00(r4)     // Catch:{ all -> 0x09e6 }
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x08a5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09e6 }
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x09e6 }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x09e6 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x09e6 }
            r27.close()     // Catch:{ all -> 0x09f0 }
            r28.close()     // Catch:{ all -> 0x09fa }
            r8 = 7
            goto L_0x09c1
        L_0x08a5:
            r4.A1L = r0     // Catch:{ all -> 0x09e6 }
            X.3Yo r26 = r28.Axl()     // Catch:{ all -> 0x09e6 }
            android.content.ContentValues r12 = X.C18290x4.A0E()     // Catch:{ all -> 0x09dc }
            java.lang.String r25 = "message_add_on_row_id"
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x09dc }
            r8 = r25
            r12.put(r8, r13)     // Catch:{ all -> 0x09dc }
            java.lang.String r14 = "sender_timestamp"
            long r8 = r4.A00     // Catch:{ all -> 0x09dc }
            r10 = r28
            X.2sg r9 = X.AnonymousClass3H0.A02(r12, r10, r14, r8)     // Catch:{ all -> 0x09dc }
            java.lang.String r14 = "message_add_on_poll_vote"
            java.lang.String r8 = "MessageAddOnPollVoteStore/insertMessageAddOnPollVote"
            r10 = 0
            r9.A09(r14, r8, r12)     // Catch:{ all -> 0x09dc }
            X.3Yo r24 = r28.Axl()     // Catch:{ all -> 0x09dc }
            java.lang.String[] r12 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x09d2 }
            X.C18270x1.A1S(r12, r0)     // Catch:{ all -> 0x09d2 }
            java.lang.String r1 = "message_add_on_row_id = ?"
            java.lang.String r0 = "MessageAddOnPollVoteStore/deletePollVoteSelectedOptions"
            java.lang.String r15 = "message_add_on_poll_vote_selected_option"
            r9.A07(r15, r1, r0, r12)     // Catch:{ all -> 0x09d2 }
            java.util.List r12 = r4.A06     // Catch:{ all -> 0x09d2 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x09d2 }
            if (r0 != 0) goto L_0x090c
            java.util.Iterator r23 = r12.iterator()     // Catch:{ all -> 0x09d2 }
        L_0x08ed:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x09d2 }
            if (r0 == 0) goto L_0x090c
            java.lang.Object r14 = r23.next()     // Catch:{ all -> 0x09d2 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x09d2 }
            android.content.ContentValues r1 = X.C18280x3.A09()     // Catch:{ all -> 0x09d2 }
            r0 = r25
            r1.put(r0, r13)     // Catch:{ all -> 0x09d2 }
            java.lang.String r0 = "message_poll_option_id"
            r1.put(r0, r14)     // Catch:{ all -> 0x09d2 }
            r9.A09(r15, r8, r1)     // Catch:{ all -> 0x09d2 }
            goto L_0x08ed
        L_0x090c:
            r24.A00()     // Catch:{ all -> 0x09d2 }
            r24.close()     // Catch:{ all -> 0x09dc }
            r26.A00()     // Catch:{ all -> 0x09dc }
            r26.close()     // Catch:{ all -> 0x09e6 }
            java.util.List r0 = r6.A04     // Catch:{ all -> 0x09e6 }
            X.4Fq r24 = r30.A04()     // Catch:{ all -> 0x09e6 }
            X.3Yo r23 = r24.Axl()     // Catch:{ all -> 0x09cd }
            if (r0 != 0) goto L_0x0926
            r1 = 2
            goto L_0x0983
        L_0x0926:
            java.util.ArrayList r13 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x09c3 }
            if (r7 == 0) goto L_0x0970
            java.util.List r10 = r7.A06     // Catch:{ all -> 0x09c3 }
            java.util.Iterator r15 = r13.iterator()     // Catch:{ all -> 0x09c3 }
        L_0x0932:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x09c3 }
            if (r0 == 0) goto L_0x0970
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x09c3 }
            X.1mH r8 = (X.C30331mH) r8     // Catch:{ all -> 0x09c3 }
            X.2z0 r0 = r8.A1J     // Catch:{ all -> 0x09c3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x09c3 }
            if (r0 == 0) goto L_0x094b
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x09c3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x09c3 }
            if (r0 != 0) goto L_0x0965
            goto L_0x0932
        L_0x094b:
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x09c3 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x09c3 }
            if (r0 != 0) goto L_0x0932
            com.whatsapp.jid.UserJid r0 = r8.A0o()     // Catch:{ all -> 0x09c3 }
            if (r0 == 0) goto L_0x0932
            com.whatsapp.jid.UserJid r1 = r8.A0o()     // Catch:{ all -> 0x09c3 }
            com.whatsapp.jid.UserJid r0 = r7.A0o()     // Catch:{ all -> 0x09c3 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x09c3 }
            if (r0 == 0) goto L_0x0932
        L_0x0965:
            long r8 = r8.A02     // Catch:{ all -> 0x09c3 }
            long r0 = r7.A02     // Catch:{ all -> 0x09c3 }
            int r14 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0932
            r15.remove()     // Catch:{ all -> 0x09c3 }
        L_0x0970:
            r13.add(r4)     // Catch:{ all -> 0x09c3 }
            X.C618632o.A01(r6, r13, r12, r10)     // Catch:{ all -> 0x09c3 }
            X.2ow r0 = r5.A07     // Catch:{ all -> 0x09c3 }
            r0.A03(r6)     // Catch:{ all -> 0x09c3 }
            X.3Lv r0 = r5.A03     // Catch:{ all -> 0x09c3 }
            X.2pF r0 = r0.A0y     // Catch:{ all -> 0x09c3 }
            r0.A02(r6)     // Catch:{ all -> 0x09c3 }
            goto L_0x09a6
        L_0x0983:
            int r0 = r6.A08     // Catch:{ all -> 0x09c3 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x09c3 }
            if (r0 != 0) goto L_0x09a6
            java.util.ArrayList r0 = X.C18300x5.A0s(r4)     // Catch:{ all -> 0x09c3 }
            X.C618632o.A01(r6, r0, r12, r10)     // Catch:{ all -> 0x09c3 }
            X.C624134x.A0K(r6, r1)     // Catch:{ all -> 0x09c3 }
            X.3Lv r1 = r5.A03     // Catch:{ all -> 0x09c3 }
            r1.A0X(r6)     // Catch:{ all -> 0x09c3 }
            X.2ow r0 = r5.A07     // Catch:{ all -> 0x09c3 }
            r0.A03(r6)     // Catch:{ all -> 0x09c3 }
            X.2pF r0 = r1.A0y     // Catch:{ all -> 0x09c3 }
            r0.A02(r6)     // Catch:{ all -> 0x09c3 }
        L_0x09a6:
            r23.A00()     // Catch:{ all -> 0x09c3 }
            r23.close()     // Catch:{ all -> 0x09cd }
            r24.close()     // Catch:{ all -> 0x09e6 }
            r27.A00()     // Catch:{ all -> 0x09e6 }
            r27.close()     // Catch:{ all -> 0x09f0 }
            r28.close()     // Catch:{ all -> 0x09fa }
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded successful"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x09fa }
            r8 = 2
            if (r7 != 0) goto L_0x09c1
            r8 = 1
        L_0x09c1:
            monitor-exit(r29)     // Catch:{ all -> 0x09fa }
            goto L_0x09ff
        L_0x09c3:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x09c8 }
            goto L_0x09cc
        L_0x09c8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09cd }
        L_0x09cc:
            throw r1     // Catch:{ all -> 0x09cd }
        L_0x09cd:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x09e1 }
            goto L_0x09e5
        L_0x09d2:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x09d7 }
            goto L_0x09db
        L_0x09d7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09dc }
        L_0x09db:
            throw r1     // Catch:{ all -> 0x09dc }
        L_0x09dc:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x09e1 }
            goto L_0x09e5
        L_0x09e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09e6 }
        L_0x09e5:
            throw r1     // Catch:{ all -> 0x09e6 }
        L_0x09e6:
            r1 = move-exception
            r27.close()     // Catch:{ all -> 0x09eb }
            goto L_0x09ef
        L_0x09eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09f0 }
        L_0x09ef:
            throw r1     // Catch:{ all -> 0x09f0 }
        L_0x09f0:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x09f5 }
            goto L_0x09f9
        L_0x09f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09fa }
        L_0x09f9:
            throw r1     // Catch:{ all -> 0x09fa }
        L_0x09fa:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x09fa }
            goto L_0x0ce8
        L_0x09fe:
            r8 = 7
        L_0x09ff:
            X.C618632o.A00(r6, r4)     // Catch:{ all -> 0x0ed7 }
            X.2Om r7 = r11.A0W     // Catch:{ all -> 0x0ed7 }
            monitor-enter(r7)     // Catch:{ all -> 0x0ed7 }
            long r0 = r6.A02     // Catch:{ all -> 0x0aef }
            boolean r5 = r7.A02     // Catch:{ all -> 0x0aef }
            if (r5 == 0) goto L_0x0aec
            X.2z0 r5 = r6.A1J     // Catch:{ all -> 0x0aef }
            boolean r9 = r5.A02     // Catch:{ all -> 0x0aef }
            if (r9 == 0) goto L_0x0aec
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0aec
            r10 = 2
            r9 = 1
            if (r8 == r9) goto L_0x0a1f
            if (r8 == r10) goto L_0x0a1f
            goto L_0x0aec
        L_0x0a1f:
            java.util.List r4 = r4.A06     // Catch:{ all -> 0x0aef }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0aef }
            if (r4 != 0) goto L_0x0a32
            if (r8 != r9) goto L_0x0a31
            X.2W9 r9 = r7.A01     // Catch:{ all -> 0x0aef }
            r4 = 4
            r9.A00(r4, r0)     // Catch:{ all -> 0x0aef }
            r10 = 0
            goto L_0x0a32
        L_0x0a31:
            r10 = 1
        L_0x0a32:
            X.2W9 r9 = r7.A01     // Catch:{ all -> 0x0aef }
            boolean r0 = r9.A00(r10, r0)     // Catch:{ all -> 0x0aef }
            if (r0 != 0) goto L_0x0aec
            monitor-enter(r7)     // Catch:{ all -> 0x0aef }
            X.4uZ r13 = r5.A00     // Catch:{ all -> 0x0ae9 }
            long r4 = r6.A0K     // Catch:{ all -> 0x0ae9 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r4 % r0
            long r24 = X.C18280x3.A08(r4, r0)     // Catch:{ all -> 0x0ae9 }
            java.util.List r0 = r6.A04     // Catch:{ all -> 0x0ae9 }
            if (r0 != 0) goto L_0x0a4e
            r12 = 0
            goto L_0x0a52
        L_0x0a4e:
            int r12 = r0.size()     // Catch:{ all -> 0x0ae9 }
        L_0x0a52:
            java.util.List r0 = r6.A05     // Catch:{ all -> 0x0ae9 }
            int r23 = r0.size()     // Catch:{ all -> 0x0ae9 }
            long r0 = r6.A02     // Catch:{ all -> 0x0ae9 }
            boolean r6 = X.C627336j.A0K(r13)     // Catch:{ all -> 0x0ae9 }
            if (r6 == 0) goto L_0x0a70
            X.2sj r4 = r7.A00     // Catch:{ all -> 0x0ae9 }
            X.1fJ r13 = (X.C27991fJ) r13     // Catch:{ all -> 0x0ae9 }
            X.33h r4 = r4.A09     // Catch:{ all -> 0x0ae9 }
            int r4 = r4.A03(r13)     // Catch:{ all -> 0x0ae9 }
            int r13 = X.AnonymousClass36M.A04(r4)     // Catch:{ all -> 0x0ae9 }
        L_0x0a6e:
            monitor-enter(r9)     // Catch:{ all -> 0x0ae9 }
            goto L_0x0a72
        L_0x0a70:
            r13 = 0
            goto L_0x0a6e
        L_0x0a72:
            if (r10 == 0) goto L_0x0a7c
            r4 = 1
            if (r10 == r4) goto L_0x0a78
            goto L_0x0a80
        L_0x0a78:
            java.lang.String r10 = "poll_votes_changed"
            goto L_0x0a83
        L_0x0a7c:
            java.lang.String r10 = "poll_votes"
            goto L_0x0a83
        L_0x0a80:
            java.lang.String r10 = "poll_vote_deletes"
        L_0x0a83:
            X.1RF r4 = r9.A00     // Catch:{ all -> 0x0ae6 }
            X.4Fq r5 = r4.A0C()     // Catch:{ all -> 0x0ae6 }
            X.3Yo r15 = r5.Axl()     // Catch:{ all -> 0x0adc }
            r4 = 6
            android.content.ContentValues r4 = X.AnonymousClass0x9.A07(r4)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r14 = "poll_id"
            X.C18270x1.A0c(r4, r14, r0)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r1 = "option_count"
            r0 = r23
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r14 = "poll_creation_ds"
            r0 = r24
            X.C18270x1.A0c(r4, r14, r0)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r0 = "users_participated"
            X.C18270x1.A0b(r4, r0, r12)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r0 = "is_a_group_flag"
            X.AnonymousClass0x2.A0o(r4, r0, r6)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r0 = "group_size_bucket"
            X.C18270x1.A0b(r4, r0, r13)     // Catch:{ all -> 0x0ad2 }
            r0 = 1
            X.2sg r6 = X.AnonymousClass3H0.A01(r4, r5, r10, r0)     // Catch:{ all -> 0x0ad2 }
            java.lang.String r1 = "poll_event_logging"
            java.lang.String r0 = "update_poll_action"
            r6.A08(r1, r0, r4)     // Catch:{ all -> 0x0ad2 }
            r15.A00()     // Catch:{ all -> 0x0ad2 }
            r15.close()     // Catch:{ all -> 0x0adc }
            r5.close()     // Catch:{ all -> 0x0ae6 }
            monitor-exit(r9)     // Catch:{ all -> 0x0ae9 }
            monitor-exit(r7)     // Catch:{ all -> 0x0aef }
            goto L_0x0aec
        L_0x0ad2:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0ad7 }
            goto L_0x0adb
        L_0x0ad7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0adc }
        L_0x0adb:
            throw r1     // Catch:{ all -> 0x0adc }
        L_0x0adc:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0ae1 }
            goto L_0x0ae5
        L_0x0ae1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ae6 }
        L_0x0ae5:
            throw r1     // Catch:{ all -> 0x0ae6 }
        L_0x0ae6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0ae9 }
            throw r0     // Catch:{ all -> 0x0ae9 }
        L_0x0ae9:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0aef }
            throw r0     // Catch:{ all -> 0x0aef }
        L_0x0aec:
            monitor-exit(r7)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0e41
        L_0x0aef:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0ce8
        L_0x0af3:
            boolean r0 = r2 instanceof X.C30531mb     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0b15
            X.2ZZ r0 = r11.A0I     // Catch:{ all -> 0x0ed7 }
            android.util.Pair r5 = r0.A00(r3)     // Catch:{ all -> 0x0ed7 }
            java.lang.Object r0 = r5.first     // Catch:{ all -> 0x0ed7 }
            int r8 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x0ed7 }
            long r0 = r2.A1L     // Catch:{ all -> 0x0ed7 }
            r6 = -1
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0e41
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0ed7 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0ed7 }
            r2.A1L = r0     // Catch:{ all -> 0x0ed7 }
            goto L_0x0e41
        L_0x0b15:
            boolean r0 = r2 instanceof X.C30581mg     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0bc7
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn storing FMessageScheduledCallEdit"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2cV r7 = r11.A0O     // Catch:{ all -> 0x0ed7 }
            r6 = r3
            X.1nW r6 = (X.AnonymousClass1nW) r6     // Catch:{ all -> 0x0ed7 }
            r5 = r2
            X.1mg r5 = (X.C30581mg) r5     // Catch:{ all -> 0x0ed7 }
            X.3Ll r8 = r7.A05     // Catch:{ all -> 0x0ed7 }
            r0 = 86
            X.1mH r4 = r8.A06(r6, r0)     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r4 instanceof X.C30581mg     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x0b42
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = "MessageAddOnScheduledCallEditManager/getMessageAddOnScheduledCallEditForParentMessage no existing add on fmessage "
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ all -> 0x0ed7 }
        L_0x0b3b:
            X.3dV r0 = r7.A03     // Catch:{ all -> 0x0ed7 }
            X.4Fq r10 = r0.A04()     // Catch:{ all -> 0x0ed7 }
            goto L_0x0b52
        L_0x0b42:
            X.1mg r4 = (X.C30581mg) r4     // Catch:{ all -> 0x0ed7 }
            if (r4 == 0) goto L_0x0b3b
            java.lang.String r0 = "MessageAddOnScheduledCallEditManager/storeFMessageIfNeeded parent message has an existing scheduled call edit add on"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0ed7 }
            r7.A00(r0, r5)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0d45
        L_0x0b52:
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x0bbd }
            long r0 = r8.A00(r5)     // Catch:{ all -> 0x0bb3 }
            android.content.ContentValues r4 = X.C18280x3.A09()     // Catch:{ all -> 0x0bb3 }
            java.lang.String r8 = "message_add_on_row_id"
            X.C18270x1.A0c(r4, r8, r0)     // Catch:{ all -> 0x0bb3 }
            int r0 = r5.A00     // Catch:{ all -> 0x0bb3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0bb3 }
            java.lang.String r0 = "edit_type"
            r4.put(r0, r1)     // Catch:{ all -> 0x0bb3 }
            int r0 = r5.A01     // Catch:{ all -> 0x0bb3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0bb3 }
            java.lang.String r0 = "message_edit_version"
            r4.put(r0, r1)     // Catch:{ all -> 0x0bb3 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0bb3 }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x0bb3 }
            java.lang.String r1 = "MessageAddOnScheduledCallEditStore/insertMessage"
            java.lang.String r0 = "message_add_on_scheduled_call_edit"
            r8.A09(r0, r1, r4)     // Catch:{ all -> 0x0bb3 }
            r6.A00 = r5     // Catch:{ all -> 0x0bb3 }
            r1 = 16
            int r0 = r6.A08     // Catch:{ all -> 0x0bb3 }
            r0 = r0 & 16
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0bb3 }
            if (r0 != 0) goto L_0x0b9b
            X.C624134x.A0K(r6, r1)     // Catch:{ all -> 0x0bb3 }
            X.3Lv r0 = r7.A02     // Catch:{ all -> 0x0bb3 }
            r0.A0X(r6)     // Catch:{ all -> 0x0bb3 }
        L_0x0b9b:
            X.3Lv r0 = r7.A02     // Catch:{ all -> 0x0bb3 }
            X.2pF r0 = r0.A0y     // Catch:{ all -> 0x0bb3 }
            r0.A02(r6)     // Catch:{ all -> 0x0bb3 }
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x0bb3 }
            r7.A00(r0, r5)     // Catch:{ all -> 0x0bb3 }
            r9.A00()     // Catch:{ all -> 0x0bb3 }
            r8 = 1
            r9.close()     // Catch:{ all -> 0x0bbd }
            r10.close()     // Catch:{ all -> 0x0ed7 }
            goto L_0x0e41
        L_0x0bb3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0bb8 }
            goto L_0x0bbc
        L_0x0bb8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0bbd }
        L_0x0bbc:
            throw r1     // Catch:{ all -> 0x0bbd }
        L_0x0bbd:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0bc2 }
            goto L_0x0bc6
        L_0x0bc2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ed7 }
        L_0x0bc6:
            throw r1     // Catch:{ all -> 0x0ed7 }
        L_0x0bc7:
            boolean r0 = r2 instanceof X.C30601mi     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0e41
            X.2cs r6 = r11.A0R     // Catch:{ all -> 0x0ed7 }
            r5 = r3
            X.1mU r5 = (X.C30461mU) r5     // Catch:{ all -> 0x0ed7 }
            r4 = r2
            X.1mi r4 = (X.C30601mi) r4     // Catch:{ all -> 0x0ed7 }
            X.2sr r0 = r11.A02     // Catch:{ all -> 0x0ed7 }
            r33 = r0
            r0 = 0
            X.C162457s7.A0J(r5, r0)     // Catch:{ all -> 0x0ed7 }
            X.C162457s7.A0J(r4, r10)     // Catch:{ all -> 0x0ed7 }
            r8 = 3
            r0 = r33
            X.C162457s7.A0J(r0, r8)     // Catch:{ all -> 0x0ed7 }
            if (r36 != 0) goto L_0x0cf7
            java.lang.String r0 = "EventResponseMessageManager/storeFMessageEventResponseIfNeeded decrypt"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2RB r9 = r6.A07     // Catch:{ all -> 0x0ed7 }
            r7 = 0
            X.2z0 r0 = r4.A1J     // Catch:{ all -> 0x0ed7 }
            X.4uZ r13 = r0.A00     // Catch:{ all -> 0x0ed7 }
            if (r13 != 0) goto L_0x0c07
            java.lang.String r0 = "FMessageEventResponsePayloadProtobuf/decryptEventResponsePayload chatJid is null"
        L_0x0bf6:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = "EventResponseMessageManager/storeFMessageEventResponseIfNeeded decryption failed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0ed7 }
            X.2xe r1 = r6.A08     // Catch:{ all -> 0x0ed7 }
            r0 = 59
            r1.A02(r8, r0)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0d8c
        L_0x0c07:
            X.2lL r1 = r9.A03     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r24 = r1.A01(r5)     // Catch:{ all -> 0x0ed7 }
            byte[] r15 = r5.A1a     // Catch:{ all -> 0x0ed7 }
            byte[] r14 = r4.A03     // Catch:{ all -> 0x0ed7 }
            byte[] r1 = r4.A02     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0c39
            X.2sr r0 = r9.A00     // Catch:{ all -> 0x0ed7 }
            r25 = r0
            X.2ss r12 = r9.A01     // Catch:{ all -> 0x0ed7 }
            X.2sj r0 = r9.A02     // Catch:{ all -> 0x0ed7 }
            boolean r23 = r0.A0B(r13)     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r13)     // Catch:{ all -> 0x0ed7 }
            int r0 = r12.A06(r0)     // Catch:{ all -> 0x0ed7 }
            if (r0 == r8) goto L_0x0c34
            if (r23 != 0) goto L_0x0c34
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r25)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0c3d
        L_0x0c34:
            X.1fH r0 = r25.A0H()     // Catch:{ all -> 0x0ed7 }
            goto L_0x0c3d
        L_0x0c39:
            com.whatsapp.jid.UserJid r0 = r4.A0o()     // Catch:{ all -> 0x0ed7 }
        L_0x0c3d:
            r12 = 1
            if (r15 == 0) goto L_0x0c85
            if (r14 == 0) goto L_0x0c85
            if (r1 == 0) goto L_0x0c85
            if (r0 == 0) goto L_0x0c85
            if (r24 == 0) goto L_0x0c85
            java.lang.String r27 = X.AnonymousClass2z0.A06(r5)     // Catch:{ all -> 0x0ed7 }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r27)     // Catch:{ all -> 0x0ed7 }
            r12.append(r7)     // Catch:{ all -> 0x0ed7 }
            X.C18280x3.A0u(r0, r12)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0ed7 }
            byte[] r31 = X.C18290x4.A1b(r12)     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.wamsys.JniBridge r9 = r9.A04     // Catch:{ all -> 0x0ed7 }
            java.lang.String r28 = "Event Response"
            r25 = r0
            r26 = r9
            r29 = r1
            r30 = r14
            r32 = r15
            byte[] r1 = X.C57512tl.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0ed7 }
            if (r1 != 0) goto L_0x0c75
            java.lang.String r0 = "EventResponseMessageManager/decryptEventMessageResponsePayload eventResponseMessageBytes is null"
            goto L_0x0bf6
        L_0x0c75:
            X.1BE r0 = X.AnonymousClass1BE.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0c81 }
            X.6cX r1 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0c81 }
            X.1BE r1 = (X.AnonymousClass1BE) r1     // Catch:{ 6u5 -> 0x0c81 }
            X.C162457s7.A0D(r1)     // Catch:{ 6u5 -> 0x0c81 }
            goto L_0x0cc4
        L_0x0c81:
            java.lang.String r0 = "EventResponseMessageManager/decryptEventResponseMessage: failed to parse payload into protobuf"
            goto L_0x0bf6
        L_0x0c85:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ed7 }
            java.lang.String r1 = "\n        FMessageEventResponsePayloadProtobuf/decryptEventResponsePayload one of the params is null:\n        messageSecret is null = "
            r4.append(r1)     // Catch:{ all -> 0x0ed7 }
            boolean r1 = X.AnonymousClass000.A1X(r15)
            r4.append(r1)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r1 = "\n         eventResponseEncPayload is null = "
            r4.append(r1)     // Catch:{ all -> 0x0ed7 }
            boolean r1 = X.AnonymousClass000.A1X(r14)
            r4.append(r1)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r1 = "\n         eventResponseSenderJid is null = "
            r4.append(r1)     // Catch:{ all -> 0x0ed7 }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r4.append(r0)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = "\n         parentMessageSenderJid is null = "
            r4.append(r0)     // Catch:{ all -> 0x0ed7 }
            if (r24 == 0) goto L_0x0cb5
            r12 = 0
        L_0x0cb5:
            r4.append(r12)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = ")\n      "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = X.C830345w.A08(r0)     // Catch:{ all -> 0x0ed7 }
            goto L_0x0bf6
        L_0x0cc4:
            int r8 = r1.response_     // Catch:{ all -> 0x0ed7 }
            if (r8 == 0) goto L_0x0cd0
            if (r8 == r10) goto L_0x0cd3
            r0 = 2
            if (r8 != r0) goto L_0x0cd0
            X.22i r0 = X.C373922i.NOT_GOING     // Catch:{ all -> 0x0ed7 }
            goto L_0x0cd5
        L_0x0cd0:
            X.22i r0 = X.C373922i.UNKNOWN     // Catch:{ all -> 0x0ed7 }
            goto L_0x0cd5
        L_0x0cd3:
            X.22i r0 = X.C373922i.GOING     // Catch:{ all -> 0x0ed7 }
        L_0x0cd5:
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0ed7 }
            if (r0 == r10) goto L_0x0cec
            r8 = 2
            if (r0 == r8) goto L_0x0ce9
            if (r0 != r7) goto L_0x0ce1
            goto L_0x0cef
        L_0x0ce1:
            X.3f1 r0 = X.C73153f1.A00()     // Catch:{ all -> 0x0ed7 }
            goto L_0x0ce8
        L_0x0ce6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0ed7 }
        L_0x0ce8:
            throw r0     // Catch:{ all -> 0x0ed7 }
        L_0x0ce9:
            X.21m r0 = X.C372421m.NOT_GOING     // Catch:{ all -> 0x0ed7 }
            goto L_0x0cf1
        L_0x0cec:
            X.21m r0 = X.C372421m.GOING     // Catch:{ all -> 0x0ed7 }
            goto L_0x0cf1
        L_0x0cef:
            X.21m r0 = X.C372421m.UNKNOWN     // Catch:{ all -> 0x0ed7 }
        L_0x0cf1:
            r4.A01 = r0     // Catch:{ all -> 0x0ed7 }
            long r0 = r1.timestampMs_     // Catch:{ all -> 0x0ed7 }
            r4.A00 = r0     // Catch:{ all -> 0x0ed7 }
        L_0x0cf7:
            X.4uZ r0 = r4.A0n()     // Catch:{ all -> 0x0ed7 }
            X.2z0 r12 = r4.A1J     // Catch:{ all -> 0x0ed7 }
            boolean r10 = r12.A02     // Catch:{ all -> 0x0ed7 }
            X.1mi r7 = r6.A00(r5, r0, r10)     // Catch:{ all -> 0x0ed7 }
            if (r7 != 0) goto L_0x0d23
            X.4uZ r8 = r4.A0n()     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0d48
            X.2sM r1 = r6.A04     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C162457s7.A0K(r8, r0)     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x0ed7 }
            com.whatsapp.jid.UserJid r0 = r1.A03(r8)     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0d48
            X.1mi r7 = r6.A00(r5, r0, r10)     // Catch:{ all -> 0x0ed7 }
            if (r7 == 0) goto L_0x0d48
        L_0x0d23:
            if (r36 == 0) goto L_0x0d3d
            if (r10 == 0) goto L_0x0d3d
            long r0 = r7.A00     // Catch:{ all -> 0x0ed7 }
            long r8 = r4.A00     // Catch:{ all -> 0x0ed7 }
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0d3d
            r8 = 1
            long r0 = r0 + r8
            r4.A00 = r0     // Catch:{ all -> 0x0ed7 }
            X.2qk r9 = r6.A00     // Catch:{ all -> 0x0ed7 }
            r8 = 0
            r1 = 0
            java.lang.String r0 = "event_response_timestamp_adjustment"
            r9.A0A(r0, r1, r8)     // Catch:{ all -> 0x0ed7 }
        L_0x0d3d:
            long r8 = r7.A00     // Catch:{ all -> 0x0ed7 }
            long r0 = r4.A00     // Catch:{ all -> 0x0ed7 }
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0d48
        L_0x0d45:
            r8 = 5
            goto L_0x0e41
        L_0x0d48:
            X.3dV r0 = r6.A03     // Catch:{ SQLiteConstraintException -> 0x0e30 }
            X.4Fq r9 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x0e30 }
            X.3Yo r8 = r9.Axl()     // Catch:{ all -> 0x0e29 }
            if (r7 == 0) goto L_0x0d5b
            long r0 = r7.A1L     // Catch:{ all -> 0x0e22 }
            X.3Ll r13 = r6.A05     // Catch:{ all -> 0x0e22 }
            r13.A08(r0)     // Catch:{ all -> 0x0e22 }
        L_0x0d5b:
            if (r10 != 0) goto L_0x0d7a
            X.2z0 r0 = r5.A1J     // Catch:{ all -> 0x0e22 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0e22 }
            if (r0 == 0) goto L_0x0d7a
            r10 = 17
            if (r7 == 0) goto L_0x0d6c
            int r0 = r7.A0D     // Catch:{ all -> 0x0e22 }
            r13 = 1
            if (r0 == r10) goto L_0x0d6d
        L_0x0d6c:
            r13 = 0
        L_0x0d6d:
            X.21m r1 = r4.A01     // Catch:{ all -> 0x0e22 }
            if (r1 == 0) goto L_0x0d77
            X.21m r0 = X.C372421m.UNKNOWN     // Catch:{ all -> 0x0e22 }
            if (r0 == r1) goto L_0x0d77
            if (r13 == 0) goto L_0x0d7a
        L_0x0d77:
            r4.A1G(r10)     // Catch:{ all -> 0x0e22 }
        L_0x0d7a:
            X.3Ll r0 = r6.A05     // Catch:{ all -> 0x0e22 }
            long r0 = r0.A00(r4)     // Catch:{ all -> 0x0e22 }
            r23 = -1
            int r10 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x0d8f
            r8.close()     // Catch:{ all -> 0x0e29 }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0e30 }
        L_0x0d8c:
            r8 = 6
            goto L_0x0e41
        L_0x0d8f:
            r4.A1L = r0     // Catch:{ all -> 0x0e22 }
            android.content.ContentValues r13 = X.C18290x4.A0E()     // Catch:{ all -> 0x0e1b }
            X.21m r0 = r4.A01     // Catch:{ all -> 0x0e1b }
            if (r0 != 0) goto L_0x0d9b
            X.21m r0 = X.C372421m.UNKNOWN     // Catch:{ all -> 0x0e1b }
        L_0x0d9b:
            int r10 = r0.value     // Catch:{ all -> 0x0e1b }
            java.lang.Long r1 = X.C624134x.A0A(r4)     // Catch:{ all -> 0x0e1b }
            java.lang.String r0 = "message_add_on_row_id"
            r13.put(r0, r1)     // Catch:{ all -> 0x0e1b }
            java.lang.String r0 = "response"
            X.C18270x1.A0b(r13, r0, r10)     // Catch:{ all -> 0x0e1b }
            long r0 = r4.A00     // Catch:{ all -> 0x0e1b }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e1b }
            java.lang.String r0 = "sender_timestamp"
            X.2sg r14 = X.AnonymousClass3H0.A00(r13, r1, r9, r0)     // Catch:{ all -> 0x0e1b }
            java.lang.String r10 = "message_add_on_event_response"
            r1 = 5
            java.lang.String r0 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse"
            long r13 = r14.A0C(r10, r0, r13, r1)     // Catch:{ all -> 0x0e1b }
            int r0 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0e13
            r9.close()     // Catch:{ all -> 0x0e22 }
            r1 = 32
            int r0 = r5.A08     // Catch:{ all -> 0x0e22 }
            r0 = r0 & 32
            boolean r10 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0e22 }
            r0 = r33
            r5.A1w(r0, r4)     // Catch:{ all -> 0x0e22 }
            int r0 = r5.A08     // Catch:{ all -> 0x0e22 }
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0e22 }
            if (r10 != 0) goto L_0x0de9
            if (r0 == 0) goto L_0x0de9
            X.3Lv r0 = r6.A01     // Catch:{ all -> 0x0e22 }
            r0.A0X(r5)     // Catch:{ all -> 0x0e22 }
        L_0x0de9:
            X.3Lv r0 = r6.A01     // Catch:{ all -> 0x0e22 }
            X.2pF r0 = r0.A0y     // Catch:{ all -> 0x0e22 }
            r0.A02(r5)     // Catch:{ all -> 0x0e22 }
            r8.A00()     // Catch:{ all -> 0x0e22 }
            if (r7 != 0) goto L_0x0dfd
            r8.close()     // Catch:{ all -> 0x0e29 }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0e30 }
        L_0x0dfb:
            r8 = 1
            goto L_0x0e41
        L_0x0dfd:
            int r1 = r7.A0D     // Catch:{ all -> 0x0e22 }
            r0 = 17
            if (r1 != r0) goto L_0x0e0b
            r8.close()     // Catch:{ all -> 0x0e29 }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0e30 }
            r8 = 3
            goto L_0x0e41
        L_0x0e0b:
            r8.close()     // Catch:{ all -> 0x0e29 }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0e30 }
            r8 = 2
            goto L_0x0e41
        L_0x0e13:
            java.lang.String r1 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0e1b }
            r0.<init>(r1)     // Catch:{ all -> 0x0e1b }
            throw r0     // Catch:{ all -> 0x0e1b }
        L_0x0e1b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e1d }
        L_0x0e1d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x0e22 }
            throw r0     // Catch:{ all -> 0x0e22 }
        L_0x0e22:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e24 }
        L_0x0e24:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x0e29 }
            throw r0     // Catch:{ all -> 0x0e29 }
        L_0x0e29:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e2b }
        L_0x0e2b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ SQLiteConstraintException -> 0x0e30 }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0e30 }
        L_0x0e30:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = "EventResponseMessageManager/storeEventResponseMessage failed to insert addon message "
            r1.append(r0)     // Catch:{ all -> 0x0ed7 }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x0ed7 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0ed7 }
        L_0x0e3e:
            r8 = 7
            goto L_0x0e41
        L_0x0e40:
            monitor-exit(r9)     // Catch:{ all -> 0x0ed7 }
        L_0x0e41:
            boolean r0 = X.AnonymousClass31T.A00(r8)     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0ecd
            boolean r0 = r2 instanceof X.C30581mg     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0e4e
            r1 = 16
            goto L_0x0e6f
        L_0x0e4e:
            if (r19 == 0) goto L_0x0e52
            r1 = 1
            goto L_0x0e6f
        L_0x0e52:
            if (r17 == 0) goto L_0x0e56
            r1 = 2
            goto L_0x0e6f
        L_0x0e56:
            boolean r0 = r2 instanceof X.C30561me     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0e5d
            r1 = 8
            goto L_0x0e6f
        L_0x0e5d:
            if (r16 == 0) goto L_0x0e61
            r1 = 4
            goto L_0x0e6f
        L_0x0e61:
            boolean r0 = r2 instanceof X.C30531mb     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0e67
            r1 = -1
            goto L_0x0e6f
        L_0x0e67:
            boolean r0 = r2 instanceof X.C30541mc     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0e6d
            r1 = 0
            goto L_0x0e6f
        L_0x0e6d:
            r1 = 32
        L_0x0e6f:
            int r0 = r3.A08     // Catch:{ all -> 0x0ed7 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x0e80
            X.C624134x.A0K(r3, r1)     // Catch:{ all -> 0x0ed7 }
            X.3Lv r0 = r11.A09     // Catch:{ all -> 0x0ed7 }
            r0.A0X(r3)     // Catch:{ all -> 0x0ed7 }
        L_0x0e80:
            int r4 = A00(r2)     // Catch:{ all -> 0x0ed7 }
            X.2hU r0 = r11.A0B     // Catch:{ all -> 0x0ed7 }
            android.os.Handler r1 = r0.A02     // Catch:{ all -> 0x0ed7 }
            r0 = 2
            X.C18300x5.A16(r1, r3, r0, r4)     // Catch:{ all -> 0x0ed7 }
            long r0 = r2.A1L     // Catch:{ all -> 0x0ed7 }
            r2.A1M = r0     // Catch:{ all -> 0x0ed7 }
            if (r18 == 0) goto L_0x0ea1
            X.2sr r0 = r11.A02     // Catch:{ all -> 0x0ed7 }
            boolean r0 = X.C627636p.A0P(r0, r2)     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x0ea1
            java.util.Set r0 = java.util.Collections.singleton(r2)     // Catch:{ all -> 0x0ed7 }
            r11.A0H(r0)     // Catch:{ all -> 0x0ed7 }
        L_0x0ea1:
            X.4FS r1 = r11.A0Y     // Catch:{ all -> 0x0ed7 }
            r0 = 7
            X.C71343bx.A00(r1, r11, r2, r0)     // Catch:{ all -> 0x0ed7 }
            if (r22 == 0) goto L_0x0ecd
            boolean r0 = r2 instanceof X.C30561me     // Catch:{ all -> 0x0ed7 }
            if (r0 == 0) goto L_0x0ecd
            X.1im r0 = r11.A03     // Catch:{ all -> 0x0ed7 }
            boolean r0 = r0.A0A()     // Catch:{ all -> 0x0ed7 }
            if (r0 != 0) goto L_0x0ecd
            X.1me r2 = (X.C30561me) r2     // Catch:{ all -> 0x0ed7 }
            int r1 = r2.A00     // Catch:{ all -> 0x0ed7 }
            r0 = 1
            if (r1 != r0) goto L_0x0ecd
            X.2pk r4 = r11.A0L     // Catch:{ all -> 0x0ed7 }
            X.2sm r1 = r11.A07     // Catch:{ all -> 0x0ed7 }
            r0 = r22
            long r1 = r1.A07(r0)     // Catch:{ all -> 0x0ed7 }
            r3 = r20
            r0 = r21
            r4.A01(r3, r0, r1)     // Catch:{ all -> 0x0ed7 }
        L_0x0ecd:
            r20.A00()     // Catch:{ all -> 0x0ed7 }
            r20.close()     // Catch:{ all -> 0x0ee1 }
            r21.close()
            return r8
        L_0x0ed7:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0edc }
            goto L_0x0ee0
        L_0x0edc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ee1 }
        L_0x0ee0:
            throw r1     // Catch:{ all -> 0x0ee1 }
        L_0x0ee1:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x0ee6 }
            throw r1
        L_0x0ee6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620333f.A03(X.1mH, boolean):int");
    }

    public final long A04(Set set) {
        C69833Yo Axl;
        Set set2 = set;
        long j = -1;
        if (!set2.isEmpty()) {
            HashSet A0K2 = AnonymousClass002.A0K();
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it);
                if (j < A0T2.A1L) {
                    j = A0T2.A1L;
                }
                AnonymousClass0x2.A1Q(A0K2, A0T2.A1L);
            }
            if (!A0K2.isEmpty()) {
                C66443Ll r12 = this.A0P;
                if (!A0K2.isEmpty()) {
                    String[] strArr = new String[A0K2.size()];
                    Iterator it2 = A0K2.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        AnonymousClass0x2.A1S(strArr, i, C18270x1.A02(it2));
                        i++;
                    }
                    ContentValues A062 = AnonymousClass0x9.A06();
                    C18270x1.A0b(A062, "status", 17);
                    C85284Fq A042 = r12.A03.A04();
                    try {
                        Axl = A042.Axl();
                        C71923ct r4 = new C71923ct(strArr, 975);
                        while (r4.hasNext()) {
                            String[] A012 = C71923ct.A01(r4);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("_id IN ");
                            ((AnonymousClass3H0) A042).A03.A05(A062, "message_add_on", AnonymousClass000.A0X(C57212tH.A00(A012.length), A0o), "MessageAddOnStore/updateMessageAddOnsStatus", A012);
                        }
                        Axl.A00();
                        Axl.close();
                        A042.close();
                    } catch (Throwable th) {
                        try {
                            A042.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
            A0K2.size();
            A0H(set2);
        }
        return j;
        throw th;
    }

    public C30331mH A06(AnonymousClass4GK r8, long j) {
        Cursor A012;
        C66443Ll r6 = this.A0P;
        String[] A1Z = AnonymousClass0x9.A1Z();
        C18270x1.A1S(A1Z, j);
        C18270x1.A1R(A1Z, r6.A00.A0H());
        Cursor A0E2 = ((AnonymousClass3H0) r8).A03.A0E(C625035h.A04, "MessageAddOnStore/getMessageAddOnTypeForRowId", A1Z);
        try {
            int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("message_add_on_type");
            if (!A0E2.moveToNext()) {
                Log.w("MessageAddOnManager/getMessageAddOn message add on not found");
                A0E2.close();
                return null;
            }
            byte b = (byte) A0E2.getInt(columnIndexOrThrow);
            A012 = r6.A01(r8, b, j);
            HashMap A002 = AnonymousClass26E.A00(A012, b);
            C30331mH r2 = null;
            if (!A012.moveToNext()) {
                Log.e("MessageAddOnManager/getMessageAddOn couldn't collect data for message add on");
            } else {
                C30331mH A052 = r6.A05(A012, A002);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getMessageAddOn couldn't load message add on from cursor");
                } else {
                    A052.A1y(A012, this.A0C, A002);
                    C624134x A013 = C30331mH.A01(A052, this.A0X);
                    if (A013 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOn parent message missing");
                    } else {
                        C30331mH.A04(A013, A052);
                        A012.close();
                        r2 = A052;
                        A0E2.close();
                        return r2;
                    }
                }
            }
            A012.close();
            A0E2.close();
            return r2;
        } catch (Throwable th) {
            if (A0E2 != null) {
                try {
                    A0E2.close();
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

    /* JADX INFO: finally extract failed */
    public List A09(C95814uZ r23) {
        C95814uZ r6 = r23;
        AnonymousClass31A A002 = C56982ss.A00(this.A08, r6);
        if (A002 == null || A002.A00() == A002.A01()) {
            return AnonymousClass001.A0s();
        }
        long A072 = this.A07.A07(r6);
        long A012 = A002.A01();
        LinkedList A18 = AnonymousClass0x9.A18();
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = this.A0G.get();
        try {
            C66443Ll r10 = this.A0P;
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String str = C625035h.A00;
            String[] strArr = new String[5];
            String valueOf = String.valueOf(A072);
            strArr[0] = valueOf;
            String valueOf2 = String.valueOf(0);
            strArr[1] = valueOf2;
            String valueOf3 = String.valueOf(A012);
            strArr[2] = valueOf3;
            C56612sH r21 = r10.A00;
            strArr[3] = String.valueOf(r21.A0H());
            AnonymousClass0x2.A1S(strArr, 4, 7);
            Cursor A0E2 = r3.A0E(str, "MessageAddOnStore/getMessageAddOnKeepInChatInfoCursorForNotification", strArr);
            try {
                int columnIndex = A0E2.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A0E2.getColumnIndex("parent_message_row_id");
                while (A0E2.moveToNext()) {
                    long j = A0E2.getLong(columnIndex2);
                    Cursor A013 = r10.A01(A032, (byte) 68, A0E2.getLong(columnIndex));
                    try {
                        HashMap A003 = AnonymousClass26E.A00(A013, (byte) 68);
                        C42622Ow r1 = null;
                        if (!A013.moveToNext()) {
                            Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview couldn't collect data for message add on");
                        } else {
                            C30331mH A052 = r10.A05(A013, A003);
                            if (!(A052 instanceof C30551md)) {
                                Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview unexpected fmessage");
                            } else {
                                C30551md r13 = (C30551md) A052;
                                r13.A1y(A013, this.A0C, A003);
                                C624134x A014 = C30331mH.A01(r13, this.A0X);
                                if (A014 == null) {
                                    Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview parent message missing");
                                } else {
                                    C30331mH.A04(A014, A052);
                                    r1 = new C42622Ow(A014, r13);
                                }
                            }
                        }
                        A013.close();
                        if (r1 != null && r1.A00.A1J.A02) {
                            A18.addFirst(r1);
                            A0t.put(Long.valueOf(j), r1);
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                if (!A0t.keySet().isEmpty()) {
                    Set<Object> keySet = A0t.keySet();
                    C626936e.A0B(AnonymousClass001.A1W(keySet.size()));
                    String[] strArr2 = new String[(keySet.size() + 4)];
                    strArr2[0] = valueOf;
                    C18300x5.A1K(valueOf2, valueOf3, strArr2);
                    int i = 3;
                    for (Object A053 : keySet) {
                        AnonymousClass0x2.A1S(strArr2, i, C18320x8.A05(A053));
                        i++;
                    }
                    AnonymousClass0x2.A1S(strArr2, i, r21.A0H());
                    Cursor A0E3 = r3.A0E(C625035h.A03((byte) 68, keySet.size()), "MessageAddOnStore/getMessageAddOnKeepInChatSendersCursorForNotification", strArr2);
                    try {
                        int columnIndex3 = A0E3.getColumnIndex("parent_message_row_id");
                        int columnIndex4 = A0E3.getColumnIndex("sender_jid_row_id");
                        while (A0E3.moveToNext()) {
                            long j2 = A0E3.getLong(columnIndex3);
                            long j3 = A0E3.getLong(columnIndex4);
                            C42622Ow r0 = (C42622Ow) A0t.get(Long.valueOf(j2));
                            C626936e.A06(r0);
                            r0.A02.add(Long.valueOf(j3));
                        }
                        A0E3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                A0E2.close();
                A032.close();
                return A18;
            } catch (Throwable th3) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A032.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
        throw th;
    }

    public List A0A(C95814uZ r23, byte b) {
        Cursor A0E2;
        C624134x A002;
        C95814uZ r6 = r23;
        AnonymousClass31A A003 = C56982ss.A00(this.A08, r6);
        if (A003 == null || A003.A00() == A003.A01()) {
            return AnonymousClass001.A0s();
        }
        long A072 = this.A07.A07(r6);
        long A012 = A003.A01();
        LinkedList A18 = AnonymousClass0x9.A18();
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = this.A0G.get();
        try {
            C66443Ll r13 = this.A0P;
            C56862sg r2 = ((AnonymousClass3H0) A032).A03;
            byte b2 = b;
            String A013 = C625035h.A01(b2);
            String[] strArr = new String[5];
            String valueOf = String.valueOf(A072);
            strArr[0] = valueOf;
            String valueOf2 = String.valueOf(0);
            strArr[1] = valueOf2;
            String valueOf3 = String.valueOf(A012);
            strArr[2] = valueOf3;
            C56612sH r20 = r13.A00;
            strArr[3] = String.valueOf(r20.A0H());
            AnonymousClass0x2.A1S(strArr, 4, 7);
            Cursor A0E3 = r2.A0E(A013, "MessageAddOnStore/getMessageAddOnInfoCursorForNotification", strArr);
            try {
                int columnIndex = A0E3.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A0E3.getColumnIndex("unread_count");
                int columnIndex3 = A0E3.getColumnIndex("parent_message_row_id");
                while (A0E3.moveToNext()) {
                    long j = A0E3.getLong(columnIndex3);
                    long j2 = A0E3.getLong(columnIndex);
                    int i = A0E3.getInt(columnIndex2);
                    C30331mH A062 = A06(A032, j2);
                    AnonymousClass2QS r1 = null;
                    if (!(A062 == null || (A002 = C55832qz.A00(this.A09, A062.A1v())) == null)) {
                        r1 = new AnonymousClass2QS(A002, A062, i);
                    }
                    if (r1 != null && r1.A01.A1J.A02) {
                        A18.addFirst(r1);
                        A0t.put(Long.valueOf(j), r1);
                    }
                }
                if (!A0t.keySet().isEmpty()) {
                    Set<Object> keySet = A0t.keySet();
                    C626936e.A0B(AnonymousClass001.A1W(keySet.size()));
                    String[] strArr2 = new String[(keySet.size() + 4)];
                    strArr2[0] = valueOf;
                    C18300x5.A1K(valueOf2, valueOf3, strArr2);
                    int i2 = 3;
                    for (Object A052 : keySet) {
                        AnonymousClass0x2.A1S(strArr2, i2, C18320x8.A05(A052));
                        i2++;
                    }
                    AnonymousClass0x2.A1S(strArr2, i2, r20.A0H());
                    A0E2 = r2.A0E(C625035h.A03(b2, keySet.size()), "MessageAddOnStore/getMessageAddOnSendersCursorForNotification", strArr2);
                    int columnIndex4 = A0E2.getColumnIndex("parent_message_row_id");
                    int columnIndex5 = A0E2.getColumnIndex("sender_jid_row_id");
                    while (A0E2.moveToNext()) {
                        long j3 = A0E2.getLong(columnIndex4);
                        long j4 = A0E2.getLong(columnIndex5);
                        AnonymousClass2QS r0 = (AnonymousClass2QS) A0t.get(Long.valueOf(j3));
                        C626936e.A06(r0);
                        r0.A03.add(Long.valueOf(j4));
                    }
                    A0E2.close();
                }
                A0E3.close();
                A032.close();
                return A18;
            } catch (Throwable th) {
                if (A0E3 != null) {
                    A0E3.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
    }

    public void A0F(C30331mH r18, long j) {
        long j2;
        Long valueOf;
        C69833Yo Axl;
        int i;
        C30331mH r5 = r18;
        r5.A1G(4);
        r5.A1x(j);
        C66443Ll r7 = this.A0P;
        ContentValues A062 = AnonymousClass0x9.A06();
        A062.put("server_timestamp", Long.valueOf(r5.A03));
        boolean z = r5 instanceof C30561me;
        if (z) {
            j2 = r5.A01;
        } else {
            j2 = 0;
        }
        Integer num = null;
        if (j2 <= 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(j2);
        }
        A062.put("expiry_timestamp", valueOf);
        if (z && (i = r5.A00) > 0) {
            num = Integer.valueOf(i);
        }
        A062.put("expiry_duration_in_secs", num);
        C18280x3.A0m(A062, r5.A0D);
        AnonymousClass2z0 r11 = r5.A1J;
        C85284Fq A042 = r7.A03.A04();
        try {
            Axl = A042.Axl();
            String[] strArr = new String[3];
            C56922sm r2 = r7.A01;
            C95814uZ A012 = AnonymousClass2z0.A01(r11);
            C56922sm.A01(r2, A012, strArr);
            strArr[1] = AnonymousClass2z0.A08(r11);
            AnonymousClass3H0.A04(r11.A01, A042, strArr, 2).A05(A062, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnUsingKey", strArr);
            Axl.A00();
            Axl.close();
            A042.close();
            A0E(r5);
            if (z && !this.A02.A0a(A012) && j == r5.A03) {
                this.A0L.A03((C30561me) r5);
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0G(Map map, Set set) {
        this.A0P.A09(set, 17);
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            this.A07.A0L(C18320x8.A0N(A0w), C18310x6.A0B(A0w.getValue()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 != 93) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.C30331mH r4) {
        /*
            r3 = this;
            byte r2 = r4.A1I
            r0 = 56
            r1 = 0
            if (r2 == r0) goto L_0x0010
            r0 = 67
            if (r2 == r0) goto L_0x0023
            r0 = 93
            if (r2 == r0) goto L_0x0010
        L_0x000f:
            return r1
        L_0x0010:
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0021
            X.2z0 r0 = r4.A1v()
            X.C626936e.A06(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x000f
        L_0x0021:
            r1 = 1
            return r1
        L_0x0023:
            X.1VX r2 = r3.A0S
            r1 = 2720(0xaa0, float:3.812E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620333f.A0I(X.1mH):boolean");
    }

    public C620333f(C55682qk r10, C56972sr r11, C29411im r12, C64773Ex r13, C44382Vv r14, C56612sH r15, C56922sm r16, C56982ss r17, C66543Lv r18, C56892sj r19, C50012hU r20, C623334p r21, C52352lL r22, C51532jy r23, C47992eA r24, C72303dV r25, C55422qK r26, AnonymousClass2ZZ r27, C47562dS r28, AnonymousClass2SB r29, C55072pk r30, C618632o r31, C50212ho r32, C46972cV r33, C66443Ll r34, C49822h9 r35, C47202cs r36, AnonymousClass1VX r37, AnonymousClass33Y r38, C49092fy r39, C48192eV r40, C42522Om r41, C55832qz r42, AnonymousClass4FS r43) {
        Byte[] bArr;
        this.A06 = r15;
        AnonymousClass1VX r2 = r37;
        this.A0S = r2;
        this.A0C = r21;
        this.A07 = r16;
        this.A02 = r11;
        this.A0Y = r43;
        this.A08 = r17;
        this.A01 = r10;
        this.A04 = r13;
        this.A0B = r20;
        this.A03 = r12;
        this.A0X = r42;
        this.A0P = r34;
        this.A0Q = r35;
        this.A0F = r24;
        this.A0T = r38;
        this.A0U = r39;
        this.A0D = r22;
        this.A0G = r25;
        this.A0H = r26;
        this.A0E = r23;
        this.A09 = r18;
        this.A0I = r27;
        this.A0K = r29;
        this.A0A = r19;
        this.A0V = r40;
        this.A0R = r36;
        this.A0M = r31;
        this.A0N = r32;
        this.A0L = r30;
        this.A0J = r28;
        this.A05 = r14;
        this.A0W = r41;
        this.A0O = r33;
        C58422vE r1 = C58422vE.A02;
        this.A00 = r2.A0O(r1, 987);
        if (r2.A0Y(r1, 3158)) {
            bArr = new Byte[4];
            C18310x6.A1T(bArr, (byte) 56, 0);
            C18310x6.A1T(bArr, (byte) 68, 1);
            C18310x6.A1T(bArr, (byte) 67, 2);
            C18310x6.A1T(bArr, (byte) 93, 3);
        } else {
            bArr = new Byte[3];
            C18310x6.A1T(bArr, (byte) 56, 0);
            C18310x6.A1T(bArr, (byte) 68, 1);
            C18310x6.A1T(bArr, (byte) 93, 2);
        }
        this.A0Z = Arrays.asList(bArr);
    }

    public C30331mH A08(AnonymousClass2z0 r8) {
        UserJid A0o;
        C30331mH A072 = A07(r8);
        if (A072 == null) {
            return null;
        }
        C624134x A012 = C30331mH.A01(A072, this.A0X);
        if (A012 == null && !(A072 instanceof C30581mg)) {
            return null;
        }
        C49092fy r1 = this.A0U;
        C624134x A002 = C55122pp.A00(r1.A02, A072.A02);
        if (A002 != null) {
            AnonymousClass2z0 r0 = A002.A1J;
            C162457s7.A0C(r0);
            AnonymousClass2z0 A013 = r1.A01(r0);
            if (A013 != null) {
                if (A012 == null) {
                    A0o = null;
                } else {
                    A0o = A012.A0o();
                }
                C30331mH.A03(A0o, A072, A013);
                if (A072 instanceof C30571mf) {
                    A072.A04 = C33051sM.A01(A012);
                } else if (A072 instanceof C30591mh) {
                    C30591mh r12 = (C30591mh) A072;
                    if (!(A012 instanceof C30451mT)) {
                        Log.i("MessageAddOn/getMessageAddOnForMessageKeyForSend/missing parent message");
                        return null;
                    }
                    C618632o.A00((C30451mT) A012, r12);
                    return A072;
                } else if (A072 instanceof C30601mi) {
                    C30601mi r13 = (C30601mi) A072;
                    if (!(A012 instanceof C30461mU)) {
                        Log.i("MessageAddOnManager/getMessageAddOnForMessageKeyForSend/missing parent message for event response");
                        return null;
                    }
                    r13.A04 = A012.A1a;
                    return A072;
                }
                return A072;
            }
        }
        Log.e("MessageAddOnManager/getMessageAddOnForMessageKeyForSend/parent reference key was not found");
        return null;
    }

    public List A0B(C624134x r9, byte b) {
        Cursor A022;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = this.A0G.get();
        try {
            C66443Ll r3 = this.A0P;
            A022 = r3.A02(A032, b, r9.A1L);
            HashMap A002 = AnonymousClass26E.A00(A022, b);
            while (A022.moveToNext()) {
                C30331mH A052 = r3.A05(A022, A002);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage");
                } else {
                    boolean z = A052 instanceof C30591mh;
                    if (!z || (r9 instanceof C30451mT)) {
                        A052.A1y(A022, this.A0C, A002);
                        C30331mH.A04(r9, A052);
                        if (z) {
                            C30591mh r1 = (C30591mh) A052;
                            C30331mH.A02(this.A0M, r1);
                            C618632o.A00((C30451mT) r9, r1);
                        } else if (A052 instanceof C30601mi) {
                            C30601mi r12 = (C30601mi) A052;
                            if (!(r9 instanceof C30461mU)) {
                                Log.i("MessageAddOnManager/getMessageAddOnForParentMessage/missing parent message for event response");
                            } else {
                                r12.A04 = r9.A1a;
                            }
                        }
                        A0s.add(A052);
                    } else {
                        Log.e("MessageAddOnManager/getMessageAddOnForParentMessage parent is not poll for poll vote");
                    }
                }
            }
            A022.close();
            A032.close();
            return A0s;
        } catch (Throwable th) {
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

    public final Set A0C(AnonymousClass4GK r9, byte b, long j, long j2, boolean z) {
        String[] strArr;
        C56862sg r4;
        String A022;
        String str;
        HashSet A0K2 = AnonymousClass002.A0K();
        C66443Ll r2 = this.A0P;
        if (!z) {
            strArr = new String[4];
            AnonymousClass0x2.A1S(strArr, 0, j);
            AnonymousClass0x2.A1S(strArr, 1, j2);
            AnonymousClass0x2.A1S(strArr, 2, r2.A00.A0H());
            C18280x3.A1Q(strArr, 0, 3);
            r4 = ((AnonymousClass3H0) r9).A03;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C625035h.A02(b));
            A0o.append(" AND ");
            A022 = AnonymousClass000.A0X("message_add_on.status = ?", A0o);
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJid";
        } else {
            strArr = new String[3];
            AnonymousClass0x2.A1S(strArr, 0, j);
            AnonymousClass0x2.A1S(strArr, 1, j2);
            AnonymousClass0x2.A1S(strArr, 2, r2.A00.A0H());
            r4 = ((AnonymousClass3H0) r9).A03;
            A022 = C625035h.A02(b);
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJidAndIgnoreStatus";
        }
        Cursor A0E2 = r4.A0E(A022, str, strArr);
        try {
            HashMap A002 = AnonymousClass26E.A00(A0E2, b);
            while (A0E2.moveToNext()) {
                C30331mH A052 = r2.A05(A0E2, A002);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getUnreadMessageAddOnForAddOnType unexpected fmessage");
                } else {
                    A052.A1y(A0E2, this.A0C, A002);
                    A0K2.add(A052);
                }
            }
            A0E2.close();
            return A0K2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A0H(Set set) {
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            if (!C627636p.A0P(this.A02, A0T2)) {
                A0K2.add(A0T2);
            } else {
                C624134x.A0Q(A0T2, "MessageAddOnManager/filterOutSelfReactionsAndSendReadSefReceipts this msg should not be part of the set ", AnonymousClass001.A0o());
            }
        }
        AnonymousClass33Y r1 = this.A0T;
        r1.A0B(r1.A02(A0K2));
    }
}
