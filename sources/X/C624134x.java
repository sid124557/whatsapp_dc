package X;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.34x  reason: invalid class name and case insensitive filesystem */
public abstract class C624134x {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public AnonymousClass4FP A0L;
    public C47942e5 A0M;
    public C371321b A0N;
    public C108845de A0O;
    public C624034w A0P;
    public C95814uZ A0Q;
    public C27981fH A0R;
    public C27981fH A0S;
    public PhoneUserJid A0T;
    public PhoneUserJid A0U;
    public PhoneUserJid A0V;
    public C53252mn A0W;
    public C51962kf A0X;
    public C53532nF A0Y;
    public C51972kg A0Z;
    public C55162pu A0a;
    public C51062jD A0b;
    public AnonymousClass2U8 A0c;
    public C624134x A0d;
    public C40802Hu A0e;
    public AnonymousClass2z0 A0f;
    public C52652lp A0g;
    public C614630w A0h;
    public C53042mS A0i;
    public C60432yY A0j;
    public C42602Ou A0k;
    public C55592qb A0l;
    public AnonymousClass2SV A0m;
    public AnonymousClass3ZC A0n;
    public Boolean A0o;
    public Integer A0p;
    public Long A0q;
    public Long A0r;
    public Long A0s;
    public Long A0t;
    public Long A0u;
    public Long A0v;
    public Long A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public List A18;
    public List A19;
    public Map A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public byte[] A1H;
    public final byte A1I;
    public final AnonymousClass2z0 A1J;
    public final Object A1K;
    public volatile long A1L;
    public volatile long A1M;
    public volatile boolean A1N;
    public transient long A1O;
    public transient long A1P;
    public transient long A1Q;
    public transient DeviceJid A1R;
    public transient C30551md A1S;
    public transient C30561me A1T;
    public transient boolean A1U;
    public transient boolean A1V;
    public transient boolean A1W;
    public transient boolean A1X;
    public transient boolean A1Y;
    public transient boolean A1Z;
    public transient byte[] A1a;
    public final transient long A1b;
    public final transient Map A1c;
    public volatile transient int A1d;

    public static AnonymousClass2z0 A07(C624134x r1) {
        C162457s7.A0J(r1, 0);
        return r1.A1J;
    }

    public static void A0X(C624134x r3, Object[] objArr) {
        objArr[0] = Long.toString(r3.A1L);
    }

    public int A0k() {
        String str;
        if (this instanceof C30471mV) {
            str = ((C30471mV) this).A08;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            A1C(64);
        }
        return this.A0A;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.String A13() {
        /*
            r6 = this;
            r4 = r6
            boolean r0 = r6 instanceof X.C31311o5
            if (r0 == 0) goto L_0x0025
            r4 = r6
            X.1o5 r4 = (X.C31311o5) r4
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            long r0 = r4.A01
            r3.append(r0)
            java.lang.String r2 = ","
            r3.append(r2)
            long r0 = r4.A00
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r4.A02
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            return r0
        L_0x0025:
            boolean r0 = r6 instanceof X.C31331o7
            if (r0 == 0) goto L_0x0031
            r0 = r6
            X.1o7 r0 = (X.C31331o7) r0
            java.lang.String r0 = r0.A1w()
            return r0
        L_0x0031:
            boolean r0 = r6 instanceof X.C31321o6
            if (r0 == 0) goto L_0x004b
            r2 = r6
            X.1o6 r2 = (X.C31321o6) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r2.A01
            r1.append(r0)
            X.C18320x8.A1K(r1)
            int r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            return r0
        L_0x004b:
            boolean r0 = r6 instanceof X.C31581oW
            if (r0 == 0) goto L_0x0057
            r0 = r6
            X.1oW r0 = (X.C31581oW) r0
            java.lang.String r0 = r0.A1x()
            return r0
        L_0x0057:
            boolean r0 = r6 instanceof X.C31611oZ
            if (r0 == 0) goto L_0x0063
            r0 = r6
            X.1oZ r0 = (X.C31611oZ) r0
            java.lang.String r0 = r0.A1x()
            return r0
        L_0x0063:
            boolean r0 = r6 instanceof X.C31541oS
            if (r0 == 0) goto L_0x0071
            r0 = r6
            X.1oS r0 = (X.C31541oS) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0071:
            boolean r0 = r6 instanceof X.C31251nz
            if (r0 == 0) goto L_0x0080
            r0 = r6
            X.1nz r0 = (X.C31251nz) r0
            monitor-enter(r4)
            int r0 = r0.A00     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r6 instanceof X.C31281o2
            if (r0 == 0) goto L_0x008a
            r0 = r6
            X.1o2 r0 = (X.C31281o2) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x008a:
            boolean r0 = r6 instanceof X.C31241ny
            if (r0 == 0) goto L_0x0099
            r0 = r6
            X.1ny r0 = (X.C31241ny) r0
            monitor-enter(r4)
            boolean r0 = r0.A00     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00b9
        L_0x0099:
            boolean r0 = r6 instanceof X.C31261o0
            if (r0 == 0) goto L_0x00be
            r3 = r6
            X.1o0 r3 = (X.C31261o0) r3
            monitor-enter(r4)
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "bizOptOutAction"
            int r0 = r3.A00     // Catch:{ all -> 0x00bb }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "bizOptOutCategory"
            int r0 = r3.A01     // Catch:{ all -> 0x00bb }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r4)
            return r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00be:
            boolean r0 = r6 instanceof X.C30451mT
            if (r0 == 0) goto L_0x00c8
            r0 = r6
            X.1mT r0 = (X.C30451mT) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x00c8:
            boolean r0 = r6 instanceof X.C31901p2
            if (r0 == 0) goto L_0x0103
            r0 = r6
            X.1p2 r0 = (X.C31901p2) r0
            java.lang.Object r5 = r0.A1K
            monitor-enter(r5)
            X.39N r4 = r0.A00     // Catch:{ all -> 0x0100 }
            r0 = 0
            if (r4 == 0) goto L_0x00fe
            java.lang.String r3 = r4.A02     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x00e2
            int r1 = r3.length()     // Catch:{ all -> 0x0100 }
            r0 = 0
            if (r1 != 0) goto L_0x00e3
        L_0x00e2:
            r0 = 1
        L_0x00e3:
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x0100 }
            goto L_0x00fe
        L_0x00e8:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0100 }
            java.lang.String r1 = "\n     "
            r2.append(r1)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x0100 }
            X.AnonymousClass001.A1K(r0, r1, r3, r2)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = X.C830345w.A08(r0)     // Catch:{ all -> 0x0100 }
        L_0x00fe:
            monitor-exit(r5)
            return r0
        L_0x0100:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0103:
            boolean r0 = r6 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x0114
            r0 = r6
            X.1mQ r0 = (X.C30421mQ) r0
            java.lang.Object r1 = r0.A1K
            monitor-enter(r1)
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0111 }
            monitor-exit(r1)     // Catch:{ all -> 0x0111 }
            return r0
        L_0x0111:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0111 }
            throw r0
        L_0x0114:
            java.lang.Object r2 = r6.A1K
            monitor-enter(r2)
            int r1 = r6.A02     // Catch:{ all -> 0x0131 }
            r0 = 1
            if (r1 != r0) goto L_0x011f
            monitor-exit(r2)     // Catch:{ all -> 0x0131 }
            r1 = 0
            return r1
        L_0x011f:
            java.lang.String r1 = r6.A0y     // Catch:{ all -> 0x0131 }
            if (r1 != 0) goto L_0x012f
            byte[] r0 = r6.A1H     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x012f
            java.lang.String r1 = X.C18320x8.A0h(r0)     // Catch:{ UnsupportedEncodingException -> 0x012c }
            goto L_0x012d
        L_0x012c:
            r1 = 0
        L_0x012d:
            r6.A0y = r1     // Catch:{ all -> 0x0131 }
        L_0x012f:
            monitor-exit(r2)     // Catch:{ all -> 0x0131 }
            return r1
        L_0x0131:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0131 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624134x.A13():java.lang.String");
    }

    public static int A05(C624134x r3) {
        return C106495Zf.A00(r3.A1I, r3.A09, C627636p.A0p(r3));
    }

    public static Long A0A(C624134x r1) {
        return Long.valueOf(r1.A1L);
    }

    public static void A0F(ContentValues contentValues, C624134x r3) {
        contentValues.put("message_row_id", Long.valueOf(r3.A1L));
    }

    public static void A0G(ContentValues contentValues, C624134x r3) {
        contentValues.put("sort_id", Long.valueOf(r3.A1M));
    }

    public static void A0I(ContentValues contentValues, C624134x r3) {
        contentValues.put("recipient_count", Integer.valueOf(r3.A0B));
    }

    public static void A0J(ContentValues contentValues, C624134x r3) {
        contentValues.put("message_add_on_flags", Integer.valueOf(r3.A08));
    }

    public static void A0K(C624134x r1, int i) {
        r1.A08 = i | r1.A08;
    }

    public static void A0Y(C624134x r1, Object[] objArr, int i) {
        objArr[i] = String.valueOf(r1.A1L);
    }

    public static boolean A0c(C624134x r1) {
        return r1.A1r(8);
    }

    public static boolean A0d(C624134x r1) {
        return r1.A1s(AnonymousClass35S.A0F);
    }

    public static boolean A0e(C624134x r1) {
        return r1.A1s(2097152);
    }

    public static boolean A0f(C624134x r1) {
        return r1.A1s(4194304);
    }

    public static boolean A0g(C624134x r1) {
        return r1.A1s(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
    }

    public int A0i() {
        int i;
        synchronized (this.A1K) {
            i = this.A02;
        }
        return i;
    }

    public int A0j() {
        if (this instanceof C30551md) {
            return ((C30551md) this).A01;
        }
        return this.A07;
    }

    public int A0l() {
        if (this instanceof C30331mH) {
            return 4;
        }
        return this.A0F;
    }

    public C95814uZ A0n() {
        if (this instanceof C31341o8) {
            return null;
        }
        return this.A0Q;
    }

    public UserJid A0o() {
        int i;
        String str;
        if (this instanceof C30341mI) {
            C30341mI r1 = (C30341mI) this;
            if (r1 instanceof C31191nt) {
                return AnonymousClass32Y.A07(r1);
            }
            if (r1 instanceof C31351o9) {
                return ((C31351o9) r1).A01;
            }
            return null;
        }
        AnonymousClass2z0 r5 = this.A1J;
        C95814uZ r12 = r5.A00;
        if (r12 instanceof C95804uY) {
            return null;
        }
        if (C155477ey.A00(this.A0Q)) {
            return (UserJid) this.A0Q;
        }
        try {
            if ((r12 instanceof C135166kE) && r5.A02) {
                return AnonymousClass1fY.A00;
            }
            if (C627336j.A0K(r12) || (r12 instanceof AnonymousClass1fS)) {
                return (UserJid) this.A0Q;
            }
            return (UserJid) r12;
        } catch (ClassCastException e) {
            if (r12 != null) {
                i = r12.getType();
            } else {
                i = -1;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("FMessage/getSenderUserJid/key.id=");
            AnonymousClass2z0.A0A(r5, A0o2);
            A0o2.append("; key.ChatJidType=");
            A0o2.append(i);
            A0T(this, "; msg_type=", A0o2);
            A0o2.append("; senderJid=");
            A0o2.append(this.A0Q);
            C18280x3.A1C(A0o2, e);
            C95814uZ r2 = this.A0Q;
            if (r2 != null) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("FMessage/getSenderUserJid/SenderJid type: ");
                str = AnonymousClass000.A0h(A0o3, r2.getType());
            } else {
                str = "FMessage/getSenderUserJid/SenderJid is NULL";
            }
            Log.e(str);
            return null;
        }
    }

    public C53252mn A0p() {
        C53252mn r0;
        synchronized (this.A1K) {
            r0 = this.A0W;
        }
        return r0;
    }

    public C51962kf A0q() {
        C51962kf r0;
        synchronized (this.A1K) {
            r0 = this.A0X;
        }
        return r0;
    }

    public C53532nF A0r() {
        C53532nF r0;
        synchronized (this.A1K) {
            r0 = this.A0Y;
        }
        return r0;
    }

    public C51972kg A0s() {
        C51972kg r0;
        synchronized (this.A1K) {
            r0 = this.A0Z;
        }
        return r0;
    }

    public C55162pu A0t() {
        C55162pu r0;
        synchronized (this.A1K) {
            r0 = this.A0a;
        }
        return r0;
    }

    public C51062jD A0u() {
        C51062jD r0;
        synchronized (this.A1K) {
            r0 = this.A0b;
        }
        return r0;
    }

    public AnonymousClass3Z2 A0v() {
        Long l = this.A0q;
        long j = 0;
        if (!AnonymousClass001.A1W(this.A05) && (l == null || l.longValue() <= 0)) {
            return null;
        }
        int i = this.A05;
        if (l != null) {
            j = l.longValue();
        }
        return new AnonymousClass3Z2(i, j, this.A00);
    }

    public C624134x A0w() {
        if ((this instanceof C30341mI) || (this instanceof C30521ma) || (this instanceof C30311mF) || (this instanceof C30331mH)) {
            return null;
        }
        return this.A0d;
    }

    public C40802Hu A0x() {
        C40802Hu r0 = this.A0e;
        if (r0 != null) {
            return r0;
        }
        C40802Hu r02 = new C40802Hu();
        this.A0e = r02;
        return r02;
    }

    public C614630w A0y() {
        C614630w r1;
        synchronized (this.A1K) {
            r1 = this.A0h;
            if (r1 == null && C614630w.A00(this.A1I)) {
                r1 = new C614630w(this);
                this.A0h = r1;
            }
        }
        return r1;
    }

    public C53042mS A0z() {
        C53042mS r0;
        synchronized (this.A1K) {
            r0 = this.A0i;
        }
        return r0;
    }

    public C60432yY A10() {
        C60432yY r0;
        synchronized (this.A1K) {
            r0 = this.A0j;
        }
        return r0;
    }

    public C42602Ou A11() {
        C42602Ou r0;
        synchronized (this.A1K) {
            r0 = this.A0k;
        }
        return r0;
    }

    public AnonymousClass2SV A12() {
        AnonymousClass2SV r0;
        synchronized (this.A1K) {
            r0 = this.A0m;
        }
        return r0;
    }

    public String A14() {
        String str;
        synchronized (this.A1K) {
            str = this.A0x;
        }
        return str;
    }

    public String A15() {
        C95814uZ r0;
        UserJid userJid;
        if (this instanceof C30341mI) {
            C30341mI r2 = (C30341mI) this;
            if (r2 instanceof C31671of) {
                return ((C31671of) r2).A01;
            }
            if (r2 instanceof C31681og) {
                return ((C31351o9) r2).A03;
            }
            if (r2 instanceof C31341o8) {
                C31341o8 r22 = (C31341o8) r2;
                if (r22.A00 != 10 || (userJid = r22.A01) == null) {
                    return null;
                }
                return userJid.getRawString();
            }
            r0 = r2.A0Q;
        } else {
            List list = this.A19;
            if (list != null) {
                return TextUtils.join(",", C627336j.A0O(list));
            }
            r0 = this.A0Q;
        }
        return C627336j.A07(r0);
    }

    public String A16() {
        boolean z;
        Jid jid;
        if (this instanceof C30481mW) {
            return ((C30481mW) this).A06;
        }
        if (this instanceof C31351o9) {
            C31351o9 r1 = (C31351o9) this;
            if (r1 instanceof C31671of) {
                return ((C31671of) r1).A03;
            }
            if (r1 instanceof C31681og) {
                return ((C31681og) r1).A02;
            }
            return r1.A03;
        }
        if (this instanceof C31341o8) {
            C31341o8 r2 = (C31341o8) this;
            if (r2.A00 != 28 || (jid = r2.A01) == null) {
                return null;
            }
        } else {
            if (this instanceof C31321o6) {
                z = ((C31321o6) this).A02;
            } else {
                if (this instanceof C31581oW) {
                    jid = ((C31581oW) this).A01;
                } else if (this instanceof C31561oU) {
                    return ((C31561oU) this).A00;
                } else {
                    if (this instanceof C31601oY) {
                        return ((C31601oY) this).A00;
                    }
                    if (this instanceof C31551oT) {
                        return ((C31551oT) this).A00;
                    }
                    if (this instanceof C31571oV) {
                        jid = ((C31571oV) this).A01;
                    } else if (this instanceof C30291mD) {
                        return ((C30291mD) this).A00;
                    } else {
                        if (this instanceof C30471mV) {
                            return ((C30471mV) this).A02;
                        }
                        if (this instanceof C30801n8) {
                            return ((C30801n8) this).A03;
                        }
                        if (this instanceof C30391mN) {
                            return ((C30391mN) this).A04;
                        }
                        if (this instanceof C30941nT) {
                            return ((C30941nT) this).A01;
                        }
                        if (this instanceof C30961nV) {
                            return C627336j.A07(((C30961nV) this).A00);
                        }
                        if (this instanceof C30321mG) {
                            C30321mG r12 = (C30321mG) this;
                            if (!r12.A00) {
                                return null;
                            }
                            z = r12.A01;
                        } else if (this instanceof C30381mM) {
                            return ((C30381mM) this).A02;
                        } else {
                            return null;
                        }
                    }
                }
                if (jid == null) {
                    return null;
                }
            }
            if (z) {
                return "video";
            }
            return "audio";
        }
        return jid.getRawString();
    }

    public String A17() {
        if (this instanceof C31351o9) {
            C31351o9 r1 = (C31351o9) this;
            if (r1 instanceof C31671of) {
                return ((C31671of) r1).A04;
            }
            if (r1 instanceof C31681og) {
                return ((C31681og) r1).A03;
            }
            return C627336j.A07(r1.A01);
        } else if (this instanceof C30471mV) {
            return ((C30471mV) this).A03;
        } else {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.1n1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1p8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1n1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.1n1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A18() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r3.A13()
            return r0
        L_0x0009:
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0025
            r2 = r3
            X.1mI r2 = (X.C30341mI) r2
            boolean r0 = r2 instanceof X.C31611oZ
            if (r0 == 0) goto L_0x0020
            X.1oZ r2 = (X.C31611oZ) r2
            java.lang.Object r1 = r2.A1K
            monitor-enter(r1)
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        L_0x0020:
            java.lang.String r0 = r2.A13()
            return r0
        L_0x0025:
            boolean r0 = r3 instanceof X.C30451mT
            if (r0 == 0) goto L_0x002f
            r0 = r3
            X.1mT r0 = (X.C30451mT) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x002f:
            boolean r0 = r3 instanceof X.C30291mD
            if (r0 == 0) goto L_0x0039
            r0 = r3
            X.1mD r0 = (X.C30291mD) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x0039:
            boolean r0 = r3 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0043
            r0 = r3
            X.1n8 r0 = (X.C30801n8) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x0043:
            boolean r0 = r3 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0058
            r2 = r3
            X.1n7 r2 = (X.C30791n7) r2
            boolean r0 = A0e(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0057
            X.39W r0 = r2.A00
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = r0.A08
        L_0x0057:
            return r1
        L_0x0058:
            boolean r0 = r3 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0087
            r1 = r3
            X.1mV r1 = (X.C30471mV) r1
            boolean r0 = r1 instanceof X.C31941p8
            if (r0 == 0) goto L_0x0072
            X.1p8 r1 = (X.C31941p8) r1
            boolean r0 = A0e(r1)
            if (r0 == 0) goto L_0x0081
            X.39W r0 = r1.A00
        L_0x006d:
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r0.A08
            return r0
        L_0x0072:
            boolean r0 = r1 instanceof X.AnonymousClass1n1
            if (r0 == 0) goto L_0x0084
            X.1n1 r1 = (X.AnonymousClass1n1) r1
            boolean r0 = A0e(r1)
            if (r0 == 0) goto L_0x0081
            X.39W r0 = r1.A00
            goto L_0x006d
        L_0x0081:
            java.lang.String r0 = r1.A02
            return r0
        L_0x0084:
            java.lang.String r0 = r1.A02
            return r0
        L_0x0087:
            boolean r0 = r3 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0091
            r0 = r3
            X.1mN r0 = (X.C30391mN) r0
            java.lang.String r0 = r0.A04
            return r0
        L_0x0091:
            boolean r0 = r3 instanceof X.C30411mP
            if (r0 == 0) goto L_0x009b
            r0 = r3
            X.1mP r0 = (X.C30411mP) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x009b:
            boolean r0 = r3 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x00a5
            r0 = r3
            X.1mQ r0 = (X.C30421mQ) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x00a5:
            boolean r0 = r3 instanceof X.C30381mM
            if (r0 == 0) goto L_0x00af
            r0 = r3
            X.1mM r0 = (X.C30381mM) r0
            java.lang.String r0 = r0.A02
            return r0
        L_0x00af:
            boolean r0 = r3 instanceof X.C30461mU
            if (r0 == 0) goto L_0x00b9
            r0 = r3
            X.1mU r0 = (X.C30461mU) r0
            java.lang.String r0 = r0.A04
            return r0
        L_0x00b9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624134x.A18():java.lang.String");
    }

    public List A19() {
        boolean z;
        String str;
        if (!(this instanceof C30341mI)) {
            return this.A19;
        }
        C30341mI r1 = (C30341mI) this;
        if (r1 instanceof C31351o9) {
            z = false;
            str = "should not be called for FMessageSystemPayment";
        } else if (r1 instanceof C31891p1) {
            return ((C31891p1) r1).A01;
        } else {
            z = false;
            str = "should not be called for FMessageSystem";
        }
        C626936e.A0D(z, str);
        return null;
    }

    public void A1A() {
        String str;
        if (this instanceof C30341mI) {
            str = "Cannot change status for FMessageSystem";
        } else if (this instanceof C30321mG) {
            str = "Cannot change status for calls message type";
        } else {
            this.A0D = 0;
            return;
        }
        C626936e.A0D(false, str);
    }

    public void A1B(int i) {
        this.A0A = i | this.A0A;
    }

    public void A1C(int i) {
        this.A0A = (~i) & this.A0A;
    }

    public void A1D(int i) {
        synchronized (this.A1K) {
            this.A02 = i;
        }
    }

    public void A1E(int i) {
        if (!(this instanceof C30521ma) && !(this instanceof C30311mF)) {
            if (i <= 0) {
                this.A05 = 0;
                A1C(256);
                return;
            }
            this.A05 = i;
            A1B(256);
        }
    }

    public void A1F(int i) {
        if (this instanceof C30481mW) {
            ((C30481mW) this).A00 = i;
        } else if (this instanceof C31681og) {
            ((C31681og) this).A00 = i;
        } else if (this instanceof C31301o4) {
            ((C31301o4) this).A01 = AnonymousClass001.A1T(i);
        } else if (this instanceof C31291o3) {
            ((C31291o3) this).A01 = i;
        } else if (this instanceof C31891p1) {
            C31891p1 r1 = (C31891p1) this;
            if (r1 instanceof C31571oV) {
                ((C31571oV) r1).A00 = i;
            } else {
                r1.A00 = i;
            }
        } else if (this instanceof C31271o1) {
            ((C31271o1) this).A00 = i;
        } else if (this instanceof C30801n8) {
            ((C30801n8) this).A00 = i;
        } else if (this instanceof C30351mJ) {
            ((C30351mJ) this).A01 = i;
        } else if (this instanceof C30471mV) {
            C30471mV r12 = (C30471mV) this;
            if (r12 instanceof AnonymousClass1nF) {
                ((AnonymousClass1nF) r12).A00 = i;
            } else {
                r12.A0B = i;
            }
        } else if (this instanceof C30701ms) {
            C30701ms r13 = (C30701ms) this;
            if (i > 0) {
                r13.A00 = true;
                r13.A00 = i;
            }
        }
    }

    public void A1G(int i) {
        if (AnonymousClass358.A00(this.A0D, i) > 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0S(this, "FMessage/setStatus/statusDowngrade/key=", A0o2);
            A0T(this, "; type=", A0o2);
            A0O(this, "; current=", A0o2);
            C18260x0.A0x("; new=", A0o2, i);
        }
        this.A0D = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == r5) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1H(int r5) {
        /*
            r4 = this;
            int r3 = r4.A0F
            if (r3 == 0) goto L_0x0007
            r2 = 0
            if (r3 != r5) goto L_0x0008
        L_0x0007:
            r2 = 1
        L_0x0008:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            X.C626936e.A0D(r2, r0)
            r4.A0F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624134x.A1H(int):void");
    }

    public void A1J(C95814uZ r5) {
        int i;
        if (this instanceof C30341mI) {
            C30341mI r2 = (C30341mI) this;
            if (r2 instanceof C31351o9) {
                if (r5 == null) {
                    return;
                }
                if (!r2.A1v()) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0S(r2, "should not be called for FMessageSystem, key = ", A0o2);
                    A0o2.append(" action = ");
                    A0o2.append(r2.A00);
                    C18270x1.A0z(A0o2);
                }
            } else if (!(r2 instanceof C31341o8) && r5 != null) {
                if (!r2.A1v()) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0S(r2, "FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ", A0o3);
                    A0o3.append(" action = ");
                    C18270x1.A1F(A0o3, r2.A00);
                    return;
                }
            } else {
                return;
            }
            r2.A0Q = r5;
            return;
        }
        if (r5 != null && !(r5 instanceof UserJid) && !(r5 instanceof AnonymousClass1fS)) {
            AnonymousClass2z0 r3 = this.A1J;
            C95814uZ r0 = r3.A00;
            if (r0 != null) {
                i = r0.getType();
            } else {
                i = -1;
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("FMessage/setSenderUserJid/senderJid not a UserJid; key.id=");
            AnonymousClass2z0.A0A(r3, A0o4);
            A0o4.append("; key.ChatJidType=");
            A0o4.append(i);
            A0T(this, "; msg_type=", A0o4);
            C18260x0.A1Q(A0o4, "; senderJid=", r5);
        }
        this.A0Q = r5;
        this.A19 = null;
    }

    public void A1K(C51962kf r3) {
        synchronized (this.A1K) {
            this.A0X = r3;
        }
    }

    public void A1L(C53532nF r3) {
        synchronized (this.A1K) {
            this.A0Y = r3;
        }
    }

    public void A1M(C51972kg r3) {
        synchronized (this.A1K) {
            this.A0Z = r3;
        }
    }

    public void A1N(C55162pu r6) {
        synchronized (this.A1K) {
            this.A0a = r6;
            if (r6 == null) {
                A1C(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
            } else {
                if (r6 instanceof C30211m5) {
                    A1B(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                } else {
                    A1C(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                }
                if (r6 instanceof C30221m6) {
                    this.A1P |= (long) 16;
                }
            }
        }
    }

    public void A1O(C51062jD r3) {
        synchronized (this.A1K) {
            this.A0b = r3;
        }
    }

    public void A1P(AnonymousClass2U8 r2) {
        this.A0c = r2;
        if (r2 == null) {
            A1C(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        } else {
            A1B(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public void A1Q(C624134x r4) {
        ArrayList arrayList;
        int i;
        this.A1L = r4.A1L;
        this.A1M = r4.A1M;
        this.A0K = r4.A0K;
        this.A0I = r4.A0I;
        this.A0Q = r4.A0n();
        this.A1R = r4.A1R;
        if (r4.A19() != null) {
            arrayList = AnonymousClass002.A0J(r4.A19());
        } else {
            arrayList = null;
        }
        this.A19 = arrayList;
        this.A0J = r4.A0J;
        this.A1C = r4.A1C;
        this.A1N = r4.A1N;
        A0K(this, r4.A08);
        C624034w r2 = r4.A0P;
        if (r2 != null && (this.A0P == null || !((i = r2.A03) == 4 || i == 20))) {
            this.A15 = r4.A15;
            this.A0P = r2;
        }
        int i2 = r4.A05;
        if (i2 > 0) {
            this.A05 = i2;
            this.A0r = r4.A0r;
            this.A07 = r4.A07;
        }
    }

    public void A1R(C624134x r4) {
        boolean z;
        String str;
        if (r4 != null) {
            if ((this instanceof C30341mI) || (this instanceof C30521ma) || (this instanceof C30311mF) || (this instanceof C30331mH)) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = false;
            if (!z) {
                str = "message type is not allowed to have a quoted message";
            } else if ((r4 instanceof C30341mI) || (r4 instanceof C30521ma) || (r4 instanceof C30311mF) || (r4 instanceof C30331mH)) {
                str = "message type can not be a quoted message";
            } else {
                if (r4.A0l() == 2) {
                    z2 = true;
                }
                C626936e.A0D(z2, "quoted message should be marked StorageType.QUOTED");
                r4.A1R((C624134x) null);
            }
            C626936e.A0D(false, str);
            return;
        }
        this.A0d = r4;
    }

    public void A1S(C52652lp r3) {
        synchronized (this.A1K) {
            this.A0g = r3;
        }
    }

    public void A1T(C53042mS r3) {
        synchronized (this.A1K) {
            this.A0i = r3;
        }
    }

    public void A1V(C42602Ou r4) {
        synchronized (this.A1K) {
            this.A0k = r4;
            int i = 1;
            if (!AnonymousClass2z0.A0C(this)) {
                this.A1Z = true;
            } else {
                i = 3;
            }
            this.A01 = i;
        }
    }

    public void A1W(C55592qb r2) {
        this.A0l = r2;
        if (r2 == null) {
            A1C(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        } else {
            A1B(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void A1X(AnonymousClass2SV r3) {
        synchronized (this.A1K) {
            this.A0m = r3;
        }
    }

    public void A1Y(Long l) {
        if (this instanceof C30521ma) {
            C626936e.A06(l);
            C162457s7.A0H(l);
            ((C30521ma) this).A01 = l.longValue();
            return;
        }
        if (this instanceof C30311mF) {
            C626936e.A0D(false, "For FMessageEphemeralSettingChange the setting timestamp is the timestamp");
        }
        this.A0q = l;
    }

    public void A1Z(String str) {
        synchronized (this.A1K) {
            this.A0y = str;
            this.A1H = null;
        }
    }

    public void A1a(String str) {
        if (this instanceof C30471mV) {
            C30471mV r2 = (C30471mV) this;
            r2.A08 = str;
            if (!TextUtils.isEmpty(str)) {
                r2.A1B(64);
            } else {
                r2.A1C(64);
            }
        } else {
            this.A0A &= -65;
        }
    }

    public void A1b(String str) {
        synchronized (this.A1K) {
            this.A0x = str;
        }
    }

    public void A1c(String str) {
        boolean z;
        if (this instanceof C30481mW) {
            ((C30481mW) this).A06 = str;
        } else if (this instanceof C31351o9) {
            C31351o9 r1 = (C31351o9) this;
            if (r1 instanceof C31671of) {
                ((C31671of) r1).A03 = str;
            } else if (r1 instanceof C31681og) {
                ((C31681og) r1).A02 = str;
            } else {
                r1.A03 = str;
            }
        } else if (this instanceof C31341o8) {
            C31341o8 r2 = (C31341o8) this;
            if (r2.A00 == 28) {
                r2.A01 = AnonymousClass32Y.A08(str);
            }
        } else if (this instanceof C31321o6) {
            ((C31321o6) this).A02 = "video".equals(str);
        } else if (this instanceof C31581oW) {
            ((C31581oW) this).A01 = AnonymousClass34R.A04(str);
        } else if (this instanceof C31561oU) {
            ((C31561oU) this).A00 = str;
        } else if (this instanceof C31601oY) {
            ((C31601oY) this).A00 = str;
        } else if (this instanceof C31551oT) {
            ((C31551oT) this).A00 = str;
        } else if (this instanceof C31571oV) {
            ((C31571oV) this).A01 = AnonymousClass34R.A04(str);
        } else if (this instanceof C30291mD) {
            ((C30291mD) this).A00 = str;
        } else if (this instanceof C30471mV) {
            ((C30471mV) this).A02 = str;
        } else if (this instanceof C30801n8) {
            ((C30801n8) this).A03 = str;
        } else if (this instanceof C30391mN) {
            ((C30391mN) this).A04 = str;
        } else if (this instanceof C30941nT) {
            ((C30941nT) this).A01 = str;
        } else if (this instanceof C30961nV) {
            ((C30961nV) this).A00 = AnonymousClass32Y.A08(str);
        } else if (this instanceof C30321mG) {
            C30321mG r12 = (C30321mG) this;
            if (!TextUtils.isEmpty(str)) {
                r12.A01 = "video".equals(str);
                z = true;
            } else {
                z = false;
            }
            r12.A00 = z;
        } else if (this instanceof C30381mM) {
            ((C30381mM) this).A02 = str;
        }
    }

    public void A1d(String str) {
        if (this instanceof C31351o9) {
            C31351o9 r1 = (C31351o9) this;
            if (r1 instanceof C31671of) {
                ((C31671of) r1).A04 = str;
            } else if (r1 instanceof C31681og) {
                ((C31681og) r1).A03 = str;
            } else {
                r1.A01 = AnonymousClass32Y.A08(str);
            }
        } else if (this instanceof C30471mV) {
            ((C30471mV) this).A03 = str;
        }
    }

    public void A1e(String str) {
        if (this instanceof C30481mW) {
            ((C30481mW) this).A07 = str;
        } else if (this instanceof C31671of) {
            ((C31671of) this).A02 = str;
        } else if (this instanceof C31681og) {
            ((C31681og) this).A04 = str;
        } else if (this instanceof C31571oV) {
            C31571oV r3 = (C31571oV) this;
            Integer num = null;
            if (str != null) {
                try {
                    num = Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    Log.e("FMessageSystemCommunityLinkChanged/could not format number. Error = ", e);
                }
            }
            r3.A02 = num;
        } else if (this instanceof C31271o1) {
            ((C31271o1) this).A01 = str;
        } else if (this instanceof AnonymousClass1n9) {
            ((AnonymousClass1n9) this).A02 = str;
        } else if (this instanceof C30471mV) {
            ((C30471mV) this).A07 = str;
        }
    }

    public void A1f(String str) {
        C31941p8 r1;
        AnonymousClass39W r0;
        AnonymousClass39W r12;
        if (this instanceof C30481mW) {
            A1Z(str);
        } else if (this instanceof C30341mI) {
            C30341mI r2 = (C30341mI) this;
            if (r2 instanceof C31611oZ) {
                C31611oZ r22 = (C31611oZ) r2;
                synchronized (r22.A1K) {
                    r22.A00 = str;
                }
                return;
            }
            r2.A1Z(str);
        } else if (this instanceof C30451mT) {
            C30451mT r02 = (C30451mT) this;
            if (str == null) {
                str = "";
            }
            r02.A03 = str;
        } else if (this instanceof C30291mD) {
            ((C30291mD) this).A00 = str;
        } else if (this instanceof C30801n8) {
            ((C30801n8) this).A03 = str;
        } else if (this instanceof C30791n7) {
            C30791n7 r13 = (C30791n7) this;
            if (A0e(r13) && (r12 = r13.A00) != null && r12.A08 != null) {
                r12.A08 = str;
            }
        } else if (this instanceof C30471mV) {
            C30471mV r14 = (C30471mV) this;
            if (r14 instanceof C31941p8) {
                C31941p8 r15 = (C31941p8) r14;
                boolean A0e2 = A0e(r15);
                r1 = r15;
                if (A0e2) {
                    r0 = r15.A00;
                }
                r1.A02 = str;
                return;
            }
            boolean z = r14 instanceof AnonymousClass1n1;
            r1 = r14;
            if (z) {
                AnonymousClass1n1 r16 = (AnonymousClass1n1) r14;
                boolean A0e3 = A0e(r16);
                r1 = r16;
                if (A0e3) {
                    r0 = r16.A00;
                }
            }
            r1.A02 = str;
            return;
            if (r0 != null) {
                r0.A08 = str;
            }
        } else if (this instanceof C30391mN) {
            ((C30391mN) this).A04 = str;
        } else if (this instanceof C30411mP) {
            ((C30411mP) this).A00 = str;
        } else if (this instanceof C30421mQ) {
            ((C30421mQ) this).A00 = str;
        } else if (this instanceof C30381mM) {
            ((C30381mM) this).A02 = str;
        } else if (this instanceof C30461mU) {
            C30461mU r03 = (C30461mU) this;
            if (str != null) {
                r03.A04 = str;
            }
        }
    }

    public void A1g(List list) {
        if (list == null || list.isEmpty()) {
            this.A18 = null;
            return;
        }
        this.A18 = AnonymousClass002.A0J(list);
        this.A1P |= 1;
    }

    public void A1h(List list) {
        boolean z;
        String str;
        if (this instanceof C30341mI) {
            C30341mI r1 = (C30341mI) this;
            if (r1 instanceof C31351o9) {
                z = false;
                str = "should not be called for FMessageSystemPayment";
            } else if (r1 instanceof C31891p1) {
                C31891p1 r12 = (C31891p1) r1;
                if (list == null) {
                    list = AnonymousClass001.A0s();
                }
                r12.A01 = list;
                return;
            } else {
                z = false;
                str = "should not be called for FMessageSystem";
            }
            C626936e.A0D(z, str);
            return;
        }
        this.A0Q = null;
        this.A19 = list;
    }

    public void A1i(boolean z) {
        synchronized (this.A1K) {
            this.A1X = z;
        }
    }

    public void A1j(byte[] bArr) {
        synchronized (this.A1K) {
            this.A1H = bArr;
            this.A0y = null;
            this.A02 = 1;
        }
    }

    public boolean A1k() {
        boolean z;
        synchronized (this.A1K) {
            z = this.A1X;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A1H != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1l() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A1K
            monitor-enter(r2)
            java.lang.String r0 = r3.A0y     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            byte[] r1 = r3.A1H     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624134x.A1l():boolean");
    }

    public boolean A1m() {
        List list = this.A18;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A1n() {
        byte[] bArr = this.A1a;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean A1o() {
        if (this.A1M < -1 || AnonymousClass000.A1U(this.A0A & 1048576, 1048576)) {
            return true;
        }
        return false;
    }

    public boolean A1p() {
        if (this instanceof C30451mT) {
            return !AnonymousClass2z0.A0C(this);
        }
        if (this instanceof C30351mJ) {
            return !AnonymousClass2z0.A0C(this);
        }
        boolean z = this instanceof C30461mU;
        boolean A0C2 = AnonymousClass2z0.A0C(this);
        if (z) {
            return !A0C2;
        }
        if (A0C2 || !this.A1D) {
            return false;
        }
        return true;
    }

    public boolean A1q() {
        if ((this instanceof C30341mI) || (this instanceof C30281mC) || (this instanceof C30351mJ) || (this instanceof C30541mc) || (this instanceof C30321mG) || (this instanceof C30401mO)) {
            return false;
        }
        return true;
    }

    public boolean A1r(int i) {
        long j = (long) i;
        return AnonymousClass000.A1T(((this.A1P & j) > j ? 1 : ((this.A1P & j) == j ? 0 : -1)));
    }

    public boolean A1s(int i) {
        return AnonymousClass000.A1U(this.A0A & i, i);
    }

    public boolean A1t(AnonymousClass4FP r3) {
        synchronized (this.A1K) {
            if (this.A0L != null) {
                Log.e("FMessage/setMessageReactions re-assigning messageReactions");
                return false;
            }
            this.A0L = r3;
            return true;
        }
    }

    public byte[] A1u() {
        byte[] bArr;
        String str;
        synchronized (this.A1K) {
            bArr = this.A1H;
            if (bArr == null && (str = this.A0y) != null) {
                try {
                    bArr = str.getBytes(C58152un.A0B);
                } catch (UnsupportedEncodingException unused) {
                    bArr = null;
                }
                this.A1H = bArr;
            }
        }
        return bArr;
    }

    public C624134x(AnonymousClass2z0 r4, byte b, long j) {
        this.A1c = AnonymousClass001.A0t();
        this.A1W = false;
        this.A1Y = false;
        this.A0E = 3;
        this.A0J = -1;
        this.A1L = -1;
        this.A1M = -1;
        this.A0p = null;
        this.A10 = null;
        this.A1V = false;
        this.A0F = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A0o = null;
        this.A07 = 0;
        this.A1K = AnonymousClass002.A0D();
        this.A1D = false;
        this.A0s = null;
        C626936e.A06(r4);
        this.A1J = r4;
        this.A0K = j;
        this.A1I = b;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A1b = uptimeMillis;
        this.A1Q = uptimeMillis;
    }

    public static ContentValues A06(C624134x r4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.valueOf(r4.A1L));
        return contentValues;
    }

    public static AnonymousClass2z0 A08(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        return r0.A1J;
    }

    public static AnonymousClass2z0 A09(C624134x r0, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        AnonymousClass2z0 r1 = r0.A1J;
        sb.append(r1);
        C626936e.A0E(z, sb.toString());
        return r1;
    }

    public static String A0B(C95814uZ r1, C66553Lw r2, C624134x r3) {
        return r2.A0K(r3.A0n(), r1);
    }

    public static String A0C(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1L);
        return sb.toString();
    }

    public static List A0D(AnonymousClass39V[] r2) {
        return Collections.singletonList(new AnonymousClass36K("meta", r2));
    }

    public static void A0E(ContentValues contentValues, C624134x r3) {
        contentValues.put("origination_flags", Integer.valueOf(r3.A0k()));
        contentValues.put("origin", Integer.valueOf(r3.A09));
        contentValues.put("timestamp", Long.valueOf(r3.A0K));
    }

    public static void A0H(ContentValues contentValues, C624134x r4) {
        contentValues.put("message_row_id", Long.valueOf(r4.A1L));
    }

    public static void A0L(C624134x r1, long j) {
        r1.A1Y(Long.valueOf(j));
    }

    public static void A0M(C624134x r2, C624134x r3, boolean z) {
        C624134x r1;
        if (!(r2.A0y() == null || r3.A0y() == null || !r2.A0y().A06() || r2.A0y().A09() == null)) {
            r3.A0y().A04(r2.A0y().A09(), z);
        }
        C624134x r22 = r2.A0d;
        if (r22 != null && (r1 = r3.A0d) != null) {
            A0M(r22, r1, true);
        }
    }

    public static void A0N(C624134x r4, C183538qC r5) {
        ((AnonymousClass35R) r5.get()).A0F((AnonymousClass4DV) r4, r4.A1L);
    }

    public static void A0O(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0D);
    }

    public static void A0P(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1L);
    }

    public static void A0Q(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1J);
        Log.w(sb.toString());
    }

    public static void A0R(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0n());
    }

    public static void A0S(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1J);
    }

    public static void A0T(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1I);
    }

    public static void A0U(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1I);
        Log.w(sb.toString());
    }

    public static void A0V(C624134x r0, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(r0.A1J);
        C626936e.A0E(z, sb.toString());
    }

    public static void A0W(C624134x r0, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(r0.A1I);
        C626936e.A0E(z, sb.toString());
    }

    public static void A0Z(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(((C624134x) it.next()).A1L));
    }

    public static boolean A0a(C624134x r0) {
        return TextUtils.isEmpty(r0.A13());
    }

    public static boolean A0b(C624134x r0) {
        return C155477ey.A00(r0.A0n());
    }

    public static boolean A0h(C624134x r0, C183538qC r1) {
        r1.get();
        return C155477ey.A00(r0.A0o());
    }

    public long A0m() {
        long A092 = C18290x4.A09(A1m() ? 1 : 0);
        if (this.A0d != null || this.A0H > 0) {
            A092 |= 2;
        }
        if (this.A15 != null) {
            A092 |= 4;
        }
        if (A0c(this)) {
            A092 |= 8;
        }
        if (A1r(16)) {
            A092 |= 16;
        }
        if (this.A0Z != null) {
            A092 |= 32;
        }
        if (this.A0b != null) {
            A092 |= 64;
        }
        if (this.A0i != null) {
            return A092 | 128;
        }
        return A092;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x063f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1I(android.database.Cursor r18, X.C623334p r19) {
        /*
            r17 = this;
            java.lang.String r0 = "table_version"
            r7 = r18
            int r2 = r7.getColumnIndex(r0)
            r6 = r17
            long r0 = X.C18270x1.A01(r7)
            r6.A1L = r0
            if (r2 >= 0) goto L_0x0644
            long r0 = r6.A1L
            r6.A1M = r0
            java.lang.String r0 = "status"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A1G(r0)
            java.lang.String r0 = "needs_push"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r2 = 0
            r5 = 1
            r14 = 2
            boolean r0 = X.AnonymousClass000.A1U(r0, r14)
            r6.A1B = r0
            java.lang.String r0 = "recipient_count"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A0B = r0
            java.lang.String r0 = "participant_hash"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A14 = r0
            java.lang.String r0 = "origination_flags"
            int r0 = r7.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x0052
            java.lang.String r0 = "forwarded"
            int r0 = r7.getColumnIndexOrThrow(r0)
        L_0x0052:
            int r0 = r7.getInt(r0)
            r6.A1B(r0)
            java.lang.String r0 = "message_add_on_flags"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            A0K(r6, r0)
            java.lang.String r0 = "origin"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A09 = r0
            java.lang.String r0 = "received_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A0I = r0
            java.lang.String r0 = "receipt_server_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A0J = r0
            java.lang.String r0 = "starred"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            if (r0 != r5) goto L_0x0087
            r2 = 1
        L_0x0087:
            r6.A1F = r2
            java.lang.String r0 = "remote_resource"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r7, r0)
            boolean r0 = r6 instanceof X.C30341mI
            if (r0 == 0) goto L_0x00fd
            r3 = r6
            X.1mI r3 = (X.C30341mI) r3
            boolean r0 = r3 instanceof X.C31671of
            if (r0 == 0) goto L_0x00b3
            X.1of r3 = (X.C31671of) r3
            r3.A01 = r2
        L_0x009f:
            java.lang.String r0 = "lookup_tables"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A1P = r0
            java.lang.String r0 = "thumb_image"
            byte[] r0 = X.C18280x3.A1Z(r7, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0154
            goto L_0x0137
        L_0x00b3:
            boolean r0 = r3 instanceof X.C31681og
            if (r0 == 0) goto L_0x00bc
            X.1o9 r3 = (X.C31351o9) r3
            r3.A03 = r2
            goto L_0x009f
        L_0x00bc:
            boolean r0 = r3 instanceof X.C31341o8
            if (r0 == 0) goto L_0x00cf
            X.1o8 r3 = (X.C31341o8) r3
            int r1 = r3.A00
            r0 = 10
            if (r1 != r0) goto L_0x009f
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r2)
            r3.A01 = r0
            goto L_0x009f
        L_0x00cf:
            r0 = 0
            r3.A0Q = r0
            boolean r0 = r3.A1v()
            if (r0 == 0) goto L_0x009f
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x009f
            X.4uZ r0 = X.C18310x6.A0S(r2)
            r3.A0Q = r0
            if (r0 != 0) goto L_0x009f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Something went wrong with this message, key = "
            A0S(r3, r0, r1)
            java.lang.String r0 = " action = "
            r1.append(r0)
            int r0 = r3.A00
            r1.append(r0)
            X.C18270x1.A0z(r1)
            goto L_0x009f
        L_0x00fd:
            X.2z0 r0 = r6.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0119
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 != 0) goto L_0x0119
            if (r2 == 0) goto L_0x0119
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.List r0 = X.C18310x6.A0t(r2)
            java.util.List r0 = X.C627336j.A0B(r1, r0)
            r6.A1h(r0)
            goto L_0x009f
        L_0x0119:
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0126
            com.whatsapp.jid.UserJid r0 = X.C627336j.A05(r2)
        L_0x0121:
            r6.A1J(r0)
            goto L_0x009f
        L_0x0126:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0132
            r0 = 0
            r6.A1J(r0)
            goto L_0x009f
        L_0x0132:
            X.4uZ r0 = X.C18310x6.A0S(r2)
            goto L_0x0121
        L_0x0137:
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0156 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0156 }
            r0.<init>(r1)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0156 }
            java.lang.Object r4 = r0.readObject()     // Catch:{ all -> 0x014a }
            r0.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0148 }
            goto L_0x015d
        L_0x0148:
            r1 = move-exception
            goto L_0x0158
        L_0x014a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x014f }
            goto L_0x0153
        L_0x014f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0156 }
        L_0x0153:
            throw r1     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0156 }
        L_0x0154:
            r4 = r9
            goto L_0x015d
        L_0x0156:
            r1 = move-exception
            r4 = r9
        L_0x0158:
            java.lang.String r0 = "MessageStoreMessageUtils/readMessageFromCursor"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x015d:
            byte r1 = r6.A1I
            java.lang.String r2 = "data"
            if (r1 == r5) goto L_0x0623
            r0 = 5
            if (r1 == r0) goto L_0x0623
            r0 = 3
            if (r1 == r0) goto L_0x0623
            r0 = 81
            if (r1 == r0) goto L_0x0623
            if (r1 == r14) goto L_0x0623
            r0 = 9
            if (r1 == r0) goto L_0x0623
            r0 = 13
            if (r1 == r0) goto L_0x0623
            r0 = 14
            if (r1 == r0) goto L_0x0623
            r0 = 12
            if (r1 == r0) goto L_0x0623
            r0 = 16
            if (r1 == r0) goto L_0x0623
            r0 = 20
            if (r1 == r0) goto L_0x0623
            r0 = 23
            if (r1 == r0) goto L_0x0623
            r0 = 37
            if (r1 == r0) goto L_0x0623
            r0 = 24
            if (r1 == r0) goto L_0x0623
            r0 = 25
            if (r1 == r0) goto L_0x0623
            r0 = 26
            if (r1 == r0) goto L_0x0623
            r0 = 28
            if (r1 == r0) goto L_0x0623
            r0 = 29
            if (r1 == r0) goto L_0x0623
            r0 = 30
            if (r1 == r0) goto L_0x0623
            r0 = 42
            if (r1 == r0) goto L_0x0623
            r0 = 43
            if (r1 == r0) goto L_0x0623
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r2)
            r6.A1Z(r0)
        L_0x01b6:
            int r0 = r6.A0i()
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = r6.A13()
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = ""
            r6.A1Z(r0)
        L_0x01c7:
            java.lang.String r0 = "media_url"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A1e(r0)
            java.lang.String r0 = "media_mime_type"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r7, r0)
            boolean r8 = r6 instanceof X.C30481mW
            if (r8 == 0) goto L_0x0618
            r0 = r6
            X.1mW r0 = (X.C30481mW) r0
            r0.A05 = r1
        L_0x01df:
            java.lang.String r0 = "media_size"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            boolean r12 = r6 instanceof X.C30441mS
            if (r12 == 0) goto L_0x05ee
            r2 = r6
            X.1mS r2 = (X.C30441mS) r2
            r2.A00 = r0
        L_0x01ee:
            java.lang.String r0 = "media_name"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r7, r0)
            if (r8 == 0) goto L_0x0505
            r0 = r6
            X.1mW r0 = (X.C30481mW) r0
            r0.A04 = r1
        L_0x01fb:
            java.lang.String r0 = "media_caption"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A1c(r0)
            java.lang.String r0 = "media_hash"
            java.lang.String r3 = X.AnonymousClass0x2.A0Z(r7, r0)
            boolean r2 = r6 instanceof X.C31351o9
            if (r2 == 0) goto L_0x04fa
            r1 = r6
            X.1o9 r1 = (X.C31351o9) r1
            boolean r0 = r1 instanceof X.C31671of
            if (r0 == 0) goto L_0x04e8
            X.1of r1 = (X.C31671of) r1
            r1.A00 = r3
        L_0x0219:
            java.lang.String r0 = "media_enc_hash"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A1d(r0)
            java.lang.String r0 = "media_duration"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A1F(r0)
            java.lang.String r0 = "latitude"
            double r0 = X.C18310x6.A00(r7, r0)
            boolean r3 = r6 instanceof X.C30361mK
            if (r3 == 0) goto L_0x023a
            r10 = r6
            X.1mK r10 = (X.C30361mK) r10
            r10.A00 = r0
        L_0x023a:
            java.lang.String r0 = "longitude"
            double r0 = X.C18310x6.A00(r7, r0)
            if (r3 == 0) goto L_0x0247
            r10 = r6
            X.1mK r10 = (X.C30361mK) r10
            r10.A01 = r0
        L_0x0247:
            java.lang.String r0 = "future_message_type"
            int r1 = X.AnonymousClass0x2.A04(r7, r0)
            boolean r0 = r6 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0256
            r0 = r6
            X.1mJ r0 = (X.C30351mJ) r0
            r0.A00 = r1
        L_0x0256:
            java.lang.String r0 = "quoted_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A0H = r0
            java.lang.String r0 = "multicast_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A1a(r0)
            java.lang.String r0 = "edit_version"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A01 = r0
            java.lang.String r0 = "mentioned_jids"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            java.util.List r0 = X.C624435a.A03(r0)
            r6.A1g(r0)
            java.lang.String r0 = "preview_type"
            int r10 = X.AnonymousClass0x2.A04(r7, r0)
            if (r8 == 0) goto L_0x049a
            r0 = r6
            X.1mW r0 = (X.C30481mW) r0
            r0.A01 = r10
        L_0x028c:
            if (r8 == 0) goto L_0x02c2
            r1 = r6
            X.1mW r1 = (X.C30481mW) r1
            boolean r0 = r4 instanceof com.whatsapp.TextData
            if (r0 == 0) goto L_0x02a6
            com.whatsapp.TextData r4 = (com.whatsapp.TextData) r4
            r1.A1x(r4)
        L_0x029a:
            r6.A1R = r9
            java.lang.String r0 = "payment_transaction_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A15 = r0
            return
        L_0x02a6:
            boolean r0 = r4 instanceof byte[]
            if (r0 != 0) goto L_0x02bd
            if (r4 == 0) goto L_0x02bd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageText/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class="
            java.lang.Class r0 = X.C18310x6.A0c(r4, r0, r1)
            r1.append(r0)
            X.C18270x1.A0z(r1)
            goto L_0x029a
        L_0x02bd:
            byte[] r4 = (byte[]) r4
            r1.A08 = r4
            goto L_0x029a
        L_0x02c2:
            boolean r0 = r6 instanceof X.C31331o7
            if (r0 == 0) goto L_0x02d2
            r1 = r6
            X.1o7 r1 = (X.C31331o7) r1
            boolean r0 = r4 instanceof com.whatsapp.data.ProfilePhotoChange
            if (r0 == 0) goto L_0x029a
            com.whatsapp.data.ProfilePhotoChange r4 = (com.whatsapp.data.ProfilePhotoChange) r4
            r1.A00 = r4
            goto L_0x029a
        L_0x02d2:
            if (r2 == 0) goto L_0x0308
            r3 = r6
            X.1o9 r3 = (X.C31351o9) r3
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x029a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = ";"
            java.lang.String[] r4 = r4.split(r0)
            int r1 = r4.length
            r0 = 3
            r2 = 0
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.String r0 = "Wrong format of expired reference key."
            X.C626936e.A0D(r1, r0)
            r0 = r4[r2]
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A08(r0)
            r0 = r4[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = r4[r14]
            X.2z0 r0 = X.AnonymousClass2z0.A05(r2, r0, r1)
            r3.A02 = r0
            goto L_0x029a
        L_0x0308:
            boolean r0 = r6 instanceof X.C31341o8
            if (r0 == 0) goto L_0x0323
            r2 = r6
            X.1o8 r2 = (X.C31341o8) r2
            int r1 = r2.A00
            r0 = 10
            if (r1 != r0) goto L_0x029a
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x029a
            java.lang.String r4 = (java.lang.String) r4
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r4)
            r2.A00 = r0
            goto L_0x029a
        L_0x0323:
            boolean r0 = r6 instanceof X.C31891p1
            if (r0 == 0) goto L_0x0421
            r3 = r6
            X.1p1 r3 = (X.C31891p1) r3
            boolean r0 = r3 instanceof X.C31881p0
            if (r0 == 0) goto L_0x03d3
            X.1p0 r3 = (X.C31881p0) r3
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x029a
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x03cc }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r4)     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r0 = "participant_list"
            org.json.JSONArray r4 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x03cc }
            r12 = 0
            if (r4 == 0) goto L_0x035c
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x03cc }
            int r2 = r4.length()     // Catch:{ JSONException -> 0x03cc }
            r1 = 0
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x03cc }
            X.C162457s7.A0H(r0)     // Catch:{ JSONException -> 0x03cc }
            r10.add(r0)     // Catch:{ JSONException -> 0x03cc }
            int r1 = r1 + 1
            goto L_0x034d
        L_0x035c:
            r10 = 0
        L_0x035d:
            java.lang.String r0 = "group_nodes"
            org.json.JSONArray r8 = r5.getJSONArray(r0)     // Catch:{ JSONException -> 0x03cc }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x03cc }
            int r5 = r8.length()     // Catch:{ JSONException -> 0x03cc }
        L_0x036b:
            if (r12 >= r5) goto L_0x039a
            org.json.JSONObject r13 = r8.getJSONObject(r12)     // Catch:{ JSONException -> 0x03cc }
            X.C162457s7.A0H(r13)     // Catch:{ JSONException -> 0x03cc }
            r1 = 0
            X.C162457s7.A0J(r13, r1)     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r0 = "jid_string"
            java.lang.String r4 = r13.getString(r0)     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r0 = "subject"
            java.lang.String r2 = X.C57282tO.A00(r0, r13, r1)     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r0 = "type"
            int r1 = r13.getInt(r0)     // Catch:{ JSONException -> 0x03cc }
            X.C162457s7.A0H(r4)     // Catch:{ JSONException -> 0x03cc }
            X.2gA r0 = new X.2gA     // Catch:{ JSONException -> 0x03cc }
            r0.<init>(r4, r2, r1)     // Catch:{ JSONException -> 0x03cc }
            r11.add(r0)     // Catch:{ JSONException -> 0x03cc }
            int r12 = r12 + 1
            goto L_0x036b
        L_0x039a:
            java.util.List r8 = r3.A00     // Catch:{ JSONException -> 0x03cc }
            r8.clear()     // Catch:{ JSONException -> 0x03cc }
            java.util.Iterator r5 = r11.iterator()     // Catch:{ JSONException -> 0x03cc }
        L_0x03a3:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x03cc }
            if (r0 == 0) goto L_0x03c7
            java.lang.Object r4 = r5.next()     // Catch:{ JSONException -> 0x03cc }
            X.2gA r4 = (X.C49212gA) r4     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r1 = r4.A01     // Catch:{ JSONException -> 0x03cc }
            X.32V r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ JSONException -> 0x03cc }
            com.whatsapp.jid.GroupJid r2 = r0.A03(r1)     // Catch:{ JSONException -> 0x03cc }
            java.lang.String r1 = r4.A02     // Catch:{ JSONException -> 0x03cc }
            int r0 = r4.A00     // Catch:{ JSONException -> 0x03cc }
            if (r2 == 0) goto L_0x03c1
            X.C52662lq.A01(r2, r1, r8, r0)     // Catch:{ JSONException -> 0x03cc }
            goto L_0x03a3
        L_0x03c1:
            java.lang.String r0 = "FMessageSystemWithGroupNodes/setObjectForDatabaseFieldThumbImage/gid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x03cc }
            goto L_0x03a3
        L_0x03c7:
            r3.A1w(r10)     // Catch:{ JSONException -> 0x03cc }
            goto L_0x029a
        L_0x03cc:
            java.lang.String r0 = "FMessageSystemWithGroupNodes/setObjectForDatabaseFieldThumbImage/json exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x029a
        L_0x03d3:
            boolean r0 = r3 instanceof X.C31581oW
            if (r0 == 0) goto L_0x040c
            X.1oW r3 = (X.C31581oW) r3
            boolean r0 = r4 instanceof java.lang.String[][]
            if (r0 == 0) goto L_0x029a
            java.lang.String[][] r4 = (java.lang.String[][]) r4     // Catch:{ Exception -> 0x0406 }
            java.util.Set r2 = r3.A03     // Catch:{ Exception -> 0x0406 }
            r2.clear()     // Catch:{ Exception -> 0x0406 }
            r3 = 0
            r1 = 0
        L_0x03e6:
            int r0 = r4.length     // Catch:{ Exception -> 0x0406 }
            if (r1 >= r0) goto L_0x029a
            r0 = r4[r1]     // Catch:{ Exception -> 0x0406 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x0406 }
            X.1fJ r12 = X.AnonymousClass34R.A04(r0)     // Catch:{ Exception -> 0x0406 }
            r0 = r4[r1]     // Catch:{ Exception -> 0x0406 }
            r13 = r0[r5]     // Catch:{ Exception -> 0x0406 }
            if (r12 == 0) goto L_0x0403
            if (r13 == 0) goto L_0x0403
            r15 = 0
            X.2mC r11 = new X.2mC     // Catch:{ Exception -> 0x0406 }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ Exception -> 0x0406 }
            r2.add(r11)     // Catch:{ Exception -> 0x0406 }
        L_0x0403:
            int r1 = r1 + 1
            goto L_0x03e6
        L_0x0406:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x029a
        L_0x040c:
            boolean r0 = r3 instanceof X.C31611oZ
            if (r0 == 0) goto L_0x041c
            X.1oZ r3 = (X.C31611oZ) r3
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x029a
            java.lang.String r4 = (java.lang.String) r4
            r3.A01 = r4
            goto L_0x029a
        L_0x041c:
            r3.A1w(r4)
            goto L_0x029a
        L_0x0421:
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0459
            r2 = r6
            X.1mV r2 = (X.C30471mV) r2
            boolean r0 = r4 instanceof X.AnonymousClass33C
            if (r0 == 0) goto L_0x0432
            X.33C r4 = (X.AnonymousClass33C) r4
        L_0x042e:
            r2.A01 = r4
            goto L_0x029a
        L_0x0432:
            boolean r0 = r4 instanceof com.whatsapp.MediaData
            if (r0 == 0) goto L_0x043d
            com.whatsapp.MediaData r4 = (com.whatsapp.MediaData) r4
            X.33C r4 = X.AnonymousClass33C.A00(r4)
            goto L_0x042e
        L_0x043d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageMedia/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class="
            r1.append(r0)
            if (r4 != 0) goto L_0x0454
            java.lang.String r0 = "null"
        L_0x044b:
            X.C18260x0.A0n(r0, r1)
            X.33C r4 = new X.33C
            r4.<init>()
            goto L_0x042e
        L_0x0454:
            java.lang.Class r0 = r4.getClass()
            goto L_0x044b
        L_0x0459:
            if (r3 == 0) goto L_0x029a
            r2 = r6
            X.1mK r2 = (X.C30361mK) r2
            boolean r0 = r4 instanceof X.AnonymousClass33C
            if (r0 != 0) goto L_0x0497
            boolean r0 = r4 instanceof com.whatsapp.MediaData
            if (r0 == 0) goto L_0x047a
            com.whatsapp.MediaData r4 = (com.whatsapp.MediaData) r4
            X.33C r4 = X.AnonymousClass33C.A00(r4)
        L_0x046c:
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x0495
            boolean r0 = r4.A0c
            boolean r0 = X.AnonymousClass000.A1S(r0)
        L_0x0476:
            r2.A02 = r0
            goto L_0x029a
        L_0x047a:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0483
            int r0 = X.AnonymousClass001.A0K(r4)
            goto L_0x0476
        L_0x0483:
            if (r4 == 0) goto L_0x0495
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageLocation/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class="
            java.lang.Class r0 = X.C18310x6.A0c(r4, r0, r1)
            r1.append(r0)
            X.C18270x1.A0z(r1)
        L_0x0495:
            r0 = 2
            goto L_0x0476
        L_0x0497:
            X.33C r4 = (X.AnonymousClass33C) r4
            goto L_0x046c
        L_0x049a:
            boolean r0 = r6 instanceof X.C31581oW
            if (r0 == 0) goto L_0x04a5
            r0 = r6
            X.1oW r0 = (X.C31581oW) r0
            r0.A00 = r10
            goto L_0x028c
        L_0x04a5:
            boolean r0 = r6 instanceof X.C31301o4
            if (r0 == 0) goto L_0x04b0
            r0 = r6
            X.1o4 r0 = (X.C31301o4) r0
            r0.A00 = r10
            goto L_0x028c
        L_0x04b0:
            boolean r0 = r6 instanceof X.C31211nv
            if (r0 == 0) goto L_0x04d2
            r1 = r6
            X.1nv r1 = (X.C31211nv) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x04bf
            switch(r10) {
                case 1: goto L_0x04c3;
                case 2: goto L_0x04c6;
                case 3: goto L_0x04c8;
                case 4: goto L_0x04cb;
                case 5: goto L_0x04cd;
                case 6: goto L_0x04cf;
                default: goto L_0x04be;
            }
        L_0x04be:
            r10 = 0
        L_0x04bf:
            r1.A00 = r10
            goto L_0x028c
        L_0x04c3:
            r10 = 8
            goto L_0x04bf
        L_0x04c6:
            r10 = 6
            goto L_0x04bf
        L_0x04c8:
            r10 = 10
            goto L_0x04bf
        L_0x04cb:
            r10 = 7
            goto L_0x04bf
        L_0x04cd:
            r10 = 5
            goto L_0x04bf
        L_0x04cf:
            r10 = 9
            goto L_0x04bf
        L_0x04d2:
            boolean r0 = r6 instanceof X.C31291o3
            if (r0 == 0) goto L_0x04dd
            r0 = r6
            X.1o3 r0 = (X.C31291o3) r0
            r0.A00 = r10
            goto L_0x028c
        L_0x04dd:
            boolean r0 = r6 instanceof X.C30391mN
            if (r0 == 0) goto L_0x028c
            r0 = r6
            X.1mN r0 = (X.C30391mN) r0
            r0.A00 = r10
            goto L_0x028c
        L_0x04e8:
            boolean r0 = r1 instanceof X.C31681og
            if (r0 == 0) goto L_0x04f2
            X.1og r1 = (X.C31681og) r1
            r1.A01 = r3
            goto L_0x0219
        L_0x04f2:
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r3)
            r1.A00 = r0
            goto L_0x0219
        L_0x04fa:
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0219
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            r0.A04 = r3
            goto L_0x0219
        L_0x0505:
            boolean r0 = r6 instanceof X.C31341o8
            if (r0 == 0) goto L_0x051a
            r3 = r6
            X.1o8 r3 = (X.C31341o8) r3
            int r2 = r3.A00
            r0 = 28
            if (r2 != r0) goto L_0x01fb
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r1)
            r3.A00 = r0
            goto L_0x01fb
        L_0x051a:
            boolean r0 = r6 instanceof X.C31201nu
            if (r0 == 0) goto L_0x0525
            r0 = r6
            X.1nu r0 = (X.C31201nu) r0
            r0.A00 = r1
            goto L_0x01fb
        L_0x0525:
            if (r12 == 0) goto L_0x052e
            r0 = r6
            X.1mS r0 = (X.C30441mS) r0
            r0.A01 = r1
            goto L_0x01fb
        L_0x052e:
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0539
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            r0.A06 = r1
            goto L_0x01fb
        L_0x0539:
            boolean r0 = r6 instanceof X.AnonymousClass1n9
            if (r0 == 0) goto L_0x0569
            r3 = r6
            X.1n9 r3 = (X.AnonymousClass1n9) r3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01fb
            r0 = 10
            int r2 = r1.indexOf(r0)
            r0 = -1
            if (r2 != r0) goto L_0x0553
            r3.A01 = r1
            goto L_0x01fb
        L_0x0553:
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r1, r2)
            r3.A01 = r0
            int r0 = r1.length()
            if (r0 <= r2) goto L_0x01fb
            int r0 = r2 + 1
            java.lang.String r0 = r1.substring(r0)
            r3.A00 = r0
            goto L_0x01fb
        L_0x0569:
            boolean r0 = r6 instanceof X.C30801n8
            if (r0 == 0) goto L_0x05a6
            r10 = r6
            X.1n8 r10 = (X.C30801n8) r10
            if (r1 == 0) goto L_0x01fb
            java.lang.String[] r3 = X.C18320x8.A1b(r1)
            int r1 = r3.length
            r0 = 4
            if (r1 != r0) goto L_0x01fb
            r0 = 0
            r0 = r3[r0]
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            X.C626936e.A06(r0)
            X.2pX r2 = new X.2pX
            r2.<init>(r0)
            r10.A02 = r2
            r0 = r3[r5]
            double r0 = java.lang.Double.parseDouble(r0)
            r2.A00 = r0
            r0 = r3[r14]
            double r0 = java.lang.Double.parseDouble(r0)
            r2.A01 = r0
            r0 = 3
            r0 = r3[r0]
            long r0 = java.lang.Long.parseLong(r0)
            r2.A05 = r0
            goto L_0x01fb
        L_0x05a6:
            boolean r0 = r6 instanceof X.C30411mP
            if (r0 == 0) goto L_0x05b1
            r0 = r6
            X.1mP r0 = (X.C30411mP) r0
            r0.A00 = r1
            goto L_0x01fb
        L_0x05b1:
            boolean r0 = r6 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x05bc
            r0 = r6
            X.1mQ r0 = (X.C30421mQ) r0
            r0.A00 = r1
            goto L_0x01fb
        L_0x05bc:
            boolean r0 = r6 instanceof X.C30701ms
            if (r0 == 0) goto L_0x05e3
            r13 = r6
            X.1ms r13 = (X.C30701ms) r13
            r2 = 0
            long r0 = X.C615531h.A04(r1, r2)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L_0x05e0
            r11 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x05e0
        L_0x05d6:
            r13.A02 = r0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x01fb
            r13.A00 = r5
            goto L_0x01fb
        L_0x05e0:
            r0 = 0
            goto L_0x05d6
        L_0x05e3:
            boolean r0 = r6 instanceof X.C30941nT
            if (r0 == 0) goto L_0x01fb
            r0 = r6
            X.1nT r0 = (X.C30941nT) r0
            r0.A00 = r1
            goto L_0x01fb
        L_0x05ee:
            boolean r2 = r6 instanceof X.C30471mV
            if (r2 == 0) goto L_0x05f9
            r2 = r6
            X.1mV r2 = (X.C30471mV) r2
            r2.A00 = r0
            goto L_0x01ee
        L_0x05f9:
            boolean r2 = r6 instanceof X.C30801n8
            if (r2 == 0) goto L_0x0604
            r2 = r6
            X.1n8 r2 = (X.C30801n8) r2
            r2.A01 = r0
            goto L_0x01ee
        L_0x0604:
            boolean r2 = r6 instanceof X.C30701ms
            if (r2 == 0) goto L_0x01ee
            r3 = r6
            X.1ms r3 = (X.C30701ms) r3
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ee
            r3.A00 = r5
            int r2 = (int) r0
            r3.A01 = r2
            goto L_0x01ee
        L_0x0618:
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x01df
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            r0.A05 = r1
            goto L_0x01df
        L_0x0623:
            java.lang.String r0 = "raw_data"
            byte[] r1 = X.C18280x3.A1Z(r7, r0)
            if (r1 != 0) goto L_0x063f
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x063f
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r2)
            r6.A1Z(r0)
            goto L_0x01b6
        L_0x063f:
            r6.A1j(r1)
            goto L_0x01b6
        L_0x0644:
            java.lang.String r0 = "sort_id"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A1M = r0
            java.lang.String r0 = "status"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A1G(r0)
            java.lang.String r0 = "broadcast"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r3 = 0
            r2 = 1
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r6.A1B = r0
            java.lang.String r0 = "recipient_count"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A0B = r0
            java.lang.String r0 = "participant_hash"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A14 = r0
            java.lang.String r0 = "origination_flags"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A1B(r0)
            java.lang.String r0 = "origin"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            r6.A09 = r0
            java.lang.String r0 = "received_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A0I = r0
            java.lang.String r0 = "receipt_server_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A0J = r0
            java.lang.String r0 = "starred"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            if (r0 != r2) goto L_0x06a6
            r3 = 1
        L_0x06a6:
            r6.A1F = r3
            java.lang.String r0 = "lookup_tables"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r6.A1P = r0
            java.lang.String r0 = "message_add_on_flags"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)
            A0K(r6, r0)
            java.lang.Class<X.4uZ> r2 = X.C95814uZ.class
            java.lang.String r0 = "sender_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r7, r0)
            r3 = r19
            com.whatsapp.jid.Jid r0 = r3.A0B(r2, r0)
            X.4uZ r0 = (X.C95814uZ) r0
            r6.A1J(r0)
            java.lang.String r0 = "text_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r7, r0)
            r6.A1f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624134x.A1I(android.database.Cursor, X.34p):void");
    }

    public void A1U(C42592Ot r5) {
        A0x().A00 = r5;
        this.A1P |= 8;
    }

    public final String toString() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o2);
        A0S(this, " key=", A0o2);
        A0T(this, " media_wa_type=", A0o2);
        return A0o2.toString();
    }

    public C624134x(C624134x r5, AnonymousClass2z0 r6, byte b, long j, boolean z) {
        this(r6, b, j);
        ArrayList arrayList;
        C624034w r2;
        synchronized (r5.A1K) {
            this.A0y = r5.A0y;
            this.A1H = r5.A1H;
        }
        this.A02 = r5.A02;
        this.A09 = r5.A09;
        A1g(r5.A18);
        this.A0f = r5.A0f;
        if (z) {
            this.A0Q = r5.A0n();
            this.A1R = r5.A1R;
            if (r5.A19() != null) {
                arrayList = AnonymousClass002.A0J(r5.A19());
            } else {
                arrayList = null;
            }
            this.A19 = arrayList;
            this.A14 = r5.A14;
            this.A13 = r5.A13;
            this.A0z = r5.A0z;
            this.A1B = r5.A1B;
            this.A0B = r5.A0B;
            this.A0p = r5.A0p;
            this.A0H = r5.A0H;
            this.A0d = r5.A0d;
            this.A0w = r5.A0w;
            this.A0G = r5.A0G;
            this.A0n = r5.A0n;
            this.A0v = r5.A0v;
            this.A0u = r5.A0u;
            this.A0t = r5.A0t;
            this.A01 = r5.A01;
            this.A0A = r5.A0A;
            this.A06 = r5.A06;
            this.A0l = r5.A0l;
            this.A0N = r5.A0N;
            this.A0b = r5.A0b;
            A0M(r5, this, false);
            C624034w r3 = r5.A0P;
            if (r3 != null && (r2 = this.A0P) != null) {
                synchronized (r3) {
                    if (TextUtils.isEmpty(r2.A0K) || r2.A0K.equals(r3.A0K)) {
                        r2.A0K = r3.A0K;
                        r2.A02 = r3.A02;
                        r2.A06 = r3.A06;
                    }
                }
            }
        }
    }

    public C624134x(C624134x r8, AnonymousClass2z0 r9, long j, boolean z) {
        this(r8, r9, r8.A1I, j, z);
    }
}
