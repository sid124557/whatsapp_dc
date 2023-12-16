package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.6AW  reason: invalid class name */
public class AnonymousClass6AW implements C1227065k {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;
    public boolean A09;
    public final int A0A;

    public AnonymousClass6AW(Context context, Uri uri, AnonymousClass4FU r3, C185388tZ r4, AnonymousClass5Ul r5, C108845de r6, String str, List list, int i, int i2, boolean z) {
        this.A0A = i2;
        this.A01 = r5;
        this.A00 = i;
        this.A03 = uri;
        this.A09 = z;
        this.A04 = context;
        this.A08 = str;
        this.A05 = list;
        this.A06 = r4;
        this.A07 = r3;
        this.A02 = r6;
    }

    public final void BTS(File file) {
        AnonymousClass4FS r0;
        C172688Mh r1;
        int i = this.A0A;
        AnonymousClass5Ul r6 = (AnonymousClass5Ul) this.A01;
        File file2 = file;
        if (i != 0) {
            int i2 = this.A00;
            Uri uri = (Uri) this.A03;
            boolean z = this.A09;
            Context context = (Context) this.A04;
            String str = this.A08;
            List list = (List) this.A05;
            C185388tZ r5 = (C185388tZ) this.A06;
            AnonymousClass4FU r4 = (AnonymousClass4FU) this.A07;
            C108845de r7 = (C108845de) this.A02;
            if (r6.A0A.A0X(6760)) {
                r0 = r6.A0L;
                r1 = new C172688Mh(context, uri, r4, r5, r6, r7, file2, str, list, i2, z);
            } else {
                r6.A01(context, uri, r4, r5, r7, file2, str, list, i2, z);
                return;
            }
        } else {
            int i3 = this.A00;
            Uri uri2 = (Uri) this.A03;
            boolean z2 = this.A09;
            Context context2 = (Context) this.A04;
            String str2 = this.A08;
            List list2 = (List) this.A05;
            C185388tZ r52 = (C185388tZ) this.A06;
            AnonymousClass4FU r42 = (AnonymousClass4FU) this.A07;
            C108845de r72 = (C108845de) this.A02;
            if (r6.A0A.A0X(6760)) {
                r0 = r6.A0L;
                r1 = new C172688Mh(context2, uri2, r42, r52, r6, r72, file2, (Integer) null, str2, list2, i3, 0, z2);
            } else {
                r6.A02(context2, uri2, r42, r52, r72, file2, str2, list2, i3, z2);
                return;
            }
        }
        r0.BkM(r1);
    }
}
