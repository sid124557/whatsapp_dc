package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass47z;
import X.AnonymousClass4I4;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C19340zH;
import X.C626936e;
import X.C64773Ex;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.R;

public final class CommunityPendingSuggestionsConfirmationDialog extends Hilt_CommunityPendingSuggestionsConfirmationDialog {
    public AnonymousClass47z A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        C626936e.A06(context);
        this.A00 = (AnonymousClass47z) context;
    }

    public Dialog A1J(Bundle bundle) {
        String A0l;
        int i;
        String str;
        C003203q A0R = A0R();
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        int i2 = A0H().getInt("dialogId");
        int i3 = A0H().getInt("availableGroups");
        int i4 = A0H().getInt("totalPendingGroups");
        if (i2 == 0) {
            A0l = C18290x4.A0l(A0R, R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else if (i2 != 1) {
            if (i2 == 2) {
                A0l = C18290x4.A0l(A0R, R.string.f11nameremoved);
                i = R.string.f11nameremoved;
            }
            C85804Hr.A00(A002, this, 41, R.string.f11nameremoved);
            A002.A0I(new AnonymousClass4I4(this, i2, 3), A0R.getString(R.string.f11nameremoved));
            return C18300x5.A0H(A002);
        } else {
            String A0l2 = C18290x4.A0l(A0R, R.string.f11nameremoved);
            Resources resources = A0R.getResources();
            Object[] objArr = new Object[2];
            C18270x1.A1Q(objArr, i3);
            AnonymousClass000.A1P(objArr, i4, 1);
            str = resources.getQuantityString(R.plurals.f9nameremoved, i4, objArr);
            C162457s7.A0D(str);
            A002.setTitle(A0l2);
            A002.A0Q(str);
            C85804Hr.A00(A002, this, 41, R.string.f11nameremoved);
            A002.A0I(new AnonymousClass4I4(this, i2, 3), A0R.getString(R.string.f11nameremoved));
            return C18300x5.A0H(A002);
        }
        str = C18290x4.A0l(A0R, i);
        A002.setTitle(A0l);
        A002.A0Q(str);
        C85804Hr.A00(A002, this, 41, R.string.f11nameremoved);
        A002.A0I(new AnonymousClass4I4(this, i2, 3), A0R.getString(R.string.f11nameremoved));
        return C18300x5.A0H(A002);
    }
}
