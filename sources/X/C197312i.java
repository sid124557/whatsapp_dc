package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.12i  reason: invalid class name and case insensitive filesystem */
public class C197312i extends C05570Ua {
    public ImageView A00;
    public ImageView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass5YB A05;
    public final C56942so A06;
    public final C64653Ej A07;
    public final C64773Ex A08;
    public final C105365Uq A09;
    public final C56982ss A0A;
    public final C56892sj A0B;
    public final C59862xc A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass4FS A0E;

    public C197312i(View view, AnonymousClass64J r4, C56942so r5, C64653Ej r6, C64773Ex r7, C105365Uq r8, C56982ss r9, C56892sj r10, C59862xc r11, AnonymousClass1VX r12, AnonymousClass4FS r13) {
        super(view);
        this.A0D = r12;
        this.A0E = r13;
        this.A0A = r9;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
        this.A0C = r11;
        this.A06 = r5;
        this.A0B = r10;
        this.A02 = AnonymousClass0x7.A0K(view, R.id.name);
        this.A05 = AnonymousClass5YB.A00(view, r4, R.id.name);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.status);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.avatar);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.group_chat_info_pin_indicator);
        this.A03 = AnonymousClass0x7.A0K(view, R.id.community_new);
        AnonymousClass0YY.A06(this.A00, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
