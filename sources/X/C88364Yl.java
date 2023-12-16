package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yl  reason: invalid class name and case insensitive filesystem */
public class C88364Yl extends C05570Ua {
    public final C56972sr A00;
    public final AnonymousClass5YB A01;
    public final WaImageView A02;
    public final WaImageView A03;
    public final AnonymousClass5MP A04;
    public final ThumbnailButton A05;
    public final C64773Ex A06;
    public final C105365Uq A07;
    public final C56892sj A08;
    public final AnonymousClass1VX A09;

    public C88364Yl(View view, C56972sr r6, AnonymousClass64J r7, AnonymousClass5MP r8, C64773Ex r9, C105365Uq r10, C56892sj r11, AnonymousClass1VX r12) {
        super(view);
        ThumbnailButton A16 = C86664Kz.A16(view, R.id.contact_photo);
        this.A05 = A16;
        this.A03 = AnonymousClass0x9.A0L(view, R.id.voice_call);
        this.A02 = AnonymousClass0x9.A0L(view, R.id.video_call);
        this.A07 = r10;
        this.A06 = r9;
        this.A09 = r12;
        this.A08 = r11;
        this.A00 = r6;
        this.A04 = r8;
        this.A01 = AnonymousClass5YB.A00(view, r7, R.id.contact_name);
        View A022 = C06560Yg.A02(view, R.id.multi_contact_photo);
        A022.setVisibility(8);
        A16.setVisibility(0);
        C86604Kt.A1E(view, R.id.date_time, 8);
        C86604Kt.A1E(view, R.id.count, 8);
        C86604Kt.A1E(view, R.id.call_type_icon, 8);
        C86604Kt.A1E(view, R.id.selection_check, 8);
        AnonymousClass0YY.A06(A022, 2);
        C06560Yg.A0O(view, new C188768zS(view, 0, this));
        C107235av.A02(view);
    }
}
