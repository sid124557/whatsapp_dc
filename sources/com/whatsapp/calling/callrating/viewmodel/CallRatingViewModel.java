package com.whatsapp.calling.callrating.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass364;
import X.AnonymousClass4L0;
import X.AnonymousClass5Z0;
import X.AnonymousClass7DJ;
import X.C05550Ty;
import X.C106155Xv;
import X.C132766fv;
import X.C1458277l;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18320x8;
import X.C18330xA;
import X.C998558l;
import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

public final class CallRatingViewModel extends C05550Ty {
    public C106155Xv A00;
    public AnonymousClass5Z0 A01;
    public AnonymousClass364 A02;
    public AnonymousClass1VX A03;
    public WamCall A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final AnonymousClass08M A08 = C18330xA.A01(C132766fv.A00);
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass08M A0A = C18330xA.A01(Boolean.FALSE);
    public final AnonymousClass7DJ A0B = new AnonymousClass7DJ();
    public final AnonymousClass107 A0C = AnonymousClass4L0.A0O(AnonymousClass0x7.A0f());
    public final ArrayList A0D = AnonymousClass001.A0s();
    public final HashSet A0E = AnonymousClass002.A0K();

    public final boolean A0E(Bundle bundle) {
        WamCall wamCall;
        String str;
        if (this.A03.A0X(1939)) {
            wamCall = new WamCallExtended();
        } else {
            wamCall = new WamCall();
        }
        AnonymousClass5Z0.A01(bundle.getBundle("event"), wamCall);
        wamCall.newEndCallSurveyVersion = C1458277l.A00;
        this.A04 = wamCall;
        String A0Z = C18280x3.A0Z(this.A00.A03(), "call_rating_last_call");
        WamCall wamCall2 = this.A04;
        if (wamCall2 != null) {
            str = wamCall2.callRandomId;
        } else {
            str = null;
        }
        if (str == null || !str.equals(A0Z)) {
            this.A05 = bundle.getString("timeSeriesDir");
            this.A07 = bundle.getBoolean("uploadFieldStat", false);
            WamCall wamCall3 = this.A04;
            if (wamCall3 != null) {
                wamCall3.userRating = AnonymousClass0x2.A0T();
            }
            return true;
        }
        Log.i("{CallRatingViewModel}/ignore duplicate ratings");
        return false;
    }

    public final void A0D(C998558l r4, boolean z) {
        HashSet hashSet = this.A0E;
        Integer valueOf = Integer.valueOf(r4.ordinal());
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        C18320x8.A18(this.A0A, AnonymousClass0x7.A1S(hashSet));
    }

    public CallRatingViewModel(C106155Xv r2, AnonymousClass5Z0 r3, AnonymousClass364 r4, AnonymousClass1VX r5) {
        C18260x0.A0Q(r5, r4);
        C162457s7.A0J(r2, 4);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
