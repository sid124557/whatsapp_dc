package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.GifHelper;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.5q3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116295q3 implements C1227065k {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ AnonymousClass4FU A04;
    public final /* synthetic */ C185388tZ A05;
    public final /* synthetic */ AnonymousClass5Ul A06;
    public final /* synthetic */ C108845de A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public final void BTS(File file) {
        C106985aV r0;
        AnonymousClass5Ul r13 = this.A06;
        Uri uri = this.A03;
        Context context = this.A02;
        List list = this.A09;
        int i = this.A01;
        String str = this.A08;
        C108845de r15 = this.A07;
        C185388tZ r14 = this.A05;
        int i2 = this.A00;
        AnonymousClass4FU r5 = this.A04;
        try {
            String queryParameter = uri.getQueryParameter("doodle");
            if (queryParameter != null) {
                r0 = C106985aV.A01(context, r13.A06, r13.A09, r13.A0I, C107655bf.A0R(r13.A00, queryParameter));
                if (r0 != null) {
                    r0.A03 = queryParameter;
                } else {
                    throw AnonymousClass001.A0g("Doodle object is null");
                }
            } else {
                r0 = null;
            }
            File file2 = file;
            if (!r13.A09(r14, r15, r0, (C624134x) null, file2, str, list, i, i2, GifHelper.A01(file2))) {
                r13.A01.A0H(R.string.f11nameremoved, 0);
            }
            r14.Bf4(uri);
        } catch (IOException | NullPointerException e) {
            if (e.getMessage() == null || !C86624Kv.A1Z(e)) {
                r13.A01.A0H(R.string.f11nameremoved, 0);
            } else {
                r13.A01.A0O(r5, context.getString(R.string.f11nameremoved));
            }
            Log.e("sendmedia/sendvideo/error ", e);
        }
    }

    public /* synthetic */ C116295q3(Context context, Uri uri, AnonymousClass4FU r3, C185388tZ r4, AnonymousClass5Ul r5, C108845de r6, String str, List list, int i, int i2) {
        this.A06 = r5;
        this.A03 = uri;
        this.A02 = context;
        this.A09 = list;
        this.A01 = i;
        this.A08 = str;
        this.A07 = r6;
        this.A05 = r4;
        this.A00 = i2;
        this.A04 = r3;
    }
}
