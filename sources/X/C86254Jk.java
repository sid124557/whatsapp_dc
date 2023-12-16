package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.4Jk  reason: invalid class name and case insensitive filesystem */
public class C86254Jk implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public final void AwB(Object obj) {
        String str;
        byte[] bArr;
        byte[] bArr2;
        String str2;
        long j;
        Object obj2 = obj;
        if (this.A04 != 0) {
            C620133d r7 = (C620133d) this.A00;
            C30471mV r9 = (C30471mV) this.A01;
            C47662dc r10 = (C47662dc) this.A02;
            boolean z = this.A03;
            C56902sk r8 = (C56902sk) obj2;
            r7.A0g.A0G(r9);
            r7.A0A(r8, r10, r9, false);
            C73373fO r1 = r7.A0Q;
            synchronized (r1) {
                r1.remove(r9.A1J);
            }
            C620133d.A00(r8, r7, r9);
            r7.A0o.execute(new C70643ap(r7, r8, r9, r10, 5, z));
            return;
        }
        AnonymousClass3QO r4 = (AnonymousClass3QO) this.A00;
        C47232cv r2 = (C47232cv) this.A01;
        boolean z2 = this.A03;
        AnonymousClass3XA r72 = (AnonymousClass3XA) this.A02;
        Integer num = (Integer) obj2;
        C162457s7.A0J(num, 4);
        C149897Oi A022 = r4.A02();
        String str3 = null;
        if (A022 != null) {
            C56752sV r6 = A022.A02;
            str = r6.A07();
            synchronized (r6) {
                bArr = r6.A0L;
            }
            synchronized (r6) {
                bArr2 = r6.A0I;
            }
        } else {
            str = null;
            bArr = null;
            bArr2 = null;
        }
        if (bArr != null) {
            str2 = Base64.encodeToString(bArr, 2);
        } else {
            str2 = null;
        }
        if (bArr2 != null) {
            str3 = Base64.encodeToString(bArr2, 2);
        }
        AnonymousClass2QG r12 = (AnonymousClass2QG) r4.A09.A01();
        if (r12 != null && !r12.A02.get()) {
            File file = r12.A01;
            C18260x0.A1P(AnonymousClass001.A0o(), "inappbugreporting/deleting file ", file);
            if (file != null) {
                file.delete();
            }
        }
        r2.A01.A0S(new C70723ax(r72, num, str, str2, str3, z2 ? 1 : 0));
        AnonymousClass2WS r3 = r2.A05;
        int intValue = num.intValue();
        AnonymousClass1ZO r13 = new AnonymousClass1ZO();
        int i = 13;
        if (intValue == 0) {
            i = 14;
        }
        r13.A01 = Integer.valueOf(i);
        r3.A00.BhA(r13);
        if (A022 != null) {
            j = A022.A01.A02.A03;
        } else {
            j = 0;
        }
        AnonymousClass5N4 r22 = r2.A04;
        String valueOf = String.valueOf(((double) j) / 1024.0d);
        C186568vZ r23 = r22.A01;
        r23.markerAnnotate(476716874, "media_size", valueOf);
        short s = 2;
        if (intValue != 0) {
            s = 4;
            if (intValue != 1) {
                s = 87;
            }
        }
        r23.markerEnd(476716874, s);
        r4.A03();
    }

    public C86254Jk(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj;
    }
}
