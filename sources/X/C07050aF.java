package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0aF  reason: invalid class name and case insensitive filesystem */
public class C07050aF implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public void onClick(View view) {
        String A0X;
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            for (Context context = view2.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                try {
                    if (!context.isRestricted() && (method = AnonymousClass001.A0r(context.getClass(), View.class, this.A03, new Class[1], 0)) != null) {
                        this.A01 = method;
                        this.A00 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0X = "";
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(" with id '");
                A0o.append(view2.getContext().getResources().getResourceEntryName(id));
                A0X = AnonymousClass000.A0X("'", A0o);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Could not find method ");
            A0o2.append(this.A03);
            A0o2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A0o2.append(view2.getClass());
            throw AnonymousClass000.A0I(A0X, A0o2);
        }
        try {
            method.invoke(this.A00, AnonymousClass000.A1b(view));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }

    public C07050aF(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }
}
