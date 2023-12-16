package X;

import android.app.Activity;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashMap;

/* renamed from: X.9Su  reason: invalid class name and case insensitive filesystem */
public class C194419Su {
    public final Activity A00;
    public final C55682qk A01;
    public final KeyboardPopupLayout A02;
    public final C620633i A03;
    public final AnonymousClass33p A04;
    public final C620733j A05;
    public final AnonymousClass5RE A06;
    public final AnonymousClass5IY A07;
    public final C27821ej A08;
    public final AnonymousClass5Y0 A09;
    public final EmojiSearchProvider A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final AnonymousClass5PB A0D;
    public final C106095Xp A0E;
    public final C55922r8 A0F;
    public final C60152y5 A0G;
    public final AnonymousClass10k A0H;
    public final C105895Wv A0I;
    public final HashMap A0J = AnonymousClass001.A0t();

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0J;
        if (hashMap.containsKey(1) && (popupWindow = (PopupWindow) hashMap.get(1)) != null) {
            popupWindow.dismiss();
        }
    }

    public void A01(int i) {
        AnonymousClass4Rn r0;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0J;
        for (Number number : hashMap.keySet()) {
            if (!(number.intValue() == i || (popupWindow = (PopupWindow) hashMap.get(number)) == null)) {
                popupWindow.dismiss();
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf) && (r0 = (AnonymousClass4Rn) hashMap.get(valueOf)) != null) {
            r0.A09();
        }
    }

    public C194419Su(Activity activity, C55682qk r3, KeyboardPopupLayout keyboardPopupLayout, C620633i r5, AnonymousClass33p r6, C620733j r7, AnonymousClass5RE r8, AnonymousClass5IY r9, C27821ej r10, AnonymousClass5Y0 r11, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r13, AnonymousClass4FV r14, AnonymousClass5PB r15, C106095Xp r16, C55922r8 r17, C60152y5 r18, AnonymousClass10k r19, C105895Wv r20) {
        this.A0B = r13;
        this.A0E = r16;
        this.A0I = r20;
        this.A01 = r3;
        this.A0C = r14;
        this.A09 = r11;
        this.A08 = r10;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A0F = r17;
        this.A0A = emojiSearchProvider;
        this.A04 = r6;
        this.A0G = r18;
        this.A0D = r15;
        this.A0H = r19;
        this.A00 = activity;
        this.A02 = keyboardPopupLayout;
        this.A06 = r8;
    }
}
