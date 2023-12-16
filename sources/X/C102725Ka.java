package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.5Ka  reason: invalid class name and case insensitive filesystem */
public final class C102725Ka {
    public final C27821ej A00;
    public final AnonymousClass5Y0 A01;
    public final C104185Pz A02;
    public final AnonymousClass1VX A03;
    public final C60152y5 A04;
    public final Map A05;
    public final C73853gB A06;

    public C102725Ka(C27821ej r10, AnonymousClass5Y0 r11, C104185Pz r12, AnonymousClass1VX r13, C60152y5 r14, C73853gB r15) {
        int A052 = C18300x5.A05(r13, r11, 1);
        C162457s7.A0J(r10, 3);
        C162457s7.A0J(r14, 4);
        C162457s7.A0J(r12, 5);
        this.A03 = r13;
        this.A01 = r11;
        this.A00 = r10;
        this.A04 = r14;
        this.A02 = r12;
        this.A06 = r15;
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[8];
        AnonymousClass3Z6.A04(Integer.valueOf(R.id.emoji_people_btn), Integer.valueOf(R.drawable.selector_emoji_people), r3);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_activity_btn), Integer.valueOf(R.drawable.selector_emoji_activity), r3, 1);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_flags_btn), Integer.valueOf(R.drawable.selector_emoji_flags), r3, A052);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_food_btn), Integer.valueOf(R.drawable.selector_emoji_food), r3, 3);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_nature_btn), Integer.valueOf(R.drawable.selector_emoji_nature), r3, 4);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_objects_btn), Integer.valueOf(R.drawable.selector_emoji_objects), r3, 5);
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.emoji_symbols_btn), Integer.valueOf(R.drawable.selector_emoji_symbols), r3, 6);
        r3[7] = AnonymousClass3Z6.A01(Integer.valueOf(R.id.emoji_travel_btn), R.drawable.selector_emoji_travel);
        this.A05 = C73813g7.A0F(r3);
    }
}
