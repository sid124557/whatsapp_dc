package com.whatsapp.blockui;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass2LD;
import X.AnonymousClass3ZH;
import X.AnonymousClass4TJ;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.AnonymousClass64R;
import X.C06560Yg;
import X.C08310eF;
import X.C103755Oh;
import X.C106715a2;
import X.C108045cK;
import X.C117125rQ;
import X.C1235268t;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C19340zH;
import X.C49562gj;
import X.C53602nM;
import X.C620633i;
import X.C626936e;
import X.C64773Ex;
import X.C86624Kv;
import X.C89654ea;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class BlockConfirmationDialogFragment extends Hilt_BlockConfirmationDialogFragment {
    public AnonymousClass64R A00;
    public C103755Oh A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C53602nM A04;
    public C620633i A05;
    public C49562gj A06;
    public AnonymousClass2LD A07;
    public UserJid A08;
    public C106715a2 A09;
    public String A0A;

    public static BlockConfirmationDialogFragment A00(UserJid userJid, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = new BlockConfirmationDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("jid", userJid.getRawString());
        A082.putString("entryPoint", str);
        A082.putBoolean("deleteChatOnBlock", z);
        A082.putBoolean("showSuccessToast", z4);
        A082.putBoolean("showReportAndBlock", z3);
        A082.putInt("postBlockNavigation", i2);
        A082.putInt("postBlockAndReportNavigation", i);
        A082.putBoolean("enableReportCheckboxByDefault", z2);
        blockConfirmationDialogFragment.A0u(A082);
        return blockConfirmationDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        C89654ea r11 = (C89654ea) A0Q();
        C626936e.A06(r11);
        C626936e.A06(A0H);
        this.A0A = A0H.getString("entryPoint", (String) null);
        String string = A0H.getString("jid", (String) null);
        boolean z = A0H.getBoolean("deleteChatOnBlock", false);
        boolean z2 = A0H.getBoolean("showSuccessToast", false);
        boolean z3 = A0H.getBoolean("showReportAndBlock", false);
        boolean z4 = A0H.getBoolean("enableReportCheckboxByDefault", false);
        int i = A0H.getInt("postBlockNavigation", 0);
        int i2 = A0H.getInt("postBlockAndReportNavigation", 0);
        UserJid A0U = C86624Kv.A0U(string);
        this.A08 = A0U;
        AnonymousClass3ZH A0A2 = this.A02.A0A(A0U);
        C49562gj r4 = this.A06;
        String str = this.A0A;
        UserJid userJid = this.A08;
        int A1Y = AnonymousClass0x2.A1Y(str, userJid);
        r4.A00(userJid, str, 0);
        C19340zH A002 = AnonymousClass5V0.A00(r11);
        Object[] objArr = new Object[A1Y];
        C18300x5.A1E(this.A03, A0A2, objArr, 0);
        String string2 = C08310eF.A09(this).getString(R.string.f11nameremoved, objArr);
        CheckBox checkBox = null;
        if (z3) {
            boolean A0X = this.A02.A0X(6186);
            int i3 = R.layout.f8nameremoved;
            if (A0X) {
                i3 = R.layout.f8nameremoved;
            }
            View inflate = LayoutInflater.from(A1D()).inflate(i3, (ViewGroup) null, false);
            if (A0X) {
                C18300x5.A0G(inflate, R.id.dialog_title).setText(string2);
            } else {
                A002.setTitle(string2);
            }
            checkBox = (CheckBox) C06560Yg.A02(inflate, R.id.checkbox);
            if (z4) {
                checkBox.setChecked(true);
            }
            TextView A0G = C18300x5.A0G(inflate, R.id.dialog_message);
            int i4 = R.string.f11nameremoved;
            if (A0X) {
                i4 = R.string.f11nameremoved;
            }
            A0G.setText(i4);
            TextView A0G2 = C18300x5.A0G(inflate, R.id.checkbox_header);
            int i5 = R.string.f11nameremoved;
            if (A0X) {
                i5 = R.string.f11nameremoved;
            }
            A0G2.setText(i5);
            TextView A0G3 = C18300x5.A0G(inflate, R.id.checkbox_message);
            if (A0X) {
                SpannableStringBuilder A052 = this.A09.A05(A1D(), new C117125rQ(this, 4), AnonymousClass0x7.A0n(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), "learn-more");
                C18270x1.A0q(A0G3, this.A02);
                C06560Yg.A0O(A0G3, new AnonymousClass4TJ(A0G3, this.A05));
                A0G3.setText(A052);
            } else {
                A0G3.setText(R.string.f11nameremoved);
            }
            C18290x4.A1H(C06560Yg.A02(inflate, R.id.checkbox_container), checkBox, 9);
            A002.setView(inflate);
        } else {
            A002.setTitle(string2);
        }
        C108045cK r9 = new C108045cK(checkBox, r11, this, A0A2, i2, i, z, z2);
        C1235268t A003 = C1235268t.A00(this, 10);
        A002.setPositiveButton(R.string.f11nameremoved, r9);
        A002.setNegativeButton(R.string.f11nameremoved, A003);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass64R) {
            this.A00 = (AnonymousClass64R) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C49562gj r3 = this.A06;
        String str = this.A0A;
        UserJid userJid = this.A08;
        C18260x0.A0O(str, userJid);
        r3.A00(userJid, str, 2);
    }
}
