package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.34n  reason: invalid class name and case insensitive filesystem */
public class C623134n {
    public int A00;
    public C48952fk A01;
    public UserJid A02;
    public AnonymousClass3ZC A03;
    public Boolean A04;
    public Boolean A05;
    public boolean A06;

    public static int A00(C55502qS r2) {
        if (r2 != null) {
            if (r2.A09) {
                return 4;
            }
            if (r2.A03()) {
                return 2;
            }
            if (r2.A02()) {
                return 3;
            }
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C623134n r5 = (C623134n) obj;
            if (!(this.A00 == r5.A00 && this.A06 == r5.A06 && this.A03.equals(r5.A03))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0018
            com.whatsapp.jid.UserJid r1 = r2.A02
            if (r1 == 0) goto L_0x001f
            X.2fk r0 = r2.A01
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            if (r0 == 0) goto L_0x001f
        L_0x0018:
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623134n.A03():boolean");
    }

    public boolean A05() {
        Boolean bool = this.A05;
        if (bool == null) {
            if (this.A01 != null) {
                bool = C18320x8.A0U();
                this.A05 = bool;
            }
            return false;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A06(int i, int i2, int i3, boolean z) {
        if (this.A00 == i) {
            AnonymousClass3ZC r1 = this.A03;
            if (r1.actualActors == i2 && r1.hostStorage == i3 && this.A06 == z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C623134n(AnonymousClass3ZC r2, int i, int i2) {
        this.A03 = r2 == null ? new AnonymousClass3ZC() : r2;
        this.A00 = i;
        this.A06 = AnonymousClass000.A1U(i2, 3);
    }

    public int A01() {
        if (A05()) {
            if (!A06(3, 1, 2, false)) {
                if (!A06(3, 1, 2, true)) {
                    if (!A06(3, 2, 1, false)) {
                        if (!A06(3, 2, 1, true)) {
                            if (!A06(3, 2, 2, false)) {
                                if (!A06(3, 2, 2, true)) {
                                    if (this.A00 != 4) {
                                        if (!A03()) {
                                            return 17;
                                        }
                                        return 16;
                                    }
                                    return 15;
                                }
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 7;
                }
                return 6;
            }
            return 5;
        }
        if (!A03()) {
            if (this.A00 != 4) {
                if (!A06(1, 1, 1, false)) {
                    if (!A06(2, 1, 1, false)) {
                        if (!A06(2, 1, 1, true)) {
                            if (!A06(3, 1, 1, false)) {
                                if (!A06(3, 1, 1, true)) {
                                    if (!A06(3, 1, 2, false)) {
                                        if (!A06(3, 1, 2, true)) {
                                            if (!A06(3, 2, 1, false)) {
                                                if (!A06(3, 2, 1, true)) {
                                                    if (!A06(3, 2, 2, false)) {
                                                        if (!A06(3, 2, 2, true)) {
                                                            if (!A06(1, 0, 0, false)) {
                                                                if (!A06(2, 0, 0, false)) {
                                                                    if (!A06(2, 0, 0, true)) {
                                                                        if (!A06(3, 0, 0, false)) {
                                                                            if (A06(3, 0, 0, true)) {
                                                                                return 4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return 9;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 0;
            }
            return 15;
        }
        return 16;
        return 10;
    }

    public boolean A02() {
        int A012 = A01();
        if (A012 == 5 || A012 == 6 || A012 == 9 || A012 == 10 || A012 == 15) {
            return true;
        }
        return false;
    }

    public boolean A04() {
        int A012 = A01();
        if (A012 == 0 || A012 == 1 || A012 == 2 || A012 == 3 || A012 == 4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A03;
        AnonymousClass000.A1M(A1X, this.A00);
        AnonymousClass001.A1S(A1X, this.A06);
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessState{privacyMode=");
        A0o.append(this.A03);
        A0o.append(", client=");
        A0o.append(this.A00);
        A0o.append(", isVerified=");
        A0o.append(this.A06);
        A0o.append(", stateId=");
        A0o.append(A01());
        return AnonymousClass000.A0d(A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C623134n(X.C55502qS r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x001b
            int r2 = r4.A03
            X.3ZC r1 = r4.A01()
            int r0 = A00(r4)
            r3.A03 = r1
            r3.A00 = r0
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A06 = r0
            return
        L_0x001b:
            r1 = 1
            X.3ZC r0 = new X.3ZC
            r0.<init>()
            r3.A03 = r0
            r3.A00 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623134n.<init>(X.2qS):void");
    }

    public C623134n(C56422rx r2, C48952fk r3, UserJid userJid) {
        this(r2.A01(userJid));
        this.A02 = userJid;
        this.A01 = r3;
    }
}
