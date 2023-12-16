package X;

import android.content.Intent;

/* renamed from: X.5jI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112165jI implements AnonymousClass49M {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ Integer A02;

    public final void BeE(boolean z) {
        C89654ea r5 = this.A01;
        Integer num = this.A02;
        int i = this.A00;
        Intent A07 = C18320x8.A07();
        A07.setClassName(r5.getPackageName(), "com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity");
        if (num != null) {
            A07.putExtra("bonsaiDiscoveryEntryPoint", num);
        }
        r5.startActivityForResult(A07, i);
    }

    public /* synthetic */ C112165jI(C89654ea r1, Integer num, int i) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = i;
    }
}
