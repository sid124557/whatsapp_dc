package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.5eq  reason: invalid class name and case insensitive filesystem */
public class C109575eq implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C109575eq(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A04 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        String str;
        int i;
        C102355In r4;
        C06270Wx r5;
        C95814uZ r8;
        Context A0T;
        int i2;
        long j;
        switch (this.A05) {
            case 0:
                C88314Yg r42 = (C88314Yg) this.A01;
                str = this.A04;
                i = this.A00;
                AnonymousClass3ZS r3 = (AnonymousClass3ZS) this.A02;
                r5 = (C06270Wx) this.A03;
                AnonymousClass4FV r2 = r42.A07;
                C25321aK r1 = new C25321aK();
                AnonymousClass296.A00(r1, str, 3, i);
                r2.BhD(r1);
                A0T = C86664Kz.A0T(r42);
                i2 = 0;
                r8 = r3.A01();
                j = r3.A00.A0I;
                break;
            case 1:
                C88344Yj r32 = (C88344Yj) this.A01;
                str = this.A04;
                i = this.A00;
                r4 = (C102355In) this.A02;
                r5 = (C06270Wx) this.A03;
                AnonymousClass4FV r22 = r32.A06;
                C25321aK r12 = new C25321aK();
                AnonymousClass296.A00(r12, str, 5, i);
                r22.BhD(r12);
                r8 = null;
                A0T = C86664Kz.A0T(r32);
                i2 = 1;
                break;
            default:
                C88344Yj r33 = (C88344Yj) this.A01;
                str = this.A04;
                i = this.A00;
                r4 = (C102355In) this.A02;
                r5 = (C06270Wx) this.A03;
                AnonymousClass4FV r23 = r33.A06;
                C25321aK r13 = new C25321aK();
                AnonymousClass296.A00(r13, str, 4, i);
                r23.BhD(r13);
                r8 = null;
                A0T = C86664Kz.A0T(r33);
                i2 = 2;
                break;
        }
        j = r4.A01;
        Intent className = C18320x8.A07().setClassName(A0T.getPackageName(), "com.whatsapp.storage.StorageUsageGalleryActivity");
        className.putExtra("gallery_type", i2);
        C627336j.A0D(className, r8, "jid");
        className.putExtra("memory_size", j);
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        r5.A0H(className);
    }
}
