package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YY;
import X.AnonymousClass10x;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass5FA;
import X.C06560Yg;
import X.C105895Wv;
import X.C1232467r;
import X.C620633i;
import X.C620733j;
import X.C86664Kz;
import X.C87214Ol;
import X.C89164br;
import X.C91504kC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;

public class GroupParticipantsSearchFragment extends Hilt_GroupParticipantsSearchFragment {
    public int A00 = 0;
    public AnonymousClass5FA A01;
    public C91504kC A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public C87214Ol A06;
    public AnonymousClass10x A07;
    public C105895Wv A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e8, code lost:
        if (r1 == false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 1
            r10 = r21
            r10.A0X = r0
            r1 = r22
            if (r22 == 0) goto L_0x0029
            java.lang.String r0 = "search_view_startup_mode"
            int r0 = r1.getInt(r0)
            r10.A00 = r0
            java.lang.String r0 = "enter_animated"
            boolean r0 = r1.getBoolean(r0)
            r10.A09 = r0
            java.lang.String r0 = "exit_animated"
            boolean r0 = r1.getBoolean(r0)
            r10.A0B = r0
            java.lang.String r0 = "enter_ime"
            boolean r0 = r1.getBoolean(r0)
            r10.A0A = r0
        L_0x0029:
            X.03q r9 = r10.A0R()
            com.whatsapp.group.GroupChatInfoActivity r9 = (com.whatsapp.group.GroupChatInfoActivity) r9
            android.view.View r3 = r10.A0J()
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r8 = X.C06560Yg.A02(r3, r0)
            android.widget.ListView r8 = (android.widget.ListView) r8
            X.4Ol r0 = r10.A06
            if (r0 != 0) goto L_0x004c
            X.5GI r1 = new X.5GI
            r1.<init>(r9)
            X.4Ol r0 = new X.4Ol
            r0.<init>(r1, r9)
            r10.A06 = r0
        L_0x004c:
            X.0XL r1 = X.AnonymousClass0x9.A0H(r9)
            java.lang.Class<X.10x> r0 = X.AnonymousClass10x.class
            X.0Ty r2 = r1.A01(r0)
            X.10x r2 = (X.AnonymousClass10x) r2
            r10.A07 = r2
            int r1 = r10.A00
            if (r1 == 0) goto L_0x0286
            r0 = 1
            if (r1 != r0) goto L_0x028a
            X.108 r4 = r2.A0J
        L_0x0063:
            X.0sA r2 = r10.A0V()
            X.4Ol r1 = r10.A06
            java.util.Objects.requireNonNull(r1)
            r0 = 249(0xf9, float:3.49E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)
            X.5FA r0 = r10.A01
            r13 = 1
            r7 = 0
            X.C162457s7.A0J(r0, r7)
            X.5gf r1 = new X.5gf
            r1.<init>(r0, r13)
            X.03q r0 = r10.A0R()
            X.0XL r1 = X.AnonymousClass4L0.A0F(r1, r0)
            java.lang.Class<com.whatsapp.status.viewmodels.StatusesViewModel> r0 = com.whatsapp.status.viewmodels.StatusesViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = (com.whatsapp.status.viewmodels.StatusesViewModel) r0
            X.0Wx r2 = r0.A04
            X.0sA r1 = r10.A0V()
            r0 = 250(0xfa, float:3.5E-43)
            X.AnonymousClass6C6.A02(r1, r2, r10, r0)
            r9.registerForContextMenu(r8)
            r12 = 8
            X.AnonymousClass696.A00(r8, r9, r12)
            X.5ak r0 = new X.5ak
            r0.<init>((com.whatsapp.group.GroupParticipantsSearchFragment) r10)
            r8.setOnScrollListener(r0)
            r0 = 2131433301(0x7f0b1755, float:1.8488384E38)
            android.view.View r6 = r3.findViewById(r0)
            r0 = 2131233559(0x7f080b17, float:1.8083259E38)
            r6.setBackgroundResource(r0)
            r0 = 2131433360(0x7f0b1790, float:1.8488503E38)
            android.view.View r11 = r6.findViewById(r0)
            androidx.appcompat.widget.SearchView r11 = (androidx.appcompat.widget.SearchView) r11
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r11, r0)
            android.content.Context r3 = r10.A1D()
            android.content.Context r2 = r10.A1D()
            r1 = 2130970496(0x7f040780, float:1.7549704E38)
            r0 = 2131102343(0x7f060a87, float:1.7817121E38)
            X.AnonymousClass5Yj.A08(r2, r3, r4, r1, r0)
            r11.setIconifiedByDefault(r7)
            int r0 = r10.A00
            if (r0 != 0) goto L_0x00ea
            X.10x r0 = r10.A07
            X.2ss r1 = r0.A07
            X.1fJ r0 = r0.A0F
            boolean r1 = r1.A0R(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00eb
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            r5 = 0
            if (r0 == 0) goto L_0x0119
            android.content.Context r1 = r10.A1D()
            r0 = 2131625050(0x7f0e045a, float:1.8877297E38)
            android.view.View r2 = android.view.View.inflate(r1, r0, r5)
            X.10x r0 = r10.A07
            X.3Ex r1 = r0.A02
            X.1fJ r0 = r0.A0F
            X.3ZH r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0116
            r0 = 2131430478(0x7f0b0c4e, float:1.8482658E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r2, r0)
            r0 = 2131889990(0x7f120f46, float:1.941466E38)
            r1.setText(r0)
        L_0x0116:
            r8.addHeaderView(r2, r5, r7)
        L_0x0119:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0283
            android.view.View r2 = r10.A1J()
        L_0x0121:
            r0 = 240(0xf0, double:1.186E-321)
            if (r2 != 0) goto L_0x0267
            boolean r2 = r10.A0A
            if (r2 == 0) goto L_0x0260
            r11.A09()
            r10.A0A = r7
        L_0x012e:
            r3 = 2131893362(0x7f121c72, float:1.9421498E38)
            android.content.res.Resources r2 = X.C08310eF.A09(r10)
            java.lang.String r2 = r2.getString(r3)
            r11.setQueryHint(r2)
            X.5CM r2 = new X.5CM
            r2.<init>(r10, r12)
            r11.A0B = r2
            r2 = 2131433309(0x7f0b175d, float:1.84884E38)
            android.widget.ImageView r11 = X.AnonymousClass0x9.A0F(r11, r2)
            android.content.Context r3 = r10.A1D()
            r2 = 2131231896(0x7f080498, float:1.8079886E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass0RP.A00(r3, r2)
            X.4M4 r3 = new X.4M4
            r3.<init>(r4, r10)
            r11.setImageDrawable(r3)
            boolean r3 = r10.A09
            if (r3 == 0) goto L_0x0178
            r14 = 0
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            r17 = r13
            r19 = r13
            r20 = r14
            r15 = r13
            r16 = r14
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r12.setDuration(r0)
            r6.startAnimation(r12)
        L_0x0178:
            r10.A09 = r7
            r0 = 2131433263(0x7f0b172f, float:1.8488307E38)
            android.widget.ImageView r4 = X.AnonymousClass0x9.A0F(r6, r0)
            X.33j r3 = r10.A04
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            android.content.res.Resources r1 = X.C08310eF.A09(r10)
            r0 = 2131101305(0x7f060679, float:1.7815016E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A09(r1, r2, r0)
            X.C86614Ku.A1B(r0, r4, r3)
            r0 = 39
            X.C18310x6.A18(r4, r10, r0)
            android.content.Context r1 = r10.A0G()
            int r0 = r10.A00
            if (r0 != r13) goto L_0x01ca
            r0 = 2131891683(0x7f1215e3, float:1.9418093E38)
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x01ca
            android.content.Context r1 = r10.A1D()
            r0 = 2131625072(0x7f0e0470, float:1.8877342E38)
            android.view.View r1 = android.view.View.inflate(r1, r0, r5)
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r1, r0)
            X.C106905aM.A04(r0)
            r0.setText(r2)
            r8.addHeaderView(r1, r5, r7)
        L_0x01ca:
            X.10x r4 = r10.A07
            int r0 = r10.A00
            if (r0 != r13) goto L_0x0212
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131755257(0x7f1000f9, float:1.9141388E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r0 = 60
            X.AnonymousClass000.A1P(r1, r0, r7)
            java.lang.String r3 = r3.getQuantityString(r2, r0, r1)
            X.5a2 r2 = r4.A0L
            r0 = 7
            X.3Zx r1 = new X.3Zx
            r1.<init>(r4, r0, r9)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r3 = r2.A05(r9, r1, r3, r0)
            android.content.Context r1 = r10.A1D()
            r0 = 2131625071(0x7f0e046f, float:1.887734E38)
            android.view.View r2 = android.view.View.inflate(r1, r0, r5)
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass0x7.A0K(r2, r0)
            X.33i r0 = r10.A03
            X.AnonymousClass0x2.A12(r1, r0)
            X.1VX r0 = r10.A05
            X.AnonymousClass0x2.A14(r0, r1)
            r1.setText(r3)
            r8.addFooterView(r2, r5, r7)
        L_0x0212:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x025a
            X.10x r0 = r10.A07
            X.2ss r1 = r0.A07
            X.1fJ r0 = r0.A0F
            int r1 = r1.A07(r0)
            r0 = 3
            if (r1 != r0) goto L_0x025a
            X.10x r0 = r10.A07
            X.2sj r1 = r0.A09
            X.1fJ r0 = r0.A0F
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x025a
            android.content.Context r1 = r10.A1D()
            r0 = 2131625071(0x7f0e046f, float:1.887734E38)
            android.view.View r2 = android.view.View.inflate(r1, r0, r5)
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass0x7.A0K(r2, r0)
            X.33i r0 = r10.A03
            X.AnonymousClass0x2.A12(r1, r0)
            X.1VX r0 = r10.A05
            X.AnonymousClass0x2.A14(r0, r1)
            r0 = 2131886431(0x7f12015f, float:1.940744E38)
            r1.setText(r0)
            r0 = 2132084634(0x7f15079a, float:1.9809444E38)
            X.AnonymousClass0Y9.A06(r1, r0)
            r8.addFooterView(r2, r5, r7)
        L_0x025a:
            X.4Ol r0 = r10.A06
            r8.setAdapter(r0)
            return
        L_0x0260:
            X.5Wv r2 = r10.A08
            r2.A02(r11)
            goto L_0x012e
        L_0x0267:
            int r3 = r2.getTop()
            int r2 = r8.getPaddingTop()
            int r3 = r3 - r2
            float r4 = (float) r3
            r2 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r2, r2, r4, r2)
            r3.setDuration(r0)
            r2 = 5
            X.C1232367q.A00(r3, r11, r10, r2)
            r8.startAnimation(r3)
            goto L_0x012e
        L_0x0283:
            r2 = r5
            goto L_0x0121
        L_0x0286:
            X.108 r4 = r2.A0I
            goto L_0x0063
        L_0x028a:
            java.lang.String r1 = "Unreachable"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupParticipantsSearchFragment.A0o(android.os.Bundle):void");
    }

    public void A0q(Bundle bundle) {
        bundle.putInt("search_view_startup_mode", this.A00);
        bundle.putBoolean("enter_animated", this.A09);
        bundle.putBoolean("exit_animated", this.A0B);
        bundle.putBoolean("enter_ime", this.A0A);
    }

    public void A1K() {
        View view;
        View view2 = this.A0B;
        if (view2 != null) {
            boolean A1U = AnonymousClass000.A1U(A0U().A07(), 1);
            if (this.A0B) {
                view = A1J();
            } else {
                view = null;
            }
            View findViewById = view2.findViewById(R.id.search_holder);
            findViewById.setVisibility(8);
            this.A08.A02(C06560Yg.A02(findViewById, R.id.search_view));
            if (view != null) {
                AlphaAnimation A0C = AnonymousClass4L0.A0C(1.0f, 0.0f);
                A0C.setDuration(240);
                findViewById.startAnimation(A0C);
                View A0i = C86664Kz.A0i(view2);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (view.getTop() - A0i.getPaddingTop()));
                translateAnimation.setDuration(240);
                C1232467r.A00(translateAnimation, this, 7);
                A0i.startAnimation(translateAnimation);
            } else {
                A0U().A0N();
            }
            C91504kC r0 = this.A02;
            if (r0 != null && A1U) {
                AnonymousClass0YY.A06(r0, 1);
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public final View A1J() {
        C89164br r5 = (C89164br) A0Q();
        View view = null;
        if (r5 != null) {
            int childCount = r5.getListView().getChildCount();
            for (int i = 0; i < childCount && view == null; i++) {
                View childAt = r5.getListView().getChildAt(i);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }
}
