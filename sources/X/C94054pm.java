package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4pm  reason: invalid class name and case insensitive filesystem */
public final class C94054pm extends C87354Pi implements C185698u6 {
    public View A00 = findViewById(R.id.add_btn);
    public View A01 = findViewById(R.id.block_btn);
    public View A02 = findViewById(R.id.content);
    public View A03 = findViewById(R.id.dismiss_btn);
    public View A04 = findViewById(R.id.exit_group_btn);
    public View A05 = findViewById(R.id.not_spam_btn);
    public View A06 = findViewById(R.id.spam_btn);
    public TextView A07 = AnonymousClass002.A09(this, R.id.add_btn_text);
    public TextView A08 = AnonymousClass002.A09(this, R.id.block_btn_text);
    public TextView A09 = AnonymousClass002.A09(this, R.id.dismiss_btn_text);
    public TextView A0A = AnonymousClass002.A09(this, R.id.exit_group_btn_text);
    public TextView A0B = AnonymousClass002.A09(this, R.id.header);
    public TextView A0C = AnonymousClass002.A09(this, R.id.not_spam_btn_text);
    public TextView A0D = AnonymousClass002.A09(this, R.id.spam_btn_text);
    public TextEmojiLabel A0E = C86644Kx.A0M(this, R.id.group_privacy_info);
    public AnonymousClass5UU A0F;
    public C620633i A0G;
    public AnonymousClass1VX A0H;
    public C187958y5 A0I;

    public void BFg() {
        this.A02.setVisibility(8);
    }

    public void BjX(AnonymousClass7QG r8) {
        int i;
        int i2;
        int i3;
        this.A02.setVisibility(0);
        this.A06.setVisibility(r8.A0B);
        View view = this.A05;
        int i4 = r8.A0A;
        view.setVisibility(i4);
        View view2 = this.A01;
        int i5 = r8.A02;
        view2.setVisibility(i5);
        this.A00.setVisibility(r8.A00);
        this.A03.setVisibility(r8.A03);
        this.A04.setVisibility(r8.A04);
        TextEmojiLabel textEmojiLabel = this.A0E;
        int i6 = r8.A06;
        textEmojiLabel.setVisibility(i6);
        if (i4 == 0 && (i3 = r8.A09) != -1) {
            TextView textView = this.A0C;
            C18300x5.A13(C86654Ky.A0B(this, textView, i3), textView, r8.A08);
        }
        if (i5 == 0 && (i2 = r8.A01) != -1) {
            this.A08.setText(i2);
        }
        if (i6 == 0 && (i = r8.A05) != -1) {
            AnonymousClass0x2.A14(this.A0H, textEmojiLabel);
            AnonymousClass0x2.A12(textEmojiLabel, this.A0G);
            textEmojiLabel.setText(this.A0F.A00(C86624Kv.A0b(this, i)));
        }
        int i7 = r8.A07;
        if (i7 != -1) {
            TextView textView2 = this.A0B;
            C18300x5.A13(C86654Ky.A0B(this, textView2, i7), textView2, i7);
        }
    }

    public int getType() {
        return 0;
    }

    public boolean isVisible() {
        return C86604Kt.A1Y(this.A02);
    }

    public void setup(AnonymousClass5UU r3) {
        this.A0F = r3;
        C109475eg.A00(this.A06, this, r3, 37);
        C109475eg.A00(this.A01, this, r3, 38);
        C18290x4.A1G(this.A00, r3, 11);
        C18290x4.A1G(this.A05, r3, 12);
        C18290x4.A1G(this.A03, this, 13);
        C109475eg.A00(this.A04, this, r3, 39);
        C106905aM.A04(this.A0D);
        C106905aM.A04(this.A0C);
        C106905aM.A04(this.A08);
        C106905aM.A04(this.A07);
        C106905aM.A04(this.A0A);
    }

    public C94054pm(Context context) {
        super(context);
        View.inflate(context, R.layout.f8nameremoved, this);
    }
}
