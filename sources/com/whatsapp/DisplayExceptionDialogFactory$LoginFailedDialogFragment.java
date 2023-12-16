package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass317;
import X.AnonymousClass33p;
import X.AnonymousClass36P;
import X.AnonymousClass5X8;
import X.AnonymousClass69X;
import X.C06560Yg;
import X.C107635bd;
import X.C109455ee;
import X.C111095hX;
import X.C159707mK;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C54412og;
import X.C56612sH;
import X.C56972sr;
import X.C614930z;
import X.C620633i;
import X.C627736r;
import X.C69263Wi;
import X.C73353fM;
import X.C85244Fm;
import X.C86634Kw;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public C111095hX A00;
    public C69263Wi A01;
    public C85244Fm A02;
    public C56972sr A03;
    public AnonymousClass5X8 A04;
    public C614930z A05;
    public C620633i A06;
    public C56612sH A07;
    public AnonymousClass33p A08;
    public C54412og A09;
    public AnonymousClass317 A0A;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0M;
        boolean z = true;
        if (this.A05.A06()) {
            String A022 = AnonymousClass36P.A02(C86634Kw.A0V(this.A03));
            View A0H = C18310x6.A0H(LayoutInflater.from(A0R()), R.layout.f8nameremoved);
            A0M = C18300x5.A0M(this);
            A0M.A0i(false);
            A0M.A0a(A0H);
            TextEmojiLabel A0K = AnonymousClass0x7.A0K(A0H, R.id.dialog_message);
            View A023 = C06560Yg.A02(A0H, R.id.log_back_in_button);
            View A024 = C06560Yg.A02(A0H, R.id.remove_account_button);
            String A0F = AnonymousClass002.A0F(A0G(), this.A01.A0I(A022), new Object[1], 0, R.string.f11nameremoved);
            A0K.setText(A0F);
            Context context = A0H.getContext();
            AnonymousClass1VX r12 = this.A02;
            C107635bd.A0G(context, this.A00, this.A01, A0K, this.A06, r12, A0F, new C73353fM(this));
            A023.setOnClickListener(new C109455ee(0, A022, this));
            C18280x3.A0p(A024, this, 13);
        } else {
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A08), "logout_message_locale");
            if (A0Z == null || !this.A01.A07().equals(A0Z)) {
                z = false;
            }
            A0M = C18300x5.A0M(this);
            A0M.A0i(false);
            String A0Z2 = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A08), "main_button_text");
            if (!z || C159707mK.A00(A0Z2)) {
                A0Z2 = A0G().getString(R.string.f11nameremoved);
            }
            AnonymousClass69X r0 = new AnonymousClass69X(0, this, z);
            AnonymousClass0Uj r4 = A0M.A00;
            r4.A0I(r0, A0Z2);
            String A0Z3 = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A08), "secondary_button_text");
            if (!z || C159707mK.A00(A0Z3)) {
                A0Z3 = A0G().getString(R.string.f11nameremoved);
            }
            r4.A0G(new AnonymousClass69X(1, this, z), A0Z3);
            String string = AnonymousClass0x2.A0F(this.A08).getString("logout_message_header", (String) null);
            String string2 = AnonymousClass0x2.A0F(this.A08).getString("logout_message_subtext", (String) null);
            if (!z || C159707mK.A00(string)) {
                string = A0G().getString(R.string.f11nameremoved);
            } else if (!C159707mK.A00(string2)) {
                string = AnonymousClass000.A0V("\n\n", string2, AnonymousClass000.A0l(string));
            }
            A0M.A0g(string);
        }
        return A0M.create();
    }

    public final void A1V(Activity activity) {
        String A0b = this.A08.A0b();
        String A0Z = this.A08.A0Z();
        Intent A012 = C627736r.A01(activity);
        if (this.A07.A0H() < AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A08), "post_reg_notification_time") + 1800000) {
            A012.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0b);
            A012.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0Z);
            A012.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
        }
        this.A0A.A01();
        this.A0A.A0B(0, true);
        activity.startActivity(A012);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C18300x5.A1A(this);
    }
}
