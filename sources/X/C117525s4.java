package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.5s4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117525s4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C117015rF A03;
    public final /* synthetic */ AnonymousClass3ZH A04;
    public final /* synthetic */ AnonymousClass7ID A05;
    public final /* synthetic */ AnonymousClass4YV A06;
    public final /* synthetic */ C87974Wv A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public final void run() {
        String A0G;
        int i;
        AnonymousClass7IE r8;
        C87974Wv r10 = this.A07;
        boolean z = this.A09;
        Context context = this.A01;
        AnonymousClass3ZH r4 = this.A04;
        int i2 = this.A00;
        AnonymousClass4YV r9 = this.A06;
        AnonymousClass7ID r7 = this.A05;
        Bitmap bitmap = this.A02;
        String str = this.A08;
        C117015rF r6 = this.A03;
        if (z) {
            A0G = context.getString(R.string.f11nameremoved);
            i = R.color.f5nameremoved;
        } else {
            A0G = r10.A05.A0G(r10.A0K(r4, i2).A00, r4, i2);
            boolean isEmpty = TextUtils.isEmpty(A0G);
            i = R.color.f5nameremoved;
            if (isEmpty) {
                r8 = new AnonymousClass7IE((String) null, 0);
                r10.A01.A0S(new C117455rx(bitmap, r6, r7, r8, r9, r10, str, z));
            }
        }
        r8 = new AnonymousClass7IE(A0G, i);
        r10.A01.A0S(new C117455rx(bitmap, r6, r7, r8, r9, r10, str, z));
    }

    public /* synthetic */ C117525s4(Context context, Bitmap bitmap, C117015rF r3, AnonymousClass3ZH r4, AnonymousClass7ID r5, AnonymousClass4YV r6, C87974Wv r7, String str, int i, boolean z) {
        this.A07 = r7;
        this.A09 = z;
        this.A01 = context;
        this.A04 = r4;
        this.A00 = i;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = bitmap;
        this.A08 = str;
        this.A03 = r3;
    }
}
