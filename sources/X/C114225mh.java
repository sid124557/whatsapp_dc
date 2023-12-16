package X;

import android.net.Uri;

/* renamed from: X.5mh  reason: invalid class name and case insensitive filesystem */
public final class C114225mh implements C182468oS {
    public final int A00;
    public final Uri A01;
    public final C620633i A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass5O9 A04;
    public final C58392vB A05;
    public final boolean A06;

    public C186308v5 B0p(boolean z) {
        String str;
        C108945dp r2;
        Uri uri = this.A01;
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        String A0o = C18290x4.A0o(C95324tN.A00);
        String str2 = null;
        C162457s7.A0J(str, 0);
        if (str.startsWith(A0o)) {
            AnonymousClass1VX r6 = this.A03;
            C620633i r5 = this.A02;
            C58392vB r7 = this.A05;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            return new C95324tN(r5, r6, r7, str2, this.A00);
        }
        if (!z) {
            r2 = new C108945dp();
            r2.A05 = true;
        } else {
            int i = this.A00;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            boolean z2 = this.A06;
            r2 = new C108945dp();
            r2.A01 = 2;
            r2.A00 = i;
            r2.A02 = 2;
            r2.A03 = str2;
            r2.A04 = z2;
        }
        C186308v5 A002 = this.A04.A00(r2);
        C162457s7.A0H(A002);
        return A002;
    }

    public C114225mh(Uri uri, C620633i r2, AnonymousClass1VX r3, AnonymousClass5O9 r4, C58392vB r5, int i, boolean z) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = uri;
        this.A00 = i;
        this.A06 = z;
    }
}
