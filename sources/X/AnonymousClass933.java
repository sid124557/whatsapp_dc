package X;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;

/* renamed from: X.933  reason: invalid class name */
public class AnonymousClass933 implements C181338mb {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass933(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Object get() {
        if (this.A02 != 0) {
            C157587iY r2 = (C157587iY) this.A01;
            return r2.A02.B08(new C130086bM((C152817aA) this.A00, r2));
        }
        C161757qO r4 = (C161757qO) this.A00;
        Context context = (Context) this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        r4.A02();
        byte[] bytes = r4.A04.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes != null) {
            str = Base64.encodeToString(bytes, 11);
        }
        A0o.append(str);
        A0o.append("+");
        r4.A02();
        byte[] bytes2 = r4.A01.A01.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        return new AnonymousClass7MM(context, (C178968iO) r4.A02.A02(C178968iO.class), AnonymousClass000.A0X(str2, A0o));
    }
}
