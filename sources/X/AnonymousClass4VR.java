package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4VR  reason: invalid class name */
public class AnonymousClass4VR extends C05550Ty {
    public int A00 = 0;
    public int A01 = -1;
    public int A02;
    public long A03;
    public long A04;
    public C56972sr A05;
    public C56942so A06;
    public AnonymousClass2TH A07;
    public AnonymousClass33U A08;
    public C29441ip A09;
    public C64773Ex A0A;
    public AnonymousClass5ZU A0B;
    public C613330g A0C;
    public C56612sH A0D;
    public C54292oU A0E;
    public C620733j A0F;
    public C56982ss A0G;
    public C28891hw A0H;
    public C56892sj A0I;
    public C42892Px A0J;
    public AnonymousClass318 A0K;
    public AnonymousClass1VX A0L;
    public AnonymousClass4FV A0M;
    public C66493Lq A0N;
    public C66503Lr A0O;
    public C148167He A0P;
    public C27991fJ A0Q;
    public AnonymousClass3LQ A0R;
    public C56072rN A0S;
    public AnonymousClass4FS A0T;
    public boolean A0U;
    public final int A0V;
    public final int A0W;
    public final long A0X;
    public final AnonymousClass08M A0Y = AnonymousClass08M.A01();
    public final AnonymousClass08M A0Z = AnonymousClass08M.A01();
    public final AnonymousClass08M A0a = AnonymousClass08M.A01();
    public final AnonymousClass08M A0b = AnonymousClass08M.A01();
    public final AnonymousClass08M A0c = AnonymousClass08M.A01();
    public final AnonymousClass4FI A0d;
    public final C27991fJ A0e;
    public final UserJid A0f;
    public final AnonymousClass107 A0g = AnonymousClass4L0.A0O(0);
    public final AnonymousClass107 A0h = AnonymousClass4L0.A0O(0);
    public final String A0i;
    public final boolean A0j;

    public static final boolean A01(int i) {
        if (i == 2 || i == 1 || i == 0 || i == 5 || i == 9) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void A00(AnonymousClass4VR r14, int i, int i2) {
        AnonymousClass5L8 r2 = new AnonymousClass5L8(r14.A0Q, (UserJid) null, (C60912zN) null, (String) null, (String) null, (List) null, 0, i2, 0, 0);
        AnonymousClass08M r1 = r14.A0c;
        if (i != -1) {
            r1.A0G(new AnonymousClass5PY(r2, i));
            r14.A0D(5);
            return;
        }
        throw AnonymousClass001.A0e("Error code expected but default success code '-1' was provided.");
    }

    public void A0C() {
        this.A0H.A07(this.A0d);
    }

    public void A0D(int i) {
        C06270Wx.A04(this.A0g, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r3 != 8) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010c, code lost:
        if (r3 != 2) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x014d, code lost:
        if (r3 == 7) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(int r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            r8 = 0
            r7 = 1
            if (r0 != r7) goto L_0x0024
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x0036
            X.08M r1 = r11.A0a
            r0 = 9
            X.C06270Wx.A04(r1, r0)
            X.08M r4 = r11.A0b
            r3 = 2131895469(0x7f1224ad, float:1.9425772E38)
        L_0x0016:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r1 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1, r3)
            r4.A0G(r0)
        L_0x0023:
            return
        L_0x0024:
            r1 = 3
            if (r0 != r1) goto L_0x0036
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x0036
            X.08M r0 = r11.A0a
            X.C06270Wx.A04(r0, r1)
            X.08M r4 = r11.A0b
            r3 = 2131891244(0x7f12142c, float:1.9417203E38)
            goto L_0x0016
        L_0x0036:
            r11.A01 = r12
            r6 = 6
            r11.A0D(r6)
            X.08M r5 = r11.A0b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            int r3 = r11.A02
            int r9 = r11.A00
            if (r4 == 0) goto L_0x0092
            int r1 = r4.intValue()
            r0 = 499(0x1f3, float:6.99E-43)
            if (r1 != r0) goto L_0x007e
            r10 = 2131888104(0x7f1207e8, float:1.9410834E38)
        L_0x0053:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r1 = 2131100365(0x7f0602cd, float:1.781311E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1, r10)
            r5.A0G(r0)
            r0 = 426(0x1aa, float:5.97E-43)
            if (r12 != r0) goto L_0x0072
            X.08M r1 = r11.A0a
            r6 = 5
        L_0x0067:
            X.C06270Wx.A04(r1, r6)
            int r0 = r11.A00
            if (r0 != r7) goto L_0x0023
            r11.A0J(r8)
            return
        L_0x0072:
            java.util.Set r0 = X.C105685Vz.A02
            boolean r0 = r0.contains(r4)
            X.08M r1 = r11.A0a
            if (r0 != 0) goto L_0x0067
            r6 = 7
            goto L_0x0067
        L_0x007e:
            if (r3 == 0) goto L_0x00ce
            if (r3 == r7) goto L_0x00ce
            r0 = 2
            if (r3 == r0) goto L_0x00ce
            r0 = 3
            if (r3 == r0) goto L_0x0096
            r0 = 4
            if (r3 == r0) goto L_0x0096
            r0 = 7
            if (r3 == r0) goto L_0x00ce
            r0 = 8
            if (r3 == r0) goto L_0x0096
        L_0x0092:
            r10 = 2131893926(0x7f121ea6, float:1.9422642E38)
            goto L_0x0053
        L_0x0096:
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00ca
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x00c6
            r0 = 412(0x19c, float:5.77E-43)
            if (r1 == r0) goto L_0x0122
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x00bd
            r0 = 426(0x1aa, float:5.97E-43)
            if (r1 == r0) goto L_0x010e
            switch(r1) {
                case 403: goto L_0x00b9;
                case 404: goto L_0x00b5;
                case 405: goto L_0x00b1;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r10 = 2131890342(0x7f1210a6, float:1.9415373E38)
            goto L_0x0053
        L_0x00b1:
            r10 = 2131890344(0x7f1210a8, float:1.9415377E38)
            goto L_0x0053
        L_0x00b5:
            r10 = 2131890341(0x7f1210a5, float:1.9415371E38)
            goto L_0x0053
        L_0x00b9:
            r10 = 2131890343(0x7f1210a7, float:1.9415375E38)
            goto L_0x0053
        L_0x00bd:
            r10 = 2131889298(0x7f120c92, float:1.9413256E38)
            if (r9 != 0) goto L_0x0053
            r10 = 2131889297(0x7f120c91, float:1.9413254E38)
            goto L_0x0053
        L_0x00c6:
            r10 = 2131890340(0x7f1210a4, float:1.941537E38)
            goto L_0x0053
        L_0x00ca:
            r10 = 2131889296(0x7f120c90, float:1.9413252E38)
            goto L_0x0053
        L_0x00ce:
            if (r1 == 0) goto L_0x0152
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0131
            r0 = 410(0x19a, float:5.75E-43)
            if (r1 == r0) goto L_0x0127
            r0 = 412(0x19c, float:5.77E-43)
            if (r1 == r0) goto L_0x0122
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x0113
            r0 = 426(0x1aa, float:5.97E-43)
            if (r1 == r0) goto L_0x0104
            r0 = 436(0x1b4, float:6.11E-43)
            if (r1 == r0) goto L_0x00ff
            switch(r1) {
                case 404: goto L_0x013b;
                case 405: goto L_0x00fa;
                case 406: goto L_0x00f0;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            r10 = 2131892947(0x7f121ad3, float:1.9420657E38)
            goto L_0x0053
        L_0x00f0:
            r10 = 2131889303(0x7f120c97, float:1.9413266E38)
            r2 = 2131889302(0x7f120c96, float:1.9413264E38)
            r1 = 2131889645(0x7f120ded, float:1.941396E38)
            goto L_0x0144
        L_0x00fa:
            r10 = 2131890327(0x7f121097, float:1.9415343E38)
            goto L_0x0053
        L_0x00ff:
            r10 = 2131890296(0x7f121078, float:1.941528E38)
            goto L_0x0053
        L_0x0104:
            if (r3 == 0) goto L_0x010e
            if (r3 == r7) goto L_0x010e
            r0 = 2
            r10 = 2131889648(0x7f120df0, float:1.9413966E38)
            if (r3 == r0) goto L_0x0053
        L_0x010e:
            r10 = 2131889316(0x7f120ca4, float:1.9413292E38)
            goto L_0x0053
        L_0x0113:
            r10 = 2131889308(0x7f120c9c, float:1.9413276E38)
            r2 = 2131889298(0x7f120c92, float:1.9413256E38)
            if (r9 != 0) goto L_0x011e
            r2 = 2131889297(0x7f120c91, float:1.9413254E38)
        L_0x011e:
            r1 = 2131889643(0x7f120deb, float:1.9413955E38)
            goto L_0x0144
        L_0x0122:
            r10 = 2131890326(0x7f121096, float:1.941534E38)
            goto L_0x0053
        L_0x0127:
            r10 = 2131889307(0x7f120c9b, float:1.9413274E38)
            r2 = 2131889306(0x7f120c9a, float:1.9413272E38)
            r1 = 2131889647(0x7f120def, float:1.9413963E38)
            goto L_0x0144
        L_0x0131:
            r10 = 2131889301(0x7f120c95, float:1.9413262E38)
            r2 = 2131889300(0x7f120c94, float:1.941326E38)
            r1 = 2131889644(0x7f120dec, float:1.9413957E38)
            goto L_0x0144
        L_0x013b:
            r10 = 2131889305(0x7f120c99, float:1.941327E38)
            r2 = 2131889304(0x7f120c98, float:1.9413268E38)
            r1 = 2131889646(0x7f120dee, float:1.9413961E38)
        L_0x0144:
            if (r3 == 0) goto L_0x014f
            if (r3 == r7) goto L_0x014f
            r0 = 2
            if (r3 == r0) goto L_0x0053
            r0 = 7
            r10 = r1
            if (r3 != r0) goto L_0x0053
        L_0x014f:
            r10 = r2
            goto L_0x0053
        L_0x0152:
            r10 = 2131890926(0x7f1212ee, float:1.9416558E38)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VR.A0E(int):void");
    }

    public final void A0F(int i) {
        if (i != 0) {
            C06270Wx.A04(this.A0a, 9);
            this.A0b.A0G(new AnonymousClass7KY(AnonymousClass4L0.A0U(), R.color.f5nameremoved, R.string.f11nameremoved));
            A0J(true);
            return;
        }
        SystemClock.sleep(Math.max(0, 300 - (this.A0D.A0H() - this.A04)));
        A0D(4);
        int i2 = this.A02;
        if ((i2 == 4 || i2 == 3 || i2 == 8) && this.A0e != null) {
            this.A0T.BkM(new C71313bu((Object) this, 9));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018d, code lost:
        if (r5 != 9) goto L_0x018f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass5L8 r14) {
        /*
            r13 = this;
            int r0 = r13.A02
            boolean r2 = A01(r0)
            r4 = 3
            r5 = 6
            r1 = 0
            r6 = 9
            r0 = 2
            if (r2 == 0) goto L_0x001f
            int r3 = r14.A02
            r7 = 1
            if (r3 != r5) goto L_0x00a5
            X.1VX r3 = r13.A0L
            r2 = 5021(0x139d, float:7.036E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x00c0
            r13.A02 = r6
        L_0x001f:
            int r2 = r14.A02
            boolean r2 = X.C57192tF.A00(r2)
            if (r2 == 0) goto L_0x003d
            X.2sj r2 = r13.A0I
            X.1fJ r3 = r14.A05
            boolean r8 = r2.A0C(r3)
            X.33U r7 = r13.A08
            X.2sj r2 = r13.A0I
            int r2 = X.C56892sj.A00(r2, r3)
            long r2 = (long) r2
            if (r8 == 0) goto L_0x00a1
            r7.A06(r6, r2, r1)
        L_0x003d:
            int r3 = r13.A02
            r2 = 4
            if (r3 != r2) goto L_0x0052
            X.1VX r7 = r13.A0L
            r3 = 2436(0x984, float:3.414E-42)
            boolean r3 = r7.A0X(r3)
            if (r3 == 0) goto L_0x0052
            boolean r3 = r14.A00
            if (r3 == 0) goto L_0x0052
            r13.A02 = r5
        L_0x0052:
            int r5 = r13.A02
            r3 = 1
            if (r5 == 0) goto L_0x0061
            if (r5 == r3) goto L_0x0061
            if (r5 == r2) goto L_0x0061
            r3 = 8
            if (r5 == r3) goto L_0x0061
            if (r5 != r6) goto L_0x0065
        L_0x0061:
            int r3 = r14.A01
            r13.A00 = r3
        L_0x0065:
            if (r5 != r0) goto L_0x0090
            X.2so r3 = r13.A06
            X.1fJ r5 = r14.A05
            java.util.Set r3 = r3.A05(r5)
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0090
            X.3LQ r1 = r13.A0R
            java.lang.String r2 = "community_home"
            X.2ml r1 = r1.A00
            boolean r2 = r1.A02(r5, r2)
            X.107 r1 = r13.A0h
            if (r2 == 0) goto L_0x008b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0087:
            r1.A0G(r0)
            return
        L_0x008b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0087
        L_0x0090:
            X.2sj r5 = r13.A0I
            X.1fJ r3 = r14.A05
            boolean r3 = r5.A0C(r3)
            if (r3 == 0) goto L_0x00c4
            X.107 r1 = r13.A0h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0087
        L_0x00a1:
            r7.A05(r6, r2, r1)
            goto L_0x003d
        L_0x00a5:
            if (r3 == r0) goto L_0x00c0
            if (r3 != r4) goto L_0x00ae
            r2 = 5
            r13.A02 = r2
            goto L_0x001f
        L_0x00ae:
            X.2rN r2 = r13.A0S
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x00bc
            if (r3 != r7) goto L_0x00bc
            r13.A02 = r0
            goto L_0x001f
        L_0x00bc:
            r13.A02 = r1
            goto L_0x001f
        L_0x00c0:
            r13.A02 = r7
            goto L_0x001f
        L_0x00c4:
            X.08M r6 = r13.A0c
            r5 = -1
            X.5PY r3 = new X.5PY
            r3.<init>(r14, r5)
            r6.A0G(r3)
            X.2zN r3 = r14.A07
            java.lang.String r6 = r3.A03
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0243
            int r5 = r13.A02
            if (r5 == r4) goto L_0x00e0
            r3 = 5
            if (r5 != r3) goto L_0x00ef
        L_0x00e0:
            r6 = 0
            r3 = 0
        L_0x00e2:
            X.08M r5 = r13.A0Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Pair r3 = X.AnonymousClass0x9.A0C(r3, r6)
            r5.A0G(r3)
        L_0x00ef:
            r13.A0D(r0)
            X.1fJ r3 = r13.A0Q
            X.C626936e.A06(r3)
            X.3Ex r5 = r13.A0A
            X.1fJ r3 = r13.A0Q
            X.3ZH r9 = r5.A0A(r3)
            int r5 = r13.A0V
            boolean r3 = A01(r5)
            if (r3 == 0) goto L_0x01d7
            java.lang.String r8 = r13.A0i
            X.C626936e.A06(r8)
            X.30g r7 = r13.A0C
            X.08M r6 = r13.A0Z
            java.util.Objects.requireNonNull(r6)
            r3 = 1
            X.91U r5 = new X.91U
            r5.<init>(r6, r3)
            int r3 = r9.A06
            if (r3 <= 0) goto L_0x01d4
            java.lang.String r3 = java.lang.Integer.toString(r3)
        L_0x0121:
            r7.A07(r5, r9, r3, r8)
        L_0x0124:
            X.08M r7 = r13.A0a
            int r5 = r13.A02
            r3 = 1
            r6 = 2
            r9 = 0
            if (r5 == r0) goto L_0x014c
            r9 = 1
            if (r5 == r2) goto L_0x0134
            r2 = 8
            if (r5 != r2) goto L_0x014c
        L_0x0134:
            int r8 = r14.A03
            X.2sj r5 = r13.A0I
            X.1fJ r2 = r13.A0Q
            int r2 = r5.A02(r2)
            if (r8 < r2) goto L_0x014c
            X.1VX r5 = r13.A0L
            r2 = 5021(0x139d, float:7.036E-42)
            boolean r2 = r5.A0X(r2)
            if (r2 == 0) goto L_0x014c
            r9 = 10
        L_0x014c:
            X.1VX r5 = r13.A0L
            r2 = 2436(0x984, float:3.414E-42)
            boolean r2 = r5.A0X(r2)
            if (r2 == 0) goto L_0x01c7
            boolean r2 = r14.A00
            if (r2 == 0) goto L_0x01c7
            r6 = 4
        L_0x015b:
            X.C06270Wx.A04(r7, r6)
            X.08M r2 = r13.A0b
            int r6 = r13.A00
            if (r6 != r0) goto L_0x0175
            r4 = 2131895469(0x7f1224ad, float:1.9425772E38)
        L_0x0167:
            java.lang.Object[] r3 = new java.lang.Object[r1]
        L_0x0169:
            r1 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r3, r1, r4)
        L_0x0171:
            r2.A0G(r0)
            return
        L_0x0175:
            if (r6 != r4) goto L_0x017b
            r4 = 2131891244(0x7f12142c, float:1.9417203E38)
            goto L_0x0167
        L_0x017b:
            int r5 = r13.A02
            if (r5 == 0) goto L_0x01ae
            r4 = 5021(0x139d, float:7.036E-42)
            if (r5 == r3) goto L_0x0195
            if (r5 == r0) goto L_0x01b8
            r0 = 5
            if (r5 == r0) goto L_0x0195
            r0 = 7
            if (r5 == r0) goto L_0x01ae
            r0 = 9
            if (r5 == r0) goto L_0x0195
        L_0x018f:
            if (r6 != r3) goto L_0x01b6
            r4 = 2131886394(0x7f12013a, float:1.9407366E38)
            goto L_0x0167
        L_0x0195:
            boolean r0 = r13.A0U
            if (r0 != 0) goto L_0x018f
            X.1VX r0 = r13.A0L
            boolean r0 = r0.A0X(r4)
            r4 = 2131894141(0x7f121f7d, float:1.9423078E38)
            if (r0 == 0) goto L_0x01a7
            r4 = 2131894142(0x7f121f7e, float:1.942308E38)
        L_0x01a7:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r14.A08
            r3[r1] = r0
            goto L_0x0169
        L_0x01ae:
            boolean r0 = r13.A0j
            if (r0 == 0) goto L_0x018f
            r4 = 2131894170(0x7f121f9a, float:1.9423137E38)
            goto L_0x0167
        L_0x01b6:
            r0 = 0
            goto L_0x0171
        L_0x01b8:
            X.1VX r0 = r13.A0L
            boolean r0 = r0.A0X(r4)
            r4 = 2131890324(0x7f121094, float:1.9415337E38)
            if (r0 == 0) goto L_0x0167
            r4 = 2131890325(0x7f121095, float:1.9415339E38)
            goto L_0x0167
        L_0x01c7:
            int r2 = r13.A00
            if (r2 == r3) goto L_0x015b
            r6 = 9
            if (r2 == r0) goto L_0x015b
            r6 = 3
            if (r2 == r4) goto L_0x015b
            r6 = r9
            goto L_0x015b
        L_0x01d4:
            r3 = 0
            goto L_0x0121
        L_0x01d7:
            if (r5 == r2) goto L_0x0218
            if (r5 == r4) goto L_0x0218
            r3 = 8
            if (r5 == r3) goto L_0x0218
            r3 = 7
            if (r5 != r3) goto L_0x0211
            X.1fJ r3 = r13.A0Q
            X.C626936e.A06(r3)
            com.whatsapp.jid.UserJid r9 = r13.A0f
            X.C626936e.A06(r9)
            java.lang.String r10 = r13.A0i
            X.C626936e.A06(r10)
            X.1fJ r8 = r13.A0Q
            long r11 = r13.A0X
            X.2QT r7 = new X.2QT
            r7.<init>(r8, r9, r10, r11)
            X.08M r5 = r13.A0Z
            java.util.Objects.requireNonNull(r5)
            r3 = 1
            X.91U r6 = new X.91U
            r6.<init>(r5, r3)
            X.3Lr r5 = r13.A0O
            X.5nI r3 = new X.5nI
            r3.<init>(r6, r13)
            r5.A0C(r3, r7)
            goto L_0x0124
        L_0x0211:
            java.lang.String r3 = "has to to be one of the use case"
            X.C626936e.A0D(r1, r3)
            goto L_0x0124
        L_0x0218:
            X.1fJ r11 = r13.A0e
            X.C626936e.A06(r11)
            X.30g r7 = r13.A0C
            X.08M r5 = r13.A0Z
            java.util.Objects.requireNonNull(r5)
            r3 = 1
            X.91U r8 = new X.91U
            r8.<init>(r5, r3)
            com.whatsapp.jid.GroupJid r10 = X.C86664Kz.A1C(r9)
            r12 = 0
            if (r10 != 0) goto L_0x0236
            r8.AwB(r12)
            goto L_0x0124
        L_0x0236:
            int r3 = r9.A06
            if (r3 <= 0) goto L_0x023e
            java.lang.String r12 = java.lang.Integer.toString(r3)
        L_0x023e:
            r7.A05(r8, r9, r10, r11, r12)
            goto L_0x0124
        L_0x0243:
            r3 = 2
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VR.A0G(X.5L8):void");
    }

    public void A0H(boolean z) {
        if (!z && C86604Kt.A05(this.A0g) != 0) {
            return;
        }
        if (!this.A09.A0F()) {
            this.A0c.A0G(new AnonymousClass5PY((AnonymousClass5L8) null, 499));
            A0D(5);
            return;
        }
        A0D(1);
        int i = this.A02;
        if (i == 4 || i == 3 || i == 8 || i == 6) {
            C27991fJ r7 = this.A0e;
            C626936e.A06(r7);
            C626936e.A06(this.A0Q);
            C27991fJ r6 = this.A0Q;
            AnonymousClass2TH r5 = this.A07;
            AnonymousClass91U r4 = new AnonymousClass91U(this, 2);
            AnonymousClass2FI r3 = new AnonymousClass2FI(this);
            C55682qk r2 = r5.A00;
            AnonymousClass31C r8 = r5.A06;
            C56942so r0 = r5.A01;
            AnonymousClass3P5 r1 = new AnonymousClass3P5(r4, r3, r5, r6);
            String A032 = r8.A03();
            r8.A0D(new C68193Sf(r2, r1), AnonymousClass28Z.A00(r6, r0.A00(r7), r7, A032), A032, 298, 32000);
        } else if (i == 7) {
            String str = this.A0i;
            C626936e.A06(str);
            C626936e.A06(this.A0Q);
            UserJid userJid = this.A0f;
            C626936e.A06(userJid);
            this.A0O.A02(new AnonymousClass6BA(this, 0), new AnonymousClass2QT(this.A0Q, userJid, str, this.A0X));
        } else if (A01(i)) {
            String str2 = this.A0i;
            C626936e.A06(str2);
            this.A0O.A03(new AnonymousClass6BA(this, 1), str2);
        } else {
            Log.e("JoinLinkedSubGroupViewModelloadGroupInfo/no data to load group info from");
            C626936e.A0D(false, "JoinLinkedSubGroupViewModelloadGroupInfo/no data to load group info from");
        }
    }

    public final void A0I(boolean z) {
        C24881Zc r4 = new C24881Zc();
        r4.A03 = C18310x6.A0f(this.A0D.A0H(), this.A03);
        r4.A01 = AnonymousClass0x7.A0g();
        r4.A00 = Boolean.valueOf(z);
        C27991fJ r0 = this.A0Q;
        if (r0 != null && AnonymousClass34R.A06(r0.user)) {
            r4.A04 = this.A0Q.getRawString();
        }
        this.A0M.BhD(r4);
    }

    public final void A0J(boolean z) {
        C24881Zc r4 = new C24881Zc();
        r4.A03 = C18310x6.A0f(this.A0D.A0H(), this.A04);
        r4.A01 = AnonymousClass001.A0f();
        r4.A00 = Boolean.valueOf(z);
        C27991fJ r0 = this.A0Q;
        if (r0 != null && AnonymousClass34R.A06(r0.user)) {
            r4.A04 = this.A0Q.getRawString();
        }
        this.A0M.BhD(r4);
    }

    public AnonymousClass4VR(C56942so r5, AnonymousClass2TH r6, C29441ip r7, C64773Ex r8, AnonymousClass5ZU r9, C613330g r10, C56612sH r11, C54292oU r12, C620733j r13, C56982ss r14, C28891hw r15, C56892sj r16, AnonymousClass1VX r17, C66493Lq r18, C27991fJ r19, C27991fJ r20, UserJid userJid, C56072rN r22, String str, int i, int i2, long j, boolean z) {
        C1237669r r2 = new C1237669r(this, 4);
        this.A0d = r2;
        this.A0D = r11;
        this.A0L = r17;
        this.A0E = r12;
        this.A0G = r14;
        this.A0A = r8;
        this.A0B = r9;
        this.A0F = r13;
        this.A0S = r22;
        this.A0N = r18;
        this.A06 = r5;
        this.A0H = r15;
        this.A07 = r6;
        this.A0I = r16;
        this.A09 = r7;
        this.A0C = r10;
        r15.A06(r2);
        int i3 = i;
        this.A0V = i3;
        this.A02 = i3;
        this.A0W = i2;
        this.A0e = r19;
        this.A0Q = r20;
        this.A0i = str;
        this.A0f = userJid;
        this.A0X = j;
        this.A0j = z;
    }
}
