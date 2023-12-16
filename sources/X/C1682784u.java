package X;

import com.facebook.soloader.SoLoader;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.84u  reason: invalid class name and case insensitive filesystem */
public class C1682784u implements C183788qe {
    public final /* synthetic */ Runtime A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Method A03;
    public final /* synthetic */ boolean A04;

    public C1682784u(Runtime runtime, String str, String str2, Method method, boolean z) {
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = runtime;
        this.A03 = method;
    }

    public void BJm(String str, int i) {
        String str2;
        String str3;
        String str4;
        FileInputStream A0g;
        if (this.A04) {
            if ((i & 4) == 4) {
                str2 = this.A01;
            } else {
                str2 = this.A02;
            }
            try {
                Runtime runtime = this.A00;
                synchronized (runtime) {
                    try {
                        Method method = this.A03;
                        Object[] A1X = AnonymousClass0x9.A1X();
                        A1X[0] = str;
                        C18300x5.A1K(SoLoader.class.getClassLoader(), str2, A1X);
                        str3 = (String) method.invoke(runtime, A1X);
                        if (str3 == null) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                                    e = e;
                                }
                            }
                        } else {
                            throw new UnsatisfiedLinkError(str3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = null;
                        throw th;
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                e = e2;
                str3 = null;
                try {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Error: Cannot load ");
                    A0o.append(str);
                    throw AnonymousClass6CA.A0Q(A0o.toString(), e);
                } catch (Throwable th3) {
                    A0g.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } else {
            System.load(str);
        }
    }

    public void BJo(C188158yR r2, String str, int i) {
        throw C18320x8.A0m();
    }
}
