package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.5Kn  reason: invalid class name and case insensitive filesystem */
public class C102855Kn {
    public final View A00;
    public final ViewTreeObserver.OnGlobalLayoutListener A01;
    public final AnonymousClass4CE A02;
    public final C89224c7 A03;
    public final AnonymousClass5S9 A04;
    public final C185458ti A05;
    public final MentionableEntry A06;
    public final C105895Wv A07;

    public C102855Kn(Activity activity, View view, C55682qk r39, C620633i r40, AnonymousClass33p r41, C620733j r42, AnonymousClass3ZH r43, AnonymousClass487 r44, AnonymousClass5IY r45, C27821ej r46, AnonymousClass5Y0 r47, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r49, C185458ti r50, C60152y5 r51, C105895Wv r52, String str, List list, boolean z) {
        C1891990j r1 = new C1891990j(this, 3);
        this.A02 = r1;
        AnonymousClass92I r0 = new AnonymousClass92I(this, 17);
        this.A01 = r0;
        View view2 = view;
        this.A00 = view2;
        C105895Wv r5 = r52;
        this.A07 = r5;
        C185458ti r9 = r50;
        this.A05 = r9;
        MentionableEntry mentionableEntry = (MentionableEntry) C06560Yg.A02(view2, R.id.caption);
        this.A06 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C109095e4(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        boolean z2 = z;
        mentionableEntry.setOnKeyListener(new C109805fD(this, z2));
        mentionableEntry.setOnEditorActionListener(new C167207zw(r9, this, z2));
        AnonymousClass5Y0 r19 = r47;
        C620733j r16 = r42;
        C620633i r14 = r40;
        C60152y5 r22 = r51;
        mentionableEntry.addTextChangedListener(new AnonymousClass52T(mentionableEntry, C18300x5.A0G(view2, R.id.counter), r14, r16, r44, r19, r22, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true));
        AnonymousClass3ZH r7 = r43;
        if (r43 != null && mentionableEntry.A0K(r7.A0H)) {
            ViewGroup A0I = C86644Kx.A0I(view2, R.id.mention_attach);
            mentionableEntry.A04 = view2;
            mentionableEntry.A0H(A0I, r7.A0H, true, false, false);
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            mentionableEntry.setMentionableText(str2, list);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        Activity activity2 = activity;
        C27821ej r18 = r46;
        AnonymousClass5IY r17 = r45;
        AnonymousClass33p r15 = r41;
        C55682qk r11 = r39;
        C89224c7 r8 = new C89224c7(activity2, imageButton, r11, (C181568my) activity2.findViewById(R.id.main), mentionableEntry, r14, r15, r16, r17, r18, r19, emojiSearchProvider, r49, r22, r5);
        this.A03 = r8;
        r8.A00 = R.drawable.ib_emoji;
        r8.A03 = R.drawable.ib_keyboard;
        C107335b8.A0C(imageButton.getContext(), imageButton, R.drawable.ib_emoji, R.color.f5nameremoved);
        AnonymousClass5S9 r10 = new AnonymousClass5S9(activity2, r16, r8, r18, r19, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container), r22);
        this.A04 = r10;
        r10.A00 = new C1894091e(this, 3);
        r8.A0C(r1);
        r8.A0E = new C117095rN(this, 19);
        C86644Kx.A12(view2, r0);
    }
}
