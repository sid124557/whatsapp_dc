package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/* renamed from: X.1mP  reason: invalid class name and case insensitive filesystem */
public class C30411mP extends C624134x implements AnonymousClass4B9, AnonymousClass4BA {
    public String A00;
    public List A01;
    public List A02;

    public /* bridge */ /* synthetic */ C624134x Az2(AnonymousClass2z0 r7, long j) {
        return new C30411mP(r7, this, j, false);
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r7) {
        return new C30411mP(r7, this, this.A0K, true);
    }

    public C30411mP(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 14, j);
        this.A02 = 1;
    }

    public List A1v() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        List A012 = C624535b.A01(A1u());
        this.A01 = A012;
        return A012;
    }

    public void A1w(List list) {
        this.A01 = AnonymousClass002.A0J(list);
        this.A02 = null;
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        try {
            new ObjectOutputStream(A0e).writeObject(this.A01);
            A1j(A0e.toByteArray());
        } catch (IOException unused) {
            throw AnonymousClass0x9.A0i("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }

    public C30411mP(AnonymousClass2z0 r8, C30411mP r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A02 = 1;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
    }
}
