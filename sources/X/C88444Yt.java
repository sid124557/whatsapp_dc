package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;

/* renamed from: X.4Yt  reason: invalid class name and case insensitive filesystem */
public class C88444Yt extends C05570Ua {
    public AnonymousClass1nF A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ DocumentsGalleryFragment A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88444Yt(View view, DocumentsGalleryFragment documentsGalleryFragment) {
        super(view);
        this.A0B = documentsGalleryFragment;
        this.A05 = AnonymousClass0x9.A0F(view, R.id.icon);
        this.A09 = C86614Ku.A0I(view);
        this.A06 = AnonymousClass002.A09(view, R.id.date);
        this.A08 = AnonymousClass002.A09(view, R.id.size);
        this.A03 = view.findViewById(R.id.bullet_size);
        this.A07 = AnonymousClass002.A09(view, R.id.info);
        this.A01 = view.findViewById(R.id.bullet_info);
        this.A0A = AnonymousClass002.A09(view, R.id.type);
        this.A04 = view.findViewById(R.id.starred_status);
        this.A02 = view.findViewById(R.id.kept_status);
        C635339p.A00(view, this, 30);
        AnonymousClass692.A00(view, this, 7);
    }
}
