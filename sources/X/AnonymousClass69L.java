package X;

import android.content.Context;
import android.net.Uri;
import java.net.URL;

/* renamed from: X.69L  reason: invalid class name */
public class AnonymousClass69L implements C1227165l {
    public Object A00;
    public final int A01;

    public AnonymousClass69L(C116505qO r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BP1() {
        String str;
        String str2;
        Context context;
        C150197Pr r4;
        C111095hX r3;
        int i;
        int i2 = this.A01;
        C116505qO r6 = (C116505qO) this.A00;
        if (i2 != 0) {
            URL url = r6.A0H;
            if (url != null) {
                str2 = url.toString();
            } else {
                str2 = r6.A0F;
            }
            context = r6.A0K;
            r4 = r6.A0Z;
            r3 = r6.A0M;
            i = 2;
        } else {
            URL url2 = r6.A0G;
            if (url2 != null) {
                str = url2.toString();
            } else {
                str = r6.A0F;
            }
            context = r6.A0K;
            r4 = r6.A0Z;
            r3 = r6.A0M;
            i = 3;
        }
        Integer valueOf = Integer.valueOf(i);
        if (str2 != null) {
            r3.BkW(context, Uri.parse(str2), (C624134x) null);
        }
        r4.A02 = true;
        r4.A00 = valueOf;
        r6.Az5();
    }
}
