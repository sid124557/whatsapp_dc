package com.whatsapp.contact.picker;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass4OJ;
import X.AnonymousClass5V0;
import X.C1235668x;
import X.C182148nw;
import X.C19340zH;
import X.C56612sH;
import X.C626936e;
import X.C989353u;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.ArrayList;

public class PhoneNumberSelectionDialog extends Hilt_PhoneNumberSelectionDialog {
    public C182148nw A00;
    public C56612sH A01;

    public static PhoneNumberSelectionDialog A00(String str, ArrayList arrayList) {
        PhoneNumberSelectionDialog phoneNumberSelectionDialog = new PhoneNumberSelectionDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        A08.putParcelableArrayList("phoneNumberSelectionInfoList", arrayList);
        phoneNumberSelectionDialog.A0u(A08);
        return phoneNumberSelectionDialog;
    }

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof C182148nw) {
            this.A00 = (C182148nw) context;
        }
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        String string = A0H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        ArrayList parcelableArrayList = A0H.getParcelableArrayList("phoneNumberSelectionInfoList");
        C626936e.A06(parcelableArrayList);
        Context A0G = A0G();
        AnonymousClass4OJ r5 = new AnonymousClass4OJ(A0G, parcelableArrayList);
        C19340zH A002 = AnonymousClass5V0.A00(A0G);
        A002.A0h(string);
        A002.A00.A0E((DialogInterface.OnClickListener) null, r5);
        A002.A0Y(new C1235668x(parcelableArrayList, r5, this, 1), R.string.f11nameremoved);
        A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.A0i(true);
        AnonymousClass043 create = A002.create();
        create.A00.A0J.setOnItemClickListener(new C989353u(r5, this, this.A01));
        return create;
    }
}
