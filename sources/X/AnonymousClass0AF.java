package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0AF  reason: invalid class name */
public class AnonymousClass0AF extends C08750f0 {
    public View A00;
    public C16690to A01;

    public void Beg(C10560i8 r3) {
        this.A01.setVisibility(4);
    }

    public void Beh(C10560i8 r3) {
        this.A01.setVisibility(0);
    }

    public AnonymousClass0AF(View view, C16690to r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public void Bef(C10560i8 r8) {
        r8.A0C(this);
        View view = this.A00;
        if (Build.VERSION.SDK_INT == 28) {
            if (!C08720ex.A06) {
                try {
                    C08720ex.A00();
                    Method A0H = AnonymousClass002.A0H(C08720ex.A01, View.class, "removeGhost", new Class[1], 0);
                    C08720ex.A03 = A0H;
                    A0H.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                }
                C08720ex.A06 = true;
            }
            Method method = C08720ex.A03;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{view});
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        } else {
            C002302s r1 = (C002302s) view.getTag(R.id.ghost_view);
            if (r1 != null) {
                int i = r1.A00 - 1;
                r1.A00 = i;
                if (i <= 0) {
                    ((ViewGroup) r1.getParent()).removeView(r1);
                }
            }
        }
        view.setTag(R.id.transition_transform, (Object) null);
        view.setTag(R.id.parent_matrix, (Object) null);
    }
}
