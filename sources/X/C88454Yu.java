package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.4Yu  reason: invalid class name and case insensitive filesystem */
public class C88454Yu extends C05570Ua {
    public AnonymousClass121 A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ProgressBar A09;
    public final ProgressBar A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final GridLayoutManager A0E;
    public final RecyclerView A0F;
    public final CircularProgressBar A0G;
    public final WaTextView A0H;
    public final /* synthetic */ StickerStoreTabFragment A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88454Yu(View view, StickerStoreTabFragment stickerStoreTabFragment) {
        super(view);
        this.A0I = stickerStoreTabFragment;
        this.A02 = view;
        this.A0D = AnonymousClass002.A09(view, R.id.sticker_pack_title);
        this.A0B = AnonymousClass002.A09(view, R.id.sticker_pack_author);
        this.A0C = AnonymousClass002.A09(view, R.id.sticker_pack_filesize);
        this.A06 = AnonymousClass0x9.A0F(view, R.id.button_one);
        this.A07 = AnonymousClass0x9.A0F(view, R.id.button_two);
        this.A08 = AnonymousClass0x9.A0E(view, R.id.sticker_pack_avatar_info_button);
        this.A09 = (ProgressBar) view.findViewById(R.id.pack_download_progress);
        RecyclerView A0w = C86664Kz.A0w(view, R.id.sticker_row_recycler);
        this.A0F = A0w;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(stickerStoreTabFragment.A00);
        this.A0E = gridLayoutManager;
        gridLayoutManager.A1X(1);
        A0w.setLayoutManager(gridLayoutManager);
        this.A01 = view.findViewById(R.id.bullet_file_size);
        this.A04 = view.findViewById(R.id.sticker_update_button);
        WaTextView A0O = C86644Kx.A0O(view, R.id.sticker_update_text);
        this.A0H = A0O;
        this.A0A = (ProgressBar) view.findViewById(R.id.pack_update_progress);
        this.A0G = (CircularProgressBar) view.findViewById(R.id.sticker_row_loading);
        this.A03 = view.findViewById(R.id.new_pack_badge);
        this.A05 = AnonymousClass0x9.A0F(view, R.id.sticker_animationlist);
        C106905aM.A04(A0O);
    }
}
