package X;

import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.60t  reason: invalid class name and case insensitive filesystem */
public final class C1214960t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4Rg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1214960t(AnonymousClass4Rg r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104485Rd r9 = (C104485Rd) obj;
        int i = r9.A00;
        if (i == 0) {
            this.this$0.A0U.A06(0);
        } else if (i == 1) {
            this.this$0.A0U.A06(8);
        }
        Integer num = r9.A01;
        AnonymousClass4Rg r0 = this.this$0;
        if (num != null) {
            WaTextView waTextView = r0.A06;
            Object[] objArr = {num};
            C86614Ku.A16(r0.getResources(), waTextView, objArr, R.plurals.f9nameremoved, num.intValue());
        } else {
            r0.A06.setText(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
