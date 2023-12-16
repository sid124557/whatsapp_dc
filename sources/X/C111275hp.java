package X;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Set;

/* renamed from: X.5hp  reason: invalid class name and case insensitive filesystem */
public class C111275hp implements AnonymousClass64E {
    public final /* synthetic */ AnonymousClass51x A00;

    public void BV7(MotionEvent motionEvent, View view, String str) {
        String str2 = str;
        boolean contains = AnonymousClass5CC.A00(str).contains("…");
        AnonymousClass51x r5 = this.A00;
        r5.A0B();
        C624134x r2 = ((AnonymousClass51w) r5).A06;
        View view2 = r5.A00;
        C626936e.A04(view2);
        Context context = view2.getContext();
        String str3 = r2.A1J.A01;
        C184988ss r4 = r5.A0A;
        Set BBH = r5.A0K.BBH(r2.A0n(), r2, str);
        boolean z = true;
        if (r5.A0N.A0B(Uri.parse(str), (Uri) null) == 1) {
            z = false;
        }
        AnonymousClass5VM.A00(context, r4, r5, str2, str3, BBH, contains, z);
    }

    public C111275hp(AnonymousClass51x r1) {
        this.A00 = r1;
    }
}
