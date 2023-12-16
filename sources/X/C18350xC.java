package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.0xC  reason: invalid class name and case insensitive filesystem */
public final class C18350xC extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WaNetworkResourceImageView A01;
    public final /* synthetic */ WaNetworkResourceImageView A02;
    public final /* synthetic */ SearchFunStickersBottomSheet A03;

    public void onAnimationEnd(Animator animator, boolean z) {
        C162457s7.A0J(animator, 0);
        super.onAnimationEnd(animator, z);
        WaNetworkResourceImageView waNetworkResourceImageView = this.A02;
        if (waNetworkResourceImageView != null) {
            waNetworkResourceImageView.setAlpha(0.0f);
        }
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.A03;
        WaTextView waTextView = searchFunStickersBottomSheet.A0C;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        searchFunStickersBottomSheet.A1d(searchFunStickersBottomSheet.A0F, this.A00);
        WaNetworkResourceImageView waNetworkResourceImageView2 = this.A01;
        if (waNetworkResourceImageView2 != null) {
            waNetworkResourceImageView2.setAlpha(1.0f);
        }
        WaTextView waTextView2 = searchFunStickersBottomSheet.A0F;
        if (waTextView2 != null) {
            waTextView2.setAlpha(1.0f);
        }
        C18300x5.A0O(searchFunStickersBottomSheet).A0G();
    }

    public C18350xC(WaNetworkResourceImageView waNetworkResourceImageView, WaNetworkResourceImageView waNetworkResourceImageView2, SearchFunStickersBottomSheet searchFunStickersBottomSheet, int i) {
        this.A02 = waNetworkResourceImageView;
        this.A03 = searchFunStickersBottomSheet;
        this.A00 = i;
        this.A01 = waNetworkResourceImageView2;
    }
}
