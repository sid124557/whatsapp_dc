package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2pn  reason: invalid class name and case insensitive filesystem */
public final class C55102pn {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextEmojiLabel A09;
    public final C620733j A0A;

    public final void A00(Runnable runnable, int i) {
        View view = this.A01;
        view.setClickable(true);
        AnonymousClass0x2.A10(view, runnable, 28);
        ImageView imageView = this.A04;
        C620733j r1 = this.A0A;
        Context context = this.A00;
        C18270x1.A0d(context, imageView, r1, R.drawable.ic_settings_terms_policy);
        AnonymousClass0x7.A14(context, imageView);
        TextView textView = this.A07;
        textView.setText(i);
        AnonymousClass0x2.A0q(context, textView, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A09.setVisibility(0);
        this.A06.setVisibility(8);
        this.A02.setVisibility(8);
        this.A03.setVisibility(8);
        this.A05.setVisibility(8);
    }

    public final void A01(Runnable runnable, int i, long j, long j2, long j3, boolean z, boolean z2) {
        Context context;
        TextView textView;
        int A042;
        C620733j r8;
        String A052;
        if (!z || z2) {
            View view = this.A01;
            view.setEnabled(true);
            view.setOnClickListener(new C989653x(runnable, 30));
            ImageView imageView = this.A04;
            imageView.setImageResource(R.drawable.ic_action_download);
            context = this.A00;
            AnonymousClass0x7.A14(context, imageView);
            TextView textView2 = this.A07;
            textView2.setText(i);
            AnonymousClass0x2.A0q(context, textView2, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
            textView = this.A06;
            A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        } else {
            View view2 = this.A01;
            view2.setEnabled(false);
            view2.setOnClickListener((View.OnClickListener) null);
            ImageView imageView2 = this.A04;
            imageView2.setImageResource(R.drawable.ic_action_schedule);
            context = this.A00;
            C107335b8.A0E(imageView2, AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
            TextView textView3 = this.A07;
            textView3.setText(R.string.f11nameremoved);
            AnonymousClass0x2.A0q(context, textView3, R.color.f5nameremoved);
            textView = this.A06;
            A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        }
        textView.setTextColor(A042);
        textView.setVisibility(0);
        long j4 = j2;
        if (j > 0) {
            Object[] A0M = AnonymousClass002.A0M();
            r8 = this.A0A;
            A0M[0] = C107505bQ.A05(r8, j4);
            A052 = AnonymousClass002.A0F(context, AnonymousClass35V.A03(r8, j), A0M, 1, R.string.f11nameremoved);
        } else {
            r8 = this.A0A;
            A052 = C107505bQ.A05(r8, j4);
        }
        textView.setText(A052);
        View view3 = this.A02;
        if (z2) {
            view3.setVisibility(0);
            this.A03.setVisibility(0);
        } else {
            view3.setVisibility(8);
            this.A03.setVisibility(8);
        }
        TextView textView4 = this.A05;
        textView4.setVisibility(0);
        AnonymousClass001.A0y(context, textView4, new Object[]{C100575Bl.A00(r8, 1, j3)}, R.string.f11nameremoved);
        this.A09.setVisibility(8);
    }

    public final void A02(Runnable runnable, long j, long j2, long j3) {
        C620733j r6;
        String A052;
        View view = this.A01;
        view.setEnabled(true);
        view.setOnClickListener(new C989653x(runnable, 31));
        ImageView imageView = this.A04;
        imageView.setImageResource(R.drawable.ic_action_share);
        Context context = this.A00;
        AnonymousClass0x7.A14(context, imageView);
        TextView textView = this.A07;
        textView.setText(R.string.f11nameremoved);
        AnonymousClass0x2.A0q(context, textView, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        TextView textView2 = this.A06;
        textView2.setVisibility(0);
        AnonymousClass0x2.A0q(context, textView2, R.color.f5nameremoved);
        if (j > 0) {
            Object[] A0M = AnonymousClass002.A0M();
            r6 = this.A0A;
            A0M[0] = C107505bQ.A05(r6, j2);
            A052 = AnonymousClass002.A0F(context, AnonymousClass35V.A03(r6, j), A0M, 1, R.string.f11nameremoved);
        } else {
            r6 = this.A0A;
            A052 = C107505bQ.A05(r6, j2);
        }
        textView2.setText(A052);
        this.A02.setVisibility(0);
        TextView textView3 = this.A05;
        textView3.setVisibility(0);
        AnonymousClass001.A0y(context, textView3, new Object[]{C100575Bl.A00(r6, 1, j3)}, R.string.f11nameremoved);
        this.A03.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public final void A03(String str, String str2) {
        C18270x1.A14(str, str2);
        this.A01.setClickable(false);
        ImageView imageView = this.A04;
        imageView.setImageResource(R.drawable.ic_action_schedule);
        Context context = this.A00;
        C107335b8.A0E(imageView, AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
        TextView textView = this.A07;
        textView.setText(R.string.f11nameremoved);
        AnonymousClass0x2.A0q(context, textView, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        TextView textView2 = this.A06;
        textView2.setVisibility(0);
        textView2.setText(str);
        AnonymousClass0x2.A0q(context, textView2, R.color.f5nameremoved);
        this.A02.setVisibility(8);
        TextView textView3 = this.A05;
        textView3.setVisibility(0);
        textView3.setText(str2);
        this.A09.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public C55102pn(Context context, View view, C620733j r4) {
        C18260x0.A0V(view, context, r4);
        this.A00 = context;
        this.A0A = r4;
        this.A05 = AnonymousClass0x2.A0I(view, R.id.report_item_footer);
        this.A08 = AnonymousClass0x2.A0I(view, R.id.report_title);
        this.A07 = AnonymousClass0x2.A0I(view, R.id.report_button_title);
        this.A06 = AnonymousClass0x2.A0I(view, R.id.report_button_subtitle);
        this.A09 = (TextEmojiLabel) C18280x3.A0E(view, R.id.report_item_header);
        this.A04 = (ImageView) C18280x3.A0E(view, R.id.report_button_icon);
        this.A01 = C18280x3.A0E(view, R.id.report_button);
        this.A02 = C18280x3.A0E(view, R.id.report_delete);
        this.A03 = C18280x3.A0E(view, R.id.report_delete_divider);
    }
}
