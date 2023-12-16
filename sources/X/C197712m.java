package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.12m  reason: invalid class name and case insensitive filesystem */
public class C197712m extends C05570Ua {
    public C197712m(View.OnClickListener onClickListener, View view, C111095hX r15, C69263Wi r16, C620633i r17, AnonymousClass1VX r18, C66433Lk r19, String str, int i) {
        super(view);
        C06560Yg.A02(view, R.id.cancel_warning_button).setOnClickListener(onClickListener);
        Context context = view.getContext();
        C107635bd.A0E(context, C66433Lk.A00(r19, str), r15, r16, AnonymousClass0x7.A0K(view, R.id.warning_text), r17, r18, AnonymousClass002.A0F(context, "learn-more", AnonymousClass002.A0L(), 0, i), "learn-more");
    }

    public C197712m(View.OnClickListener onClickListener, View view, C111095hX r9, C66433Lk r10, String str, int i, boolean z) {
        super(view);
        WDSBanner wDSBanner = (WDSBanner) view.findViewById(R.id.banner);
        wDSBanner.setOnDismissListener(onClickListener);
        if (!z) {
            wDSBanner.A06();
        }
        AnonymousClass5OR r1 = new AnonymousClass5OR();
        r1.A02 = C995156a.A00;
        r1.A03 = AnonymousClass5VU.A00(wDSBanner.getContext(), i);
        wDSBanner.setState(r1.A00());
        wDSBanner.setOnClickListener(new C634839k(r9, wDSBanner, r10, str, 0));
    }
}
