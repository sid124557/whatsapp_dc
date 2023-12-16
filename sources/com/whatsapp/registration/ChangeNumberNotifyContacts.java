package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3A4;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C116985rC;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C22091Em;
import X.C44772Xk;
import X.C56962sq;
import X.C56982ss;
import X.C58422vE;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C73723fy;
import X.C88744aj;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeNumberNotifyContacts extends C89644eZ {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public ScrollView A08;
    public SwitchCompat A09;
    public C116985rC A0A;
    public TextEmojiLabel A0B;
    public C56962sq A0C;
    public C44772Xk A0D;
    public C64773Ex A0E;
    public C56982ss A0F;
    public List A0G;
    public boolean A0H;

    public final void A74() {
        this.A01 = 2;
        this.A03.setVisibility(0);
        this.A0G.clear();
        List list = this.A0G;
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        A76(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C95814uZ r1 = (C95814uZ) AnonymousClass3ZH.A06(it);
            if (r1 != null && this.A0F.A0L(r1)) {
                A0K.add(r1);
            }
        }
        list.addAll(A0K);
    }

    public void A5r() {
        if (!this.A0H) {
            this.A0H = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A0F = C64333Db.A39(A002);
            this.A0A = C88744aj.A00;
            this.A0E = C64333Db.A26(A002);
            this.A0C = (C56962sq) A002.A2b.get();
            this.A0D = (C44772Xk) A002.A6I.get();
        }
    }

    public final void A75() {
        RadioButton radioButton;
        int i = this.A01;
        boolean z = true;
        SwitchCompat switchCompat = this.A09;
        if (i == 0) {
            switchCompat.setChecked(false);
            this.A0B.setText(R.string.f11nameremoved);
            this.A03.setVisibility(8);
            radioButton = this.A06;
        } else {
            switchCompat.setChecked(true);
            int size = this.A0G.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, size, 0);
            Spanned A0B2 = AnonymousClass0x9.A0B(this.A00.A0L(objArr, R.plurals.f9nameremoved, (long) size));
            SpannableStringBuilder A002 = C18330xA.A00(A0B2);
            URLSpan[] uRLSpanArr = (URLSpan[]) A0B2.getSpans(0, A0B2.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("contacts-link".equals(uRLSpan.getURL())) {
                        int spanStart = A002.getSpanStart(uRLSpan);
                        int spanEnd = A002.getSpanEnd(uRLSpan);
                        int spanFlags = A002.getSpanFlags(uRLSpan);
                        A002.removeSpan(uRLSpan);
                        A002.setSpan(new C22091Em(this, this), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            AnonymousClass0x2.A14(this.A0D, this.A0B);
            AnonymousClass0x2.A12(this.A0B, this.A08);
            this.A0B.setText(A002);
            this.A03.setVisibility(0);
            this.A05.setChecked(AnonymousClass000.A1U(this.A01, 1));
            this.A06.setChecked(AnonymousClass000.A1U(this.A01, 2));
            radioButton = this.A07;
            if (this.A01 != 3) {
                z = false;
            }
        }
        radioButton.setChecked(z);
    }

    public final void A76(ArrayList arrayList) {
        C64773Ex r0 = this.A0E;
        r0.A05.A0U(arrayList, 1, false, false, true);
        if (!r0.A0H.A0Y(C58422vE.A02, 3764)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C627336j.A0L(C18310x6.A0R(it).A0H)) {
                    it.remove();
                }
            }
        }
        Set A052 = this.A0C.A05();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C73723fy.A0U(A052, AnonymousClass3ZH.A06(it2))) {
                it2.remove();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 != -1) {
                Log.i("ChangeNumberNotifyContacts/listmembersselector/permissions denied");
                this.A09.setChecked(false);
                return;
            }
            A74();
        } else if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        } else if (i2 == -1) {
            this.A0G = C627336j.A0B(UserJid.class, intent.getStringArrayListExtra("jids"));
            this.A01 = 3;
        }
        A75();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean isChecked = this.A09.isChecked();
        super.onRestoreInstanceState(bundle);
        this.A04.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3A4(this, isChecked));
    }

    public ChangeNumberNotifyContacts(int i) {
        this.A0H = false;
        AnonymousClass4HY.A00(this, 102);
    }

    public void A77(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        A76(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Jid A062 = AnonymousClass3ZH.A06(it);
            if (A062 != null) {
                list.add(A062);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass1Ha.A1y(this.A08.getViewTreeObserver(), this, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r0 = 2131887595(0x7f1205eb, float:1.9409802E38)
            X.0R8 r0 = X.AnonymousClass1Ha.A1l(r14, r0)
            X.C626936e.A06(r0)
            r4 = 1
            r0.A0N(r4)
            r0.A0O(r4)
            r0 = 2131624333(0x7f0e018d, float:1.8875843E38)
            r14.setContentView((int) r0)
            r0 = 2131428933(0x7f0b0645, float:1.8479524E38)
            android.view.View r0 = r14.findViewById(r0)
            r9 = 17
            X.AnonymousClass0x2.A0y(r0, r14, r9)
            android.content.Intent r5 = r14.getIntent()
            r0 = 2131428659(0x7f0b0533, float:1.8478969E38)
            android.widget.TextView r8 = X.C18310x6.A0L(r14, r0)
            X.33j r3 = r14.A00
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "+"
            r2.append(r1)
            java.lang.String r0 = "oldJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.String r2 = r3.A0I(r0)
            X.33j r3 = r14.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "newJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r11 = r3.A0I(r0)
            r1 = 2131887557(0x7f1205c5, float:1.9409724E38)
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.AnonymousClass001.A1I(r2, r11, r0)
            java.lang.String r0 = r14.getString(r1, r0)
            int r13 = r0.indexOf(r2)
            int r7 = r0.indexOf(r11)
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r0)
            r12 = 2130970568(0x7f0407c8, float:1.754985E38)
            r10 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r1 = X.C18300x5.A03(r14, r12, r10)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = r2.length()
            int r1 = r1 + r13
            r6.setSpan(r0, r13, r1, r9)
            java.lang.String r2 = "sans-serif-medium"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r2)
            r6.setSpan(r0, r13, r1, r9)
            int r1 = X.C18300x5.A03(r14, r12, r10)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = r11.length()
            int r1 = r1 + r7
            r6.setSpan(r0, r7, r1, r9)
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r2)
            r6.setSpan(r0, r7, r1, r9)
            r8.setText(r6)
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r14.A08 = r0
            r0 = 2131431897(0x7f0b11d9, float:1.8485536E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A04 = r0
            r0 = 2131431898(0x7f0b11da, float:1.8485538E38)
            android.view.View r2 = r14.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r2 = (androidx.appcompat.widget.SwitchCompat) r2
            r14.A09 = r2
            r1 = 5
            X.4Hw r0 = new X.4Hw
            r0.<init>(r14, r1)
            r2.setOnCheckedChangeListener(r0)
            android.view.View r1 = r14.A04
            r0 = 18
            X.AnonymousClass0x2.A0y(r1, r14, r0)
            r0 = 2131428680(0x7f0b0548, float:1.8479011E38)
            android.view.View r1 = r14.findViewById(r0)
            r14.A03 = r1
            r0 = 2131428653(0x7f0b052d, float:1.8478957E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A05 = r0
            r0 = 2131428652(0x7f0b052c, float:1.8478955E38)
            android.view.View r0 = r14.findViewById(r0)
            r2 = 19
            X.AnonymousClass0x2.A0y(r0, r14, r2)
            android.view.View r1 = r14.A03
            r0 = 2131428655(0x7f0b052f, float:1.847896E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A06 = r0
            r0 = 2131428654(0x7f0b052e, float:1.8478959E38)
            android.view.View r0 = r14.findViewById(r0)
            X.AnonymousClass0x2.A0y(r0, r14, r2)
            android.view.View r1 = r14.A03
            r0 = 2131428657(0x7f0b0531, float:1.8478965E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A07 = r0
            r0 = 2131428656(0x7f0b0530, float:1.8478963E38)
            android.view.View r0 = r14.findViewById(r0)
            X.AnonymousClass0x2.A0y(r0, r14, r2)
            r0 = 2131428669(0x7f0b053d, float:1.847899E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r14.A0B = r0
            r0 = 2131428112(0x7f0b0310, float:1.847786E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A02 = r0
            java.lang.String r0 = "mode"
            r2 = 3
            if (r15 == 0) goto L_0x01e7
            int r0 = r15.getInt(r0)
            r14.A01 = r0
            if (r0 != r2) goto L_0x0166
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r15.getStringArrayList(r0)
        L_0x0160:
            java.util.List r0 = X.C627336j.A0B(r1, r0)
            r14.A0G = r0
        L_0x0166:
            java.util.List r0 = r14.A0G
            if (r0 != 0) goto L_0x0170
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A0G = r0
        L_0x0170:
            X.2Xk r0 = r14.A0D
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x01a9
            r0 = 0
            r14.A01 = r0
            android.view.View r1 = r14.A03
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r14.A0G
            r0.clear()
        L_0x0187:
            r14.A75()
            int r0 = X.AnonymousClass1Ha.A1i(r14)
            r14.A00 = r0
            android.widget.ScrollView r0 = r14.A08
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 3
            X.4Hy r0 = new X.4Hy
            r0.<init>(r14, r1)
            r2.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r14.A08
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            X.AnonymousClass1Ha.A1y(r0, r14, r3)
            return
        L_0x01a9:
            int r0 = r14.A01
            if (r0 != r4) goto L_0x01ba
            r14.A01 = r4
            java.util.List r0 = r14.A0G
            r0.clear()
            java.util.List r0 = r14.A0G
            r14.A77(r0)
            goto L_0x0187
        L_0x01ba:
            if (r0 != r3) goto L_0x01c0
            r14.A74()
            goto L_0x0187
        L_0x01c0:
            if (r0 != r2) goto L_0x0187
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A77(r0)
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r0)
            java.util.List r0 = r14.A0G
            java.util.Iterator r1 = r0.iterator()
        L_0x01d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x01d3
            r1.remove()
            goto L_0x01d3
        L_0x01e7:
            int r0 = r5.getIntExtra(r0, r3)
            r14.A01 = r0
            if (r0 != r2) goto L_0x0166
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "preselectedJids"
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            goto L_0x0160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumberNotifyContacts.onCreate(android.os.Bundle):void");
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.change_number_all) {
            if (this.A01 != 1) {
                this.A01 = 1;
                this.A0G.clear();
                A77(this.A0G);
            } else {
                return;
            }
        } else if (id == R.id.change_number_chats) {
            if (this.A01 != 2) {
                A74();
            } else {
                return;
            }
        } else if (id == R.id.change_number_custom) {
            startActivityForResult(AnonymousClass0x9.A08(this, NotifyContactsSelector.class), 1);
            return;
        } else {
            return;
        }
        A75();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List list = this.A0G;
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        bundle.putStringArrayList("selectedJids", A0u);
        bundle.putInt("mode", this.A01);
    }

    public ChangeNumberNotifyContacts() {
        this(0);
    }
}
