package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.Reference;

/* renamed from: X.6Bn  reason: invalid class name and case insensitive filesystem */
public class C124246Bn implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C124246Bn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final void AwB(Object obj) {
        if (this.A04 != 0) {
            C69263Wi r1 = (C69263Wi) this.A01;
            C111095hX r4 = (C111095hX) this.A02;
            C30471mV r3 = (C30471mV) this.A03;
            Uri uri = (Uri) obj;
            C162457s7.A0J(uri, 4);
            Context A0U = C86664Kz.A0U((Reference) this.A00);
            if (A0U != null) {
                r1.A0D();
                Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
                A09.setDataAndType(uri, r3.A05);
                A09.setFlags(1);
                r4.A0A(A0U, A09);
                return;
            }
            return;
        }
        C113045kn r7 = (C113045kn) this.A00;
        Context context = (Context) this.A01;
        C624134x r5 = (C624134x) this.A02;
        AnonymousClass39W r42 = (AnonymousClass39W) this.A03;
        if (AnonymousClass001.A1Z(obj)) {
            AnonymousClass39E r0 = r42.A04;
            if (r0 != null) {
                r7.A04.A01(r0.A00, AnonymousClass74S.A00(), new AnonymousClass63O(context, r7, r5, r42));
                return;
            }
            return;
        }
        AnonymousClass5X1.A00(context);
    }
}
