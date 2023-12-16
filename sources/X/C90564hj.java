package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4hj  reason: invalid class name and case insensitive filesystem */
public class C90564hj extends AnonymousClass6J5 {
    public int A00;
    public final Button A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C111095hX A04;
    public final C56972sr A05;
    public final C64773Ex A06;
    public final C56422rx A07;
    public final AnonymousClass5ZU A08;
    public final UserJid A09;

    public /* bridge */ /* synthetic */ void A07(C147037Co r11) {
        String str;
        int i;
        View view = this.A0H;
        view.setVisibility(0);
        LinearLayout linearLayout = this.A02;
        linearLayout.setVisibility(8);
        Button button = this.A01;
        button.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(8);
        int i2 = this.A00;
        if (i2 != 1) {
            if (i2 == 2) {
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                i = R.string.f11nameremoved;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    linearLayout.setVisibility(0);
                    textView.setVisibility(0);
                    i = R.string.f11nameremoved;
                } else if (i2 == 5) {
                    linearLayout.setVisibility(8);
                    textView.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            textView.setText(i);
            return;
        }
        C56972sr r0 = this.A05;
        UserJid userJid = this.A09;
        if (!r0.A0a(userJid)) {
            linearLayout.setVisibility(0);
            C55502qS A012 = this.A07.A01(userJid);
            if (A012 == null) {
                str = null;
            } else {
                str = A012.A08;
            }
            AnonymousClass3ZH A0A = this.A06.A0A(userJid);
            Context context = view.getContext();
            Object[] objArr = new Object[1];
            if (C107575bX.A0F(str)) {
                str = this.A08.A0H(A0A);
            }
            objArr[0] = str;
            AnonymousClass001.A0y(context, textView, objArr, R.string.f11nameremoved);
            button.setText(R.string.f11nameremoved);
            button.setVisibility(0);
            textView.setVisibility(0);
            C18320x8.A16(button, A0A, this, 11);
        }
    }

    public C90564hj(View view, C111095hX r3, C56972sr r4, C64773Ex r5, C56422rx r6, AnonymousClass5ZU r7, UserJid userJid) {
        super(view);
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = C86664Kz.A0v(view, R.id.catalog_list_footer_end_of_results);
        this.A03 = AnonymousClass002.A09(view, R.id.catalog_list_footer_end_of_results_title);
        this.A08 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A09 = userJid;
        this.A01 = (Button) view.findViewById(R.id.end_of_results_button);
    }
}
