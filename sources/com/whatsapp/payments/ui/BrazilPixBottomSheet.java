package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass303;
import X.AnonymousClass39L;
import X.AnonymousClass3H6;
import X.AnonymousClass3SR;
import X.AnonymousClass3ZH;
import X.AnonymousClass6C9;
import X.AnonymousClass6FH;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XA;
import X.C003203q;
import X.C08310eF;
import X.C106405Yw;
import X.C138106pm;
import X.C162457s7;
import X.C18270x1;
import X.C182838p4;
import X.C18290x4;
import X.C18330xA;
import X.C1891290c;
import X.C1907099n;
import X.C203499no;
import X.C56972sr;
import X.C626936e;
import X.C66473Lo;
import X.C88694ab;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.util.Locale;

public final class BrazilPixBottomSheet extends Hilt_BrazilPixBottomSheet {
    public CoordinatorLayout A00;
    public C56972sr A01;
    public C66473Lo A02;
    public AnonymousClass39L A03;
    public C95814uZ A04;
    public AnonymousClass9XA A05 = new AnonymousClass9XA();
    public C1907099n A06;
    public C203499no A07;
    public AnonymousClass3SR A08;
    public Boolean A09;
    public Boolean A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0J;
        String str;
        C162457s7.A0J(layoutInflater, 0);
        Bundle A0H = A0H();
        this.A04 = C106405Yw.A04(A0H.getString("merchantJid"));
        this.A0D = A0H.getString("referenceId");
        this.A08 = (AnonymousClass3SR) A0H.getParcelable("payment_settings");
        this.A03 = (AnonymousClass39L) A0H.getParcelable("total_amount_money_representation");
        this.A0E = A0H.getString("referral_screen");
        this.A0G = A0H.getBoolean("should_log_event");
        this.A09 = Boolean.valueOf(A0H.getBoolean("is_quick_launch_enabled"));
        this.A0A = Boolean.valueOf(A0H.getBoolean("show_snackbar_on_copy_enabled"));
        AnonymousClass3SR r0 = this.A08;
        if (r0 == null || (A0J = r0.A01) == null) {
            C95814uZ r1 = this.A04;
            if (r1 == null) {
                A0J = null;
            } else {
                C66473Lo r02 = this.A02;
                if (r02 != null) {
                    AnonymousClass3ZH A012 = r02.A01(r1);
                    if (A012.A0L() != null) {
                        A0J = A012.A0L();
                    } else {
                        A0J = A012.A0J();
                    }
                } else {
                    throw C18270x1.A0S("conversationContactManager");
                }
            }
        }
        this.A0B = A0J;
        AnonymousClass3SR r12 = this.A08;
        if (r12 != null) {
            String str2 = r12.A00;
            if (str2 == null || str2.length() == 0) {
                String str3 = this.A0D;
                AnonymousClass39L r5 = this.A03;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("0014br.gov.bcb.pix01");
                String A0X = AnonymousClass000.A0X(A00(r12.A02), A0o);
                StringBuilder A0A2 = C18330xA.A0A("000201");
                A0A2.append("26");
                A0A2.append(A00(A0X));
                A0A2.append("52040000");
                A0A2.append("5303986");
                A0A2.append("5802BR");
                A0A2.append("59");
                A0A2.append(A00(r12.A01));
                A0A2.append("6001");
                A0A2.append("*");
                if (r5 != null && ((AnonymousClass3H6) r5.A01).A04.equals(((AnonymousClass3H6) AnonymousClass1S3.A04).A04)) {
                    A0A2.append("54");
                    A0A2.append(A00(r5.A02.toString()));
                }
                if (str3 != null) {
                    StringBuilder A0w = C18290x4.A0w("62", A0A2);
                    A0w.append("05");
                    str = A00(AnonymousClass000.A0X(A00(str3), A0w));
                } else {
                    A0A2.append("62");
                    str = "070503***";
                }
                A0A2.append(str);
                A0A2.append("6304");
                Object[] A0L = AnonymousClass002.A0L();
                short s = -1;
                for (byte b : A0A2.toString().getBytes()) {
                    s = (short) (s ^ (((short) b) << 8));
                    int i = 0;
                    do {
                        short s2 = 32768 & s;
                        int i2 = s << 1;
                        if (s2 != 0) {
                            i2 ^= 4129;
                        }
                        s = (short) i2;
                        i++;
                    } while (i < 8);
                }
                A0L[0] = Short.valueOf(s);
                str2 = AnonymousClass000.A0X(String.format("%X", A0L), A0A2);
            }
            this.A0C = str2;
        }
        this.A0F = A0H.getString("total_amount");
        A1e(0, (Integer) null);
        return super.A0K(bundle, layoutInflater, viewGroup);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        if (AnonymousClass0x9.A1Q(this.A09) && "chat".equals(this.A0E)) {
            A1f(false);
        }
    }

    public View.OnClickListener A1b() {
        return new C1891290c(this, 2);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public String A1d() {
        if (AnonymousClass0x9.A1Q(this.A09) && "chat".equals(this.A0E)) {
            return "";
        }
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        C162457s7.A0H(string);
        return string;
    }

    public final void A1e(int i, Integer num) {
        if (this.A0G) {
            AnonymousClass303 A0W = AnonymousClass6C9.A0W();
            A0W.A03("payment_method", "pix");
            String str = this.A0E;
            C203499no r3 = this.A07;
            if (r3 != null) {
                AnonymousClass9Wg.A02(A0W, r3, num, "payment_instructions_prompt", str, i);
                return;
            }
            throw C18270x1.A0S("fieldStatEventLogger");
        }
    }

    public BrazilPixBottomSheet() {
        Boolean bool = Boolean.FALSE;
        this.A0A = bool;
        this.A09 = bool;
    }

    public static String A00(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, str.length());
        return AnonymousClass000.A0V(String.format(locale, "%02d", A0L), str, A0o);
    }

    public int A1a() {
        return R.drawable.ic_action_copy;
    }

    public View A1c() {
        View inflate = LayoutInflater.from(A0G()).inflate(R.layout.f8nameremoved, new FrameLayout(A0G()));
        View findViewById = inflate.findViewById(R.id.close);
        AnonymousClass002.A09(inflate, R.id.merchant_name).setText(this.A0B);
        AnonymousClass002.A09(inflate, R.id.pix_key_value).setText(this.A0C);
        AnonymousClass002.A09(inflate, R.id.total_amount).setText(this.A0F);
        AnonymousClass002.A09(inflate, R.id.instruction_text).setText(R.string.f11nameremoved);
        findViewById.setOnClickListener(new C138106pm(this));
        this.A00 = (CoordinatorLayout) inflate.findViewById(R.id.pix_bottom_sheet_coordinator);
        return inflate;
    }

    public final void A1f(boolean z) {
        CoordinatorLayout coordinatorLayout;
        A1e(1, C18290x4.A0c());
        C003203q A0Q = A0Q();
        C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPixBottomSheet.Callback");
        String str = this.A0C;
        C626936e.A06(str);
        C162457s7.A0D(str);
        C95814uZ r3 = this.A04;
        C626936e.A06(r3);
        C162457s7.A0D(r3);
        AnonymousClass39L r2 = this.A03;
        C626936e.A06(r2);
        C162457s7.A0D(r2);
        AnonymousClass3SR r4 = this.A08;
        C626936e.A06(r4);
        C162457s7.A0D(r4);
        ((C182838p4) A0Q).BQJ(r2, r3, r4, str, z);
        if (AnonymousClass0x9.A1Q(this.A0A) && (coordinatorLayout = this.A00) != null) {
            C88694ab A002 = C88694ab.A00(coordinatorLayout, R.string.f11nameremoved, 0);
            AnonymousClass6FH r42 = A002.A0J;
            ViewGroup.LayoutParams layoutParams = r42.getLayoutParams();
            C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
            marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
            r42.setLayoutParams(marginLayoutParams);
            A002.A05();
        }
    }
}
