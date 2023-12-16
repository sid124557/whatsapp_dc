package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0w4;
import X.AnonymousClass0w7;
import X.AnonymousClass5V0;
import X.C06560Yg;
import X.C08310eF;
import X.C09920gy;
import X.C106755a7;
import X.C107565bW;
import X.C18230wx;
import X.C19340zH;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CodeInputField A06;
    public EncBackupViewModel A07;
    public C620633i A08;
    public C620733j A09;
    public WDSButton A0A;

    public static String A04(C620733j r9, long j) {
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = (j + 60000) - 1;
        long j3 = j2 / 3600000;
        if (j3 == 0) {
            return C107565bW.A05(r9, (int) (j2 / 60000), 1);
        }
        return C107565bW.A05(r9, (int) j3, 2);
    }

    public static /* synthetic */ boolean A07(PasswordInputFragment passwordInputFragment, int i) {
        if (i != 6) {
            return false;
        }
        passwordInputFragment.A1K();
        return false;
    }

    public abstract void A1K();

    public abstract void A1L();

    public final void A1J() {
        this.A06.addTextChangedListener(new C18230wx(this, 1));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r0 = X.C08310eF.A09(r10).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        A1O((android.content.DialogInterface.OnClickListener) null, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        A1P(X.C08310eF.A09(r10).getString(r1), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        r0 = X.C08310eF.A09(r10).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
        A1P(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M(int r11) {
        /*
            r10 = this;
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r10.A07
            X.08M r0 = r0.A08
            java.lang.Object r1 = r0.A07()
            java.lang.Number r1 = (java.lang.Number) r1
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r10.A07
            int r7 = r0.A0D()
            r8 = 0
            r4 = 2
            r3 = 0
            r5 = 0
            r2 = 1
            switch(r11) {
                case 4: goto L_0x001d;
                case 5: goto L_0x0021;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00f6;
                case 8: goto L_0x009a;
                default: goto L_0x0019;
            }
        L_0x0019:
            r10.A1L()
        L_0x001c:
            return
        L_0x001d:
            r1 = 2131893926(0x7f121ea6, float:1.9422642E38)
            goto L_0x0054
        L_0x0021:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x003c
            if (r7 != 0) goto L_0x005d
            r1 = 2131888975(0x7f120b4f, float:1.94126E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r2 = r0.getString(r1)
            r1 = 4
            X.0wB r0 = new X.0wB
            r0.<init>(r10, r1)
            r10.A1O(r0, r2, r5)
            return
        L_0x003c:
            r1 = 2131888990(0x7f120b5e, float:1.941263E38)
            if (r7 == 0) goto L_0x00ed
            r1 = 2131888961(0x7f120b41, float:1.9412572E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1)
            r10.A1P(r0, r2)
            if (r7 != r2) goto L_0x001c
            r1 = 2131888991(0x7f120b5f, float:1.9412633E38)
        L_0x0054:
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0096
        L_0x005d:
            if (r1 == 0) goto L_0x00d7
            long r0 = r1.longValue()
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x00d7
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.33j r4 = r10.A09
            java.lang.String r4 = A04(r4, r0)
            r8[r5] = r4
            r6 = 2131888962(0x7f120b42, float:1.9412574E38)
            android.content.res.Resources r4 = X.C08310eF.A09(r10)
            java.lang.String r4 = r4.getString(r6, r8)
            r10.A1P(r4, r5)
            if (r7 != r2) goto L_0x001c
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.33j r4 = r10.A09
            java.lang.String r0 = A04(r4, r0)
            r6[r5] = r0
            r1 = 2131888963(0x7f120b43, float:1.9412576E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1, r6)
        L_0x0096:
            r10.A1O(r3, r0, r2)
            return
        L_0x009a:
            r1 = 2131888958(0x7f120b3e, float:1.9412566E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1)
            r10.A1O(r3, r0, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r10.A07
            int r0 = r0.A0E()
            if (r0 != r4) goto L_0x001c
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r10.A07
            r0 = 5
            r1.A0T(r0)
            return
        L_0x00b7:
            if (r1 == 0) goto L_0x00db
            long r3 = r1.longValue()
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.33j r0 = r10.A09
            java.lang.String r0 = A04(r0, r3)
            r2[r5] = r0
            r1 = 2131888971(0x7f120b4b, float:1.9412592E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x010c
        L_0x00d7:
            r1 = 2131888961(0x7f120b41, float:1.9412572E38)
            goto L_0x00de
        L_0x00db:
            r1 = 2131893926(0x7f121ea6, float:1.9422642E38)
        L_0x00de:
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1)
            r10.A1P(r0, r2)
            return
        L_0x00ea:
            r1 = 2131888992(0x7f120b60, float:1.9412635E38)
        L_0x00ed:
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x010c
        L_0x00f6:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x00ea
            android.content.res.Resources r4 = X.C08310eF.A09(r10)
            r3 = 2131755087(0x7f10004f, float:1.9141043E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 64
            X.AnonymousClass000.A1P(r1, r0, r5)
            java.lang.String r0 = r4.getQuantityString(r3, r0, r1)
        L_0x010c:
            r10.A1P(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A1M(int):void");
    }

    public void A1Q(boolean z) {
        this.A06.setEnabled(z);
        if (z) {
            InputMethodManager A0Q = this.A08.A0Q();
            if (A0Q != null && !A0Q.isAcceptingText()) {
                A0Q.toggleSoftInput(1, 1);
            }
            this.A06.requestFocus();
        }
    }

    public void A1R(boolean z) {
        AnonymousClass0w7 r0;
        CodeInputField codeInputField;
        this.A0A.setEnabled(z);
        WDSButton wDSButton = this.A0A;
        if (z) {
            wDSButton.setOnClickListener(new AnonymousClass0w4(this, 9));
            codeInputField = this.A06;
            r0 = new AnonymousClass0w7(this, 2);
        } else {
            r0 = null;
            wDSButton.setOnClickListener((View.OnClickListener) null);
            codeInputField = this.A06;
        }
        codeInputField.setOnEditorActionListener(r0);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        this.A07 = encBackupViewModel;
        this.A00 = encBackupViewModel.A0E();
        this.A04 = C08310eF.A0A(view, R.id.enc_backup_password_input_title);
        this.A03 = C08310eF.A0A(view, R.id.enc_backup_password_input_instruction);
        this.A01 = C08310eF.A0A(view, R.id.enc_backup_password_input_forgot_password);
        this.A06 = (CodeInputField) C06560Yg.A02(view, R.id.enc_backup_password_input);
        this.A02 = C08310eF.A0A(view, R.id.enc_backup_password_input_requirement);
        this.A0A = (WDSButton) C06560Yg.A02(view, R.id.enc_backup_password_input_button);
        this.A05 = C08310eF.A0A(view, R.id.enc_backup_password_input_use_encryption_key_button);
        this.A01.setVisibility(8);
        this.A05.setVisibility(8);
        A1J();
        A1R(false);
        this.A07.A04.A0B(A0V(), new C09920gy(this, 15));
    }

    public void A1N(int i, int i2, boolean z) {
        Context A1D = A1D();
        if (A1D != null) {
            if (z) {
                C626936e.A0B(true);
                TextView textView = this.A02;
                Resources A092 = C08310eF.A09(this);
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass000.A1P(A0M, 6, 0);
                A0M[1] = 1;
                textView.setText(A092.getQuantityString(i, 6, A0M));
            } else {
                this.A02.setText(i2);
            }
            this.A02.setTextColor(AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved));
            this.A02.setVisibility(0);
        }
    }

    public final void A1O(DialogInterface.OnClickListener onClickListener, String str, boolean z) {
        C19340zH A002 = AnonymousClass5V0.A00(A0R());
        A002.A0g(str);
        A002.A0Y(onClickListener, R.string.f11nameremoved);
        A002.create().show();
        A1Q(z);
        A1R(false);
        C106755a7.A03(this.A08);
        Log.i(AnonymousClass000.A0V("encb/PasswordInputFragment/error modal shown with message: ", str, AnonymousClass001.A0o()));
    }

    public void A1P(String str, boolean z) {
        Context A1D = A1D();
        if (A1D != null) {
            this.A02.setText(str);
            this.A02.setTextColor(AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved));
            this.A02.setVisibility(0);
            A1Q(z);
            A1R(false);
            C106755a7.A03(this.A08);
            Log.i(AnonymousClass000.A0V("encb/PasswordInputFragment/error message shown: ", str, AnonymousClass001.A0o()));
        }
    }
}
