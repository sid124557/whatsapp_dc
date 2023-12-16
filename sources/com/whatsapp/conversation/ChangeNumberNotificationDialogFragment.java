package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass24P;
import X.AnonymousClass32Y;
import X.AnonymousClass36P;
import X.AnonymousClass370;
import X.AnonymousClass3ZH;
import X.AnonymousClass4I1;
import X.AnonymousClass4I8;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C19340zH;
import X.C56612sH;
import X.C64773Ex;
import X.C835949a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class ChangeNumberNotificationDialogFragment extends Hilt_ChangeNumberNotificationDialogFragment {
    public C64773Ex A00;
    public C835949a A01;
    public C56612sH A02;

    public static ChangeNumberNotificationDialogFragment A00(UserJid userJid, UserJid userJid2, String str) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = new ChangeNumberNotificationDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, userJid, "convo_jid");
        AnonymousClass0x2.A0v(A08, userJid2, "new_jid");
        A08.putString("old_display_name", str);
        changeNumberNotificationDialogFragment.A0u(A08);
        return changeNumberNotificationDialogFragment;
    }

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A01 = (C835949a) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0X(" must implement ChangeNumberNotificationDialogListener", A0o));
        }
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        try {
            UserJid A09 = AnonymousClass32Y.A09(A0H.getString("convo_jid"));
            UserJid A0A = AnonymousClass32Y.A0A(A0H.getString("new_jid"));
            String string = A0H.getString("old_display_name");
            if (TextUtils.isEmpty(string)) {
                string = "UNKNOWN";
            }
            AnonymousClass3ZH A0A2 = this.A00.A0A(A0A);
            boolean A1W = AnonymousClass000.A1W(A0A2.A0F);
            C19340zH A0H2 = C18320x8.A0H(this);
            AnonymousClass4I1 r5 = new AnonymousClass4I1(6);
            AnonymousClass4I8 r6 = new AnonymousClass4I8(A0A2, 6, this);
            AnonymousClass370 r2 = new AnonymousClass370(this, A0A2, A1W);
            if (A09.equals(A0A)) {
                if (A1W) {
                    A0H2.A0Q(AnonymousClass0x7.A0n(this, this.A01.A0I(AnonymousClass36P.A03(AnonymousClass3ZH.A01(A0A2))), new Object[1], 0, R.string.f11nameremoved));
                    A0H2.setPositiveButton(R.string.f11nameremoved, r5);
                } else {
                    A0H2.A0Q(AnonymousClass0x7.A0n(this, AnonymousClass36P.A03(AnonymousClass3ZH.A01(A0A2)), C18310x6.A1b(string, 0), 1, R.string.f11nameremoved));
                    A0H2.setNegativeButton(R.string.f11nameremoved, r5);
                    A0H2.setPositiveButton(R.string.f11nameremoved, r2);
                }
            } else if (A1W) {
                A0H2.A0Q(AnonymousClass0x7.A0n(this, this.A01.A0I(AnonymousClass36P.A03(AnonymousClass3ZH.A01(A0A2))), new Object[1], 0, R.string.f11nameremoved));
                A0H2.setPositiveButton(R.string.f11nameremoved, r5);
                A0H2.A0X(r6, R.string.f11nameremoved);
            } else {
                A0H2.A0Q(C18310x6.A0m(this, string, R.string.f11nameremoved));
                A0H2.A0X(r6, R.string.f11nameremoved);
                A0H2.setPositiveButton(R.string.f11nameremoved, r2);
                A0H2.setNegativeButton(R.string.f11nameremoved, r5);
            }
            AnonymousClass043 create = A0H2.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        } catch (AnonymousClass24P e) {
            throw C18330xA.A09(e);
        }
    }
}
