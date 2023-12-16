package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass5ZU;
import X.C103315Mk;
import X.C620733j;
import X.C64773Ex;
import android.app.Application;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public class InviteNonWhatsAppContactPickerViewModel extends AnonymousClass08N {
    public String A00 = null;
    public boolean A01;
    public final AnonymousClass08J A02 = AnonymousClass4L0.A0E();
    public final AnonymousClass08J A03 = AnonymousClass4L0.A0E();
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final AnonymousClass08M A07 = AnonymousClass08M.A01();
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final C64773Ex A09;
    public final AnonymousClass5ZU A0A;
    public final C620733j A0B;
    public final C103315Mk A0C;
    public final AnonymousClass4UC A0D = AnonymousClass0x9.A0b();
    public final List A0E = AnonymousClass001.A0s();

    public InviteNonWhatsAppContactPickerViewModel(Application application, C64773Ex r3, AnonymousClass5ZU r4, C620733j r5, C103315Mk r6) {
        super(application);
        this.A09 = r3;
        this.A0B = r5;
        this.A0A = r4;
        this.A0C = r6;
    }

    public static final void A00(AnonymousClass3ZH r2, Map map) {
        String A0J = r2.A0J();
        if (TextUtils.isEmpty(A0J)) {
            Log.i("InviteNonWhatsAppContactPickerViewModel/fillNameToContactMap/display name missing");
            return;
        }
        List list = (List) map.get(A0J);
        if (list == null) {
            list = AnonymousClass001.A0s();
        }
        list.add(r2);
        map.put(A0J, list);
    }
}
