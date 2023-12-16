package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.8Mh  reason: invalid class name and case insensitive filesystem */
public class C172688Mh implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public String A09;
    public boolean A0A;
    public final int A0B = 0;

    public C172688Mh(Context context, Uri uri, AnonymousClass4FU r4, C185388tZ r5, AnonymousClass5Ul r6, C108845de r7, File file, Integer num, String str, List list, int i, int i2, boolean z) {
        this.A01 = r6;
        this.A00 = i;
        this.A04 = uri;
        this.A0A = z;
        this.A05 = file;
        this.A06 = context;
        this.A09 = str;
        this.A07 = list;
        this.A08 = r5;
        this.A03 = r4;
        this.A02 = r7;
    }

    public final void run() {
        int i = this.A0B;
        AnonymousClass5Ul r1 = (AnonymousClass5Ul) this.A01;
        int i2 = this.A00;
        Uri uri = (Uri) this.A04;
        boolean z = this.A0A;
        if (i != 0) {
            String str = this.A09;
            C185388tZ r5 = (C185388tZ) this.A08;
            r1.A01((Context) this.A05, uri, (AnonymousClass4FU) this.A03, r5, (C108845de) this.A02, (File) this.A06, str, (List) this.A07, i2, z);
            return;
        }
        Context context = (Context) this.A06;
        C185388tZ r52 = (C185388tZ) this.A08;
        r1.A02(context, uri, (AnonymousClass4FU) this.A03, r52, (C108845de) this.A02, (File) this.A05, this.A09, (List) this.A07, i2, z);
    }

    public C172688Mh(Context context, Uri uri, AnonymousClass4FU r4, C185388tZ r5, AnonymousClass5Ul r6, C108845de r7, File file, String str, List list, int i, boolean z) {
        this.A01 = r6;
        this.A00 = i;
        this.A04 = uri;
        this.A0A = z;
        this.A05 = context;
        this.A09 = str;
        this.A06 = file;
        this.A07 = list;
        this.A08 = r5;
        this.A03 = r4;
        this.A02 = r7;
    }
}
