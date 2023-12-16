package com.whatsapp.contact.contactform;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass31C;
import X.AnonymousClass49Z;
import X.AnonymousClass4E4;
import X.AnonymousClass4FS;
import X.AnonymousClass5K9;
import X.AnonymousClass5NP;
import X.AnonymousClass5XZ;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZR;
import X.AnonymousClass693;
import X.AnonymousClass695;
import X.AnonymousClass7DW;
import X.C003203q;
import X.C06560Yg;
import X.C103165Lu;
import X.C104195Qa;
import X.C105055Tk;
import X.C105245Ud;
import X.C106175Xx;
import X.C106675Zy;
import X.C106785aA;
import X.C107205as;
import X.C112815kQ;
import X.C1225364t;
import X.C1225464u;
import X.C162457s7;
import X.C166827zK;
import X.C18260x0;
import X.C18310x6;
import X.C1891190b;
import X.C27981fH;
import X.C29441ip;
import X.C43852Ts;
import X.C44102Ur;
import X.C44772Xk;
import X.C44792Xm;
import X.C47092ch;
import X.C53802nh;
import X.C55652qh;
import X.C55682qk;
import X.C56962sq;
import X.C59752xQ;
import X.C620633i;
import X.C620733j;
import X.C627736r;
import X.C64773Ex;
import X.C66413Li;
import X.C69263Wi;
import X.C86604Kt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public class ContactFormBottomSheetFragment extends Hilt_ContactFormBottomSheetFragment implements AnonymousClass4E4, C1225364t, AnonymousClass49Z, C1225464u {
    public C106175Xx A00;
    public C55682qk A01;
    public C103165Lu A02;
    public C44102Ur A03;
    public C69263Wi A04;
    public C56962sq A05;
    public C29441ip A06;
    public C44772Xk A07;
    public C64773Ex A08;
    public C104195Qa A09;
    public AnonymousClass5XZ A0A;
    public C105245Ud A0B;
    public C44792Xm A0C;
    public C55652qh A0D;
    public C47092ch A0E;
    public AnonymousClass5NP A0F;
    public C59752xQ A0G;
    public AnonymousClass7DW A0H;
    public C53802nh A0I;
    public C66413Li A0J;
    public C620633i A0K;
    public AnonymousClass5ZR A0L;
    public C620733j A0M;
    public AnonymousClass5Y0 A0N;
    public AnonymousClass1VX A0O;
    public AnonymousClass31C A0P;
    public C105055Tk A0Q;
    public C106675Zy A0R;
    public AnonymousClass4FS A0S;
    public boolean A0T;

    public void BQK(String str) {
        startActivityForResult(C627736r.A10(A0R(), str, (String) null), 0);
    }

    public void A0w(Bundle bundle, View view) {
        C27981fH A002;
        String string;
        String string2;
        View view2 = view;
        super.A0w(bundle, view2);
        C003203q A0R2 = A0R();
        C162457s7.A0J(view2, 1);
        this.A0C = new C44792Xm(A0R2, view2);
        C003203q A0R3 = A0R();
        C44792Xm r3 = this.A0C;
        C162457s7.A0J(r3, 2);
        this.A0F = new AnonymousClass5NP(A0R3, view2, r3);
        C003203q A0R4 = A0R();
        AnonymousClass5Y0 r4 = this.A0N;
        AnonymousClass5NP r32 = this.A0F;
        C162457s7.A0J(r4, 1);
        C162457s7.A0J(r32, 3);
        this.A0A = new AnonymousClass5XZ(A0R4, view2, r32, r4);
        C003203q A0R5 = A0R();
        C53802nh r33 = this.A0I;
        C162457s7.A0J(r33, 2);
        this.A09 = new C104195Qa(A0R5, view2, r33);
        AnonymousClass7DW r5 = new AnonymousClass7DW(view2);
        this.A0H = r5;
        r5.A00.setOnCheckedChangeListener(new AnonymousClass693(this, 5));
        C003203q A0R6 = A0R();
        AnonymousClass4FS r10 = this.A0S;
        AnonymousClass31C r9 = this.A0P;
        C64773Ex r8 = this.A08;
        C56962sq r7 = this.A05;
        C66413Li r52 = this.A0J;
        C112815kQ r17 = new C112815kQ(A0R6, r7, this.A06, r8, this.A09, r52, r9, r10);
        C003203q A0R7 = A0R();
        C69263Wi r12 = this.A04;
        AnonymousClass4FS r11 = this.A0S;
        C106675Zy r102 = this.A0R;
        Bundle bundle2 = this.A06;
        String str = "";
        String str2 = str;
        if (!(bundle2 == null || (string2 = bundle2.getString("contact_data_phone")) == null)) {
            str = string2;
        }
        C620633i r92 = this.A0K;
        C620733j r82 = this.A0M;
        this.A0B = new C105245Ud(A0R7, view2, this.A00, r12, r17, this.A09, this, this.A0F, r92, r82, r102, r11, str);
        C003203q A0R8 = A0R();
        AnonymousClass1VX r83 = this.A0O;
        C69263Wi r72 = this.A04;
        AnonymousClass4FS r53 = this.A0S;
        C43852Ts r16 = new C43852Ts(A0R8, view2, r72, this.A07, this, this.A0L, r83, r53);
        C003203q A0R9 = A0R();
        AnonymousClass5XZ r54 = this.A0A;
        C105245Ud r34 = this.A0B;
        C69263Wi r2 = this.A04;
        C18260x0.A0a(r54, r34, r2, 2);
        new AnonymousClass5K9(A0R9, view2, r2, this, r54, r34);
        Bundle bundle3 = this.A06;
        if (!(bundle3 == null || (string = bundle3.getString("contact_data_phone")) == null)) {
            str2 = string;
        }
        Bundle bundle4 = this.A06;
        if (bundle4 == null || (A002 = C27981fH.A00(bundle4.getString("contact_data_lid"))) == null || !str2.isEmpty()) {
            if (this.A0O.A0X(5868)) {
                C106785aA.A03(view2, false);
            }
            C59752xQ A003 = this.A03.A00(this.A09, this.A0A, this.A0B, this, this.A0H);
            this.A0G = A003;
            AnonymousClass1VX r103 = this.A0O;
            C69263Wi r13 = this.A04;
            C55682qk r122 = this.A01;
            AnonymousClass4FS r93 = this.A0S;
            C620633i r73 = this.A0K;
            C44772Xk r14 = this.A07;
            AnonymousClass5ZR r6 = this.A0L;
            AnonymousClass5XZ r55 = this.A0A;
            C105245Ud r42 = this.A0B;
            C44792Xm r35 = this.A0C;
            AnonymousClass7DW r22 = this.A0H;
            C59752xQ r21 = A003;
            C44792Xm r19 = r35;
            C105245Ud r18 = r42;
            AnonymousClass5XZ r172 = r55;
            this.A0D = new C55652qh(r122, r13, r14, this.A09, r16, r172, r18, r19, this, r21, r22, r73, r6, r103, r93, (Long) null, (Long) null, (String) null);
        } else {
            C86604Kt.A1E(view2, R.id.phone_field, 8);
            C86604Kt.A1E(view2, R.id.country_code_field, 8);
            C86604Kt.A1E(view2, R.id.phone_icon, 8);
            this.A0E = this.A02.A00(this.A0A, this.A0C, this, A002);
        }
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnShowListener(new C107205as(dialog, 1, this));
        }
        C18310x6.A17(C06560Yg.A02(view2, R.id.close_button), this, 17);
        C44792Xm r56 = this.A0C;
        r56.A00.setVisibility(8);
        r56.A01.setVisibility(0);
        C86604Kt.A1E(view2, R.id.toolbar, 8);
        C86604Kt.A1E(view2, R.id.header, 0);
        C105245Ud r36 = this.A0B;
        AnonymousClass695.A00(r36.A08, r36, 2);
        AnonymousClass5XZ r37 = this.A0A;
        EditText editText = r37.A04;
        editText.setOnFocusChangeListener(new C166827zK(editText, r37));
        EditText editText2 = r37.A05;
        editText2.setOnFocusChangeListener(new C166827zK(editText2, r37));
        EditText editText3 = r37.A03;
        editText3.setOnFocusChangeListener(new C166827zK(editText3, r37));
        Bundle bundle5 = this.A06;
        if (bundle5 == null) {
            this.A0F.A00();
            this.A0A.A04.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(bundle5.getString("contact_data_first_name"))) {
            this.A0F.A00();
            this.A0A.A04.requestFocus();
        }
        C106785aA.A02(bundle5, this.A0A, this.A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r4.A09.A00 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bak(android.content.Intent r5) {
        /*
            r4 = this;
            X.5Ud r1 = r4.A0B
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r0.toString()
        L_0x000e:
            boolean r0 = r1.A07(r0)
            r3 = 1
            if (r0 != 0) goto L_0x001c
            X.5Qa r0 = r4.A09
            X.3ZH r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            X.5Tk r2 = r4.A0Q
            r1 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02(r0, r1)
            r4.A0T = r3
            r4.A1L()
            return
        L_0x002d:
            java.lang.String r0 = ""
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormBottomSheetFragment.Bak(android.content.Intent):void");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 150) {
            this.A0D.A01();
        } else if (i == 0) {
            this.A0B.A04(i2, intent);
        }
    }

    public boolean BHC() {
        return !A16();
    }

    public void BM7() {
        if (A16()) {
            A1L();
        }
    }

    public void Bai() {
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null && !A0Q2.isFinishing() && !this.A0i) {
            C106785aA.A01(A0Q2, new C1891190b(this, 27), new C1891190b(this, 28), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0F.A01.getLayoutParams().height == -1) {
            this.A0C.A00(configuration);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("is_contact_saved", this.A0T);
        A0U().A0n("request_bottom_sheet_fragment", A082);
    }

    public void requestPermission() {
        RequestPermissionActivity.A0j(this, R.string.f11nameremoved, R.string.f11nameremoved);
    }
}
