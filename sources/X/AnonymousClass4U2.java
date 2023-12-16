package X;

import android.app.Application;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4U2  reason: invalid class name */
public final class AnonymousClass4U2 extends AnonymousClass08N implements C184158rL {
    public int A00;
    public C106725a3 A01;
    public C166477yk A02;
    public C166477yk A03;
    public C108995du A04;
    public C88534Zc A05;
    public AnonymousClass7KT A06;
    public C88524Zb A07;
    public C88514Za A08;
    public C91824lC A09;
    public AnonymousClass5ZI A0A;
    public Integer A0B;
    public String A0C;
    public String A0D = "unknown";
    public Map A0E = C18320x8.A0r();
    public Set A0F = AnonymousClass0x9.A17();
    public Set A0G = AnonymousClass0x9.A17();
    public Set A0H = AnonymousClass0x9.A17();
    public Set A0I = AnonymousClass0x9.A17();
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public final AnonymousClass08M A0N = AnonymousClass08M.A01();
    public final AnonymousClass08M A0O = AnonymousClass08M.A01();
    public final AnonymousClass08M A0P = AnonymousClass08M.A01();
    public final AnonymousClass08M A0Q = AnonymousClass08M.A01();
    public final C15930sC A0R;
    public final C15930sC A0S;
    public final AnonymousClass0XV A0T;
    public final AnonymousClass5MC A0U;
    public final C111525iE A0V;
    public final AnonymousClass5QV A0W;
    public final C186048uf A0X;
    public final C90714i5 A0Y;
    public final C105085Tn A0Z;
    public final AnonymousClass5TO A0a;
    public final C112285jU A0b;
    public final C147147Cz A0c;
    public final AnonymousClass5ZR A0d;
    public final C105355Up A0e;
    public final AnonymousClass4UC A0f = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0g = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0h = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0i = AnonymousClass0x9.A0b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4U2(Application application, AnonymousClass0XV r10, AnonymousClass5MC r11, AnonymousClass5MD r12, C111525iE r13, C186048uf r14, C90714i5 r15, C105085Tn r16, AnonymousClass5TO r17, C112285jU r18, AnonymousClass5ZR r19, C105355Up r20, AnonymousClass8E9 r21) {
        super(application);
        AnonymousClass4UC r5;
        int A0S2;
        C162457s7.A0J(application, 1);
        AnonymousClass5ZR r3 = r19;
        C105355Up r1 = r20;
        C18260x0.A0a(r10, r3, r1, 2);
        C105085Tn r4 = r16;
        AnonymousClass5TO r0 = r17;
        C18260x0.A0X(r4, r11, r0);
        AnonymousClass8E9 r52 = r21;
        C18260x0.A0Y(r13, r52, r12);
        this.A0T = r10;
        this.A0d = r3;
        this.A0e = r1;
        this.A0X = r14;
        C112285jU r32 = r18;
        this.A0b = r32;
        this.A0Y = r15;
        this.A0Z = r4;
        this.A0U = r11;
        this.A0a = r0;
        this.A0V = r13;
        AnonymousClass6C6 A002 = AnonymousClass6C6.A00(this, 50);
        this.A0S = A002;
        C1897492m A0G2 = AnonymousClass4L0.A0G(this, 104);
        this.A0R = A0G2;
        this.A0c = new C147147Cz(this);
        this.A0W = r12.A00(r52, r13);
        ((C112275jT) A0E()).A0E = r32;
        ((C112275jT) A0E()).A0B = r32;
        Boolean bool = (Boolean) r10.A04("saved-state-should-handle-gps-location-change");
        if (bool != null) {
            this.A0L = bool.booleanValue();
        }
        this.A0A = r11.A00(871832470);
        if (!r10.A03.containsKey("saved-state-show-request-dialog")) {
            C105085Tn r6 = this.A0Z;
            if (AnonymousClass000.A1W(r6.A02())) {
                AnonymousClass5ZO A022 = r6.A02();
                if (A022 != null) {
                    this.A0B = AnonymousClass5ZO.A03(A022);
                    this.A0K = true;
                    this.A0L = false;
                    this.A0C = A022.A09;
                    r5 = this.A0h;
                    A0S2 = A00(A022);
                }
            } else if ((!r6.A04()) || !this.A0d.A05()) {
                this.A0V.A01(0);
                r5 = this.A0i;
                A0S2 = C18280x3.A0S();
            } else {
                r5 = this.A0i;
                A0S2 = 1;
            }
            r5.A0H(A0S2);
        }
        r32.A02.A0E(A002);
        r32.A00.A0E(A0G2);
        AnonymousClass1VX r110 = r1.A03;
        if (C86634Kw.A1a(r110) && r110.A0X(2791)) {
            A0F();
        }
    }

    public final void A0J() {
        C166477yk r2 = this.A02;
        if (r2 != null) {
            C06270Wx.A03(this.A0P, 2);
            LatLng A042 = C108975ds.A04(r2.A03);
            this.A0C = "map_view";
            this.A0W.A01(A042, this, (AnonymousClass5ZI) null, "", "map_view", 0.0f);
        }
    }

    public final void A0K(C106725a3 r11, C166477yk r12) {
        this.A01 = r11;
        this.A04 = r11.A06().A04;
        this.A02 = r12;
        if (this.A0K) {
            this.A03 = r12;
            C06270Wx.A03(this.A0P, 2);
            AnonymousClass5QV r3 = this.A0W;
            LatLng A042 = C108975ds.A04(r12.A03);
            String str = this.A0C;
            if (str == null) {
                str = "manual";
            }
            r3.A01(A042, this, (AnonymousClass5ZI) null, "", str, 0.0f);
            this.A0K = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        if (r0 >= 0) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C106725a3 r8, X.C166477yk r9) {
        /*
            r7 = this;
            r3 = 0
            X.C162457s7.A0J(r9, r3)
            r1 = 1
            X.7yk r2 = r7.A02
            if (r2 == 0) goto L_0x0017
            int r0 = r7.A00
            if (r0 != r1) goto L_0x0017
            float r1 = r9.A02
            float r0 = r2.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            r7.A0J = r3
        L_0x0017:
            r7.A01 = r8
            X.7ZW r0 = r8.A06()
            X.5du r0 = r0.A04
            r7.A04 = r0
            r7.A02 = r9
            X.7yk r2 = r7.A03
            if (r2 != 0) goto L_0x002a
            r7.A03 = r9
        L_0x0029:
            return
        L_0x002a:
            float r0 = r2.A02
            float r1 = r9.A02
            float r6 = X.AnonymousClass002.A00(r0, r1)
            boolean r0 = r7.A0K
            r3 = 3
            if (r0 != 0) goto L_0x010d
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e8
            X.5ds r2 = r2.A03
            X.5ds r0 = r9.A03
            float r5 = X.AnonymousClass5ZZ.A00(r2, r0)
            r0 = 1101529088(0x41a80000, float:21.0)
            r4 = 1097859072(0x41700000, float:15.0)
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e6
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1106247680(0x41f00000, float:30.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1100480512(0x41980000, float:19.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1117126656(0x42960000, float:75.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1099956224(0x41900000, float:18.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1125515264(0x43160000, float:150.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1099431936(0x41880000, float:17.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1132068864(0x437a0000, float:250.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1142292480(0x44160000, float:600.0)
            if (r0 >= 0) goto L_0x00e4
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r2 = 1150681088(0x44960000, float:1200.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1096810496(0x41600000, float:14.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1158660096(0x450fc000, float:2300.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1095761920(0x41500000, float:13.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1166843904(0x458ca000, float:4500.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1094713344(0x41400000, float:12.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1175232512(0x460ca000, float:9000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1093664768(0x41300000, float:11.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1184133120(0x46947000, float:19000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1192521728(0x47147000, float:38000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1091567616(0x41100000, float:9.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1200910336(0x47947000, float:76000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1209170944(0x48127c00, float:150000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1217559552(0x48927c00, float:300000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1225948160(0x49127c00, float:600000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1233536768(0x49864700, float:1100000.0)
            if (r0 >= 0) goto L_0x00e4
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1249125376(0x4a742400, float:4000000.0)
            if (r0 < 0) goto L_0x00e4
            r2 = 1241925376(0x4a064700, float:2200000.0)
        L_0x00e4:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
        L_0x00e6:
            if (r0 < 0) goto L_0x010d
        L_0x00e8:
            X.5iE r2 = r7.A0V
            r0 = 78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.4sp r0 = new X.4sp
            r0.<init>()
            r0.A0E = r1
            r2.A04(r0)
            X.08M r0 = r7.A0P
            X.C06270Wx.A03(r0, r3)
            r7.A03 = r9
            X.5Up r0 = r7.A0e
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0029
            r7.A0J()
            return
        L_0x010d:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            X.08M r0 = r7.A0P
            X.C06270Wx.A03(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U2.A0L(X.5a3, X.7yk):void");
    }

    public void BUV(AnonymousClass5ZO r20) {
        String str;
        C90674i1 r4;
        AnonymousClass5ZO r5 = r20;
        C162457s7.A0J(r5, 0);
        AnonymousClass1VX r1 = this.A0e.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(4080)) {
            C166477yk r6 = this.A02;
            if (r6 != null) {
                C06270Wx.A03(this.A0P, 2);
                double A0D2 = A0D();
                Double d = r5.A06;
                C162457s7.A0H(d);
                double max = Math.max(A0D2, d.doubleValue());
                AnonymousClass5ZI r15 = this.A0A;
                r15.A08();
                C186048uf r0 = this.A0X;
                int i = (int) r6.A02;
                C91824lC r12 = this.A09;
                if (r12 != null) {
                    str = r12.A00;
                } else {
                    str = null;
                }
                AnonymousClass5ZO A052 = r5.A05(max);
                C112275jT r02 = (C112275jT) r0;
                if (!(r02.A00 instanceof C90644hy)) {
                    r02.A00();
                }
                C114385mx r122 = new C114385mx(r02);
                r02.A06 = r122;
                C1223464a r52 = r02.A0P;
                C59722xN r13 = r02.A0T.A00;
                C123956Ak r53 = (C123956Ak) r52;
                int i2 = r53.A01;
                Object obj = r53.A00;
                if (i2 != 0) {
                    C64333Db r42 = ((C118065sw) obj).A02;
                    C55682qk A012 = C64333Db.A01(r42);
                    AnonymousClass4FS A8y = C64333Db.A8y(r42);
                    AnonymousClass1VX A4B = C64333Db.A4B(r42);
                    C620733j A2t = C64333Db.A2t(r42);
                    C107695bk r3 = r42.A00;
                    r4 = new C90674i1(A012, r3.AIq(), C107695bk.A0d(r3), A052, C86624Kv.A0R(r42), A2t, A4B, r122, r13, C107695bk.A2m(r3), r15, A8y, str, i);
                } else {
                    C64333Db r43 = ((C118075sx) obj).A03;
                    C55682qk A013 = C64333Db.A01(r43);
                    AnonymousClass4FS A8y2 = C64333Db.A8y(r43);
                    AnonymousClass1VX A4B2 = C64333Db.A4B(r43);
                    C620733j A2t2 = C64333Db.A2t(r43);
                    C107695bk r32 = r43.A00;
                    r4 = new C90674i1(A013, r32.AIq(), C107695bk.A0d(r32), A052, C86624Kv.A0R(r43), A2t2, A4B2, r122, r13, C107695bk.A2m(r32), r15, A8y2, str, i);
                }
                r4.A08();
                r02.A00 = r4;
                return;
            }
            return;
        }
        C616131n.A02((C85494Gl) null, new BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1(r5, this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r3 = X.C153847c7.A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r3 = X.C153847c7.A01(r3, 15.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        return new X.C152307Yj(r3, 1000, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C152307Yj A00(X.AnonymousClass5ZO r4) {
        /*
            java.lang.Double r0 = r4.A04
            X.C162457s7.A0H(r0)
            double r2 = r0.doubleValue()
            java.lang.Double r0 = r4.A05
            X.C162457s7.A0H(r0)
            double r0 = r0.doubleValue()
            X.5ds r3 = X.C108975ds.A00(r2, r0)
            java.lang.String r2 = r4.A09
            int r0 = r2.hashCode()
            r1 = 1098383360(0x41780000, float:15.5)
            switch(r0) {
                case -1178371219: goto L_0x002e;
                case -1081415738: goto L_0x0039;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.7UM r3 = X.C153847c7.A01(r3, r1)
        L_0x0025:
            r2 = 1000(0x3e8, float:1.401E-42)
            r1 = 0
            X.7Yj r0 = new X.7Yj
            r0.<init>(r3, r2, r1)
            return r0
        L_0x002e:
            java.lang.String r0 = "city_default"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0021
            r0 = 1093664768(0x41300000, float:11.0)
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "manual"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0021
            r0 = 1092616192(0x41200000, float:10.0)
        L_0x0043:
            X.7UM r3 = X.C153847c7.A01(r3, r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U2.A00(X.5ZO):X.7Yj");
    }

    public void A0C() {
        C112285jU r2 = this.A0b;
        C186048uf r0 = r2.A03.A00;
        r0.AyZ();
        C112275jT r02 = (C112275jT) r0;
        r02.A09 = null;
        r02.A0A = null;
        ((C112275jT) A0E()).A0B = null;
        ((C112275jT) A0E()).A0E = null;
        r2.A00.A0F(this.A0R);
        r2.A02.A0F(this.A0S);
    }

    public final double A0D() {
        C106725a3 r8;
        C166477yk r0 = this.A02;
        if (r0 == null || (r8 = this.A01) == null) {
            return 0.0d;
        }
        Location location = new Location("");
        C108975ds r2 = r0.A03;
        location.setLatitude(r2.A00);
        location.setLongitude(r2.A01);
        Location location2 = new Location("");
        double d = (double) 2;
        location2.setLatitude((r8.A06().A02.A00 + r8.A06().A03.A00) / d);
        location2.setLongitude((r8.A06().A02.A01 + r8.A06().A03.A01) / d);
        return (double) location.distanceTo(location2);
    }

    public final C186048uf A0E() {
        AnonymousClass1VX r1 = this.A0e.A03;
        if (!C86634Kw.A1a(r1) || !r1.A0X(4080)) {
            return this.A0X;
        }
        return this.A0Y;
    }

    public final void A0F() {
        AnonymousClass08M r1 = this.A0b.A00;
        if (r1.A07() == null) {
            C186048uf A0E2 = A0E();
            AnonymousClass5TO r12 = this.A0a;
            AnonymousClass5ZO r0 = r12.A00;
            if (r0 == null) {
                r0 = r12.A01();
            }
            A0E2.B33(r0);
            return;
        }
        Object A072 = r1.A07();
        C162457s7.A0H(A072);
        A0Q((List) A072);
    }

    public final void A0G() {
        C111525iE r2 = this.A0V;
        C95224sp r1 = new C95224sp();
        r1.A0A = 2;
        r2.A04(r1);
        C88524Zb r0 = this.A07;
        if (r0 != null) {
            A0M(r0);
            return;
        }
        C88514Za r02 = this.A08;
        if (r02 != null) {
            A0O(r02);
        } else {
            C06270Wx.A03(this.A0i, 9);
        }
    }

    public final void A0H() {
        if (!(!this.A0G.isEmpty())) {
            this.A0V.A01(6);
            this.A0L = false;
            C105085Tn r1 = this.A0Z;
            if (r1.A02() != null) {
                AnonymousClass5ZO A022 = r1.A02();
                if (A022 != null) {
                    this.A0B = AnonymousClass5ZO.A03(A022);
                    this.A0K = true;
                    this.A0C = A022.A09;
                    this.A0h.A0H(A00(A022));
                    return;
                }
                return;
            }
            AnonymousClass7UM A012 = C153847c7.A01(C108975ds.A00(-14.235004d, -51.92528d), 4.0f);
            this.A0B = C18280x3.A0S();
            this.A0K = true;
            this.A0C = "country_default";
            AnonymousClass4UC r2 = this.A0h;
            C162457s7.A0H(A012);
            C86644Kx.A1E(r2, A012, 100, false);
        }
    }

    public final void A0I() {
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            C88534Zc r3 = (C88534Zc) it.next();
            List A0h2 = C86644Kx.A0h(this.A0Q);
            if (A0h2 != null) {
                Object obj = r3.A0K;
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.viewmodel.MarkerData");
                A0h2.remove(obj);
            }
            Set set = this.A0I;
            Object obj2 = r3.A0K;
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.businessdirectory.viewmodel.MarkerData");
            AnonymousClass360.A00(set).remove(((C166297yS) obj2).A02);
            r3.A05();
            it.remove();
        }
    }

    public final void A0M(C88524Zb r3) {
        if (r3 != null) {
            r3.A06(0.0f);
            r3.A04.A01 = false;
            r3.A0C();
            this.A07 = null;
            this.A0f.A0H((Object) null);
        }
    }

    public final void A0N(C88524Zb r3, List list) {
        List A0h2 = C86644Kx.A0h(this.A0Q);
        if (A0h2 != null) {
            A0h2.remove(r3.A04);
        }
        C109065e1 r0 = r3.A04.A03;
        if (r0 != null) {
            list.add(r0);
            this.A0E.remove(r0.A0F);
        }
        r3.A05();
    }

    public final void A0O(C88514Za r3) {
        if (r3 != null) {
            r3.A06(0.0f);
            r3.A0D.A01 = false;
            this.A08 = null;
            this.A0f.A0H((Object) null);
        }
    }

    public final void A0P(C109065e1 r5) {
        LatLng latLng;
        AnonymousClass7KT r0 = this.A06;
        if (r0 != null) {
            LatLng latLng2 = r0.A01;
            latLng = AnonymousClass4L0.A0H(latLng2.A00, latLng2.A01);
        } else {
            latLng = null;
        }
        this.A0V.A03(17, this.A0B);
        this.A0f.A0H(new AnonymousClass7Y5(latLng, r5));
    }

    public final void A0Q(List list) {
        boolean equals;
        AnonymousClass08M r6 = this.A0O;
        ArrayList A0c2 = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C91824lC r3 = (C91824lC) it.next();
            C91824lC r0 = this.A09;
            String str = null;
            if (r0 != null) {
                str = r0.A00;
            }
            String str2 = r3.A00;
            if (str == null) {
                equals = AnonymousClass000.A1X(str2);
            } else {
                equals = str.equals(str2);
            }
            A0c2.add(new C152297Yi(this.A0c, r3, equals));
        }
        r6.A0H(A0c2);
    }

    public final void A0R(boolean z) {
        AnonymousClass4UC r1;
        int A012;
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass5ZR r12 = this.A0d;
            if (r12.A05() && r12.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r1 = this.A0i;
                A012 = 8;
                C06270Wx.A03(r1, A012);
            }
        }
        r1 = this.A0i;
        A012 = C86654Ky.A01(z ? 1 : 0);
        C06270Wx.A03(r1, A012);
    }

    public final void A0S(boolean z) {
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            C88514Za r2 = (C88514Za) it.next();
            if (z || !C162457s7.A0P(r2, this.A08)) {
                List A0h2 = C86644Kx.A0h(this.A0Q);
                if (A0h2 != null) {
                    A0h2.remove(r2.A0D);
                }
                this.A0E.remove(r2.A0E.A0F);
                r2.A05();
                it.remove();
            }
        }
    }

    public final boolean A0U(C109065e1 r3) {
        String str;
        Map map = this.A0E;
        String str2 = r3.A0F;
        if (map.containsKey(str2)) {
            return false;
        }
        C88524Zb r0 = this.A07;
        if (r0 != null) {
            C109065e1 r02 = r0.A04.A03;
            if (r02 != null) {
                str = r02.A0F;
            } else {
                str = null;
            }
            if (C162457s7.A0P(str, str2)) {
                return false;
            }
        }
        C88514Za r03 = this.A08;
        if (r03 == null || !C162457s7.A0P(r03.A0E.A0F, str2)) {
            return true;
        }
        return false;
    }

    public void BUU(AnonymousClass7T4 r5, int i) {
        this.A0V.A06(this.A0B, 28, 1);
        this.A0L = false;
        this.A0P.A0H(0);
        this.A0N.A0H(0);
    }

    public final void A0T(boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C88524Zb r1 = (C88524Zb) it.next();
            if (z || !C162457s7.A0P(r1, this.A07)) {
                A0N(r1, A0s);
                it.remove();
            }
        }
        this.A0g.A0H(A0s);
    }
}
