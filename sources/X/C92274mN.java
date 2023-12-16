package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4mN  reason: invalid class name and case insensitive filesystem */
public class C92274mN extends C89904fT {
    public C990454f A00;
    public C33401sw A01;
    public C50392i6 A02;
    public AnonymousClass3ZF A03;
    public C53312mt A04;
    public final C116985rC A05;
    public final C56972sr A06;
    public final C1224164h A07 = new AnonymousClass6A1(this, 0);
    public final AnonymousClass49R A08 = new AnonymousClass6A2(this, 0);
    public final AnonymousClass5UG A09;
    public final C49412gU A0A;
    public final C46622bw A0B;
    public final C44272Vj A0C;
    public final C56942so A0D;
    public final AnonymousClass67D A0E;
    public final AnonymousClass5UX A0F;
    public final C64773Ex A0G;
    public final AnonymousClass5ZU A0H;
    public final C613330g A0I;
    public final C113905mB A0J;
    public final C56612sH A0K;
    public final C56762sW A0L;
    public final C56892sj A0M;
    public final C56322rn A0N;
    public final C620533h A0O;
    public final C55562qY A0P;
    public final AnonymousClass3ZH A0Q;
    public final AnonymousClass2R8 A0R;
    public final C59862xc A0S;
    public final AnonymousClass1VX A0T;
    public final C49882hF A0U;
    public final C52472lX A0V;
    public final C27991fJ A0W;
    public final AnonymousClass5BY A0X;
    public final AnonymousClass3S3 A0Y;
    public final AnonymousClass30F A0Z;
    public final C84904Ee A0a = new C1237869t(this, 0);
    public final C29281iZ A0b;
    public final C45592aG A0c;
    public final C50282hv A0d;
    public final C56072rN A0e;
    public final C187958y5 A0f;
    public final AnonymousClass4F0 A0g = new AnonymousClass6BQ(this, 1);
    public final C29111iI A0h;
    public final boolean A0i;
    public final boolean A0j;

    public final void A07(long j) {
        C56762sW r2 = this.A0L;
        AnonymousClass3ZF A002 = r2.A00(j);
        if (A002 != null) {
            this.A03 = A002;
            if (A002.A0H == 2) {
                this.A0Z.BkM(new C71323bv(31, C627436k.A07(A002.A0E.A02), this));
            }
            if (A002.A07 != null && A002.A0H == 2 && this.A0T.A0X(5249)) {
                HashSet A0K2 = AnonymousClass002.A0K();
                Iterator A012 = AnonymousClass3ZF.A01(A002);
                while (A012.hasNext()) {
                    AnonymousClass3ZE r22 = (AnonymousClass3ZE) A012.next();
                    if (r22.A00 == 5) {
                        A0K2.add(C618932r.A00(r22.A02));
                    }
                }
                if (A0K2.size() > 0) {
                    Set A003 = this.A0A.A00(A0K2, true);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("groupconversationmenu/maybeprefetchvoicechat prefetch e2ee sessions for group call, ");
                    A0o.append(A003.size());
                    C18260x0.A1M(A0o, " session missing");
                }
            }
            this.A0K.Brj(A002);
        } else if (this.A00 == null) {
            C990454f r1 = new C990454f(this.A07, r2, j);
            this.A00 = r1;
            C86614Ku.A1R(r1, this.A0Z);
        }
    }

    public final void A09(MenuItem menuItem, boolean z) {
        View actionView;
        if (!this.A0i || !this.A0O.A0M(this.A0W) || (actionView = menuItem.getActionView()) == null) {
            this.A0K.BhP(this.A00, z, false);
        } else {
            this.A09.A03(actionView, z ? 1 : 0);
        }
    }

    public final boolean A0A() {
        C56942so r0 = this.A0D;
        if (r0.A06.A06(this.A0W) != 3 || !this.A0C.A00()) {
            return false;
        }
        return true;
    }

    public final boolean A0B(boolean z) {
        if (this.A0K.BFX()) {
            return false;
        }
        AnonymousClass1VX r6 = this.A0T;
        C27991fJ r7 = this.A0W;
        AnonymousClass3ZH r5 = this.A00;
        AnonymousClass5TW r2 = this.A0B;
        C56072rN r8 = this.A0e;
        return AnonymousClass36T.A06(this.A06, this.A08, r2, this.A0G, this.A0M, r5, r6, r7, r8, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0277, code lost:
        if (r6.A0V.A01(r6.A00) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ee, code lost:
        if (r0 == false) goto L_0x02f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQQ(android.view.Menu r20) {
        /*
            r19 = this;
            r14 = r20
            boolean r0 = r14 instanceof X.C07890cz
            r7 = 1
            r6 = r19
            if (r0 == 0) goto L_0x0016
            X.1VX r0 = r6.A0T
            boolean r0 = X.C106545Zk.A00(r0)
            if (r0 == 0) goto L_0x0016
            r0 = r14
            X.0cz r0 = (X.C07890cz) r0
            r0.A0H = r7
        L_0x0016:
            java.lang.String r0 = "groupconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ss r5 = r6.A0O
            X.1fJ r4 = r6.A0W
            int r3 = r5.A06(r4)
            X.2so r2 = r6.A0D
            boolean r0 = r2.A0I(r4, r3)
            if (r0 == 0) goto L_0x008b
            r11 = 2131886194(0x7f120072, float:1.940696E38)
            r12 = 32
            r10 = 0
            if (r20 != 0) goto L_0x03de
            r15 = 0
        L_0x0034:
            r0 = 2131626158(0x7f0e08ae, float:1.8879544E38)
            android.view.View r9 = X.C86644Kx.A0F(r15, r0)
            if (r9 == 0) goto L_0x0072
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0072
            r0 = 2131430027(0x7f0b0a8b, float:1.8481743E38)
            android.widget.ImageView r8 = X.AnonymousClass0x9.A0F(r9, r0)
            android.content.res.Resources r1 = X.C18290x4.A0G(r8)
            r0 = 2131168877(0x7f070e6d, float:1.7952068E38)
            X.C86614Ku.A15(r1, r8, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r8.setScaleType(r0)
            boolean r0 = X.C1001059l.A03
            if (r0 == 0) goto L_0x0072
            android.content.Context r0 = r8.getContext()
            int r1 = X.AnonymousClass34K.A00(r0)
            r0 = 2131230958(0x7f0800ee, float:1.8077983E38)
            r8.setBackgroundResource(r0)
            int r1 = X.C86624Kv.A02(r8, r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r8.setColorFilter(r1, r0)
        L_0x0072:
            r0 = 2
            r15.setShowAsAction(r0)
            android.view.View r8 = r15.getActionView()
            if (r8 == 0) goto L_0x0086
            r1 = 2131433768(0x7f0b1928, float:1.848933E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.setTag(r1, r0)
        L_0x0086:
            if (r9 != 0) goto L_0x03a6
            r14.removeItem(r12)
        L_0x008b:
            X.3ZH r0 = r6.A00
            if (r4 == 0) goto L_0x0127
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x0127
            int r1 = r5.A06(r4)
            r0 = 3
            if (r1 == r0) goto L_0x0127
            X.2rn r8 = r6.A0N
            boolean r0 = r8.A07(r4)
            if (r0 == 0) goto L_0x0396
            X.2mt r0 = r8.A02(r4)
            r6.A04 = r0
            if (r0 == 0) goto L_0x00af
            long r0 = r0.A00
            r6.A07(r0)
        L_0x00af:
            X.2i6 r0 = r6.A02
            if (r0 != 0) goto L_0x00c8
            X.1VX r0 = r6.A0T
            boolean r0 = X.C627436k.A0I(r0)
            if (r0 == 0) goto L_0x00c8
            X.30F r9 = r6.A0Z
            X.4uZ r8 = r6.A0V
            r1 = 0
            X.6A3 r0 = new X.6A3
            r0.<init>(r6, r1)
            r9.A03(r8, r0)
        L_0x00c8:
            X.1VX r10 = r6.A0T
            X.2sr r8 = r6.A06
            boolean r0 = X.C627436k.A0A(r8, r10)
            if (r0 == 0) goto L_0x00d9
            X.67A r1 = r6.A0K
            X.2i6 r0 = r6.A02
            r1.BpG(r0)
        L_0x00d9:
            X.2mt r0 = r6.A04
            if (r0 != 0) goto L_0x0392
            X.2i6 r0 = r6.A02
            if (r0 == 0) goto L_0x027b
            X.C626936e.A06(r0)
            int r1 = r0.A00
            r0 = 2
            boolean r3 = X.AnonymousClass000.A1U(r1, r0)
        L_0x00eb:
            boolean r0 = X.C627436k.A0A(r8, r10)
            if (r0 != 0) goto L_0x0127
            com.whatsapp.voipcalling.CallInfo r12 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.67A r0 = r6.A0K
            boolean r0 = r0.BFX()
            if (r0 != 0) goto L_0x010b
            X.5TW r0 = r6.A0B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x026e
            boolean r0 = X.C627436k.A0N(r4, r12)
            if (r0 != 0) goto L_0x026e
        L_0x010b:
            r9 = 0
        L_0x010c:
            boolean r11 = X.C627436k.A0N(r4, r12)
            boolean r0 = X.C627436k.A09(r8, r10)
            r5 = 2
            if (r0 == 0) goto L_0x01dc
            if (r12 == 0) goto L_0x011f
            boolean r0 = r12.isAudioChat()
            if (r0 != 0) goto L_0x0127
        L_0x011f:
            X.3ZF r0 = r6.A03
            if (r0 == 0) goto L_0x01dc
            int r0 = r0.A0H
            if (r0 != r5) goto L_0x01dc
        L_0x0127:
            boolean r0 = r6.A0A()
            r3 = 2131889890(0x7f120ee2, float:1.9414456E38)
            if (r0 == 0) goto L_0x0133
            r3 = 2131886432(0x7f120160, float:1.9407443E38)
        L_0x0133:
            r1 = 2131234044(0x7f080cfc, float:1.8084243E38)
            r0 = 21
            r6.A04(r14, r0, r3, r1)
            X.2lX r5 = r6.A0V
            X.4uZ r0 = r6.A0V
            boolean r0 = r5.A02(r0)
            if (r0 != 0) goto L_0x0158
            boolean r0 = r6.A0A()
            r3 = 2131895065(0x7f122319, float:1.9424952E38)
            if (r0 == 0) goto L_0x0151
            r3 = 2131895044(0x7f122304, float:1.942491E38)
        L_0x0151:
            r1 = 2131232677(0x7f0807a5, float:1.808147E38)
            r0 = 6
            r6.A04(r14, r0, r3, r1)
        L_0x0158:
            r3 = 2131896276(0x7f1227d4, float:1.9427409E38)
            r1 = 2131231776(0x7f080420, float:1.8079643E38)
            r0 = 7
            r6.A04(r14, r0, r3, r1)
            int r3 = r6.A03()
            r1 = 2131231753(0x7f080409, float:1.8079596E38)
            r0 = 4
            r6.A04(r14, r0, r3, r1)
            X.3ZH r3 = r6.A0Q
            boolean r1 = r5.A01(r3)
            X.2hF r0 = r6.A0U
            boolean r0 = r0.A00(r3, r4)
            if (r0 != 0) goto L_0x0183
            X.2hv r0 = r6.A0d
            boolean r0 = r0.A00(r3, r4)
            if (r0 == 0) goto L_0x0190
        L_0x0183:
            if (r1 != 0) goto L_0x0190
            r3 = 2131889027(0x7f120b83, float:1.9412706E38)
            r1 = 2131232283(0x7f08061b, float:1.808067E38)
            r0 = 12
            r6.A04(r14, r0, r3, r1)
        L_0x0190:
            r3 = 2131895476(0x7f1224b4, float:1.9425786E38)
            r1 = 2131232723(0x7f0807d3, float:1.8081563E38)
            r0 = 5
            r6.A04(r14, r0, r3, r1)
            r1 = 2131896074(0x7f12270a, float:1.9426999E38)
            r0 = 0
            android.view.SubMenu r5 = r14.addSubMenu(r0, r7, r0, r1)
            r5.clearHeader()
            r3 = 2131893093(0x7f121b65, float:1.9420953E38)
            r1 = 2131232756(0x7f0807f4, float:1.808163E38)
            r0 = 9
            r6.A04(r5, r0, r3, r1)
            X.2sj r0 = r6.A0M
            boolean r0 = r0.A0C(r4)
            if (r0 == 0) goto L_0x01cf
            X.2ss r0 = r2.A06
            int r1 = r0.A06(r4)
            r0 = 3
            r2 = 2131889207(0x7f120c37, float:1.9413071E38)
            if (r1 != r0) goto L_0x01c7
            r2 = 2131889196(0x7f120c2c, float:1.9413049E38)
        L_0x01c7:
            r1 = 2131232212(0x7f0805d4, float:1.8080527E38)
            r0 = 23
            r6.A04(r5, r0, r2, r1)
        L_0x01cf:
            X.C89904fT.A01(r5, r6)
            X.5UG r1 = r6.A09
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            r1.A01 = r0
            return
        L_0x01dc:
            boolean r0 = X.C627436k.A0A(r8, r10)
            if (r0 == 0) goto L_0x01ee
            X.3ZF r0 = r6.A03
            if (r0 != 0) goto L_0x01ea
            X.2i6 r0 = r6.A02
            if (r0 == 0) goto L_0x01ee
        L_0x01ea:
            if (r11 != 0) goto L_0x01ee
            goto L_0x0127
        L_0x01ee:
            r10 = 2131896425(0x7f122869, float:1.942771E38)
            r1 = 2131233324(0x7f080a2c, float:1.8082782E38)
            r0 = 27
            android.view.MenuItem r8 = r6.A04(r14, r0, r10, r1)
            r0 = 2131625244(0x7f0e051c, float:1.887769E38)
            r8.setActionView(r0)
            r8.setShowAsAction(r5)
            android.view.View r5 = r8.getActionView()
            if (r5 == 0) goto L_0x0213
            r1 = 2131433768(0x7f0b1928, float:1.848933E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.setTag(r1, r0)
        L_0x0213:
            android.view.View r5 = r8.getActionView()
            r0 = 2131430891(0x7f0b0deb, float:1.8483496E38)
            android.view.View r1 = X.C06560Yg.A02(r5, r0)
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            r0 = 2131896425(0x7f122869, float:1.942771E38)
            if (r11 == 0) goto L_0x0228
            r0 = 2131895416(0x7f122478, float:1.9425664E38)
        L_0x0228:
            r1.setText(r0)
            r0 = 56
            r1.A0F(r0)
            r0 = 2131428460(0x7f0b046c, float:1.8478565E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0E(r5, r0)
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r3 == 0) goto L_0x023f
            r0 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x023f:
            r1.setImageResource(r0)
            X.07r r1 = r6.A01
            r0 = 2131891400(0x7f1214c8, float:1.9417519E38)
            if (r3 == 0) goto L_0x024c
            r0 = 2131895036(0x7f1222fc, float:1.9424894E38)
        L_0x024c:
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131895333(0x7f122425, float:1.9425496E38)
            if (r11 == 0) goto L_0x0258
            r0 = 2131895416(0x7f122478, float:1.9425664E38)
        L_0x0258:
            java.lang.String r1 = r1.getString(r0)
            X.4TA r0 = new X.4TA
            r0.<init>(r3, r1)
            X.C06560Yg.A0O(r5, r0)
            if (r11 == 0) goto L_0x0269
            r10 = 2131895416(0x7f122478, float:1.9425664E38)
        L_0x0269:
            r6.A06(r8, r10, r9)
            goto L_0x0127
        L_0x026e:
            X.2lX r1 = r6.A0V
            X.3ZH r0 = r6.A00
            boolean r0 = r1.A01(r0)
            r9 = 1
            if (r0 == 0) goto L_0x010c
            goto L_0x010b
        L_0x027b:
            boolean r0 = r2.A0I(r4, r3)
            if (r0 != 0) goto L_0x035d
            X.3Mh r8 = r6.A08
            X.2sj r1 = r6.A0M
            X.3ZH r0 = r6.A00
            boolean r0 = X.AnonymousClass36T.A07(r8, r5, r1, r0, r4)
            if (r0 == 0) goto L_0x034a
            boolean r0 = r2.A0I(r4, r3)
            if (r0 != 0) goto L_0x034a
            r8 = 1
            r3 = 0
            r1 = 4161(0x1041, float:5.831E-42)
            int r0 = r10.A0N(r1)
            if (r0 <= 0) goto L_0x02d6
            boolean r9 = r6.A0B(r3)
            int r8 = r10.A0N(r1)
            r0 = 33
            r5 = 2131889783(0x7f120e77, float:1.941424E38)
            r3 = 2131231757(0x7f08040d, float:1.8079604E38)
            android.view.MenuItem r1 = r6.A04(r14, r0, r5, r3)
            r0 = 2131626253(0x7f0e090d, float:1.8879737E38)
            r1.setActionView(r0)
            r6.A06(r1, r5, r9)
            r0 = 2
            r1.setShowAsAction(r0)
            if (r8 == r7) goto L_0x02c8
            r3 = 2131231803(0x7f08043b, float:1.8079697E38)
            if (r8 == r0) goto L_0x02c8
            r3 = 2131233866(0x7f080c4a, float:1.8083882E38)
        L_0x02c8:
            android.view.View r0 = r1.getActionView()
            X.C626936e.A04(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r3)
            goto L_0x0127
        L_0x02d6:
            boolean r0 = r6.A0j
            if (r0 == 0) goto L_0x0320
            X.33h r0 = r6.A0O
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x0320
        L_0x02e2:
            boolean r10 = r6.A0B(r8)
            r9 = 2
            if (r8 == 0) goto L_0x02f0
            boolean r0 = r6.A0i
            r5 = 2131233866(0x7f080c4a, float:1.8083882E38)
            if (r0 != 0) goto L_0x02f3
        L_0x02f0:
            r5 = 2131233785(0x7f080bf9, float:1.8083717E38)
        L_0x02f3:
            r3 = 2131895016(0x7f1222e8, float:1.9424853E38)
            r0 = 26
            android.view.MenuItem r1 = r6.A04(r14, r0, r3, r5)
            r0 = 2131626253(0x7f0e090d, float:1.8879737E38)
            r1.setActionView(r0)
            r6.A06(r1, r3, r10)
            r1.setShowAsAction(r9)
            android.view.View r0 = r1.getActionView()
            X.C626936e.A04(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r5)
            X.67A r0 = r6.A0K
            r0.BKy()
            if (r8 == 0) goto L_0x0322
            r6.A08(r14, r10)
            goto L_0x0127
        L_0x0320:
            r8 = 0
            goto L_0x02e2
        L_0x0322:
            r8 = 2131886482(0x7f120192, float:1.9407544E38)
            r5 = 2131231718(0x7f0803e6, float:1.8079525E38)
            r0 = 25
            android.view.MenuItem r3 = r6.A04(r14, r0, r8, r5)
            r0 = 2131624117(0x7f0e00b5, float:1.8875405E38)
            android.view.View r1 = X.C86644Kx.A0F(r3, r0)
            X.C626936e.A04(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageResource(r5)
            X.07r r0 = r6.A01
            X.C18300x5.A13(r0, r1, r8)
            r6.A06(r3, r8, r10)
            r3.setShowAsAction(r9)
            goto L_0x0127
        L_0x034a:
            boolean r0 = r1.A0C(r4)
            if (r0 == 0) goto L_0x0127
            boolean r0 = r6.A0j
            if (r0 == 0) goto L_0x035d
            boolean r0 = r6.A0B(r7)
            r6.A08(r14, r0)
            goto L_0x0127
        L_0x035d:
            r0 = 0
            boolean r8 = r6.A0B(r0)
            X.3Mh r3 = r6.A08
            X.2sj r1 = r6.A0M
            X.3ZH r0 = r6.A00
            boolean r0 = X.AnonymousClass36T.A07(r3, r5, r1, r0, r4)
            if (r0 != 0) goto L_0x0377
            boolean r0 = r6.A0j
            if (r0 == 0) goto L_0x0377
            r6.A08(r14, r8)
            goto L_0x0127
        L_0x0377:
            r3 = 2131889783(0x7f120e77, float:1.941424E38)
            r1 = 2131231757(0x7f08040d, float:1.8079604E38)
            r0 = 24
            android.view.MenuItem r1 = r6.A04(r14, r0, r3, r1)
            r0 = 2131625021(0x7f0e043d, float:1.8877238E38)
            r1.setActionView(r0)
            r6.A06(r1, r3, r8)
            r0 = 2
            r1.setShowAsAction(r0)
            goto L_0x0127
        L_0x0392:
            boolean r3 = r0.A04
            goto L_0x00eb
        L_0x0396:
            X.49R r0 = r6.A08
            X.1sw r1 = new X.1sw
            r1.<init>(r0, r8, r4)
            r6.A01 = r1
            X.4FS r0 = r6.A0Z
            X.C86614Ku.A1R(r1, r0)
            goto L_0x00af
        L_0x03a6:
            r0 = 2131432057(0x7f0b1279, float:1.848586E38)
            com.whatsapp.WaImageButton r16 = X.C86664Kz.A10(r9, r0)
            android.content.Context r13 = r16.getContext()
            r12 = 2131886187(0x7f12006b, float:1.9406946E38)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            X.5ZU r1 = r6.A0H
            X.3ZH r0 = r6.A00
            X.C18300x5.A1E(r1, r0, r8, r10)
            X.C86624Kv.A0h(r13, r9, r8, r12)
            X.C107295b4.A03(r9, r11)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165831(0x7f070287, float:1.794589E38)
            int r18 = r1.getDimensionPixelSize(r0)
            X.5gF r12 = new X.5gF
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.4FS r1 = r2.A0N
            r0 = 26
            X.C70323aJ.A00(r1, r2, r4, r12, r0)
            goto L_0x008b
        L_0x03de:
            android.view.MenuItem r15 = r14.add(r10, r12, r10, r11)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92274mN.BQQ(android.view.Menu):void");
    }

    public final void A08(Menu menu, boolean z) {
        MenuItem A042 = A04(menu, 31, R.string.f11nameremoved, R.drawable.vec_ic_voicechat);
        View A0F2 = C86644Kx.A0F(A042, R.layout.f8nameremoved);
        C626936e.A04(A0F2);
        ImageView imageView = (ImageView) A0F2;
        imageView.setImageResource(R.drawable.vec_ic_voicechat);
        C18300x5.A13(this.A01, imageView, R.string.f11nameremoved);
        A06(A042, R.string.f11nameremoved, z);
        AnonymousClass1VX r3 = this.A0T;
        C56972sr r2 = this.A06;
        int A0H2 = C86664Kz.A0H(this.A0M, this.A0W);
        if (C627436k.A0C(r2, r3, A0H2) && !C627436k.A0B(r2, r3, A0H2)) {
            A042.getActionView().setAlpha(0.4f);
        }
        A042.setShowAsAction(2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BXQ(android.view.MenuItem r11) {
        /*
            r10 = this;
            int r1 = r11.getItemId()
            r0 = 12
            r9 = 1
            if (r1 == r0) goto L_0x0196
            r0 = 13
            if (r1 == r0) goto L_0x0195
            r4 = 2
            r2 = 0
            switch(r1) {
                case 21: goto L_0x0129;
                case 22: goto L_0x0112;
                case 23: goto L_0x00e4;
                case 24: goto L_0x00a4;
                case 25: goto L_0x009a;
                case 26: goto L_0x0090;
                case 27: goto L_0x007a;
                case 28: goto L_0x0068;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r1) {
                case 31: goto L_0x0060;
                case 32: goto L_0x0025;
                case 33: goto L_0x018a;
                case 34: goto L_0x001a;
                case 35: goto L_0x0195;
                default: goto L_0x0015;
            }
        L_0x0015:
            boolean r0 = super.BXQ(r11)
            return r0
        L_0x001a:
            android.view.View r1 = r11.getActionView()
            if (r1 == 0) goto L_0x0195
            X.5UG r0 = r10.A09
            r4 = 3
            goto L_0x0192
        L_0x0025:
            X.2so r2 = r10.A0D
            X.1fJ r1 = r10.A0W
            X.2ss r0 = r10.A0O
            int r0 = r0.A06(r1)
            boolean r0 = r2.A0I(r1, r0)
            if (r0 == 0) goto L_0x0195
            X.1fJ r5 = r2.A01(r1)
            if (r5 == 0) goto L_0x005a
            X.67D r4 = r10.A0E
            X.07r r0 = r10.A01
            X.0df r3 = r0.getSupportFragmentManager()
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r2 = new com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "community_jid"
            X.C86604Kt.A18(r1, r2, r5, r0)
            X.5se r0 = new X.5se
            r0.<init>(r2)
            r4.BpH(r3, r5, r0)
            return r9
        L_0x005a:
            java.lang.String r0 = "GroupConversationsMenu/subgroupBottomSheet/parentGroupJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x0060:
            X.67A r1 = r10.A0K
            X.3ZH r0 = r10.A00
            r1.Bpa(r0)
            return r9
        L_0x0068:
            X.5rC r1 = r10.A05
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0195
            r1.A04()
            java.lang.String r0 = "showChatAssignmentPicker"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x007a:
            X.3ZF r1 = r10.A03
            r2 = 9
            if (r1 == 0) goto L_0x0086
            X.67A r0 = r10.A0K
            r0.BJR(r1, r2)
            return r9
        L_0x0086:
            X.2i6 r1 = r10.A02
            if (r1 == 0) goto L_0x0195
            X.67A r0 = r10.A0K
            r0.Bpr(r1, r2)
            return r9
        L_0x0090:
            X.2aG r1 = r10.A0c
            r0 = 7
            r1.A00(r0)
            r10.A09(r11, r9)
            return r9
        L_0x009a:
            X.2aG r1 = r10.A0c
            r0 = 6
            r1.A00(r0)
            r10.A09(r11, r2)
            return r9
        L_0x00a4:
            X.33h r0 = r10.A0O
            X.1fJ r5 = r10.A0W
            X.33k r0 = r0.A07(r5)
            java.util.Map r0 = r0.A09
            int r2 = r0.size()
            X.3Mh r1 = r10.A08
            X.1Ek r0 = X.C66663Mh.A1d
            int r1 = r1.A03(r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x018a
            X.3Ex r4 = r10.A0G
            X.2sj r0 = r10.A0M
            X.2sr r1 = r10.A06
            X.33k r0 = X.C56892sj.A01(r0, r5)
            X.6aS r0 = r0.A02()
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
            r6.remove(r0)
            r7 = 0
            X.07r r3 = r10.A01
            r8 = 24
            X.C107305b5.A07(r3, r4, r5, r6, r7, r8, r9)
            return r9
        L_0x00e4:
            X.3S3 r1 = r10.A0Y
            X.4uZ r0 = r10.A0V
            r1.A05(r0)
            X.4FU r1 = r10.A05
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r1.BpA(r2, r0)
            X.4FS r1 = r10.A0Z
            X.07r r5 = r10.A01
            X.2qY r7 = r10.A0P
            X.2so r6 = r10.A0D
            X.1fJ r0 = r10.A0W
            java.util.Set r8 = java.util.Collections.singleton(r0)
            r0 = 4
            X.6Az r4 = new X.6Az
            r4.<init>(r10, r0)
            X.54s r3 = new X.54s
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.BkL(r3, r0)
            return r9
        L_0x0112:
            X.5rC r1 = r10.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0195
            r1.A04()
            X.5rC r0 = r10.A04
            r0.A04()
            java.lang.String r0 = "getLabelGroup"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0129:
            X.2so r5 = r10.A0D
            X.1fJ r4 = r10.A0W
            X.1fJ r3 = r5.A01(r4)
            if (r3 == 0) goto L_0x014b
            boolean r0 = r10.A0A()
            if (r0 == 0) goto L_0x014b
            X.67D r2 = r10.A0E
            X.07r r1 = r10.A01
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            boolean r0 = r2.Bg9(r1, r0, r3)
            if (r0 == 0) goto L_0x014b
            return r9
        L_0x014b:
            X.07r r3 = r10.A01
            X.3ZH r0 = r10.A00
            X.4uZ r1 = r0.A0H
            r0 = 0
            android.content.Intent r2 = X.C627736r.A0g(r3, r1, r9, r0, r0)
            X.2ss r0 = r10.A0O
            int r0 = r0.A06(r4)
            boolean r0 = r5.A0J(r4, r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131434060(0x7f0b1a4c, float:1.8489923E38)
            X.5UY r0 = X.AnonymousClass5UY.A01(r3, r0)
            android.view.View r0 = r0.A04()
            com.whatsapp.community.SubgroupPileView r0 = (com.whatsapp.community.SubgroupPileView) r0
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A01
        L_0x0171:
            X.5MG r0 = r10.A0A
            android.os.Bundle r1 = X.AnonymousClass5MG.A00(r3, r1, r0)
            java.lang.String r0 = X.C18310x6.A0n(r3)
            X.AnonymousClass5VI.A00(r2, r0)
            X.AnonymousClass0RN.A00(r3, r2, r1)
            return r9
        L_0x0182:
            r0 = 2131434443(0x7f0b1bcb, float:1.84907E38)
            android.view.View r1 = X.C005205m.A00(r3, r0)
            goto L_0x0171
        L_0x018a:
            android.view.View r1 = r11.getActionView()
            if (r1 == 0) goto L_0x0195
            X.5UG r0 = r10.A09
        L_0x0192:
            r0.A03(r1, r4)
        L_0x0195:
            return r9
        L_0x0196:
            X.4FS r1 = r10.A0Z
            r0 = 13
            X.C117085rM.A01(r1, r10, r0)
            X.07r r3 = r10.A01
            X.1fJ r2 = r10.A0W
            X.3Ex r0 = r10.A0G
            X.3ZH r0 = r0.A0A(r2)
            int r1 = r0.A02
            r0 = 3
            android.content.Intent r0 = X.C627736r.A0R(r3, r2, r1, r0)
            r3.startActivity(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92274mN.BXQ(android.view.MenuItem):boolean");
    }

    public boolean BYj(Menu menu) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("groupconversationmenu/onprepareoptionsmenu ");
        C18260x0.A1G(A0o, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        A05(menu.findItem(4));
        return super.BYj(menu);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A0h.A06(this.A0g);
        this.A0b.A06(this.A0a);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A0h.A07(this.A0g);
        this.A0b.A07(this.A0a);
        C33401sw r0 = this.A01;
        if (r0 != null) {
            r0.A0D(true);
            this.A01 = null;
        }
        C990454f r02 = this.A00;
        if (r02 != null) {
            r02.A0D(true);
            this.A00 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92274mN(X.C009707r r45, X.C116985rC r46, X.C116985rC r47, X.C116985rC r48, X.C116985rC r49, X.AnonymousClass5M8 r50, X.AnonymousClass5M9 r51, X.C101365Em r52, X.AnonymousClass4FU r53, X.C69263Wi r54, X.C56972sr r55, X.C66663Mh r56, X.C621033m r57, X.AnonymousClass5MG r58, X.C1224264i r59, X.C49412gU r60, X.C46622bw r61, X.AnonymousClass5TW r62, X.C29301ib r63, X.C46342bT r64, X.C44272Vj r65, X.C56942so r66, X.C64653Ej r67, X.AnonymousClass5UX r68, X.C64773Ex r69, X.C29421in r70, X.AnonymousClass5ZU r71, X.C613330g r72, X.AnonymousClass67A r73, X.C113905mB r74, X.C56612sH r75, X.AnonymousClass33p r76, X.C620733j r77, X.C56762sW r78, X.C56982ss r79, X.C66473Lo r80, X.C56892sj r81, X.C56322rn r82, X.C620533h r83, X.C55562qY r84, X.AnonymousClass3ZH r85, X.C29041iB r86, X.AnonymousClass2R8 r87, X.C59862xc r88, X.AnonymousClass1VX r89, X.AnonymousClass3LP r90, X.C49882hF r91, X.C29241iV r92, X.C52472lX r93, X.C27991fJ r94, X.C50452iC r95, X.AnonymousClass5BY r96, X.AnonymousClass3S3 r97, X.AnonymousClass30F r98, X.C29281iZ r99, X.AnonymousClass1R1 r100, X.C45592aG r101, X.C50282hv r102, X.C56072rN r103, X.C187958y5 r104, X.AnonymousClass4FS r105, X.C29111iI r106) {
        /*
            r44 = this;
            r10 = r44
            r4 = r102
            r19 = r54
            r18 = r53
            r17 = r52
            r16 = r51
            r15 = r50
            r14 = r49
            r11 = r45
            r23 = r58
            r24 = r62
            r25 = r63
            r13 = r47
            r43 = r105
            r12 = r46
            r3 = r73
            r27 = r70
            r26 = r64
            r6 = r55
            r21 = r56
            r22 = r57
            r8 = r74
            r30 = r76
            r31 = r77
            r32 = r79
            r33 = r80
            r34 = r85
            r35 = r86
            r5 = r89
            r37 = r90
            r38 = r92
            r7 = r94
            r40 = r95
            r41 = r100
            r28 = r3
            r29 = r8
            r36 = r5
            r39 = r7
            r42 = r4
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r2 = 0
            X.6A1 r0 = new X.6A1
            r0.<init>(r10, r2)
            r10.A07 = r0
            X.6A2 r0 = new X.6A2
            r0.<init>(r10, r2)
            r10.A08 = r0
            r1 = 1
            X.6BQ r0 = new X.6BQ
            r0.<init>(r10, r1)
            r10.A0g = r0
            X.69t r0 = new X.69t
            r0.<init>(r10, r2)
            r10.A0a = r0
            r0 = r75
            r10.A0K = r0
            r10.A0T = r5
            r10.A06 = r6
            r0 = r68
            r10.A0F = r0
            r1 = r69
            r10.A0G = r1
            r0 = r104
            r10.A0f = r0
            r0 = r71
            r10.A0H = r0
            r0 = r103
            r10.A0e = r0
            r0 = r91
            r10.A0U = r0
            r0 = r97
            r10.A0Y = r0
            r0 = r106
            r10.A0h = r0
            r0 = r78
            r10.A0L = r0
            r0 = r60
            r10.A0A = r0
            r0 = r67
            r10.A0E = r0
            r0 = r88
            r10.A0S = r0
            r0 = r84
            r10.A0P = r0
            r0 = r98
            r10.A0Z = r0
            r0 = r87
            r10.A0R = r0
            r0 = r66
            r10.A0D = r0
            r0 = r82
            r10.A0N = r0
            r0 = r83
            r10.A0O = r0
            r0 = r99
            r10.A0b = r0
            r0 = r65
            r10.A0C = r0
            r9 = r81
            r10.A0M = r9
            r0 = r101
            r10.A0c = r0
            r0 = r72
            r10.A0I = r0
            r10.A0d = r4
            r0 = r48
            r10.A05 = r0
            r10.A0W = r7
            r10.A0J = r8
            X.3ZH r0 = r1.A0A(r7)
            r10.A0Q = r0
            r0 = r93
            r10.A0V = r0
            r0 = r96
            r10.A0X = r0
            r0 = r61
            r10.A0B = r0
            int r0 = X.C86664Kz.A0H(r9, r7)
            boolean r0 = X.C627436k.A0C(r6, r5, r0)
            r10.A0j = r0
            boolean r0 = X.C627436k.A0H(r5)
            r10.A0i = r0
            X.4uZ r1 = r10.A0V
            X.5jp r0 = new X.5jp
            r0.<init>(r3, r10)
            r3 = r59
            X.5UG r0 = r3.B0A(r11, r0, r1, r2)
            r10.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92274mN.<init>(X.07r, X.5rC, X.5rC, X.5rC, X.5rC, X.5M8, X.5M9, X.5Em, X.4FU, X.3Wi, X.2sr, X.3Mh, X.33m, X.5MG, X.64i, X.2gU, X.2bw, X.5TW, X.1ib, X.2bT, X.2Vj, X.2so, X.3Ej, X.5UX, X.3Ex, X.1in, X.5ZU, X.30g, X.67A, X.5mB, X.2sH, X.33p, X.33j, X.2sW, X.2ss, X.3Lo, X.2sj, X.2rn, X.33h, X.2qY, X.3ZH, X.1iB, X.2R8, X.2xc, X.1VX, X.3LP, X.2hF, X.1iV, X.2lX, X.1fJ, X.2iC, X.5BY, X.3S3, X.30F, X.1iZ, X.1R1, X.2aG, X.2hv, X.2rN, X.8y5, X.4FS, X.1iI):void");
    }
}
