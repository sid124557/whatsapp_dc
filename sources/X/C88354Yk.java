package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yk  reason: invalid class name and case insensitive filesystem */
public final class C88354Yk extends C05570Ua {
    public WaButtonWithLoader A00;
    public final ViewStub A01;
    public final WaTextView A02;
    public final ThumbnailButton A03;
    public final AnonymousClass5ZU A04;
    public final C105365Uq A05;
    public final AnonymousClass5UP A06;
    public final AnonymousClass53Z A07;
    public final C112765kG A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88354Yk(View view, AnonymousClass5ZU r5, C105365Uq r6, AnonymousClass5UP r7, AnonymousClass53Z r8, C112765kG r9) {
        super(view);
        C18260x0.A0Q(view, r5);
        C162457s7.A0J(r7, 4);
        C162457s7.A0J(r6, 6);
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A03 = (ThumbnailButton) view.findViewById(R.id.contact_thumbnail);
        this.A02 = C86644Kx.A0O(view, R.id.contact_name);
        ViewStub A0n = C86664Kz.A0n(view, R.id.verified_badge_stub);
        this.A01 = A0n;
        r9.A00 = R.drawable.avatar_newsletter;
        if (r7.A02()) {
            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) view.findViewById(R.id.follow_button);
            waButtonWithLoader.setVariant(C142006wU.TONAL);
            waButtonWithLoader.setSize(C141606vq.SMALL);
            this.A00 = waButtonWithLoader;
        }
        A0n.setLayoutResource(r7.A01.A0X(5276) ? R.layout.f8nameremoved : R.layout.f8nameremoved);
    }
}
