package com.whatsapp.expressionstray.stickers.funstickers;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass340;
import X.AnonymousClass3Z1;
import X.AnonymousClass58H;
import X.C08270df;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C54872pQ;
import X.C59522x3;
import X.C635139n;
import X.C78363ut;
import X.C80553yQ;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public final class FunStickersNoticeBottomSheet extends Hilt_FunStickersNoticeBottomSheet {
    public C59522x3 A00;

    public void A0w(Bundle bundle, View view) {
        int i;
        TextView A09;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        Object value = C154517dI.A00(AnonymousClass58H.NONE, new C80553yQ(this)).getValue();
        int A092 = AnonymousClass0x2.A09(AnonymousClass340.A03(this, "stickerOrigin", 10));
        C59522x3 r10 = this.A00;
        if (r10 != null) {
            C08270df supportFragmentManager = A0R().getSupportFragmentManager();
            Integer valueOf = Integer.valueOf(A092);
            C78363ut r11 = new C78363ut(this);
            C54872pQ r4 = r10.A02;
            if (r4.A02() && (A09 = AnonymousClass002.A09(view2, R.id.title)) != null) {
                A09.setText(R.string.f11nameremoved);
            }
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.disclosure_bullet);
            if (linearLayout != null) {
                int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                List<AnonymousClass3Z1> list = r10.A03;
                int i2 = 0;
                for (AnonymousClass3Z1 r7 : list) {
                    int i3 = i2 + 1;
                    if (i2 == AnonymousClass002.A03(list)) {
                        i = linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    } else {
                        i = dimensionPixelSize;
                    }
                    r10.A01(C59522x3.A00(C18290x4.A0F(linearLayout), r7, -1.0f), linearLayout, (Integer) null, dimensionPixelSize, i);
                    i2 = i3;
                }
                View inflate = C18280x3.A0D(view2).inflate(R.layout.f8nameremoved, linearLayout, false);
                C162457s7.A0H(inflate);
                r10.A01(inflate, linearLayout, (Integer) null, 0, linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                int dimensionPixelSize2 = dimensionPixelSize + linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                if (r4.A02()) {
                    C59522x3 r15 = r10;
                    LinearLayout linearLayout2 = linearLayout;
                    r15.A01(C59522x3.A00(C18290x4.A0F(linearLayout), new AnonymousClass3Z1((Object) null, (Object) null, Integer.valueOf(R.string.f11nameremoved)), 12.0f), linearLayout2, Integer.valueOf(dimensionPixelSize2), dimensionPixelSize, linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                }
                C59522x3 r3 = r10;
                LinearLayout linearLayout3 = linearLayout;
                r3.A01(C59522x3.A00(C18290x4.A0F(linearLayout), new AnonymousClass3Z1((Object) null, (Object) null, Integer.valueOf(R.string.f11nameremoved)), 12.0f), linearLayout3, Integer.valueOf(dimensionPixelSize2), dimensionPixelSize, 0);
            }
            View findViewById = view2.findViewById(R.id.get_started);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C635139n(r10, r11, value, supportFragmentManager, valueOf, 2));
                return;
            }
            return;
        }
        throw C18270x1.A0S("noticeBuilder");
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
