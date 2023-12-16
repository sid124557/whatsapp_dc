package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.GridLayout;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.List;
import java.util.Set;

/* renamed from: X.5el  reason: invalid class name and case insensitive filesystem */
public class C109525el implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C109525el(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        C613930n r2;
        Set set;
        C1228966g r0;
        List list;
        switch (this.A03) {
            case 0:
                ((MediaViewFragment) this.A00).A1k((Context) this.A02, (InteractiveAnnotation) this.A01);
                return;
            case 1:
                C111095hX r3 = ((C96974xP) this.A00).A01;
                View view2 = ((C05570Ua) this.A01).A0H;
                r3.A0A(view2.getContext(), C627736r.A0l(view2.getContext(), (UserJid) this.A02, (Integer) null, true, true));
                return;
            case 2:
                C196211x r1 = (C196211x) this.A00;
                Context context = (Context) this.A01;
                r1.A01.A0A(context, C627736r.A0d(context, r1.A03, ((AnonymousClass1kV) ((AnonymousClass28E) this.A02)).A00));
                return;
            case 3:
                C196211x r02 = (C196211x) this.A00;
                Context context2 = (Context) this.A01;
                C111095hX r4 = r02.A01;
                C95804uY r32 = r02.A03;
                Intent A07 = C18320x8.A07();
                C627336j.A0E(A07, r32, context2.getPackageName(), "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity");
                A07.putExtra("newsletter-appeal-data", (AnonymousClass38T) this.A02);
                r4.A0A(context2, A07);
                return;
            case 4:
                Context context3 = (Context) this.A00;
                C95804uY r33 = ((C22711Pu) this.A01).A03;
                Intent A072 = C18320x8.A07();
                C627336j.A0E(A072, r33, context3.getPackageName(), "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity");
                A072.putExtra("newsletter-appeal-data", (AnonymousClass38T) this.A02);
                context3.startActivity(A072);
                return;
            case 5:
                C621433s.A00((Activity) this.A00, 130);
                ((Runnable) this.A01).run();
                return;
            case 6:
                ((View) this.A01).setEnabled(false);
                ((Runnable) this.A02).run();
                ((DialogFragment) this.A00).A1K();
                return;
            case 7:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                View view3 = (View) this.A01;
                Object obj = this.A02;
                GridLayout gridLayout = messageReplyActivity.A09;
                view3.performHapticFeedback(1, 2);
                AnimatorSet A74 = messageReplyActivity.A74(view3, (View) null, gridLayout);
                A74.addListener(new C1233568c(A74, messageReplyActivity, obj, 1));
                A74.start();
                return;
            case 8:
                Context context4 = (Context) this.A02;
                C162457s7.A0H(context4);
                ((C985251f) this.A00).A0B(context4, (InteractiveAnnotation) this.A01);
                return;
            case 9:
                Context context5 = (Context) this.A02;
                C162457s7.A0H(context5);
                ((C985551i) this.A00).A0I(context5, (InteractiveAnnotation) this.A01);
                return;
            case 12:
                r2 = (C613930n) this.A00;
                set = (Set) this.A01;
                r0 = (C1228966g) this.A02;
                break;
            case 13:
                Object obj2 = this.A00;
                C110065fd r03 = (C110065fd) this.A01;
                View.OnClickListener onClickListener = (View.OnClickListener) this.A02;
                if (!(obj2 == null || (list = r03.A03.A08) == null)) {
                    list.remove(obj2);
                }
                onClickListener.onClick(view);
                return;
            case 14:
                Object obj3 = this.A02;
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = ((C87854Wj) this.A00).A01;
                viewSharedContactArrayActivity.A04.A01(viewSharedContactArrayActivity, (UserJid) this.A01, ((AnonymousClass7NE) obj3).A03, (String) null);
                return;
            case 15:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = ((C87854Wj) this.A00).A01;
                ((C112455jl) viewSharedContactArrayActivity2.A02).Bpk(viewSharedContactArrayActivity2, (AnonymousClass3ZH) this.A02, 15, false);
                return;
            case 16:
                C148447Ik r5 = (C148447Ik) this.A01;
                Object obj4 = this.A02;
                ViewSharedContactArrayActivity viewSharedContactArrayActivity3 = ((C87854Wj) this.A00).A01;
                viewSharedContactArrayActivity3.A04.A01(viewSharedContactArrayActivity3, r5.A00, ((AnonymousClass7NE) obj4).A03, r5.A01);
                return;
            case 17:
                AnonymousClass5YA r52 = (AnonymousClass5YA) this.A00;
                AnonymousClass5JT r42 = (AnonymousClass5JT) this.A01;
                r52.A03.BkM(new C70163a3(r52, 1, this.A02));
                r2 = r42.A02;
                set = r42.A03;
                r0 = r42.A01;
                break;
            default:
                ((StatusPlaybackContactFragment) this.A00).A1X((AnonymousClass3ZH) this.A02, (AnonymousClass5LT) this.A01);
                return;
        }
        r2.A07(r0, set);
    }
}
