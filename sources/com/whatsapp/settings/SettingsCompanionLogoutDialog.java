package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass24P;
import X.AnonymousClass32X;
import X.AnonymousClass33p;
import X.AnonymousClass36P;
import X.AnonymousClass4FS;
import X.AnonymousClass4I5;
import X.C08310eF;
import X.C111095hX;
import X.C18260x0;
import X.C18280x3;
import X.C19340zH;
import X.C47872dy;
import X.C53892nq;
import X.C54412og;
import X.C56612sH;
import X.C614930z;
import X.C69263Wi;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class SettingsCompanionLogoutDialog extends Hilt_SettingsCompanionLogoutDialog {
    public C111095hX A00;
    public C69263Wi A01;
    public C614930z A02;
    public C47872dy A03;
    public C56612sH A04;
    public AnonymousClass33p A05;
    public C54412og A06;
    public AnonymousClass4FS A07;

    public Dialog A1J(Bundle bundle) {
        String str;
        boolean A062 = this.A02.A06();
        int i = R.string.f11nameremoved;
        if (A062) {
            i = R.string.f11nameremoved;
        }
        String string = C08310eF.A09(this).getString(i);
        if (A062) {
            str = null;
            try {
                C53892nq A012 = this.A02.A01();
                if (A012 != null) {
                    str = this.A01.A0I(AnonymousClass36P.A03(AnonymousClass32X.A00(A012.A06)));
                } else {
                    Log.e("SettingsCompanionLogoutDialog/getCurrentPhoneNumber/currentAccount is null ");
                }
            } catch (AnonymousClass24P e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "SettingsCompanionLogoutDialog/getCurrentPhoneNumber/InvalidJidException : ", e);
            }
        } else {
            str = C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0h(string);
        A0K.A0g(str);
        A0K.A0Y(new AnonymousClass4I5(1, this, A062), R.string.f11nameremoved);
        C19340zH.A05(A0K);
        return A0K.create();
    }
}
