package X;

import com.whatsapp.util.Log;

/* renamed from: X.8V1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8V1 extends AnonymousClass8V2 implements AnonymousClass4GT {
    public static final AnonymousClass8V1 A00 = new AnonymousClass8V1();

    public AnonymousClass8V1() {
        super(4, AnonymousClass70P.class, "createOutputFile", "createOutputFile(Ljava/lang/String;JLcom/whatsapp/FMessageIO;Lcom/whatsapp/core/storage/StorageUtils;)Ljava/io/File;", 1);
    }

    public /* bridge */ /* synthetic */ Object BGk(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        long A0B = C18310x6.A0B(obj2);
        C64393Dh r12 = (C64393Dh) obj3;
        C61072zf r13 = (C61072zf) obj4;
        C162457s7.A0J(str, 0);
        C18260x0.A0S(r12, r13);
        long A03 = r13.A03();
        if (A0B >= 0 && A03 - A0B > 104857600) {
            return r12.A0S(str);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("audiodecodetask/getsharedfileforsize/returning external file; size=");
        A0o.append(A0B);
        Log.w(AnonymousClass000.A0Z("; internalAvailable=", A0o, A03));
        return r12.A0R(str);
    }
}
