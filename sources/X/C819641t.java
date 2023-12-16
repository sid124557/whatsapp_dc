package X;

import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.41t  reason: invalid class name and case insensitive filesystem */
public final class C819641t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819641t(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet;
        FrameLayout frameLayout;
        int i;
        if (C162457s7.A0P(obj, C133926iA.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            searchFunStickersBottomSheet.A1a();
            C18300x5.A1H(searchFunStickersBottomSheet.A0O);
            AnonymousClass0x2.A0x(searchFunStickersBottomSheet.A00);
            C18300x5.A1H(searchFunStickersBottomSheet.A0P);
            WaTextView waTextView = searchFunStickersBottomSheet.A0G;
            if (waTextView != null) {
                waTextView.setText(R.string.f11nameremoved);
            }
            WaImageView waImageView = searchFunStickersBottomSheet.A0A;
            if (waImageView != null) {
                waImageView.setImageDrawable(AnonymousClass0VX.A01(searchFunStickersBottomSheet.A0G(), R.drawable.ic_close));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 21;
            }
            return C59022wD.A00;
        } else if (C162457s7.A0P(obj, C133906i8.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            C194711h r0 = searchFunStickersBottomSheet.A0J;
            if (r0 != null) {
                r0.A02 = false;
            }
            WaEditText waEditText = searchFunStickersBottomSheet.A08;
            if (waEditText != null) {
                waEditText.A05();
            }
            searchFunStickersBottomSheet.A1a();
            C18270x1.A0p(searchFunStickersBottomSheet.A00);
            AnonymousClass5UY r02 = searchFunStickersBottomSheet.A0O;
            if (r02 != null) {
                r02.A06(0);
            }
            C18300x5.A1H(searchFunStickersBottomSheet.A0P);
            WaTextView waTextView2 = searchFunStickersBottomSheet.A0G;
            if (waTextView2 != null) {
                waTextView2.setText(R.string.f11nameremoved);
            }
            WaImageView waImageView2 = searchFunStickersBottomSheet.A0A;
            if (waImageView2 != null) {
                waImageView2.setImageDrawable(AnonymousClass0VX.A01(searchFunStickersBottomSheet.A0G(), R.drawable.ic_back_gray));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 13;
            }
            return C59022wD.A00;
        } else {
            if (C162457s7.A0P(obj, C133916i9.A00)) {
                searchFunStickersBottomSheet = this.this$0;
                C194711h r1 = searchFunStickersBottomSheet.A0J;
                if (r1 != null) {
                    r1.A02 = true;
                }
                searchFunStickersBottomSheet.A1b();
                C18300x5.A1H(searchFunStickersBottomSheet.A0O);
                AnonymousClass0x2.A0x(searchFunStickersBottomSheet.A00);
                searchFunStickersBottomSheet.A1c();
                WaTextView waTextView3 = searchFunStickersBottomSheet.A0G;
                if (waTextView3 != null) {
                    waTextView3.setText(R.string.f11nameremoved);
                }
                WaImageView waImageView3 = searchFunStickersBottomSheet.A0A;
                if (waImageView3 != null) {
                    waImageView3.setImageDrawable(AnonymousClass0VX.A01(searchFunStickersBottomSheet.A0G(), R.drawable.ic_close));
                }
                frameLayout = searchFunStickersBottomSheet.A01;
                if (frameLayout != null) {
                    i = 19;
                }
            }
            return C59022wD.A00;
        }
        C635339p.A00(frameLayout, searchFunStickersBottomSheet, i);
        return C59022wD.A00;
    }
}
