package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LruCache;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.36E  reason: invalid class name */
public class AnonymousClass36E {
    public static final AnonymousClass5ZC A0e = new AnonymousClass5ZC(1, 1);
    public static final AnonymousClass5ZC A0f = AnonymousClass0x9.A0T(1, 50, 100);
    public final LruCache A00 = new LruCache(50);
    public final C116985rC A01;
    public final C55682qk A02;
    public final C56972sr A03;
    public final C29441ip A04;
    public final C64773Ex A05;
    public final C56612sH A06;
    public final AnonymousClass2ZV A07;
    public final C44412Vy A08;
    public final C56982ss A09;
    public final C56892sj A0A;
    public final C56382rt A0B;
    public final C48032eE A0C;
    public final AnonymousClass36Y A0D;
    public final C56112rR A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass4FV A0G;
    public final C66833My A0H;
    public final C54932pW A0I;
    public final C106685Zz A0J;
    public final C54882pR A0K;
    public final C49592gm A0L;
    public final AnonymousClass3A0 A0M;
    public final C55892r5 A0N;
    public final AnonymousClass30L A0O;
    public final C58662vc A0P;
    public final C50222hp A0Q;
    public final C45042Yl A0R;
    public final AnonymousClass1R1 A0S;
    public final C45112Ys A0T;
    public final C55732qp A0U;
    public final C55832qz A0V;
    public final C50162hj A0W;
    public final C72173dI A0X;
    public final AnonymousClass4FS A0Y;
    public final C56402rv A0Z;
    public final C183538qC A0a;
    public final C183538qC A0b;
    public final C183538qC A0c;
    public final boolean A0d;

    public static Integer A02(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 7) {
                i2 = 3;
                if (i != 8) {
                    i2 = 0;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public static void A07(SharedPreferences sharedPreferences, C46792cD r3, String str) {
        r3.A00().edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    public int A08(C95814uZ r4) {
        if (r4 != null) {
            C56402rv r1 = this.A0Z;
            if (r1.A05(r4)) {
                return 2;
            }
            if (r1.A06(r4)) {
                return 3;
            }
            return (!C155477ey.A00(r4) || !((C52802m4) this.A0b.get()).A00()) ? 0 : 1;
        }
    }

    public int A09(String str, String str2) {
        String str3;
        if (str == null) {
            if (C617832f.A00(str2)) {
                return 4;
            }
            if (str2 != null && (str2.contains("static.whatsapp.net") || str2.contains("wa/static"))) {
                return 5;
            }
            str3 = "messagelogging/getBackendStoreType Unknown backend store type, both direct path and url are null";
            Log.e(str3);
            return 0;
        } else if (str.startsWith("/o")) {
            return 3;
        } else {
            if (str.startsWith("/v")) {
                return 2;
            }
            if (str2 == null || (!str2.contains("static.whatsapp.net") && !str2.contains("wa/static"))) {
                str3 = "messagelogging/getBackendStoreType Unknown backend store type";
                Log.e(str3);
                return 0;
            }
        }
        return 5;
    }

    public void A0L(C624134x r15, int i, int i2, int i3, int i4, boolean z) {
        A0N(r15, (Integer) null, i, i2, i3, i4, 0, 0, 0, z, false, false, false);
    }

    public static Integer A03(int i) {
        int i2 = 10;
        if (i != -10000) {
            i2 = 33;
            if (i != -9999) {
                i2 = 11;
                if (i != -1100) {
                    i2 = 26;
                    if (i != -22) {
                        if (i != -12) {
                            switch (i) {
                                case -1206:
                                case -1205:
                                case -1204:
                                case -1203:
                                case -1202:
                                    i2 = 0;
                                    break;
                                case -1201:
                                    i2 = 24;
                                    break;
                                case -1200:
                                    i2 = 25;
                                    break;
                                default:
                                    switch (i) {
                                        case -1011:
                                            i2 = 32;
                                            break;
                                        case -1010:
                                            i2 = 5;
                                            break;
                                        case -1009:
                                            i2 = 31;
                                            break;
                                        case -1008:
                                            i2 = 6;
                                            break;
                                        case -1007:
                                            i2 = 1;
                                            break;
                                        case -1006:
                                            i2 = 2;
                                            break;
                                        case -1005:
                                            break;
                                        case -1004:
                                            i2 = 29;
                                            break;
                                        case -1003:
                                            i2 = 28;
                                            break;
                                        case -1002:
                                            i2 = 27;
                                            break;
                                        case -1001:
                                            i2 = 23;
                                            break;
                                        case -1000:
                                            i2 = 34;
                                            break;
                                        default:
                                            return null;
                                    }
                                    i2 = 0;
                                    break;
                            }
                        } else {
                            i2 = 30;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public static Integer A04(AnonymousClass36E r4, C624134x r5) {
        int i;
        if (!((C52802m4) r4.A0b.get()).A00()) {
            return null;
        }
        C56722sS r42 = (C56722sS) r4.A0a.get();
        C95814uZ r2 = r5.A1J.A00;
        if (r2 == null) {
            return null;
        }
        if (C155477ey.A00(r2)) {
            return 0;
        }
        if (r42.A00(r5.A18) != null) {
            i = 1;
        } else if (!r42.A02(r2)) {
            return null;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    public Integer A0A(AnonymousClass3ST r6) {
        if (!((C52802m4) this.A0b.get()).A00()) {
            return null;
        }
        this.A0a.get();
        C162457s7.A0J(r6, 0);
        C53432n5 r0 = r6.A0A;
        if (r0 == null) {
            return null;
        }
        C95814uZ A022 = C627336j.A02(r0.A01);
        if (A022 == null) {
            A022 = C627336j.A02(r6.A18);
        }
        UserJid BCo = r6.BCo();
        if (BCo == null || !C155477ey.A00(BCo)) {
            return null;
        }
        if (A022 == null || A022.equals(BCo)) {
            return 0;
        }
        return AnonymousClass001.A0f();
    }

    public final Integer A0B(C30481mW r5) {
        String str;
        int i;
        C106685Zz r3 = this.A0J;
        String A032 = r3.A03(r5.A13());
        if (A032 != null) {
            if (!TextUtils.isEmpty(r5.A07)) {
                str = r5.A07;
            }
            str = A032;
        } else {
            A032 = null;
            str = A032;
        }
        if (TextUtils.isEmpty(A032) || A032 == null || A032.length() == 0) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        switch (AnonymousClass35G.A01(r3, str)) {
            case 1:
                i = 5;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 8;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    public void A0C(int i, int i2) {
        boolean A1V;
        if (this.A0d) {
            AnonymousClass30L r2 = this.A0O;
            AnonymousClass2WZ r1 = r2.A00;
            synchronized (r1) {
                A1V = AnonymousClass0x7.A1V(r1.A00, i);
            }
            if (A1V) {
                r2.A02(i, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0097, code lost:
        if (r3 != 88) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass2NY r7, com.whatsapp.jid.DeviceJid r8, com.whatsapp.jid.Jid r9, X.C624134x r10, int r11, int r12, int r13) {
        /*
            r6 = this;
            X.1bG r2 = new X.1bG
            r2.<init>()
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            int r3 = r7.A00
            r0 = 1
            if (r3 != r0) goto L_0x00be
            r0 = 0
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r2.A05 = r0
            int r0 = r7.A01
            if (r0 == 0) goto L_0x00ba
            java.lang.Integer r0 = A03(r0)
            r2.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0025:
            r2.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass368.A04(r13)
            r2.A0B = r0
            java.lang.Integer r0 = A02(r13)
            r2.A09 = r0
            r0 = 0
            java.lang.Integer r0 = X.AnonymousClass368.A06(r9, r0)
            r2.A06 = r0
            if (r8 == 0) goto L_0x004e
            int r0 = r8.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A08 = r0
        L_0x004e:
            X.2z0 r0 = r10.A1J
            X.4uZ r5 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r11)
            r2.A0F = r0
            int r0 = X.AnonymousClass29K.A00(r6, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            java.lang.Integer r0 = A04(r6, r10)
            r2.A03 = r0
            java.lang.Integer r0 = r2.A0A
            boolean r0 = r6.A0T(r5, r0)
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            X.2ss r0 = r6.A09
            X.C162457s7.A0J(r0, r4)
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r0, r5)
            r2.A0C = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r12)
            r2.A0E = r0
            boolean r0 = r10 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x0099
            byte r3 = r10.A1I
            r0 = 87
            if (r3 == r0) goto L_0x0099
            r1 = 88
            r0 = 0
            if (r3 != r1) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            int r0 = r6.A08(r5)
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
        L_0x00ac:
            java.lang.Boolean r0 = r2.A00
            boolean r1 = r0.booleanValue()
            X.4FV r0 = r6.A0G
            if (r1 == 0) goto L_0x00cd
            r0.BhD(r2)
            return
        L_0x00ba:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0025
        L_0x00be:
            r1 = 2
            if (r3 == r1) goto L_0x0013
            r0 = 3
            if (r3 != r0) goto L_0x00ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x00ca:
            r0 = 0
            goto L_0x0017
        L_0x00cd:
            X.C18280x3.A0t(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36E.A0D(X.2NY, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.34x, int, int, int):void");
    }

    public final void A0E(C26021bS r7, String str, long j) {
        Integer num;
        Integer num2;
        Integer num3;
        AnonymousClass1VX r4 = this.A0F;
        C58422vE r1 = C58422vE.A02;
        int A0O2 = r4.A0O(r1, 1073);
        int A0O3 = r4.A0O(r1, 1127);
        int A0O4 = r4.A0O(r1, 1128);
        if (A0O2 != 0 && ((num3 = r7.A0J) == null || A0O2 != num3.intValue())) {
            return;
        }
        if (A0O3 != 0 && ((num2 = r7.A0I) == null || A0O3 != num2.intValue())) {
            return;
        }
        if (A0O4 == 0 || ((num = r7.A0H) != null && A0O4 == num.intValue())) {
            String A0T2 = C18270x1.A0T(r7.A0J);
            String A0T3 = C18270x1.A0T(r7.A0I);
            String A0T4 = C18270x1.A0T(r7.A0H);
            C55682qk r2 = this.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("stage: ");
            A0o.append(A0T2);
            A0o.append("; messageType: ");
            A0o.append(A0T3);
            A0o.append("; mediaType: ");
            A0o.append(A0T4);
            r2.A0A(str, true, AnonymousClass000.A0Z("; durationTime: ", A0o, j));
        }
    }

    public void A0F(DeviceJid deviceJid, int i) {
        int i2;
        AnonymousClass1XR r2 = new AnonymousClass1XR();
        r2.A00 = Integer.valueOf(i);
        if (deviceJid != null) {
            i2 = C18280x3.A01(AnonymousClass000.A1T(deviceJid.getDevice()) ? 1 : 0);
        } else {
            i2 = 1;
        }
        r2.A01 = Integer.valueOf(i2);
        C18280x3.A0t(r2, this.A0G, true);
    }

    public void A0G(DeviceJid deviceJid, AnonymousClass2z0 r4, int i, boolean z) {
        C24841Yy r1 = new C24841Yy();
        r1.A02 = Integer.valueOf(AnonymousClass36M.A05(r4.A00));
        r1.A01 = Integer.valueOf(C18280x3.A01(AnonymousClass000.A1T(deviceJid.getDevice()) ? 1 : 0));
        r1.A03 = AnonymousClass0x9.A0m(i);
        r1.A00 = Boolean.valueOf(z);
        this.A0G.BhB(r1);
    }

    public void A0H(DeviceJid deviceJid, AnonymousClass2z0 r4, Integer num, int i, int i2) {
        AnonymousClass1ZU r1 = new AnonymousClass1ZU();
        r1.A01 = Integer.valueOf(AnonymousClass36M.A05(r4.A00));
        r1.A03 = Integer.valueOf(C18280x3.A01(AnonymousClass000.A1T(deviceJid.getDevice()) ? 1 : 0));
        r1.A04 = AnonymousClass0x9.A0m(i);
        r1.A00 = Boolean.valueOf(AnonymousClass000.A1W(AnonymousClass368.A04(i2)));
        r1.A02 = num;
        this.A0G.BhD(r1);
    }

    public void A0J(C624134x r4, int i) {
        C25131a1 r2 = new C25131a1();
        r2.A06 = r4.A1J.A01;
        r2.A01 = 1;
        r2.A04 = Integer.valueOf(AnonymousClass36M.A06(r4));
        r2.A03 = Integer.valueOf(AnonymousClass29K.A00(this, r4));
        r2.A05 = C56612sH.A09(this.A06);
        r2.A00 = A04(this, r4);
        r2.A02 = Integer.valueOf(i);
        AnonymousClass4FV r0 = this.A0G;
        if (i == 1) {
            r0.BhA(r2);
        } else {
            r0.BhD(r2);
        }
    }

    public void A0K(C624134x r6, int i) {
        Long l;
        C25731az r2 = new C25731az();
        C95814uZ r3 = r6.A1J.A00;
        r2.A09 = AnonymousClass36M.A07(this.A09, r3);
        r2.A07 = Integer.valueOf(AnonymousClass29K.A00(this, r6));
        r2.A06 = Integer.valueOf(i);
        C95814uZ A0n = r6.A0n();
        r2.A03 = AnonymousClass368.A06(r3, A0n);
        r2.A05 = AnonymousClass368.A05(this.A03, DeviceJid.of(A0n));
        r2.A0B = AnonymousClass0x9.A0m(r6.A0C);
        Integer num = r6.A0p;
        r2.A00 = Boolean.valueOf(AnonymousClass000.A1W(num));
        if (num != null) {
            l = C18310x6.A0g(num);
        } else {
            l = null;
        }
        r2.A0A = l;
        r2.A08 = AnonymousClass368.A04(r6.A01);
        r2.A01 = A04(this, r6);
        int A082 = A08(r3);
        if (A082 != 0) {
            r2.A02 = Integer.valueOf(A082);
        }
        this.A0G.BhA(r2);
    }

    public void A0M(C624134x r6, C624134x r7, Integer num) {
        int i;
        C25131a1 r3 = new C25131a1();
        if (r7.A0q() != null) {
            C51962kf A0q = r7.A0q();
            C626936e.A06(A0q);
            r3.A06 = A0q.A01;
            int ordinal = r7.A0q().A00.ordinal();
            if (ordinal != 1) {
                int i2 = 4;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        i2 = 7;
                        if (ordinal != 4) {
                            i = null;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                i = Integer.valueOf(i2);
            } else {
                i = 3;
            }
            r3.A01 = i;
            r3.A03 = Integer.valueOf(AnonymousClass29K.A00(this, r7));
        } else {
            r3.A01 = AnonymousClass0x7.A0g();
        }
        if (r6 != null) {
            r3.A04 = Integer.valueOf(AnonymousClass36M.A06(r6));
            r3.A00 = A04(this, r6);
        }
        r3.A05 = C56612sH.A09(this.A06);
        r3.A02 = num;
        int intValue = num.intValue();
        AnonymousClass4FV r0 = this.A0G;
        if (intValue == 1) {
            r0.BhA(r3);
        } else {
            r0.BhD(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (A0T(r7.A1J.A00, r6.A0H) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (X.C624134x.A0g(r7) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        if (X.C627636p.A0J(r7.A1I) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (r7.A06 < 2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        if (r7.A0w() == null) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.AnonymousClass4FY r15, int r16, int r17) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.AnonymousClass3ST
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "MessageLogging: no appdata support"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0009:
            return
        L_0x000a:
            X.3ST r15 = (X.AnonymousClass3ST) r15
            X.34x r7 = r15.A0P
            X.2sH r0 = r14.A06
            long r4 = r0.A0H()
            X.1bQ r6 = new X.1bQ
            r6.<init>()
            java.lang.Long r0 = r15.A0b
            long r2 = r0.longValue()
            long r0 = r15.A16
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r6.A0N = r0
            java.lang.Long r0 = X.C18310x6.A0f(r4, r2)
            r6.A0O = r0
            java.lang.Long r0 = r15.A0a
            r6.A0Q = r0
            X.36Y r4 = r14.A0D
            X.2hp r3 = r14.A0Q
            X.2Yl r2 = r14.A0R
            int r0 = A00(r4, r15, r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0H = r0
            boolean r0 = r15.A0x
            if (r0 == 0) goto L_0x0352
            r1 = 3
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0I = r0
            r5 = 1
            if (r1 == r5) goto L_0x0052
            r0 = 3
            if (r1 != r0) goto L_0x0060
        L_0x0052:
            X.2sr r1 = r14.A03
            X.2z0 r0 = X.AnonymousClass3ST.A00(r15)
            java.lang.Boolean r0 = A01(r1, r0)
            if (r0 == 0) goto L_0x0060
            r6.A05 = r0
        L_0x0060:
            if (r7 == 0) goto L_0x006f
            X.2z0 r0 = r7.A1J
            X.4uZ r1 = r0.A00
            java.lang.Integer r0 = r6.A0H
            boolean r1 = r14.A0T(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A03 = r0
            X.2ss r9 = r14.A09
            r8 = 1
            X.C162457s7.A0J(r9, r5)
            if (r7 == 0) goto L_0x034f
            X.2z0 r0 = r7.A1J
            X.4uZ r0 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r9, r0)
        L_0x0086:
            r6.A0K = r0
            if (r7 == 0) goto L_0x0091
            boolean r1 = X.C624134x.A0g(r7)
            r0 = 1
            if (r1 != 0) goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
            if (r7 == 0) goto L_0x0104
            X.2z0 r0 = r7.A1J
            X.4uZ r1 = r0.A00
            X.2rR r10 = r14.A0E
            java.lang.Integer r0 = r10.A05()
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r6.A0S = r0
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00bb
            r0 = r1
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            int r0 = r10.A01(r0)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0T = r0
        L_0x00bb:
            X.31A r9 = X.C56982ss.A00(r9, r1)
            if (r9 == 0) goto L_0x00fc
            X.3Z2 r0 = r9.A0b
            int r1 = r0.disappearingMessagesInitiator
            r0 = 1
            if (r1 == 0) goto L_0x00cc
            r0 = 2
            if (r1 != r0) goto L_0x00cc
            r0 = 3
        L_0x00cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0D = r0
            X.1VX r0 = r14.A0F
            boolean r0 = X.C56952sp.A0G(r0)
            if (r0 == 0) goto L_0x00fc
            X.2kh r1 = r9.A0a
            if (r1 == 0) goto L_0x00fc
            int r0 = r1.A00
            int r0 = X.C18300x5.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0G = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.booleanValue()
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0F = r0
        L_0x00fc:
            int r0 = r7.A05
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0M = r0
        L_0x0104:
            java.lang.Integer r0 = r15.A0W
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A07 = r0
            java.lang.Integer r0 = r15.A0W
            r11 = 0
            if (r0 == 0) goto L_0x034c
            java.lang.Long r0 = X.C18310x6.A0g(r0)
        L_0x0119:
            r6.A0P = r0
            if (r7 == 0) goto L_0x0126
            byte r0 = r7.A1I
            boolean r1 = X.C627636p.A0J(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A04 = r0
            r0 = r16
            if (r16 <= 0) goto L_0x0140
            long r0 = (long) r0
            r12 = 32
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x013a
            r0 = 32
        L_0x013a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0R = r0
        L_0x0140:
            if (r7 == 0) goto L_0x0148
            int r9 = r7.A06
            r1 = 2
            r0 = 1
            if (r9 >= r1) goto L_0x0149
        L_0x0148:
            r0 = 0
        L_0x0149:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A02 = r0
            r10 = r17
            if (r17 <= 0) goto L_0x016c
            long r0 = (long) r10
            r12 = 32
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x015c
            r0 = 32
        L_0x015c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0L = r0
            int r0 = X.AnonymousClass36M.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0C = r0
        L_0x016c:
            if (r7 == 0) goto L_0x0175
            X.34x r1 = r7.A0w()
            r0 = 1
            if (r1 != 0) goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A01 = r0
            if (r7 == 0) goto L_0x0182
            X.2z0 r0 = r7.A1J
            X.4uZ r11 = r0.A00
        L_0x0182:
            X.1VX r10 = r14.A0F
            r0 = 441(0x1b9, float:6.18E-43)
            X.2vE r9 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r9, r0)
            if (r0 == 0) goto L_0x01a0
            boolean r0 = X.C627336j.A0K(r11)
            if (r0 == 0) goto L_0x01a0
            X.1R1 r0 = r14.A0S
            boolean r0 = r0.A0h(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A08 = r0
        L_0x01a0:
            int r1 = r15.A01
            java.lang.Integer r0 = X.AnonymousClass368.A04(r1)
            r6.A0J = r0
            X.2a1 r0 = r15.A0O
            if (r0 != 0) goto L_0x01cf
            X.2a1 r0 = r15.A0N
            if (r0 == 0) goto L_0x01cf
            com.whatsapp.jid.Jid r0 = r15.A18
            X.4uZ r0 = X.C627336j.A02(r0)
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r11 = "text"
            java.lang.String r0 = r15.A0v
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01cf
            int r0 = r15.A00
            if (r0 != r5) goto L_0x01cf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.A06 = r0
        L_0x01cf:
            java.lang.Integer r0 = A02(r1)
            r6.A0E = r0
            java.lang.Integer r0 = r14.A0A(r15)
            r6.A0A = r0
            r0 = 5325(0x14cd, float:7.462E-42)
            boolean r0 = r10.A0Y(r9, r0)
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r7 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0349
            X.1nE r7 = (X.AnonymousClass1nE) r7
            boolean r0 = r7.A23()
            if (r0 == 0) goto L_0x0349
        L_0x01ef:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.A09 = r0
        L_0x01f5:
            com.whatsapp.jid.Jid r7 = r15.A18
            X.4uZ r0 = X.C627336j.A02(r7)
            int r0 = r14.A08(r0)
            if (r0 == 0) goto L_0x0207
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0B = r0
        L_0x0207:
            X.4FV r1 = r14.A0G
            r1.BhD(r6)
            X.34x r5 = r15.A0P
            boolean r0 = X.C627636p.A0p(r5)
            if (r0 == 0) goto L_0x021b
            X.4FS r6 = r14.A0Y
            r0 = 22
            X.C70173a4.A00(r6, r5, r14, r0)
        L_0x021b:
            r0 = 2430(0x97e, float:3.405E-42)
            boolean r0 = r10.A0Y(r9, r0)
            if (r0 == 0) goto L_0x0260
            boolean r0 = r5 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0260
            r11 = r5
            X.1mW r11 = (X.C30481mW) r11
            X.5Zz r12 = r14.A0J
            java.lang.String r0 = r11.A13()
            java.lang.String r0 = r12.A03(r0)
            if (r0 == 0) goto L_0x0260
            X.1ZF r6 = new X.1ZF
            r6.<init>()
            int r0 = X.AnonymousClass36M.A06(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A02 = r0
            java.lang.Integer r0 = r14.A0B(r11)
            r6.A01 = r0
            java.lang.Integer r0 = A05(r10, r12, r11)
            r6.A03 = r0
            X.2qb r0 = r11.A0l
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
            r1.BhD(r6)
        L_0x0260:
            r0 = 1859(0x743, float:2.605E-42)
            boolean r0 = r10.A0Y(r9, r0)
            if (r0 == 0) goto L_0x02c7
            if (r5 == 0) goto L_0x02c7
            X.34x r11 = r5.A0w()
            if (r11 == 0) goto L_0x02c7
            java.util.Objects.requireNonNull(r11)
            boolean r0 = X.AnonymousClass2z0.A0B(r11)
            if (r0 == 0) goto L_0x02c7
            X.1Yd r6 = new X.1Yd
            r6.<init>()
            int r0 = X.AnonymousClass29K.A01(r4, r11, r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A00 = r0
            X.2sr r0 = r14.A03
            java.lang.String r0 = X.C56972sr.A06(r0)
            r6.A02 = r0
            int r4 = X.AnonymousClass29K.A01(r4, r5, r3, r2)
            r2 = 14
            r3 = 11
            if (r4 == r3) goto L_0x0343
            r11 = 16
            r0 = 7
            if (r4 == r11) goto L_0x02be
            r0 = 18
            if (r4 == r0) goto L_0x033f
            r0 = 23
            if (r4 == r0) goto L_0x033f
            r0 = 29
            if (r4 == r0) goto L_0x033f
            r0 = 13
            if (r4 == r0) goto L_0x033a
            if (r4 == r2) goto L_0x0337
            r0 = 31
            if (r4 == r0) goto L_0x0335
            r0 = 32
            if (r4 == r0) goto L_0x0343
            r3 = 2
            switch(r4) {
                case 1: goto L_0x0305;
                case 2: goto L_0x0335;
                case 3: goto L_0x0343;
                case 4: goto L_0x02fc;
                case 5: goto L_0x02fe;
                case 6: goto L_0x0337;
                case 7: goto L_0x0300;
                case 8: goto L_0x0303;
                case 9: goto L_0x033a;
                default: goto L_0x02bd;
            }
        L_0x02bd:
            r0 = 1
        L_0x02be:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02c2:
            r6.A01 = r0
            r1.BhD(r6)
        L_0x02c7:
            X.2hj r4 = r14.A0W
            X.4uZ r3 = X.C627336j.A02(r7)
            X.C626936e.A06(r3)
            X.3dI r2 = r4.A06
            r1 = 41
            X.3cK r0 = new X.3cK
            r0.<init>(r4, r1, r3)
            r2.execute(r0)
            if (r5 == 0) goto L_0x0009
            X.2rv r3 = r14.A0Z
            X.2z0 r0 = r5.A1J
            X.4uZ r2 = r0.A00
            boolean r0 = r3.A05(r2)
            r1 = 0
            if (r0 == 0) goto L_0x02f4
            r0 = 2
        L_0x02ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A0M(r1, r5, r0)
            return
        L_0x02f4:
            boolean r0 = r3.A06(r2)
            if (r0 == 0) goto L_0x0009
            r0 = 3
            goto L_0x02ec
        L_0x02fc:
            r0 = 6
            goto L_0x02be
        L_0x02fe:
            r0 = 4
            goto L_0x02be
        L_0x0300:
            r0 = 10
            goto L_0x02be
        L_0x0303:
            r0 = 5
            goto L_0x02be
        L_0x0305:
            java.lang.String r4 = r5.A13()
            r2 = 0
            if (r4 == 0) goto L_0x033a
            int r0 = X.AnonymousClass5VB.A00(r4)
            if (r0 != r8) goto L_0x033a
            int r2 = java.lang.Character.codePointAt(r4, r2)
            java.util.Set r0 = X.C106595Zp.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x033a
            r0 = 1852(0x73c, float:2.595E-42)
            java.lang.String r0 = r10.A0R(r9, r0)
            java.util.List r0 = X.C106595Zp.A00(r0)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x033a
            r0 = 15
            goto L_0x02be
        L_0x0335:
            r0 = 3
            goto L_0x02be
        L_0x0337:
            r0 = 8
            goto L_0x02be
        L_0x033a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x02c2
        L_0x033f:
            r0 = 9
            goto L_0x02be
        L_0x0343:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x02c2
        L_0x0349:
            r5 = 0
            goto L_0x01ef
        L_0x034c:
            r0 = r11
            goto L_0x0119
        L_0x034f:
            r0 = 0
            goto L_0x0086
        L_0x0352:
            com.whatsapp.jid.Jid r0 = r15.A18
            X.4uZ r0 = X.C627336j.A02(r0)
            int r1 = X.AnonymousClass36M.A05(r0)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36E.A0P(X.4FY, int, int):void");
    }

    public void A0Q(AnonymousClass4FY r6, Integer num, int i) {
        Long l;
        if (r6 instanceof AnonymousClass3ST) {
            AnonymousClass3ST r2 = (AnonymousClass3ST) r6;
            C25731az r1 = new C25731az();
            r1.A09 = AnonymousClass36M.A07(this.A09, AnonymousClass3ST.A00(r2).A00);
            r1.A07 = Integer.valueOf(A00(this.A0D, r2, this.A0Q, this.A0R));
            r1.A06 = Integer.valueOf(i);
            if (i == 5) {
                r1.A04 = num;
            }
            r1.A03 = AnonymousClass368.A06(AnonymousClass3ST.A00(r2).A00, r2.A0E);
            r1.A05 = AnonymousClass368.A05(this.A03, DeviceJid.of(r2.BCm()));
            r1.A0B = AnonymousClass0x9.A0m(r2.BCI());
            r1.A00 = Boolean.valueOf(AnonymousClass000.A1W(r2.A0W));
            Integer num2 = r2.A0W;
            if (num2 != null) {
                l = C18310x6.A0g(num2);
            } else {
                l = null;
            }
            r1.A0A = l;
            r1.A08 = AnonymousClass368.A04(r2.A01);
            r1.A01 = A0A(r2);
            int A082 = A08(r6.B9a().A00);
            if (A082 != 0) {
                r1.A02 = Integer.valueOf(A082);
            }
            this.A0G.BhA(r1);
        }
    }

    public void A0R(AnonymousClass4FY r5, Integer num, int i) {
        Integer valueOf;
        if (r5 instanceof AnonymousClass3ST) {
            AnonymousClass3ST r52 = (AnonymousClass3ST) r5;
            C25601am r2 = new C25601am();
            r2.A08 = r52.A1B;
            if (num != null) {
                int intValue = num.intValue();
                int i2 = 0;
                if (intValue != 0) {
                    i2 = 1;
                    if (intValue != 1) {
                        i2 = 2;
                        if (intValue != 2) {
                            i2 = 3;
                            if (intValue != 4) {
                                valueOf = null;
                                r2.A01 = valueOf;
                            }
                        }
                    }
                }
                valueOf = Integer.valueOf(i2);
                r2.A01 = valueOf;
            }
            r2.A03 = Integer.valueOf(i);
            Jid BCm = r52.BCm();
            if (BCm != null) {
                r2.A09 = BCm.getRawString();
                r2.A04 = AnonymousClass368.A05(this.A03, DeviceJid.of(BCm));
            }
            r2.A05 = Integer.valueOf(A00(this.A0D, r52, this.A0Q, this.A0R));
            r2.A00 = Boolean.valueOf(AnonymousClass000.A1W(r52.A0W));
            r2.A07 = AnonymousClass0x9.A0m(r52.BCI());
            r2.A02 = AnonymousClass368.A06(AnonymousClass3ST.A00(r52).A00, r52.A0E);
            r2.A06 = AnonymousClass368.A04(r52.A01);
            this.A0G.BhD(r2);
        }
    }

    public void A0S(Long l, int[] iArr, int i, long j, boolean z) {
        C25511ad r3 = new C25511ad();
        r3.A02 = Integer.valueOf(i);
        r3.A00 = Boolean.valueOf(z);
        r3.A07 = l;
        if (iArr != null) {
            int length = iArr.length;
            r3.A08 = AnonymousClass0x9.A0m(length);
            if (length >= 1) {
                r3.A03 = AnonymousClass0x9.A0m(iArr[0]);
                if (length >= 2) {
                    r3.A04 = AnonymousClass0x9.A0m(iArr[1]);
                    if (length >= 3) {
                        r3.A05 = AnonymousClass0x9.A0m(iArr[2]);
                        if (length >= 4) {
                            r3.A06 = AnonymousClass0x9.A0m(iArr[3]);
                        }
                    }
                }
            }
        }
        r3.A01 = C18330xA.A07(j);
        this.A0G.BhA(r3);
    }

    public boolean A0T(C95814uZ r5, Integer num) {
        if (!(r5 instanceof C27981fH)) {
            GroupJid A002 = AnonymousClass32V.A00(r5);
            if (A002 == null || num == null || num.intValue() != 34) {
                return false;
            }
            C64773Ex r0 = this.A05;
            C56982ss r1 = this.A09;
            AnonymousClass3ZH A092 = r0.A09(A002);
            if (A092 == null || !A092.A0k || !r1.A0O(A002)) {
                return false;
            }
        }
        return true;
    }

    public static int A00(AnonymousClass36Y r1, AnonymousClass4FY r2, C50222hp r3, C45042Yl r4) {
        C624134x B7X = r2.B7X();
        if (B7X != null) {
            return AnonymousClass29K.A01(r1, B7X, r3, r4);
        }
        return AnonymousClass368.A03(r2.B9e());
    }

    public static Boolean A01(C56972sr r2, AnonymousClass2z0 r3) {
        C95814uZ r0;
        Me A002 = C56972sr.A00(r2);
        if (A002 == null || (r0 = r3.A00) == null) {
            return null;
        }
        return C18320x8.A0V(r0.getRawString().startsWith(A002.cc));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r2.A04 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A05(X.AnonymousClass1VX r0, X.C106685Zz r1, X.C30481mW r2) {
        /*
            X.32K r0 = X.AnonymousClass32K.A00(r0, r1, r2)
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0012
            X.2qb r0 = r2.A0l
            if (r0 == 0) goto L_0x0012
            r1 = 5
        L_0x000d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0012:
            X.2qb r0 = r2.A0l
            if (r0 == 0) goto L_0x0018
            r1 = 4
            goto L_0x000d
        L_0x0018:
            byte[] r0 = r2.A1z()
            if (r0 != 0) goto L_0x002d
            byte[] r0 = r2.A08
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r2.A06
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = r2.A04
            r1 = 1
            if (r0 == 0) goto L_0x000d
        L_0x002b:
            r1 = 2
            goto L_0x000d
        L_0x002d:
            r1 = 3
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36E.A05(X.1VX, X.5Zz, X.1mW):java.lang.Integer");
    }

    public static Integer A06(C95814uZ r1) {
        int i;
        if (C627336j.A0K(r1)) {
            i = 2;
        } else if (r1 instanceof C135166kE) {
            i = 3;
        } else if (r1 instanceof AnonymousClass1fS) {
            i = 4;
        } else if (r1 instanceof UserJid) {
            i = 1;
        } else if (!(r1 instanceof C95804uY)) {
            return null;
        } else {
            i = 5;
        }
        return Integer.valueOf(i);
    }

    public void A0I(C28011fL r8, Integer num) {
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("messagelogging/postSenderKeyExpired multipleParticipantJid: ");
        C28011fL r4 = r8;
        A0o.append(r8);
        Integer num2 = num;
        C18260x0.A1P(A0o, " ; expiryReason: ", num);
        if (num != null) {
            if (C627336j.A0K(r8)) {
                i = 2;
            } else if (r8 instanceof C135166kE) {
                i = 3;
            } else if (r8 instanceof AnonymousClass1fS) {
                i = 4;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                this.A0Y.BkM(new C71593cM((Object) this, (Object) valueOf, (Object) r4, (Object) num2, 12));
            }
        }
    }

    public AnonymousClass36E(C116985rC r4, C55682qk r5, C56972sr r6, C29441ip r7, C64773Ex r8, C56612sH r9, AnonymousClass2ZV r10, C44412Vy r11, C56982ss r12, C56892sj r13, C56382rt r14, C48032eE r15, AnonymousClass36Y r16, C56112rR r17, AnonymousClass1VX r18, AnonymousClass4FV r19, C66833My r20, C54932pW r21, C106685Zz r22, C54882pR r23, C49592gm r24, AnonymousClass3A0 r25, C55892r5 r26, AnonymousClass30L r27, C58662vc r28, C50222hp r29, C45042Yl r30, AnonymousClass1R1 r31, C45112Ys r32, C55732qp r33, C55832qz r34, C50162hj r35, AnonymousClass4FS r36, C56402rv r37, C183538qC r38, C183538qC r39, C183538qC r40) {
        this.A06 = r9;
        AnonymousClass1VX r2 = r18;
        this.A0F = r2;
        this.A02 = r5;
        this.A03 = r6;
        AnonymousClass4FS r1 = r36;
        this.A0Y = r1;
        this.A09 = r12;
        this.A0J = r22;
        this.A0B = r14;
        this.A0Z = r37;
        this.A0G = r19;
        this.A0b = r38;
        this.A0I = r21;
        this.A0a = r39;
        this.A05 = r8;
        this.A0D = r16;
        this.A0U = r33;
        this.A0V = r34;
        this.A0c = r40;
        this.A0S = r31;
        this.A0N = r26;
        this.A0K = r23;
        this.A0L = r24;
        this.A07 = r10;
        this.A0W = r35;
        this.A08 = r11;
        this.A0T = r32;
        this.A0A = r13;
        this.A04 = r7;
        this.A0O = r27;
        this.A0M = r25;
        this.A0H = r20;
        this.A01 = r4;
        this.A0P = r28;
        this.A0C = r15;
        this.A0E = r17;
        this.A0Q = r29;
        this.A0R = r30;
        this.A0X = C72173dI.A00(r1);
        this.A0d = AnonymousClass000.A1S(r2.A0Y(C58422vE.A02, 1191) ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0318, code lost:
        if (r1.A07 == false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03a1, code lost:
        if (r13 == 88) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0600, code lost:
        if (X.C624134x.A0d(r8) == false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0789, code lost:
        if (r0 == false) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018c, code lost:
        if (r1.A09 == false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019a, code lost:
        if (r1.A08 == false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c6, code lost:
        if (r2.A09 == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01da, code lost:
        if (r2.A0A == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e8, code lost:
        if (r0 == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023a, code lost:
        if (r0.A09 == false) goto L_0x023c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:429:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(X.C624134x r35, java.lang.Integer r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        /*
            r34 = this;
            r8 = r35
            r12 = r38
            if (r35 == 0) goto L_0x07cc
            r1 = 1
            int r0 = r8.A0A
            r0 = r0 & 1
            boolean r24 = X.AnonymousClass000.A1U(r0, r1)
            boolean r0 = r8 instanceof X.C30441mS
            r19 = r0
            r7 = r34
            X.2sH r0 = r7.A06
            r32 = r0
            long r2 = r32.A0H()
            if (r19 == 0) goto L_0x0248
            r0 = r8
            X.1mS r0 = (X.C30441mS) r0
            long r0 = r0.A00
        L_0x0024:
            long r2 = r2 - r0
            X.1bT r6 = new X.1bT
            r6.<init>()
            r33 = r37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
            r6.A0Q = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A0Y = r0
            X.36Y r0 = r7.A0D
            r31 = r0
            X.2hp r0 = r7.A0Q
            r30 = r0
            X.2Yl r0 = r7.A0R
            r29 = r0
            r2 = r31
            r1 = r30
            int r0 = X.AnonymousClass29K.A01(r2, r8, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0P = r0
            int r0 = X.AnonymousClass36M.A06(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0R = r0
            X.2ss r11 = r7.A09
            r5 = 1
            X.C162457s7.A0J(r11, r5)
            X.2z0 r0 = r8.A1J
            r28 = r0
            X.4uZ r4 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r11, r4)
            r6.A0T = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r47)
            r6.A0B = r0
            int r0 = r8.A01
            java.lang.Integer r0 = A02(r0)
            r6.A0L = r0
            r0 = r32
            long r2 = X.C56612sH.A04(r0, r8)
            r16 = 1000(0x3e8, double:4.94E-321)
            r0 = r16
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)
            r6.A0V = r0
            r0 = r39
            if (r39 <= 0) goto L_0x009f
            long r0 = (long) r0
            r9 = 32
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0099
            r0 = 32
        L_0x0099:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0Z = r0
        L_0x009f:
            r2 = r40
            if (r40 <= 0) goto L_0x00bc
            long r0 = (long) r2
            r9 = 32
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x00ac
            r0 = 32
        L_0x00ac:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0U = r0
            int r0 = X.AnonymousClass36M.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0I = r0
        L_0x00bc:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r44)
            r0 = r18
            r6.A0A = r0
            java.lang.Integer r0 = r6.A0R
            int r0 = r0.intValue()
            r25 = 1
            if (r0 != r5) goto L_0x00da
            X.2sr r1 = r7.A03
            r0 = r28
            java.lang.Boolean r0 = A01(r1, r0)
            if (r0 == 0) goto L_0x00da
            r6.A07 = r0
        L_0x00da:
            java.lang.Integer r0 = r6.A0P
            boolean r0 = r7.A0T(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A03 = r0
            boolean r0 = X.C624134x.A0g(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A01 = r0
            X.2rR r0 = r7.A0E
            r27 = r0
            java.lang.Integer r0 = r27.A05()
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r6.A0e = r0
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            r23 = r0
            if (r0 == 0) goto L_0x0113
            r1 = r4
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r27
            int r0 = r0.A01(r1)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0a = r0
        L_0x0113:
            X.31A r1 = X.C56982ss.A00(r11, r4)
            if (r1 == 0) goto L_0x0154
            X.3Z2 r0 = r1.A0b
            int r2 = r0.disappearingMessagesInitiator
            r0 = 1
            if (r2 == 0) goto L_0x0124
            r0 = 2
            if (r2 != r0) goto L_0x0124
            r0 = 3
        L_0x0124:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0J = r0
            X.1VX r0 = r7.A0F
            boolean r0 = X.C56952sp.A0G(r0)
            if (r0 == 0) goto L_0x0154
            X.2kh r1 = r1.A0a
            if (r1 == 0) goto L_0x0154
            int r0 = r1.A00
            int r0 = X.C18300x5.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0N = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.booleanValue()
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0M = r0
        L_0x0154:
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0169
            r0 = r8
            X.1mV r0 = (X.C30471mV) r0
            java.lang.String r0 = r0.A1w()
            boolean r0 = X.C18320x8.A1U(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A05 = r0
        L_0x0169:
            boolean r0 = r8 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x017c
            r0 = r8
            X.1nF r0 = (X.AnonymousClass1nF) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18320x8.A1U(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A05 = r0
        L_0x017c:
            boolean r0 = r8 instanceof X.AnonymousClass1nE
            r22 = r0
            if (r0 == 0) goto L_0x0324
            r13 = r8
            X.1nE r13 = (X.AnonymousClass1nE) r13
            X.330 r1 = r13.A04
            if (r1 == 0) goto L_0x018e
            boolean r0 = r1.A09
            r2 = 1
            if (r0 != 0) goto L_0x018f
        L_0x018e:
            r2 = 0
        L_0x018f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.A0E = r0
            if (r1 == 0) goto L_0x019c
            boolean r1 = r1.A08
            r0 = 1
            if (r1 != 0) goto L_0x019d
        L_0x019c:
            r0 = 0
        L_0x019d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0D = r0
            X.1aX r1 = new X.1aX
            r1.<init>()
            java.lang.Integer r0 = r13.A05
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "If you reach this breakpoint, please add info on which screen originated this sticker send or any specific flow you took to reach here T170675310"
            X.C626936e.A0D(r2, r0)
            java.lang.Integer r0 = r13.A05
            r1.A07 = r0
            boolean r0 = r13.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.330 r2 = r13.A04
            if (r2 == 0) goto L_0x01c8
            boolean r0 = r2.A09
            r3 = 1
            if (r0 != 0) goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A03 = r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r1.A06 = r10
            if (r2 == 0) goto L_0x01dc
            boolean r0 = r2.A0A
            r3 = 1
            if (r0 != 0) goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A04 = r0
            if (r2 == 0) goto L_0x01ea
            boolean r0 = r2.A08
            r2 = 1
            if (r0 != 0) goto L_0x01eb
        L_0x01ea:
            r2 = 0
        L_0x01eb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A02 = r0
            boolean r0 = r13.A23()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            X.1VX r0 = r7.A0F
            r26 = r0
            r2 = 6787(0x1a83, float:9.51E-42)
            X.2vE r15 = X.C58422vE.A02
            boolean r0 = r0.A0Y(r15, r2)
            if (r0 == 0) goto L_0x0213
            boolean r0 = r13.A24()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A05 = r0
        L_0x0213:
            boolean r0 = r13.A23()
            if (r0 == 0) goto L_0x0229
            X.1Wx r2 = new X.1Wx
            r2.<init>()
            r2.A00 = r10
            java.lang.Integer r0 = r13.A05
            r2.A01 = r0
            X.4FV r0 = r7.A0G
            r0.BhD(r2)
        L_0x0229:
            X.4FV r9 = r7.A0G
            r9.BhD(r1)
            X.2Ys r1 = r7.A0T
            java.lang.Integer r14 = r13.A05
            X.330 r0 = r13.A04
            if (r0 == 0) goto L_0x023c
            boolean r0 = r0.A09
            r21 = 1
            if (r0 != 0) goto L_0x023e
        L_0x023c:
            r21 = 0
        L_0x023e:
            boolean r0 = r13.A02
            r20 = r0
            X.2cD r3 = r1.A01
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
            goto L_0x024c
        L_0x0248:
            long r0 = r8.A0K
            goto L_0x0024
        L_0x024c:
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02e5 }
            java.lang.String r0 = "sticker_send_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02e5 }
            monitor-exit(r2)     // Catch:{ all -> 0x02e5 }
            if (r14 == 0) goto L_0x0260
            int r0 = r14.intValue()
            switch(r0) {
                case 1: goto L_0x0264;
                case 2: goto L_0x0271;
                case 3: goto L_0x027e;
                case 4: goto L_0x028b;
                case 5: goto L_0x0298;
                case 6: goto L_0x02a5;
                default: goto L_0x0260;
            }
        L_0x0260:
            if (r20 == 0) goto L_0x02c1
            monitor-enter(r2)
            goto L_0x02b2
        L_0x0264:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02d3 }
            java.lang.String r0 = "sticker_send_from_search_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02d3 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d3 }
            goto L_0x0260
        L_0x0271:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = "sticker_send_from_forward_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02d6 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d6 }
            goto L_0x0260
        L_0x027e:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02d9 }
            java.lang.String r0 = "sticker_send_from_recent_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02d9 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d9 }
            goto L_0x0260
        L_0x028b:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02dc }
            java.lang.String r0 = "sticker_send_from_favorites_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02dc }
            monitor-exit(r2)     // Catch:{ all -> 0x02dc }
            goto L_0x0260
        L_0x0298:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "sticker_send_from_emotion_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02df }
            monitor-exit(r2)     // Catch:{ all -> 0x02df }
            goto L_0x0260
        L_0x02a5:
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02e2 }
            java.lang.String r0 = "sticker_send_from_pack_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02e2 }
            monitor-exit(r2)     // Catch:{ all -> 0x02e2 }
            goto L_0x0260
        L_0x02b2:
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02be }
            java.lang.String r0 = "sticker_send_animated_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02be }
            monitor-exit(r2)     // Catch:{ all -> 0x02be }
            goto L_0x02c1
        L_0x02be:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02be }
            throw r0
        L_0x02c1:
            if (r21 == 0) goto L_0x02e8
            monitor-enter(r2)
            android.content.SharedPreferences r1 = r3.A00()     // Catch:{ all -> 0x02d0 }
            java.lang.String r0 = "sticker_send_first_party_count"
            A07(r1, r3, r0)     // Catch:{ all -> 0x02d0 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d0 }
            goto L_0x02e8
        L_0x02d0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d0 }
            throw r0
        L_0x02d3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d3 }
            throw r0
        L_0x02d6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d6 }
            throw r0
        L_0x02d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d9 }
            throw r0
        L_0x02dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02dc }
            throw r0
        L_0x02df:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02df }
            throw r0
        L_0x02e2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02e2 }
            throw r0
        L_0x02e5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02e5 }
            throw r0
        L_0x02e8:
            X.330 r0 = r13.A04
            if (r0 == 0) goto L_0x0324
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0324
            X.1Yo r2 = new X.1Yo
            r2.<init>()
            r2.A02 = r10
            java.lang.Integer r0 = r13.A05
            r2.A03 = r0
            boolean r0 = r13.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            r1 = 4501(0x1195, float:6.307E-42)
            r0 = r26
            boolean r0 = r0.A0Y(r15, r1)
            if (r0 == 0) goto L_0x0321
            X.330 r1 = r13.A04
            if (r1 == 0) goto L_0x031a
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x031a
            boolean r1 = r1.A07
            r0 = 1
            if (r1 != 0) goto L_0x031b
        L_0x031a:
            r0 = 0
        L_0x031b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
        L_0x0321:
            r9.BhD(r2)
        L_0x0324:
            r2 = 0
            if (r19 == 0) goto L_0x07bd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.A09 = r0
            r0 = r32
            long r13 = X.C56612sH.A04(r0, r8)
            long r13 = r13 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r6.A0c = r0
            boolean r0 = r8 instanceof X.C30961nV
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r6.A0S = r9
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0355
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageLogging/buildMessageSend Failed to log revoke duration; type="
            X.C18260x0.A1S(r1, r0, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A0c = r0
        L_0x0355:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r6.A06 = r0
            if (r12 <= r5) goto L_0x0365
            int r0 = r38 - r5
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0b = r0
        L_0x0365:
            int r0 = r8.A05
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0W = r0
            byte r13 = r8.A1I
            boolean r0 = X.C627636p.A0J(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r46)
            r6.A00 = r0
            if (r45 == 0) goto L_0x0396
            boolean r0 = r8 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0798
            r0 = r8
            X.1mW r0 = (X.C30481mW) r0
            byte[] r0 = r0.A1z()
            if (r0 == 0) goto L_0x0396
            int r0 = r0.length
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0394:
            r6.A0F = r0
        L_0x0396:
            boolean r0 = r8 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x03a3
            r0 = 87
            if (r13 == r0) goto L_0x03a3
            r0 = 88
            r1 = 0
            if (r13 != r0) goto L_0x03a4
        L_0x03a3:
            r1 = 1
        L_0x03a4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.A08 = r0
            X.34x r0 = r8.A0w()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A02 = r0
            r0 = r41
            if (r41 <= 0) goto L_0x03d1
            double r0 = (double) r0
            r9 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r9
            double r0 = java.lang.Math.ceil(r0)
            long r9 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r6.A0X = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r42)
            r6.A0O = r0
        L_0x03d1:
            X.3A0 r14 = r7.A0M
            long r0 = r14.A00
            long r9 = r14.A01
            long r0 = r0 - r9
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x03ea
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ea
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0d = r0
            r14.A01 = r2
            r14.A00 = r2
        L_0x03ea:
            r0 = r36
            r6.A0K = r0
            java.lang.Integer r0 = A04(r7, r8)
            r6.A0G = r0
            X.1VX r3 = r7.A0F
            r0 = 5325(0x14cd, float:7.462E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x0411
            if (r22 == 0) goto L_0x0794
            r0 = r8
            X.1nE r0 = (X.AnonymousClass1nE) r0
            boolean r0 = r0.A23()
            if (r0 == 0) goto L_0x0794
        L_0x040b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            r6.A0C = r0
        L_0x0411:
            int r0 = r7.A08(r4)
            if (r0 == 0) goto L_0x041d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0H = r0
        L_0x041d:
            if (r43 == 0) goto L_0x0425
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r43)
            r6.A0f = r0
        L_0x0425:
            boolean r0 = X.C627636p.A0p(r8)
            if (r0 == 0) goto L_0x0432
            X.4FS r1 = r7.A0Y
            r0 = 21
            X.C70173a4.A00(r1, r8, r7, r0)
        L_0x0432:
            r0 = 2430(0x97e, float:3.405E-42)
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x046d
            boolean r0 = r8 instanceof X.C30481mW
            if (r0 == 0) goto L_0x046d
            r10 = r8
            X.1mW r10 = (X.C30481mW) r10
            X.5Zz r9 = r7.A0J
            java.lang.String r0 = r10.A13()
            java.lang.String r0 = r9.A03(r0)
            if (r0 == 0) goto L_0x046d
            X.1Yl r1 = new X.1Yl
            r1.<init>()
            int r0 = X.AnonymousClass36M.A06(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = r7.A0B(r10)
            r1.A00 = r0
            java.lang.Integer r0 = A05(r3, r9, r10)
            r1.A02 = r0
            X.4FV r0 = r7.A0G
            r0.BhD(r1)
        L_0x046d:
            X.4FV r9 = r7.A0G
            r9.BhD(r6)
            if (r24 == 0) goto L_0x057e
            X.1b8 r10 = new X.1b8
            r10.<init>()
            r14 = r31
            r1 = r30
            r0 = r29
            int r0 = X.AnonymousClass29K.A01(r14, r8, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A09 = r0
            int r0 = X.AnonymousClass36M.A06(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A0A = r0
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r11, r4)
            r10.A0B = r0
            int r1 = r8.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A01 = r0
            int r14 = r8.A06
            r15 = 0
            r1 = 2
            boolean r0 = X.C18280x3.A1U(r14, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A00 = r0
            r0 = 3
            boolean r0 = X.C18280x3.A1U(r14, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A03 = r0
            r0 = 4
            if (r14 < r0) goto L_0x04c4
            r15 = 1
        L_0x04c4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r10.A04 = r0
            java.lang.Integer r0 = r10.A0A
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x04de
            X.2sr r14 = r7.A03
            r0 = r28
            java.lang.Boolean r0 = A01(r14, r0)
            if (r0 == 0) goto L_0x04de
            r10.A02 = r0
        L_0x04de:
            java.lang.Integer r0 = r27.A05()
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r10.A0E = r0
            if (r23 == 0) goto L_0x04f9
            r14 = r4
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            r0 = r27
            int r0 = r0.A01(r14)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r10.A0D = r0
        L_0x04f9:
            X.31A r14 = X.C56982ss.A00(r11, r4)
            if (r14 == 0) goto L_0x0538
            X.3Z2 r0 = r14.A0b
            int r0 = r0.disappearingMessagesInitiator
            r15 = 1
            if (r0 == 0) goto L_0x050a
            r15 = 2
            if (r0 != r1) goto L_0x050a
            r15 = 3
        L_0x050a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r10.A05 = r0
            boolean r0 = X.C56952sp.A0G(r3)
            if (r0 == 0) goto L_0x0538
            X.2kh r1 = r14.A0a
            if (r1 == 0) goto L_0x0538
            int r0 = r1.A00
            int r0 = X.C18300x5.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A07 = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0538
            boolean r0 = r0.booleanValue()
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A06 = r0
        L_0x0538:
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x0573
            X.2kg r14 = r8.A0s()
            java.lang.Long r0 = r8.A0s
            if (r0 == 0) goto L_0x0791
            X.2eE r15 = r7.A0C
            long r0 = r0.longValue()
            X.2k2 r15 = r15.A00(r0)
            if (r4 == 0) goto L_0x0791
            if (r14 == 0) goto L_0x0791
            if (r15 == 0) goto L_0x0791
            X.3Ex r1 = r7.A05
            com.whatsapp.jid.UserJid r0 = r14.A01
            X.3ZH r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0791
            X.2qS r0 = r0.A0E
            if (r0 == 0) goto L_0x0791
            boolean r1 = r0.A03()
            if (r1 == 0) goto L_0x0770
            r1 = 4
        L_0x056d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r10.A08 = r0
        L_0x0573:
            int r0 = r8.A05
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r10.A0C = r0
            r9.BhB(r10)
        L_0x057e:
            X.5rC r0 = r7.A01
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x05a0
            boolean r0 = r4 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x05a0
            boolean r0 = X.C624134x.A0e(r8)
            if (r0 != 0) goto L_0x05a0
            boolean r0 = r4 instanceof X.C28011fL
            if (r0 == 0) goto L_0x05a0
            r0 = r4
            X.1fL r0 = (X.C28011fL) r0
            if (r0 == 0) goto L_0x05a0
            X.4FS r1 = r7.A0Y
            r0 = 20
            X.C70173a4.A00(r1, r8, r7, r0)
        L_0x05a0:
            java.lang.Long r0 = r6.A0Y
            if (r0 == 0) goto L_0x05fa
            java.lang.Long r0 = r6.A0b
            if (r0 != 0) goto L_0x05fa
            java.lang.Integer r0 = r6.A0Q
            if (r0 == 0) goto L_0x05fa
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x05fa
            java.lang.Boolean r0 = r6.A06
            if (r0 == 0) goto L_0x05fa
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x05fa
            java.lang.Integer r0 = r6.A0R
            if (r0 == 0) goto L_0x05fa
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x05fa
            java.lang.Integer r0 = r6.A0P
            if (r0 == 0) goto L_0x05fa
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x05fa
            r0 = 1625(0x659, float:2.277E-42)
            int r1 = r3.A0O(r2, r0)
            if (r1 <= 0) goto L_0x05fa
            java.lang.Long r0 = r6.A0Y
            long r14 = r0.longValue()
            long r0 = (long) r1
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x05fa
            X.1Y1 r3 = new X.1Y1
            r3.<init>()
            java.lang.String r2 = "message_send"
            r3.A02 = r2
            java.lang.Long r2 = r6.A0Y
            r3.A00 = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A01 = r0
            r9.BhA(r3)
        L_0x05fa:
            if (r19 != 0) goto L_0x06cb
            boolean r0 = X.C624134x.A0d(r8)
            if (r0 != 0) goto L_0x06d4
        L_0x0602:
            boolean r0 = r8 instanceof X.C30561me
            if (r0 == 0) goto L_0x0679
            r1 = r8
            X.1mH r1 = (X.C30331mH) r1
            X.2qz r0 = r7.A0V
            X.34x r0 = X.C30331mH.A01(r1, r0)
            if (r0 == 0) goto L_0x06c8
            int r11 = X.AnonymousClass29K.A00(r7, r0)
        L_0x0615:
            X.2vc r3 = r7.A0P
            boolean r0 = r1 instanceof X.C30561me
            if (r0 == 0) goto L_0x0679
            X.1Zr r2 = new X.1Zr
            r2.<init>()
            r6 = r1
            X.1me r6 = (X.C30561me) r6
            int r0 = r6.A00
            r10 = 2
            if (r0 != r5) goto L_0x06c2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x062c:
            r2.A04 = r0
            X.2z0 r0 = r1.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x0664
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x06bd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A00 = r0
            X.1fJ r9 = X.AnonymousClass34R.A01(r1)
            if (r9 == 0) goto L_0x0664
            X.2rN r0 = r3.A02
            int r0 = r0.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.2sj r1 = r3.A00
            boolean r0 = r1.A0C(r9)
            if (r0 == 0) goto L_0x0664
            boolean r0 = r1.A0D(r9)
            if (r0 == 0) goto L_0x06b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0662:
            r2.A01 = r0
        L_0x0664:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2.A03 = r0
            int r0 = r6.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A05 = r0
            X.4FV r1 = r3.A01
            X.5ZC r0 = X.C58662vc.A03
            r1.BhC(r2, r0)
        L_0x0679:
            X.2rv r1 = r7.A0Z
            boolean r0 = r1.A05(r4)
            if (r0 == 0) goto L_0x06b0
            r0 = 2
        L_0x0682:
            r7.A0J(r8, r0)
        L_0x0685:
            boolean r0 = r4 instanceof X.C135166kE
            if (r0 == 0) goto L_0x07cc
            r0 = r33
            if (r0 != r5) goto L_0x06ad
            java.lang.String r4 = "success"
        L_0x0690:
            X.8qC r0 = r7.A0c
            java.lang.Object r3 = r0.get()
            X.5mK r3 = (X.C113995mK) r3
            int r0 = r8.A0C
            long r1 = (long) r0
            java.lang.String r0 = "success"
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x07c3
            X.5Z9 r2 = r3.A0C
            r1 = 14
            r0 = 0
            r2.A02(r8, r0, r0, r1)
            return
        L_0x06ad:
            java.lang.String r4 = "error_unknown"
            goto L_0x0690
        L_0x06b0:
            boolean r0 = r1.A06(r4)
            if (r0 == 0) goto L_0x0685
            r0 = 3
            goto L_0x0682
        L_0x06b8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0662
        L_0x06bd:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A00 = r0
            goto L_0x0664
        L_0x06c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x062c
        L_0x06c8:
            r11 = 1
            goto L_0x0615
        L_0x06cb:
            int r1 = X.AnonymousClass36M.A06(r8)
            if (r1 == r5) goto L_0x06df
            r0 = 2
            if (r1 == r0) goto L_0x06df
        L_0x06d4:
            int r1 = X.AnonymousClass36M.A06(r8)
            if (r1 == r5) goto L_0x071c
            r0 = 2
            if (r1 == r0) goto L_0x071c
            goto L_0x0602
        L_0x06df:
            X.1Zv r6 = new X.1Zv
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A01 = r0
            boolean r0 = r8 instanceof X.C30961nV
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A02 = r0
            r0 = r32
            long r2 = X.C56612sH.A04(r0, r8)
            r0 = r16
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)
            r6.A05 = r0
            if (r12 <= r5) goto L_0x070a
            int r0 = r38 - r5
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A03 = r0
        L_0x070a:
            int r0 = r8.A0C
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A04 = r0
            r0 = r18
            r6.A00 = r0
            X.5ZC r0 = A0e
            r9.BhC(r6, r0)
            goto L_0x06d4
        L_0x071c:
            X.1aP r6 = new X.1aP
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A03 = r0
            int r0 = r8.A01
            java.lang.Integer r0 = A02(r0)
            r6.A01 = r0
            r0 = r32
            long r2 = X.C56612sH.A04(r0, r8)
            r0 = r16
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)
            r6.A05 = r0
            if (r12 <= r5) goto L_0x0747
            int r12 = r38 - r5
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r12)
            r6.A06 = r0
        L_0x0747:
            int r0 = r8.A0C
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A07 = r0
            r0 = r18
            r6.A00 = r0
            int r1 = r8.A09
            boolean r0 = X.C627636p.A0p(r8)
            int r0 = X.C106495Zf.A00(r13, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A02 = r0
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r11, r4)
            r6.A04 = r0
            X.5ZC r0 = A0e
            r9.BhC(r6, r0)
            goto L_0x0602
        L_0x0770:
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0791
            java.lang.String r1 = r15.A00
            if (r1 == 0) goto L_0x078b
            java.lang.String r0 = "UTILITY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x078e
            java.lang.String r0 = "MARKETING"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x056d
        L_0x078b:
            r1 = 3
            goto L_0x056d
        L_0x078e:
            r1 = 2
            goto L_0x056d
        L_0x0791:
            r1 = 0
            goto L_0x056d
        L_0x0794:
            r25 = 0
            goto L_0x040b
        L_0x0798:
            X.3My r10 = r7.A0H
            r9 = 0
            X.3d7 r1 = X.C72063d7.A00
            X.2kE r0 = new X.2kE
            r0.<init>(r1, r9)
            r10.BJr(r0, r8)
            X.30w r9 = r8.A0y()
            if (r9 == 0) goto L_0x0396
            monitor-enter(r9)
            byte[] r0 = r9.A03     // Catch:{ all -> 0x07c9 }
            if (r0 != 0) goto L_0x07b4
            monitor-exit(r9)
            r0 = 0
            goto L_0x0394
        L_0x07b4:
            int r0 = r0.length     // Catch:{ all -> 0x07c9 }
            double r0 = (double) r0     // Catch:{ all -> 0x07c9 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x07c9 }
            monitor-exit(r9)
            goto L_0x0394
        L_0x07bd:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.A09 = r0
            goto L_0x0355
        L_0x07c3:
            X.5Z9 r0 = r3.A0C
            r0.A03(r8, r4, r1)
            return
        L_0x07c9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x07cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36E.A0N(X.34x, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a9, code lost:
        if (r12 == 88) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C624134x r29, java.util.Collection r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, long r39, long r41, long r43, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            r28 = this;
            r8 = r29
            r13 = r35
            r9 = r34
            X.2z0 r11 = r8.A1J
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0300
            boolean r0 = r8.A1q()
            if (r0 == 0) goto L_0x0300
            X.1bS r5 = new X.1bS
            r5.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r43)
            r5.A0O = r0
            r19 = r39
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r5.A0M = r0
            r17 = r41
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r5.A0N = r0
            boolean r0 = r8 instanceof X.C30441mS
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A07 = r0
            r4 = r28
            int r0 = X.AnonymousClass29K.A00(r4, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0H = r0
            r27 = r31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r5.A0J = r0
            int r0 = X.AnonymousClass36M.A06(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0I = r0
            X.2ss r0 = r4.A09
            r14 = 1
            X.C162457s7.A0J(r0, r14)
            X.4uZ r7 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r0, r7)
            r5.A0K = r0
            r15 = 1
            int r0 = r8.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A06 = r0
            byte r12 = r8.A1I
            boolean r0 = X.C627636p.A0J(r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A08 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r33)
            r5.A0V = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r32)
            r5.A0U = r0
            boolean r0 = X.C627636p.A0r(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r45)
            r5.A0B = r0
            int r0 = r8.A01
            java.lang.Integer r0 = A02(r0)
            r5.A0F = r0
            X.2Vy r6 = r4.A08
            monitor-enter(r6)
            r3 = 0
            if (r7 == 0) goto L_0x00b4
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x01eb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x00b4
            int r3 = r0.intValue()     // Catch:{ all -> 0x01eb }
        L_0x00b4:
            monitor-exit(r6)
            if (r3 <= 0) goto L_0x011b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.A0D = r0
        L_0x00bb:
            X.1VX r2 = r4.A0F
            X.2vE r1 = X.C58422vE.A01
            r0 = 767(0x2ff, float:1.075E-42)
            int r0 = r2.A0O(r1, r0)
            if (r9 >= r0) goto L_0x00c9
            if (r3 < r0) goto L_0x00cd
        L_0x00c9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.A0C = r0
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r47)
            r5.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r48)
            r5.A03 = r0
            r1 = 5
            r0 = r27
            if (r0 != r1) goto L_0x00ea
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r36)
            r5.A0Q = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r37)
            r5.A0Y = r0
        L_0x00ea:
            boolean r0 = X.C627336j.A0K(r7)
            r23 = r38
            if (r0 != 0) goto L_0x0122
            boolean r0 = r7 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0122
            if (r30 == 0) goto L_0x0198
            java.util.Iterator r13 = r30.iterator()
            r10 = 0
        L_0x00fd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x018c
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x7.A0R(r13)
            X.2sr r0 = r4.A03
            boolean r9 = X.C56972sr.A09(r0, r1)
            if (r9 != 0) goto L_0x0118
            boolean r0 = r0.A0b(r1)
            if (r0 != 0) goto L_0x0118
            int r10 = r10 + 1
            goto L_0x00fd
        L_0x0118:
            int r15 = r15 + 1
            goto L_0x00fd
        L_0x011b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r46)
            r5.A01 = r0
            goto L_0x00bb
        L_0x0122:
            if (r38 <= 0) goto L_0x013f
            r0 = r23
            long r0 = (long) r0
            r15 = 32
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x012f
            r0 = 32
        L_0x012f:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0R = r0
            int r0 = X.AnonymousClass36M.A04(r23)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0G = r0
        L_0x013f:
            if (r30 == 0) goto L_0x0198
            int r10 = r30.size()
            if (r10 <= 0) goto L_0x0198
            long r0 = (long) r10
            r21 = 32
            int r15 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r15 > 0) goto L_0x0150
            r0 = 32
        L_0x0150:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0L = r0
            int r0 = X.AnonymousClass36M.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0E = r0
            if (r3 <= 0) goto L_0x0188
            r9 = r3
        L_0x0163:
            double r0 = (double) r9
            r21 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r21
            double r9 = (double) r10
            double r0 = r0 / r9
            double r0 = java.lang.Math.ceil(r0)
            long r15 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r5.A0P = r0
            if (r35 >= 0) goto L_0x0178
            r13 = 0
        L_0x0178:
            double r0 = (double) r13
            double r0 = r0 * r21
            double r0 = r0 / r9
            double r0 = java.lang.Math.ceil(r0)
            long r9 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A0X = r0
            goto L_0x0198
        L_0x0188:
            if (r34 >= 0) goto L_0x0163
            r9 = 0
            goto L_0x0163
        L_0x018c:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r15)
            r5.A0W = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r10)
            r5.A0T = r0
        L_0x0198:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r49)
            r5.A02 = r0
            boolean r0 = r8 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x01ab
            r0 = 87
            if (r12 == r0) goto L_0x01ab
            r0 = 88
            r1 = 0
            if (r12 != r0) goto L_0x01ac
        L_0x01ab:
            r1 = 1
        L_0x01ac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A0A = r0
            java.lang.Integer r0 = r5.A0H
            boolean r0 = r4.A0T(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A04 = r0
            X.3dI r1 = r4.A0X
            X.3c6 r0 = new X.3c6
            r24 = r8
            r25 = r23
            r26 = r14
            r21 = r0
            r22 = r4
            r23 = r5
            r21.<init>(r22, r23, r24, r25, r26)
            r1.execute(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.A1Q = r0
            r1 = 3
            r0 = r27
            if (r0 != r1) goto L_0x01ef
            if (r3 <= 0) goto L_0x01ef
            r1 = 0
            monitor-enter(r6)
            if (r7 == 0) goto L_0x01ee
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x01eb }
            X.C18280x3.A1D(r7, r0, r1)     // Catch:{ all -> 0x01eb }
            goto L_0x01ee
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x01ee:
            monitor-exit(r6)
        L_0x01ef:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageLogging/postAndroidMessageSendPerfEvent "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " : "
            X.C18260x0.A1P(r1, r0, r11)
            boolean r0 = r4.A0d
            if (r0 == 0) goto L_0x02a6
            X.30L r7 = r4.A0O
            java.lang.String r0 = r11.A01
            int r8 = r0.hashCode()
            java.lang.Integer r0 = r5.A0J
            if (r0 == 0) goto L_0x02a6
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L_0x029d
            X.316 r3 = r7.A01
            java.lang.String r13 = "wa_type"
            long r0 = (long) r12
            X.8JP r9 = r3.A0C
            X.2ck r3 = r3.A0A
            int r6 = r3.A07
            r10 = r9
            r11 = r6
            r12 = r8
            r14 = r0
            r10.markerAnnotate((int) r11, (int) r12, (java.lang.String) r13, (long) r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageSendPerfQplTracker/markerAnnotate instanceKey: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; messageSendPerfEvent: "
            java.lang.String r0 = X.C18300x5.A0k(r5, r0, r1)
            X.C18260x0.A1J(r1, r0)
            java.lang.Class<X.1bS> r0 = X.C26021bS.class
            java.lang.reflect.Field[] r12 = r0.getDeclaredFields()
            if (r12 == 0) goto L_0x029d
            int r11 = r12.length
            if (r11 <= 0) goto L_0x029d
            r10 = 0
        L_0x024b:
            r0 = r12[r10]
            java.lang.Object r1 = r0.get(r5)     // Catch:{ IllegalAccessException -> 0x0293 }
            if (r1 == 0) goto L_0x0298
            java.lang.String r3 = r0.getName()     // Catch:{ IllegalAccessException -> 0x0293 }
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x0293 }
            if (r0 == 0) goto L_0x026e
            int r0 = X.AnonymousClass001.A0K(r1)     // Catch:{ IllegalAccessException -> 0x0293 }
            long r0 = (long) r0     // Catch:{ IllegalAccessException -> 0x0293 }
        L_0x0260:
            r21 = r9
            r22 = r6
            r23 = r8
            r24 = r3
            r25 = r0
            r21.markerAnnotate((int) r22, (int) r23, (java.lang.String) r24, (long) r25)     // Catch:{ IllegalAccessException -> 0x0293 }
            goto L_0x0298
        L_0x026e:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ IllegalAccessException -> 0x0293 }
            if (r0 == 0) goto L_0x0277
            long r0 = X.C18310x6.A0B(r1)     // Catch:{ IllegalAccessException -> 0x0293 }
            goto L_0x0260
        L_0x0277:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ IllegalAccessException -> 0x0293 }
            if (r0 == 0) goto L_0x0283
            boolean r0 = X.AnonymousClass001.A1Z(r1)     // Catch:{ IllegalAccessException -> 0x0293 }
            r9.markerAnnotate((int) r6, (int) r8, (java.lang.String) r3, (boolean) r0)     // Catch:{ IllegalAccessException -> 0x0293 }
            goto L_0x0298
        L_0x0283:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x0293 }
            if (r0 == 0) goto L_0x028d
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalAccessException -> 0x0293 }
            r9.markerAnnotate((int) r6, (int) r8, (java.lang.String) r3, (java.lang.String) r1)     // Catch:{ IllegalAccessException -> 0x0293 }
            goto L_0x0298
        L_0x028d:
            java.lang.String r0 = "MessageSendPerfQplTracker/markerAnnotate/unsupported type!"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IllegalAccessException -> 0x0293 }
            goto L_0x0298
        L_0x0293:
            java.lang.String r0 = "MessageSendPerfQplTracker/markerMessageSendAnnotation/error while reading fields from messageSendPerfEvent."
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0298:
            int r10 = r10 + 1
            if (r10 >= r11) goto L_0x029d
            goto L_0x024b
        L_0x029d:
            java.lang.Integer r0 = r5.A0J
            int r0 = r0.intValue()
            r7.A04(r8, r0)
        L_0x02a6:
            r0 = 920(0x398, float:1.289E-42)
            X.2vE r3 = X.C58422vE.A02
            int r1 = r2.A0O(r3, r0)
            r0 = 1488(0x5d0, float:2.085E-42)
            int r7 = r2.A0O(r3, r0)
            if (r45 != 0) goto L_0x02d3
            if (r7 <= 0) goto L_0x02d3
            if (r7 <= r1) goto L_0x02d3
            r0 = 919(0x397, float:1.288E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x02d3
            long r0 = (long) r1
            int r6 = (r39 > r0 ? 1 : (r39 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x02d3
            long r0 = (long) r7
            int r6 = (r39 > r0 ? 1 : (r39 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x02d3
            java.lang.String r6 = "MessageLogging/AbsDurationTooHigh"
            r0 = r19
            r4.A0E(r5, r6, r0)
        L_0x02d3:
            r0 = 1072(0x430, float:1.502E-42)
            int r1 = r2.A0O(r3, r0)
            r0 = 1489(0x5d1, float:2.087E-42)
            int r6 = r2.A0O(r3, r0)
            if (r45 != 0) goto L_0x0300
            if (r47 != 0) goto L_0x0300
            if (r6 <= 0) goto L_0x0300
            if (r6 <= r1) goto L_0x0300
            r0 = 1126(0x466, float:1.578E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x0300
            long r1 = (long) r1
            int r0 = (r41 > r1 ? 1 : (r41 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0300
            long r1 = (long) r6
            int r0 = (r41 > r1 ? 1 : (r41 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0300
            java.lang.String r2 = "MessageLogging/RelativeDurationTooHigh"
            r0 = r17
            r4.A0E(r5, r2, r0)
        L_0x0300:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36E.A0O(X.34x, java.util.Collection, int, int, int, int, int, int, int, int, long, long, long, boolean, boolean, boolean, boolean, boolean):void");
    }
}
