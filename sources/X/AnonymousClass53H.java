package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.status.ContactStatusThumbnail;

/* renamed from: X.53H  reason: invalid class name */
public final class AnonymousClass53H extends C987553c {
    public final View A00;
    public final ViewStub A01;
    public final AnonymousClass64J A02;
    public final AnonymousClass5YB A03;
    public final AnonymousClass5ZU A04;
    public final C620733j A05;
    public final ContactStatusThumbnail A06;
    public final AnonymousClass66J A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53H(View view, AnonymousClass64J r11, AnonymousClass5UX r12, AnonymousClass5ZU r13, C105365Uq r14, C620733j r15, AnonymousClass66J r16, C112765kG r17) {
        super(view, r12, r14, (AnonymousClass5C9) null, r17, (C102705Jy) null, (AnonymousClass5JX) null);
        C162457s7.A0J(r12, 1);
        C18260x0.A0b(r13, r15, r11, 3);
        C18260x0.A0U(r14, view);
        this.A04 = r13;
        this.A05 = r15;
        this.A02 = r11;
        this.A00 = view;
        this.A07 = r16;
        this.A06 = (ContactStatusThumbnail) view.findViewById(R.id.contact_thumbnail);
        this.A01 = C86664Kz.A0n(view, R.id.status_badge_stub);
        this.A03 = AnonymousClass5YB.A00(view, r11, R.id.contact_name);
    }
}
