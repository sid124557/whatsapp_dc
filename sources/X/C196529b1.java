package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.9b1  reason: invalid class name and case insensitive filesystem */
public class C196529b1 implements C84504Cp {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ AnonymousClass9dP A01;
    public final /* synthetic */ AnonymousClass4DV A02;
    public final /* synthetic */ String A03;

    public C196529b1(AnonymousClass39L r1, AnonymousClass9dP r2, AnonymousClass4DV r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void BcU() {
        AnonymousClass9dP r1 = this.A01;
        C203469nk r4 = r1.A01;
        if (!r4.BH6()) {
            r1.A00.BjL();
        }
        String str = this.A03;
        if (str == null) {
            r4.BbI(this.A00);
        } else {
            r1.A02.A04.A00(new C200469iN(this.A00, r4), str);
        }
    }

    public void BcX() {
        AnonymousClass39S r0;
        AnonymousClass9dP r1 = this.A01;
        if (r1.A01.BH6()) {
            C197419d8 r3 = r1.A02;
            r3.A0F.A0S(new C199519gi(r3));
        } else {
            r1.A00.BjL();
        }
        AnonymousClass4DV r2 = this.A02;
        AnonymousClass39W B5s = r2.B5s();
        if (B5s != null && (r0 = B5s.A01) != null && r0.A07.A02 != null) {
            C89644eZ r9 = r1.A00;
            Resources resources = r9.getResources();
            Object[] A0L = AnonymousClass002.A0L();
            long j = r2.B5s().A01.A07.A02.A00;
            C620733j r6 = r1.A02.A0J;
            String A0b = C18320x8.A0b(resources, new SimpleDateFormat("HH:mm", r6.A0O()).format(new Date(j * 1000)), A0L, 0, R.string.f11nameremoved);
            C19340zH A002 = AnonymousClass5V0.A00(r9);
            A002.A0i(false);
            A002.A0U(R.string.f11nameremoved);
            A002.A0g(A0b);
            A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            C18280x3.A0q(A002);
        }
    }
}
