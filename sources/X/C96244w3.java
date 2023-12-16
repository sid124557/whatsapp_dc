package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.4w3  reason: invalid class name and case insensitive filesystem */
public class C96244w3 extends AnonymousClass4WE {
    public final C116985rC A00;
    public final C146877By A01;
    public final C146887Bz A02;
    public final AnonymousClass7C0 A03;
    public final AnonymousClass7C1 A04;
    public final AnonymousClass7C2 A05;
    public final AnonymousClass7C4 A06;

    public AnonymousClass6mM A0M(ViewGroup viewGroup, int i) {
        if (i == 57) {
            View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            ImageView A0E = AnonymousClass0x9.A0E(A0R, R.id.education_icon);
            Drawable A012 = C06130Wj.A01(A0E.getBackground());
            AnonymousClass0YG.A06(A012, AnonymousClass0Y8.A04(A0R.getContext(), R.color.f5nameremoved));
            A0E.setBackground(A012);
            C107335b8.A0E(A0E, AnonymousClass0Y8.A04(A0R.getContext(), R.color.f5nameremoved));
            return new AnonymousClass6m3(A0R);
        } else if (i == 71) {
            return new C28361gk(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
        } else {
            if (i == 79) {
                return new AnonymousClass6mH(viewGroup, this.A06.A00.A01.ACg());
            }
            switch (i) {
                case 59:
                    break;
                case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                    return new C96714wo(C86604Kt.A0E(viewGroup, 0).inflate(R.layout.f8nameremoved, viewGroup, false), C64333Db.A2t(this.A04.A00.A04));
                case 61:
                    return new AnonymousClass6m1(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
                case 62:
                    AnonymousClass7C0 r3 = this.A03;
                    View A0R2 = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                    C64333Db r0 = r3.A00.A04;
                    return new C96754ws(A0R2, C64333Db.A4B(r0), (AnonymousClass2HH) r0.A00.A66.get());
                case 63:
                    C146887Bz r32 = this.A02;
                    View A0I = C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false);
                    C64333Db r02 = r32.A00.A04;
                    AnonymousClass1VX A4B = C64333Db.A4B(r02);
                    return new C28421gq(A0I, C64333Db.A00(r02), C64333Db.A04(r02), C64333Db.A2o(r02), A4B);
                case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                    return new AnonymousClass6m2(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
                default:
                    switch (i) {
                        case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                            return new AnonymousClass6mM(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                        case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            break;
                        case 68:
                            return new C96474wQ(AnonymousClass4WE.A00(viewGroup));
                        case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                            return new AnonymousClass6mI(viewGroup, this.A01.A00.A01.ACg());
                        default:
                            return super.BQR(viewGroup, i);
                    }
            }
            return new C96534wW(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
    }

    public C96244w3(C116985rC r1, C101325Ei r2, C101335Ej r3, C146877By r4, C146887Bz r5, AnonymousClass7C0 r6, AnonymousClass7C1 r7, AnonymousClass7C2 r8, AnonymousClass7C4 r9) {
        super(r1, r2, r3);
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
        this.A06 = r9;
        this.A00 = r1;
    }
}
