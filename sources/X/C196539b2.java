package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.9b2  reason: invalid class name and case insensitive filesystem */
public class C196539b2 implements C84504Cp {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ BrazilOrderDetailsActivity A01;
    public final /* synthetic */ AnonymousClass9XZ A02;
    public final /* synthetic */ AnonymousClass4DV A03;
    public final /* synthetic */ String A04;

    public C196539b2(AnonymousClass39L r1, BrazilOrderDetailsActivity brazilOrderDetailsActivity, AnonymousClass9XZ r3, AnonymousClass4DV r4, String str) {
        this.A01 = brazilOrderDetailsActivity;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = str;
    }

    public void BcU() {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        brazilOrderDetailsActivity.BjL();
        String str = brazilOrderDetailsActivity.A0o;
        if (str == null) {
            brazilOrderDetailsActivity.A7M(this.A00.A02, this.A02, "p2m_context", this.A04);
        } else {
            brazilOrderDetailsActivity.A09.A00(new C201249jl(this.A00, this, this.A02, this.A04), str);
        }
    }

    public void BcX() {
        AnonymousClass39S r0;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        brazilOrderDetailsActivity.BjL();
        AnonymousClass4DV r1 = this.A03;
        AnonymousClass39W B5s = r1.B5s();
        if (B5s != null && (r0 = B5s.A01) != null && r0.A07.A02 != null) {
            Resources resources = brazilOrderDetailsActivity.getResources();
            Object[] A0L = AnonymousClass002.A0L();
            long j = r1.B5s().A01.A07.A02.A00;
            C620733j r6 = brazilOrderDetailsActivity.A06;
            String A0b = C18320x8.A0b(resources, new SimpleDateFormat("HH:mm", r6.A0O()).format(new Date(j * 1000)), A0L, 0, R.string.f11nameremoved);
            C19340zH A002 = AnonymousClass5V0.A00(brazilOrderDetailsActivity);
            A002.A0i(false);
            A002.A0U(R.string.f11nameremoved);
            A002.A0g(A0b);
            A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            C18280x3.A0q(A002);
        }
    }
}
