package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.FacebookMapPreview;

/* renamed from: X.4wv  reason: invalid class name and case insensitive filesystem */
public final class C96784wv extends AnonymousClass6mM {
    public AnonymousClass5ZO A00;
    public FacebookMapPreview A01;
    public AnonymousClass5UT A02;
    public C96384wH A03;
    public AnonymousClass5ZR A04;
    public C622534h A05;
    public final View A06;
    public final C105085Tn A07;
    public final C151167Tr A08;
    public final C105355Up A09;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96384wH r4 = (C96384wH) obj;
        C162457s7.A0J(r4, 0);
        this.A03 = r4;
        this.A01.A00.A0J(new C107605ba(r4, 2, this));
    }

    public final C166477yk A0A(float f) {
        Double d = this.A00.A04;
        C626936e.A06(d);
        C162457s7.A0D(d);
        double doubleValue = d.doubleValue();
        Double d2 = this.A00.A05;
        C626936e.A06(d2);
        C162457s7.A0D(d2);
        return new C166477yk(C108975ds.A00(doubleValue, d2.doubleValue()), f, 90.0f, 0.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96784wv(View view, C105085Tn r7, C151167Tr r8, AnonymousClass5ZR r9, C622534h r10, C105355Up r11) {
        super(view);
        C18260x0.A0e(r10, r9, r11, r7);
        this.A06 = view;
        this.A05 = r10;
        this.A04 = r9;
        this.A09 = r11;
        this.A07 = r7;
        this.A08 = r8;
        AnonymousClass5ZO A022 = r7.A02();
        A022 = A022 == null ? AnonymousClass5ZO.A01() : A022;
        C162457s7.A0H(A022);
        this.A00 = A022;
        ViewGroup A0I = C86644Kx.A0I(view, R.id.map_preview);
        C162457s7.A0H(A0I);
        this.A01 = new FacebookMapPreview(A0I, new C1892990t(this, 2), A0A(15.5f), this.A05);
    }
}
