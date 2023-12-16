package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yg  reason: invalid class name and case insensitive filesystem */
public class C88314Yg extends C05570Ua {
    public final TextView A00;
    public final C66663Mh A01;
    public final AnonymousClass5YB A02;
    public final ThumbnailButton A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C620733j A06;
    public final AnonymousClass4FV A07;

    public C88314Yg(View view, C66663Mh r3, AnonymousClass64J r4, C64773Ex r5, AnonymousClass5ZU r6, C620733j r7, AnonymousClass4FV r8) {
        super(view);
        this.A07 = r8;
        this.A01 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = C86664Kz.A16(view, R.id.storage_usage_chat_contact_photo);
        this.A00 = C18300x5.A0G(view, R.id.storage_usage_chat_used_space);
        this.A02 = AnonymousClass5YB.A00(view, r4, R.id.storage_usage_chat_contact_name);
        C107295b4.A02(view);
    }
}
