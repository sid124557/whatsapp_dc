package com.whatsapp.businessapisearch.viewmodel;

import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass4UC;
import X.AnonymousClass5IK;
import X.C06270Wx;
import android.app.Application;
import android.content.SharedPreferences;

public class BusinessApiSearchActivityViewModel extends AnonymousClass08N {
    public final AnonymousClass5IK A00;
    public final AnonymousClass4UC A01;

    public BusinessApiSearchActivityViewModel(Application application, AnonymousClass5IK r6) {
        super(application);
        SharedPreferences sharedPreferences;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A01 = A0b;
        this.A00 = r6;
        if (r6.A01.A0X(2760)) {
            synchronized (r6) {
                sharedPreferences = r6.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r6.A02.A03("com.whatsapp_business_api");
                    r6.A00 = sharedPreferences;
                }
            }
            if (sharedPreferences.getBoolean("arg_should_show_nux", true)) {
                C06270Wx.A04(A0b, 1);
            }
        }
    }
}
