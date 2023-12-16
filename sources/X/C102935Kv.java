package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5Kv  reason: invalid class name and case insensitive filesystem */
public class C102935Kv {
    public final View A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02;
    public final ImageButton A03;
    public final AnonymousClass4CE A04;
    public final C89224c7 A05;
    public final AnonymousClass5S9 A06;
    public final MentionableEntry A07;
    public final C105895Wv A08;

    public C102935Kv(Activity activity, View view, C55682qk r36, C620633i r37, AnonymousClass33p r38, C620733j r39, AnonymousClass487 r40, AnonymousClass5IY r41, C27821ej r42, AnonymousClass5Y0 r43, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r45, C95814uZ r46, C60152y5 r47, C105895Wv r48) {
        C1891990j r5 = new C1891990j(this, 1);
        this.A04 = r5;
        AnonymousClass6BG r2 = new AnonymousClass6BG((Object) this, 24);
        this.A02 = r2;
        View view2 = view;
        this.A01 = view2;
        C105895Wv r1 = r48;
        this.A08 = r1;
        this.A00 = view2.findViewById(R.id.emoji_btn_holder);
        MentionableEntry mentionableEntry = (MentionableEntry) C06560Yg.A02(view2, R.id.comment);
        this.A07 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C109095e4(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        mentionableEntry.setOnEditorActionListener(new AnonymousClass90I(this, 0));
        C60152y5 r21 = r47;
        C620633i r13 = r37;
        C620733j r15 = r39;
        AnonymousClass5Y0 r18 = r43;
        mentionableEntry.addTextChangedListener(new AnonymousClass52T(mentionableEntry, C18300x5.A0G(view2, R.id.counter), r13, r15, r40, r18, r21, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true));
        C95814uZ r8 = r46;
        if (mentionableEntry.A0K(r8)) {
            mentionableEntry.A0H(C86644Kx.A0I(view2, R.id.mention_attach), r8, false, true, true);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        this.A03 = imageButton;
        Activity activity2 = activity;
        C27821ej r17 = r42;
        C89224c7 r7 = new C89224c7(activity2, imageButton, r36, (C181568my) activity2.findViewById(R.id.main), mentionableEntry, r13, r38, r15, r41, r17, r18, emojiSearchProvider, r45, r21, r1);
        this.A05 = r7;
        AnonymousClass5S9 r9 = new AnonymousClass5S9(activity2, r15, r7, r17, r18, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container), r21);
        this.A06 = r9;
        r9.A00 = new C1894091e(this, 1);
        r7.A0C(r5);
        r7.A0E = new C71533cG((Object) this, 12);
        C86644Kx.A12(view2, r2);
    }
}
