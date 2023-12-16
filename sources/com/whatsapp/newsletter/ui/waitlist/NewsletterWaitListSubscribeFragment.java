package com.whatsapp.newsletter.ui.waitlist;

import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Y9;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass5YD;
import X.AnonymousClass5Yj;
import X.C003203q;
import X.C005205m;
import X.C107385bE;
import X.C107395bF;
import X.C109375eW;
import X.C110065fd;
import X.C162457s7;
import X.C179608jQ;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C70023Zo;
import X.C88694ab;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.util.Collections;
import java.util.List;

public final class NewsletterWaitListSubscribeFragment extends Hilt_NewsletterWaitListSubscribeFragment {
    public AnonymousClass33p A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        View findViewById = view.findViewById(R.id.notify_me_button);
        View findViewById2 = view.findViewById(R.id.dismiss_button);
        AnonymousClass33p r0 = this.A00;
        if (r0 != null) {
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r0), "newsletter_wait_list_subscription")) {
                AnonymousClass002.A09(view, R.id.wait_list_subscription_subtitle).setText(R.string.f11nameremoved);
                C162457s7.A0H(findViewById);
                findViewById.setVisibility(8);
            }
            C18300x5.A19(findViewById, this, 43);
            C18300x5.A19(findViewById2, this, 44);
            return;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public static final void A00(NewsletterWaitListSubscribeFragment newsletterWaitListSubscribeFragment) {
        C179608jQ r4;
        String className;
        C003203q A0Q = newsletterWaitListSubscribeFragment.A0Q();
        if ((A0Q instanceof C179608jQ) && (r4 = (C179608jQ) A0Q) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r4;
            AnonymousClass33T r0 = newsletterWaitListActivity.A00;
            if (r0 == null) {
                throw C18270x1.A0S("waNotificationManager");
            } else if (r0.A00.A01()) {
                AnonymousClass5YD r2 = newsletterWaitListActivity.A01;
                if (r2 != null) {
                    AnonymousClass1Y9 r1 = new AnonymousClass1Y9();
                    r1.A01 = 2;
                    r2.A03.BhD(r1);
                    C18270x1.A0l(C18270x1.A03(newsletterWaitListActivity.A09), "newsletter_wait_list_subscription", true);
                    ComponentName callingActivity = newsletterWaitListActivity.getCallingActivity();
                    if (callingActivity != null && (className = callingActivity.getClassName()) != null && className.equals("com.whatsapp.Conversation")) {
                        C18290x4.A18(newsletterWaitListActivity);
                    } else if (newsletterWaitListActivity.A06.A02 != AnonymousClass0GC.DESTROYED) {
                        View view = newsletterWaitListActivity.A00;
                        String string = newsletterWaitListActivity.getString(R.string.f11nameremoved);
                        List emptyList = Collections.emptyList();
                        C110065fd r3 = new C110065fd(newsletterWaitListActivity, C88694ab.A01(view, string, 2000), newsletterWaitListActivity.A08, emptyList, false);
                        r3.A04(new C109375eW(newsletterWaitListActivity, 42), R.string.f11nameremoved);
                        r3.A02(AnonymousClass5Yj.A02(newsletterWaitListActivity.A00.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                        r3.A05(new C70023Zo(newsletterWaitListActivity, 49));
                        r3.A01();
                        newsletterWaitListActivity.A02 = r3;
                    }
                } else {
                    throw C18270x1.A0S("newsletterLogging");
                }
            } else if (C107385bE.A0A() && !newsletterWaitListActivity.A09.A2O("android.permission.POST_NOTIFICATIONS")) {
                String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
                RequestPermissionActivity.A0l(newsletterWaitListActivity.A09, strArr);
                C005205m.A02(newsletterWaitListActivity, strArr, 0);
            } else if (C107385bE.A04()) {
                C107395bF.A06(newsletterWaitListActivity);
            } else {
                C107395bF.A05(newsletterWaitListActivity);
            }
        }
        super.A1K();
    }

    public void A1K() {
        C179608jQ r4;
        super.A1K();
        C003203q A0Q = A0Q();
        if ((A0Q instanceof C179608jQ) && (r4 = (C179608jQ) A0Q) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r4;
            AnonymousClass5YD r3 = newsletterWaitListActivity.A01;
            if (r3 != null) {
                boolean A1W = C18280x3.A1W(AnonymousClass1Hf.A27(newsletterWaitListActivity), "newsletter_wait_list_subscription");
                AnonymousClass1Y9 r1 = new AnonymousClass1Y9();
                r1.A01 = C18290x4.A0a();
                r1.A00 = Boolean.valueOf(A1W);
                r3.A03.BhD(r1);
                newsletterWaitListActivity.finish();
                return;
            }
            throw C18270x1.A0S("newsletterLogging");
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1K();
    }
}
