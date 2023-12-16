package X;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Proxy;

/* renamed from: X.0Y1  reason: invalid class name */
public final class AnonymousClass0Y1 {
    public static final Integer A00() {
        String str;
        try {
            return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return null;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return null;
        }
    }

    public static final C59022wD A01() {
        return C59022wD.A00;
    }

    public static final C59022wD A02() {
        return C59022wD.A00;
    }

    public static final boolean A05() {
        String str;
        try {
            if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                return true;
            }
            return false;
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return false;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return false;
        }
    }

    public final ActivityEmbeddingComponent A06() {
        ClassLoader classLoader;
        Class[] clsArr;
        C18130wn r0;
        Class<C08840fC> cls = C08840fC.class;
        if (A05()) {
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            if (activityEmbeddingComponent != null) {
                return activityEmbeddingComponent;
            }
            classLoader = cls.getClassLoader();
            clsArr = new Class[]{ActivityEmbeddingComponent.class};
            r0 = new C18130wn(0);
        } else {
            classLoader = cls.getClassLoader();
            clsArr = new Class[]{ActivityEmbeddingComponent.class};
            r0 = new C18130wn(1);
        }
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, r0);
        C162457s7.A0K(newProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        return (ActivityEmbeddingComponent) newProxyInstance;
    }
}
