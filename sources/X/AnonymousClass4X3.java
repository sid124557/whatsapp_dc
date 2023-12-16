package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.4X3  reason: invalid class name */
public final class AnonymousClass4X3 extends AnonymousClass0R6 {
    public final LayoutInflater A00;
    public final AnonymousClass5M2 A01;
    public final AnonymousClass64J A02;
    public final C105365Uq A03;
    public final NewsletterInfoActivity A04;
    public final List A05 = AnonymousClass001.A0s();
    public final AnonymousClass66R A06 = C154517dI.A01(new C119945xn(this));
    public final boolean A07;

    public final void A0K(List list) {
        List list2 = this.A05;
        list2.clear();
        if (this.A07 || list.size() <= 10) {
            list2.addAll(list);
        } else {
            list2.addAll(list.subList(0, 10));
            list2.add(C96884x9.A00);
        }
        A05();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new C96904xB(C18310x6.A0I(this.A00, viewGroup, R.layout.f8nameremoved, false), this);
        }
        if (i == 1) {
            return new C96894xA(C18310x6.A0I(this.A00, viewGroup, R.layout.f8nameremoved, false), this);
        }
        throw AnonymousClass000.A0G("View type not supported ", AnonymousClass001.A0o(), i);
    }

    public int A0G() {
        return this.A05.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        C88494Yy r102 = (C88494Yy) r10;
        C162457s7.A0J(r102, 0);
        AnonymousClass5BP r1 = (AnonymousClass5BP) this.A05.get(i);
        if (r102 instanceof C96904xB) {
            C96904xB r103 = (C96904xB) r102;
            C162457s7.A0J(r1, 0);
            C626936e.A0C(r1 instanceof C96874x8);
            AnonymousClass3ZH r4 = ((C96874x8) r1).A00;
            AnonymousClass5YB r7 = r103.A01;
            TextEmojiLabel textEmojiLabel = r7.A02;
            textEmojiLabel.setText((CharSequence) null);
            AnonymousClass4X3 r3 = r103.A04;
            NewsletterInfoActivity newsletterInfoActivity = r3.A04;
            AnonymousClass5Yj.A0B(newsletterInfoActivity, textEmojiLabel, R.attr.f3nameremoved, R.color.f5nameremoved);
            TextEmojiLabel textEmojiLabel2 = r103.A00;
            AnonymousClass0x2.A0q(newsletterInfoActivity, textEmojiLabel2, R.color.f5nameremoved);
            AnonymousClass5UY r6 = r103.A03;
            AnonymousClass0x2.A0q(newsletterInfoActivity, (TextView) r6.A04(), R.color.f5nameremoved);
            r6.A04().setBackgroundResource(R.drawable.group_info_label_gray);
            View A042 = r6.A04();
            C162457s7.A0D(A042);
            A042.setVisibility(0);
            ((TextView) r6.A04()).setText(R.string.f11nameremoved);
            r7.A08(r4);
            r3.A03.A08(r103.A02, r4);
            if (r4.A0X != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0K((List) null, r4.A0X);
            } else {
                textEmojiLabel2.setVisibility(8);
            }
            View view = r103.A0H;
            view.setClickable(true);
            view.setOnCreateContextMenuListener(new C124146Bd(r4, 2, r3));
            C18300x5.A19(view, r103, 24);
            view.setBackgroundResource(R.drawable.selector_orange_gradient);
            return;
        }
        C96894xA r104 = (C96894xA) r102;
        C989653x.A00(r104.A00, r104.A01, 15);
    }

    public int getItemViewType(int i) {
        Object obj = this.A05.get(i);
        if (obj instanceof C96874x8) {
            return 0;
        }
        if (obj instanceof C96884x9) {
            return 1;
        }
        throw C73153f1.A00();
    }

    public AnonymousClass4X3(LayoutInflater layoutInflater, AnonymousClass5M2 r3, AnonymousClass64J r4, C105365Uq r5, NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        C18260x0.A0V(r4, r3, newsletterInfoActivity);
        C162457s7.A0J(r5, 5);
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = newsletterInfoActivity;
        this.A00 = layoutInflater;
        this.A03 = r5;
        this.A07 = z;
    }

    public long A0B(int i) {
        return (long) i;
    }
}
