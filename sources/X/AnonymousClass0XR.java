package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.0XR  reason: invalid class name */
public class AnonymousClass0XR {
    public boolean A00 = false;
    public final View A01;
    public final C111095hX A02;
    public final AnonymousClass5X8 A03;
    public final AnonymousClass0U8 A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FV A07;

    public static void A02(AnonymousClass4FV r2, int i) {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A02 = String.valueOf(1);
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 27;
        r2.BhB(r1);
    }

    public static /* synthetic */ void A00(Context context, AnonymousClass0XR r5) {
        AnonymousClass1X0 r2 = new AnonymousClass1X0();
        r2.A01 = AnonymousClass001.A0f();
        AnonymousClass4FV r1 = r5.A07;
        r1.BhD(r2);
        A02(r1, 2);
        r5.A05.A0l();
        r5.A02.A0A(context, new Intent("android.intent.action.VIEW", r5.A03.A00("https://faq.whatsapp.com/1498366720959422")));
    }

    public static /* synthetic */ void A01(View view, AnonymousClass0XR r4) {
        AnonymousClass1X0 r2 = new AnonymousClass1X0();
        r2.A00 = AnonymousClass001.A0f();
        AnonymousClass4FV r1 = r4.A07;
        r1.BhD(r2);
        A02(r1, 3);
        r4.A05.A0v();
        view.setVisibility(8);
    }

    public static boolean A03(AnonymousClass0U8 r2, AnonymousClass33p r3, AnonymousClass1VX r4) {
        if (!r4.A0X(4774) || C06520Ya.A09(r2, r4) || r2.A01().getBoolean("_new_user", false) || !r3.A2I() || r3.A02() >= 2) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        AnonymousClass1VX r2 = this.A06;
        return A03(this.A04, this.A05, r2);
    }

    public AnonymousClass0XR(View view, C111095hX r3, AnonymousClass5X8 r4, AnonymousClass0U8 r5, AnonymousClass33p r6, AnonymousClass1VX r7, AnonymousClass4FV r8) {
        this.A06 = r7;
        this.A01 = view;
        this.A07 = r8;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A04() {
        if (A06() && !this.A00) {
            A05(this.A01);
            this.A00 = true;
            A02(this.A07, 1);
        }
    }

    public final void A05(View view) {
        Context context = view.getContext();
        int A022 = AnonymousClass34K.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        ((TextEmojiLabel) C06560Yg.A02(view, R.id.banner_description)).A0I(C107575bX.A02(AnonymousClass002.A0F(context, C107575bX.A04(context, A022), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), new Object[0]));
        view.setOnClickListener(new C17810wH(context, 3, this));
        C06560Yg.A02(view, R.id.close).setOnClickListener(new C17810wH(view, 4, this));
        view.setVisibility(0);
    }
}
