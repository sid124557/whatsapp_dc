package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;

/* renamed from: X.00R  reason: invalid class name */
public class AnonymousClass00R extends Dialog implements C15910sA, C17300vI {
    public AnonymousClass08A A00;
    public final AnonymousClass0Ts A01 = new AnonymousClass0Ts(new C10650iI(this));

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C162457s7.A0J(view, 0);
        A01();
        super.addContentView(view, layoutParams);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C162457s7.A0J(view, 0);
        A01();
        super.setContentView(view, layoutParams);
    }

    public final AnonymousClass0Ts BA8() {
        return this.A01;
    }

    public final AnonymousClass0O9 getLifecycle() {
        AnonymousClass08A r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass08A r02 = new AnonymousClass08A(this);
        this.A00 = r02;
        return r02;
    }

    public void onBackPressed() {
        this.A01.A00();
    }

    public void onStop() {
        AnonymousClass08A r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass08A(this);
            this.A00 = r1;
        }
        r1.A04(AnonymousClass0GH.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    public AnonymousClass00R(Context context, int i) {
        super(context, i);
    }

    public final void A01() {
        Window window = getWindow();
        C162457s7.A0H(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        C162457s7.A0H(window2);
        View decorView = window2.getDecorView();
        C162457s7.A0D(decorView);
        C02490Gl.A00(decorView, this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass08A r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass08A(this);
            this.A00 = r1;
        }
        r1.A04(AnonymousClass0GH.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        AnonymousClass08A r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass08A(this);
            this.A00 = r1;
        }
        r1.A04(AnonymousClass0GH.ON_RESUME);
    }

    public static final void A00(AnonymousClass00R r0) {
        super.onBackPressed();
    }

    public void setContentView(View view) {
        C162457s7.A0J(view, 0);
        A01();
        super.setContentView(view);
    }

    public void setContentView(int i) {
        A01();
        super.setContentView(i);
    }
}
