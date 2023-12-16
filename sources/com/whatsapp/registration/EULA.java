package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass1Hf;
import X.AnonymousClass2QW;
import X.AnonymousClass317;
import X.AnonymousClass31M;
import X.AnonymousClass33X;
import X.AnonymousClass34K;
import X.AnonymousClass36l;
import X.AnonymousClass3DP;
import X.AnonymousClass4OR;
import X.AnonymousClass4SG;
import X.AnonymousClass54E;
import X.AnonymousClass5I5;
import X.AnonymousClass5J0;
import X.AnonymousClass5QI;
import X.AnonymousClass5XU;
import X.AnonymousClass5YW;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass65I;
import X.AnonymousClass68W;
import X.AnonymousClass69N;
import X.AnonymousClass6BG;
import X.AnonymousClass758;
import X.AnonymousClass803;
import X.C101825Gg;
import X.C103365Mp;
import X.C105505Vg;
import X.C106975aT;
import X.C107335b8;
import X.C107695bk;
import X.C110175fo;
import X.C116985rC;
import X.C1237569q;
import X.C154327cz;
import X.C155437es;
import X.C160257nK;
import X.C162457s7;
import X.C182358oH;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C186568vZ;
import X.C187958y5;
import X.C46362bV;
import X.C48422es;
import X.C50152hi;
import X.C53282mq;
import X.C53652nR;
import X.C55092pm;
import X.C56502s5;
import X.C59742xP;
import X.C614930z;
import X.C619933b;
import X.C620733j;
import X.C621433s;
import X.C626936e;
import X.C627236i;
import X.C64333Db;
import X.C66523Lt;
import X.C72343dZ;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import X.C989653x;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class EULA extends C89644eZ implements AnonymousClass65I {
    public int A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public NestedScrollView A03;
    public C116985rC A04;
    public C116985rC A05;
    public C116985rC A06;
    public C116985rC A07;
    public AnonymousClass5XU A08;
    public AnonymousClass3DP A09;
    public C614930z A0A;
    public C46362bV A0B;
    public AnonymousClass5ZR A0C;
    public C620733j A0D;
    public AnonymousClass803 A0E;
    public C106975aT A0F;
    public C53652nR A0G;
    public C59742xP A0H;
    public AnonymousClass5QI A0I;
    public C66523Lt A0J;
    public C619933b A0K;
    public AnonymousClass33X A0L;
    public C155437es A0M;
    public C105505Vg A0N;
    public C50152hi A0O;
    public AnonymousClass317 A0P;
    public C55092pm A0Q;
    public AnonymousClass2QW A0R;
    public C53282mq A0S;
    public C101825Gg A0T;
    public C56502s5 A0U;
    public C187958y5 A0V;
    public AnonymousClass5I5 A0W;
    public C160257nK A0X;
    public C183538qC A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final C182358oH A0c;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0b = false;
        this.A0a = this.A0A.A0B(false);
        this.A0S.A01();
        if (this.A06.A07()) {
            AnonymousClass758.A00(getApplicationContext(), this.A09);
            this.A06.A04();
            throw AnonymousClass001.A0g("getSmbEulaLayoutId");
        }
        if (AnonymousClass4SG.A2f(this) != null) {
            AnonymousClass5J0 A2f = AnonymousClass4SG.A2f(this);
            C626936e.A06(A2f);
            if (A2f.A01 && AnonymousClass31M.A01(this, this.A0G)) {
                AnonymousClass5J0 A2f2 = AnonymousClass4SG.A2f(this);
                C626936e.A06(A2f2);
                C48422es r2 = A2f2.A02;
                if (r2.A00) {
                    r2.A01.markerDrop(551497305);
                    r2.A00 = false;
                }
                r2.A00 = true;
                C186568vZ r22 = r2.A01;
                r22.BKn(551497305, false);
                r22.markerAnnotate(551497305, "is_debug_build", false);
                this.A0P.A0B(1, true);
                C103365Mp.A00(this.A0Y);
                Intent A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity");
                startActivity(A072);
                finish();
                return;
            }
        }
        C620733j r0 = this.A0D;
        r0.A0A.add(this.A0c);
        if (AnonymousClass1Hf.A27(this).getBoolean("is_ls_shown_during_reg", false) || this.A0a) {
            setContentView((int) R.layout.f8nameremoved);
            findViewById(R.id.eula_layout).startAnimation(AnimationUtils.loadAnimation(getBaseContext(), R.anim.f0nameremoved));
            A74();
            AnonymousClass36l.A0K(this.A00, this, this.A0D, R.id.eula_toolbar, false, false, this.A0a);
            A75();
        } else {
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass5QI r23 = this.A0I;
            r23.A03 = true;
            r23.A00 = System.currentTimeMillis();
            ImageView A0M2 = C86654Ky.A0M(this, R.id.next_button);
            C18270x1.A0d(this, A0M2, this.A0D, R.drawable.ic_fab_next);
            C989653x.A00(A0M2, this, 26);
            BottomSheetListView bottomSheetListView = (BottomSheetListView) findViewById(R.id.language_selector_listview);
            C620733j r3 = this.A0D;
            bottomSheetListView.setAdapter(new AnonymousClass4OR(this, r3, AnonymousClass5YW.A01(this.A01, this.A08, r3), AnonymousClass5YW.A02()));
            bottomSheetListView.setOnItemClickListener(new C1237569q(bottomSheetListView, 3, this));
            bottomSheetListView.setOnScrollListener(new C110175fo(bottomSheetListView, this));
            ImageView A0M3 = C86654Ky.A0M(this, R.id.eula_logo);
            LayerDrawable layerDrawable = (LayerDrawable) A0M3.getDrawable();
            layerDrawable.setDrawableByLayerId(R.id.logo, C107335b8.A09(getResources(), layerDrawable.findDrawableByLayerId(R.id.logo), AnonymousClass34K.A01(this, R.attr.f3nameremoved)));
            A0M3.setImageDrawable(layerDrawable);
        }
        boolean z = this.A0a;
        if (z) {
            AnonymousClass36l.A0K(this.A00, this, this.A0D, R.id.eula_toolbar, false, false, z);
            C18310x6.A0L(this, R.id.title).setText(R.string.f11nameremoved);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        r2.A0V(new X.C1235568w(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ca, code lost:
        X.C1235268t.A04(r2, r6, r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
            r6 = this;
            r4 = 1
            if (r7 == r4) goto L_0x00e4
            r0 = 2
            if (r7 == r0) goto L_0x00ce
            r5 = 0
            switch(r7) {
                case 5: goto L_0x000f;
                case 6: goto L_0x0065;
                case 7: goto L_0x0088;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00f4;
                default: goto L_0x000a;
            }
        L_0x000a:
            android.app.Dialog r0 = super.onCreateDialog(r7)
            return r0
        L_0x000f:
            X.5I5 r0 = r6.A0W
            if (r0 == 0) goto L_0x0045
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            X.5I5 r0 = r6.A0W
            java.util.Set r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.5Pm r1 = (X.C104065Pm) r1
            r0 = 9
            r3.append(r0)
            java.lang.CharSequence r0 = r1.A00
            r3.append(r0)
            r0 = 10
            r3.append(r0)
            goto L_0x0029
        L_0x0045:
            java.lang.String r1 = ""
            goto L_0x0054
        L_0x0048:
            int r0 = r3.length()
            int r0 = r0 - r4
            r3.setLength(r0)
            java.lang.String r1 = r3.toString()
        L_0x0054:
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131894313(0x7f122029, float:1.9423427E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r6, r1, r4, r0)
            r2.A0g(r0)
            r1 = 10
            goto L_0x009f
        L_0x0065:
            r6.A00 = r4
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            r2.A0U(r0)
            r0 = 2131894312(0x7f122028, float:1.9423425E38)
            r2.A0T(r0)
            r2.A0i(r5)
            r1 = 2131888637(0x7f1209fd, float:1.9411915E38)
            r0 = 82
            X.C1235268t.A03(r2, r6, r0, r1)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 83
            goto L_0x00ca
        L_0x0088:
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r3 = 2131888418(0x7f120922, float:1.941147E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r0 = r6.getString(r0)
            r1[r5] = r0
            X.C86624Kv.A0i(r6, r2, r1, r3)
            r1 = 11
        L_0x009f:
            X.68w r0 = new X.68w
            r0.<init>(r6, r1)
            r2.A0V(r0)
            goto L_0x010c
        L_0x00a8:
            r6.A00 = r0
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            r2.A0U(r0)
            r0 = 2131888417(0x7f120921, float:1.9411469E38)
            r2.A0T(r0)
            r2.A0i(r5)
            r1 = 2131888637(0x7f1209fd, float:1.9411915E38)
            r0 = 84
            X.C1235268t.A03(r2, r6, r0, r1)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 85
        L_0x00ca:
            X.C1235268t.A04(r2, r6, r0, r1)
            goto L_0x010c
        L_0x00ce:
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            r2.A0U(r0)
            r0 = 2131892995(0x7f121b03, float:1.9420754E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 81
            goto L_0x0109
        L_0x00e4:
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131892904(0x7f121aa8, float:1.942057E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 80
            goto L_0x0109
        L_0x00f4:
            X.0zH r2 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            r2.A0U(r0)
            r0 = 2131887799(0x7f1206b7, float:1.9410215E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 79
        L_0x0109:
            X.C1235268t.A03(r2, r6, r0, r1)
        L_0x010c:
            X.043 r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.onCreateDialog(int):android.app.Dialog");
    }

    public void A5r() {
        if (!this.A0Z) {
            this.A0Z = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r2, this, AnonymousClass4SG.A2t(r3, r2, this));
            C88744aj r1 = C88744aj.A00;
            this.A05 = r1;
            this.A0M = (C155437es) r2.A42.get();
            this.A0N = (C105505Vg) r2.A43.get();
            this.A08 = AnonymousClass4SG.A2d(r3);
            this.A06 = r1;
            this.A07 = r1;
            this.A0X = (C160257nK) r3.AYO.get();
            this.A0U = AnonymousClass4SG.A2q(r2);
            this.A04 = C86634Kw.A0S(r3);
            this.A0G = (C53652nR) r3.A02.get();
            this.A0J = AnonymousClass4SG.A2n(r3);
            this.A0V = C86614Ku.A0o(r3);
            this.A0D = C64333Db.A2t(r3);
            this.A0A = C86614Ku.A0O(r3);
            this.A0L = (AnonymousClass33X) r3.AZa.get();
            this.A09 = (AnonymousClass3DP) r3.Aak.get();
            this.A0O = A2X.AD3();
            this.A0K = C86624Kv.A0V(r3);
            this.A0P = C86614Ku.A0i(r3);
            this.A0C = C64333Db.A2r(r3);
            this.A0H = (C59742xP) r3.A8b.get();
            this.A0F = new C106975aT();
            this.A0Q = AnonymousClass4SG.A2o(r3);
            this.A0R = (AnonymousClass2QW) r3.A8H.get();
            this.A0T = new C101825Gg(r3.AqT());
            this.A0E = A2X.ACM();
            this.A0B = (C46362bV) r3.A5o.get();
            this.A0S = (C53282mq) r3.AI9.get();
            this.A0I = (AnonymousClass5QI) r2.A6r.get();
            this.A0Y = C72343dZ.A00(r2.ACF);
        }
    }

    public final boolean A76(String str) {
        List list = C155437es.A01;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m == null) {
                if (str == null) {
                }
            } else if (A0m.equalsIgnoreCase(str)) {
            }
            String A072 = this.A0D.A07();
            C162457s7.A0J(A072, 0);
            List list2 = C105505Vg.A00;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String A0m2 = AnonymousClass001.A0m(it2);
                if (A0m2 != null && A0m2.equalsIgnoreCase(A072)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public AnonymousClass4OR B4A() {
        C620733j r3 = this.A0D;
        return new AnonymousClass4OR(this, r3, AnonymousClass5YW.A01(this.A01, this.A08, r3), AnonymousClass5YW.A02());
    }

    public void onBackPressed() {
        if (this.A0a) {
            Log.i("EULA/onBackPressed/is adding new account");
            AnonymousClass36l.A0D(this, this.A0A, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        this.A0O.A00();
        C620733j r0 = this.A0D;
        r0.A0A.remove(this.A0c);
        super.onDestroy();
    }

    public void onPause() {
        C106975aT r2 = this.A0F;
        AnonymousClass803 r1 = this.A0E;
        C162457s7.A0J(r1, 0);
        r2.A01.remove(r1);
        this.A0F.A00();
        super.onPause();
    }

    public EULA(int i) {
        this.A0Z = false;
        AnonymousClass68W.A00(this, 81);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74() {
        /*
            r20 = this;
            r0 = 2131429894(0x7f0b0a06, float:1.8481474E38)
            r10 = r20
            android.view.View r9 = r10.findViewById(r0)
            r0 = 2131429897(0x7f0b0a09, float:1.848148E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r10.A03 = r0
            X.33p r0 = r10.A09
            r0.A0j()
            X.2zf r0 = r10.A07
            r4 = 10000000(0x989680, double:4.9406565E-317)
            long r1 = r0.A03()
            r3 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            android.content.Intent r1 = X.C627736r.A0D(r10, r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r10.startActivity(r0)
        L_0x0034:
            int r0 = X.AnonymousClass4SG.A2K(r10)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EULA/create/wrong-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass4SG.A36(r10)
            return
        L_0x0043:
            X.4FS r1 = r10.A04
            X.54R r0 = new X.54R
            r0.<init>(r10)
            X.AnonymousClass0x7.A1B(r0, r1)
            X.33i r0 = r10.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x01e4
            java.lang.String r5 = r0.getSimCountryIso()
        L_0x0059:
            java.lang.String r0 = "gb"
            boolean r2 = r0.equalsIgnoreCase(r5)
            java.util.List r0 = X.C155437es.A00
            boolean r0 = X.C73723fy.A0U(r0, r5)
            if (r0 != 0) goto L_0x006a
            r8 = 0
            if (r2 == 0) goto L_0x006b
        L_0x006a:
            r8 = 1
        L_0x006b:
            boolean r7 = r10.A76(r5)
            r0 = 2131889145(0x7f120bf9, float:1.9412945E38)
            java.lang.String r4 = r10.getString(r0)
            r1 = 1
            if (r8 == 0) goto L_0x01d0
            r0 = 2131889148(0x7f120bfc, float:1.9412951E38)
        L_0x007c:
            java.lang.String r18 = X.AnonymousClass0x2.A0X(r10, r4, r1, r0)
        L_0x0080:
            r0 = 2131889146(0x7f120bfa, float:1.9412947E38)
            java.lang.String r16 = r10.getString(r0)
            r0 = 2131429900(0x7f0b0a0c, float:1.8481486E38)
            android.view.View r4 = X.C005205m.A00(r10, r0)
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            r0 = 2131429896(0x7f0b0a08, float:1.8481478E38)
            com.whatsapp.TextEmojiLabel r13 = X.C86664Kz.A0z(r10, r0)
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            X.5X8 r1 = r10.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/privacy-policy"
            android.net.Uri r1 = r1.A01(r0, r2)
            java.lang.String r0 = "privacy-policy"
            r6.put(r0, r1)
            X.5X8 r1 = r10.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/terms-of-service"
            android.net.Uri r1 = r1.A01(r0, r2)
            java.lang.String r0 = "terms-and-privacy-policy"
            r6.put(r0, r1)
            if (r7 == 0) goto L_0x00d9
            if (r13 == 0) goto L_0x00d9
            X.5X8 r1 = r10.A03
            java.lang.String r0 = "https://faq.whatsapp.com/general/access-manage-and-delete-your-information"
            android.net.Uri r1 = r1.A01(r0, r3)
            java.lang.String r0 = "manage-data"
            r6.put(r0, r1)
            X.1VX r15 = r10.A0D
            X.3Wi r12 = r10.A05
            X.5hX r11 = r10.A00
            X.33i r14 = r10.A08
            r17 = r6
            X.C107635bd.A0G(r10, r11, r12, r13, r14, r15, r16, r17)
            r13.setVisibility(r3)
            r13.setHighlightColor(r3)
        L_0x00d9:
            if (r8 == 0) goto L_0x00e8
            X.5X8 r1 = r10.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/information-for-people-who-dont-use-whatsapp"
            android.net.Uri r1 = r1.A00(r0)
            java.lang.String r0 = "learn-more"
            r6.put(r0, r1)
        L_0x00e8:
            X.1VX r5 = r10.A0D
            X.3Wi r2 = r10.A05
            X.5hX r1 = r10.A00
            X.33i r0 = r10.A08
            r12 = r10
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r0
            r17 = r5
            r19 = r6
            X.C107635bd.A0G(r12, r13, r14, r15, r16, r17, r18, r19)
            r4.setHighlightColor(r3)
            if (r8 == 0) goto L_0x0110
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168005(0x7f070b05, float:1.79503E38)
            float r0 = r1.getDimension(r0)
            r4.setTextSize(r3, r0)
        L_0x0110:
            if (r7 == 0) goto L_0x0119
            X.4FS r1 = r10.A04
            r0 = 22
            X.C86624Kv.A1L(r1, r10, r0)
        L_0x0119:
            android.view.Display r0 = X.C86664Kz.A0f(r10)
            int r2 = r0.getHeight()
            int r1 = X.C86604Kt.A02(r10)
            r0 = 1
            if (r1 != r0) goto L_0x014e
            r0 = 2131429895(0x7f0b0a07, float:1.8481476E38)
            android.view.View r6 = r10.findViewById(r0)
            int r5 = r2 / 10
            if (r6 == 0) goto L_0x0143
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass001.A0T(r6)
            int r2 = r4.leftMargin
            int r1 = r4.rightMargin
            int r0 = r4.bottomMargin
            r4.setMargins(r2, r5, r1, r0)
            r6.setLayoutParams(r4)
        L_0x0143:
            androidx.core.widget.NestedScrollView r1 = r10.A03
            if (r1 == 0) goto L_0x014e
            X.5gI r0 = new X.5gI
            r0.<init>(r10)
            r1.A0E = r0
        L_0x014e:
            androidx.core.widget.NestedScrollView r0 = r10.A03
            if (r0 == 0) goto L_0x015b
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 30
            X.AnonymousClass6BG.A00(r1, r10, r0)
        L_0x015b:
            r0 = 2131429892(0x7f0b0a04, float:1.848147E38)
            android.view.View r1 = X.C005205m.A00(r10, r0)
            r0 = 21
            X.AnonymousClass0x2.A0y(r1, r10, r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "show_registration_first_dlg"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0177
            r0 = 1
            X.C621433s.A01(r10, r0)
        L_0x0177:
            X.317 r1 = r10.A0P
            r0 = 1
            r1.A0B(r3, r0)
            X.5XU r0 = r10.A08
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = "EULA/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Lt r1 = r10.A0J
            X.33b r0 = r10.A0K
            X.C621533t.A02(r10, r1, r0)
        L_0x0191:
            X.33p r2 = r10.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-shared-prefs/setenter-is-send "
            X.C18260x0.A1D(r0, r1, r3)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r2)
            java.lang.String r0 = "input_enter_send"
            X.C18270x1.A0l(r1, r0, r3)
            r0 = 2131429895(0x7f0b0a07, float:1.8481476E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A01 = r0
            if (r9 == 0) goto L_0x01b9
            android.view.ViewTreeObserver r1 = r9.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r10.A02
            r1.addOnGlobalLayoutListener(r0)
        L_0x01b9:
            X.3DP r0 = r10.A09
            r0.A02()
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r10)
            java.lang.String r4 = "is_eula_loaded_once"
            boolean r0 = r0.getBoolean(r4, r3)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = "EULA/retrieveBackupToken/EULA was already loaded before, skip retrieving token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01d0:
            boolean r0 = r10.A76(r5)
            if (r0 == 0) goto L_0x01df
            r0 = 2131889149(0x7f120bfd, float:1.9412953E38)
            java.lang.String r18 = r10.getString(r0)
            goto L_0x0080
        L_0x01df:
            r0 = 2131889147(0x7f120bfb, float:1.941295E38)
            goto L_0x007c
        L_0x01e4:
            r5 = 0
            goto L_0x0059
        L_0x01e7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x020d
            int r0 = X.C159787mS.A00(r10)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x020d
            X.6Qf r2 = new X.6Qf
            r2.<init>((android.app.Activity) r10)
        L_0x01fc:
            X.4FS r1 = r10.A04
            X.3a1 r0 = new X.3a1
            r0.<init>(r10, r3, r2)
            r1.BkM(r0)
            X.33p r1 = r10.A09
            r0 = 1
            X.C18270x1.A0v(r1, r4, r0)
            return
        L_0x020d:
            r2 = 0
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.A74():void");
    }

    public final void A75() {
        TextView A0L2 = C18310x6.A0L(this, R.id.language_picker);
        A0L2.setText(AnonymousClass5YW.A00(C154327cz.A01(Locale.getDefault())));
        A0L2.setOnClickListener(new AnonymousClass54E(A0L2, 22, this));
        C107335b8.A0F(A0L2, getResources().getColor(AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0Q.A02("eula");
            this.A0O.A01(this, this.A0Q, "eula");
            return true;
        } else if (itemId == 1) {
            C627236i.A0A(this);
            return true;
        } else if (itemId != 2) {
            return false;
        } else {
            AnonymousClass4SG.A2P(this).putBoolean("is_ls_shown_during_reg", false).commit();
            recreate();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        int i = this.A00;
        int i2 = 6;
        if (i != 1) {
            if (i == 2) {
                i2 = 8;
            }
            this.A0F.A02(this.A0E);
            this.A0F.A01(this);
        }
        C621433s.A01(this, i2);
        this.A0F.A02(this.A0E);
        this.A0F.A01(this);
    }

    public EULA() {
        this(0);
        this.A00 = 0;
        this.A01 = null;
        this.A0a = false;
        this.A02 = new AnonymousClass6BG((Object) this, 29);
        this.A0c = new AnonymousClass69N(this, 1);
    }
}
