package androidx.drawerlayout.widget;

import X.C15040qg;
import X.C15050qh;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public abstract class DrawerLayout extends ViewGroup implements C15040qg {
    public abstract float getDrawerElevation();

    public abstract Drawable getStatusBarBackgroundDrawable();

    public abstract void setDrawerElevation(float f);

    @Deprecated
    public abstract void setDrawerListener(C15050qh r1);

    public abstract void setDrawerLockMode(int i);

    public abstract void setScrimColor(int i);

    public abstract void setStatusBarBackground(int i);

    public abstract void setStatusBarBackground(Drawable drawable);

    public abstract void setStatusBarBackgroundColor(int i);
}
