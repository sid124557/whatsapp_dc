package com.whatsapp.calling.calllink.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0XV;
import X.AnonymousClass2NC;
import X.AnonymousClass4CZ;
import X.AnonymousClass7UG;
import X.C05550Ty;
import X.C06270Wx;
import X.C106645Zu;
import X.C107305b5;
import X.C166307yT;
import X.C166317yU;
import X.C29441ip;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.R;
import java.util.Set;

public class CallLinkViewModel extends C05550Ty implements AnonymousClass4CZ {
    public final AnonymousClass08M A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass0XV A02;
    public final AnonymousClass2NC A03;
    public final C29441ip A04;

    public void A0C() {
        AnonymousClass2NC r1 = this.A03;
        Set set = r1.A02;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.A07(r1);
        }
    }

    public final void A0D(boolean z) {
        boolean A0F = this.A04.A0F();
        AnonymousClass0XV r2 = this.A02;
        if (!A0F) {
            r2.A06("saved_state_link", new AnonymousClass7UG(3).A00());
            return;
        }
        AnonymousClass7UG r1 = new AnonymousClass7UG(0);
        r1.A01 = R.string.f11nameremoved;
        r1.A00 = R.color.f5nameremoved;
        r2.A06("saved_state_link", r1.A00());
        this.A03.A01.A00(new C106645Zu(Message.obtain((Handler) null, 0, z ? 1 : 0, 0), "create_call_link"));
    }

    public final boolean A0E() {
        Boolean bool = (Boolean) this.A02.A04("saved_state_is_video");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void BO2() {
        this.A02.A06("saved_state_link", new AnonymousClass7UG(2).A00());
    }

    public void BV8(String str, boolean z) {
        AnonymousClass0XV r5 = this.A02;
        r5.A06("saved_state_is_video", Boolean.valueOf(z));
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        AnonymousClass7UG r1 = new AnonymousClass7UG(1);
        r1.A03 = C107305b5.A05(str, z);
        r1.A04 = str;
        r1.A05 = z;
        r1.A02 = i;
        r5.A06("saved_state_link", r1.A00());
        boolean A0E = A0E();
        int i2 = R.drawable.ic_btn_call_audio;
        int i3 = R.string.f11nameremoved;
        if (A0E) {
            i2 = R.drawable.ic_btn_call_video;
            i3 = R.string.f11nameremoved;
        }
        r5.A06("saved_state_link_type", new C166307yT(i2, i3, A0E() ^ true ? 1 : 0));
    }

    public CallLinkViewModel(AnonymousClass0XV r4, AnonymousClass2NC r5, C29441ip r6) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A01 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A00 = A013;
        this.A03 = r5;
        r5.A02.add(this);
        this.A02 = r4;
        this.A04 = r6;
        C06270Wx.A03(A013, R.string.f11nameremoved);
        C06270Wx.A03(A012, R.string.f11nameremoved);
        AnonymousClass08M A032 = this.A02.A03("saved_state_link");
        if (A032.A07() == null || ((C166317yU) A032.A07()).A03 != 1) {
            A0D(A0E());
        }
    }
}
