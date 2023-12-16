package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.12g  reason: invalid class name and case insensitive filesystem */
public class C197112g extends C05570Ua {
    public final ImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass2FN A05;
    public final C56612sH A06;
    public final C620733j A07;
    public final AnonymousClass1VX A08;

    public C197112g(View view, AnonymousClass2FN r3, C56612sH r4, C620733j r5, AnonymousClass1VX r6) {
        super(view);
        this.A06 = r4;
        this.A08 = r6;
        this.A07 = r5;
        this.A05 = r3;
        this.A01 = AnonymousClass0x9.A0E(view, R.id.device_icon);
        this.A03 = C18300x5.A0G(view, R.id.name);
        this.A04 = C18300x5.A0G(view, R.id.status);
        this.A02 = AnonymousClass0x9.A0E(view, R.id.sync_badge);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.error_badge);
    }
}
