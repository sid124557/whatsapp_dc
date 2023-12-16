package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4UC;
import X.AnonymousClass5G4;
import X.C103805Om;
import X.C105625Vt;
import X.C111545iG;
import X.C1225664w;
import X.C182758ow;
import X.C182778oy;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BusinessDirectoryFrequentContactedViewModel extends AnonymousClass08N implements C1225664w, C182758ow, C182778oy {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C111545iG A01;
    public final C103805Om A02;
    public final AnonymousClass4UC A03 = AnonymousClass0x9.A0b();

    public void A0C() {
        C18290x4.A1L(this.A02.A00);
    }

    public void BPw(AnonymousClass5G4 r14) {
        synchronized (BusinessDirectoryFrequentContactedViewModel.class) {
            ArrayList arrayList = r14.A00;
            if (!arrayList.isEmpty()) {
                this.A00.A0G(arrayList);
                int size = arrayList.size();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (C18310x6.A0R(it).A0E.A02()) {
                        i++;
                    }
                }
                int i2 = size - i;
                C111545iG r6 = this.A01;
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    if (C18310x6.A0R(it2).A0E.A02()) {
                        i3++;
                    }
                }
                LinkedHashMap A0r = C18320x8.A0r();
                A0r.put("local_biz_count", Integer.valueOf(i2));
                A0r.put("api_biz_count", Integer.valueOf(i3));
                LinkedHashMap A0r2 = C18320x8.A0r();
                A0r2.put("result", A0r);
                r6.A09((Integer) null, 12, A0r2, 12, 84, 2);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BUp(Object obj) {
        this.A03.A0G(new C105625Vt((AnonymousClass3ZH) obj, 0));
        this.A01.A09((Integer) null, C18290x4.A0b(), (Map) null, 12, 80, 1);
    }

    public void BcB(AnonymousClass3ZH r8) {
        this.A03.A0G(new C105625Vt(r8, 1));
        this.A01.A09((Integer) null, C18290x4.A0c(), (Map) null, 12, 81, 1);
    }

    public BusinessDirectoryFrequentContactedViewModel(Application application, C111545iG r5, C103805Om r6) {
        super(application);
        this.A02 = r6;
        this.A01 = r5;
        r5.A05((Integer) null, 12, 84);
        this.A02.A00(this, 100);
    }
}
