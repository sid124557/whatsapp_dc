package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.4LD  reason: invalid class name */
public class AnonymousClass4LD extends Dialog implements C185458ti, C182608oh, C182618oi {
    public int A00;
    public C89224c7 A01;
    public AnonymousClass5S9 A02;
    public AnonymousClass5OO A03;
    public AnonymousClass7L6 A04;
    public AnonymousClass5Oa A05;
    public AnonymousClass5Q1 A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C55682qk A0C;
    public final C103215Lz A0D;
    public final C89654ea A0E;
    public final AnonymousClass4CE A0F = new C1891990j(this, 2);
    public final C620633i A0G;
    public final AnonymousClass33p A0H;
    public final C620733j A0I;
    public final C56982ss A0J;
    public final AnonymousClass5IY A0K;
    public final C27821ej A0L;
    public final AnonymousClass5Y0 A0M;
    public final EmojiSearchProvider A0N;
    public final AnonymousClass1VX A0O;
    public final C105385Us A0P;
    public final C60152y5 A0Q;
    public final C105895Wv A0R;
    public final List A0S;
    public final boolean A0T;

    public void BOV() {
        this.A0A = true;
        onDismiss();
    }

    public void BZc(boolean z) {
        this.A08 = true;
        this.A0B = z;
        onDismiss();
    }

    public /* synthetic */ void BM5() {
    }

    public void BfV() {
        C105385Us r3 = this.A0P;
        int A052 = C86604Kt.A05(r3.A06);
        if (A052 == 2) {
            r3.A05(3);
        } else if (A052 == 3) {
            r3.A05(2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C620733j r10 = this.A0I;
        C107555bV.A08(getWindow(), r10);
        C89654ea r9 = this.A0E;
        C95814uZ r2 = null;
        setContentView(LayoutInflater.from(r9).inflate(R.layout.f8nameremoved, (ViewGroup) null));
        View A002 = AnonymousClass0HG.A00(this, R.id.main);
        C56982ss r1 = this.A0J;
        AnonymousClass5Y0 r32 = this.A0M;
        C620633i r27 = this.A0G;
        C60152y5 r0 = this.A0Q;
        C60152y5 r30 = r0;
        AnonymousClass5OO r14 = new AnonymousClass5OO(r27, r1, r32, (CaptionView) C06560Yg.A02(A002, R.id.input_container_inner), r0);
        this.A03 = r14;
        boolean z = this.A0T;
        CaptionView captionView = r14.A04;
        captionView.A04 = z;
        CharSequence charSequence = this.A07;
        List list = this.A0S;
        if (list.size() == 1) {
            r2 = (C95814uZ) C18290x4.A0k(list);
        }
        ViewGroup A0I2 = C86644Kx.A0I(A002, R.id.mention_attach);
        C105385Us r4 = this.A0P;
        MentionableEntry mentionableEntry = captionView.A0E;
        mentionableEntry.setScrollBarStyle(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        mentionableEntry.setImeOptions(6);
        mentionableEntry.setInputType(147457);
        captionView.A0A.setVisibility(0);
        captionView.setCaptionEditTextView(charSequence);
        C1897492m A0G2 = AnonymousClass4L0.A0G(r14, 268);
        AnonymousClass08M r02 = r4.A06;
        r02.A0B(r9, A0G2);
        r14.A00((Integer) r02.A07());
        captionView.setupMentions(r2, A0I2, A002);
        captionView.setNewLineEnabledForNewsletter(r2);
        LinearLayout linearLayout = captionView.A0B;
        linearLayout.setVisibility(0);
        captionView.A08.setVisibility(8);
        AlphaAnimation A0H2 = C86604Kt.A0H();
        C86614Ku.A1K(A0H2, 220);
        linearLayout.startAnimation(A0H2);
        mentionableEntry.startAnimation(A0H2);
        this.A03.A04.setCaptionButtonsListener(this);
        AnonymousClass5OO r12 = this.A03;
        CaptionView captionView2 = r12.A04;
        AnonymousClass5Y0 r20 = r12.A03;
        C60152y5 r15 = r12.A05;
        MentionableEntry mentionableEntry2 = captionView2.A0E;
        C620733j r142 = captionView2.A00;
        AnonymousClass487 r3 = captionView2.A01;
        TextView A0G3 = C18300x5.A0G(captionView2, R.id.counter);
        boolean z2 = captionView2.A0F;
        mentionableEntry2.addTextChangedListener(new AnonymousClass52T(mentionableEntry2, A0G3, r12.A01, r142, r3, r20, r15, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, true, z2));
        if (z2) {
            mentionableEntry2.addTextChangedListener(new AnonymousClass52O(mentionableEntry2, captionView2.A00));
        }
        mentionableEntry2.setOnEditorActionListener(new AnonymousClass90I(this, 1));
        mentionableEntry2.A01 = new C112895kY(captionView2, this);
        AnonymousClass5Q1 r13 = new AnonymousClass5Q1(C86664Kz.A10(A002, R.id.send), r10);
        this.A06 = r13;
        int i = this.A00;
        AnonymousClass1VX r33 = this.A0O;
        r13.A00(i);
        AnonymousClass5Q1 r122 = this.A06;
        AnonymousClass54E.A00(r122.A01, this, r122, 18);
        this.A05 = this.A0D.A00((RecipientsView) C06560Yg.A02(A002, R.id.media_recipients));
        View A022 = C06560Yg.A02(A002, R.id.input_container);
        boolean z3 = this.A09;
        AnonymousClass5Oa r03 = this.A05;
        if (z3) {
            r03.A04.setRecipientsListener(this);
        } else {
            RecipientsView recipientsView = r03.A04;
            recipientsView.A05 = false;
            recipientsView.A00 = R.color.f5nameremoved;
        }
        this.A05.A00((C108845de) r4.A04.A07(), list, true);
        boolean z4 = !C86634Kw.A1Y(r4.A01);
        getContext();
        if (z4) {
            C154367d3.A00(A022, r10);
        } else {
            C154367d3.A01(A022, r10);
        }
        this.A06.A01(z4);
        getWindow().setLayout(-1, -1);
        if ((r9.getWindow().getAttributes().flags & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            getWindow().setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            getWindow().clearFlags(256);
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) A002.findViewById(R.id.main);
        C989653x.A00(keyboardPopupLayout, this, 6);
        C105895Wv r143 = this.A0R;
        C55682qk r132 = this.A0C;
        C27821ej r42 = this.A0L;
        AnonymousClass5IY r123 = this.A0K;
        EmojiSearchProvider emojiSearchProvider = this.A0N;
        AnonymousClass33p r6 = this.A0H;
        CaptionView captionView3 = this.A03.A04;
        C89224c7 r16 = new C89224c7(r9, captionView3.A0A, r132, keyboardPopupLayout, captionView3.A0E, r27, r6, r10, r123, r42, r32, emojiSearchProvider, r33, r30, r143);
        this.A01 = r16;
        r16.A0E = new C71533cG((Object) this, 49);
        AnonymousClass5S9 r124 = new AnonymousClass5S9(r9, r10, this.A01, r42, r32, (EmojiSearchContainer) A002.findViewById(R.id.emoji_search_container), r30);
        this.A02 = r124;
        r124.A00 = new C1894091e(this, 2);
        C89224c7 r22 = this.A01;
        r22.A0C(this.A0F);
        r22.A00 = R.drawable.ib_emoji;
        r22.A03 = R.drawable.ib_keyboard;
        getWindow().setSoftInputMode(5);
        this.A03.A04.A0E.A07(true);
    }

    public AnonymousClass4LD(C55682qk r3, C103215Lz r4, C89654ea r5, C620633i r6, AnonymousClass33p r7, C620733j r8, C56982ss r9, AnonymousClass5IY r10, C27821ej r11, AnonymousClass5Y0 r12, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r14, C105385Us r15, C60152y5 r16, C105895Wv r17, CharSequence charSequence, List list, int i, boolean z, boolean z2) {
        super(r5, R.style.f12nameremoved);
        this.A0S = list;
        this.A07 = charSequence;
        this.A00 = i;
        this.A09 = z;
        this.A0E = r5;
        this.A0O = r14;
        this.A0R = r17;
        this.A0C = r3;
        this.A0J = r9;
        this.A0M = r12;
        this.A0L = r11;
        this.A0G = r6;
        this.A0I = r8;
        this.A0K = r10;
        this.A0N = emojiSearchProvider;
        this.A0H = r7;
        this.A0P = r15;
        this.A0Q = r16;
        this.A0D = r4;
        this.A0T = z2;
    }

    public void onDismiss() {
        super.dismiss();
        if (this.A01.isShowing()) {
            this.A01.dismiss();
        }
        CaptionView captionView = this.A03.A04;
        this.A04 = new AnonymousClass7L6(new SpannedString(captionView.getCaptionText()), captionView.A0E.getStringText(), captionView.A0E.getMentions());
        this.A03.A04.A0E.A0C();
    }
}
