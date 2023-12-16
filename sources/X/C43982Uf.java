package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Uf  reason: invalid class name and case insensitive filesystem */
public abstract class C43982Uf {
    public String A00() {
        Object obj;
        if (this instanceof C34281up) {
            C34281up r0 = (C34281up) this;
            C59252wc r2 = r0.A00;
            String str = r0.A02;
            String str2 = r0.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(r2.A00, A0o);
            A0o.append(":");
            A0o.append(":");
            A0o.append(str);
            A0o.append(":");
            A0o.append("6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9");
            A0o.append(":");
            AnonymousClass000.A1B(C620733j.A02(r2.A01), A0o);
            boolean z = false;
            if (str2 != null && AnonymousClass001.A1W(str2.length())) {
                z = true;
            }
            if (z || str2 != null) {
                try {
                    String A05 = C627236i.A05(str2);
                    A0o.append(":");
                    A0o.append(A05);
                    obj = A0o;
                } catch (Throwable th) {
                    obj = AnonymousClass3Z0.A01(th);
                }
                Throwable A00 = AnonymousClass3Z9.A00(obj);
                if (A00 != null) {
                    Log.e("Unable to calculate parameter hash.", A00);
                }
            }
            return C18290x4.A0o(A0o);
        } else if (this instanceof C34261un) {
            return ((C34261un) this).A00;
        } else {
            return ((C34271uo) this).A00.A02;
        }
    }
}
