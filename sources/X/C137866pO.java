package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.6pO  reason: invalid class name and case insensitive filesystem */
public class C137866pO extends C137906pS {
    public View A00;
    public View A01;
    public boolean A02;

    public void A03(View view) {
        super.A03(view);
        this.A00 = view.findViewById(R.id.empty);
        this.A01 = view.findViewById(R.id.more_info_button);
        View view2 = this.A01;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public C137866pO(Context context, LayoutInflater layoutInflater, AnonymousClass1VX r3, AnonymousClass33O r4, C50612iT r5, C56932sn r6, AnonymousClass4BP r7, StickerPackDownloader stickerPackDownloader, int i, int i2) {
        super(context, layoutInflater, r3, r4, r5, r6, r7, stickerPackDownloader, i, i2);
    }
}
