package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34w  reason: invalid class name and case insensitive filesystem */
public class C624034w {
    public static final int[] A0S = {702, 701};
    public static final int[] A0T = {101, 102, 103, 104};
    public static final int[] A0U = {11, 12, 608};
    public static final int[] A0V = {401, 402, 403, 404, 410, 411, 413, 601, 602, 603, 425};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C85204Fi A07;
    @Deprecated
    public AnonymousClass39Q A08;
    public AnonymousClass39L A09;
    public AnonymousClass1S4 A0A;
    public AnonymousClass39R A0B;
    public C95814uZ A0C;
    public UserJid A0D;
    public UserJid A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public byte[] A0R;

    public synchronized C85204Fi A03() {
        return this.A07;
    }

    public synchronized AnonymousClass39L A04() {
        AnonymousClass39L r0;
        AnonymousClass1S4 r02 = this.A0A;
        if (r02 != null) {
            r0 = r02.A0E();
        } else {
            r0 = null;
        }
        return r0;
    }

    public synchronized AnonymousClass39R A05() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Boolean A06() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r1 = r2.A03     // Catch:{ all -> 0x0023 }
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 100
            if (r1 == r0) goto L_0x001f
            r0 = 20
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x001c
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 10
            if (r1 == r0) goto L_0x001c
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            goto L_0x0021
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A06():java.lang.Boolean");
    }

    public synchronized void A07(long j, String str, int i, String str2, String str3) {
        synchronized (this) {
            this.A02 = i;
            if (j >= 0) {
                this.A06 = j;
                this.A0O = true;
                this.A0H = str;
                this.A0J = str2;
                this.A0F = str3;
            } else {
                throw AnonymousClass001.A0c(AnonymousClass000.A0Z("PAY: PaymentTransaction update called with invalid timestamp: ", AnonymousClass001.A0o(), j));
            }
        }
    }

    public synchronized void A08(AnonymousClass39U r2, AnonymousClass1S4 r3) {
        AnonymousClass1S4 r0 = this.A0A;
        if (r0 == null) {
            this.A0A = r3;
            r0 = r3;
        }
        r0.A02 = r2;
    }

    public synchronized void A09(AnonymousClass1S4 r2, int i) {
        if (i > 0) {
            AnonymousClass1S4 r0 = this.A0A;
            if (r0 == null) {
                this.A0A = r2;
                r0 = r2;
            }
            r0.A0Q(i);
        }
    }

    public synchronized void A0A(AnonymousClass1S4 r4, long j) {
        if (j > 0) {
            AnonymousClass1S4 r0 = this.A0A;
            if (r0 == null) {
                this.A0A = r4;
                r0 = r4;
            }
            r0.A0U(j);
        }
    }

    public synchronized void A0B(C624034w r10) {
        synchronized (this) {
            if (!TextUtils.isEmpty(r10.A0K)) {
                A0D(r10.A0K);
            }
            this.A05 = r10.A05;
            this.A0E = r10.A0E;
            this.A0D = r10.A0D;
            this.A08 = r10.A08;
            this.A0I = r10.A0I;
            this.A03 = r10.A03;
            this.A0G = r10.A0G;
            this.A07 = r10.A07;
            this.A04 = r10.A04;
            this.A0R = r10.A0R;
            this.A0L = r10.A0L;
            this.A0Q = r10.A0Q;
            this.A0C = r10.A0C;
            this.A0M = r10.A0M;
            this.A0A = r10.A0A;
            this.A0B = r10.A0B;
            A07(this.A06, this.A0H, this.A02, this.A0J, this.A0F);
        }
    }

    public synchronized void A0C(AnonymousClass39R r2) {
        this.A0B = r2;
    }

    public synchronized void A0D(String str) {
        C626936e.A05(str);
        this.A0K = str;
        this.A0O = true;
    }

    public synchronized void A0E(List list) {
        if (list != null) {
            if (list.size() > 0) {
                this.A0N = AnonymousClass002.A0J(list);
            }
        }
    }

    public synchronized void A0F(boolean z) {
        this.A0O = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        if (r1 != 200) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0067, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0G() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r1 = r7.A03     // Catch:{ all -> 0x0068 }
            r6 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0008
            goto L_0x0017
        L_0x0008:
            int[] r4 = A0V     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x000c:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0017:
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 == r0) goto L_0x0066
            r0 = 6
            if (r1 == r0) goto L_0x0048
            r0 = 7
            if (r1 == r0) goto L_0x0057
            r0 = 8
            if (r1 == r0) goto L_0x0039
            r0 = 10
            if (r1 == r0) goto L_0x0039
            r0 = 20
            if (r1 == r0) goto L_0x0039
            r0 = 100
            if (r1 == r0) goto L_0x0008
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0057
        L_0x0037:
            monitor-exit(r7)
            return r6
        L_0x0039:
            int[] r4 = A0U     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x003d:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0048:
            int[] r4 = A0S     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x004c:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0057:
            int[] r4 = A0T     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x005b:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0066:
            monitor-exit(r7)
            return r5
        L_0x0068:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0G():boolean");
    }

    public synchronized boolean A0H() {
        return this.A0O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0I() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.1S4 r0 = r2.A0A     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.A0b()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0I():boolean");
    }

    public synchronized boolean A0J() {
        boolean z;
        int i;
        if (this.A03 == 10 && ((i = this.A02) == 12 || i == 19)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean A0K() {
        boolean z;
        int i;
        if (!A0L() || !((i = this.A02) == 12 || i == 19 || i == 20)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == 30) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0L() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0017 }
            r0 = 20
            if (r2 == r0) goto L_0x0014
            r0 = 40
            if (r2 == r0) goto L_0x0014
            r0 = 10
            if (r2 == r0) goto L_0x0014
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r3)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0L():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r3.A03 == 30) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0M() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A02     // Catch:{ all -> 0x001d }
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 604(0x25c, float:8.46E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 703(0x2bf, float:9.85E-43)
            if (r1 == r0) goto L_0x001a
            int r2 = r3.A03     // Catch:{ all -> 0x001d }
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0M():boolean");
    }

    public synchronized boolean A0N() {
        return AnonymousClass36S.A08(this.A0G, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0O() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.39Q r0 = r2.A08     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            X.1S4 r0 = r2.A0A     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A0f(r2)     // Catch:{ all -> 0x0013 }
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0O():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0P(X.AnonymousClass1S4 r15, int r16, long r17) {
        /*
            r14 = this;
            monitor-enter(r14)
            long r1 = r14.A06     // Catch:{ all -> 0x0073 }
            X.1S4 r7 = r14.A0A     // Catch:{ all -> 0x0073 }
            r13 = 0
            if (r7 == 0) goto L_0x000d
            int r8 = r7.A07()     // Catch:{ all -> 0x0073 }
            goto L_0x000e
        L_0x000d:
            r8 = 0
        L_0x000e:
            if (r15 == 0) goto L_0x0015
            int r6 = r15.A07()     // Catch:{ all -> 0x0073 }
            goto L_0x0016
        L_0x0015:
            r6 = 0
        L_0x0016:
            r5 = 0
            if (r15 == 0) goto L_0x0024
            X.4Fh r0 = r15.A0C()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r4 = r0.B5h()     // Catch:{ all -> 0x0073 }
            goto L_0x0026
        L_0x0024:
            r0 = r5
        L_0x0025:
            r4 = r5
        L_0x0026:
            r11 = 0
            if (r0 == 0) goto L_0x002f
            long r9 = r0.BE5()     // Catch:{ all -> 0x0073 }
            goto L_0x0031
        L_0x002f:
            r9 = 0
        L_0x0031:
            if (r7 == 0) goto L_0x0041
            X.4Fh r0 = r7.A0C()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r5 = r0.B5h()     // Catch:{ all -> 0x0073 }
            long r11 = r0.BE5()     // Catch:{ all -> 0x0073 }
        L_0x0041:
            int r3 = r14.A03     // Catch:{ all -> 0x0073 }
            r0 = 5
            if (r3 == r0) goto L_0x004a
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r0) goto L_0x004e
        L_0x004a:
            r0 = r16
            if (r3 != r0) goto L_0x0070
        L_0x004e:
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0070
            if (r0 != 0) goto L_0x005a
            if (r6 != 0) goto L_0x0058
            if (r8 == 0) goto L_0x0070
        L_0x0058:
            if (r6 > r8) goto L_0x0070
        L_0x005a:
            if (r7 == 0) goto L_0x0068
            boolean r0 = r7.A0d()     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r7.A0e(r15)     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0070
        L_0x0068:
            if (r4 == 0) goto L_0x006c
            if (r4 != r5) goto L_0x0070
        L_0x006c:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
        L_0x0070:
            r13 = 1
        L_0x0071:
            monitor-exit(r14)
            return r13
        L_0x0073:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0P(X.1S4, int, long):boolean");
    }

    public synchronized boolean A0Q(C624034w r5) {
        return A0P(r5.A0A, r5.A03, r5.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r3.equals(r2.A0D) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0R(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0E     // Catch:{ all -> 0x0012 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0D     // Catch:{ all -> 0x0012 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.A0R(com.whatsapp.jid.UserJid):boolean");
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A00(this, "id: ", A0o);
        A0o.append(" key_remote_id: ");
        A0o.append(this.A0C);
        A0o.append(" key_from_me: ");
        A0o.append(this.A0Q);
        A0o.append(" key_id: ");
        A0o.append(this.A0L);
        A0o.append(" status: ");
        A0o.append(this.A02);
        A0o.append(" type: ");
        A0o.append(this.A03);
        A01(this, " updateTs: ", A0o);
        A0o.append(" initTs: ");
        A0o.append(this.A05);
        A0o.append(" error_code: ");
        A0o.append(this.A0J);
        A0o.append(" sender: ");
        A0o.append(this.A0E);
        A0o.append(" receiver: ");
        A0o.append(this.A0D);
        A0o.append(" credential_id: ");
        A0o.append(this.A0H);
        A0o.append(" methods: ");
        A0o.append(this.A0N);
        A0o.append(" reqMsgKeyId: ");
        A0o.append(this.A0M);
        A0o.append(" metadata: ");
        A0o.append(this.A0A);
        A0o.append(" country: ");
        A0o.append(this.A0G);
        A0o.append(" version: ");
        A0o.append(this.A04);
        A0o.append(" interop: ");
        A0o.append(this.A0P);
        A0o.append(" background: ");
        A0o.append(this.A0B);
        A0o.append(" purchase_initiator: ");
        return AnonymousClass000.A0h(A0o, this.A00);
    }

    public static boolean A02(C624034w r1) {
        if (r1 == null) {
            return false;
        }
        int i = r1.A02;
        if (i == 405 || i == 106 || i == 604) {
            return true;
        }
        return false;
    }

    public C624034w(String str, int i, int i2, int i3, long j) {
        this.A03 = i;
        this.A05 = j;
        this.A0G = str;
        this.A04 = i2;
        this.A01 = i3;
        this.A0I = "XXX";
        this.A07 = AnonymousClass1S3.A06;
    }

    public static void A00(C624034w r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0K);
    }

    public static void A01(C624034w r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r2 == 40) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C624034w(X.C85204Fi r12, X.AnonymousClass39Q r13, com.whatsapp.jid.UserJid r14, com.whatsapp.jid.UserJid r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r11 = this;
            r3 = r17
            r4 = r11
            r11.<init>()
            r0 = 1
            r11.A0O = r0
            r2 = r23
            if (r23 != 0) goto L_0x000e
            r0 = 0
        L_0x000e:
            X.C626936e.A0C(r0)
            r11.A03 = r2
            r11.A0E = r14
            r11.A0D = r15
            r0 = r16
            r11.A0I = r0
            r11.A08 = r13
            r0 = r28
            r11.A05 = r0
            r0 = r22
            r11.A0G = r0
            r0 = r25
            r11.A04 = r0
            r0 = r26
            r11.A01 = r0
            r11.A07 = r12
            r0 = r27
            r11.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x004d
            r3 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0050
            r0 = 10
            if (r2 == r0) goto L_0x004d
            r0 = 20
            if (r2 == r0) goto L_0x004d
            r0 = 40
            if (r2 != r0) goto L_0x0050
        L_0x004d:
            r11.A0D(r3)
        L_0x0050:
            r7 = r18
            r9 = r19
            r10 = r20
            r8 = r24
            r5 = r30
            r4.A07(r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624034w.<init>(X.4Fi, X.39Q, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, long, long):void");
    }
}
