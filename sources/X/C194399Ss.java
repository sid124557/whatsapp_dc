package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

/* renamed from: X.9Ss  reason: invalid class name and case insensitive filesystem */
public class C194399Ss {
    public C69263Wi A00;
    public C29441ip A01;
    public C66543Lv A02;
    public C40602Ha A03;
    public C620933l A04;
    public AnonymousClass9U5 A05;
    public C197769dq A06;
    public AnonymousClass9U4 A07;
    public AnonymousClass9TR A08;
    public C194259Se A09;
    public AnonymousClass4FS A0A;
    public final AnonymousClass1VX A0B;
    public final C196709bc A0C;
    public final C1907099n A0D;
    public final C190839Aa A0E;
    public final AnonymousClass9TZ A0F;
    public final C160757oG A0G = C160757oG.A00("BrazilPaymentAccountActionsContainerPresenter", "payment-settings", "COMMON");
    public final C194529Tg A0H;

    public C194399Ss(C69263Wi r4, C29441ip r5, C66543Lv r6, AnonymousClass1VX r7, C196709bc r8, C40602Ha r9, C620933l r10, AnonymousClass9U5 r11, C1907099n r12, C197769dq r13, AnonymousClass9U4 r14, C190839Aa r15, AnonymousClass9TZ r16, AnonymousClass9TR r17, C194529Tg r18, C194259Se r19, AnonymousClass4FS r20) {
        this.A00 = r4;
        this.A0A = r20;
        this.A09 = r19;
        this.A07 = r14;
        this.A02 = r6;
        this.A04 = r10;
        this.A05 = r11;
        this.A08 = r17;
        this.A06 = r13;
        this.A01 = r5;
        this.A03 = r9;
        this.A0B = r7;
        this.A0C = r8;
        this.A0D = r12;
        this.A0F = r16;
        this.A0H = r18;
        this.A0E = r15;
    }

    public Dialog A00(Bundle bundle, C89644eZ r6, int i) {
        Context applicationContext = r6.getApplicationContext();
        String str = null;
        switch (i) {
            case 100:
                C19340zH A002 = AnonymousClass5V0.A00(r6);
                C19340zH.A01(applicationContext, A002, R.string.f11nameremoved);
                String string = applicationContext.getString(R.string.f11nameremoved);
                A002.A00.A0I(new C204219p0(r6, 84), string);
                return A002.create();
            case 101:
                String string2 = r6.getString(R.string.f11nameremoved);
                if (bundle != null) {
                    string2 = bundle.getString("message");
                    str = bundle.getString("title");
                }
                return A01(r6, string2, str, i);
            case 102:
                return A01(r6, r6.getString(R.string.f11nameremoved), r6.getString(R.string.f11nameremoved), i);
            default:
                return null;
        }
    }

    public final AnonymousClass043 A01(C89644eZ r7, CharSequence charSequence, CharSequence charSequence2, int i) {
        Context applicationContext = r7.getApplicationContext();
        C19340zH A012 = AnonymousClass5V0.A01(r7, R.style.f12nameremoved);
        A012.A0g(charSequence);
        A012.A0h(charSequence2);
        A012.A0i(true);
        String string = applicationContext.getString(R.string.f11nameremoved);
        C204429pL r0 = new C204429pL(r7, i, 4);
        AnonymousClass0Uj r3 = A012.A00;
        r3.A0G(r0, string);
        r3.A0I(new C204309p9(r7, this, i, 2), applicationContext.getString(R.string.f11nameremoved));
        A012.A0V(new C204239p2(r7, i, 4));
        return A012.create();
    }
}
