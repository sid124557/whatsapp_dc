package com.whatsapp.chatinfo.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass1fS;
import X.AnonymousClass3LP;
import X.AnonymousClass3ZH;
import X.AnonymousClass4I4;
import X.AnonymousClass4I8;
import X.AnonymousClass5Y0;
import X.C003203q;
import X.C107345b9;
import X.C111095hX;
import X.C18260x0;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C53202mi;
import X.C615031a;
import X.C616831v;
import X.C626936e;
import X.C64773Ex;
import X.C66433Lk;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class EncryptionExplanationDialogFragment extends Hilt_EncryptionExplanationDialogFragment {
    public C111095hX A00;
    public C64773Ex A01;
    public AnonymousClass5Y0 A02;
    public AnonymousClass3LP A03;
    public C53202mi A04;
    public C66433Lk A05;

    public static EncryptionExplanationDialogFragment A00(C95814uZ r5) {
        EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = new EncryptionExplanationDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r5, "jid");
        A08.putInt("provider_category", 1);
        A08.putString("display_name", (String) null);
        encryptionExplanationDialogFragment.A0u(A08);
        return encryptionExplanationDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        String str;
        int i2;
        Object[] objArr;
        Bundle A0H = A0H();
        String string = A0H.getString("jid");
        String string2 = A0H.getString("display_name");
        int i3 = A0H.getInt("provider_category", 0);
        C64773Ex r1 = this.A01;
        C95814uZ A0S = C18310x6.A0S(string);
        C626936e.A07(A0S, string);
        AnonymousClass3ZH A0A = r1.A0A(A0S);
        AnonymousClass1VX r2 = this.A02;
        C53202mi r0 = this.A04;
        C003203q A0R = A0R();
        C95814uZ r8 = A0A.A0H;
        r8.getClass();
        AnonymousClass3LP r12 = this.A03;
        if (r0.A02(r8) || C616831v.A00(r2, r8)) {
            i = R.string.f11nameremoved;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    C626936e.A06(string2);
                    i2 = R.string.f11nameremoved;
                } else if (i3 == 3 || i3 == 4) {
                    C626936e.A06(string2);
                    boolean A012 = C615031a.A01(r12, r8);
                    i2 = R.string.f11nameremoved;
                    if (A012) {
                        i2 = R.string.f11nameremoved;
                        objArr = new Object[]{string2};
                        str = A0R.getString(i2, objArr);
                        C19340zH A0L = C18300x5.A0L(this);
                        A0L.A0g(C107345b9.A05(A0R(), this.A02, str));
                        A0L.A0i(true);
                        C19340zH.A07(A0L, this, 34, R.string.f11nameremoved);
                        A0L.A0X(new AnonymousClass4I4(this, i3, 2), R.string.f11nameremoved);
                        if (!A0A.A0U() && !(A0A.A0H instanceof AnonymousClass1fS) && i3 == 1) {
                            A0L.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I8(A0A, 2, this));
                        }
                        return A0L.create();
                    }
                } else {
                    C18260x0.A0x("providerCategoryToModal unexpected argument value for providerCategory: ", AnonymousClass001.A0o(), i3);
                }
                objArr = new Object[]{string2, string2};
                str = A0R.getString(i2, objArr);
                C19340zH A0L2 = C18300x5.A0L(this);
                A0L2.A0g(C107345b9.A05(A0R(), this.A02, str));
                A0L2.A0i(true);
                C19340zH.A07(A0L2, this, 34, R.string.f11nameremoved);
                A0L2.A0X(new AnonymousClass4I4(this, i3, 2), R.string.f11nameremoved);
                A0L2.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I8(A0A, 2, this));
                return A0L2.create();
            }
            i = R.string.f11nameremoved;
        }
        str = A0R.getString(i);
        C19340zH A0L22 = C18300x5.A0L(this);
        A0L22.A0g(C107345b9.A05(A0R(), this.A02, str));
        A0L22.A0i(true);
        C19340zH.A07(A0L22, this, 34, R.string.f11nameremoved);
        A0L22.A0X(new AnonymousClass4I4(this, i3, 2), R.string.f11nameremoved);
        A0L22.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I8(A0A, 2, this));
        return A0L22.create();
    }
}
