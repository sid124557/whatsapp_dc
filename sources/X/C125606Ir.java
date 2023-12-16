package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.6Ir  reason: invalid class name and case insensitive filesystem */
public class C125606Ir extends C05570Ua {
    public View.OnLongClickListener A00;
    public AnonymousClass39M A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04 = new C1891790h(this, 5);
    public final AnonymousClass33O A05;
    public final AnonymousClass4BP A06;
    public final StickerView A07;
    public final Integer A08;

    public C125606Ir(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass33O r5, AnonymousClass4BP r6, Integer num) {
        super(AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved));
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(R.id.sticker_view);
        this.A07 = stickerView;
        stickerView.A03 = true;
    }
}
