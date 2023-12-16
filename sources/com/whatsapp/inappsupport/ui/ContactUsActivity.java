package com.whatsapp.inappsupport.ui;

import X.AnonymousClass002;
import X.AnonymousClass1XA;
import X.AnonymousClass4BX;
import X.AnonymousClass4FV;
import X.AnonymousClass4I1;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass5Q6;
import X.AnonymousClass5WY;
import X.AnonymousClass5Y5;
import X.AnonymousClass9U4;
import X.C106675Zy;
import X.C106715a2;
import X.C107695bk;
import X.C116985rC;
import X.C18270x1;
import X.C1907099n;
import X.C27991fJ;
import X.C28891hw;
import X.C33921tu;
import X.C33931tv;
import X.C40492Ga;
import X.C46012aw;
import X.C47362d8;
import X.C50472iE;
import X.C53202mi;
import X.C53602nM;
import X.C54322oX;
import X.C56492s4;
import X.C56512s6;
import X.C56982ss;
import X.C620733j;
import X.C622734j;
import X.C626936e;
import X.C631938h;
import X.C64333Db;
import X.C64373Df;
import X.C66433Lk;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88734ai;
import X.C89644eZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import java.util.ArrayList;

public class ContactUsActivity extends C89644eZ implements AnonymousClass4BX {
    public EditText A00;
    public TextView A01;
    public AppCompatCheckBox A02;
    public C116985rC A03;
    public AnonymousClass5WY A04;
    public C56492s4 A05;
    public C53602nM A06;
    public C56512s6 A07;
    public C620733j A08;
    public C56982ss A09;
    public C28891hw A0A;
    public AnonymousClass4FV A0B;
    public C631938h A0C;
    public C53202mi A0D;
    public C54322oX A0E;
    public C46012aw A0F;
    public C33931tv A0G;
    public AnonymousClass5Y5 A0H;
    public C27991fJ A0I;
    public C1907099n A0J;
    public AnonymousClass9U4 A0K;
    public C64373Df A0L;
    public C47362d8 A0M;
    public AnonymousClass5Q6 A0N;
    public C66433Lk A0O;
    public C622734j A0P;
    public C106675Zy A0Q;
    public C106715a2 A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public boolean A0V;

    public void A6O(int i) {
        if (i == 1) {
            finish();
        }
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C64333Db r2 = AnonymousClass4SG.A2X(this).A4Z;
            AnonymousClass4SG.A3X(r2, this, AnonymousClass4SG.A32(r2, this));
            AnonymousClass4SG.A3Y(r2, this, C86604Kt.A0V(r2));
            this.A0R = C107695bk.A5b(r2);
            this.A05 = (C56492s4) r2.AWW.get();
            this.A09 = C86614Ku.A0X(r2);
            this.A0B = C86604Kt.A0Z(r2);
            this.A0Q = C86624Kv.A0W(r2);
            this.A04 = (AnonymousClass5WY) r2.AUS.get();
            this.A0O = C86604Kt.A0e(r2);
            this.A08 = C86604Kt.A0W(r2);
            this.A0K = C86614Ku.A0f(r2);
            this.A0P = (C622734j) r2.A7k.get();
            this.A07 = (C56512s6) r2.AK3.get();
            this.A0D = C86634Kw.A0j(r2);
            this.A0M = (C47362d8) r2.A00.A2c.get();
            this.A06 = (C53602nM) r2.A00.A2g.get();
            this.A0J = C86614Ku.A0e(r2);
            this.A0A = C86614Ku.A0Y(r2);
            this.A0F = (C46012aw) r2.A00.A2M.get();
            this.A0L = r2.ArL();
            Object obj = r2.AHR.get();
            obj.getClass();
            this.A03 = new C88734ai(obj);
            this.A0E = (C54322oX) r2.AXY.get();
        }
    }

    public void A75(int i) {
        AnonymousClass1XA r1 = new AnonymousClass1XA();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A08.A07();
        this.A0B.BhB(r1);
    }

    public boolean A76() {
        C116985rC r1 = this.A03;
        if (!r1.A07() || !((C40492Ga) r1.A04()).A00.A0X(5626)) {
            return false;
        }
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent == null) {
                str = null;
            } else if (intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                this.A0H.A00();
                return;
            } else {
                str = intent.getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            this.A0H.A02(str);
        }
    }

    public void onBackPressed() {
        if (!TextUtils.isEmpty(C86604Kt.A0o(this.A00))) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(AnonymousClass4L0.A0U(), R.string.f11nameremoved);
            AnonymousClass4SG.A3h(A002, this, 34, R.string.f11nameremoved);
            AnonymousClass4I1 r1 = new AnonymousClass4I1(0);
            A002.A04 = R.string.f11nameremoved;
            A002.A07 = r1;
            C18270x1.A0t(A002.A00(), this);
        } else {
            super.onBackPressed();
        }
        AnonymousClass5Y5 r12 = this.A0H;
        C626936e.A06(r12.A02);
        r12.A02.A75(1);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0H.A04() || this.A0H.A03()) {
            return true;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.f11nameremoved)).setShowAsAction(0);
        return true;
    }

    public void onStop() {
        AnonymousClass5Y5 r2 = this.A0H;
        r2.A03 = null;
        r2.A09.A07(r2.A08);
        super.onStop();
    }

    public ContactUsActivity(int i) {
        this.A0V = false;
        C86604Kt.A1K(this, 50);
    }

    public final ArrayList A74(ArrayList arrayList) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelableArrayList((String) null, arrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(A082);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 450000) {
            return A74(AnonymousClass002.A0J(arrayList.subList(0, arrayList.size() / 2)));
        }
        return arrayList;
    }

    public void Ba0(boolean z) {
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0N.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            X.C107405bG.A05(r13)
            X.1VX r12 = r13.A0D
            X.3Wi r9 = r13.A05
            X.2ss r10 = r13.A09
            X.1hw r11 = r13.A0A
            X.5Y5 r8 = new X.5Y5
            r8.<init>(r9, r10, r11, r12, r13)
            r13.A0H = r8
            r0 = 2131624462(0x7f0e020e, float:1.8876104E38)
            r13.setContentView((int) r0)
            r4 = 2131888584(0x7f1209c8, float:1.9411807E38)
            java.lang.String r0 = r13.getString(r4)
            r13.setTitle(r0)
            androidx.appcompat.widget.Toolbar r3 = X.AnonymousClass4SG.A2T(r13)
            X.33j r2 = r13.A08
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            X.C18260x0.A0E(r13, r1, r3, r2, r0)
            X.5Y5 r0 = r13.A0H
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0040
            r4 = 2131895786(0x7f1225ea, float:1.9426415E38)
        L_0x0040:
            java.lang.String r0 = r13.getString(r4)
            r3.setTitle((java.lang.CharSequence) r0)
            r13.setSupportActionBar(r3)
            r1 = 31
            X.39q r0 = new X.39q
            r0.<init>((java.lang.Object) r13, (int) r1)
            r3.setNavigationOnClickListener(r0)
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            java.lang.String r0 = r4.getStringExtra(r0)
            r13.A0T = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid"
            android.os.Parcelable r0 = r4.getParcelableExtra(r0)
            X.1fJ r0 = (X.C27991fJ) r0
            r13.A0I = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            java.lang.String r0 = r4.getStringExtra(r0)
            r13.A0U = r0
            java.lang.String r0 = r13.A0T
            boolean r0 = X.AnonymousClass2BI.A00(r0)
            if (r0 == 0) goto L_0x02a3
            X.3Mh r0 = r13.A06
            X.1Ej r1 = X.C66663Mh.A25
            java.lang.String r0 = r0.A06(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02a3
            X.3Mh r0 = r13.A06
            java.lang.String r0 = r0.A06(r1)
        L_0x008e:
            r13.A0S = r0
            com.whatsapp.Me r0 = X.AnonymousClass4SG.A2b(r13)
            r5 = 1
            if (r0 == 0) goto L_0x009f
            X.2jE r0 = r13.A09
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00d2
        L_0x009f:
            X.2qk r2 = r13.A03
            java.lang.String r1 = "Unregistered client opening In App Support"
            r0 = 0
            r2.A0A(r1, r5, r0)
            java.lang.String r7 = r13.A0T
            java.lang.String r6 = r13.A0U
            java.lang.String r3 = r13.A0S
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.serverstatus"
            r2.putExtra(r0, r6)
            if (r3 == 0) goto L_0x00cb
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.emailAddress"
            r2.putExtra(r0, r3)
        L_0x00cb:
            r0 = 0
            r13.A6T(r2, r0)
            r13.finish()
        L_0x00d2:
            r0 = 2131429400(0x7f0b0818, float:1.8480472E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r13.A00 = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.description"
            java.lang.String r1 = r4.getStringExtra(r0)
            if (r1 == 0) goto L_0x00f4
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00f4
            android.widget.EditText r0 = r13.A00
            r0.setText(r1)
            X.5Y5 r0 = r13.A0H
            r0.A05 = r5
        L_0x00f4:
            r0 = 2131429401(0x7f0b0819, float:1.8480474E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r13, r0)
            r13.A01 = r0
            r0 = 2131429029(0x7f0b06a5, float:1.847972E38)
            android.view.View r2 = r13.findViewById(r0)
            android.widget.EditText r0 = r13.A00
            java.lang.String r0 = X.C18290x4.A0m(r0)
            int r0 = r0.length()
            r8 = 0
            boolean r0 = X.C18280x3.A1U(r0, r5)
            r2.setEnabled(r0)
            android.widget.EditText r1 = r13.A00
            r0 = 10
            X.AnonymousClass68H.A00(r1, r13, r0)
            r0 = 32
            X.C635439q.A00(r2, r13, r0)
            X.1VX r1 = r13.A0D
            r0 = 4150(0x1036, float:5.815E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x01e5
            boolean r0 = r13.A76()
            if (r0 != 0) goto L_0x01e5
            r0 = 2131433520(0x7f0b1830, float:1.8488828E38)
            android.view.View r0 = r13.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r13.A02 = r0
            r0.setChecked(r5)
            r0 = 2131433522(0x7f0b1832, float:1.8488832E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 33
            X.C635439q.A00(r1, r13, r0)
            r0 = 2131433521(0x7f0b1831, float:1.848883E38)
            com.whatsapp.TextEmojiLabel r7 = X.C86664Kz.A0z(r13, r0)
            X.1VX r0 = r13.A0D
            X.AnonymousClass0x2.A14(r0, r7)
            X.33i r0 = r13.A08
            X.AnonymousClass0x2.A12(r7, r0)
            r0 = 2131888228(0x7f120864, float:1.9411085E38)
        L_0x0160:
            java.lang.String r6 = r13.getString(r0)
            java.lang.String r3 = "learn-more"
            int r2 = X.C18290x4.A00(r13)
            r1 = 34
            X.3Zm r0 = new X.3Zm
            r0.<init>(r13, r1)
            android.text.SpannableStringBuilder r0 = X.C106625Zs.A01(r13, r0, r6, r3, r2)
            r7.setText(r0)
        L_0x0178:
            X.99n r0 = r13.A0J
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x02b8
            X.5Zy r1 = r13.A0Q
            java.lang.String r0 = "BR"
            boolean r0 = r1.A05(r0)
            if (r0 != 0) goto L_0x0194
            X.5Zy r1 = r13.A0Q
            java.lang.String r0 = "IN"
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x02b8
        L_0x0194:
            r0 = 2131432310(0x7f0b1376, float:1.8486374E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = 0
            r0.setVisibility(r8)
            r0 = 2131432311(0x7f0b1377, float:1.8486376E38)
            com.whatsapp.TextEmojiLabel r11 = X.C86664Kz.A0z(r13, r0)
            r0 = 2131888225(0x7f120861, float:1.941108E38)
            java.lang.String r0 = r13.getString(r0)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
            android.text.SpannableStringBuilder r10 = X.C18330xA.A00(r0)
            android.text.style.URLSpan[] r9 = X.C18310x6.A1Z(r10)
            if (r9 == 0) goto L_0x02ab
            int r8 = r9.length
        L_0x01bc:
            if (r12 >= r8) goto L_0x02ab
            r7 = r9[r12]
            int r6 = r10.getSpanStart(r7)
            int r3 = r10.getSpanEnd(r7)
            int r2 = r10.getSpanFlags(r7)
            X.67s r0 = new X.67s
            r0.<init>(r13, r13, r13, r5)
            r10.setSpan(r0, r6, r3, r2)
            r1 = 2132083101(0x7f15019d, float:1.9806335E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r13, r1)
            r10.setSpan(r0, r6, r3, r2)
            r10.removeSpan(r7)
            int r12 = r12 + 1
            goto L_0x01bc
        L_0x01e5:
            r0 = 2131433522(0x7f0b1832, float:1.8488832E38)
            X.C86604Kt.A1L(r13, r0)
            boolean r1 = r13.A76()
            r0 = 2131429265(0x7f0b0791, float:1.8480198E38)
            if (r1 == 0) goto L_0x028d
            android.widget.TextView r2 = X.C18310x6.A0L(r13, r0)
            X.5Y5 r0 = r13.A0H
            boolean r0 = r0.A03()
            int r0 = X.C86614Ku.A01(r0)
            r2.setVisibility(r0)
            X.5rC r1 = r13.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0216
            r1.A04()
            r0 = 2131895785(0x7f1225e9, float:1.9426413E38)
            r2.setText(r0)
        L_0x0216:
            r0 = 2131429025(0x7f0b06a1, float:1.8479711E38)
            X.C86604Kt.A1L(r13, r0)
            r0 = 2131433206(0x7f0b16f6, float:1.8488191E38)
            android.view.View r6 = r13.findViewById(r0)
            r7 = 0
            r6.setVisibility(r8)
            r0 = 2131429028(0x7f0b06a4, float:1.8479717E38)
            android.view.View r3 = r13.findViewById(r0)
            android.view.ViewTreeObserver r2 = r6.getViewTreeObserver()
            r1 = 2
            X.6AF r0 = new X.6AF
            r0.<init>(r6, r3, r13, r1)
            r2.addOnPreDrawListener(r0)
            r0 = 2131429266(0x7f0b0792, float:1.84802E38)
            com.whatsapp.TextEmojiLabel r9 = X.C86664Kz.A0z(r13, r0)
            r9.setVisibility(r8)
            X.1VX r0 = r13.A0D
            X.AnonymousClass0x2.A14(r0, r9)
            X.33i r0 = r13.A08
            X.AnonymousClass0x2.A12(r9, r0)
            r0 = 2131888221(0x7f12085d, float:1.9411071E38)
            java.lang.String r6 = r13.getString(r0)
            java.lang.String r2 = "learn-more"
            int r1 = X.C18290x4.A00(r13)
            r3 = 34
            X.3Zm r0 = new X.3Zm
            r0.<init>(r13, r3)
            android.text.SpannableStringBuilder r0 = X.C106625Zs.A01(r13, r0, r6, r2, r1)
            r9.setText(r0)
            r0 = 2131433207(0x7f0b16f7, float:1.8488193E38)
            android.view.View r2 = r13.findViewById(r0)
            android.widget.EditText r0 = r13.A00
            java.lang.String r0 = X.C18290x4.A0m(r0)
            int r0 = r0.length()
            if (r0 < r5) goto L_0x027e
            r7 = 1
        L_0x027e:
            r2.setEnabled(r7)
            android.widget.EditText r1 = r13.A00
            r0 = 11
            X.AnonymousClass68H.A00(r1, r13, r0)
            X.C635439q.A00(r2, r13, r3)
            goto L_0x0178
        L_0x028d:
            com.whatsapp.TextEmojiLabel r7 = X.C86664Kz.A0z(r13, r0)
            r7.setVisibility(r8)
            X.1VX r0 = r13.A0D
            X.AnonymousClass0x2.A14(r0, r7)
            X.33i r0 = r13.A08
            X.AnonymousClass0x2.A12(r7, r0)
            r0 = 2131888221(0x7f12085d, float:1.9411071E38)
            goto L_0x0160
        L_0x02a3:
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress"
            java.lang.String r0 = r4.getStringExtra(r0)
            goto L_0x008e
        L_0x02ab:
            X.1VX r0 = r13.A0D
            X.AnonymousClass0x2.A14(r0, r11)
            X.33i r0 = r13.A08
            X.AnonymousClass0x2.A12(r11, r0)
            r11.setText(r10)
        L_0x02b8:
            r0 = 2131429028(0x7f0b06a4, float:1.8479717E38)
            android.view.View r3 = r13.findViewById(r0)
            r0 = 2131429025(0x7f0b06a1, float:1.8479711E38)
            android.view.View r2 = r13.findViewById(r0)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.6AF r0 = new X.6AF
            r0.<init>(r2, r3, r13, r5)
            r1.addOnPreDrawListener(r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            android.os.Parcelable r0 = r4.getParcelableExtra(r0)
            X.38h r0 = (X.C631938h) r0
            r13.A0C = r0
            int r1 = X.AnonymousClass1Ha.A1i(r13)
            X.5Q6 r0 = new X.5Q6
            r0.<init>(r3, r2, r1)
            r13.A0N = r0
            r0.A00()
            X.5Y5 r1 = r13.A0H
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r1.A02
            X.C626936e.A06(r0)
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x02ff
            com.whatsapp.inappsupport.ui.ContactUsActivity r1 = r1.A02
            r0 = 2131433523(0x7f0b1833, float:1.8488834E38)
            X.C86604Kt.A1L(r1, r0)
        L_0x02ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0H.A02 = null;
        C33921tu r1 = this.A0M.A01;
        if (r1 != null) {
            r1.A0D(false);
        }
        C33931tv r12 = this.A0G;
        if (r12 != null) {
            r12.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            AnonymousClass5Y5 r1 = this.A0H;
            C626936e.A06(r1.A02);
            r1.A02.A75(1);
            r1.A02.finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            this.A0H.A01(2);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }

    public ContactUsActivity() {
        this(0);
    }
}
