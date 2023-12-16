package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.9an  reason: invalid class name and case insensitive filesystem */
public class C196409an implements C185418tc {
    public View.OnFocusChangeListener A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public EmojiSearchContainer A08;
    public EmojiSearchKeyboardContainer A09;
    public GifSearchContainer A0A;
    public MentionableEntry A0B;
    public C196379ak A0C;
    public AnonymousClass39M A0D;
    public StickerView A0E;
    public Integer A0F;
    public boolean A0G;
    public final Context A0H;
    public final TextWatcher A0I = new C203959oa(this, 2);
    public final C620633i A0J;
    public final C620733j A0K;
    public final AnonymousClass487 A0L;
    public final AnonymousClass5Y0 A0M;
    public final AnonymousClass1VX A0N;
    public final C60152y5 A0O;
    public final AnonymousClass33O A0P;

    public void A00(AnonymousClass39M r13, Integer num) {
        this.A07.setVisibility(0);
        AnonymousClass33O r3 = this.A0P;
        StickerView stickerView = this.A0E;
        Context context = this.A0H;
        r3.A05(stickerView, r13, new C197799dt(this, r13, num), 1, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true, false);
    }

    public /* bridge */ /* synthetic */ void Axq(Object obj) {
        this.A0B.setText((String) obj);
    }

    public int B94() {
        AnonymousClass1VX r1 = this.A0N;
        if (!r1.A0X(3792) || !r1.A0X(5372)) {
            return R.layout.f8nameremoved;
        }
        return R.layout.f8nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004a, code lost:
        if (r2.A0X(5372) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BfU(android.view.View r13) {
        /*
            r12 = this;
            X.1VX r2 = r12.A0N
            boolean r0 = X.AnonymousClass29H.A00(r2)
            r12.A0G = r0
            r0 = 2131430744(0x7f0b0d58, float:1.8483198E38)
            android.widget.LinearLayout r0 = X.C86654Ky.A0N(r13, r0)
            r12.A06 = r0
            r0 = 2131429711(0x7f0b094f, float:1.8481102E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r12.A05 = r0
            r0 = 2131433546(0x7f0b184a, float:1.848888E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r12.A0B = r0
            r0 = 2131434216(0x7f0b1ae8, float:1.849024E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            r12.A03 = r0
            r0 = 2131430353(0x7f0b0bd1, float:1.8482405E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            r12.A0A = r0
            r0 = 3792(0xed0, float:5.314E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x004c
            r0 = 5372(0x14fc, float:7.528E-42)
            boolean r0 = r2.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            if (r1 == 0) goto L_0x0109
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            r12.A09 = r0
        L_0x005a:
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            r12.A01 = r0
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x008c
            r0 = 2131433979(0x7f0b19fb, float:1.8489759E38)
            android.widget.LinearLayout r1 = X.C86654Ky.A0N(r13, r0)
            r12.A07 = r1
            r0 = 2131433977(0x7f0b19f9, float:1.8489755E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            r12.A0E = r0
            android.widget.LinearLayout r1 = r12.A07
            r0 = 2131433982(0x7f0b19fe, float:1.8489765E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r12.A04 = r0
        L_0x008c:
            r0 = 2131432164(0x7f0b12e4, float:1.8486078E38)
            android.view.View r1 = r13.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00fc
            X.9ak r0 = r12.A0C
            X.AnonymousClass9LS.A00(r1, r0)
        L_0x009c:
            r0 = 2131432163(0x7f0b12e3, float:1.8486076E38)
            android.view.View r0 = X.C06560Yg.A02(r13, r0)
            r12.A02 = r0
            com.whatsapp.mentions.MentionableEntry r1 = r12.A0B
            android.text.TextWatcher r0 = r12.A0I
            r1.addTextChangedListener(r0)
            com.whatsapp.mentions.MentionableEntry r2 = r12.A0B
            android.content.Context r1 = r13.getContext()
            r0 = 2131896297(0x7f1227e9, float:1.9427451E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint(r0)
            com.whatsapp.mentions.MentionableEntry r3 = r12.A0B
            r0 = 1
            android.text.InputFilter[] r2 = new android.text.InputFilter[r0]
            r0 = 1024(0x400, float:1.435E-42)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r0)
            r0 = 0
            r2[r0] = r1
            r3.setFilters(r2)
            com.whatsapp.mentions.MentionableEntry r2 = r12.A0B
            r1 = 2
            X.9pA r0 = new X.9pA
            r0.<init>(r12, r1)
            r2.setOnFocusChangeListener(r0)
            X.5Y0 r7 = r12.A0M
            X.33i r4 = r12.A0J
            X.33j r5 = r12.A0K
            X.2y5 r8 = r12.A0O
            X.487 r6 = r12.A0L
            com.whatsapp.mentions.MentionableEntry r2 = r12.A0B
            r0 = 2131429187(0x7f0b0743, float:1.848004E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r13, r0)
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 30
            r11 = 1
            X.52T r1 = new X.52T
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.whatsapp.mentions.MentionableEntry r0 = r12.A0B
            r0.addTextChangedListener(r1)
            return
        L_0x00fc:
            r0 = 2131432163(0x7f0b12e3, float:1.8486076E38)
            android.view.View r1 = X.C06560Yg.A02(r13, r0)
            X.9ak r0 = r12.A0C
            r0.BfU(r1)
            goto L_0x009c
        L_0x0109:
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            r12.A08 = r0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196409an.BfU(android.view.View):void");
    }

    public C196409an(Context context, C620633i r4, C620733j r5, AnonymousClass487 r6, AnonymousClass5Y0 r7, AnonymousClass1VX r8, C196379ak r9, C60152y5 r10, AnonymousClass33O r11) {
        this.A0H = context;
        this.A0N = r8;
        this.A0M = r7;
        this.A0J = r4;
        this.A0K = r5;
        this.A0P = r11;
        this.A0O = r10;
        this.A0C = r9;
        this.A0L = r6;
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}
