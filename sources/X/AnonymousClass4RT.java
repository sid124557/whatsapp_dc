package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.EmojiDescriptor;
import java.util.List;

/* renamed from: X.4RT  reason: invalid class name */
public class AnonymousClass4RT extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public C55682qk A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public C620633i A05;
    public C620733j A06;
    public AnonymousClass5Y0 A07;
    public C60152y5 A08;
    public C116855qy A09;
    public boolean A0A;
    public final C103445Mz A0B;

    public void setMessage(C30451mT r9, List list) {
        int i;
        String str;
        if (r9 == null) {
            this.A02.A0A("fmessagepoll-null", true, "fMessagePoll null on search");
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (list == null || list.isEmpty()) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        String str2 = r9.A03;
        C620733j r7 = this.A06;
        CharSequence A012 = C107075ae.A01(context, r7, str2, list);
        StringBuilder A0o = AnonymousClass001.A0o();
        boolean z = false;
        for (C60142y4 r1 : r9.A05) {
            if (z) {
                str = ", ";
            } else {
                str = "";
            }
            A0o.append(str);
            A0o.append(r1.A03);
            z = true;
        }
        A00(this.A04, C107075ae.A01(getContext(), r7, A0o, list), list);
        A00(textEmojiLabel, A012, list);
    }

    public final void A00(TextEmojiLabel textEmojiLabel, CharSequence charSequence, List list) {
        Context context = getContext();
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        TextPaint paint = textEmojiLabel2.getPaint();
        int maxLines = textEmojiLabel2.getMaxLines();
        int measuredWidth = ((View) textEmojiLabel2.getParent()).getMeasuredWidth();
        AnonymousClass5Y0 r4 = this.A07;
        C620633i r2 = this.A05;
        CharSequence charSequence2 = charSequence;
        C620633i r16 = r2;
        AnonymousClass4qE r13 = new AnonymousClass4qE(context, paint, r16, this.A06, r4, this.A08, charSequence2, list, maxLines, measuredWidth);
        AnonymousClass91M r11 = new AnonymousClass91M(textEmojiLabel2, 1);
        if (charSequence2.length() <= 768) {
            C94284qs r12 = new C94284qs(charSequence2);
            int length = charSequence2.length();
            int i = 0;
            while (i < length) {
                r12.A00 = i;
                long A002 = EmojiDescriptor.A00(r12, false);
                int A022 = r12.A02(i, A002);
                if (A002 == -1) {
                    i += A022;
                }
            }
            try {
                r11.BPS(r13.call());
                return;
            } catch (C13860nr unused) {
                return;
            }
        }
        textEmojiLabel2.setPlaceholder(80);
        this.A0B.A02(r11, r13);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4RT(Context context, C103445Mz r5) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A01(A002);
            this.A07 = C64333Db.A3o(A002);
            this.A05 = C64333Db.A2o(A002);
            this.A06 = C64333Db.A2t(A002);
            this.A08 = C64333Db.A74(A002);
        }
        this.A0B = r5;
        C86634Kw.A1H(this, 1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A03 = AnonymousClass0x7.A0K(this, R.id.search_row_poll_name);
        this.A04 = AnonymousClass0x7.A0K(this, R.id.search_row_poll_options);
        AnonymousClass5Yj.A09(context, this);
        this.A00 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A01 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        C106905aM.A04(this.A03);
        this.A03.setMaxLines(2);
        this.A04.setMaxLines(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }
}
