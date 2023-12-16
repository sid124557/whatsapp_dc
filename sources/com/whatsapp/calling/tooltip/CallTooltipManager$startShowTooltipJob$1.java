package com.whatsapp.calling.tooltip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GR;
import X.AnonymousClass4L0;
import X.AnonymousClass5XJ;
import X.AnonymousClass5YI;
import X.AnonymousClass6DD;
import X.AnonymousClass7YB;
import X.AnonymousClass91Z;
import X.C02680He;
import X.C102565Ji;
import X.C106155Xv;
import X.C107295b4;
import X.C117695sL;
import X.C120705z1;
import X.C141346vQ;
import X.C141936wN;
import X.C151447Uv;
import X.C158527k7;
import X.C162457s7;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C91434jb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.tooltip.CallTooltipManager$startShowTooltipJob$1", f = "CallTooltipManager.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
public final class CallTooltipManager$startShowTooltipJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C151447Uv $config;
    public int label;
    public final /* synthetic */ AnonymousClass5XJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallTooltipManager$startShowTooltipJob$1(AnonymousClass5XJ r2, C151447Uv r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$config = r3;
    }

    public final Object A09(Object obj) {
        long j;
        AnonymousClass08M r3;
        C141346vQ r2;
        C141936wN r1;
        View findViewById;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.this$0.A04.A0H(new AnonymousClass7YB(((C91434jb) this.$config).A04, C141936wN.WILL_SHOW));
            if (((C91434jb) this.$config).A00) {
                j = 500;
            } else {
                j = 5000;
            }
            this.label = 1;
            if (C616231o.A00(this, j) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        View view = this.this$0.A00;
        if (view == null || (findViewById = view.findViewById(R.id.screen_share_btn)) == null || !this.$config.A01((C158527k7) C86634Kw.A0v(this.this$0.A0A))) {
            C91434jb r12 = (C91434jb) this.$config;
            r12.A00 = true;
            r3 = this.this$0.A04;
            r2 = r12.A04;
            r1 = C141936wN.DID_NOT_SHOW;
        } else {
            AnonymousClass5XJ r22 = this.this$0;
            View view2 = r22.A00;
            if (view2 != null) {
                view = view2;
            }
            C102565Ji r7 = r22.A07;
            C162457s7.A0J(((C91434jb) this.$config).A03, 1);
            C120705z1 r4 = new C120705z1(this.this$0, this.$config);
            WaTextView waTextView = r7.A02;
            waTextView.setText(R.string.f11nameremoved);
            waTextView.setGravity(17);
            Context context = r7.A00;
            C107295b4.A00(context, r7.A03, context.getString(R.string.f11nameremoved));
            Drawable A00 = C02680He.A00((Resources.Theme) null, context.getResources(), R.drawable.call_tooltip_center);
            r7.A04.A05();
            waTextView.setBackground(new AnonymousClass6DD(A00));
            PopupWindow popupWindow = r7.A01;
            popupWindow.setOnDismissListener(new AnonymousClass91Z(r4, 0));
            popupWindow.setOutsideTouchable(true);
            C86654Ky.A19(waTextView, r7, 3);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            waTextView.measure(0, 0);
            AnonymousClass000.A0B(context);
            int A04 = AnonymousClass5YI.A04(context, 8.0f);
            int A0E = iArr[0] + C86664Kz.A0E(findViewById, 2);
            int height = iArr[1] + (findViewById.getHeight() / 2);
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int width = (iArr2[0] + view.getWidth()) - A0E;
            if (width < 0) {
                width = 0;
            }
            if (width > A0E) {
                width = A0E;
            }
            int i2 = (width * 2) - (A04 * 2);
            int measuredWidth = waTextView.getMeasuredWidth();
            if (i2 > measuredWidth) {
                i2 = measuredWidth;
            }
            waTextView.setWidth(i2);
            waTextView.measure(0, 0);
            AnonymousClass3Z6 A01 = AnonymousClass3Z6.A01(Integer.valueOf((A0E - (i2 / 2)) + AnonymousClass5YI.A04(context, 0.0f)), AnonymousClass4L0.A05(waTextView, height) + AnonymousClass5YI.A04(context, -18.0f));
            int A0K = AnonymousClass001.A0K(A01.first);
            int A0K2 = AnonymousClass001.A0K(A01.second);
            popupWindow.setAnimationStyle(R.style.f12nameremoved);
            popupWindow.showAtLocation(view, 8388659, A0K, A0K2);
            view.postDelayed(C117695sL.A00(r7, 37), 10000);
            C91434jb r52 = (C91434jb) this.$config;
            C106155Xv r0 = r52.A02;
            C18270x1.A0i(C106155Xv.A00(r0).putInt("ss_tooltip_show_count", C86664Kz.A08(r0.A03(), "ss_tooltip_show_count", 0)), "tooltip_last_shown_ms", System.currentTimeMillis());
            r52.A01 = true;
            r3 = this.this$0.A04;
            r2 = ((C91434jb) this.$config).A04;
            r1 = C141936wN.SHOWING;
        }
        r3.A0H(new AnonymousClass7YB(r2, r1));
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CallTooltipManager$startShowTooltipJob$1(this.this$0, this.$config, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
