package com.whatsapp.ephemeral;

import X.AnonymousClass001;
import X.AnonymousClass1FE;
import X.AnonymousClass2YA;
import X.AnonymousClass34R;
import X.AnonymousClass36M;
import X.AnonymousClass3DZ;
import X.AnonymousClass3LP;
import X.AnonymousClass3LQ;
import X.AnonymousClass4A7;
import X.AnonymousClass4FV;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C203859oQ;
import X.C204019og;
import X.C27991fJ;
import X.C28891hw;
import X.C29421in;
import X.C49522gf;
import X.C49772h4;
import X.C50282hv;
import X.C55262q4;
import X.C56422rx;
import X.C56602sG;
import X.C56892sj;
import X.C56962sq;
import X.C57162tC;
import X.C621033m;
import X.C626936e;
import X.C64333Db;
import X.C66433Lk;
import X.C66493Lq;
import X.C66503Lr;
import X.C69263Wi;
import X.C86604Kt;
import X.C86644Kx;
import X.C86654Ky;
import X.C89644eZ;
import X.C94704rm;
import X.C95814uZ;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class ChangeEphemeralSettingActivity extends C89644eZ {
    public int A00;
    public int A01;
    public int A02;
    public C621033m A03;
    public C56962sq A04;
    public C29421in A05;
    public C56422rx A06;
    public C49772h4 A07;
    public C55262q4 A08;
    public C57162tC A09;
    public C28891hw A0A;
    public C56892sj A0B;
    public C49522gf A0C;
    public AnonymousClass2YA A0D;
    public AnonymousClass3LP A0E;
    public AnonymousClass4FV A0F;
    public C66493Lq A0G;
    public C66503Lr A0H;
    public C95814uZ A0I;
    public AnonymousClass3LQ A0J;
    public C66433Lk A0K;
    public C50282hv A0L;
    public boolean A0M;
    public final C56602sG A0N;

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r2 = A002.A00;
            C1899593h.A0z(A002, r2, this, C1899593h.A0W(A002, r2, this));
            this.A0F = C86604Kt.A0Z(A002);
            this.A03 = (C621033m) A002.AZL.get();
            this.A0E = A002.Akp();
            this.A0K = C86604Kt.A0e(A002);
            this.A04 = C86654Ky.A0T(A002);
            this.A05 = C86604Kt.A0Q(A002);
            this.A0G = (C66493Lq) A002.AGL.get();
            this.A0H = (C66503Lr) A002.AGs.get();
            this.A0J = A002.Aog();
            this.A06 = C86644Kx.A0S(A002);
            this.A0A = (C28891hw) A002.A6s.get();
            this.A0B = (C56892sj) A002.AGm.get();
            this.A0C = (C49522gf) A002.A8L.get();
            this.A07 = (C49772h4) A002.A8e.get();
            this.A0L = (C50282hv) A002.A8K.get();
            this.A09 = (C57162tC) A002.AaV.get();
            this.A08 = (C55262q4) A002.A5q.get();
            this.A0D = (AnonymousClass2YA) A002.A8P.get();
        }
    }

    public final void A74() {
        C69263Wi r2;
        int i;
        C626936e.A06(this.A0I);
        C95814uZ r1 = this.A0I;
        boolean z = r1 instanceof UserJid;
        if (!z || !this.A04.A0P((UserJid) r1)) {
            int i2 = this.A02;
            if (i2 != -1 && this.A01 != i2) {
                if (this.A07.A0F()) {
                    C95814uZ r5 = this.A0I;
                    if (r5 instanceof C27991fJ) {
                        C27991fJ r52 = (C27991fJ) r5;
                        int i3 = this.A02;
                        this.A0H.A0B(new AnonymousClass1FE(this.A0A, this.A0G, r52, (String) null, (List) null, 224), r52, i3);
                        A75(i3);
                        return;
                    } else if (z) {
                        int i4 = this.A02;
                        this.A03.A0M((UserJid) r5, Boolean.TRUE, i4, 1);
                        A75(i4);
                        return;
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Ephemeral not supported for this type of jid, type=");
                        A0o.append(r5.getType());
                        C18280x3.A13(A0o);
                        return;
                    }
                } else {
                    r2 = this.A05;
                    i = R.string.f11nameremoved;
                }
            } else {
                return;
            }
        } else {
            r2 = this.A05;
            int i5 = this.A02;
            i = R.string.f11nameremoved;
            if (i5 == 0) {
                i = R.string.f11nameremoved;
            }
        }
        r2.A0H(i, 1);
    }

    public final void A75(int i) {
        long j;
        C94704rm r2 = new C94704rm();
        r2.A02 = Long.valueOf((long) i);
        int i2 = this.A01;
        if (i2 == -1) {
            j = 0;
        } else {
            j = (long) i2;
        }
        r2.A03 = Long.valueOf(j);
        int i3 = this.A00;
        int i4 = 2;
        if (i3 != 2) {
            i4 = 3;
            if (i3 != 3) {
                i4 = 1;
            }
        }
        r2.A00 = Integer.valueOf(i4);
        C95814uZ r1 = this.A0I;
        if (r1 instanceof C27991fJ) {
            C56892sj r0 = this.A0B;
            C27991fJ A032 = AnonymousClass34R.A03(r1);
            C626936e.A06(A032);
            r2.A01 = Integer.valueOf(AnonymousClass36M.A03(r0.A09.A07(A032).A04().size()));
        }
        this.A0F.BhD(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x009a, code lost:
        if ((r8 instanceof com.whatsapp.jid.UserJid) != false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r10 = r19
            r6 = r20
            super.onCreate(r6)
            X.1in r1 = r10.A05
            X.2sG r0 = r10.A0N
            r1.A06(r0)
            r0 = 2131625808(0x7f0e0750, float:1.8878834E38)
            r10.setContentView((int) r0)
            r0 = 2131429852(0x7f0b09dc, float:1.8481388E38)
            android.view.View r2 = X.C005205m.A00(r10, r0)
            r0 = 2131429853(0x7f0b09dd, float:1.848139E38)
            android.view.View r1 = X.C005205m.A00(r10, r0)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            boolean r0 = X.C1001059l.A04
            r7 = 0
            if (r0 == 0) goto L_0x0033
            r0 = 2131429851(0x7f0b09db, float:1.8481386E38)
            android.view.View r0 = X.C005205m.A00(r10, r0)
            r0.setVisibility(r7)
        L_0x0033:
            java.lang.String r0 = "ephemeral_settings_lottie_animation.lottie"
            r1.setAnimation((java.lang.String) r0)
            r3 = 0
            r1.setVisibility(r7)
            r4 = 8
            r2.setVisibility(r4)
            r5 = 2131889027(0x7f120b83, float:1.9412706E38)
            java.lang.String r0 = r10.getString(r5)
            r10.setTitle(r0)
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r2 = X.C005205m.A00(r10, r0)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            X.33j r1 = r10.A00
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            X.C86604Kt.A11(r10, r2, r1, r0)
            java.lang.String r0 = r10.getString(r5)
            r2.setTitle((java.lang.CharSequence) r0)
            int r0 = X.AnonymousClass34K.A00(r10)
            r2.setBackgroundResource(r0)
            r0 = 2132083773(0x7f15043d, float:1.9807698E38)
            r2.A0J(r10, r0)
            r0 = 4
            X.9p3 r0 = X.C204249p3.A00(r10, r0)
            r2.setNavigationOnClickListener(r0)
            r10.setSupportActionBar(r2)
            X.4uZ r8 = X.C106405Yw.A00(r10)
            r5 = 1
            boolean r1 = X.AnonymousClass000.A1W(r8)
            java.lang.String r0 = "Cannot change ephemeral setting without chat jid"
            X.C626936e.A0D(r1, r0)
            if (r8 != 0) goto L_0x008f
            r10.finish()
        L_0x008e:
            return
        L_0x008f:
            r10.A0I = r8
            boolean r0 = X.C627336j.A0K(r8)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            r2 = 0
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            r2 = 1
        L_0x009d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Ephemeral setting can only be changed for Groups and 1:1, jid type="
            r1.append(r0)
            int r0 = r8.getType()
            r1.append(r0)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0D(r2, r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "current_setting"
            r2 = -1
            int r0 = r1.getIntExtra(r0, r2)
            r10.A01 = r0
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "entry_point"
            int r0 = r1.getIntExtra(r0, r5)
            r10.A00 = r0
            int r0 = r10.A01
            if (r0 == r2) goto L_0x00d4
            r7 = 1
        L_0x00d4:
            java.lang.String r0 = "add current ephemeral duration in bundle with extra ARG_CURRENT_SETTING"
            X.C626936e.A0D(r7, r0)
            int r1 = r10.A01
            r10.A02 = r1
            if (r20 == 0) goto L_0x00e7
            java.lang.String r0 = "selected_setting"
            int r0 = r6.getInt(r0, r1)
            r10.A02 = r0
        L_0x00e7:
            r0 = 2131429873(0x7f0b09f1, float:1.8481431E38)
            android.view.View r2 = r10.findViewById(r0)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            X.9pF r0 = new X.9pF
            r0.<init>(r10, r5)
            r2.setOnCheckedChangeListener(r0)
            r0 = 2131429848(0x7f0b09d8, float:1.848138E38)
            android.view.View r0 = X.C005205m.A00(r10, r0)
            r0.setVisibility(r4)
            int r1 = r10.A02
            X.1VX r0 = r10.A0D
            X.AnonymousClass352.A03(r2, r0, r1, r3, r3)
            X.4uZ r1 = r10.A0I
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x012a
            X.2hv r0 = r10.A0L
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x012a
            r1 = 0
        L_0x011a:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L_0x012a
            android.view.View r0 = r2.getChildAt(r1)
            r0.setEnabled(r3)
            int r1 = r1 + 1
            goto L_0x011a
        L_0x012a:
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r14 = r10.findViewById(r0)
            com.whatsapp.TextEmojiLabel r14 = (com.whatsapp.TextEmojiLabel) r14
            X.4uZ r0 = r10.A0I
            boolean r1 = X.C627336j.A0K(r0)
            r0 = 2131889010(0x7f120b72, float:1.9412671E38)
            if (r1 == 0) goto L_0x0141
            r0 = 2131889009(0x7f120b71, float:1.941267E38)
        L_0x0141:
            java.lang.String r17 = r10.getString(r0)
            X.1VX r3 = r10.A0D
            X.3Wi r13 = r10.A05
            X.5hX r12 = r10.A00
            X.33i r15 = r10.A08
            java.lang.String r18 = "learn-more"
            X.3Lk r2 = r10.A0K
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-disappearing-messages"
            android.net.Uri r11 = r2.A04(r1, r0)
            r16 = r3
            X.C107635bd.A0E(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.33j r0 = r10.A00
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x016e
            r0 = 5
            r14.setGravity(r0)
            r0 = 3
            r14.setTextDirection(r0)
        L_0x016e:
            X.2gf r0 = r10.A0C
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x008e
            r0 = 2131429529(0x7f0b0899, float:1.8480733E38)
            android.view.View r7 = X.C005205m.A00(r10, r0)
            r9 = 0
            r7.setVisibility(r9)
            r0 = 2131429530(0x7f0b089a, float:1.8480735E38)
            android.view.View r6 = X.C005205m.A00(r10, r0)
            r0 = 2131429528(0x7f0b0898, float:1.8480731E38)
            android.view.View r8 = X.C005205m.A00(r10, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            X.2YA r0 = r10.A0D
            android.content.SharedPreferences r3 = r0.A00()
            java.lang.String r0 = "disappearing_mode_timestamp"
            r1 = 0
            long r4 = r3.getLong(r0, r1)
            r3 = 8
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            r6.setVisibility(r9)
            r8.setVisibility(r3)
            r0 = 5
            X.C204249p3.A02(r7, r10, r0)
            return
        L_0x01b0:
            r8.setVisibility(r9)
            r6.setVisibility(r3)
            r0 = 2131888697(0x7f120a39, float:1.9412037E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            android.text.Spanned r0 = X.C107575bX.A02(r1, r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r7.getSpans(r9, r1, r0)
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x0201
            int r5 = r6.length
        L_0x01d7:
            if (r9 >= r5) goto L_0x0201
            r4 = r6[r9]
            java.lang.String r1 = r4.getURL()
            java.lang.String r0 = "disappearing_mode_setting_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01fe
            X.975 r3 = new X.975
            r3.<init>(r10, r10)
            int r2 = r7.getSpanStart(r4)
            int r1 = r7.getSpanEnd(r4)
            int r0 = r7.getSpanFlags(r4)
            r7.setSpan(r3, r2, r1, r0)
            r7.removeSpan(r4)
        L_0x01fe:
            int r9 = r9 + 1
            goto L_0x01d7
        L_0x0201:
            X.1VX r0 = r10.A0D
            X.C18270x1.A0q(r8, r0)
            r8.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    public ChangeEphemeralSettingActivity(int i) {
        this.A0M = false;
        C204019og.A00(this, 3);
    }

    public void onBackPressed() {
        A74();
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.A07(this.A0N);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A74();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A02);
    }

    public void onStart() {
        super.onStart();
        EphemeralDmKicBottomSheetDialog.A00(getSupportFragmentManager(), this.A09, (AnonymousClass4A7) null, this.A0I, 2);
    }

    public ChangeEphemeralSettingActivity() {
        this(0);
        this.A0N = new C203859oQ(this, 0);
    }
}
