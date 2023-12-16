package com.whatsapp.registration.accountdefence;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass317;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C06270Wx;
import X.C104005Pg;
import X.C116985rC;
import X.C124206Bj;
import X.C15110qn;
import X.C18260x0;
import X.C28861ht;
import X.C50152hi;
import X.C50232hq;
import X.C51072jE;
import X.C54292oU;
import X.C55092pm;
import X.C56502s5;
import X.C56612sH;
import X.C626936e;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.util.Log;

public class NewDeviceConfirmationRegistrationViewModel extends C05550Ty implements C15110qn {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C116985rC A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass33T A08;
    public final AnonymousClass33p A09;
    public final C28861ht A0A;
    public final C50152hi A0B;
    public final AnonymousClass317 A0C;
    public final C51072jE A0D;
    public final C55092pm A0E;
    public final C50232hq A0F;
    public final C56502s5 A0G;
    public final AnonymousClass4UC A0H = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0I = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0J;

    public long A0D() {
        C104005Pg r1 = this.A0F.A06;
        Log.i("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice");
        long A0A2 = AnonymousClass0x2.A0A(r1.A01.A03("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice/result ");
        A0o.append(A0A2);
        A0o.append(" cur_time=");
        C18260x0.A1I(A0o, System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        if (A0A2 > currentTimeMillis) {
            return A0A2 - currentTimeMillis;
        }
        return -1;
    }

    public void A0E() {
        AnonymousClass4UC r1;
        int i;
        Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration");
        this.A0F.A00();
        if (this.A03) {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/changenumber");
            AnonymousClass317 r2 = this.A0C;
            r2.A0B(3, true);
            r2.A0F();
            r1 = this.A0I;
            i = 5;
        } else {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/resetting registration");
            this.A0C.A09();
            r1 = this.A0I;
            i = 6;
        }
        C06270Wx.A04(r1, i);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_PAUSE)
    public void onActivityPaused() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecyclePause");
        this.A02 = false;
        C50232hq r1 = this.A0F;
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        r1.A05.A00();
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_RESUME)
    public void onActivityResumed() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleResume");
        this.A02 = true;
        C50232hq r4 = this.A0F;
        String str = this.A00;
        C626936e.A06(str);
        String str2 = this.A01;
        C626936e.A06(str2);
        r4.A01(new C124206Bj(this, 2), str, str2);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_START)
    public void onActivityStarted() {
        this.A0G.A01("device_confirm");
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_STOP)
    public void onActivityStopped() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleStop");
        this.A0B.A00();
    }

    public NewDeviceConfirmationRegistrationViewModel(C116985rC r2, C56612sH r3, C54292oU r4, AnonymousClass33T r5, AnonymousClass33p r6, C28861ht r7, C50152hi r8, AnonymousClass317 r9, C51072jE r10, C55092pm r11, C50232hq r12, C56502s5 r13, AnonymousClass4FS r14) {
        this.A06 = r3;
        this.A07 = r4;
        this.A0J = r14;
        this.A0F = r12;
        this.A0G = r13;
        this.A0A = r7;
        this.A0B = r8;
        this.A0C = r9;
        this.A09 = r6;
        this.A0E = r11;
        this.A08 = r5;
        this.A05 = r2;
        this.A0D = r10;
    }
}
