package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.4ak  reason: invalid class name and case insensitive filesystem */
public final class C88754ak extends AnonymousClass6NB {
    public final /* synthetic */ C186518vU A00;

    public Object A0M(View view, C153427bI r11, AnonymousClass84O r12, Object obj) {
        C18270x1.A10(view, 0, r12);
        String A0O = r12.A0O(36);
        String A0O2 = r12.A0O(35);
        String A0O3 = r12.A0O(38);
        int A0E = r12.A0E(40, 0);
        r12.A0O(41);
        String A0O4 = r12.A0O(43);
        String A0O5 = r12.A0O(42);
        String A0O6 = r12.A0O(44);
        String A0O7 = r12.A0O(45);
        ((BloksSupportVideoView) C06560Yg.A02(view, R.id.support_video_view)).A07(Integer.valueOf(A0E), A0O, A0O3, A0O2, A0O5, A0O6, A0O4, A0O7);
        return null;
    }

    public void A0O(View view, C153427bI r6, AnonymousClass84O r7, Object obj, Object obj2) {
        C162457s7.A0J(view, 0);
        BloksSupportVideoView bloksSupportVideoView = (BloksSupportVideoView) C06560Yg.A02(view, R.id.support_video_view);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            throw C18270x1.A0S("videoThumbnail");
        }
        waImageView.setImageBitmap((Bitmap) null);
        WaImageView waImageView2 = bloksSupportVideoView.A02;
        if (waImageView2 == null) {
            throw C18270x1.A0S("playButton");
        }
        waImageView2.setOnClickListener((View.OnClickListener) null);
        ((C89644eZ) C111095hX.A04(bloksSupportVideoView)).A6x(bloksSupportVideoView.A05);
        bloksSupportVideoView.A05 = null;
        bloksSupportVideoView.getSupportVideoLogger().A01 = null;
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        C162457s7.A0J(context, 0);
        View A0G = C86654Ky.A0G(context, R.layout.f8nameremoved);
        C162457s7.A0D(A0G);
        return A0G;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88754ak(C153427bI r1, AnonymousClass84O r2, C186518vU r3) {
        super(r1, r2);
        this.A00 = r3;
    }
}
