package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5hh  reason: invalid class name and case insensitive filesystem */
public class C111195hh implements C184998st {
    public View A00;
    public final C08270df A01;
    public final AnonymousClass4Pc A02;
    public final C56612sH A03;
    public final C59952xl A04;
    public final AnonymousClass7NC A05;

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        this.A02.getContext();
        return false;
    }

    public void BrS() {
        AnonymousClass4Pc r7 = this.A02;
        r7.getContext();
        View view = this.A00;
        if (view == null) {
            view = AnonymousClass001.A0R(C18280x3.A0D(r7), r7, R.layout.f8nameremoved);
            this.A00 = view;
        }
        C18300x5.A0G(view, R.id.smb_warning_banner_body).setText(C107575bX.A00(r7.getContext(), new Object[]{C107575bX.A04(r7.getContext(), R.color.f5nameremoved)}, R.string.f11nameremoved));
        AnonymousClass5Yj.A0A(r7.getContext(), r7, R.attr.f3nameremoved, R.color.f5nameremoved);
        AnonymousClass7NC r3 = this.A05;
        r7.setOnClickListener(new C109685f1(this, 18));
        C06560Yg.A02(view, R.id.close).setOnClickListener(new C109685f1(this, 19));
        view.setVisibility(0);
        if (!r3.A01.A0X(1730)) {
            AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
            r1.A00 = 1;
            r1.A01 = 32;
            r3.A03.BhB(r1);
        }
        this.A04.A00();
    }

    public C111195hh(C08270df r1, AnonymousClass4Pc r2, C56612sH r3, C59952xl r4, AnonymousClass7NC r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }
}
