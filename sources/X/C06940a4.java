package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.0a4  reason: invalid class name and case insensitive filesystem */
public class C06940a4 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass000.A1Z(this.A00, method, new Object[]{menuItem});
            }
            method.invoke(this.A00, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public C06940a4(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Couldn't resolve menu item onClick handler ");
            A0o.append(str);
            A0o.append(" in class ");
            InflateException inflateException = new InflateException(AnonymousClass000.A0X(cls.getName(), A0o));
            inflateException.initCause(e);
            throw inflateException;
        }
    }
}
