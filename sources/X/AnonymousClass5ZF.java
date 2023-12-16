package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.util.HashMap;

/* renamed from: X.5ZF  reason: invalid class name */
public class AnonymousClass5ZF {
    public static HandlerThread A0V;
    public static AnonymousClass4MH A0W;
    public static AnonymousClass4MX A0X;
    public static final int A0Y = ViewConfiguration.getKeyRepeatDelay();
    public static final int A0Z = ViewConfiguration.getKeyRepeatTimeout();
    public static final HashMap A0a = AnonymousClass001.A0t();
    public int A00;
    public int A01;
    public AnonymousClass4CE A02;
    public AnonymousClass4Ro A03;
    public AnonymousClass4Rm A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Paint A0A = C86664Kz.A0Z();
    public final LayoutInflater A0B;
    public final View.OnClickListener A0C;
    public final View A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G = new AnonymousClass6BG((Object) this, 1);
    public final AbsListView.OnScrollListener A0H;
    public final AbsListView.OnScrollListener A0I = new C107045ab(this, 0);
    public final ImageView A0J;
    public final ViewPager A0K;
    public final C55682qk A0L;
    public final AnonymousClass33p A0M;
    public final AnonymousClass5IY A0N;
    public final C27821ej A0O;
    public final AnonymousClass5Y0 A0P;
    public final AnonymousClass1VX A0Q;
    public final C60152y5 A0R;
    public final boolean A0S;
    public final AnonymousClass4OW[] A0T;
    public final AnonymousClass5X5[] A0U;

    public final void A02(AnonymousClass4NX r8) {
        AnonymousClass4NX r2 = r8;
        if (C107425bI.A02(r8.A07)) {
            AnonymousClass4Ro r1 = new AnonymousClass4Ro(r2, new C107225au(r8, 0, this), this.A0P, r8.A07, false);
            this.A03 = r1;
            C106825aE.A00(r8, this.A0E, r1);
        }
    }

    public final void A03(AnonymousClass4NX r8) {
        AnonymousClass4Rm r1 = new AnonymousClass4Rm(r8, new C107225au(r8, 1, this), this.A0P, r8.A07, false);
        this.A04 = r1;
        C106825aE.A00(r8, this.A0E, r1);
    }

    public final void A04(int[] iArr) {
        if (iArr == null) {
            this.A0L.A0A("EmojiPicker/onEmojiSelected/emoji being added is null", true, (String) null);
            return;
        }
        this.A0O.A08(iArr);
        if (this.A00 != 0) {
            this.A0T[0].notifyDataSetChanged();
        }
        AnonymousClass4CE r0 = this.A02;
        if (r0 != null) {
            r0.BRo(iArr);
        }
        if (this.A0Q.A0X(6380)) {
            AnonymousClass5IY r4 = this.A0N;
            C24951Zj r2 = new C24951Zj();
            r2.A05 = r4.A00;
            r2.A04 = Long.valueOf(r4.A01.A0H());
            r2.A01 = 1;
            r2.A00 = 1;
            r2.A02 = 7;
            r4.A02.BhD(r2);
        }
    }

    public static Drawable A00(long j) {
        Reference reference = (Reference) A0a.get(Long.valueOf(j));
        if (reference == null) {
            return null;
        }
        return (Drawable) reference.get();
    }

    public final void A01(int i) {
        for (AnonymousClass5X5 r2 : this.A0U) {
            ViewGroup viewGroup = this.A0F;
            View findViewById = viewGroup.findViewById(r2.A01);
            View findViewById2 = viewGroup.findViewById(r2.A00);
            if (findViewById2 != null) {
                if (r2.A02 == i) {
                    findViewById2.setSelected(true);
                    C86604Kt.A0z(findViewById.getContext(), findViewById, AnonymousClass5Yj.A02(findViewById.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public AnonymousClass5ZF(Context context, View view, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener, C55682qk r17, AnonymousClass33p r18, C620733j r19, AnonymousClass5IY r20, C27821ej r21, AnonymousClass5Y0 r22, AnonymousClass1VX r23, C60152y5 r24) {
        int length;
        int length2;
        AbsListView.OnScrollListener onScrollListener2 = onScrollListener;
        this.A0H = onScrollListener2;
        this.A0S = AnonymousClass000.A1W(onScrollListener2);
        this.A0E = view;
        this.A09 = context;
        AnonymousClass1VX r10 = r23;
        this.A0Q = r10;
        this.A0L = r17;
        this.A0P = r22;
        C27821ej r8 = r21;
        this.A0O = r8;
        AnonymousClass33p r7 = r18;
        this.A0M = r7;
        C60152y5 r6 = r24;
        this.A0R = r6;
        this.A0N = r20;
        this.A06 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A08 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A0F = C86644Kx.A0J(viewGroup, R.id.emoji_group_layout);
        AnonymousClass5X5[] r1 = new AnonymousClass5X5[(C155677fI.A00(r10).length + 1)];
        this.A0U = r1;
        r1[0] = new C88974bH(r8);
        int i = 1;
        while (true) {
            AnonymousClass5X5[] r3 = this.A0U;
            length = r3.length;
            if (i >= length) {
                break;
            }
            r3[i] = new AnonymousClass5X5(C155677fI.A00(r10)[i - 1], i);
            i++;
        }
        AnonymousClass4OW[] r12 = new AnonymousClass4OW[length];
        this.A0T = r12;
        C620733j r32 = r19;
        r12[0] = new AnonymousClass4OW(context, this, r32, 0);
        this.A00 = r8.A01() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.pager);
        this.A0K = viewPager;
        viewPager.setAdapter(new C89054bP(this, r32));
        viewPager.A0G(new C110775h1(context, this, r32, r6));
        this.A0B = C620633i.A00(context);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        for (AnonymousClass5X5 r82 : this.A0U) {
            View findViewById = this.A0F.findViewById(r82.A00);
            C18300x5.A13(context, findViewById, r82.A03);
            C109725f5.A00(findViewById, this, r32, r82, 2);
        }
        if (C620733j.A04(r32)) {
            length2 = this.A00;
        } else {
            length2 = (this.A0T.length - 1) - this.A00;
        }
        this.A0K.A0F(length2, false);
        A01(this.A00);
        this.A0C = new C109725f5((Object) this, (Object) r6, (Object) r7, 3);
        ImageView A0F2 = AnonymousClass0x9.A0F(viewGroup, R.id.delete_symbol_tb);
        this.A0J = A0F2;
        if (A0F2 != null) {
            AnonymousClass4MI r13 = new AnonymousClass4MI(Looper.getMainLooper(), this);
            A0F2.setClickable(true);
            A0F2.setLongClickable(true);
            A0F2.setOnTouchListener(new C100655Bt(r13, 0, this));
            C18280x3.A0p(A0F2, this, 14);
            C18270x1.A0d(this.A09, A0F2, r32, R.drawable.emoji_x);
            C18300x5.A13(context, A0F2, R.string.f11nameremoved);
        }
        View findViewById2 = viewGroup.findViewById(R.id.emoji_tip);
        this.A0D = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            C18280x3.A0p(findViewById2.findViewById(R.id.ok), this, 15);
            C18280x3.A0p(findViewById2, this, 16);
        }
    }
}
