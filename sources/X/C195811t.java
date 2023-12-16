package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.11t  reason: invalid class name and case insensitive filesystem */
public final class C195811t extends AnonymousClass0R6 {
    public List A00 = C72023d3.A00;
    public final C620733j A01;
    public final AnonymousClass4GQ A02;

    public C195811t(C620733j r2, AnonymousClass4GQ r3) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new C196512a(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        String str;
        WaTextView waTextView;
        int i2;
        C196512a r92 = (C196512a) r9;
        C162457s7.A0J(r92, 0);
        C153197aq r5 = (C153197aq) this.A00.get(i);
        Context context = r92.A0H.getContext();
        String A04 = r5.A04("channel_name");
        if (A04 == null || A04.length() == 0) {
            str = "";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(" · ");
            str = AnonymousClass000.A0X(r5.A04("channel_name"), A0o);
        }
        String A05 = C107505bQ.A05(this.A01, TimeUnit.SECONDS.toMillis(Long.parseLong(C18300x5.A0l("creation_time", r5.A00))));
        C162457s7.A0D(A05);
        int ordinal = ((GraphQLXWA2ReportStatus) r5.A03(GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "status")).ordinal();
        if (ordinal == 1) {
            r92.A01.setImageResource(R.drawable.vec_ic_schedule_24dp);
            waTextView = r92.A03;
            i2 = R.string.f11nameremoved;
            String A0X = AnonymousClass0x2.A0X(context, str, 1, i2);
            C162457s7.A0D(A0X);
            waTextView.setText(AnonymousClass2AB.A00(A0X));
        } else if (ordinal == 3 || ordinal == 2 || ordinal == 4) {
            r92.A01.setImageResource(R.drawable.ic_description);
            waTextView = r92.A03;
            i2 = R.string.f11nameremoved;
            String A0X2 = AnonymousClass0x2.A0X(context, str, 1, i2);
            C162457s7.A0D(A0X2);
            waTextView.setText(AnonymousClass2AB.A00(A0X2));
        }
        AnonymousClass001.A0y(context, r92.A02, new Object[]{A05}, R.string.f11nameremoved);
        C634339f.A00(r92.A00, this, r5, 9);
    }
}
