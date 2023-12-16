package com.whatsapp.dmsetting;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass31C;
import X.AnonymousClass34K;
import X.AnonymousClass352;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import X.AnonymousClass5QF;
import X.AnonymousClass5Yj;
import X.AnonymousClass9YE;
import X.C005205m;
import X.C103895Ov;
import X.C106715a2;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C1899593h;
import X.C198779fT;
import X.C198789fU;
import X.C199929hV;
import X.C204019og;
import X.C204249p3;
import X.C204369pF;
import X.C40532Gt;
import X.C46982cW;
import X.C53602nM;
import X.C56112rR;
import X.C57162tC;
import X.C58152un;
import X.C64333Db;
import X.C66433Lk;
import X.C68233Sj;
import X.C86604Kt;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

public class ChangeDMSettingActivity extends C89644eZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public C53602nM A06;
    public C57162tC A07;
    public C46982cW A08;
    public C56112rR A09;
    public AnonymousClass5QF A0A;
    public C103895Ov A0B;
    public C40532Gt A0C;
    public C66433Lk A0D;
    public C106715a2 A0E;
    public boolean A0F;

    public final void A74(int i) {
        int i2 = i;
        if (i2 == -1) {
            this.A0A.A00(3, this.A01);
        } else if (i2 != this.A09.A05().intValue()) {
            Intent A072 = C18320x8.A07();
            A072.putExtra("duration", i2);
            setResult(-1, A072);
            C46982cW r4 = this.A08;
            int i3 = this.A01;
            if (!r4.A02.A0F()) {
                r4.A01.A0H(R.string.f11nameremoved, 0);
                r4.A00.A0H(r4.A04.A05());
                return;
            }
            AnonymousClass31C r9 = r4.A06;
            String A032 = r9.A03();
            AnonymousClass36K A0I = AnonymousClass36K.A0I("disappearing_mode", new AnonymousClass39V[]{new AnonymousClass39V("duration", (long) i2)});
            AnonymousClass39V[] r1 = new AnonymousClass39V[4];
            r1[0] = AnonymousClass39V.A00();
            AnonymousClass39V.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r1);
            r9.A0K(new C68233Sj(r4, i2, i3), AnonymousClass36K.A0E(A0I, "xmlns", "disappearing_mode", r1), A032, 277, 20000);
        }
    }

    public void A5r() {
        if (!this.A0F) {
            this.A0F = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A0E = C1899593h.A0V(r1);
            this.A0D = C86604Kt.A0e(r2);
            this.A0A = A0I.ACN();
            this.A0B = A0I.ACO();
            this.A08 = (C46982cW) r2.A8M.get();
            this.A06 = (C53602nM) r1.A2g.get();
            this.A07 = (C57162tC) r2.AaV.get();
            this.A09 = (C56112rR) r2.A8O.get();
            this.A0C = (C40532Gt) r2.AIJ.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r2 = r19
            r6 = r20
            r1 = r21
            r5 = r22
            super.onActivityResult(r6, r1, r5)
            if (r22 == 0) goto L_0x009f
            java.lang.String r3 = "all_contacts_count"
            java.lang.String r0 = "jids"
            r9 = 1
            r4 = -1
            r12 = 0
            if (r6 != r9) goto L_0x00a0
            if (r1 != r4) goto L_0x00a0
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            java.util.List r14 = X.C627336j.A0B(r1, r0)
            int r0 = r5.getIntExtra(r3, r12)
            r2.A00 = r0
            X.2rR r0 = r2.A09
            X.2YA r0 = r0.A05
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r15 = r1.getInt(r0, r12)
            X.5Ov r13 = r2.A0B
            int r3 = r2.A02
            int r1 = r2.A00
            int r0 = r2.A01
            r16 = r3
            r17 = r1
            r18 = r0
            r13.A00(r14, r15, r16, r17, r18)
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x009f
            android.view.View r8 = r2.A00
            if (r8 == 0) goto L_0x009f
            X.33j r10 = r2.A00
            r7 = 2131755072(0x7f100040, float:1.9141013E38)
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = X.AnonymousClass002.A0M()
            java.lang.String r11 = ""
            r3 = 86400(0x15180, float:1.21072E-40)
            r5 = 2131889028(0x7f120b84, float:1.9412708E38)
            if (r15 == r3) goto L_0x0079
            r3 = 604800(0x93a80, float:8.47505E-40)
            r5 = 2131889053(0x7f120b9d, float:1.9412759E38)
            if (r15 == r3) goto L_0x0079
            r3 = 7776000(0x76a700, float:1.0896497E-38)
            if (r15 != r3) goto L_0x007d
            r5 = 2131889031(0x7f120b87, float:1.9412714E38)
        L_0x0079:
            java.lang.String r11 = r2.getString(r5)
        L_0x007d:
            r6[r12] = r11
            int r2 = r14.size()
            X.AnonymousClass000.A1P(r6, r2, r9)
            java.lang.String r0 = r10.A0L(r6, r7, r0)
            X.4ab r2 = X.C88694ab.A01(r8, r0, r4)
            X.6FH r1 = r2.A0J
            r0 = 2131433805(0x7f0b194d, float:1.8489406E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r1, r0)
            if (r0 == 0) goto L_0x009c
            r0.setSingleLine(r12)
        L_0x009c:
            r2.A05()
        L_0x009f:
            return
        L_0x00a0:
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            java.util.List r9 = X.C627336j.A0B(r1, r0)
            int r0 = r5.getIntExtra(r3, r12)
            r2.A00 = r0
            int r11 = r2.A03
            if (r11 != r4) goto L_0x00be
            X.2rR r0 = r2.A09
            java.lang.Integer r0 = r0.A05()
            int r11 = r0.intValue()
        L_0x00be:
            X.5QF r8 = r2.A0A
            r10 = 2
            int r13 = r2.A00
            int r14 = r2.A01
            r8.A01(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dmsetting.ChangeDMSettingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        A74(this.A03);
        super.onBackPressed();
    }

    public ChangeDMSettingActivity(int i) {
        this.A0F = false;
        C204019og.A00(this, 1);
    }

    public final void A75(int i) {
        String string = getString(R.string.f11nameremoved);
        this.A04.setVisibility(0);
        int i2 = i;
        if (i == 0) {
            TextEmojiLabel textEmojiLabel = this.A04;
            textEmojiLabel.setText(this.A0E.A06(textEmojiLabel.getContext(), new C198779fT(this), string, "learn-more", AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
            C18270x1.A0q(this.A04, this.A0D);
            this.A05.setVisibility(8);
            return;
        }
        String A0F2 = AnonymousClass002.A0F(this, "by-selecting-them", AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel2 = this.A04;
        textEmojiLabel2.setText(this.A0E.A05(textEmojiLabel2.getContext(), new C199929hV(this, i), A0F2, "by-selecting-them"));
        C18270x1.A0q(this.A04, this.A0D);
        this.A05.setVisibility(0);
        this.A0A.A01((List) null, 0, i2, 0, this.A00, this.A01);
    }

    public void onCreate(Bundle bundle) {
        int[] iArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A01 = getIntent().getIntExtra("entry_point", 1);
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.toolbar);
        C86604Kt.A11(this, toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) getString(R.string.f11nameremoved));
        toolbar.setBackgroundResource(AnonymousClass34K.A00(this));
        toolbar.setNavigationOnClickListener(C204249p3.A00(this, 3));
        toolbar.A0J(this, R.style.f12nameremoved);
        setSupportActionBar(toolbar);
        this.A04 = (TextEmojiLabel) C005205m.A00(this, R.id.dm_description);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C005205m.A00(this, R.id.dm_learn_more);
        this.A05 = textEmojiLabel;
        textEmojiLabel.setText(this.A0E.A06(textEmojiLabel.getContext(), new C198789fU(this), getString(R.string.f11nameremoved), "learn-more", AnonymousClass0x2.A05(this.A05)));
        C18270x1.A0q(this.A05, this.A0D);
        this.A03 = -1;
        RadioGroup radioGroup = (RadioGroup) C005205m.A00(this, R.id.dm_radio_group);
        int intValue = this.A09.A05().intValue();
        this.A02 = intValue;
        AnonymousClass352.A03(radioGroup, this.A0D, intValue, true, false);
        A75(intValue);
        if (this.A0D.A0X(1397)) {
            iArr = C58152un.A0K;
        } else {
            iArr = C58152un.A0L;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            View childAt = radioGroup.getChildAt(i);
            if (childAt instanceof RadioButton) {
                A0s.add(childAt);
            }
        }
        C204369pF r2 = new C204369pF(this, 0);
        radioGroup.setOnCheckedChangeListener(r2);
        this.A08.A04.A00.A0B(this, new AnonymousClass9YE(r2, radioGroup, A0s, iArr));
        this.A0A.A00(1, this.A01);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A74(this.A03);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public ChangeDMSettingActivity() {
        this(0);
    }
}
