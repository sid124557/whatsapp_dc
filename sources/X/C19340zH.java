package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import com.whatsapp.R;

/* renamed from: X.0zH  reason: invalid class name and case insensitive filesystem */
public class C19340zH extends AnonymousClass0Uj {
    public final AnonymousClass0Uj A00;
    public final C628536z A01 = new C628536z();
    public final C628236w A02 = new C628236w();

    public static void A03(C15910sA r1, C19340zH r2, int i, int i2) {
        r2.A0c(r1, new AnonymousClass4K2(r1, i), i2);
    }

    public static void A04(C15910sA r1, C19340zH r2, int i, int i2) {
        r2.A0d(r1, new AnonymousClass4K2(r1, i), i2);
    }

    public static void A07(C19340zH r1, Object obj, int i, int i2) {
        r1.A0W(new C85804Hr(obj, i), i2);
    }

    public static void A08(C19340zH r1, Object obj, int i, int i2) {
        r1.A0Y(new C85804Hr(obj, i), i2);
    }

    public static void A09(C19340zH r1, Object obj, Object obj2, int i, int i2) {
        r1.A0Y(new AnonymousClass4I8(obj, i, obj2), i2);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0C(int i) {
        this.A00.A0C(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0E(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        this.A00.A0E(onClickListener, listAdapter);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0F(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        this.A00.A0F(onClickListener, listAdapter, i);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0G(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0G(onClickListener, charSequence);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0H(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0H(onClickListener, charSequence);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0I(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0I(onClickListener, charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0J(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        this.A00.A0J(onClickListener, charSequenceArr);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0K(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        this.A00.A0K(onClickListener, charSequenceArr, i);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0L(DialogInterface.OnDismissListener onDismissListener) {
        this.A00.A0L(onDismissListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0M(DialogInterface.OnKeyListener onKeyListener) {
        this.A00.A0M(onKeyListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0N(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        this.A00.A0N(onMultiChoiceClickListener, charSequenceArr, zArr);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0O(Drawable drawable) {
        this.A00.A0O(drawable);
        return this;
    }

    public AnonymousClass043 A0S() {
        return this.A00.A0S();
    }

    public void A0T(int i) {
        this.A00.A0A(i);
    }

    public void A0U(int i) {
        this.A00.A0B(i);
    }

    public void A0V(DialogInterface.OnCancelListener onCancelListener) {
        this.A00.A0D(onCancelListener);
    }

    @Deprecated
    public void A0W(DialogInterface.OnClickListener onClickListener, int i) {
        AnonymousClass0Uj r1 = this.A00;
        r1.A0G(onClickListener, r1.getContext().getString(i));
    }

    @Deprecated
    public void A0X(DialogInterface.OnClickListener onClickListener, int i) {
        AnonymousClass0Uj r1 = this.A00;
        r1.A0H(onClickListener, r1.getContext().getString(i));
    }

    @Deprecated
    public void A0Y(DialogInterface.OnClickListener onClickListener, int i) {
        AnonymousClass0Uj r1 = this.A00;
        r1.A0I(onClickListener, r1.getContext().getString(i));
    }

    public void A0Z(View view) {
        AnonymousClass0Uj r0 = this.A00;
        r0.A0P(view);
        r0.A0P(view);
    }

    public void A0a(View view) {
        this.A00.setView(view);
    }

    public void A0b(C15910sA r3, C15930sC r4) {
        AnonymousClass0Uj r1 = this.A00;
        C628236w r0 = this.A02;
        r1.A0L(r0);
        r0.A01.A0B(r3, r4);
    }

    public void A0c(C15910sA r4, C15930sC r5, int i) {
        AnonymousClass0Uj r2 = this.A00;
        String string = r2.getContext().getString(i);
        C628536z r0 = this.A01;
        r2.A0G(r0, string);
        if (r5 != null) {
            r0.A00.A0B(r4, r5);
        }
    }

    public void A0d(C15910sA r4, C15930sC r5, int i) {
        AnonymousClass0Uj r2 = this.A00;
        String string = r2.getContext().getString(i);
        C628536z r0 = this.A01;
        r2.A0I(r0, string);
        if (r5 != null) {
            r0.A02.A0B(r4, r5);
        }
    }

    public void A0e(C15910sA r3, C15930sC r4, CharSequence charSequence) {
        AnonymousClass0Uj r1 = this.A00;
        C628536z r0 = this.A01;
        r1.A0G(r0, charSequence);
        r0.A00.A0B(r3, r4);
    }

    public void A0f(C15910sA r3, C15930sC r4, CharSequence charSequence) {
        AnonymousClass0Uj r1 = this.A00;
        C628536z r0 = this.A01;
        r1.A0I(r0, charSequence);
        r0.A02.A0B(r3, r4);
    }

    public void A0g(CharSequence charSequence) {
        this.A00.A0Q(charSequence);
    }

    public void A0h(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
    }

    public void A0i(boolean z) {
        this.A00.A0R(z);
    }

    public AnonymousClass043 create() {
        if (this.A02.A01.A02.A00 <= 0) {
            this.A00.A0L((DialogInterface.OnDismissListener) null);
        }
        return this.A00.create();
    }

    public Context getContext() {
        return this.A00.getContext();
    }

    public C19340zH(AnonymousClass0Uj r2) {
        super(r2.getContext());
        this.A00 = r2;
    }

    public static C19340zH A00(Context context, CharSequence charSequence) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0g(charSequence);
        return A002;
    }

    public static void A01(Context context, C19340zH r1, int i) {
        r1.A0g(context.getString(i));
    }

    public static void A02(C15910sA r2, C19340zH r3) {
        r3.A0d(r2, (C15930sC) null, R.string.f11nameremoved);
    }

    public static void A05(C19340zH r2) {
        r2.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
    }

    public static void A06(C19340zH r2) {
        r2.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0A(int i) {
        A0T(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0B(int i) {
        A0U(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0D(DialogInterface.OnCancelListener onCancelListener) {
        A0V(onCancelListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0P(View view) {
        A0Z(view);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0Q(CharSequence charSequence) {
        A0g(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0R(boolean z) {
        A0i(z);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj setTitle(CharSequence charSequence) {
        A0h(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj setView(View view) {
        A0a(view);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AnonymousClass0Uj setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0W(onClickListener, i);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AnonymousClass0Uj setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0Y(onClickListener, i);
        return this;
    }
}
