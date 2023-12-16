package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import java.util.Map;

/* renamed from: X.41v  reason: invalid class name and case insensitive filesystem */
public final class C819841v extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819841v(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52432lT r12 = (C52432lT) obj;
        if (C162457s7.A0P(C18300x5.A0O(this.this$0).A06.A07(), AnonymousClass1UJ.A00)) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            C162457s7.A0H(r12);
            int i = r12.A01;
            int i2 = r12.A00;
            int i3 = r12.A02;
            searchFunStickersBottomSheet.A1d(searchFunStickersBottomSheet.A0C, i3);
            Map map = searchFunStickersBottomSheet.A0V;
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) AnonymousClass001.A0i(map, i);
            WaNetworkResourceImageView waNetworkResourceImageView2 = (WaNetworkResourceImageView) AnonymousClass001.A0i(map, i2);
            ValueAnimator A00 = SearchFunStickersBottomSheet.A00(waNetworkResourceImageView, 1.0f, 0.0f);
            ValueAnimator A002 = SearchFunStickersBottomSheet.A00(searchFunStickersBottomSheet.A0F, 1.0f, 0.0f);
            ValueAnimator A003 = SearchFunStickersBottomSheet.A00(waNetworkResourceImageView2, 0.0f, 1.0f);
            ValueAnimator A004 = SearchFunStickersBottomSheet.A00(searchFunStickersBottomSheet.A0C, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[4];
            C18260x0.A0i(A00, A002, A003, animatorArr);
            animatorArr[3] = A004;
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new C18350xC(waNetworkResourceImageView, waNetworkResourceImageView2, searchFunStickersBottomSheet, i3));
            animatorSet.start();
        }
        return C59022wD.A00;
    }
}
