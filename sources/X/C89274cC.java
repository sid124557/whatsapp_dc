package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.4cC  reason: invalid class name and case insensitive filesystem */
public final class C89274cC extends C88944b3 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C105815Wn A01;
    public final /* synthetic */ C624134x A02;
    public final /* synthetic */ String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89274cC(android.content.Context r7, X.C69263Wi r8, X.C85244Fm r9, X.C105815Wn r10, X.C620633i r11, X.C624134x r12, java.lang.String r13) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r6.A00 = r7
            r5 = r13
            r6.A03 = r13
            r6.A01 = r10
            r6.A02 = r12
            r3 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89274cC.<init>(android.content.Context, X.3Wi, X.4Fm, X.5Wn, X.33i, X.34x, java.lang.String):void");
    }

    public void onClick(View view) {
        Context context;
        Pair pair;
        String str = this.A03;
        String schemeSpecificPart = Uri.parse(str).getSchemeSpecificPart();
        C105815Wn r5 = this.A01;
        Map map = r5.A06.A00;
        if (map.get(schemeSpecificPart) != null) {
            context = this.A00;
            pair = (Pair) map.get(schemeSpecificPart);
        } else if (r5.A00 != null) {
            Log.d("conversationRow/getPhoneHyperLinkTask/skip/task-already-exists");
            return;
        } else if (!r5.A03.A0F()) {
            context = this.A00;
            pair = null;
        } else {
            C69263Wi r14 = r5.A01;
            AnonymousClass31C r17 = r5.A09;
            AnonymousClass55Q r13 = new AnonymousClass55Q(r14, r5.A04, new C149737Nr(this.A00, r5, this.A02, schemeSpecificPart, str), r17, schemeSpecificPart);
            C18270x1.A0w(r13, r5.A0A);
            r5.A00 = r13;
            return;
        }
        C162457s7.A0H(schemeSpecificPart);
        C105815Wn.A00(context, pair, r5, schemeSpecificPart, str, this.A02.A1J.A02);
    }
}
