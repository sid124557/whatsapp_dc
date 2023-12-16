package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass043;
import X.AnonymousClass4ON;
import X.AnonymousClass5V0;
import X.AnonymousClass696;
import X.C106175Xx;
import X.C1235268t;
import X.C1235668x;
import X.C162457s7;
import X.C179628jS;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C19340zH;
import X.C626936e;
import X.C97674z3;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;

public final class SelectPhoneNumberDialog extends Hilt_SelectPhoneNumberDialog {
    public C106175Xx A00;
    public C179628jS A01;

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        if (context instanceof C179628jS) {
            this.A01 = (C179628jS) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C179628jS r0 = this.A01;
        if (r0 != null) {
            C97674z3 r02 = (C97674z3) r0;
            r02.A0B.A03(r02.A0I.A03);
        }
    }

    public void A0d() {
        super.A0d();
        this.A01 = null;
    }

    public Dialog A1J(Bundle bundle) {
        ArrayList parcelableArrayList = A0H().getParcelableArrayList("deviceSimInfoList");
        C626936e.A06(parcelableArrayList);
        C162457s7.A0D(parcelableArrayList);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SelectPhoneNumberDialog/number-of-suggestions: ");
        C18260x0.A1G(A0o, parcelableArrayList.size());
        Context A0G = A0G();
        C106175Xx r0 = this.A00;
        if (r0 != null) {
            AnonymousClass4ON r4 = new AnonymousClass4ON(A0G, r0, parcelableArrayList);
            C19340zH A002 = AnonymousClass5V0.A00(A0G);
            A002.A0U(R.string.f11nameremoved);
            A002.A00.A0E((DialogInterface.OnClickListener) null, r4);
            A002.A0Y(new C1235668x(r4, this, parcelableArrayList, 6), R.string.f11nameremoved);
            C1235268t.A04(A002, this, 97, R.string.f11nameremoved);
            AnonymousClass043 A0H = C18300x5.A0H(A002);
            AnonymousClass696.A00(A0H.A00.A0J, r4, 11);
            return A0H;
        }
        throw C18270x1.A0S("countryPhoneInfo");
    }
}
